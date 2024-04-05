package com.etsy.android.p327ui.home.tabs;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.marketing.sweepstakes.SweepstakesBanner;
import com.etsy.android.p327ui.home.etsylens.C9973d;
import com.etsy.android.p327ui.home.tabs.C10065l;
import com.etsy.android.p327ui.home.tabs.C10070p;
import com.etsy.android.p327ui.homescreen.purchaseclaim.PurchaseClaimBody;
import com.etsy.android.p327ui.homescreen.purchaseclaim.PurchaseClaimSpec;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.util.C12059p;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p321cc.C8567a;
import p321cc.C8568b;
import p335db.C12642b;
import p346fa.C12703a;
import p425q9.C13265p;
import p428qc.C13294e;
import p456ua.C13461f;
import p458uc.C13468c;
import p458uc.C13472e;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerViewModel */
public final class HomePagerViewModel extends C2866i0 {

    /* renamed from: A */
    public boolean f22115A;

    /* renamed from: b */
    public final C13461f f22116b;

    /* renamed from: c */
    public final C10060j f22117c;

    /* renamed from: d */
    public final C10053c f22118d;

    /* renamed from: e */
    public final C12703a f22119e;

    /* renamed from: f */
    public final C13294e f22120f;

    /* renamed from: g */
    public final UserActionBus f22121g;

    /* renamed from: h */
    public final C13265p f22122h;

    /* renamed from: i */
    public final C12642b f22123i;

    /* renamed from: j */
    public final C13468c f22124j;

    /* renamed from: k */
    public final CrashUtil f22125k;

    /* renamed from: l */
    public final C8618c f22126l;

    /* renamed from: m */
    public final C9973d f22127m;

    /* renamed from: n */
    public final C2895z<C10070p> f22128n;

    /* renamed from: o */
    public final C2895z f22129o;

    /* renamed from: p */
    public final C2895z<C10067m> f22130p;

    /* renamed from: q */
    public final C2895z f22131q;

    /* renamed from: r */
    public final C2895z<C12059p<SweepstakesBanner>> f22132r;

    /* renamed from: s */
    public final C2895z f22133s;

    /* renamed from: t */
    public final C2895z<C12059p<C13472e>> f22134t;

    /* renamed from: u */
    public final C2895z f22135u;

    /* renamed from: v */
    public final C2895z<C12059p<C19394m>> f22136v;

    /* renamed from: w */
    public final C2895z f22137w;

    /* renamed from: x */
    public boolean f22138x;

    /* renamed from: y */
    public boolean f22139y = true;

    /* renamed from: z */
    public final C7091a f22140z = new C7091a();

    public HomePagerViewModel(C13461f fVar, C10060j jVar, C10053c cVar, C12703a aVar, C13294e eVar, UserActionBus userActionBus, C13265p pVar, C12642b bVar, C13468c cVar2, CrashUtil crashUtil, C8618c cVar3, C9973d dVar) {
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(jVar, "repository");
        C19383o.m32797g(cVar, "eligibility");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(eVar, "eventManager");
        C19383o.m32797g(userActionBus, "userActionBus");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(bVar, "sweepstakesRepository");
        C19383o.m32797g(cVar2, "purchaseClaimRepository");
        C19383o.m32797g(crashUtil, "crashUtil");
        C19383o.m32797g(cVar3, "configMap");
        C19383o.m32797g(dVar, "etsyLensRepository");
        this.f22116b = fVar;
        this.f22117c = jVar;
        this.f22118d = cVar;
        this.f22119e = aVar;
        this.f22120f = eVar;
        this.f22121g = userActionBus;
        this.f22122h = pVar;
        this.f22123i = bVar;
        this.f22124j = cVar2;
        this.f22125k = crashUtil;
        this.f22126l = cVar3;
        this.f22127m = dVar;
        C2895z<C10070p> zVar = new C2895z<>();
        this.f22128n = zVar;
        this.f22129o = zVar;
        C2895z<C10067m> zVar2 = new C2895z<>(new C10067m(EmptyList.INSTANCE));
        this.f22130p = zVar2;
        this.f22131q = zVar2;
        C2895z<C12059p<SweepstakesBanner>> zVar3 = new C2895z<>();
        this.f22132r = zVar3;
        this.f22133s = zVar3;
        C2895z<C12059p<C13472e>> zVar4 = new C2895z<>();
        this.f22134t = zVar4;
        this.f22135u = zVar4;
        C2895z<C12059p<C19394m>> zVar5 = new C2895z<>();
        this.f22136v = zVar5;
        this.f22137w = zVar5;
    }

    /* renamed from: b */
    public static final C13472e m18208b(HomePagerViewModel homePagerViewModel, boolean z) {
        homePagerViewModel.getClass();
        return z ? new C13472e(CollageAlert.AlertType.SUCCESS, R.string.purchase_claimed, R.drawable.clg_icon_core_purchaseprotection_v1) : new C13472e(CollageAlert.AlertType.ERROR, R.string.purchase_claim_error, R.drawable.clg_icon_core_exclamation_v1);
    }

    /* renamed from: c */
    public static void m18209c(C2895z zVar, C10065l.C10066a aVar) {
        C10067m mVar = (C10067m) zVar.getValue();
        zVar.setValue(mVar != null ? new C10067m(C19327t.m32651g1(mVar.f22185a, aVar)) : null);
    }

    /* renamed from: d */
    public final void mo33340d(PurchaseClaimSpec purchaseClaimSpec) {
        C19383o.m32797g(purchaseClaimSpec, "purchaseClaimSpec");
        if (this.f22122h.mo45960e()) {
            C13468c cVar = this.f22124j;
            cVar.getClass();
            C8071s<C20145v<C19928a0>> a = cVar.f29490a.mo46147a(new PurchaseClaimBody(purchaseClaimSpec.getToken(), purchaseClaimSpec.getSignature()));
            C8567a aVar = new C8567a(2);
            a.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f22116b, C0472h.m1243e(this.f22116b, new C19211l(new C19208j(a, aVar), new C8568b(3)))), new HomePagerViewModel$claimPurchase$1(this), new HomePagerViewModel$claimPurchase$2(this));
            C7091a aVar2 = this.f22140z;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(e);
        }
    }

    /* renamed from: e */
    public final boolean mo33341e() {
        if (!this.f22139y || !this.f22122h.mo45960e() || !this.f22123i.f27883a.mo46761a().getBoolean("shouldShowReengageSweepsV1", false) || this.f22123i.f27883a.mo46761a().getBoolean("reengageSweepsV1Shown", false)) {
            return false;
        }
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f22116b, C0072d.m199f(this.f22116b, this.f22123i.f27884b.mo45424a())), new HomePagerViewModel$initSweepstakesAlertIfNeeded$1(this), new HomePagerViewModel$initSweepstakesAlertIfNeeded$2(this));
        C7091a aVar = this.f22140z;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
        return true;
    }

    /* renamed from: f */
    public final void mo33342f() {
        this.f22128n.postValue(C10070p.C10072b.f22201a);
        SingleFlatMap singleFlatMap = new SingleFlatMap(C0472h.m1243e(this.f22116b, this.f22121g.mo30433b()), new C10068n(this, 0));
        this.f22116b.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(singleFlatMap.mo20657f(C13461f.m21236c()), new HomePagerViewModel$loadTabs$2(this), new HomePagerViewModel$loadTabs$3(this));
        C7091a aVar = this.f22140z;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    public final void onCleared() {
        this.f22140z.mo19405d();
        this.f22115A = false;
    }
}
