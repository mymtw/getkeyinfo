package com.paypal.authcore.authentication;

import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationError;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17156f;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;

/* renamed from: com.paypal.authcore.authentication.g */
public final class C17137g implements C17133c {

    /* renamed from: a */
    public final /* synthetic */ PartnerAuthenticationProvider f37506a;

    /* renamed from: b */
    public final /* synthetic */ Authentication.Listener f37507b;

    /* renamed from: c */
    public final /* synthetic */ boolean f37508c;

    /* renamed from: com.paypal.authcore.authentication.g$a */
    public static final class C17138a implements AuthenticationTokensProvider {

        /* renamed from: a */
        public final /* synthetic */ C17156f f37509a;

        public C17138a(C17156f fVar) {
            this.f37509a = fVar;
        }

        public final String getAccessToken() {
            return this.f37509a.f37614c;
        }

        public final Map<String, String> getAuthHeaders() {
            return C19294b0.m32559p0();
        }

        public final String getIdToken() {
            return this.f37509a.f37616e;
        }

        public final Map<String, Object> getResultServiceMetadata() {
            return C19294b0.m32559p0();
        }
    }

    public C17137g(PartnerAuthenticationProvider partnerAuthenticationProvider, Authentication.Listener listener, boolean z) {
        this.f37506a = partnerAuthenticationProvider;
        this.f37507b = listener;
        this.f37508c = z;
    }

    public final void completeWithFailure(AuthorizationException authorizationException) {
        C19383o.m32797g(authorizationException, "exception");
        if (!this.f37508c || authorizationException.type != 0 || authorizationException.code != 1) {
            C8115a.m16322a(this.f37506a.f37458b).mo20710d(this.f37506a.f37464h);
            PartnerAuthenticationProvider partnerAuthenticationProvider = this.f37506a;
            partnerAuthenticationProvider.mo61644a(PartnerAuthenticationProvider.m28570c(partnerAuthenticationProvider, authorizationException.getMessage()));
            Authentication.Listener listener = this.f37507b;
            if (listener != null) {
                String message = authorizationException.getMessage();
                listener.onError(new AuthenticationError.Auth(authorizationException.getMessage(), authorizationException.getMessage(), "", message, AuthenticationError.AuthError.AuthenticationFailure.INSTANCE));
            }
        }
    }

    public final void completeWithSuccess(C17156f fVar) {
        C19383o.m32797g(fVar, "tokenResponse");
        C8115a.m16322a(this.f37506a.f37458b).mo20710d(this.f37506a.f37464h);
        Authentication.Listener listener = this.f37507b;
        if (listener != null) {
            listener.onSuccess(new C17138a(fVar));
        }
        this.f37506a.f37463g = null;
    }

    public final String getTrackingID() {
        return this.f37506a.f37459c.getTrackingDelegate().getTrackingId();
    }
}
