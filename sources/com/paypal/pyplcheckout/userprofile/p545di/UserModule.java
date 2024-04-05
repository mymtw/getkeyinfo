package com.paypal.pyplcheckout.userprofile.p545di;

import com.paypal.pyplcheckout.userprofile.dao.SharedPrefsUserDao;
import com.paypal.pyplcheckout.userprofile.dao.UserDao;

/* renamed from: com.paypal.pyplcheckout.userprofile.di.UserModule */
public interface UserModule {
    UserDao provideUserDao(SharedPrefsUserDao sharedPrefsUserDao);
}
