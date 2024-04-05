package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
public final class C15079r5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15061p5 f33808b;

    /* renamed from: c */
    public final /* synthetic */ C15061p5 f33809c;

    /* renamed from: d */
    public final /* synthetic */ long f33810d;

    /* renamed from: e */
    public final /* synthetic */ boolean f33811e;

    /* renamed from: f */
    public final /* synthetic */ C15113v5 f33812f;

    public C15079r5(C15113v5 v5Var, C15061p5 p5Var, C15061p5 p5Var2, long j, boolean z) {
        this.f33812f = v5Var;
        this.f33808b = p5Var;
        this.f33809c = p5Var2;
        this.f33810d = j;
        this.f33811e = z;
    }

    public final void run() {
        this.f33812f.mo52346l(this.f33808b, this.f33809c, this.f33810d, this.f33811e, (Bundle) null);
    }
}
