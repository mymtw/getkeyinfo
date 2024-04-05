package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.oauth2.C8746b;
import com.etsy.android.lib.network.oauth2.signin.C8787o;
import com.etsy.android.lib.network.oauth2.signin.C8789p;
import com.etsy.android.lib.network.oauth2.signin.OAuth2SignInFragment;
import com.etsy.android.lib.network.oauth2.signin.OAuth2SignInViewModel;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.uikit.webview.C12028h;
import com.etsy.android.uikit.webview.EtsyChromeClient;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p425q9.C13265p;
import p456ua.C13462g;

/* renamed from: c9.z8 */
public final class C4798z8 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10793b;

    /* renamed from: c */
    public C8789p f10794c;

    public C4798z8(C4579j1 j1Var) {
        this.f10793b = j1Var;
        this.f10794c = new C8789p(C13462g.C13463a.f29482a, new C8746b(j1Var.f10230e0, j1Var.f10101F0, j1Var.f10338y0, j1Var.f10272l0, 0), C8787o.C8788a.f19338a, j1Var.f10276l4, 0);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        OAuth2SignInFragment oAuth2SignInFragment = (OAuth2SignInFragment) obj;
        oAuth2SignInFragment.chromeClient = new EtsyChromeClient(this.f10793b.f10296p3.get());
        oAuth2SignInFragment.webViewUtil = new C12028h(this.f10793b.mo14404m(), this.f10793b.f10298q0.get(), this.f10793b.f10323v0.get(), (C13265p) this.f10793b.f10101F0.get());
        C4579j1 j1Var = this.f10793b;
        oAuth2SignInFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, OAuth2SignInViewModel.class, this.f10794c));
    }
}
