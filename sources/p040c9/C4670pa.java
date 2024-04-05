package p040c9;

import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.add.C9791z;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.redirect.C10933e;
import com.etsy.android.p327ui.search.redirect.SearchRedirectFragment;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.reflect.C19421p;

/* renamed from: c9.pa */
public final class C4670pa implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10491b;

    /* renamed from: c */
    public C6419c f10492c;

    public C4670pa(C4579j1 j1Var, C19421p pVar) {
        this.f10491b = j1Var;
        this.f10492c = new C6419c(new C9791z(new C4737v(pVar, j1Var.f10091D0, 1), j1Var.f10146O0, 4), 12);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C4579j1 j1Var = this.f10491b;
        ((SearchRedirectFragment) obj).viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C10933e.class, this.f10492c));
    }
}
