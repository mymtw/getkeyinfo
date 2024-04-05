package p040c9;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.C11358a;
import com.etsy.android.p327ui.user.C11488b;
import com.etsy.android.p327ui.user.purchases.C11672r;
import com.etsy.android.p327ui.user.purchases.C11679u;
import com.etsy.android.p327ui.user.purchases.PurchasesFragment;
import com.etsy.android.p327ui.user.purchases.module.C11663d;
import com.etsy.android.util.C12043f;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p143i9.C7007f;
import p277w8.C8271i;
import p338df.C12650a;
import p338df.C12653d;
import p409o9.C13138q;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.j9 */
public final class C4587j9 implements C17550a {

    /* renamed from: b */
    public final C0761x f10354b;

    /* renamed from: c */
    public final PurchasesFragment f10355c;

    /* renamed from: d */
    public final C1993m f10356d;

    /* renamed from: e */
    public final C4579j1 f10357e;

    /* renamed from: f */
    public final C4690r4 f10358f;

    /* renamed from: g */
    public C4591k f10359g;

    public C4587j9(C4579j1 j1Var, C4690r4 r4Var, C0761x xVar, C1993m mVar, PurchasesFragment purchasesFragment) {
        this.f10357e = j1Var;
        this.f10358f = r4Var;
        this.f10354b = xVar;
        this.f10355c = purchasesFragment;
        this.f10356d = mVar;
        this.f10359g = new C4591k(xVar, j1Var.f10216b4, 3);
    }

    /* renamed from: a */
    public final C11679u mo14413a() {
        C0761x xVar = this.f10354b;
        C4579j1 j1Var = this.f10357e;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C11679u.class, this.f10359g));
        PurchasesFragment purchasesFragment = this.f10355c;
        xVar.getClass();
        C19383o.m32797g(purchasesFragment, "target");
        return (C11679u) new C2870k0((C2880m0) purchasesFragment, (C2870k0.C2872b) oVar).mo10829a(C11679u.class);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        C0761x xVar = this.f10354b;
        PurchasesFragment purchasesFragment = this.f10355c;
        xVar.getClass();
        C19383o.m32797g(purchasesFragment, "purchasesFragment");
        C11358a a = C8271i.m16554a(this.f10356d, (C8731g) this.f10357e.f10091D0.get());
        C4579j1 j1Var = this.f10357e;
        C0761x xVar2 = j1Var.f10217c;
        C12043f fVar = j1Var.f10107G1.get();
        xVar2.getClass();
        C19383o.m32797g(fVar, "appsFlyer");
        C13138q qVar = this.f10357e.f10260j0.get();
        C11663d dVar = new C11663d(this.f10357e.f10198Y2.get(), new C12653d(this.f10358f.mo14417c(), new C12650a(this.f10358f.mo14417c())));
        C11672r rVar = r2;
        C11672r rVar2 = new C11672r(purchasesFragment, mo14413a(), new C13461f(), this.f10357e.f10141N0.get(), this.f10357e.f10117I1.get(), this.f10357e.f10298q0.get(), this.f10358f.mo14417c(), (C13265p) this.f10357e.f10101F0.get(), qVar, new C11488b((C13265p) this.f10357e.f10101F0.get(), a, fVar, C4579j1.m10252c(this.f10357e), this.f10357e.f10310s2.get()), this.f10357e.f10168S2.get(), new C7007f(this.f10357e.f10248h0.get(), C4690r4.m10336a(this.f10358f), this.f10357e.f10090D.get()), dVar);
        PurchasesFragment purchasesFragment2 = (PurchasesFragment) obj;
        purchasesFragment2.presenter = rVar;
        purchasesFragment2.rxSchedulers = new C13461f();
        purchasesFragment2.etsyMoneyFactory = this.f10357e.f10141N0.get();
        purchasesFragment2.session = (C13265p) this.f10357e.f10101F0.get();
        purchasesFragment2.viewModel = mo14413a();
    }
}
