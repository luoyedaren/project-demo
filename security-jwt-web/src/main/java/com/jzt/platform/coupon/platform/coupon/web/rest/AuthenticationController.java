package com.jzt.platform.coupon.platform.coupon.web.rest;

import com.jzt.platform.coupon.platform.coupon.web.model.User;
import com.jzt.platform.coupon.platform.coupon.web.model.UserTokenState;
import com.jzt.platform.coupon.platform.coupon.web.security.TokenHelper;
import com.jzt.platform.coupon.platform.coupon.web.security.auth.JwtAuthenticationRequest;
import com.jzt.platform.coupon.platform.coupon.web.service.impl.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fan.jin on 2017-05-10.
 */

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

	@Autowired
	TokenHelper tokenHelper;

	@Lazy
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@RequestMapping(value = "/login")
	public ResponseEntity<?> createAuthenticationToken(
			JwtAuthenticationRequest authenticationRequest,
			HttpServletResponse response
	) throws AuthenticationException, IOException {

		// Perform the security
		final Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						authenticationRequest.getUsername(),
						authenticationRequest.getPassword()
				)
		);

		// Inject into security context
		SecurityContextHolder.getContext().setAuthentication(authentication);

		// token creation
		User user = (User) authentication.getPrincipal();
		String jws = tokenHelper.generateToken(user.getUsername());
		int expiresIn = tokenHelper.getExpiredIn();
		// Return the token
		return ResponseEntity.ok(new UserTokenState(jws, expiresIn));
	}

	@RequestMapping(value = "/refresh", method = RequestMethod.POST)
	public ResponseEntity<?> refreshAuthenticationToken(
			HttpServletRequest request,
			HttpServletResponse response,
			Principal principal
	) {

		String authToken = tokenHelper.getToken(request);

		if (authToken != null && principal != null) {

			// TODO check user password last update
			String refreshedToken = tokenHelper.refreshToken(authToken);
			int expiresIn = tokenHelper.getExpiredIn();

			return ResponseEntity.ok(new UserTokenState(refreshedToken, expiresIn));
		} else {
			UserTokenState userTokenState = new UserTokenState();
			return ResponseEntity.accepted().body(userTokenState);
		}
	}

	@RequestMapping(value = "/change-password", method = RequestMethod.POST)
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> changePassword(@RequestBody PasswordChanger passwordChanger) {
		userDetailsService.changePassword(passwordChanger.oldPassword, passwordChanger.newPassword);
		Map<String, String> result = new HashMap<>();
		result.put("result", "success");
		return ResponseEntity.accepted().body(result);
	}

	static class PasswordChanger {
		public String oldPassword;
		public String newPassword;
	}
}