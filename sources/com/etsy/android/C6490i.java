package com.etsy.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.etsy.android.lib.util.CrashUtil;
import p145io.reactivex.internal.operators.completable.C19088b;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: com.etsy.android.i */
public final class C6490i implements C13265p.C13266a {

    /* renamed from: a */
    public final CrashUtil f14394a;

    /* renamed from: b */
    public final C13461f f14395b;

    public C6490i(Context context, C13265p pVar, CrashUtil crashUtil, C13461f fVar) {
        this.f14394a = crashUtil;
        this.f14395b = fVar;
        mo18531b(context, pVar.mo45960e());
    }

    /* renamed from: a */
    public final void mo18530a(Context context, boolean z) {
        mo18531b(context, z);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: b */
    public final void mo18531b(Context context, boolean z) {
        C19088b bVar = new C19088b(new C6488h((Application) context.getApplicationContext(), z));
        this.f14395b.getClass();
        new CompletableSubscribeOn(bVar, C13461f.m21235b()).mo20608c(new C6487g(this, 0), new C6435f());
    }
}
