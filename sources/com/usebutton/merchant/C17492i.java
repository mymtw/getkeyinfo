package com.usebutton.merchant;

import android.content.Intent;

/* renamed from: com.usebutton.merchant.i */
public final class C17492i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Throwable f38252b;

    /* renamed from: c */
    public final /* synthetic */ C17493j f38253c;

    public C17492i(C17493j jVar, Exception exc) {
        this.f38253c = jVar;
        this.f38252b = exc;
    }

    public final void run() {
        this.f38253c.f38254a.mo15806b((Intent) null, this.f38252b);
    }
}
