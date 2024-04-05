package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
public final class C15112v4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33913b;

    /* renamed from: c */
    public final /* synthetic */ String f33914c;

    /* renamed from: d */
    public final /* synthetic */ long f33915d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f33916e;

    /* renamed from: f */
    public final /* synthetic */ boolean f33917f;

    /* renamed from: g */
    public final /* synthetic */ boolean f33918g;

    /* renamed from: h */
    public final /* synthetic */ boolean f33919h;

    /* renamed from: i */
    public final /* synthetic */ String f33920i = null;

    /* renamed from: j */
    public final /* synthetic */ C15007j5 f33921j;

    public C15112v4(C15007j5 j5Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f33921j = j5Var;
        this.f33913b = str;
        this.f33914c = str2;
        this.f33915d = j;
        this.f33916e = bundle;
        this.f33917f = z;
        this.f33918g = z2;
        this.f33919h = z3;
    }

    public final void run() {
        this.f33921j.mo52153o(this.f33913b, this.f33914c, this.f33915d, this.f33916e, this.f33917f, this.f33918g, this.f33919h, this.f33920i);
    }
}
