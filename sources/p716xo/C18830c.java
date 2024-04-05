package p716xo;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationContext;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationState;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginHandler;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler;
import com.paypal.authcore.authentication.PartnerAuthenticationProvider;
import com.paypal.platform.authsdk.AuthProviders;
import com.paypal.platform.authsdk.PartnerAuthenticationSDK$accessTokenReceiver$1;
import com.paypal.platform.authsdk.partnerauth.lls.p537ui.PartnerAuthLLSHandler;
import com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter;
import com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20009t;
import p251u1.C8115a;
import p724yo.C18897a;
import p732zo.C18973a;

/* renamed from: xo.c */
public final class C18830c implements Authentication {

    /* renamed from: a */
    public final Context f41698a;

    /* renamed from: b */
    public final AuthCoreComponent f41699b;

    /* renamed from: c */
    public final PartnerAuthChallengeRouter f41700c;

    /* renamed from: d */
    public final C18834f f41701d;

    /* renamed from: e */
    public final C18897a f41702e;

    /* renamed from: xo.c$a */
    public static final class C18831a implements AuthenticationTokensProvider {

        /* renamed from: a */
        public final /* synthetic */ C18830c f41703a;

        public C18831a(C18830c cVar) {
            this.f41703a = cVar;
        }

        public final String getAccessToken() {
            return this.f41703a.f41701d.f41705a;
        }

        public final Map<String, String> getAuthHeaders() {
            return C19294b0.m32559p0();
        }

        public final String getIdToken() {
            return this.f41703a.f41701d.f41705a;
        }

        public final Map<String, Object> getResultServiceMetadata() {
            return C19294b0.m32559p0();
        }
    }

    public C18830c(ClientConfig clientConfig, Context context, AuthProviders authProviders, PartnerAuthenticationProvider.C17130e eVar) {
        PartnerAuthEngine partnerAuthEngine = new PartnerAuthEngine(context);
        C18828a aVar = new C18828a(partnerAuthEngine, new C20009t(), clientConfig);
        PartnerAuthChallengeRouter partnerAuthChallengeRouter = new PartnerAuthChallengeRouter(partnerAuthEngine);
        C18834f fVar = new C18834f();
        C19383o.m32797g(clientConfig, "clientConfig");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(authProviders, "authProviders");
        C19383o.m32797g(eVar, "externalTrackingDelegate");
        this.f41698a = context;
        this.f41699b = aVar;
        this.f41700c = partnerAuthChallengeRouter;
        this.f41701d = fVar;
        C8115a.m16322a(context).mo20708b(new PartnerAuthenticationSDK$accessTokenReceiver$1(this), new IntentFilter("accessTokenReceiver"));
        C18897a aVar2 = new C18897a(eVar, aVar.f41697c);
        this.f41702e = aVar2;
        Context context2 = context;
        C18834f fVar2 = fVar;
        C18828a aVar3 = aVar;
        AuthProviders authProviders2 = authProviders;
        C18897a aVar4 = aVar2;
        new PartnerAuthLLSHandler(context2, fVar2, aVar3, authProviders2, aVar4);
        new OTPLoginHandler(context2, fVar2, aVar3, authProviders2, aVar4);
        new SplitLoginHandler(context, aVar, authProviders, aVar2);
        aVar2.onTrackEvent(m31822a("native_auth_authsdk_authenticate", EventsNameKt.TRIGGERED, (String) null));
    }

    /* renamed from: a */
    public static TrackingEvent.Impression m31822a(String str, String str2, String str3) {
        return new TrackingEvent.Impression(str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, 248, (DefaultConstructorMarker) null);
    }

    public final AuthenticationTokensProvider authTokensProvider() {
        return new C18831a(this);
    }

    public final void authenticate(AuthenticationContext authenticationContext, Authentication.Listener listener) {
        C19383o.m32797g(authenticationContext, "authenticationContext");
        C19383o.m32797g(listener, "authenticationListener");
        Log.d("In memory token", String.valueOf(this.f41701d.f41705a));
        if (isAuthenticationNeeded(authenticationContext)) {
            this.f41700c.mo62600a(authenticationContext, listener, authenticationContext.getPublicCredential());
            return;
        }
        this.f41702e.onTrackEvent(m31822a("native_auth_authsdk_memory_token", "success", (String) null));
        listener.onSuccess(new C18831a(this));
        Log.d("In memory", String.valueOf(this.f41701d.f41705a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r0.f41706b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isAuthenticationNeeded(com.paypal.android.platform.authsdk.authinterface.AuthenticationContext r5) {
        /*
            r4 = this;
            java.lang.String r0 = "authenticationContext"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            xo.f r0 = r4.f41701d
            r0.getClass()
            java.lang.String r1 = r0.f41705a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r0 = r0.f41706b
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r1 = com.paypal.android.platform.authsdk.authinterface.AuthenticationState.LoggedIn
            if (r0 == r1) goto L_0x001c
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r1 = r5.getAuthState()
            if (r0 != r1) goto L_0x001e
        L_0x001c:
            r0 = r3
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "In memory valid"
            android.util.Log.d(r1, r0)
            xo.f r0 = r4.f41701d
            r0.getClass()
            java.lang.String r1 = r0.f41705a
            if (r1 == 0) goto L_0x003e
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r0 = r0.f41706b
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r1 = com.paypal.android.platform.authsdk.authinterface.AuthenticationState.LoggedIn
            if (r0 == r1) goto L_0x003d
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r5 = r5.getAuthState()
            if (r0 != r5) goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            r5 = r2 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p716xo.C18830c.isAuthenticationNeeded(com.paypal.android.platform.authsdk.authinterface.AuthenticationContext):boolean");
    }

    public final void logout(boolean z) {
        this.f41702e.onTrackEvent(m31822a("native_auth_authsdk_logout", "success", "soft"));
        C18834f fVar = this.f41701d;
        fVar.f41705a = null;
        fVar.f41706b = AuthenticationState.Anonymous;
        new C18973a(this.f41698a).clear();
    }
}
