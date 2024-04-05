package com.etsy.android.p327ui.search.filters.refactor;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.dagger.C8648g;
import com.etsy.android.lib.logger.perf.C8705b;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.p327ui.search.filters.refactor.C10787a0;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4493d;
import p346fa.C12703a;
import p352ga.C12750a;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.filters.refactor.n */
public final class C10837n implements C17555d<SearchFiltersRefactorViewModel> {

    /* renamed from: a */
    public final C19011a<C11786n> f23990a;

    /* renamed from: b */
    public final C19011a<C10855s> f23991b;

    /* renamed from: c */
    public final C19011a<SearchFiltersRepository> f23992c;

    /* renamed from: d */
    public final C19011a<C12703a> f23993d;

    /* renamed from: e */
    public final C19011a<C8630b> f23994e;

    /* renamed from: f */
    public final C19011a<C8629a> f23995f;

    /* renamed from: g */
    public final C19011a<C13888d> f23996g;

    /* renamed from: h */
    public final C19011a<C10836m> f23997h;

    /* renamed from: i */
    public final C19011a<C10857u> f23998i;

    /* renamed from: j */
    public final C19011a<C10863z> f23999j;

    public C10837n(C8782j jVar, C8648g gVar, C4493d dVar, C17553b bVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C8705b bVar2, C12750a aVar4) {
        C10787a0 a0Var = C10787a0.C10788a.f23889a;
        this.f23990a = jVar;
        this.f23991b = gVar;
        this.f23992c = dVar;
        this.f23993d = bVar;
        this.f23994e = aVar;
        this.f23995f = aVar2;
        this.f23996g = aVar3;
        this.f23997h = bVar2;
        this.f23998i = aVar4;
        this.f23999j = a0Var;
    }

    public final Object get() {
        return new SearchFiltersRefactorViewModel(this.f23990a.get(), this.f23991b.get(), this.f23992c.get(), this.f23993d.get(), this.f23994e.get(), this.f23995f.get(), this.f23996g.get(), this.f23997h.get(), this.f23998i.get(), this.f23999j.get());
    }
}
