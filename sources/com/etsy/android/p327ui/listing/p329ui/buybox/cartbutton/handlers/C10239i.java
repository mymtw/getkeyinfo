package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.lib.util.C8916o;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p444se.C13375a;
import p444se.C13377c;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.i */
public final class C10239i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f22526a;

    /* renamed from: b */
    public final C19011a f22527b;

    /* renamed from: c */
    public final C19011a f22528c;

    public /* synthetic */ C10239i(C19011a aVar, C19011a aVar2, int i) {
        this.f22526a = i;
        this.f22527b = aVar;
        this.f22528c = aVar2;
    }

    public final Object get() {
        switch (this.f22526a) {
            case 0:
                return new C10238h((C13573c) this.f22527b.get(), (C8916o) this.f22528c.get());
            default:
                return new C13377c((C12741o) this.f22527b.get(), (C13375a) this.f22528c.get());
        }
    }
}
