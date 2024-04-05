package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.feedback.C6473r;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.shop.BaseShopHomePageRepository;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.p327ui.shop.C11169j;
import com.etsy.android.p327ui.shop.C11171k;
import com.etsy.android.p327ui.shop.C11175l;
import com.etsy.android.p327ui.shop.C11176l0;
import com.etsy.android.p327ui.shop.C11177m;
import com.etsy.android.p327ui.shop.C11179n;
import com.etsy.android.p327ui.shop.C11187p;
import com.etsy.android.p327ui.shop.C11191q;
import com.etsy.android.p327ui.shop.C11199s;
import com.etsy.android.p327ui.shop.C11200s0;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.shophome.C8989c;
import com.etsy.android.shophome.C8990d;
import com.etsy.android.shophome.C9004l;
import com.etsy.android.shophome.C9005m;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p336dc.C12646d;
import p357gf.C12796e;
import p425q9.C13265p;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: c9.bb */
public final class C4477bb implements C17550a {

    /* renamed from: b */
    public final C15588c1 f9781b;

    /* renamed from: c */
    public final C18263b f9782c;

    /* renamed from: d */
    public final C19388s f9783d;

    /* renamed from: e */
    public final C11200s0 f9784e;

    /* renamed from: f */
    public final C1993m f9785f;

    /* renamed from: g */
    public final C15562d f9786g;

    /* renamed from: h */
    public final C4579j1 f9787h;

    /* renamed from: i */
    public final C4690r4 f9788i;

    public C4477bb(C4579j1 j1Var, C4690r4 r4Var, C15588c1 c1Var, C18263b bVar, C19388s sVar, C11200s0 s0Var, C1993m mVar, C15562d dVar) {
        this.f9787h = j1Var;
        this.f9788i = r4Var;
        this.f9781b = c1Var;
        this.f9782c = bVar;
        this.f9783d = sVar;
        this.f9784e = s0Var;
        this.f9785f = mVar;
        this.f9786g = dVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ShopHomeFragment shopHomeFragment = (ShopHomeFragment) obj;
        shopHomeFragment.fileSupport = this.f9787h.f10291o3.get();
        shopHomeFragment.performanceTrackerAdapter = new C8704a(this.f9787h.mo14412u());
        shopHomeFragment.session = (C13265p) this.f9787h.f10101F0.get();
        C15588c1 c1Var = this.f9781b;
        C8731g gVar = (C8731g) this.f9787h.f10091D0.get();
        c1Var.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C11169j.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
        shopHomeFragment.baseShopHomePageRepository = new BaseShopHomePageRepository((C11169j) b, this.f9787h.f10146O0.get());
        C4579j1 j1Var = this.f9787h;
        C19421p pVar = j1Var.f10271l;
        C8731g gVar2 = (C8731g) j1Var.f10091D0.get();
        pVar.getClass();
        C19383o.m32797g(gVar2, "configuredV3MoshiRetrofit");
        Object b2 = gVar2.f19177a.mo74387b(C11199s.class);
        C19383o.m32796f(b2, "configuredV3MoshiRetrofi…tionEndpoint::class.java)");
        shopHomeFragment.reviewsTranslationRepository = new C11201t((C11199s) b2);
        C18263b bVar = this.f9782c;
        C8731g gVar3 = (C8731g) this.f9787h.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar3, "configuredV3MoshiRetrofit");
        Object b3 = gVar3.f19177a.mo74387b(C11171k.class);
        C19383o.m32796f(b3, "configuredV3MoshiRetrofi…tionEndpoint::class.java)");
        shopHomeFragment.faqsTranslationRepository = new C11175l((C11171k) b3);
        C19388s sVar = this.f9783d;
        C8731g gVar4 = (C8731g) this.f9787h.f10091D0.get();
        sVar.getClass();
        C19383o.m32797g(gVar4, "v3MoshiRetrofit");
        Object b4 = gVar4.f19177a.mo74387b(C11187p.class);
        C19383o.m32796f(b4, "v3MoshiRetrofit.v3moshiR…tionEndpoint::class.java)");
        shopHomeFragment.privacyPolicyTranslationRepository = new C11191q((C11187p) b4);
        shopHomeFragment.translationHelper = C4579j1.m10254e(this.f9787h);
        shopHomeFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f9787h));
        shopHomeFragment.currentLocale = this.f9787h.f10298q0.get();
        shopHomeFragment.rxSchedulers = new C13461f();
        shopHomeFragment.elkLogger = this.f9787h.f10131L0.get();
        shopHomeFragment.logCat = this.f9787h.f10212b0.get();
        shopHomeFragment.shopHomeEligibility = new C11139d0(C4690r4.m10336a(this.f9788i));
        shopHomeFragment.mUserActionBus = C4579j1.m10255f(this.f9787h);
        shopHomeFragment.qualtricsWrapper = this.f9787h.f10117I1.get();
        shopHomeFragment.currentLocale = this.f9787h.f10298q0.get();
        shopHomeFragment.shopHomePresenter = new C11176l0((C13265p) this.f9787h.f10101F0.get(), new C13461f(), this.f9787h.mo14405n());
        C11200s0 s0Var = this.f9784e;
        C8731g gVar5 = (C8731g) this.f9787h.f10091D0.get();
        s0Var.getClass();
        C19383o.m32797g(gVar5, "retrofit");
        Object b5 = gVar5.f19177a.mo74387b(C11177m.class);
        C19383o.m32796f(b5, "retrofit.v3moshiRetrofit…DataEndpoint::class.java)");
        shopHomeFragment.homePageMemberDataRepository = new C11179n((C11177m) b5, this.f9787h.f10146O0.get());
        C1993m mVar = this.f9785f;
        C8731g gVar6 = (C8731g) this.f9787h.f10091D0.get();
        mVar.getClass();
        C19383o.m32797g(gVar6, "v3MoshiRetrofit");
        Object b6 = gVar6.f19177a.mo74387b(C9004l.class);
        C19383o.m32796f(b6, "v3MoshiRetrofit.v3moshiR…tionEndpoint::class.java)");
        shopHomeFragment.shopVacationNotificationRepository = new C9005m((C9004l) b6, this.f9787h.f10146O0.get());
        C15562d dVar = this.f9786g;
        C8731g gVar7 = (C8731g) this.f9787h.f10091D0.get();
        dVar.getClass();
        C19383o.m32797g(gVar7, "v3MoshiRetrofit");
        Object b7 = gVar7.f19177a.mo74387b(C8989c.class);
        C19383o.m32796f(b7, "v3MoshiRetrofit.v3moshiR…DataEndpoint::class.java)");
        shopHomeFragment.listingMemberDataRepository = new C8990d((C8989c) b7);
        shopHomeFragment.rxSchedulers = new C13461f();
        shopHomeFragment.cartRefreshEventManager = this.f9787h.f10310s2.get();
        shopHomeFragment.cartCouponCache = this.f9787h.f10335x2.get();
        shopHomeFragment.session = (C13265p) this.f9787h.f10101F0.get();
        shopHomeFragment.optInEligibility = new C12646d(this.f9787h.f10314t1.get(), this.f9787h.f10139M3.get(), this.f9787h.f10114H3.get());
        shopHomeFragment.adImpressionRepository = this.f9787h.f10336x3.get();
        shopHomeFragment.reviewsEligibility = new C6473r(C4690r4.m10336a(this.f9788i));
    }
}
