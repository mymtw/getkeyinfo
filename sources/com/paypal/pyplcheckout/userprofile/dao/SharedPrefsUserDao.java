package com.paypal.pyplcheckout.userprofile.dao;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.utils.LogsUtilsKt;
import kotlin.jvm.internal.C19383o;

public final class SharedPrefsUserDao implements UserDao {
    private final String TAG = "SharedPrefsUserDao";
    private final C16708i gson;
    private final SharedPreferences sharedPreferences;

    public SharedPrefsUserDao(Context context, C16708i iVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(iVar, "gson");
        this.gson = iVar;
        this.sharedPreferences = context.getSharedPreferences("SharedPrefsUserDao", 0);
    }

    public void cacheLoggedUser(User user) {
        if (user == null) {
            clearUser();
            return;
        }
        try {
            this.sharedPreferences.edit().putString(SharedPrefsUserDaoKt.USER, this.gson.mo59463j(user)).apply();
        } catch (Exception e) {
            String str = this.TAG;
            C19383o.m32796f(str, "TAG");
            LogsUtilsKt.logCacheError(str, SharedPrefsUserDaoKt.USER, e);
        }
    }

    public void clearUser() {
        this.sharedPreferences.edit().remove(SharedPrefsUserDaoKt.USER).apply();
    }

    public User getLoggedUser() {
        try {
            String string = this.sharedPreferences.getString(SharedPrefsUserDaoKt.USER, (String) null);
            if (string == null) {
                return null;
            }
            return (User) this.gson.mo59458e(User.class, string);
        } catch (Exception e) {
            String str = this.TAG;
            C19383o.m32796f(str, "TAG");
            LogsUtilsKt.logCacheError(str, SharedPrefsUserDaoKt.USER, e);
            return null;
        }
    }
}
