package com.jzt.platform.coupon.platform.coupon.web.service;


import com.jzt.platform.coupon.platform.coupon.web.model.User;

import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll();
}
