package p040c9;

import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.core.C9615c;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.filters.C10767e;
import com.etsy.android.p327ui.search.filters.C10769f;
import com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import java.text.NumberFormat;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p425q9.C13253e;
import p456ua.C13461f;
import p486y9.C13888d;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: c9.ha */
public final class C4560ha implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10037b;

    /* renamed from: c */
    public final C4690r4 f10038c;

    /* renamed from: d */
    public C10769f f10039d;

    public C4560ha(C4579j1 j1Var, C4690r4 r4Var, C18263b bVar) {
        C4579j1 j1Var2 = j1Var;
        this.f10037b = j1Var2;
        this.f10038c = r4Var;
        C9615c cVar = new C9615c(j1Var2.f10085C, 7);
        C19011a<C13888d> aVar = j1Var2.f10298q0;
        this.f10039d = new C10769f(j1Var2.f10212b0, aVar, j1Var2.f10323v0, j1Var2.f10189W3, new C13253e(cVar, aVar, 3), j1Var2.f10172T1, j1Var2.f10308s0, j1Var2.f10278m0, new C13253e(new C8654m(bVar, j1Var2.f10091D0, 4), j1Var2.f10146O0, 4), j1Var2.f10194X3);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchFiltersV2Fragment searchFiltersV2Fragment = (SearchFiltersV2Fragment) obj;
        searchFiltersV2Fragment.logCat = this.f10037b.f10212b0.get();
        searchFiltersV2Fragment.schedulers = new C13461f();
        C4579j1 j1Var = this.f10037b;
        searchFiltersV2Fragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C10767e.class, this.f10039d));
        searchFiltersV2Fragment.currentLocale = this.f10037b.f10298q0.get();
        C4579j1 j1Var2 = this.f10037b;
        C19388s sVar = j1Var2.f10307s;
        C13888d dVar = j1Var2.f10298q0.get();
        sVar.getClass();
        C19383o.m32797g(dVar, "currentLocale");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(dVar.mo46718b());
        C19383o.m32796f(numberInstance, "getNumberInstance(currentLocale.getAppLocale())");
        searchFiltersV2Fragment.numberFormat = numberInstance;
        searchFiltersV2Fragment.searchFiltersEligibility = new C11010o(C4690r4.m10336a(this.f10038c));
    }
}
