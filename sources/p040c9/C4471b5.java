package p040c9;

import com.etsy.android.p327ui.cart.C9332q;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import dagger.android.C17550a;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.b5 */
public final class C4471b5 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9770b;

    /* renamed from: c */
    public final C4690r4 f9771c;

    public C4471b5(C4579j1 j1Var, C4690r4 r4Var) {
        this.f9770b = j1Var;
        this.f9771c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CartWithSavedFragment cartWithSavedFragment = (CartWithSavedFragment) obj;
        cartWithSavedFragment.session = (C13265p) this.f9770b.f10101F0.get();
        cartWithSavedFragment.cartBadgeCountRepo = this.f9770b.f10168S2.get();
        cartWithSavedFragment.cartRefreshEventManager = this.f9770b.f10310s2.get();
        cartWithSavedFragment.rxSchedulers = new C13461f();
        cartWithSavedFragment.cartViewEligibility = new C9332q(C4690r4.m10336a(this.f9771c));
    }
}
