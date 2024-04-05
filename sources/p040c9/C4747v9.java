package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.cart.C9330p;
import com.etsy.android.p327ui.cart.SavedCartItemsFragment;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p367ib.C12928c;
import p367ib.C12929d;
import p456ua.C13461f;

/* renamed from: c9.v9 */
public final class C4747v9 implements C17550a {

    /* renamed from: b */
    public final C19421p f10718b;

    /* renamed from: c */
    public final C4579j1 f10719c;

    public C4747v9(C4579j1 j1Var, C19421p pVar) {
        this.f10719c = j1Var;
        this.f10718b = pVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SavedCartItemsFragment savedCartItemsFragment = (SavedCartItemsFragment) obj;
        savedCartItemsFragment.retrofit = (C8731g) this.f10719c.f10091D0.get();
        savedCartItemsFragment.cartBadgeCountRepo = this.f10719c.f10168S2.get();
        savedCartItemsFragment.cartRefreshEventManager = this.f10719c.f10310s2.get();
        savedCartItemsFragment.rxSchedulers = new C13461f();
        savedCartItemsFragment.favoriteRepository = this.f10719c.mo14405n();
        savedCartItemsFragment.adImpressionRepository = this.f10719c.f10336x3.get();
        C19421p pVar = this.f10718b;
        C8731g gVar = (C8731g) this.f10719c.f10091D0.get();
        pVar.getClass();
        C19383o.m32797g(gVar, "v3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C12928c.class);
        C19383o.m32796f(b, "v3MoshiRetrofit.v3moshiR…CartEndpoint::class.java)");
        savedCartItemsFragment.savedCartRepository = new C12929d((C12928c) b, this.f10719c.f10146O0.get());
        savedCartItemsFragment.deepLinkEligibility = this.f10719c.f10341y3.get();
        savedCartItemsFragment.deepLinkEntityChecker = this.f10719c.mo14400i();
        savedCartItemsFragment.searchUriParser = C4579j1.m10250a(this.f10719c);
        C4579j1 j1Var = this.f10719c;
        savedCartItemsFragment.cartUriParser = new C9330p(j1Var.mo14408q(), j1Var.mo14400i());
        savedCartItemsFragment.routeInspector = this.f10719c.mo14408q();
    }
}
