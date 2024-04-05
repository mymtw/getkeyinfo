package com.etsy.android.p327ui.search.filters;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.p327ui.search.p330v2.C10973d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p346fa.C12703a;
import p414oe.C13164c;
import p425q9.C13253e;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.filters.f */
public final class C10769f implements C17555d<C10767e> {

    /* renamed from: a */
    public final C19011a<C8694h> f23764a;

    /* renamed from: b */
    public final C19011a<C13461f> f23765b;

    /* renamed from: c */
    public final C19011a<C13888d> f23766c;

    /* renamed from: d */
    public final C19011a<C8629a> f23767d;

    /* renamed from: e */
    public final C19011a<C10973d> f23768e;

    /* renamed from: f */
    public final C19011a<C10766d> f23769f;

    /* renamed from: g */
    public final C19011a<C11786n> f23770g;

    /* renamed from: h */
    public final C19011a<C12703a> f23771h;

    /* renamed from: i */
    public final C19011a<C8618c> f23772i;

    /* renamed from: j */
    public final C19011a<SearchWithAdsRepository> f23773j;

    /* renamed from: k */
    public final C19011a<C13164c> f23774k;

    public C10769f(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C8782j jVar, C17553b bVar, C4591k kVar, C13253e eVar, C19011a aVar6) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f23764a = aVar;
        this.f23765b = gVar;
        this.f23766c = aVar2;
        this.f23767d = aVar3;
        this.f23768e = aVar4;
        this.f23769f = aVar5;
        this.f23770g = jVar;
        this.f23771h = bVar;
        this.f23772i = kVar;
        this.f23773j = eVar;
        this.f23774k = aVar6;
    }

    public final Object get() {
        return new C10767e(this.f23764a.get(), this.f23765b.get(), this.f23766c.get(), this.f23767d.get(), this.f23768e.get(), this.f23769f.get(), this.f23770g.get(), this.f23771h.get(), this.f23772i.get(), this.f23773j.get(), this.f23774k.get());
    }
}
