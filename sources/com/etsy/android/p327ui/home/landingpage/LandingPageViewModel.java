package com.etsy.android.p327ui.home.landingpage;

import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p277w8.C8267e;
import p346fa.C12703a;
import p445sf.C13379a;
import p445sf.C13380b;
import p445sf.C13381c;
import p445sf.C13382d;
import p456ua.C13461f;
import p464va.C13552e;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageViewModel */
public final class LandingPageViewModel extends C2866i0 implements C2857f {

    /* renamed from: b */
    public final C10021c f22044b;

    /* renamed from: c */
    public final C13461f f22045c;

    /* renamed from: d */
    public final C7091a f22046d;

    /* renamed from: e */
    public final C12703a f22047e;

    /* renamed from: f */
    public final C8267e f22048f;

    /* renamed from: g */
    public final C13552e f22049g;

    /* renamed from: h */
    public final C2895z<C10035h> f22050h;

    /* renamed from: i */
    public final C2895z f22051i;

    /* renamed from: j */
    public LandingPageInfo f22052j;

    /* renamed from: k */
    public C13379a f22053k;

    /* renamed from: com.etsy.android.ui.home.landingpage.LandingPageViewModel$a */
    public /* synthetic */ class C10012a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22054a;

        static {
            int[] iArr = new int[LandingPageInfo.TypedPageType.values().length];
            iArr[LandingPageInfo.TypedPageType.PAGE.ordinal()] = 1;
            iArr[LandingPageInfo.TypedPageType.LISTING.ordinal()] = 2;
            iArr[LandingPageInfo.TypedPageType.ETSY_LENS.ordinal()] = 3;
            iArr[LandingPageInfo.TypedPageType.SHOP.ordinal()] = 4;
            f22054a = iArr;
        }
    }

    public LandingPageViewModel(C10021c cVar, C13461f fVar, C7091a aVar, C12703a aVar2, C8267e eVar, C13552e eVar2) {
        C19383o.m32797g(cVar, "landingPageRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(aVar, "compositeDisposable");
        C19383o.m32797g(aVar2, "grafana");
        C19383o.m32797g(eVar, "adImpressionRepository");
        C19383o.m32797g(eVar2, "sdlRepository");
        this.f22044b = cVar;
        this.f22045c = fVar;
        this.f22046d = aVar;
        this.f22047e = aVar2;
        this.f22048f = eVar;
        this.f22049g = eVar2;
        C2895z<C10035h> zVar = new C2895z<>(new C10035h(EmptyList.INSTANCE));
        this.f22050h = zVar;
        this.f22051i = zVar;
    }

    /* renamed from: b */
    public static void m18183b(C2895z zVar, C10027f fVar) {
        C19383o.m32797g(zVar, "<this>");
        C19383o.m32797g(fVar, "sideEffect");
        Object value = zVar.getValue();
        C19383o.m32794d(value);
        zVar.setValue(new C10035h(C19327t.m32651g1(((C10035h) value).f22091a, fVar)));
    }

    /* renamed from: c */
    public final C10034g mo33261c(LandingPageInfo landingPageInfo) {
        return new C10034g(mo33262d(landingPageInfo), landingPageInfo.getParams(), mo33263e().mo46058a(), landingPageInfo.getBodyParams(), landingPageInfo.getRequestMethod(), landingPageInfo.getAttachment());
    }

    /* renamed from: d */
    public final String mo33262d(LandingPageInfo landingPageInfo) {
        String str = mo33263e().f29305a;
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        if (C18263b.m30839d0(landingPageInfo.getDeepLink())) {
            String deepLink = landingPageInfo.getDeepLink();
            C19383o.m32794d(deepLink);
            return deepLink;
        }
        String apiPath = landingPageInfo.getApiPath();
        C19383o.m32794d(apiPath);
        return apiPath;
    }

    /* renamed from: e */
    public final C13379a mo33263e() {
        C13379a aVar = this.f22053k;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("pagination");
        throw null;
    }

    /* renamed from: f */
    public final void mo33264f(String str, int i, Integer num) {
        C13379a e = mo33263e();
        if (e instanceof C13380b) {
            if (str != null) {
                ((C13380b) e).mo46065h(i, str);
            }
        } else if (e instanceof C13381c) {
            if (num != null) {
                ((C13381c) e).mo46067h(num.intValue(), i);
            }
        } else if (e instanceof C13382d) {
            ((C13382d) e).f29307c = true;
        }
    }

    public final void onCleared() {
        this.f22046d.mo19405d();
    }

    public final void onPause(C2887s sVar) {
        this.f22048f.mo20867a();
    }
}
