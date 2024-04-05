package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.user.C11520e;
import com.etsy.android.p327ui.user.C11524g;
import com.etsy.android.p327ui.user.C11525h;
import com.etsy.android.p327ui.user.C11590k;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p425q9.C13265p;
import p456ua.C13461f;
import p568fn.C17782b;

/* renamed from: c9.c6 */
public final class C4486c6 implements C17550a {

    /* renamed from: b */
    public final C19543e0 f9797b;

    /* renamed from: c */
    public final C4579j1 f9798c;

    public C4486c6(C4579j1 j1Var, C19543e0 e0Var) {
        this.f9798c = j1Var;
        this.f9797b = e0Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CurrencySelectFragment currencySelectFragment = (CurrencySelectFragment) obj;
        currencySelectFragment.session = (C13265p) this.f9798c.f10101F0.get();
        currencySelectFragment.selectableCurrencies = this.f9798c.f10210a4.get();
        currencySelectFragment.connectivity = this.f9798c.f10086C0.get();
        C19543e0 e0Var = this.f9797b;
        C8731g gVar = (C8731g) this.f9798c.f10091D0.get();
        e0Var.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C11525h.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…ctV3Endpoint::class.java)");
        currencySelectFragment.repository = new C11524g((C11525h) b, this.f9798c.f10298q0.get());
        C4579j1 j1Var = this.f9798c;
        C17782b bVar = j1Var.f10297q;
        C8731g gVar2 = (C8731g) j1Var.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar2, "retrofit");
        Object b2 = gVar2.f19177a.mo74387b(C11590k.class);
        C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…cyV3Endpoint::class.java)");
        currencySelectFragment.currencyRepository = new C11520e((C11590k) b2, this.f9798c.f10210a4.get(), this.f9798c.f10141N0.get());
        currencySelectFragment.schedulers = new C13461f();
        currencySelectFragment.userCurrency = this.f9798c.f10318u0.get();
        currencySelectFragment.appCurrency = this.f9798c.f10323v0.get();
        currencySelectFragment.appLocale = this.f9798c.f10298q0.get();
        currencySelectFragment.firebaseAnalyticsTracker = this.f9798c.f10088C2.get();
    }
}
