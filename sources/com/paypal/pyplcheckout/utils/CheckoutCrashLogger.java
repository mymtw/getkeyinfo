package com.paypal.pyplcheckout.utils;

public interface CheckoutCrashLogger {
    void addBreadcrumb(String str);

    void logException(Throwable th);

    void setKey(String str, String str2);
}
