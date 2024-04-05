package com.etsy.android.p327ui.util.countries;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p346fa.C12703a;
import p456ua.C13461f;
import p456ua.C13462g;
import p470w9.C13794b;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.util.countries.a */
public final class C11775a implements C17555d<CountrySelectorViewModel> {

    /* renamed from: a */
    public final C19011a<C13794b> f26234a;

    /* renamed from: b */
    public final C19011a<C13461f> f26235b;

    /* renamed from: c */
    public final C19011a<C8694h> f26236c;

    /* renamed from: d */
    public final C19011a<C12703a> f26237d;

    /* renamed from: e */
    public final C19011a<C8618c> f26238e;

    /* renamed from: f */
    public final C19011a<C13888d> f26239f;

    public C11775a(C19011a aVar, C19011a aVar2, C17553b bVar, C4591k kVar, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f26234a = aVar;
        this.f26235b = gVar;
        this.f26236c = aVar2;
        this.f26237d = bVar;
        this.f26238e = kVar;
        this.f26239f = aVar3;
    }

    public final Object get() {
        return new CountrySelectorViewModel(this.f26234a.get(), this.f26235b.get(), this.f26236c.get(), this.f26237d.get(), this.f26238e.get(), this.f26239f.get());
    }
}
