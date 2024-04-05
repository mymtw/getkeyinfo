package p040c9;

import com.etsy.android.demo.VespaArbitraryEndpointFragment;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.zb */
public final class C4801zb implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10799b;

    public C4801zb(C4579j1 j1Var) {
        this.f10799b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        VespaArbitraryEndpointFragment vespaArbitraryEndpointFragment = (VespaArbitraryEndpointFragment) obj;
        vespaArbitraryEndpointFragment.favoriteRepository = this.f10799b.mo14405n();
        vespaArbitraryEndpointFragment.rxSchedulers = new C13461f();
        vespaArbitraryEndpointFragment.adImpressionRepository = this.f10799b.f10336x3.get();
        vespaArbitraryEndpointFragment.deepLinkEligibility = this.f10799b.f10341y3.get();
        vespaArbitraryEndpointFragment.routeInspector = this.f10799b.mo14408q();
        vespaArbitraryEndpointFragment.deepLinkEntityChecker = this.f10799b.mo14400i();
        vespaArbitraryEndpointFragment.searchUriParser = C4579j1.m10250a(this.f10799b);
    }
}
