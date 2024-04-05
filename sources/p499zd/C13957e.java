package p499zd;

import android.support.p013v4.media.C0072d;
import android.webkit.CookieManager;
import androidx.appcompat.widget.C0326j;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.C6487g;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import com.etsy.android.lib.network.oauth2.C8758h;
import com.etsy.android.lib.network.oauth2.C8767q;
import com.etsy.android.lib.network.oauth2.C8799y;
import com.etsy.android.lib.network.oauth2.OAuth2Error;
import com.etsy.android.lib.network.oauth2.OAuth2ErrorPayLoad;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.lib.requests.LocaleRequest;
import com.etsy.android.lib.session.C8857c;
import com.etsy.android.lib.session.SessionRepository;
import com.etsy.android.p327ui.C10673m;
import com.etsy.android.p327ui.user.auth.C11473a;
import com.etsy.android.p327ui.user.auth.C11477e;
import com.squareup.moshi.C17414y;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.completable.C19095g;
import p145io.reactivex.internal.operators.observable.C19150c;
import p145io.reactivex.internal.operators.observable.C19154d;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p248tp.C8061n;
import p248tp.C8071s;
import p277w8.C8264b;
import p277w8.C8266d;
import p402n9.C13081a;
import p402n9.C13093m;
import p402n9.C13094n;
import p402n9.C13095o;
import p402n9.C13096p;
import p402n9.C13097q;
import p425q9.C13263n;
import p448ta.C13387c;
import p456ua.C13461f;
import p471wa.C13797a;
import p499zd.C13950a;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: zd.e */
public final class C13957e extends C2866i0 {

    /* renamed from: b */
    public final C8767q f30677b;

    /* renamed from: c */
    public final C13797a f30678c;

    /* renamed from: d */
    public final C11473a f30679d;

    /* renamed from: e */
    public final C13461f f30680e;

    /* renamed from: f */
    public final C11477e f30681f;

    /* renamed from: g */
    public final C8618c f30682g;

    /* renamed from: h */
    public final C8857c f30683h;

    /* renamed from: i */
    public final SessionRepository f30684i;

    /* renamed from: j */
    public final C13097q f30685j;

    /* renamed from: k */
    public final LocaleRequest f30686k;

    /* renamed from: l */
    public ConsumerSingleObserver f30687l;

    /* renamed from: m */
    public ConsumerSingleObserver f30688m;

    /* renamed from: n */
    public final C2895z<C13950a> f30689n;

    /* renamed from: o */
    public final C2895z f30690o;

    /* renamed from: zd.e$a */
    public /* synthetic */ class C13958a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30691a;

        static {
            int[] iArr = new int[OAuth2Error.ErrorType.values().length];
            iArr[OAuth2Error.ErrorType.InvalidClientAtoReset.ordinal()] = 1;
            iArr[OAuth2Error.ErrorType.InvalidClientAtoLockedOut.ordinal()] = 2;
            f30691a = iArr;
        }
    }

    public C13957e(C8767q qVar, C13797a aVar, C11473a aVar2, C13461f fVar, C11477e eVar, C8618c cVar, C8857c cVar2, SessionRepository sessionRepository, C13097q qVar2, LocaleRequest localeRequest) {
        C19383o.m32797g(qVar, "signInRepository");
        C19383o.m32797g(aVar, "testAccountToolRepository");
        C19383o.m32797g(aVar2, "signInAsHandler");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(eVar, "signInActivityCallback");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(cVar2, "sessionEndpoint");
        C19383o.m32797g(sessionRepository, "sessionRepository");
        C19383o.m32797g(qVar2, "brazeUserActions");
        C19383o.m32797g(localeRequest, "localeRequest");
        this.f30677b = qVar;
        this.f30678c = aVar;
        this.f30679d = aVar2;
        this.f30680e = fVar;
        this.f30681f = eVar;
        this.f30682g = cVar;
        this.f30683h = cVar2;
        this.f30684i = sessionRepository;
        this.f30685j = qVar2;
        this.f30686k = localeRequest;
        C2895z<C13950a> zVar = new C2895z<>();
        this.f30689n = zVar;
        this.f30690o = zVar;
    }

    /* renamed from: b */
    public final Throwable mo46777b(Throwable th) {
        OAuth2ErrorPayLoad fromJson;
        OAuth2Error oAuth2Error = null;
        try {
            C19383o.m32795e(th, "null cannot be cast to non-null type retrofit2.HttpException");
            C20145v<?> response = ((HttpException) th).response();
            C19928a0 a0Var = response != null ? response.f44616c : null;
            if (!(a0Var == null || (fromJson = new C17414y(new C17414y.C17415a()).mo68556a(OAuth2ErrorPayLoad.class).fromJson(a0Var.mo72844g())) == null)) {
                oAuth2Error = C19382n.m32712H0(fromJson);
            }
        } catch (Exception unused) {
        }
        if (oAuth2Error == null) {
            return th;
        }
        int i = C13958a.f30691a[oAuth2Error.getErrorType().ordinal()];
        return (i == 1 || i == 2) ? new SignInError.AtoError(SignInError.SignInType.THIRD_PARTY, oAuth2Error.getErrorUri()) : new SignInError.Unknown(SignInError.SignInType.THIRD_PARTY);
    }

    /* renamed from: c */
    public final void mo46778c(AccessTokens accessTokens) {
        Set<String> cookies = accessTokens.getOAuth2AccessToken().getCookies();
        String f = this.f30682g.mo21136f(C8592b.f18819p0);
        C19383o.m32796f(f, "configMap.getStringValue…gKeys.HTTP_HOST_ETSY_WEB)");
        CookieManager instance = CookieManager.getInstance();
        if (instance != null) {
            instance.setAcceptCookie(true);
            for (String cookie : cookies) {
                instance.setCookie(f, cookie);
            }
        }
        C13097q qVar = this.f30685j;
        String userId = accessTokens.getOAuth2AccessToken().getUserId();
        qVar.getClass();
        C19383o.m32797g(userId, "userId");
        C8061n d = new C19150c(C8061n.m16234b(qVar.f28796c, new C19179q(qVar.f28797d.f29152r.mo45909c(), new C13093m(0)), new C0326j())).mo20634d(new C13094n(qVar, 0));
        C6487g gVar = new C6487g(userId, 1);
        Functions.C12959d dVar = Functions.f28540d;
        Functions.C12958c cVar = Functions.f28539c;
        d.getClass();
        new C19095g(new ObservableFlatMapCompletableCompletable(new C19154d(d, gVar, dVar), new C13081a(userId, 1, qVar)), new C13095o(qVar, 0), cVar).mo20608c(new C8264b(C8694h.f19097a, 2), new C13096p(0));
        this.f30686k.sendUserLocale();
    }

    /* renamed from: d */
    public final void mo46779d(C8799y yVar) {
        ConsumerSingleObserver consumerSingleObserver = this.f30687l;
        if (consumerSingleObserver != null) {
            consumerSingleObserver.dispose();
        }
        this.f30689n.postValue(C13950a.C13952b.f30670a);
        if (this.f30682g.mo21132b(C8592b.C8595c.f18859c)) {
            C8071s<AccessTokens> a = this.f30677b.mo30081a(yVar);
            this.f30680e.getClass();
            SingleFlatMap singleFlatMap = new SingleFlatMap(a.mo20657f(C13461f.m21235b()), new C8758h(this, 5));
            this.f30680e.getClass();
            this.f30687l = singleFlatMap.mo20657f(C13461f.m21236c()).mo20658g(new C8266d(this, 6), new C13387c(this, 4));
            return;
        }
        this.f30687l = C0072d.m199f(this.f30680e, this.f30677b.mo30081a(yVar)).mo20658g(new C10673m(this, 6), new C13263n(this, 4));
    }

    public final void onCleared() {
        super.onCleared();
        ConsumerSingleObserver consumerSingleObserver = this.f30687l;
        if (consumerSingleObserver != null) {
            consumerSingleObserver.dispose();
        }
        ConsumerSingleObserver consumerSingleObserver2 = this.f30688m;
        if (consumerSingleObserver2 != null) {
            consumerSingleObserver2.dispose();
        }
    }
}
