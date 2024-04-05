package com.facebook.stetho.common;

import android.support.p013v4.media.C0073e;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LogRedirector {
    private static volatile Logger sLogger;

    public interface Logger {
        boolean isLoggable(String str, int i);

        void log(int i, String str, String str2);
    }

    /* renamed from: d */
    public static void m20224d(String str, String str2, Throwable th) {
        StringBuilder k = C0073e.m211k(str2, "\n");
        k.append(formatThrowable(th));
        m20223d(str, k.toString());
    }

    /* renamed from: e */
    public static void m20226e(String str, String str2, Throwable th) {
        StringBuilder k = C0073e.m211k(str2, "\n");
        k.append(formatThrowable(th));
        m20225e(str, k.toString());
    }

    private static String formatThrowable(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m20228i(String str, String str2, Throwable th) {
        StringBuilder k = C0073e.m211k(str2, "\n");
        k.append(formatThrowable(th));
        m20227i(str, k.toString());
    }

    public static boolean isLoggable(String str, int i) {
        Logger logger = sLogger;
        return logger != null ? logger.isLoggable(str, i) : Log.isLoggable(str, i);
    }

    private static void log(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.log(i, str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        Util.throwIfNull(logger);
        Util.throwIfNotNull(sLogger);
        sLogger = logger;
    }

    /* renamed from: v */
    public static void m20230v(String str, String str2, Throwable th) {
        StringBuilder k = C0073e.m211k(str2, "\n");
        k.append(formatThrowable(th));
        m20229v(str, k.toString());
    }

    /* renamed from: w */
    public static void m20232w(String str, String str2, Throwable th) {
        StringBuilder k = C0073e.m211k(str2, "\n");
        k.append(formatThrowable(th));
        m20231w(str, k.toString());
    }

    /* renamed from: d */
    public static void m20223d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m20225e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m20227i(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: v */
    public static void m20229v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m20231w(String str, String str2) {
        log(5, str, str2);
    }
}
