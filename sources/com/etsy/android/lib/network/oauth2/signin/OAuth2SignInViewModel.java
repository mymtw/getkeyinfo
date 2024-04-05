package com.etsy.android.lib.network.oauth2.signin;

import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.network.oauth2.C8744a;
import com.etsy.android.lib.network.oauth2.C8761k;
import com.etsy.android.lib.network.oauth2.C8762l;
import com.etsy.android.lib.network.oauth2.OAuth2Error;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19198c;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p456ua.C13461f;

public final class OAuth2SignInViewModel extends C2866i0 implements C8762l {

    /* renamed from: b */
    public final C13461f f19300b;

    /* renamed from: c */
    public final C8744a f19301c;

    /* renamed from: d */
    public final C8786n f19302d;

    /* renamed from: e */
    public final C8761k f19303e;

    /* renamed from: f */
    public final C7091a f19304f = new C7091a();

    /* renamed from: g */
    public final C2895z<C8790q> f19305g;

    /* renamed from: h */
    public final C2895z f19306h;

    /* renamed from: com.etsy.android.lib.network.oauth2.signin.OAuth2SignInViewModel$a */
    public /* synthetic */ class C8771a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19307a;

        static {
            int[] iArr = new int[OAuth2Error.ErrorType.values().length];
            iArr[OAuth2Error.ErrorType.InvalidClientAtoReset.ordinal()] = 1;
            iArr[OAuth2Error.ErrorType.InvalidClientAtoLockedOut.ordinal()] = 2;
            iArr[OAuth2Error.ErrorType.InvalidGrant.ordinal()] = 3;
            f19307a = iArr;
        }
    }

    public OAuth2SignInViewModel(C13461f fVar, C8744a aVar, C8786n nVar, C8761k kVar) {
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(aVar, "storeTokens");
        C19383o.m32797g(nVar, "magicLinkAuthentication");
        C19383o.m32797g(kVar, "oAuth2Authentication");
        this.f19300b = fVar;
        this.f19301c = aVar;
        this.f19302d = nVar;
        this.f19303e = kVar;
        C2895z<C8790q> zVar = new C2895z<>();
        this.f19305g = zVar;
        this.f19306h = zVar;
    }

    /* renamed from: a */
    public final void mo30080a(String str) {
        C19383o.m32797g(str, "redirectUrl");
        C19198c c = this.f19303e.mo30076c(str);
        this.f19300b.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f19300b, c.mo20660i(C13461f.m21235b())), new OAuth2SignInViewModel$redirectUrlReceived$1(this), new OAuth2SignInViewModel$redirectUrlReceived$2(this));
        C7091a aVar = this.f19304f;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    public final void onCleared() {
        this.f19304f.mo19405d();
        super.onCleared();
    }
}
