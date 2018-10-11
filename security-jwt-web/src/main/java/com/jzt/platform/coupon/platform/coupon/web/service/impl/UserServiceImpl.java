package com.jzt.platform.coupon.platform.coupon.web.service.impl;

import com.jzt.platform.coupon.platform.coupon.web.model.User;
import com.jzt.platform.coupon.platform.coupon.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findByUsername( String username ) throws UsernameNotFoundException {
        User u = new User();
        return u;
    }

    public User findById( Long id ) throws AccessDeniedException {
        User u = new User();
        return u;
    }

    public List<User> findAll() throws AccessDeniedException {
        List<User> result = new ArrayList<>();
        return result;
    }
}
