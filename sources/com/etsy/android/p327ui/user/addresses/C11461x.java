package com.etsy.android.p327ui.user.addresses;

import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4493d;
import p346fa.C12703a;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.user.addresses.x */
public final class C11461x implements C17555d<C11460w> {

    /* renamed from: a */
    public final C19011a<C13461f> f25297a = C13462g.C13463a.f29482a;

    /* renamed from: b */
    public final C19011a<C11393c0> f25298b;

    /* renamed from: c */
    public final C19011a<C13888d> f25299c;

    /* renamed from: d */
    public final C19011a<C12703a> f25300d;

    public C11461x(C4493d dVar, C19011a aVar, C17553b bVar) {
        this.f25298b = dVar;
        this.f25299c = aVar;
        this.f25300d = bVar;
    }

    public final Object get() {
        return new C11460w(this.f25297a.get(), this.f25298b.get(), this.f25299c.get(), this.f25300d.get());
    }
}
