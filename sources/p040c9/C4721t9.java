package p040c9;

import com.etsy.android.lib.dagger.C8642b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.C8814x;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.network.oauth2.signin.C8785m;
import com.etsy.android.lib.user.C8862a;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterFragment;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterViewModel;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19388s;
import p488yb.C13899b;

/* renamed from: c9.t9 */
public final class C4721t9 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10674b;

    /* renamed from: c */
    public C8785m f10675c;

    public C4721t9(C4579j1 j1Var, C19388s sVar) {
        this.f10674b = j1Var;
        C8814x xVar = new C8814x(new C8862a(sVar, j1Var.f10091D0, 2), C13899b.C13900a.f30563a, 1);
        C8782j jVar = j1Var.f10172T1;
        this.f10675c = new C8785m(xVar, new C8642b(jVar, 4), jVar, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C4579j1 j1Var = this.f10674b;
        ((SaveForLaterFragment) obj).viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, SaveForLaterViewModel.class, this.f10675c));
    }
}
