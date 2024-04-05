package com.etsy.android.p327ui.search.listingresults;

import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p425q9.C13267q;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.listingresults.g */
public final class C10907g implements C17555d<C10971c> {

    /* renamed from: a */
    public final C19382n f24214a;

    /* renamed from: b */
    public final C19011a<C13267q> f24215b;

    /* renamed from: c */
    public final C19011a<Connectivity> f24216c;

    /* renamed from: d */
    public final C19011a<C10971c.C10972a> f24217d;

    public C10907g(C19382n nVar, C19011a aVar, C19011a aVar2, C10908h hVar) {
        this.f24214a = nVar;
        this.f24215b = aVar;
        this.f24216c = aVar2;
        this.f24217d = hVar;
    }

    public final Object get() {
        C19382n nVar = this.f24214a;
        C13267q qVar = this.f24215b.get();
        Connectivity connectivity = this.f24216c.get();
        C10971c.C10972a aVar = this.f24217d.get();
        nVar.getClass();
        C19383o.m32797g(qVar, "sessionTimeManager");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(aVar, "buildInfo");
        return new C10971c(qVar, connectivity, aVar);
    }
}
