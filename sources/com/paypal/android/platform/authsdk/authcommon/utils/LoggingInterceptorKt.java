package com.paypal.android.platform.authsdk.authcommon.utils;

import kotlin.jvm.internal.C19383o;
import okhttp3.logging.HttpLoggingInterceptor;

public final class LoggingInterceptorKt {
    private static final HttpLoggingInterceptor loggingInterceptor;

    static {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.C19987a) new LoggingInterceptorKt$loggingInterceptor$1());
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        C19383o.m32797g(level, "<set-?>");
        httpLoggingInterceptor.f44224c = level;
        loggingInterceptor = httpLoggingInterceptor;
    }

    public static final HttpLoggingInterceptor getLoggingInterceptor() {
        return loggingInterceptor;
    }
}
