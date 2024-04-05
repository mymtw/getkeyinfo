package com.google.android.play.core.internal;

import p689ul.C18614l;

/* renamed from: com.google.android.play.core.internal.a */
public abstract class C15681a implements Runnable {

    /* renamed from: b */
    public final C18614l f35439b;

    public C15681a() {
        this.f35439b = null;
    }

    public C15681a(C18614l lVar) {
        this.f35439b = lVar;
    }

    /* renamed from: a */
    public abstract void mo55347a();

    public final void run() {
        try {
            mo55347a();
        } catch (Exception e) {
            C18614l lVar = this.f35439b;
            if (lVar != null) {
                lVar.mo70125a(e);
            }
        }
    }
}
