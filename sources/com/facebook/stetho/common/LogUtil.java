package com.facebook.stetho.common;

import java.util.Locale;

public class LogUtil {
    private static final String TAG = "stetho";

    /* renamed from: d */
    public static void m20234d(String str, Object... objArr) {
        m20233d(format(str, objArr));
    }

    /* renamed from: e */
    public static void m20238e(String str, Object... objArr) {
        m20237e(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i */
    public static void m20242i(String str, Object... objArr) {
        m20241i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i == 5 || i == 6) {
            return true;
        }
        return LogRedirector.isLoggable(TAG, i);
    }

    /* renamed from: v */
    public static void m20246v(String str, Object... objArr) {
        m20245v(format(str, objArr));
    }

    /* renamed from: w */
    public static void m20250w(String str, Object... objArr) {
        m20249w(format(str, objArr));
    }

    /* renamed from: d */
    public static void m20236d(Throwable th, String str, Object... objArr) {
        m20235d(th, format(str, objArr));
    }

    /* renamed from: e */
    public static void m20240e(Throwable th, String str, Object... objArr) {
        m20239e(th, format(str, objArr));
    }

    /* renamed from: i */
    public static void m20244i(Throwable th, String str, Object... objArr) {
        m20243i(th, format(str, objArr));
    }

    /* renamed from: v */
    public static void m20248v(Throwable th, String str, Object... objArr) {
        m20247v(th, format(str, objArr));
    }

    /* renamed from: w */
    public static void m20252w(Throwable th, String str, Object... objArr) {
        m20251w(th, format(str, objArr));
    }

    /* renamed from: d */
    public static void m20233d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m20223d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m20237e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m20225e(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m20241i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m20227i(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m20245v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m20229v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m20249w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m20231w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m20235d(Throwable th, String str) {
        if (isLoggable(3)) {
            LogRedirector.m20224d(TAG, str, th);
        }
    }

    /* renamed from: e */
    public static void m20239e(Throwable th, String str) {
        if (isLoggable(6)) {
            LogRedirector.m20226e(TAG, str, th);
        }
    }

    /* renamed from: i */
    public static void m20243i(Throwable th, String str) {
        if (isLoggable(4)) {
            LogRedirector.m20228i(TAG, str, th);
        }
    }

    /* renamed from: v */
    public static void m20247v(Throwable th, String str) {
        if (isLoggable(2)) {
            LogRedirector.m20230v(TAG, str, th);
        }
    }

    /* renamed from: w */
    public static void m20251w(Throwable th, String str) {
        if (isLoggable(5)) {
            LogRedirector.m20232w(TAG, str, th);
        }
    }
}
