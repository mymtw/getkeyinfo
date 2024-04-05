package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.internal.C12348b;
import p401mg.C13080a;

/* renamed from: com.facebook.share.internal.f */
public final class C12369f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C12348b.C12354e f27567b;

    /* renamed from: c */
    public final /* synthetic */ C12348b f27568c;

    /* renamed from: d */
    public final /* synthetic */ FacebookException f27569d;

    public C12369f(C12348b.C12354e eVar, C12348b bVar, FacebookException facebookException) {
        this.f27567b = eVar;
        this.f27568c = bVar;
        this.f27569d = facebookException;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                this.f27567b.mo39764a(this.f27568c, this.f27569d);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
