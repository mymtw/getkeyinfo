package com.etsy.android.p327ui.listing.p329ui.recommendations.handlers;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.listing.C10101d;
import dagger.internal.C17555d;
import p277w8.C8273k;
import p277w8.C8275m;
import p340ea.C12673n;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.recommendations.handlers.e */
public final class C10632e implements C17555d<ListingImpressionHandler> {

    /* renamed from: a */
    public final C19011a<C8273k> f23333a;

    /* renamed from: b */
    public final C19011a<C10101d> f23334b;

    /* renamed from: c */
    public final C19011a<C13461f> f23335c;

    /* renamed from: d */
    public final C19011a<C12673n> f23336d;

    /* renamed from: e */
    public final C19011a<C8694h> f23337e;

    public C10632e(C8275m mVar, C19011a aVar, C19011a aVar2, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f23333a = mVar;
        this.f23334b = aVar;
        this.f23335c = gVar;
        this.f23336d = aVar2;
        this.f23337e = aVar3;
    }

    public final Object get() {
        return new ListingImpressionHandler(this.f23333a.get(), this.f23334b.get(), this.f23335c.get(), this.f23336d.get(), this.f23337e.get());
    }
}
