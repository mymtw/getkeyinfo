package p040c9;

import com.etsy.android.config.flags.C6381j;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.addresses.AddressDetailFragment;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11409f;
import com.etsy.android.p327ui.user.addresses.C11460w;
import com.etsy.android.p327ui.user.addresses.C11461x;
import com.etsy.android.p327ui.util.countries.C11775a;
import com.etsy.android.p327ui.util.countries.CountrySelectorViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import p334da.C12631b;
import p456ua.C13461f;
import p456ua.C13462g;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: c9.h0 */
public final class C4550h0 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10022b;

    /* renamed from: c */
    public C11461x f10023c;

    /* renamed from: d */
    public C12631b f10024d;

    /* renamed from: e */
    public C11775a f10025e;

    public C4550h0(C4579j1 j1Var) {
        this.f10022b = j1Var;
        C4493d dVar = new C4493d(new C6381j(j1Var.f10091D0, 6), 10);
        C19011a<C13888d> aVar = j1Var.f10298q0;
        C17553b bVar = j1Var.f10308s0;
        this.f10023c = new C11461x(dVar, aVar, bVar);
        this.f10024d = new C12631b(C13462g.C13463a.f29482a, dVar, bVar, 1);
        this.f10025e = new C11775a(j1Var.f10103F2, j1Var.f10212b0, bVar, j1Var.f10278m0, aVar);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        AddressDetailFragment addressDetailFragment = (AddressDetailFragment) obj;
        addressDetailFragment.viewModelFactory = new C8656o(ImmutableMap.builderWithExpectedSize(6).mo56613b(HomePagerViewModel.class, this.f10022b.f10158Q2).mo56613b(C9974e.class, this.f10022b.f10163R2).mo56613b(C10677n.class, this.f10022b.f10269k3).mo56613b(C11460w.class, this.f10023c).mo56613b(AddressDetailViewModel.class, this.f10024d).mo56613b(CountrySelectorViewModel.class, this.f10025e).mo56612a());
        addressDetailFragment.schedulers = new C13461f();
        addressDetailFragment.presenter = new C11409f(new C13461f());
    }
}
