package com.etsy.android.lib.network.oauth2.signin;

import androidx.lifecycle.C2895z;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.network.oauth2.OAuth2Error;
import com.etsy.android.lib.network.oauth2.OAuth2ErrorPayLoad;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.lib.network.oauth2.signin.C8790q;
import com.etsy.android.lib.network.oauth2.signin.OAuth2SignInViewModel;
import com.squareup.moshi.C17414y;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import okhttp3.C19928a0;
import p753kq.C19857l;
import retrofit2.C20145v;
import retrofit2.HttpException;

public final class OAuth2SignInViewModel$redirectUrlReceived$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ OAuth2SignInViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuth2SignInViewModel$redirectUrlReceived$1(OAuth2SignInViewModel oAuth2SignInViewModel) {
        super(1);
        this.this$0 = oAuth2SignInViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        Throwable th2;
        OAuth2ErrorPayLoad fromJson;
        C19383o.m32797g(th, "throwable");
        OAuth2SignInViewModel oAuth2SignInViewModel = this.this$0;
        C2895z<C8790q> zVar = oAuth2SignInViewModel.f19305g;
        oAuth2SignInViewModel.getClass();
        OAuth2Error oAuth2Error = null;
        try {
            C20145v<?> response = ((HttpException) th).response();
            C19928a0 a0Var = response != null ? response.f44616c : null;
            if (!(a0Var == null || (fromJson = new C17414y(new C17414y.C17415a()).mo68556a(OAuth2ErrorPayLoad.class).fromJson(a0Var.mo72844g())) == null)) {
                oAuth2Error = C19382n.m32712H0(fromJson);
            }
        } catch (Exception unused) {
        }
        if (oAuth2Error == null) {
            th2 = th;
        } else {
            int i = OAuth2SignInViewModel.C8771a.f19307a[oAuth2Error.getErrorType().ordinal()];
            if (i == 1 || i == 2) {
                th2 = new SignInError.AtoError(SignInError.SignInType.WEB_AUTH, oAuth2Error.getErrorUri());
            } else if (i != 3) {
                th2 = new SignInError.Unknown(SignInError.SignInType.WEB_AUTH);
            } else {
                th2 = new SignInError.AuthFailed(SignInError.SignInType.WEB_AUTH);
            }
        }
        zVar.setValue(new C8790q.C8791a(th2));
        LogCatKt.m17045a().mo21309d("OAuth2 access token not received:", th);
    }
}
