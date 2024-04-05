package p040c9;

import com.etsy.android.p327ui.VespaDemoFragment;
import com.etsy.android.p327ui.cart.C9329o;
import com.etsy.android.p327ui.cart.C9332q;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.bc */
public final class C4478bc implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9789b;

    /* renamed from: c */
    public final C4690r4 f9790c;

    public C4478bc(C4579j1 j1Var, C4690r4 r4Var) {
        this.f9789b = j1Var;
        this.f9790c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        VespaDemoFragment vespaDemoFragment = (VespaDemoFragment) obj;
        vespaDemoFragment.cartScrollEventDelegate = new C9329o();
        vespaDemoFragment.cartViewEligibility = new C9332q(C4690r4.m10336a(this.f9790c));
        vespaDemoFragment.favoriteRepository = this.f9789b.mo14405n();
        vespaDemoFragment.rxSchedulers = new C13461f();
        vespaDemoFragment.adImpressionRepository = this.f9789b.f10336x3.get();
        vespaDemoFragment.deepLinkEligibility = this.f9789b.f10341y3.get();
        vespaDemoFragment.routeInspector = this.f9789b.mo14408q();
        vespaDemoFragment.deepLinkEntityChecker = this.f9789b.mo14400i();
        vespaDemoFragment.searchUriParser = C4579j1.m10250a(this.f9789b);
    }
}
