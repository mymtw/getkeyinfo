package p040c9;

import androidx.activity.C0114h;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.util.C8916o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.C9863o;
import com.etsy.android.p327ui.favorites.createalist.C9815g;
import com.etsy.android.p327ui.favorites.createalist.C9816h;
import com.etsy.android.p327ui.favorites.createalist.CreateAListFragment;
import com.etsy.android.p327ui.favorites.createalist.CreateAListPresenter;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;
import p456ua.C13462g;

/* renamed from: c9.y5 */
public final class C4782y5 implements C17550a {

    /* renamed from: b */
    public final CreateAListFragment f10769b;

    /* renamed from: c */
    public final C0114h f10770c;

    /* renamed from: d */
    public final C4579j1 f10771d;

    /* renamed from: e */
    public final C4690r4 f10772e;

    /* renamed from: f */
    public C4534fc f10773f;

    public C4782y5(C4579j1 j1Var, C4690r4 r4Var, C0114h hVar, CreateAListFragment createAListFragment) {
        this.f10771d = j1Var;
        this.f10772e = r4Var;
        this.f10769b = createAListFragment;
        this.f10770c = hVar;
        this.f10773f = new C4534fc(hVar, j1Var.f10124J3, C13462g.C13463a.f29482a, j1Var.f10101F0, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CreateAListFragment createAListFragment = this.f10769b;
        C0114h hVar = this.f10770c;
        C4579j1 j1Var = this.f10771d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C9815g.class, this.f10773f));
        CreateAListFragment createAListFragment2 = this.f10769b;
        hVar.getClass();
        C19383o.m32797g(createAListFragment2, "target");
        ((CreateAListFragment) obj).presenter = new CreateAListPresenter(createAListFragment, (C9815g) new C2870k0((C2880m0) createAListFragment2, (C2870k0.C2872b) oVar).mo10829a(C9815g.class), new C13461f(), new C9816h(new C9863o(C4690r4.m10336a(this.f10772e))), new C8916o(this.f10771d.f10085C.get()));
    }
}
