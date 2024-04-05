package com.etsy.android.lib.network.oauth2.signin;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import com.etsy.android.lib.network.oauth2.C8744a;
import com.etsy.android.lib.network.oauth2.signin.C8790q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class OAuth2SignInViewModel$redirectUrlReceived$2 extends Lambda implements C19857l<AccessTokens, C19394m> {
    public final /* synthetic */ OAuth2SignInViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuth2SignInViewModel$redirectUrlReceived$2(OAuth2SignInViewModel oAuth2SignInViewModel) {
        super(1);
        this.this$0 = oAuth2SignInViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AccessTokens) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AccessTokens accessTokens) {
        C8694h a = LogCatKt.m17045a();
        a.mo21310e("Success, access tokens received: " + accessTokens);
        C8744a aVar = this.this$0.f19301c;
        C19383o.m32796f(accessTokens, "tokens");
        aVar.mo30070a(accessTokens);
        this.this$0.f19305g.setValue(new C8790q.C8792b(accessTokens));
    }
}
