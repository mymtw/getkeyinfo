package p040c9;

import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.lib.dagger.C8642b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.language.C11605g;
import com.etsy.android.p327ui.user.language.LanguageSelectFragment;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p402n9.C13098r;
import p456ua.C13461f;
import p456ua.C13462g;

/* renamed from: c9.x7 */
public final class C4771x7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10754b;

    /* renamed from: c */
    public C13098r f10755c;

    public C4771x7(C4579j1 j1Var) {
        this.f10754b = j1Var;
        this.f10755c = new C13098r(j1Var.f10102F1, new C8642b(new C6419c(j1Var.f10091D0, 13), 13), j1Var.f10298q0, C13462g.C13463a.f29482a, j1Var.f10088C2, 2);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        LanguageSelectFragment languageSelectFragment = (LanguageSelectFragment) obj;
        languageSelectFragment.rxSchedulers = new C13461f();
        C4579j1 j1Var = this.f10754b;
        languageSelectFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C11605g.class, this.f10755c));
    }
}
