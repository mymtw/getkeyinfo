package com.paypal.pyplcheckout.userprofile.dao;

import android.content.Context;
import com.google.gson.C16708i;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class SharedPrefsUserDao_Factory implements C17555d<SharedPrefsUserDao> {
    private final C19011a<Context> contextProvider;
    private final C19011a<C16708i> gsonProvider;

    public SharedPrefsUserDao_Factory(C19011a<Context> aVar, C19011a<C16708i> aVar2) {
        this.contextProvider = aVar;
        this.gsonProvider = aVar2;
    }

    public static SharedPrefsUserDao_Factory create(C19011a<Context> aVar, C19011a<C16708i> aVar2) {
        return new SharedPrefsUserDao_Factory(aVar, aVar2);
    }

    public static SharedPrefsUserDao newInstance(Context context, C16708i iVar) {
        return new SharedPrefsUserDao(context, iVar);
    }

    public SharedPrefsUserDao get() {
        return newInstance(this.contextProvider.get(), this.gsonProvider.get());
    }
}
