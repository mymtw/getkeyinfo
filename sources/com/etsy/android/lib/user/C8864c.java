package com.etsy.android.lib.user;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.user.c */
public final class C8864c {

    /* renamed from: a */
    public final SharedPreferences f19584a;

    public C8864c(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f19584a = context.getSharedPreferences("account-info-general-prefs-account", 0);
    }
}
