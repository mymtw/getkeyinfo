package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
public abstract class C14635f1 implements Runnable {

    /* renamed from: b */
    public final long f32832b;

    /* renamed from: c */
    public final long f32833c;

    /* renamed from: d */
    public final boolean f32834d;

    /* renamed from: e */
    public final /* synthetic */ C14726m1 f32835e;

    public C14635f1(C14726m1 m1Var, boolean z) {
        this.f32835e = m1Var;
        this.f32832b = m1Var.f32945a.currentTimeMillis();
        this.f32833c = m1Var.f32945a.elapsedRealtime();
        this.f32834d = z;
    }

    /* renamed from: a */
    public abstract void mo50280a() throws RemoteException;

    /* renamed from: b */
    public void mo50397b() {
    }

    public final void run() {
        if (this.f32835e.f32949e) {
            mo50397b();
            return;
        }
        try {
            mo50280a();
        } catch (Exception e) {
            this.f32835e.mo50665a(e, false, this.f32834d);
            mo50397b();
        }
    }
}
