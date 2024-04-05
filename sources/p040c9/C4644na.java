package p040c9;

import com.etsy.android.config.flags.p073ui.search.C6414f;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.add.C9791z;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.C10864g;
import com.etsy.android.p327ui.search.interstitial.C10883e;
import com.etsy.android.p327ui.search.interstitial.SearchInterstitialFragment;
import com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p346fa.C12703a;
import p456ua.C13461f;

/* renamed from: c9.na */
public final class C4644na implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10446b;

    /* renamed from: c */
    public C10883e f10447c;

    public C4644na(C4579j1 j1Var, C4690r4 r4Var) {
        this.f10446b = j1Var;
        C9791z zVar = new C9791z(r4Var.f10560U1, j1Var.f10212b0, 3);
        C10864g gVar = new C10864g(r4Var.f10562V1, j1Var.f10144N3, 0);
        C6419c cVar = new C6419c(r4Var.f10568Y1, 11);
        this.f10447c = new C10883e(zVar, gVar, j1Var.f10299q1, j1Var.f10149O3, j1Var.f10154P3, j1Var.f10308s0, j1Var.f10298q0, cVar, new C6414f(cVar, 7));
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchInterstitialFragment searchInterstitialFragment = (SearchInterstitialFragment) obj;
        searchInterstitialFragment.logCat = this.f10446b.f10212b0.get();
        C4579j1 j1Var = this.f10446b;
        searchInterstitialFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, SearchInterstitialViewModel.class, this.f10447c));
        searchInterstitialFragment.schedulers = new C13461f();
        searchInterstitialFragment.savedSearchViewDelegate = this.f10446b.mo14410s();
        searchInterstitialFragment.grafana = (C12703a) this.f10446b.f10308s0.get();
    }
}
