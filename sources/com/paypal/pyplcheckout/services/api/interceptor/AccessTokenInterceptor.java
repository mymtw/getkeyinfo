package com.paypal.pyplcheckout.services.api.interceptor;

import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;

public final class AccessTokenInterceptor implements C20000q {
    private static final String ACCESS_TOKEN_HEADER_NAME = "x-paypal-internal-euat";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AuthRepository authRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AccessTokenInterceptor(AuthRepository authRepository2) {
        C19383o.m32797g(authRepository2, "authRepository");
        this.authRepository = authRepository2;
    }

    public C20018z intercept(C20000q.C20001a aVar) {
        C19383o.m32797g(aVar, "chain");
        String accessToken = this.authRepository.getAccessToken();
        if (accessToken != null) {
            C20011u g = aVar.mo70455g();
            g.getClass();
            C20011u.C20012a aVar2 = new C20011u.C20012a(g);
            aVar2.mo73000c(ACCESS_TOKEN_HEADER_NAME, accessToken);
            return aVar.mo70453a(aVar2.mo72999b());
        }
        throw new NullPointerException("Access Token is null");
    }
}
