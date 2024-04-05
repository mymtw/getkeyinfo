package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.oauth2.C8763m;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.C9793c;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.shopresults.SearchResultsShopsFragment;
import com.etsy.android.p327ui.search.shopresults.SearchResultsShopsViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p001a0.C0005b;

/* renamed from: c9.ta */
public final class C4722ta implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10676b;

    /* renamed from: c */
    public C8763m f10677c;

    public C4722ta(C4579j1 j1Var, C0005b bVar) {
        this.f10676b = j1Var;
        this.f10677c = new C8763m(new C9793c(new C4698s(bVar, j1Var.f10091D0, 4), 3), j1Var.f10086C0, j1Var.f10308s0, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C4579j1 j1Var = this.f10676b;
        ((SearchResultsShopsFragment) obj).viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, SearchResultsShopsViewModel.class, this.f10677c));
    }
}
