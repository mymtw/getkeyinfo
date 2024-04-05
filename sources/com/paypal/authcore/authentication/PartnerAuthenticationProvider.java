package com.paypal.authcore.authentication;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.p013v4.media.C0069a;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.authcommon.model.Tenant;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationContext;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationError;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationState;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import com.paypal.openid.C17148a;
import com.paypal.openid.C17153d;
import com.paypal.platform.authsdk.AuthProviders;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONObject;
import p001a0.C0005b;
import p251u1.C8115a;
import p514bk.C14088a;
import p651po.C18420a;
import p716xo.C18830c;
import p716xo.C18835g;
import p753kq.C19846a;

public final class PartnerAuthenticationProvider {

    /* renamed from: a */
    public final C18420a f37457a;

    /* renamed from: b */
    public final Context f37458b;

    /* renamed from: c */
    public final AuthProviders f37459c;

    /* renamed from: d */
    public final C17130e f37460d = new C17130e(this);

    /* renamed from: e */
    public final C19285c f37461e;

    /* renamed from: f */
    public final C19285c f37462f;

    /* renamed from: g */
    public Authentication.Listener f37463g;

    /* renamed from: h */
    public final PartnerAuthenticationProvider$forgotUserNameReceiver$1 f37464h;

    /* renamed from: com.paypal.authcore.authentication.PartnerAuthenticationProvider$a */
    public static final class C17126a extends Lambda implements C19846a<C18830c> {

        /* renamed from: a */
        public final /* synthetic */ PartnerAuthenticationProvider f37465a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17126a(PartnerAuthenticationProvider partnerAuthenticationProvider) {
            super(0);
            this.f37465a = partnerAuthenticationProvider;
        }

        public final C18830c invoke() {
            String str;
            String str2;
            String str3;
            PartnerAuthenticationProvider partnerAuthenticationProvider = this.f37465a;
            partnerAuthenticationProvider.getClass();
            ClientConfig.Companion companion = ClientConfig.Companion;
            String riskPayload = partnerAuthenticationProvider.f37459c.getRiskDelegate().getRiskPayload();
            C19383o.m32797g(riskPayload, "<this>");
            try {
                str = new JSONObject(riskPayload).optString(EventsNameKt.APP_GUID);
                C19383o.m32796f(str, "{\n        val riskJson =…ID_KEY) // guid key\n    }");
            } catch (Exception unused) {
                str = C0069a.m174e("{\n        UUID.randomUUI…f null or exception\n    }");
            }
            String str4 = partnerAuthenticationProvider.f37457a.f40513c;
            C19383o.m32796f(str4, "authConfig.tokenURL");
            String x = C14088a.m21795x(str4);
            String str5 = partnerAuthenticationProvider.f37457a.f40513c;
            C19383o.m32796f(str5, "authConfig.tokenURL");
            try {
                String x2 = C14088a.m21795x(str5);
                if (C19383o.m32792b(x2, "https://api.paypal.com")) {
                    str2 = "AV8hdBBM80xlgKsD-OaOQxeeHXJlZlaCvXWgVpvUqZMTdTXy9pmfEXtE1lCq";
                    String str6 = partnerAuthenticationProvider.f37457a.f40511a;
                    C19383o.m32796f(str6, "authConfig.clientId");
                    String str7 = partnerAuthenticationProvider.f37457a.f40512b;
                    C19383o.m32796f(str7, "authConfig.redirectURL");
                    String riskPayload2 = partnerAuthenticationProvider.f37459c.getRiskDelegate().getRiskPayload();
                    Context context = partnerAuthenticationProvider.f37458b;
                    C19383o.m32797g(riskPayload2, "<this>");
                    C19383o.m32797g(context, ResponseConstants.CONTEXT);
                    try {
                        str3 = new JSONObject(riskPayload2).optString("app_id");
                        C19383o.m32796f(str3, "{\n        val riskJson =…_KEY) // app_id key\n    }");
                    } catch (Exception unused2) {
                        str3 = context.getPackageName();
                        C19383o.m32796f(str3, "{\n        context.packageName\n    }");
                    }
                    String str8 = str3;
                    Tenant tenant = Tenant.PayPal;
                    String riskPayload3 = partnerAuthenticationProvider.f37459c.getRiskDelegate().getRiskPayload();
                    String str9 = partnerAuthenticationProvider.f37457a.f40511a;
                    C19383o.m32796f(str9, "authConfig.clientId");
                    return new C18830c(companion.build(str, x, str2, str6, str7, str8, tenant, riskPayload3, str9, partnerAuthenticationProvider.f37458b), partnerAuthenticationProvider.f37458b, partnerAuthenticationProvider.f37459c, partnerAuthenticationProvider.f37460d);
                }
                str2 = C19383o.m32792b(x2, "https://www.sandbox.paypal.com") ? "AV9A8hC9itn3RpZ-OeSNKq3Os9u60HmFi0R3KC_AYSYYKwP1mHVHBXDJIT7i" : "ARDnRxBcfQ_3yu-KD44NfpOaKDs5NrF9502WWMbGpt1jaVrVPDXK1GkNTfSP";
                String str62 = partnerAuthenticationProvider.f37457a.f40511a;
                C19383o.m32796f(str62, "authConfig.clientId");
                String str72 = partnerAuthenticationProvider.f37457a.f40512b;
                C19383o.m32796f(str72, "authConfig.redirectURL");
                String riskPayload22 = partnerAuthenticationProvider.f37459c.getRiskDelegate().getRiskPayload();
                Context context2 = partnerAuthenticationProvider.f37458b;
                C19383o.m32797g(riskPayload22, "<this>");
                C19383o.m32797g(context2, ResponseConstants.CONTEXT);
                str3 = new JSONObject(riskPayload22).optString("app_id");
                C19383o.m32796f(str3, "{\n        val riskJson =…_KEY) // app_id key\n    }");
                String str82 = str3;
                Tenant tenant2 = Tenant.PayPal;
                String riskPayload32 = partnerAuthenticationProvider.f37459c.getRiskDelegate().getRiskPayload();
                String str92 = partnerAuthenticationProvider.f37457a.f40511a;
                C19383o.m32796f(str92, "authConfig.clientId");
                return new C18830c(companion.build(str, x, str2, str62, str72, str82, tenant2, riskPayload32, str92, partnerAuthenticationProvider.f37458b), partnerAuthenticationProvider.f37458b, partnerAuthenticationProvider.f37459c, partnerAuthenticationProvider.f37460d);
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: com.paypal.authcore.authentication.PartnerAuthenticationProvider$b */
    public static final class C17127b extends Lambda implements C19846a<C17136f> {

        /* renamed from: a */
        public final /* synthetic */ PartnerAuthenticationProvider f37466a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17127b(PartnerAuthenticationProvider partnerAuthenticationProvider) {
            super(0);
            this.f37466a = partnerAuthenticationProvider;
        }

        public final C17136f invoke() {
            PartnerAuthenticationProvider partnerAuthenticationProvider = this.f37466a;
            return new C17136f(partnerAuthenticationProvider.f37458b, partnerAuthenticationProvider.f37457a, new C17139h(partnerAuthenticationProvider));
        }
    }

    /* renamed from: com.paypal.authcore.authentication.PartnerAuthenticationProvider$c */
    public static final class C17128c implements AuthenticationContext {

        /* renamed from: a */
        public final /* synthetic */ C17132b f37467a;

        public C17128c(C17132b bVar) {
            this.f37467a = bVar;
        }

        public final AuthenticationState getAuthState() {
            AuthenticationState authenticationState = this.f37467a.f37475a;
            C19383o.m32797g(authenticationState, "<this>");
            return authenticationState == AuthenticationState.LoggedIn ? AuthenticationState.LoggedIn : AuthenticationState.Remembered;
        }

        public final AuthenticationPrompt getLoginPrompt() {
            return AuthenticationPrompt.Login;
        }

        public final String getPublicCredential() {
            return this.f37467a.f37476b;
        }
    }

    /* renamed from: com.paypal.authcore.authentication.PartnerAuthenticationProvider$d */
    public static final class C17129d implements Authentication.Listener {

        /* renamed from: a */
        public final /* synthetic */ PartnerAuthenticationProvider f37468a;

        public C17129d(PartnerAuthenticationProvider partnerAuthenticationProvider) {
            this.f37468a = partnerAuthenticationProvider;
        }

        public final void onError(AuthenticationError authenticationError) {
            C19383o.m32797g(authenticationError, "error");
            if (!(authenticationError instanceof AuthenticationError.Auth) || authenticationError.getMessage() == null || !C19457k.m33019W0(authenticationError.getMessage(), "triggeredWebAuth", false)) {
                PartnerAuthenticationProvider partnerAuthenticationProvider = this.f37468a;
                partnerAuthenticationProvider.mo61644a(PartnerAuthenticationProvider.m28570c(partnerAuthenticationProvider, authenticationError.getTitle()));
                Authentication.Listener listener = this.f37468a.f37463g;
                if (listener != null) {
                    listener.onError(authenticationError);
                    return;
                }
                return;
            }
            PartnerAuthenticationProvider partnerAuthenticationProvider2 = this.f37468a;
            partnerAuthenticationProvider2.getClass();
            partnerAuthenticationProvider2.mo61644a(PartnerAuthenticationProvider.m28571e("native_auth_partner_authentication", EventsNameKt.FAILED, "triggeredWebAuth"));
            PartnerAuthenticationProvider partnerAuthenticationProvider3 = this.f37468a;
            PartnerAuthenticationProvider.m28569b(partnerAuthenticationProvider3, partnerAuthenticationProvider3.f37463g, false);
        }

        public final void onSuccess(AuthenticationTokensProvider authenticationTokensProvider) {
            C19383o.m32797g(authenticationTokensProvider, "authTokensProvider");
            PartnerAuthenticationProvider partnerAuthenticationProvider = this.f37468a;
            partnerAuthenticationProvider.getClass();
            partnerAuthenticationProvider.mo61644a(PartnerAuthenticationProvider.m28571e("native_auth_partner_authentication", "success", (String) null));
            Authentication.Listener listener = this.f37468a.f37463g;
            if (listener != null) {
                listener.onSuccess(authenticationTokensProvider);
            }
        }
    }

    /* renamed from: com.paypal.authcore.authentication.PartnerAuthenticationProvider$e */
    public static final class C17130e implements C18835g {

        /* renamed from: a */
        public final /* synthetic */ PartnerAuthenticationProvider f37469a;

        public C17130e(PartnerAuthenticationProvider partnerAuthenticationProvider) {
            this.f37469a = partnerAuthenticationProvider;
        }

        public final String getTrackingId() {
            try {
                return this.f37469a.f37459c.getTrackingDelegate().getTrackingId();
            } catch (Exception unused) {
                return "";
            }
        }

        public final void trackEvent(TrackingEvent trackingEvent) {
            C19383o.m32797g(trackingEvent, "event");
            try {
                if (trackingEvent instanceof TrackingEvent.Click) {
                    ((TrackingEvent.Click) trackingEvent).setAuthSdkVersion("PayPalPartnerAuth-1.7.4");
                } else if (trackingEvent instanceof TrackingEvent.Error) {
                    ((TrackingEvent.Error) trackingEvent).setAuthSdkVersion("PayPalPartnerAuth-1.7.4");
                } else if (trackingEvent instanceof TrackingEvent.Impression) {
                    ((TrackingEvent.Impression) trackingEvent).setAuthSdkVersion("PayPalPartnerAuth-1.7.4");
                }
                this.f37469a.f37459c.getTrackingDelegate().trackEvent(trackingEvent);
            } catch (Exception unused) {
            }
        }
    }

    public PartnerAuthenticationProvider(C18420a aVar, Context context, AuthProviders authProviders) {
        C19383o.m32797g(aVar, "authConfig");
        this.f37457a = aVar;
        this.f37458b = context;
        this.f37459c = authProviders;
        mo61644a(m28571e("native_auth_partner_authentication", "initiated", (String) null));
        this.f37461e = C19350d.m32677b(new C17126a(this));
        this.f37462f = C19350d.m32677b(new C17127b(this));
        this.f37464h = new PartnerAuthenticationProvider$forgotUserNameReceiver$1(this);
    }

    /* renamed from: b */
    public static final void m28569b(PartnerAuthenticationProvider partnerAuthenticationProvider, Authentication.Listener listener, boolean z) {
        C17137g gVar = new C17137g(partnerAuthenticationProvider, listener, z);
        if (z) {
            partnerAuthenticationProvider.mo61644a(m28571e("native_auth_partner_authenticate_web_login", "initiated", "forgetUserError"));
            C17136f fVar = (C17136f) partnerAuthenticationProvider.f37462f.getValue();
            Context context = partnerAuthenticationProvider.f37458b;
            Class<TokenActivity> cls = TokenActivity.class;
            fVar.f37485f = gVar;
            fVar.f37501v = fVar.f37497r;
            C0005b.f11i = context.getApplicationContext();
            Intent intent = new Intent(context, cls);
            Intent intent2 = new Intent(context, cls);
            C17153d dVar = new C17153d(Uri.parse(fVar.f37484e.f40514d), Uri.parse(fVar.f37484e.f40513c), (Uri) null);
            if (fVar.f37486g == null) {
                fVar.f37486g = C17131a.m28574b(context);
            }
            fVar.f37486g.mo61650c(new C17148a(dVar));
            fVar.mo61661a(dVar, intent, intent2);
            return;
        }
        partnerAuthenticationProvider.mo61644a(m28571e("native_auth_partner_authenticate_web_login", "initiated", "triggeredWebAuth"));
        ((C17136f) partnerAuthenticationProvider.f37462f.getValue()).mo61663c(gVar, partnerAuthenticationProvider.f37458b);
    }

    /* renamed from: c */
    public static final TrackingEvent.Error m28570c(PartnerAuthenticationProvider partnerAuthenticationProvider, String str) {
        partnerAuthenticationProvider.getClass();
        if (str == null) {
            str = "GENERIC_ERROR_MESSAGE";
        }
        return new TrackingEvent.Error("native_auth_partner_authentication", str, EventsNameKt.FAILED, (String) null, (String) null, (String) null, (String) null, Tenant.PayPal.name(), (String) null, (String) null, (String) null, 1912, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static TrackingEvent.Impression m28571e(String str, String str2, String str3) {
        return new TrackingEvent.Impression(str, str2, str3, (String) null, Tenant.PayPal.name(), (String) null, (String) null, (String) null, 232, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo61644a(TrackingEvent trackingEvent) {
        try {
            this.f37460d.trackEvent(trackingEvent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final void mo61645d(C17132b bVar, Authentication.Listener listener) {
        C19383o.m32797g(listener, "authListener");
        mo61644a(m28571e("native_auth_partner_authentication", EventsNameKt.TRIGGERED, (String) null));
        this.f37463g = listener;
        ((C18830c) this.f37461e.getValue()).authenticate(new C17128c(bVar), new C17129d(this));
        C8115a.m16322a(this.f37458b).mo20708b(this.f37464h, new IntentFilter("forgotUserNameReceiver"));
    }
}
