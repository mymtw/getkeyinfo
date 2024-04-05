package com.bugsnag.android;

/* renamed from: com.bugsnag.android.p */
public final class C5818p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5917u f12444b;

    public C5818p(C5917u uVar) {
        this.f12444b = uVar;
    }

    public final void run() {
        this.f12444b.f12637p.mo1127b();
        C5917u uVar = this.f12444b;
        SystemBroadcastReceiver.register(uVar.f12628g, uVar.f12635n, uVar.f12636o);
    }
}
