package com.etsy.android.p327ui;

import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip;
import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.lib.useraction.C8868c;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.core.C9700n;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.navigation.bottom.C10682d;
import com.etsy.android.p327ui.navigation.bottom.C10690g;
import com.etsy.android.p327ui.navigation.bottom.C10691h;
import com.etsy.android.p327ui.user.C11684r;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.shophome.C8998i;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8061n;
import p248tp.C8071s;
import p277w8.C8266d;
import p395ma.C13033c;
import p409o9.C13138q;
import p425q9.C13261l;
import p425q9.C13265p;
import p448ta.C13387c;
import p456ua.C13461f;
import p475we.C13827c;
import p475we.C13828d;
import p475we.C13831g;
import p475we.C13832h;
import p491ye.C13919c;
import p491ye.C13920d;
import p491ye.C13921e;
import p568fn.C17782b;
import p591im.C17868b;
import p689ul.C18617o;

/* renamed from: com.etsy.android.ui.n */
public final class C10677n extends C2866i0 {

    /* renamed from: b */
    public final C13265p f23512b;

    /* renamed from: c */
    public final CartBadgeCountRepo f23513c;

    /* renamed from: d */
    public final BottomNavStateRepo f23514d;

    /* renamed from: e */
    public final C13461f f23515e;

    /* renamed from: f */
    public final C13827c f23516f;

    /* renamed from: g */
    public final C13919c f23517g;

    /* renamed from: h */
    public final C13920d f23518h;

    /* renamed from: i */
    public final C13921e f23519i;

    /* renamed from: j */
    public final C11684r f23520j;

    /* renamed from: k */
    public final C9700n f23521k;

    /* renamed from: l */
    public final PersistViewedBus f23522l;

    /* renamed from: m */
    public final C2895z<C10690g> f23523m;

    /* renamed from: n */
    public final C2895z f23524n;

    /* renamed from: o */
    public final C2895z<C10682d> f23525o;

    /* renamed from: p */
    public final C2895z<C10682d> f23526p;

    /* renamed from: q */
    public final C2895z<Boolean> f23527q;

    /* renamed from: r */
    public final C2895z<Boolean> f23528r;

    /* renamed from: s */
    public final PublishSubject<IANTooltip> f23529s = new PublishSubject<>();

    /* renamed from: t */
    public final C7091a f23530t;

    /* renamed from: u */
    public final PublishSubject<C9905g0> f23531u;

    /* renamed from: v */
    public C13832h f23532v;

    /* renamed from: w */
    public final C10081l f23533w;

    public C10677n(C13265p pVar, C13138q qVar, CartBadgeCountRepo cartBadgeCountRepo, BottomNavStateRepo bottomNavStateRepo, C13461f fVar, C13831g gVar, C13827c cVar, UserBadgeCountManager userBadgeCountManager, C13919c cVar2, C13920d dVar, C13921e eVar, C11684r rVar, C9700n nVar, PersistViewedBus persistViewedBus) {
        C19179q qVar2;
        C8071s sVar;
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(cartBadgeCountRepo, "cartBadgeCountRepo");
        C19383o.m32797g(bottomNavStateRepo, "bottomNavStateRepo");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(gVar, "upgradePromptRepository");
        C19383o.m32797g(cVar, "upgradePromptMetrics");
        C19383o.m32797g(userBadgeCountManager, "userBadgeCountManager");
        C19383o.m32797g(cVar2, "tooltipEligibility");
        C19383o.m32797g(dVar, "tooltipFinder");
        C19383o.m32797g(eVar, "tooltipPrefs");
        C19383o.m32797g(rVar, "menuTooltipRepo");
        C19383o.m32797g(nVar, "swankyDispatcher");
        C19383o.m32797g(persistViewedBus, "persistViewedBus");
        this.f23512b = pVar;
        this.f23513c = cartBadgeCountRepo;
        this.f23514d = bottomNavStateRepo;
        this.f23515e = fVar;
        this.f23516f = cVar;
        this.f23517g = cVar2;
        this.f23518h = dVar;
        this.f23519i = eVar;
        this.f23520j = rVar;
        this.f23521k = nVar;
        this.f23522l = persistViewedBus;
        C2895z<C10690g> zVar = new C2895z<>();
        this.f23523m = zVar;
        this.f23524n = zVar;
        C2895z<C10682d> zVar2 = new C2895z<>();
        this.f23525o = zVar2;
        this.f23526p = zVar2;
        C2895z<Boolean> zVar3 = new C2895z<>();
        this.f23527q = zVar3;
        this.f23528r = zVar3;
        C7091a aVar = new C7091a();
        this.f23530t = aVar;
        this.f23531u = new PublishSubject<>();
        C10081l lVar = new C10081l(this);
        this.f23533w = lVar;
        bottomNavStateRepo.mo34417d();
        C19254a<C10690g> aVar2 = bottomNavStateRepo.f23544k;
        aVar.mo19403b(C0472h.m1241b(aVar2, aVar2).mo20635e(C13461f.m21236c()).mo20637g(new C10673m(this, 0)));
        bottomNavStateRepo.f23541h.mo19405d();
        bottomNavStateRepo.f23541h = new C7091a();
        bottomNavStateRepo.mo34417d();
        if (bottomNavStateRepo.f23539f.mo37551a()) {
            C19254a<Integer> aVar3 = bottomNavStateRepo.f23535b.f25042f;
            qVar2 = new C19179q(C0472h.m1241b(aVar3, aVar3), new C13033c(bottomNavStateRepo, 2));
        } else {
            C19254a<Integer> aVar4 = bottomNavStateRepo.f23535b.f25042f;
            qVar2 = new C19179q(C0472h.m1241b(aVar4, aVar4), new C13261l(bottomNavStateRepo, 5));
        }
        bottomNavStateRepo.f23537d.mo30553a();
        C19254a<Integer> aVar5 = bottomNavStateRepo.f23535b.f25043g;
        C19254a<Integer> aVar6 = bottomNavStateRepo.f23535b.f25041e;
        C19254a<Integer> aVar7 = bottomNavStateRepo.f23535b.f25042f;
        C8061n[] nVarArr = {C0472h.m1241b(aVar5, aVar5), C0472h.m1241b(aVar6, aVar6), C0472h.m1241b(aVar7, aVar7)};
        C19254a<Integer> aVar8 = bottomNavStateRepo.f23536c.f20399e;
        C8868c cVar3 = new C8868c(2);
        aVar8.getClass();
        C19179q qVar3 = new C19179q(C8061n.m16233a(C17782b.m29865e0(new C19179q(C8061n.m16233a(C17782b.m29865e0(nVarArr), new C10691h(bottomNavStateRepo)), new C17868b(2)), qVar2, new C19179q(aVar8, cVar3)), new C17782b()), new C8998i(bottomNavStateRepo, 3));
        Functions.C12959d dVar2 = Functions.f28540d;
        Disposable f = qVar3.mo20636f(dVar2, Functions.f28541e, Functions.f28539c, dVar2);
        C7091a aVar9 = bottomNavStateRepo.f23541h;
        C19383o.m32798h(aVar9, "compositeDisposable");
        aVar9.mo19403b(f);
        C19254a<C10682d> aVar10 = bottomNavStateRepo.f23545l;
        aVar.mo19403b(C0472h.m1241b(aVar10, aVar10).mo20639i(C13461f.m21235b()).mo20635e(C13461f.m21236c()).mo20637g(new C13387c(this, 1)));
        pVar.f29143i.add(lVar);
        if (!cartBadgeCountRepo.f20398d) {
            cartBadgeCountRepo.mo31436a();
        }
        if (!gVar.f30448c.f30438a.mo21132b(C8592b.f18799i1)) {
            sVar = C8071s.m16251e(C13832h.C13834b.f30451a);
        } else {
            C18617o e = gVar.f30446a.mo55338e();
            C19383o.m32796f(e, "appUpdateManager.appUpdateInfo");
            sVar = new SingleCreate(new C13828d(e, gVar));
        }
        SubscribersKt.m32500e(sVar.mo20657f(C13461f.m21236c()), BOEViewModel$checkUpgradePrompt$1.INSTANCE, new BOEViewModel$checkUpgradePrompt$2(this));
        aVar.mo19403b(userBadgeCountManager.f25040d.mo20639i(C13461f.m21235b()).mo20635e(C13461f.m21236c()).mo20637g(new C8266d(this, 3)));
    }

    public final void onCleared() {
        this.f23530t.mo19405d();
        C13265p pVar = this.f23512b;
        pVar.f29143i.remove(this.f23533w);
    }
}
