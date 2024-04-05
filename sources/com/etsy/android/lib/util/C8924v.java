package com.etsy.android.lib.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p250u0.C8077a;
import p260v0.C8184a;

/* renamed from: com.etsy.android.lib.util.v */
public final class C8924v {

    /* renamed from: a */
    public static HashMap<Integer, WeakReference<C8077a.C8078a>> f19686a = new HashMap<>();

    /* renamed from: a */
    public static int m17365a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("permissions_state", 0);
        boolean z = sharedPreferences.getBoolean(str, false);
        int a = C8184a.m16458a(context, str);
        if (z && a == 0) {
            sharedPreferences.edit().putBoolean(str, false).apply();
        }
        return a;
    }
}
