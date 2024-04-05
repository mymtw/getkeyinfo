package com.paypal.pyplcheckout.utils;

import kotlin.jvm.internal.C19383o;

public final class CrashLogger {
    public static final CrashLogger INSTANCE = new CrashLogger();
    private static CheckoutCrashLogger instance;

    private CrashLogger() {
    }

    public static final void create(CheckoutCrashLogger checkoutCrashLogger) {
        C19383o.m32797g(checkoutCrashLogger, "crashLogger");
        instance = checkoutCrashLogger;
    }

    public static final CheckoutCrashLogger getInstance() {
        return instance;
    }

    public static /* synthetic */ void getInstance$annotations() {
    }

    public final void clear() {
        instance = null;
    }
}
