package com.paypal.pyplcheckout.extensions;

import android.content.Context;
import kotlin.jvm.internal.C19383o;

public final class ContextExtensionsKt {
    public static final int getDisplayDensityInDP(Context context) {
        C19383o.m32797g(context, "<this>");
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final String getDisplayDensityName(Context context) {
        C19383o.m32797g(context, "<this>");
        switch (getDisplayDensityInDP(context)) {
            case 120:
            case 140:
                return "LDPI";
            case 160:
            case 180:
            case 200:
                return "MDPI";
            case 213:
            case 220:
            case 240:
            case 260:
                return "HDPI";
            case 280:
            case NOTICE_VALUE:
            case 320:
            case 340:
                return "XHDPI";
            case 360:
            case WARNING_VALUE:
            case 420:
            case 480:
                return "XXHDPI";
            case 560:
            case CRITICAL_VALUE:
            case 640:
                return "XXXHDPI";
            default:
                return "N/A";
        }
    }
}
