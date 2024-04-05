package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.network.oauth2.OAuth2Repository;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class OAuth2Authenticator$authenticate$1 extends Lambda implements C19846a<C19394m> {

    /* renamed from: $e */
    public final /* synthetic */ Exception f19196$e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuth2Authenticator$authenticate$1(Exception exc) {
        super(0);
        this.f19196$e = exc;
    }

    public final void invoke() {
        CrashUtil.m17307a().mo30457b(new OAuth2Repository.OAuth2TokenException("Token refresh attempt failed.", this.f19196$e));
    }
}
