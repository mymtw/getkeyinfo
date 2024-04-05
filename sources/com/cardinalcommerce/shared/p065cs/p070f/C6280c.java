package com.cardinalcommerce.shared.p065cs.p070f;

/* renamed from: com.cardinalcommerce.shared.cs.f.c */
public final class C6280c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6283e f13810b;

    public C6280c(C6283e eVar) {
        this.f13810b = eVar;
    }

    public final void run() {
        C6278b bVar = this.f13810b.f13846b;
        if (bVar != null) {
            bVar.mo17814b();
            this.f13810b.f13846b = null;
        }
        C6286h hVar = this.f13810b.f13845a;
        if (hVar != null) {
            hVar.mo17835b();
            this.f13810b.f13845a = null;
        }
    }
}
