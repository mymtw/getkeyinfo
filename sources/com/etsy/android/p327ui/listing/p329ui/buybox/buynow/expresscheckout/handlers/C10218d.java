package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers;

import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10342b;
import com.etsy.android.p327ui.user.purchases.C11650h;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p428qc.C13294e;
import p466vc.C13573c;
import p490yd.C13914b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.handlers.d */
public final class C10218d implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f22474a;

    /* renamed from: b */
    public final C19011a f22475b;

    /* renamed from: c */
    public final C19011a f22476c;

    public /* synthetic */ C10218d(C19011a aVar, C19011a aVar2, int i) {
        this.f22474a = i;
        this.f22475b = aVar;
        this.f22476c = aVar2;
    }

    public final Object get() {
        switch (this.f22474a) {
            case 0:
                return new C10217c((C10156h) this.f22476c.get(), (C13573c) this.f22475b.get());
            case 1:
                return new C10342b((C13914b) this.f22475b.get(), (C11786n) this.f22476c.get());
            default:
                return new C11650h((C12741o) this.f22475b.get(), (C13294e) this.f22476c.get());
        }
    }
}
