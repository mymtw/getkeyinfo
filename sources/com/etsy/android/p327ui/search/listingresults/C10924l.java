package com.etsy.android.p327ui.search.listingresults;

import com.etsy.android.config.flags.C6381j;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8705b;
import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.lib.network.oauth2.C8757g0;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.p327ui.cart.googlepay.C9304b;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import com.etsy.android.p327ui.search.p330v2.C11028i;
import com.etsy.android.p327ui.search.p330v2.filters.C10982c;
import com.etsy.android.p327ui.search.p330v2.filters.C10983d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.search.savedsearch.C8976b;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p277w8.C8267e;
import p422pe.C13225d;
import p425q9.C13253e;
import p445sf.C13380b;
import p456ua.C13461f;
import p456ua.C13462g;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.listingresults.l */
public final class C10924l implements C17555d<SearchResultsListingsViewModel> {

    /* renamed from: a */
    public final C19011a<C13461f> f24235a = C13462g.C13463a.f29482a;

    /* renamed from: b */
    public final C19011a<C11028i> f24236b;

    /* renamed from: c */
    public final C19011a<SearchWithAdsRepository> f24237c;

    /* renamed from: d */
    public final C19011a<C13225d> f24238d;

    /* renamed from: e */
    public final C19011a<ListingCardViewHolderOptions.C11974h> f24239e;

    /* renamed from: f */
    public final C19011a<C8629a> f24240f;

    /* renamed from: g */
    public final C19011a<C10971c> f24241g;

    /* renamed from: h */
    public final C19011a<C13380b> f24242h;

    /* renamed from: i */
    public final C19011a<C8710g> f24243i;

    /* renamed from: j */
    public final C19011a<C8267e> f24244j;

    /* renamed from: k */
    public final C19011a<C10903c> f24245k;

    /* renamed from: l */
    public final C19011a<C8976b> f24246l;

    /* renamed from: m */
    public final C19011a<C11786n> f24247m;

    /* renamed from: n */
    public final C19011a<C13943a> f24248n;

    /* renamed from: o */
    public final C19011a<C10982c> f24249o;

    /* renamed from: p */
    public final C19011a<PersistViewedBus> f24250p;

    /* renamed from: q */
    public final C19011a<C8694h> f24251q;

    /* renamed from: r */
    public final C19011a<C10901a> f24252r;

    /* renamed from: s */
    public final C19011a<CoroutineDispatcher> f24253s;

    public C10924l(C19011a aVar, C13253e eVar, C9304b bVar, C10906f fVar, C19011a aVar2, C10907g gVar, C6381j jVar, C8705b bVar2, C19011a aVar3, C8654m mVar, C19011a aVar4, C8782j jVar2, C19011a aVar5, C10983d dVar, C19011a aVar6, C19011a aVar7, C8757g0 g0Var, C8647f fVar2) {
        this.f24236b = aVar;
        this.f24237c = eVar;
        this.f24238d = bVar;
        this.f24239e = fVar;
        this.f24240f = aVar2;
        this.f24241g = gVar;
        this.f24242h = jVar;
        this.f24243i = bVar2;
        this.f24244j = aVar3;
        this.f24245k = mVar;
        this.f24246l = aVar4;
        this.f24247m = jVar2;
        this.f24248n = aVar5;
        this.f24249o = dVar;
        this.f24250p = aVar6;
        this.f24251q = aVar7;
        this.f24252r = g0Var;
        this.f24253s = fVar2;
    }

    public final Object get() {
        return new SearchResultsListingsViewModel(this.f24235a.get(), this.f24236b.get(), this.f24237c.get(), this.f24238d.get(), this.f24239e.get(), this.f24240f.get(), this.f24241g.get(), this.f24242h.get(), this.f24243i.get(), this.f24244j.get(), this.f24245k.get(), this.f24246l.get(), this.f24247m.get(), this.f24248n.get(), this.f24249o.get(), this.f24250p.get(), this.f24251q.get(), this.f24252r.get(), this.f24253s.get());
    }
}
