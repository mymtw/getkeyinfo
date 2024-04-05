package p040c9;

import com.etsy.android.p327ui.discover.DiscoverFragment;
import dagger.android.C17550a;
import p346fa.C12703a;
import p456ua.C13461f;

/* renamed from: c9.g6 */
public final class C4542g6 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10002b;

    public C4542g6(C4579j1 j1Var) {
        this.f10002b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        DiscoverFragment discoverFragment = (DiscoverFragment) obj;
        discoverFragment.adImpressionRepository = this.f10002b.f10336x3.get();
        discoverFragment.deepLinkEligibility = this.f10002b.f10341y3.get();
        discoverFragment.routeInspector = this.f10002b.mo14408q();
        discoverFragment.deepLinkEntityChecker = this.f10002b.mo14400i();
        discoverFragment.searchUriParser = C4579j1.m10250a(this.f10002b);
        discoverFragment.grafana = (C12703a) this.f10002b.f10308s0.get();
        discoverFragment.favoriteRepository = this.f10002b.mo14405n();
        discoverFragment.rxSchedulers = new C13461f();
    }
}
