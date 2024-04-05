package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.EstimatedDeliveryClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10427a;
import com.etsy.android.p327ui.search.listingresults.C10901a;
import com.etsy.android.p327ui.shop.BaseShopHomePageRepository;
import com.etsy.android.p327ui.shop.C11169j;
import com.etsy.android.p327ui.user.circles.CirclesRepository;
import com.etsy.android.p327ui.user.circles.CirclesViewModel;
import com.etsy.android.p327ui.util.C11786n;
import com.squareup.moshi.C17414y;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import p336dc.C12646d;
import p346fa.C12703a;
import p425q9.C13265p;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.g0 */
public final class C8757g0 implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19252a;

    /* renamed from: b */
    public final C19011a f19253b;

    /* renamed from: c */
    public final C19011a f19254c;

    public /* synthetic */ C8757g0(C19011a aVar, C19011a aVar2, int i) {
        this.f19252a = i;
        this.f19253b = aVar;
        this.f19254c = aVar2;
    }

    public final Object get() {
        switch (this.f19252a) {
            case 0:
                return new C8755f0(C17554c.m29426a(this.f19253b), (C12703a) this.f19254c.get());
            case 1:
                return new EstimatedDeliveryClickedHandler((C13573c) this.f19254c.get(), (C11786n) this.f19253b.get());
            case 2:
                return new C10427a((C13573c) this.f19253b.get(), (C12646d) this.f19254c.get());
            case 3:
                return new C10901a((PersistViewedBus) this.f19253b.get(), (C8890e0) this.f19254c.get());
            case 4:
                return new BaseShopHomePageRepository((C11169j) this.f19253b.get(), (C17414y) this.f19254c.get());
            default:
                return new CirclesViewModel((CirclesRepository) this.f19253b.get(), (C13265p) this.f19254c.get());
        }
    }
}
