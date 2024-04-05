package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.api.Api;
import p568fn.C17781a;

/* renamed from: com.google.firebase.perf.util.e */
public final class C16630e {

    /* renamed from: a */
    public static Boolean f36862a;

    /* renamed from: a */
    public static boolean m27495a(Context context) {
        Boolean bool = f36862a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f36862a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C17781a d = C17781a.m29823d();
            StringBuilder h = C0072d.m201h("No perf logcat meta data found ");
            h.append(e.getMessage());
            d.mo69014a(h.toString());
            return false;
        }
    }

    /* renamed from: b */
    public static int m27496b(long j) {
        if (j > ParserMinimalBase.MAX_INT_L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < ParserMinimalBase.MIN_INT_L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
