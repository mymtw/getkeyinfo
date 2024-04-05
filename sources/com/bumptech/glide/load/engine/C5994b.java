package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.C6015c;

/* renamed from: com.bumptech.glide.load.engine.b */
public final class C5994b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6015c f12846b;

    public C5994b(C6015c cVar) {
        this.f12846b = cVar;
    }

    public final void run() {
        C6015c cVar = this.f12846b;
        while (!cVar.f12887f) {
            try {
                cVar.mo16952b((C6015c.C6016a) cVar.f12885d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
