package com.etsy.android.p327ui.favorites;

import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.FetchVariationOfferingHandler;
import dagger.internal.C17555d;
import p321cc.C8569c;
import p350fe.C12741o;
import p425q9.C13265p;
import p456ua.C13461f;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.favorites.w */
public final class C9898w implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f21833a;

    /* renamed from: b */
    public final C19011a f21834b;

    /* renamed from: c */
    public final C19011a f21835c;

    /* renamed from: d */
    public final C19011a f21836d;

    /* renamed from: e */
    public final C19011a f21837e;

    public /* synthetic */ C9898w(C19011a aVar, C19011a aVar2, C17555d dVar, C19011a aVar3, int i) {
        this.f21833a = i;
        this.f21834b = aVar;
        this.f21835c = aVar2;
        this.f21836d = dVar;
        this.f21837e = aVar3;
    }

    public final Object get() {
        switch (this.f21833a) {
            case 0:
                return new C9897v((C12741o) this.f21834b.get(), (C13265p) this.f21835c.get(), (C9833d) this.f21836d.get(), (C9792b) this.f21837e.get());
            default:
                return new FetchVariationOfferingHandler((C8569c) this.f21834b.get(), (C13573c) this.f21835c.get(), (C13461f) this.f21836d.get(), (C10101d) this.f21837e.get());
        }
    }
}
