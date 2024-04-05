package p040c9;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.dagger.C8648g;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8705b;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.filters.refactor.C10837n;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersFragment;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRefactorViewModel;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import java.text.NumberFormat;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import p277w8.C8271i;
import p352ga.C12750a;
import p486y9.C13888d;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: c9.fa */
public final class C4532fa implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9984b;

    /* renamed from: c */
    public final C4690r4 f9985c;

    /* renamed from: d */
    public C10837n f9986d;

    public C4532fa(C4579j1 j1Var, C4690r4 r4Var, C19543e0 e0Var, C18263b bVar) {
        C4579j1 j1Var2 = j1Var;
        this.f9984b = j1Var2;
        this.f9985c = r4Var;
        C8648g gVar = new C8648g(e0Var, 1);
        C4493d dVar = new C4493d(new C8271i(bVar, j1Var2.f10091D0, 5), 9);
        C8705b bVar2 = new C8705b(j1Var2.f10278m0, 9);
        C8782j jVar = j1Var2.f10172T1;
        C19011a<C8630b> aVar = j1Var2.f10141N0;
        C19011a<C8629a> aVar2 = j1Var2.f10323v0;
        C19011a<C13888d> aVar3 = j1Var2.f10298q0;
        this.f9986d = new C10837n(jVar, gVar, dVar, j1Var2.f10308s0, aVar, aVar2, aVar3, bVar2, new C12750a(jVar, (C19011a) aVar, (C19011a) aVar2, (C19011a) aVar3, bVar2));
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchFiltersFragment searchFiltersFragment = (SearchFiltersFragment) obj;
        C4579j1 j1Var = this.f9984b;
        searchFiltersFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, SearchFiltersRefactorViewModel.class, this.f9986d));
        searchFiltersFragment.boeActivity = this.f9985c.f10573d;
        C4579j1 j1Var2 = this.f9984b;
        C19388s sVar = j1Var2.f10307s;
        C13888d dVar = j1Var2.f10298q0.get();
        sVar.getClass();
        C19383o.m32797g(dVar, "currentLocale");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(dVar.mo46718b());
        C19383o.m32796f(numberInstance, "getNumberInstance(currentLocale.getAppLocale())");
        searchFiltersFragment.numberFormat = numberInstance;
        searchFiltersFragment.searchFiltersEligibility = new C11010o(C4690r4.m10336a(this.f9985c));
    }
}
