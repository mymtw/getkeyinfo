package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.h2 */
public final class C5755h2 {

    /* renamed from: a */
    public final SharedPreferences f12284a;

    public C5755h2(Context context) {
        C19383o.m32798h(context, ResponseConstants.CONTEXT);
        this.f12284a = context.getSharedPreferences("com.bugsnag.android", 0);
    }
}
