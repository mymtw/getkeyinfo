package com.etsy.android.p327ui.home.home;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.lib.push.registration.C8840m;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.home.home.C10002i;
import com.etsy.android.p327ui.homescreen.C10074a;
import com.etsy.android.p327ui.user.auth.C11484j;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.observable.C19150c;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8075w;
import p277w8.C8267e;
import p346fa.C12703a;
import p402n9.C13095o;
import p409o9.C13138q;
import p425q9.C13265p;
import p428qc.C13294e;
import p445sf.C13380b;
import p456ua.C13461f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.home.HomeViewModel */
public final class HomeViewModel extends C2866i0 implements C2857f {

    /* renamed from: b */
    public final C13461f f21977b;

    /* renamed from: c */
    public final C9994e f21978c;

    /* renamed from: d */
    public final C12703a f21979d;

    /* renamed from: e */
    public final C8618c f21980e;

    /* renamed from: f */
    public final C13294e f21981f;

    /* renamed from: g */
    public final C8267e f21982g;

    /* renamed from: h */
    public final CrashUtil f21983h;

    /* renamed from: i */
    public final C13138q f21984i;

    /* renamed from: j */
    public final C13265p f21985j;

    /* renamed from: k */
    public final StateFlowImpl f21986k;

    /* renamed from: l */
    public final C19662p1 f21987l;

    /* renamed from: m */
    public final C13380b f21988m = new C13380b();

    /* renamed from: n */
    public final C7091a f21989n;

    public HomeViewModel(C13461f fVar, C9994e eVar, C12703a aVar, C8618c cVar, C13294e eVar2, C8267e eVar3, CrashUtil crashUtil, C13138q qVar, C13265p pVar, C11484j jVar) {
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(eVar, "repository");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(eVar2, "eventManager");
        C19383o.m32797g(eVar3, "adImpressionRepository");
        C19383o.m32797g(crashUtil, "crashUtil");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(jVar, "signInEventManager");
        this.f21977b = fVar;
        this.f21978c = eVar;
        this.f21979d = aVar;
        this.f21980e = cVar;
        this.f21981f = eVar2;
        this.f21982g = eVar3;
        this.f21983h = crashUtil;
        this.f21984i = qVar;
        this.f21985j = pVar;
        StateFlowImpl g = C19388s.m32862g(new C10001h(EmptyList.INSTANCE, 509));
        this.f21986k = g;
        this.f21987l = C0761x.m1750w(g);
        C7091a aVar2 = new C7091a();
        this.f21989n = aVar2;
        aVar2.mo19403b(eVar2.f29197a.mo20635e(C13461f.m21236c()).mo20637g(new C8905i(this, 4)));
        aVar2.mo19403b(jVar.f25334a.mo20635e(C13461f.m21236c()).mo20637g(new C13095o(this, 2)));
        aVar2.mo19403b(SubscribersKt.m32501f(new C19150c(pVar.mo45957b()).mo20635e(C13461f.m21236c()), (C19857l) null, new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ HomeViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Boolean bool) {
                Object value;
                Object value2;
                if (!bool.booleanValue()) {
                    StateFlowImpl stateFlowImpl = this.this$0.f21986k;
                    do {
                        value2 = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.mo72337i(value2, C10001h.m18179b((C10001h) value2, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10004b.f22016a, (String) null, 383)));
                    return;
                }
                StateFlowImpl stateFlowImpl2 = this.this$0.f21986k;
                do {
                    value = stateFlowImpl2.getValue();
                } while (!stateFlowImpl2.mo72337i(value, C10001h.m18179b((C10001h) value, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10003a.f22015a, (String) null, 383)));
            }
        }, 3));
    }

    /* renamed from: b */
    public static final void m18172b(HomeViewModel homeViewModel, Throwable th) {
        Object value;
        if (homeViewModel.f21980e.mo21132b(C8592b.f18790f1)) {
            homeViewModel.f21983h.mo30457b(th);
        }
        homeViewModel.f21979d.mo45474a("cbf.home.home.error.load_error");
        StateFlowImpl stateFlowImpl = homeViewModel.f21986k;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, C10001h.m18179b((C10001h) value, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10005c.f22017a, (String) null, 383)));
    }

    /* renamed from: c */
    public final void mo33214c(boolean z) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        boolean z2 = true;
        if (!this.f21985j.mo45960e()) {
            HomeTab homeTab = ((C10001h) this.f21987l.getValue()).f22009d;
            if (!(homeTab != null && !homeTab.showSignIn())) {
                StateFlowImpl stateFlowImpl = this.f21986k;
                do {
                    value4 = stateFlowImpl.getValue();
                } while (!stateFlowImpl.mo72337i(value4, C10001h.m18179b((C10001h) value4, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10009g.f22021a, (String) null, 383)));
                return;
            }
        }
        C10001h hVar = (C10001h) this.f21987l.getValue();
        String str = hVar.f22014i;
        if (str == null) {
            str = hVar.f22006a;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            this.f21979d.mo45474a("cbf.home.home.error.missing_api_url");
            C12703a aVar = this.f21979d;
            StringBuilder h = C0072d.m201h("homescreen_tabs.");
            h.append(((C10001h) this.f21987l.getValue()).f22008c);
            h.append(".error.missing_tab_data");
            aVar.mo45474a(h.toString());
            StateFlowImpl stateFlowImpl2 = this.f21986k;
            do {
                value3 = stateFlowImpl2.getValue();
            } while (!stateFlowImpl2.mo72337i(value3, C10001h.m18179b((C10001h) value3, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10005c.f22017a, (String) null, 383)));
            return;
        }
        C10002i iVar = ((C10001h) this.f21987l.getValue()).f22013h;
        C10002i.C10008f fVar = C10002i.C10008f.f22020a;
        if (C19383o.m32792b(iVar, fVar)) {
            StateFlowImpl stateFlowImpl3 = this.f21986k;
            do {
                value2 = stateFlowImpl3.getValue();
            } while (!stateFlowImpl3.mo72337i(value2, C10001h.m18179b((C10001h) value2, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10008f.f22020a, (String) null, 383)));
        } else {
            C10001h hVar2 = (C10001h) this.f21987l.getValue();
            if (C19383o.m32792b(hVar2.f22013h, C10002i.C10006d.f22018a) || C19383o.m32792b(hVar2.f22013h, fVar)) {
                z2 = false;
            }
            if (z2) {
                StateFlowImpl stateFlowImpl4 = this.f21986k;
                do {
                    value = stateFlowImpl4.getValue();
                } while (!stateFlowImpl4.mo72337i(value, C10001h.m18179b((C10001h) value, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10007e.f22019a, (String) null, 383)));
            }
        }
        C9994e eVar = this.f21978c;
        boolean z3 = ((C10001h) this.f21987l.getValue()).f22011f;
        this.f21988m.getClass();
        boolean z4 = this.f21981f.f29198b;
        boolean e = this.f21985j.mo45960e();
        boolean b = this.f21980e.mo21132b(C8592b.C8595c.f18861e);
        boolean z5 = ((C10001h) this.f21987l.getValue()).f22010e;
        String str3 = this.f21984i.f28895a;
        String str4 = this.f21981f.f29199c;
        HomeTab homeTab2 = ((C10001h) this.f21987l.getValue()).f22009d;
        Boolean valueOf = homeTab2 != null ? Boolean.valueOf(homeTab2.getNeedsRecentlyViewedIds()) : null;
        C10074a aVar2 = this.f21981f.f29200d;
        Long valueOf2 = aVar2 != null ? Long.valueOf(aVar2.f22203a) : null;
        C10074a aVar3 = this.f21981f.f29200d;
        Long l = aVar3 != null ? aVar3.f22204b : null;
        C19383o.m32796f(str3, "uuid");
        C10011k kVar = new C10011k(z3, str2, z4, e, b, str4, valueOf, z5, str3, valueOf2, l);
        eVar.getClass();
        C8075w a = (kVar.f22032a || kVar.f22035d || (!kVar.f22036e && kVar.f22037f)) ? eVar.f21995a.mo33220a(kVar.f22033b, kVar.mo33238a()) : new SingleFlatMap(eVar.f21996b.mo30433b(), new C9993d(eVar, kVar));
        C8840m mVar = new C8840m(eVar, 4);
        a.getClass();
        ConsumerSingleObserver e2 = SubscribersKt.m32500e(C0391c.m1056b(this.f21977b, C0326j.m860e(this.f21977b, new C19208j(a, mVar))), new HomeViewModel$loadHome$5(this), new HomeViewModel$loadHome$6(this, z));
        C7091a aVar4 = this.f21989n;
        C19383o.m32798h(aVar4, "compositeDisposable");
        aVar4.mo19403b(e2);
    }

    /* renamed from: d */
    public final String mo33215d(String str) {
        if (str == null) {
            return null;
        }
        String f = this.f21980e.mo21136f(C8592b.f18825r0);
        C19383o.m32796f(f, "configMap.getStringValue…nfigKeys.API_V3_ENDPOINT)");
        return C19388s.m32815D(str, f);
    }

    /* renamed from: e */
    public final void mo33216e(boolean z) {
        Object value;
        if (!C19383o.m32792b(((C10001h) this.f21987l.getValue()).f22013h, C10002i.C10008f.f22020a)) {
            StateFlowImpl stateFlowImpl = this.f21986k;
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value, C10001h.m18179b((C10001h) value, (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10008f.f22020a, (String) null, 127)));
            this.f21988m.mo46064g();
            mo33214c(z);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.f21989n.mo19405d();
    }

    public final void onPause(C2887s sVar) {
        this.f21982g.mo20867a();
    }
}
