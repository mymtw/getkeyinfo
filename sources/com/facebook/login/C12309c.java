package com.facebook.login;

import android.os.Bundle;
import p401mg.C13080a;
import p461uf.C13519m;

/* renamed from: com.facebook.login.c */
public final class C12309c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Bundle f27430b;

    /* renamed from: c */
    public final /* synthetic */ C12310d f27431c;

    public C12309c(C12310d dVar, Bundle bundle) {
        this.f27431c = dVar;
        this.f27430b = bundle;
    }

    public final void run() {
        Class<C12310d> cls;
        C13519m mVar;
        if (!C13080a.m20762b(this)) {
            try {
                C12310d dVar = this.f27431c;
                cls = C12310d.class;
                mVar = null;
                if (!C13080a.m20762b(cls)) {
                    mVar = dVar.f27433a;
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return;
            }
            mVar.mo46174a(this.f27430b, "fb_mobile_login_heartbeat");
        }
    }
}
