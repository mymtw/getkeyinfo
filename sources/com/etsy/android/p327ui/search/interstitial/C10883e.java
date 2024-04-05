package com.etsy.android.p327ui.search.interstitial;

import com.etsy.android.config.flags.p073ui.search.C6414f;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.p327ui.favorites.add.C9791z;
import com.etsy.android.p327ui.search.C10864g;
import com.etsy.android.p327ui.search.SearchHistoryRepository;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.search.AutoSuggestRepository;
import com.etsy.android.search.C8971c;
import com.etsy.android.search.C8972d;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p040c9.C4763x;
import p346fa.C12703a;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.interstitial.e */
public final class C10883e implements C17555d<SearchInterstitialViewModel> {

    /* renamed from: a */
    public final C19011a<SearchSuggestionsRepository> f24140a;

    /* renamed from: b */
    public final C19011a<SearchHistoryRepository> f24141b;

    /* renamed from: c */
    public final C19011a<C8971c> f24142c;

    /* renamed from: d */
    public final C19011a<AutoSuggestRepository> f24143d;

    /* renamed from: e */
    public final C19011a<CoroutineDispatcher> f24144e;

    /* renamed from: f */
    public final C19011a<C12703a> f24145f;

    /* renamed from: g */
    public final C19011a<C13888d> f24146g;

    /* renamed from: h */
    public final C19011a<C10876b> f24147h;

    /* renamed from: i */
    public final C19011a<C10875a> f24148i;

    public C10883e(C9791z zVar, C10864g gVar, C8972d dVar, C4763x xVar, C8647f fVar, C17553b bVar, C19011a aVar, C6419c cVar, C6414f fVar2) {
        this.f24140a = zVar;
        this.f24141b = gVar;
        this.f24142c = dVar;
        this.f24143d = xVar;
        this.f24144e = fVar;
        this.f24145f = bVar;
        this.f24146g = aVar;
        this.f24147h = cVar;
        this.f24148i = fVar2;
    }

    public final Object get() {
        return new SearchInterstitialViewModel(this.f24140a.get(), this.f24141b.get(), this.f24142c.get(), this.f24143d.get(), this.f24144e.get(), this.f24145f.get(), this.f24146g.get(), this.f24147h.get(), this.f24148i.get());
    }
}
