package p040c9;

import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.add.C9753b0;
import com.etsy.android.p327ui.favorites.add.NameAListFragment;
import com.etsy.android.p327ui.favorites.add.NameAListPresenter;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.qualtrics.C8964g;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;

/* renamed from: c9.r8 */
public final class C4694r8 implements C17550a {

    /* renamed from: b */
    public final NameAListFragment f10617b;

    /* renamed from: c */
    public final C19382n f10618c;

    /* renamed from: d */
    public final C4579j1 f10619d;

    /* renamed from: e */
    public C8964g f10620e;

    public C4694r8(C4579j1 j1Var, C19382n nVar, NameAListFragment nameAListFragment) {
        this.f10619d = j1Var;
        this.f10617b = nameAListFragment;
        this.f10618c = nVar;
        this.f10620e = new C8964g(nVar, j1Var.f10129K3, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        NameAListFragment nameAListFragment = (NameAListFragment) obj;
        NameAListFragment nameAListFragment2 = this.f10617b;
        C19382n nVar = this.f10618c;
        C4579j1 j1Var = this.f10619d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C9753b0.class, this.f10620e));
        NameAListFragment nameAListFragment3 = this.f10617b;
        nVar.getClass();
        C19383o.m32797g(nameAListFragment3, "target");
        nameAListFragment.presenter = new NameAListPresenter(nameAListFragment2, (C9753b0) new C2870k0((C2880m0) nameAListFragment3, (C2870k0.C2872b) oVar).mo10829a(C9753b0.class), new C13461f(), this.f10619d.f10198Y2.get());
        nameAListFragment.rxSchedulers = new C13461f();
        nameAListFragment.preferencesProvider = this.f10619d.f10090D.get();
    }
}
