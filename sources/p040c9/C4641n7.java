package p040c9;

import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.config.flags.C6381j;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.help.C11530c;
import com.etsy.android.p327ui.user.help.HelpPhoneNumbersFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p277w8.C8275m;
import p334da.C12635e;

/* renamed from: c9.n7 */
public final class C4641n7 implements C17550a {

    /* renamed from: b */
    public final C15588c1 f10440b;

    /* renamed from: c */
    public final HelpPhoneNumbersFragment f10441c;

    /* renamed from: d */
    public final C4579j1 f10442d;

    /* renamed from: e */
    public C12635e f10443e;

    public C4641n7(C4579j1 j1Var, C15588c1 c1Var, HelpPhoneNumbersFragment helpPhoneNumbersFragment) {
        this.f10442d = j1Var;
        this.f10440b = c1Var;
        this.f10441c = helpPhoneNumbersFragment;
        this.f10443e = new C12635e(c1Var, new C6381j(new C8275m(c1Var, j1Var.f10091D0, 7), 8));
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C15588c1 c1Var = this.f10440b;
        C4579j1 j1Var = this.f10442d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C11530c.class, this.f10443e));
        HelpPhoneNumbersFragment helpPhoneNumbersFragment = this.f10441c;
        c1Var.getClass();
        C19383o.m32797g(helpPhoneNumbersFragment, "target");
        ((HelpPhoneNumbersFragment) obj).viewModel = (C11530c) new C2870k0((C2880m0) helpPhoneNumbersFragment, (C2870k0.C2872b) oVar).mo10829a(C11530c.class);
    }
}
