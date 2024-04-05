package com.etsy.android.feedback;

import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.C11309y0;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p321cc.C8569c;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.feedback.o */
public final class C6470o implements C17555d<ItemReviewsFragment> {

    /* renamed from: a */
    public final C19011a<C8569c> f14367a;

    /* renamed from: b */
    public final C19011a<C11309y0> f14368b;

    /* renamed from: c */
    public final C19011a<C11132b1> f14369c;

    /* renamed from: d */
    public final C19011a<C11201t> f14370d;

    /* renamed from: e */
    public final C19011a<C13461f> f14371e;

    /* renamed from: f */
    public final C19011a<C13265p> f14372f;

    /* renamed from: g */
    public final C19011a<C13888d> f14373g;

    /* renamed from: h */
    public final C19011a<C8923u> f14374h;

    /* renamed from: i */
    public final C19011a<C11786n> f14375i;

    public C6470o(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C17553b bVar, C19011a aVar5, C19011a aVar6, C8782j jVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f14367a = aVar;
        this.f14368b = aVar2;
        this.f14369c = aVar3;
        this.f14370d = aVar4;
        this.f14371e = gVar;
        this.f14372f = bVar;
        this.f14373g = aVar5;
        this.f14374h = aVar6;
        this.f14375i = jVar;
    }

    public final Object get() {
        return new ItemReviewsFragment(this.f14367a.get(), this.f14368b.get(), this.f14369c.get(), this.f14370d.get(), this.f14371e.get(), this.f14372f.get(), this.f14373g.get(), this.f14374h.get(), this.f14375i.get());
    }
}
