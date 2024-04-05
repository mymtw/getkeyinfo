package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.privacy.C11622b;
import com.etsy.android.p327ui.user.privacy.PrivacyFragment;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p410oa.C13146f;
import p456ua.C13462g;

/* renamed from: c9.h9 */
public final class C4559h9 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10035b;

    /* renamed from: c */
    public C13146f f10036c;

    public C4559h9(C4579j1 j1Var) {
        this.f10035b = j1Var;
        this.f10036c = new C13146f(j1Var.f10191X0, C13462g.C13463a.f29482a, j1Var.f10131L0, 3);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        PrivacyFragment privacyFragment = (PrivacyFragment) obj;
        C4579j1 j1Var = this.f10035b;
        privacyFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C11622b.class, this.f10036c));
        privacyFragment.analyticsTracker = this.f10035b.f10198Y2.get();
    }
}
