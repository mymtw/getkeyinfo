package com.paypal.android.platform.authsdk.authcommon.partnerauth.security.util.cryptohelper;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C19383o;

public final class CryptoHelper {
    public static final CryptoHelper INSTANCE = new CryptoHelper();
    private static ICryptoHelper sInstanceGCM;
    private static ICryptoHelper sInstancePKCS5;

    private CryptoHelper() {
    }

    private final ICryptoHelper getInstanceGCM(SharedPreferences sharedPreferences, Context context) {
        if (sInstanceGCM == null) {
            sInstanceGCM = new CryptoHelperGCM(sharedPreferences, context);
        }
        return sInstanceGCM;
    }

    private final ICryptoHelper getsInstancePKCS5(SharedPreferences sharedPreferences, Context context) {
        if (sInstancePKCS5 == null) {
            sInstancePKCS5 = new CryptoHelperPKCS5(sharedPreferences, context);
        }
        return sInstancePKCS5;
    }

    public final ICryptoHelper getInstance(SharedPreferences sharedPreferences, Context context) {
        C19383o.m32797g(sharedPreferences, "cryptoPreferences");
        C19383o.m32797g(context, "appContext");
        return getsInstancePKCS5(sharedPreferences, context);
    }
}
