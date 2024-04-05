package com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting;

import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.persistviewed.C8821c;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.util.C11780h;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.favoriting.b */
public final class C10638b implements C17555d<C10637a> {

    /* renamed from: a */
    public final C19011a<C13265p> f23366a;

    /* renamed from: b */
    public final C19011a<C11780h> f23367b;

    /* renamed from: c */
    public final C19011a<C13461f> f23368c;

    /* renamed from: d */
    public final C19011a<C10101d> f23369d;

    /* renamed from: e */
    public final C19011a<C8672b> f23370e;

    /* renamed from: f */
    public final C19011a<C13573c> f23371f;

    public C10638b(C17553b bVar, C8821c cVar, C19011a aVar, C19011a aVar2, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f23366a = bVar;
        this.f23367b = cVar;
        this.f23368c = gVar;
        this.f23369d = aVar;
        this.f23370e = aVar2;
        this.f23371f = aVar3;
    }

    public final Object get() {
        return new C10637a(this.f23366a.get(), this.f23367b.get(), this.f23368c.get(), this.f23369d.get(), this.f23370e.get(), this.f23371f.get());
    }
}
