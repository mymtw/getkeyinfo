package p040c9;

import com.etsy.android.feedback.C6473r;
import com.etsy.android.feedback.FeedbackFragment;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.shop.C11129a1;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.p327ui.shop.C11199s;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.C11305w0;
import com.etsy.android.p327ui.shop.C11309y0;
import com.google.android.play.core.appupdate.C15562d;
import dagger.android.C17550a;
import java.text.NumberFormat;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p425q9.C13265p;
import p456ua.C13461f;
import p486y9.C13888d;

/* renamed from: c9.f7 */
public final class C4529f7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9978b;

    /* renamed from: c */
    public final C4690r4 f9979c;

    public C4529f7(C4579j1 j1Var, C4690r4 r4Var) {
        this.f9978b = j1Var;
        this.f9979c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        FeedbackFragment feedbackFragment = (FeedbackFragment) obj;
        feedbackFragment.listingRepository = C4579j1.m10256g(this.f9978b);
        C4579j1 j1Var = this.f9978b;
        C19421p pVar = j1Var.f10317u;
        C8731g gVar = (C8731g) j1Var.f10091D0.get();
        pVar.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C11305w0.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…InfoEndpoint::class.java)");
        feedbackFragment.shopInfoRepository = new C11309y0((C11305w0) b);
        C4579j1 j1Var2 = this.f9978b;
        C15562d dVar = j1Var2.f10322v;
        C8731g gVar2 = (C8731g) j1Var2.f10091D0.get();
        dVar.getClass();
        C19383o.m32797g(gVar2, "retrofit");
        Object b2 = gVar2.f19177a.mo74387b(C11129a1.class);
        C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…iewsEndpoint::class.java)");
        feedbackFragment.shopReviewsRepository = new C11132b1((C11129a1) b2);
        C4579j1 j1Var3 = this.f9978b;
        C19421p pVar2 = j1Var3.f10271l;
        C8731g gVar3 = (C8731g) j1Var3.f10091D0.get();
        pVar2.getClass();
        C19383o.m32797g(gVar3, "configuredV3MoshiRetrofit");
        Object b3 = gVar3.f19177a.mo74387b(C11199s.class);
        C19383o.m32796f(b3, "configuredV3MoshiRetrofi…tionEndpoint::class.java)");
        feedbackFragment.reviewsTranslationRepository = new C11201t((C11199s) b3);
        feedbackFragment.rxSchedulers = new C13461f();
        feedbackFragment.session = (C13265p) this.f9978b.f10101F0.get();
        feedbackFragment.translationHelper = C4579j1.m10254e(this.f9978b);
        feedbackFragment.currentLocale = this.f9978b.f10298q0.get();
        feedbackFragment.shopHomeEligibility = new C11139d0(C4690r4.m10336a(this.f9979c));
        C4579j1 j1Var4 = this.f9978b;
        C19388s sVar = j1Var4.f10307s;
        C13888d dVar2 = j1Var4.f10298q0.get();
        sVar.getClass();
        C19383o.m32797g(dVar2, "currentLocale");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(dVar2.mo46718b());
        C19383o.m32796f(numberInstance, "getNumberInstance(currentLocale.getAppLocale())");
        feedbackFragment.numberFormat = numberInstance;
        feedbackFragment.reviewsEligibility = new C6473r(C4690r4.m10336a(this.f9979c));
        feedbackFragment.resourceProvider = C4579j1.m10252c(this.f9978b);
    }
}
