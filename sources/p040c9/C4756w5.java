package p040c9;

import com.etsy.android.p327ui.favorites.C9863o;
import com.etsy.android.p327ui.favorites.createalist.C9816h;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerFragment;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerPresenter;
import dagger.android.C17550a;
import p425q9.C13265p;

/* renamed from: c9.w5 */
public final class C4756w5 implements C17550a {

    /* renamed from: b */
    public final CreateAListContainerFragment f10732b;

    /* renamed from: c */
    public final C4579j1 f10733c;

    /* renamed from: d */
    public final C4690r4 f10734d;

    public C4756w5(C4579j1 j1Var, C4690r4 r4Var, CreateAListContainerFragment createAListContainerFragment) {
        this.f10733c = j1Var;
        this.f10734d = r4Var;
        this.f10732b = createAListContainerFragment;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ((CreateAListContainerFragment) obj).presenter = new CreateAListContainerPresenter(this.f10732b, this.f10733c.f10198Y2.get(), new C9816h(new C9863o(C4690r4.m10336a(this.f10734d))), (C13265p) this.f10733c.f10101F0.get());
    }
}
