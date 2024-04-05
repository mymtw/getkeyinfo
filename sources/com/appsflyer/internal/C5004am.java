package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* renamed from: com.appsflyer.internal.am */
public final class C5004am {
    private static String AFInAppEventType;
    private static String AFKeystoreWrapper;

    public static void AFInAppEventType(String str) {
        if (AFKeystoreWrapper == null) {
            values(AppsFlyerProperties.getInstance().getDevKey());
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.AFInAppEventType(str.replace(str2, AFInAppEventType));
        }
    }

    public static void values(String str) {
        AFKeystoreWrapper = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        AFInAppEventType = sb.toString();
    }
}
