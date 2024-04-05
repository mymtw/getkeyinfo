package com.etsy.android.p327ui.cardview.clickhandlers;

import p145io.reactivex.functions.Consumer;
import p367ib.C12924b;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.u */
public final /* synthetic */ class C9140u implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ SavedCartClickHandler f20078b;

    /* renamed from: c */
    public final /* synthetic */ C12924b f20079c;

    /* renamed from: d */
    public final /* synthetic */ int f20080d;

    public /* synthetic */ C9140u(SavedCartClickHandler savedCartClickHandler, C12924b bVar, int i) {
        this.f20078b = savedCartClickHandler;
        this.f20079c = bVar;
        this.f20080d = i;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.f20078b.mo31334f(this.f20079c, this.f20080d);
    }
}
