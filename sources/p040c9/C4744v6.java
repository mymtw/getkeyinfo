package p040c9;

import com.etsy.android.checkout.C6334a;
import com.etsy.android.checkout.C6337d;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.network.C8735k;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.UpiIntentHelper;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.checkout.C9434a;
import com.etsy.android.p327ui.checkout.C9438c;
import com.etsy.android.p327ui.checkout.PayPalCheckoutViewModel;
import com.etsy.android.uikit.webview.C12023c;
import com.etsy.android.uikit.webview.C12026f;
import com.etsy.android.uikit.webview.C12028h;
import com.etsy.android.uikit.webview.EtsyChromeClient;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p346fa.C12703a;
import p425q9.C13265p;
import p456ua.C13461f;
import p514bk.C14088a;
import p568fn.C17782b;

/* renamed from: c9.v6 */
public final class C4744v6 implements C17550a {

    /* renamed from: b */
    public final C14088a f10711b;

    /* renamed from: c */
    public final C4579j1 f10712c;

    /* renamed from: d */
    public final C4690r4 f10713d;

    public C4744v6(C4579j1 j1Var, C4690r4 r4Var, C14088a aVar) {
        this.f10712c = j1Var;
        this.f10713d = r4Var;
        this.f10711b = aVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        EtsyWebFragment etsyWebFragment = (EtsyWebFragment) obj;
        etsyWebFragment.logcat = this.f10712c.f10212b0.get();
        etsyWebFragment.elkLogger = this.f10712c.f10131L0.get();
        etsyWebFragment.grafana = (C12703a) this.f10712c.f10308s0.get();
        etsyWebFragment.googlePayHelper = new C9303a(this.f10712c.f10085C.get(), this.f10712c.f10212b0.get(), this.f10712c.f10131L0.get(), (C12703a) this.f10712c.f10308s0.get(), (C8591a) this.f10712c.f10272l0.get());
        etsyWebFragment.cartBadgeCountRepo = this.f10712c.f10168S2.get();
        etsyWebFragment.schedulers = new C13461f();
        C8618c m = this.f10712c.mo14404m();
        C14088a aVar = this.f10711b;
        C8735k kVar = this.f10712c.f10228d4.get();
        aVar.getClass();
        C19383o.m32797g(kVar, "retrofit");
        Object b = kVar.f19181a.mo74387b(C12023c.class);
        C19383o.m32796f(b, "retrofit.cookieHarvester…rectEndpoint::class.java)");
        etsyWebFragment.redirectCookiesRepository = new C12026f((C13265p) this.f10712c.f10101F0.get(), m, (C12023c) b, this.f10712c.f10230e0.get());
        C4690r4 r4Var = this.f10713d;
        C17782b bVar = r4Var.f10575f;
        C8731g gVar = (C8731g) r4Var.f10577h.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar, "configuredRetrofit");
        Object b2 = gVar.f19177a.mo74387b(C6334a.class);
        C19383o.m32796f(b2, "configuredRetrofit.v3mos…koutEndpoint::class.java)");
        etsyWebFragment.checkoutRepository = new C6337d((C6334a) b2, new C13461f(), this.f10712c.f10212b0.get(), (C12703a) this.f10712c.f10308s0.get());
        etsyWebFragment.cartRefreshEventManager = this.f10712c.f10310s2.get();
        etsyWebFragment.config = (C8591a) this.f10712c.f10272l0.get();
        etsyWebFragment.upiIntentHelper = new UpiIntentHelper(this.f10712c.f10298q0.get(), this.f10712c.f10318u0.get());
        etsyWebFragment.crashUtil = this.f10712c.f10339y1.get();
        etsyWebFragment.oAuth2TokenStore = this.f10712c.f10230e0.get();
        etsyWebFragment.chromeClient = new EtsyChromeClient(this.f10712c.f10296p3.get());
        C4690r4 r4Var2 = this.f10713d;
        C14088a aVar2 = r4Var2.f10576g;
        C8731g gVar2 = (C8731g) r4Var2.f10577h.f10091D0.get();
        aVar2.getClass();
        C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
        Object b3 = gVar2.f19177a.mo74387b(C9438c.class);
        C19383o.m32796f(b3, "configuredV3MoshiRetrofi…rderEndpoint::class.java)");
        etsyWebFragment.payPalCheckoutViewModel = new PayPalCheckoutViewModel(new C9434a((C9438c) b3), new C19543e0());
        etsyWebFragment.webViewUtil = new C12028h(this.f10712c.mo14404m(), this.f10712c.f10298q0.get(), this.f10712c.f10323v0.get(), (C13265p) this.f10712c.f10101F0.get());
    }
}
