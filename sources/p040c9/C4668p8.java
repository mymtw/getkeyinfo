package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.cart.C9329o;
import com.etsy.android.p327ui.cart.C9330p;
import com.etsy.android.p327ui.cart.C9332q;
import com.etsy.android.p327ui.cart.C9420x;
import com.etsy.android.p327ui.cart.C9421y;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.p327ui.cart.bottomsheets.SelectVariationWorkflow;
import com.etsy.android.p327ui.cart.clicklisteners.C9274e;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.cart.pushoptin.C9331a;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p143i9.C7007f;
import p346fa.C12703a;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.p8 */
public final class C4668p8 implements C17550a {

    /* renamed from: b */
    public final C1993m f10483b;

    /* renamed from: c */
    public final C4579j1 f10484c;

    /* renamed from: d */
    public final C4690r4 f10485d;

    public C4668p8(C4579j1 j1Var, C4690r4 r4Var, C1993m mVar) {
        this.f10484c = j1Var;
        this.f10485d = r4Var;
        this.f10483b = mVar;
    }

    /* renamed from: a */
    public final C9420x mo14415a() {
        C1993m mVar = this.f10483b;
        C8731g gVar = (C8731g) this.f10484c.f10091D0.get();
        mVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C9421y.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        return new C9420x(this.f10484c.f10204Z3.get(), (C9421y) b, this.f10484c.f10260j0.get(), this.f10484c.f10146O0.get());
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        MultiShopCartFragment multiShopCartFragment = (MultiShopCartFragment) obj;
        multiShopCartFragment.mGooglePayHelper = new C9303a(this.f10484c.f10085C.get(), this.f10484c.f10212b0.get(), this.f10484c.f10131L0.get(), (C12703a) this.f10484c.f10308s0.get(), (C8591a) this.f10484c.f10272l0.get());
        multiShopCartFragment.elkLogger = this.f10484c.f10131L0.get();
        multiShopCartFragment.grafana = (C12703a) this.f10484c.f10308s0.get();
        multiShopCartFragment.cartScrollEventDelegate = new C9329o();
        multiShopCartFragment.performanceTrackerAdapter = new C8704a(this.f10484c.mo14412u());
        multiShopCartFragment.session = (C13265p) this.f10484c.f10101F0.get();
        multiShopCartFragment.installInfo = this.f10484c.f10260j0.get();
        multiShopCartFragment.rxSchedulers = new C13461f();
        multiShopCartFragment.cartBadgeCountRepo = this.f10484c.f10168S2.get();
        multiShopCartFragment.favoriteRepository = this.f10484c.mo14405n();
        multiShopCartFragment.multiShopCartRepository = mo14415a();
        multiShopCartFragment.cartRefreshEventManager = this.f10484c.f10310s2.get();
        multiShopCartFragment.cartViewEligibility = new C9332q(C4690r4.m10336a(this.f10485d));
        multiShopCartFragment.selectVariationWorkflow = new SelectVariationWorkflow(mo14415a(), new C13461f(), this.f10485d.mo14417c(), this.f10484c.f10131L0.get());
        multiShopCartFragment.addShopCouponWorkflow = new C9274e(mo14415a(), new C13461f());
        multiShopCartFragment.reviewPromptEligibility = new C7007f(this.f10484c.f10248h0.get(), C4690r4.m10336a(this.f10485d), this.f10484c.f10090D.get());
        multiShopCartFragment.cartCouponCache = this.f10484c.f10335x2.get();
        multiShopCartFragment.configuredV3MoshiRetrofit = (C8731g) this.f10484c.f10091D0.get();
        multiShopCartFragment.postPurchasePushOptInEligibility = new C9331a(this.f10484c.f10314t1.get(), this.f10484c.f10090D.get(), this.f10484c.f10114H3.get());
        multiShopCartFragment.firebaseAnalyticsTracker = this.f10484c.f10088C2.get();
        multiShopCartFragment.adImpressionRepository = this.f10484c.f10336x3.get();
        multiShopCartFragment.deepLinkEligibility = this.f10484c.f10341y3.get();
        C4579j1 j1Var = this.f10484c;
        multiShopCartFragment.cartUriParser = new C9330p(j1Var.mo14408q(), j1Var.mo14400i());
        multiShopCartFragment.routeInspector = this.f10484c.mo14408q();
        multiShopCartFragment.deepLinkEntityChecker = this.f10484c.mo14400i();
        multiShopCartFragment.searchUriParser = C4579j1.m10250a(this.f10484c);
    }
}
