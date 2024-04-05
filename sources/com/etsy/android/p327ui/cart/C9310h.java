package com.etsy.android.p327ui.cart;

import com.etsy.android.p327ui.home.landingpage.C10021c;
import com.etsy.android.p327ui.home.landingpage.C10022d;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10534f;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.cart.h */
public final class C9310h implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f20576a;

    /* renamed from: b */
    public final C19011a f20577b;

    /* renamed from: c */
    public final C19011a f20578c;

    public /* synthetic */ C9310h(C19011a aVar, C19011a aVar2, int i) {
        this.f20576a = i;
        this.f20577b = aVar;
        this.f20578c = aVar2;
    }

    public final Object get() {
        switch (this.f20576a) {
            case 0:
                return new C9302g((C9323l) this.f20577b.get(), (C9330p) this.f20578c.get());
            case 1:
                return new C10021c((C10022d) this.f20577b.get(), (C17414y) this.f20578c.get());
            default:
                return new C10534f((C10156h) this.f20578c.get(), (C13573c) this.f20577b.get());
        }
    }
}
