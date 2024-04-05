package p040c9;

import com.etsy.android.lib.network.oauth2.C8757g0;
import com.etsy.android.p327ui.user.circles.CirclesFragment;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import kotlinx.coroutines.C19543e0;
import p425q9.C13265p;
import p463v9.C13540c;

/* renamed from: c9.g5 */
public final class C4541g5 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10000b;

    /* renamed from: c */
    public C8757g0 f10001c;

    public C4541g5(C4579j1 j1Var, C19543e0 e0Var) {
        this.f10000b = j1Var;
        C4750w wVar = new C4750w(e0Var, j1Var.f10091D0, 5);
        C17553b bVar = j1Var.f10101F0;
        this.f10001c = new C8757g0(new C13540c(wVar, bVar, 2), bVar, 5);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CirclesFragment circlesFragment = (CirclesFragment) obj;
        circlesFragment.viewModelProvider = this.f10001c;
        circlesFragment.session = (C13265p) this.f10000b.f10101F0.get();
    }
}
