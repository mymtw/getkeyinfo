package com.paypal.pyplcheckout.flavorauth;

import com.paypal.authcore.authentication.C17136f;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class WebBasedAuthAccessTokenUseCase$authenticator$2 extends Lambda implements C19846a<C17136f> {
    public final /* synthetic */ WebBasedAuthAccessTokenUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebBasedAuthAccessTokenUseCase$authenticator$2(WebBasedAuthAccessTokenUseCase webBasedAuthAccessTokenUseCase) {
        super(0);
        this.this$0 = webBasedAuthAccessTokenUseCase;
    }

    public final C17136f invoke() {
        return this.this$0.createAuthenticator();
    }
}
