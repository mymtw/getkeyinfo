package p040c9;

import com.etsy.android.lib.dagger.C8642b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.C8813w;
import com.etsy.android.lib.network.oauth2.C8746b;
import com.etsy.android.lib.network.oauth2.C8760j;
import com.etsy.android.lib.network.oauth2.C8768r;
import com.etsy.android.lib.network.oauth2.signin.C8776e;
import com.etsy.android.lib.network.oauth2.signin.C8781i;
import com.etsy.android.lib.network.oauth2.signin.C8784l;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.etsy.android.p327ui.user.auth.C11474b;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import dagger.internal.C17556e;
import p402n9.C13098r;
import p456ua.C13462g;
import p499zd.C13957e;
import p499zd.C13959f;
import p740eq.C19011a;

/* renamed from: c9.tb */
public final class C4723tb implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10678b;

    /* renamed from: c */
    public C13959f f10679c;

    public C4723tb(C4579j1 j1Var, C4547gb gbVar) {
        C4579j1 j1Var2 = j1Var;
        C4547gb gbVar2 = gbVar;
        this.f10678b = j1Var2;
        C8760j jVar = new C8760j(j1Var2.f10346z3, new C8642b(j1Var2.f10079A3, 3), j1Var2.f10084B3, 0);
        C19011a<C8813w> aVar = j1Var2.f10230e0;
        C17553b bVar = j1Var2.f10101F0;
        C4646o oVar = j1Var2.f10338y0;
        C8746b bVar2 = new C8746b(aVar, bVar, oVar, j1Var2.f10272l0, 0);
        C19011a<C8776e> aVar2 = gbVar2.f10016k;
        C19011a<C8784l> aVar3 = gbVar2.f10017l;
        C19011a<C8781i> aVar4 = gbVar2.f10013h;
        C13462g gVar = C13462g.C13463a.f29482a;
        C8768r rVar = new C8768r(aVar2, aVar3, aVar4, jVar, bVar2, 0);
        C17556e eVar = gbVar2.f10012g;
        C11474b bVar3 = new C11474b(eVar, eVar, oVar, j1Var2.f10236f0, j1Var2.f10099E3);
        C13098r rVar2 = new C13098r(j1Var2.f10104F3, j1Var2.f10308s0, j1Var2.f10122J1, bVar, gVar, 0);
        this.f10679c = new C13959f(rVar, j1Var2.f10094D3, bVar3, eVar, j1Var2.f10278m0, j1Var2.f10181V0, j1Var2.f10201Z0, rVar2, j1Var2.f10113H2);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ThirdPartySignInFragment thirdPartySignInFragment = (ThirdPartySignInFragment) obj;
        C4579j1 j1Var = this.f10678b;
        thirdPartySignInFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C13957e.class, this.f10679c));
        thirdPartySignInFragment.sharedPrefsProvider = this.f10678b.f10090D.get();
        thirdPartySignInFragment.configMap = this.f10678b.mo14404m();
    }
}
