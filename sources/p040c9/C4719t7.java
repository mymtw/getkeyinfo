package p040c9;

import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.config.flags.events.C6367n;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.C9332q;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.inappnotifications.C11553g;
import com.etsy.android.p327ui.user.inappnotifications.C11562o;
import com.etsy.android.p327ui.user.inappnotifications.C11563p;
import com.etsy.android.p327ui.user.inappnotifications.InAppNotificationsFragment;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.t7 */
public final class C4719t7 implements C17550a {

    /* renamed from: b */
    public final C0005b f10664b;

    /* renamed from: c */
    public final InAppNotificationsFragment f10665c;

    /* renamed from: d */
    public final C4579j1 f10666d;

    /* renamed from: e */
    public final C4690r4 f10667e;

    /* renamed from: f */
    public C11563p f10668f;

    public C4719t7(C4579j1 j1Var, C4690r4 r4Var, C0005b bVar, InAppNotificationsFragment inAppNotificationsFragment) {
        this.f10666d = j1Var;
        this.f10667e = r4Var;
        this.f10664b = bVar;
        this.f10665c = inAppNotificationsFragment;
        C0005b bVar2 = bVar;
        this.f10668f = new C11563p(bVar2, j1Var.f10080B, j1Var.f10198Y2, new C6367n(j1Var.f10222c4, 12), j1Var.f10124J3, j1Var.f10203Z2, j1Var.f10192X1);
    }

    /* renamed from: a */
    public final C11562o mo14418a() {
        C0005b bVar = this.f10664b;
        C4579j1 j1Var = this.f10666d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C11562o.class, this.f10668f));
        InAppNotificationsFragment inAppNotificationsFragment = this.f10665c;
        bVar.getClass();
        C19383o.m32797g(inAppNotificationsFragment, "target");
        return (C11562o) new C2870k0((C2880m0) inAppNotificationsFragment, (C2870k0.C2872b) oVar).mo10829a(C11562o.class);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        InAppNotificationsFragment inAppNotificationsFragment = (InAppNotificationsFragment) obj;
        C0005b bVar = this.f10664b;
        InAppNotificationsFragment inAppNotificationsFragment2 = this.f10665c;
        bVar.getClass();
        C19383o.m32797g(inAppNotificationsFragment2, "inAppNotificationsFragment");
        inAppNotificationsFragment.presenter = new C11553g(inAppNotificationsFragment2, mo14418a(), this.f10666d.f10198Y2.get(), new C13461f(), this.f10666d.f10111H0.get(), this.f10666d.mo14411t());
        inAppNotificationsFragment.qualtricsWrapper = this.f10666d.f10117I1.get();
        inAppNotificationsFragment.currentLocale = this.f10666d.f10298q0.get();
        inAppNotificationsFragment.configMap = this.f10666d.mo14404m();
        inAppNotificationsFragment.viewmodel = mo14418a();
        inAppNotificationsFragment.cartRefreshEventManager = this.f10666d.f10310s2.get();
        inAppNotificationsFragment.cartCouponCache = this.f10666d.f10335x2.get();
        inAppNotificationsFragment.session = (C13265p) this.f10666d.f10101F0.get();
        inAppNotificationsFragment.schedulers = new C13461f();
        inAppNotificationsFragment.eligibility = this.f10666d.f10227d3.get();
        inAppNotificationsFragment.cartEligibility = new C9332q(C4690r4.m10336a(this.f10667e));
        inAppNotificationsFragment.updatesNativeEligibility = this.f10666d.f10203Z2.get();
        inAppNotificationsFragment.favoriteTabsSelectedState = this.f10666d.f10192X1.get();
    }
}
