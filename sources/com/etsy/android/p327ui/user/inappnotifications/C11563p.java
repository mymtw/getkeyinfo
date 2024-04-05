package com.etsy.android.p327ui.user.inappnotifications;

import androidx.lifecycle.C2866i0;
import com.etsy.android.BOEApplication;
import com.etsy.android.config.flags.events.C6367n;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.persistviewed.C8821c;
import com.etsy.android.p327ui.favorites.C9859l;
import com.etsy.android.p327ui.util.C11780h;
import dagger.internal.C17555d;
import dagger.internal.C17556e;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.p */
public final class C11563p implements C17555d<C2866i0> {

    /* renamed from: a */
    public final C0005b f25615a;

    /* renamed from: b */
    public final C19011a<BOEApplication> f25616b;

    /* renamed from: c */
    public final C19011a<C8672b> f25617c;

    /* renamed from: d */
    public final C19011a<C13461f> f25618d;

    /* renamed from: e */
    public final C19011a<C11554h> f25619e;

    /* renamed from: f */
    public final C19011a<C11780h> f25620f;

    /* renamed from: g */
    public final C19011a<C11541a0> f25621g;

    /* renamed from: h */
    public final C19011a<C9859l> f25622h;

    public C11563p(C0005b bVar, C17556e eVar, C19011a aVar, C6367n nVar, C8821c cVar, C19011a aVar2, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f25615a = bVar;
        this.f25616b = eVar;
        this.f25617c = aVar;
        this.f25618d = gVar;
        this.f25619e = nVar;
        this.f25620f = cVar;
        this.f25621g = aVar2;
        this.f25622h = aVar3;
    }

    public final Object get() {
        C0005b bVar = this.f25615a;
        BOEApplication bOEApplication = this.f25616b.get();
        C8672b bVar2 = this.f25617c.get();
        C13461f fVar = this.f25618d.get();
        C11554h hVar = this.f25619e.get();
        C11780h hVar2 = this.f25620f.get();
        C11541a0 a0Var = this.f25621g.get();
        C9859l lVar = this.f25622h.get();
        bVar.getClass();
        C19383o.m32797g(bOEApplication, "app");
        C19383o.m32797g(bVar2, "analyticsTracker");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(hVar, "ianRepo");
        C19383o.m32797g(hVar2, "favoritesRepo");
        C19383o.m32797g(a0Var, "updatesNativeEligibility");
        C19383o.m32797g(lVar, "favoriteTabsSelectedState");
        return new C11562o(bOEApplication, bVar2, fVar, hVar, hVar2, a0Var, lVar);
    }
}
