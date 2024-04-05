package com.etsy.android.p327ui;

import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.core.C9700n;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.user.C11684r;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p409o9.C13138q;
import p425q9.C13253e;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p475we.C13827c;
import p475we.C13831g;
import p491ye.C13919c;
import p491ye.C13920d;
import p491ye.C13921e;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.o */
public final class C10706o implements C17555d<C10677n> {

    /* renamed from: a */
    public final C19011a<C13265p> f23611a;

    /* renamed from: b */
    public final C19011a<C13138q> f23612b;

    /* renamed from: c */
    public final C19011a<CartBadgeCountRepo> f23613c;

    /* renamed from: d */
    public final C19011a<BottomNavStateRepo> f23614d;

    /* renamed from: e */
    public final C19011a<C13461f> f23615e;

    /* renamed from: f */
    public final C19011a<C13831g> f23616f;

    /* renamed from: g */
    public final C19011a<C13827c> f23617g;

    /* renamed from: h */
    public final C19011a<UserBadgeCountManager> f23618h;

    /* renamed from: i */
    public final C19011a<C13919c> f23619i;

    /* renamed from: j */
    public final C19011a<C13920d> f23620j;

    /* renamed from: k */
    public final C19011a<C13921e> f23621k;

    /* renamed from: l */
    public final C19011a<C11684r> f23622l;

    /* renamed from: m */
    public final C19011a<C9700n> f23623m;

    /* renamed from: n */
    public final C19011a<PersistViewedBus> f23624n;

    public C10706o(C17553b bVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, C19011a aVar7, C19011a aVar8, C13253e eVar, C19011a aVar9, C19011a aVar10, C19011a aVar11) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f23611a = bVar;
        this.f23612b = aVar;
        this.f23613c = aVar2;
        this.f23614d = aVar3;
        this.f23615e = gVar;
        this.f23616f = aVar4;
        this.f23617g = aVar5;
        this.f23618h = aVar6;
        this.f23619i = aVar7;
        this.f23620j = aVar8;
        this.f23621k = eVar;
        this.f23622l = aVar9;
        this.f23623m = aVar10;
        this.f23624n = aVar11;
    }

    public final Object get() {
        return new C10677n(this.f23611a.get(), this.f23612b.get(), this.f23613c.get(), this.f23614d.get(), this.f23615e.get(), this.f23616f.get(), this.f23617g.get(), this.f23618h.get(), this.f23619i.get(), this.f23620j.get(), this.f23621k.get(), this.f23622l.get(), this.f23623m.get(), this.f23624n.get());
    }
}
