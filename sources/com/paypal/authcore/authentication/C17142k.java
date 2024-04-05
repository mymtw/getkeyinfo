package com.paypal.authcore.authentication;

import android.content.Context;
import android.content.Intent;
import p251u1.C8115a;

/* renamed from: com.paypal.authcore.authentication.k */
public final class C17142k {

    /* renamed from: a */
    public C17131a f37513a;

    /* renamed from: a */
    public static void m28584a(Context context, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("TokenRequestSuccess", z);
        intent.setAction("com.paypal.authcore.authentication");
        C8115a.m16322a(context).mo20709c(intent);
    }
}
