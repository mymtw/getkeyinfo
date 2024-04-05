package com.bugsnag.android;

import com.bugsnag.android.C5738e2;

/* renamed from: com.bugsnag.android.f2 */
public final class C5745f2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5728c2 f12248b;

    /* renamed from: c */
    public final /* synthetic */ C5738e2 f12249c;

    public C5745f2(C5738e2 e2Var, C5728c2 c2Var) {
        this.f12249c = e2Var;
        this.f12248b = c2Var;
    }

    public final void run() {
        C5738e2 e2Var = this.f12249c;
        C5728c2 c2Var = this.f12248b;
        e2Var.getClass();
        try {
            e2Var.f12229m.mo16604d("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i = C5738e2.C5740b.f12231a[e2Var.mo16503a(c2Var).ordinal()];
            if (i == 1) {
                e2Var.f12229m.mo16604d("Sent 1 new session to Bugsnag");
            } else if (i == 2) {
                e2Var.f12229m.mo16608h("Storing session payload for future delivery");
                e2Var.f12223g.mo16495g(c2Var);
            } else if (i == 3) {
                e2Var.f12229m.mo16608h("Dropping invalid session tracking payload");
            }
        } catch (Exception e) {
            e2Var.f12229m.mo16602b("Session tracking payload failed", e);
        }
    }
}
