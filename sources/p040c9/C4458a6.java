package p040c9;

import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.network.C8730f;
import com.etsy.android.p327ui.user.review.C11713l;
import com.etsy.android.p327ui.user.review.C11715n;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.p327ui.user.review.CreateReviewViewModel;
import com.google.android.gms.measurement.internal.C15099u;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p389lc.C13010a;
import p425q9.C13265p;
import p456ua.C13461f;
import p772tq.C20203a;

/* renamed from: c9.a6 */
public final class C4458a6 implements C17550a {

    /* renamed from: b */
    public final C15099u f9751b;

    /* renamed from: c */
    public final C20203a f9752c;

    /* renamed from: d */
    public final CreateReviewActivity f9753d;

    /* renamed from: e */
    public final C4579j1 f9754e;

    public C4458a6(C4579j1 j1Var, C20203a aVar, C15099u uVar, CreateReviewActivity createReviewActivity) {
        this.f9754e = j1Var;
        this.f9751b = uVar;
        this.f9752c = aVar;
        this.f9753d = createReviewActivity;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        CreateReviewActivity createReviewActivity = (CreateReviewActivity) obj;
        createReviewActivity.dispatchingAndroidInjector = this.f9754e.mo14402k();
        C15099u uVar = this.f9751b;
        C20203a aVar = this.f9752c;
        CreateReviewActivity createReviewActivity2 = this.f9753d;
        aVar.getClass();
        C19383o.m32797g(createReviewActivity2, "activity");
        createReviewActivity.mAnalyticsTracker = C8654m.m17038a(uVar, createReviewActivity2);
        createReviewActivity.performanceTracker = this.f9754e.mo14412u();
        createReviewActivity.darkModeController = new C13010a(this.f9754e.f10090D.get());
        createReviewActivity.darkModeTracker = C4579j1.m10251b(this.f9754e);
        createReviewActivity.configMap = this.f9754e.mo14404m();
        C20203a aVar2 = this.f9752c;
        C8730f fVar = this.f9754e.f10109G3.get();
        aVar2.getClass();
        C19383o.m32797g(fVar, "v3MoshiRetrofit");
        Object b = fVar.f19176a.mo74387b(C11713l.class);
        C19383o.m32796f(b, "v3MoshiRetrofit.v3MoshiM…viewEndpoint::class.java)");
        C11715n nVar = new C11715n((C11713l) b, this.f9754e.f10146O0.get());
        C13461f fVar2 = new C13461f();
        C15099u uVar2 = this.f9751b;
        C20203a aVar3 = this.f9752c;
        CreateReviewActivity createReviewActivity3 = this.f9753d;
        aVar3.getClass();
        C19383o.m32797g(createReviewActivity3, "activity");
        createReviewActivity.viewModel = new CreateReviewViewModel(nVar, fVar2, C8654m.m17038a(uVar2, createReviewActivity3), (C13265p) this.f9754e.f10101F0.get(), C4579j1.m10252c(this.f9754e), this.f9754e.f10090D.get());
        createReviewActivity.resourceProvider = C4579j1.m10252c(this.f9754e);
        createReviewActivity.sharedPreferenceProvider = this.f9754e.f10090D.get();
        createReviewActivity.fileSupport = this.f9754e.f10291o3.get();
        createReviewActivity.grafana = (C12703a) this.f9754e.f10308s0.get();
    }
}
