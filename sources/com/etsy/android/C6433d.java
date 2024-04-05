package com.etsy.android;

import android.content.Context;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.requests.LocaleRepository;
import com.etsy.android.lib.selfuser.C8851b;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p359ha.C12799a;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.d */
public final class C6433d implements C17555d<BoeUserInfoFetcher> {

    /* renamed from: a */
    public final C19011a<C13265p> f14251a;

    /* renamed from: b */
    public final C19011a<Context> f14252b;

    /* renamed from: c */
    public final C19011a<C8637h> f14253c;

    /* renamed from: d */
    public final C19011a<C12703a> f14254d;

    /* renamed from: e */
    public final C19011a<C8851b> f14255e;

    /* renamed from: f */
    public final C19011a<LocaleRepository> f14256f;

    /* renamed from: g */
    public final C19011a<C13461f> f14257g;

    /* renamed from: h */
    public final C19011a<C12799a> f14258h;

    /* renamed from: i */
    public final C19011a<C13888d> f14259i;

    public C6433d(C17553b bVar, C19011a aVar, C19011a aVar2, C17553b bVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f14251a = bVar;
        this.f14252b = aVar;
        this.f14253c = aVar2;
        this.f14254d = bVar2;
        this.f14255e = aVar3;
        this.f14256f = aVar4;
        this.f14257g = gVar;
        this.f14258h = aVar5;
        this.f14259i = aVar6;
    }

    public final Object get() {
        return new BoeUserInfoFetcher(this.f14251a.get(), this.f14252b.get(), this.f14253c.get(), this.f14254d.get(), this.f14255e.get(), this.f14256f.get(), this.f14257g.get(), this.f14258h.get(), this.f14259i.get());
    }
}
