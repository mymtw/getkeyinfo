package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.d */
public final class C15286d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f34269b;

    /* renamed from: c */
    public final /* synthetic */ C15287e f34270c;

    public C15286d(C15287e eVar, long j) {
        this.f34270c = eVar;
        this.f34269b = j;
    }

    public final void run() {
        C15287e eVar = this.f34270c;
        eVar.f34271b.setError(String.format(eVar.f34274e, new Object[]{C15288f.m24838a(this.f34269b)}));
        this.f34270c.mo53845a();
    }
}
