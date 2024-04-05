package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.C9863o;
import com.etsy.android.p327ui.favorites.createalist.C9816h;
import com.etsy.android.p327ui.favorites.createalist.C9831q;
import com.etsy.android.p327ui.favorites.createalist.NameAListFragment;
import com.etsy.android.p327ui.favorites.createalist.NameAListPresenter;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.qualtrics.C8964g;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;

/* renamed from: c9.t8 */
public final class C4720t8 implements C17550a {

    /* renamed from: b */
    public final NameAListFragment f10669b;

    /* renamed from: c */
    public final C1993m f10670c;

    /* renamed from: d */
    public final C4579j1 f10671d;

    /* renamed from: e */
    public final C4690r4 f10672e;

    /* renamed from: f */
    public C8964g f10673f;

    public C4720t8(C4579j1 j1Var, C4690r4 r4Var, C1993m mVar, NameAListFragment nameAListFragment) {
        this.f10671d = j1Var;
        this.f10672e = r4Var;
        this.f10669b = nameAListFragment;
        this.f10670c = mVar;
        this.f10673f = new C8964g(mVar, j1Var.f10129K3, 2);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        NameAListFragment nameAListFragment = (NameAListFragment) obj;
        NameAListFragment nameAListFragment2 = this.f10669b;
        C1993m mVar = this.f10670c;
        C4579j1 j1Var = this.f10671d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C9831q.class, this.f10673f));
        NameAListFragment nameAListFragment3 = this.f10669b;
        mVar.getClass();
        C19383o.m32797g(nameAListFragment3, "target");
        nameAListFragment.presenter = new NameAListPresenter(nameAListFragment2, (C9831q) new C2870k0((C2880m0) nameAListFragment3, (C2870k0.C2872b) oVar).mo10829a(C9831q.class), new C13461f(), new C9816h(new C9863o(C4690r4.m10336a(this.f10672e))), this.f10671d.f10198Y2.get());
        nameAListFragment.rxSchedulers = new C13461f();
    }
}
