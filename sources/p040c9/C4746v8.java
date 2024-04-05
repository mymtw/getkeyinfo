package p040c9;

import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10368a;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10384d;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowCheckoutContainerFragment;
import dagger.android.C17550a;
import dagger.internal.C17554c;
import p456ua.C13461f;
import p514bk.C14088a;
import p740eq.C19011a;

/* renamed from: c9.v8 */
public final class C4746v8 implements C17550a {

    /* renamed from: b */
    public final C4690r4 f10716b;

    /* renamed from: c */
    public C19011a<C10368a> f10717c;

    public C4746v8(C4690r4 r4Var, C14088a aVar) {
        this.f10716b = r4Var;
        this.f10717c = C17554c.m29427b(new C4605l(aVar, 1));
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        NativeBuyItNowCheckoutContainerFragment nativeBuyItNowCheckoutContainerFragment = (NativeBuyItNowCheckoutContainerFragment) obj;
        nativeBuyItNowCheckoutContainerFragment.listingViewEligibility = new C10156h(C4690r4.m10336a(this.f10716b));
        nativeBuyItNowCheckoutContainerFragment.viewModel = new C10384d(new C13461f(), this.f10717c.get());
        nativeBuyItNowCheckoutContainerFragment.dispatcher = this.f10717c.get();
        nativeBuyItNowCheckoutContainerFragment.schedulers = new C13461f();
    }
}
