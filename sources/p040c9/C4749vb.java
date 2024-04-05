package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.C8812v;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.add.C9791z;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.toplevelcategories.C10956b;
import com.etsy.android.p327ui.search.toplevelcategories.C10966f;
import com.etsy.android.p327ui.search.toplevelcategories.TopLevelCategoriesFragment;
import com.google.android.play.core.appupdate.C15562d;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.vb */
public final class C4749vb implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10722b;

    /* renamed from: c */
    public C8812v f10723c;

    public C4749vb(C4579j1 j1Var, C4690r4 r4Var, C15562d dVar) {
        this.f10722b = j1Var;
        this.f10723c = new C8812v(new C9791z(r4Var.f10560U1, j1Var.f10212b0, 3), C10956b.C10957a.f24305a, new C4535g(dVar, 1), 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        TopLevelCategoriesFragment topLevelCategoriesFragment = (TopLevelCategoriesFragment) obj;
        topLevelCategoriesFragment.logCat = this.f10722b.f10212b0.get();
        topLevelCategoriesFragment.schedulers = new C13461f();
        C4579j1 j1Var = this.f10722b;
        topLevelCategoriesFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C10966f.class, this.f10723c));
    }
}
