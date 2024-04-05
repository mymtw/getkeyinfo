package p040c9;

import com.etsy.android.lib.dagger.C8642b;
import com.etsy.android.lib.dagger.C8655n;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.favorites.add.C9791z;
import com.etsy.android.p327ui.home.editorspicks.C9924a;
import com.etsy.android.p327ui.home.editorspicks.C9940h;
import com.etsy.android.p327ui.home.editorspicks.EditorPicksRepository;
import com.etsy.android.p327ui.home.editorspicks.EditorsPicksFragment;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p357gf.C12796e;
import p425q9.C13265p;
import p456ua.C13461f;
import p514bk.C14088a;

/* renamed from: c9.k6 */
public final class C4598k6 implements C17550a {

    /* renamed from: b */
    public final C14088a f10385b;

    /* renamed from: c */
    public final C4579j1 f10386c;

    /* renamed from: d */
    public C9791z f10387d;

    public C4598k6(C4579j1 j1Var, C14088a aVar) {
        this.f10386c = j1Var;
        this.f10385b = aVar;
        this.f10387d = new C9791z(new C8642b(new C8655n(aVar, j1Var.f10091D0, 1), 5), j1Var.f10308s0, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        EditorsPicksFragment editorsPicksFragment = (EditorsPicksFragment) obj;
        C14088a aVar = this.f10385b;
        C8731g gVar = (C8731g) this.f10386c.f10091D0.get();
        aVar.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C9924a.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…icksEndpoint::class.java)");
        editorsPicksFragment.editorPicksRepository = new EditorPicksRepository((C9924a) b);
        editorsPicksFragment.favoriteRepository = this.f10386c.mo14405n();
        editorsPicksFragment.rxSchedulers = new C13461f();
        editorsPicksFragment.session = (C13265p) this.f10386c.f10101F0.get();
        C4579j1 j1Var = this.f10386c;
        editorsPicksFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C9940h.class, this.f10387d));
        editorsPicksFragment.etsyConfigMap = this.f10386c.mo14404m();
        editorsPicksFragment.grafana = (C12703a) this.f10386c.f10308s0.get();
        editorsPicksFragment.adImpressionRepository = this.f10386c.f10336x3.get();
        editorsPicksFragment.deepLinkEligibility = this.f10386c.f10341y3.get();
        editorsPicksFragment.routeInspector = this.f10386c.mo14408q();
        editorsPicksFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f10386c));
    }
}
