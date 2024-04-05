package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.core.C9616d;
import com.etsy.android.p327ui.core.C9617e;
import com.etsy.android.p327ui.core.CollectionFragment;
import com.etsy.android.p327ui.favorites.C9792b;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p397mc.C13047a;
import p405nc.C13110a;
import p412oc.C13149a;
import p412oc.C13150b;
import p425q9.C13265p;
import p456ua.C13461f;
import p514bk.C14088a;

/* renamed from: c9.m5 */
public final class C4625m5 implements C17550a {

    /* renamed from: b */
    public final C14088a f10420b;

    /* renamed from: c */
    public final C4579j1 f10421c;

    public C4625m5(C4579j1 j1Var, C14088a aVar) {
        this.f10421c = j1Var;
        this.f10420b = aVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CollectionFragment collectionFragment = (CollectionFragment) obj;
        collectionFragment.logCat = this.f10421c.f10212b0.get();
        collectionFragment.rxSchedulers = new C13461f();
        collectionFragment.session = (C13265p) this.f10421c.f10101F0.get();
        C14088a aVar = this.f10420b;
        C8731g gVar = (C8731g) this.f10421c.f10091D0.get();
        aVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C9616d.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…tionEndpoint::class.java)");
        collectionFragment.collectionRepository = new C9617e((C9616d) b);
        collectionFragment.currentLocale = this.f10421c.f10298q0.get();
        collectionFragment.favoriteRepository = this.f10421c.mo14405n();
        collectionFragment.collectionHeaderEligibility = new C9792b(this.f10421c.mo14404m());
        collectionFragment.adImpressionRepository = this.f10421c.f10336x3.get();
        collectionFragment.deepLinkEligibility = this.f10421c.f10341y3.get();
        collectionFragment.routeInspector = this.f10421c.mo14408q();
        collectionFragment.deepLinkEntityChecker = this.f10421c.mo14400i();
        collectionFragment.searchUriParser = C4579j1.m10250a(this.f10421c);
        C13149a aVar2 = new C13149a(this.f10421c.mo14404m(), this.f10421c.f10298q0.get());
        C4579j1 j1Var = this.f10421c;
        C13110a aVar3 = j1Var.f10302r;
        C8731g gVar2 = (C8731g) j1Var.f10091D0.get();
        aVar3.getClass();
        C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
        Object b2 = gVar2.f19177a.mo74387b(C13047a.class);
        C19383o.m32796f(b2, "configuredV3MoshiRetrofi…tersEndpoint::class.java)");
        C13150b bVar = new C13150b(aVar2, (C13047a) b2, this.f10421c.f10146O0.get());
        bVar.f28924d = (C13265p) this.f10421c.f10101F0.get();
        collectionFragment.clusterRepository = bVar;
        collectionFragment.clustersEligibility = new C13149a(this.f10421c.mo14404m(), this.f10421c.f10298q0.get());
        collectionFragment.analyticsTracker = this.f10421c.f10198Y2.get();
    }
}
