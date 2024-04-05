package com.etsy.android.p327ui.listing.fetch;

import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.C10156h;
import kotlin.jvm.internal.C19383o;
import p321cc.C8569c;
import p456ua.C13461f;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.fetch.c */
public final class C10139c {

    /* renamed from: a */
    public final C13573c f22299a;

    /* renamed from: b */
    public final C10101d f22300b;

    /* renamed from: c */
    public final C9303a f22301c;

    /* renamed from: d */
    public final C10156h f22302d;

    /* renamed from: e */
    public final C8569c f22303e;

    /* renamed from: f */
    public final C13461f f22304f;

    /* renamed from: g */
    public final C8710g f22305g;

    public C10139c(C13573c cVar, C10101d dVar, C9303a aVar, C10156h hVar, C8569c cVar2, C13461f fVar, C8710g gVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(aVar, "googlePayHelper");
        C19383o.m32797g(hVar, "listingViewEligibility");
        C19383o.m32797g(cVar2, "listingRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(gVar, "performanceTrackerAdapter");
        this.f22299a = cVar;
        this.f22300b = dVar;
        this.f22301c = aVar;
        this.f22302d = hVar;
        this.f22303e = cVar2;
        this.f22304f = fVar;
        this.f22305g = gVar;
    }
}
