package com.paypal.pyplcheckout.userprofile.dao;

import com.paypal.pyplcheckout.pojo.User;

public interface UserDao {
    void cacheLoggedUser(User user);

    void clearUser();

    User getLoggedUser();
}
