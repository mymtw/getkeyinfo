package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
public final class C14926a5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f33270b;

    /* renamed from: c */
    public final /* synthetic */ String f33271c;

    /* renamed from: d */
    public final /* synthetic */ String f33272d;

    /* renamed from: e */
    public final /* synthetic */ C15007j5 f33273e;

    public C14926a5(C15007j5 j5Var, AtomicReference atomicReference, String str, String str2) {
        this.f33273e = j5Var;
        this.f33270b = atomicReference;
        this.f33271c = str;
        this.f33272d = str2;
    }

    public final void run() {
        C14999i6 u = ((C15103u3) this.f33273e.f33681b).mo52333u();
        AtomicReference atomicReference = this.f33270b;
        String str = this.f33271c;
        String str2 = this.f33272d;
        u.mo51995g();
        u.mo51946h();
        u.mo52133s(new C14963e6(u, atomicReference, str, str2, u.mo52130p(false)));
    }
}
