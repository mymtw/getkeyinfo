package com.paypal.android.platform.authsdk.authcommon.utils;

import android.util.Log;
import kotlin.jvm.internal.C19383o;
import okhttp3.logging.HttpLoggingInterceptor;

public final class LoggingInterceptorKt$loggingInterceptor$1 implements HttpLoggingInterceptor.C19987a {
    public void log(String str) {
        C19383o.m32797g(str, "message");
        Log.d("OkHttp", str);
    }
}
