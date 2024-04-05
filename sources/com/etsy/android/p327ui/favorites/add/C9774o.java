package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.p327ui.util.C11780h;
import dagger.internal.C17555d;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.favorites.add.o */
public final class C9774o implements C17555d<FavoriteAndCollectionRepository> {

    /* renamed from: a */
    public final C19011a<C11780h> f21618a;

    /* renamed from: b */
    public final C19011a<C9766h> f21619b;

    /* renamed from: c */
    public final C19011a<C9790y> f21620c;

    /* renamed from: d */
    public final C19011a<C13461f> f21621d;

    public C9774o(C19011a aVar, C19011a aVar2, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f21618a = aVar;
        this.f21619b = aVar2;
        this.f21620c = aVar3;
        this.f21621d = gVar;
    }

    public final Object get() {
        return new FavoriteAndCollectionRepository(this.f21618a.get(), this.f21619b.get(), this.f21620c.get(), this.f21621d.get());
    }
}
