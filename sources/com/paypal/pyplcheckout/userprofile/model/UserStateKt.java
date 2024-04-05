package com.paypal.pyplcheckout.userprofile.model;

import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import kotlin.text.C19457k;

public final class UserStateKt {
    public static final String US_COUNTRY = "US";

    public static final boolean isUSBuyer(User user) {
        return C19457k.m33019W0(US_COUNTRY, user == null ? null : user.getCountry(), true);
    }

    public static final UserState toState(User user) {
        UserState.Success success = user == null ? null : new UserState.Success(user);
        return success == null ? UserState.Empty.INSTANCE : success;
    }
}
