package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.C9330p;
import com.etsy.android.p327ui.cart.saved.C9336a;
import com.etsy.android.p327ui.cart.saved.C9341b;
import com.etsy.android.p327ui.cart.saved.C9348e;
import com.etsy.android.p327ui.cart.saved.C9349f;
import com.etsy.android.p327ui.cart.saved.StandaloneSavedCartItemsFragment;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p367ib.C12928c;
import p367ib.C12929d;
import p456ua.C13461f;

/* renamed from: c9.pb */
public final class C4671pb implements C17550a {

    /* renamed from: b */
    public final C19421p f10493b;

    /* renamed from: c */
    public final C4579j1 f10494c;

    /* renamed from: d */
    public C9341b f10495d;

    public C4671pb(C4579j1 j1Var, C19382n nVar, C19421p pVar) {
        this.f10494c = j1Var;
        this.f10493b = pVar;
        this.f10495d = new C9341b(new C9348e(new C9349f(nVar, j1Var.f10091D0)), j1Var.f10310s2);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        StandaloneSavedCartItemsFragment standaloneSavedCartItemsFragment = (StandaloneSavedCartItemsFragment) obj;
        standaloneSavedCartItemsFragment.retrofit = (C8731g) this.f10494c.f10091D0.get();
        standaloneSavedCartItemsFragment.cartBadgeCountRepo = this.f10494c.f10168S2.get();
        standaloneSavedCartItemsFragment.cartRefreshEventManager = this.f10494c.f10310s2.get();
        standaloneSavedCartItemsFragment.rxSchedulers = new C13461f();
        standaloneSavedCartItemsFragment.favoriteRepository = this.f10494c.mo14405n();
        C4579j1 j1Var = this.f10494c;
        standaloneSavedCartItemsFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C9336a.class, this.f10495d));
        standaloneSavedCartItemsFragment.adImpressionRepository = this.f10494c.f10336x3.get();
        C19421p pVar = this.f10493b;
        C8731g gVar = (C8731g) this.f10494c.f10091D0.get();
        pVar.getClass();
        C19383o.m32797g(gVar, "v3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C12928c.class);
        C19383o.m32796f(b, "v3MoshiRetrofit.v3moshiR…CartEndpoint::class.java)");
        standaloneSavedCartItemsFragment.savedCartRepository = new C12929d((C12928c) b, this.f10494c.f10146O0.get());
        standaloneSavedCartItemsFragment.deepLinkEligibility = this.f10494c.f10341y3.get();
        C4579j1 j1Var2 = this.f10494c;
        standaloneSavedCartItemsFragment.cartUriParser = new C9330p(j1Var2.mo14408q(), j1Var2.mo14400i());
        standaloneSavedCartItemsFragment.routeInspector = this.f10494c.mo14408q();
        standaloneSavedCartItemsFragment.deepLinkEntityChecker = this.f10494c.mo14400i();
        standaloneSavedCartItemsFragment.searchUriParser = C4579j1.m10250a(this.f10494c);
    }
}
