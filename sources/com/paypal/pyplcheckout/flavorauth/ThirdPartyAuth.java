package com.paypal.pyplcheckout.flavorauth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.authcore.authentication.C17136f;
import com.paypal.authcore.authentication.TokenActivity;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17153d;
import com.paypal.openid.C17156f;
import com.paypal.pyplcheckout.addcard.UpgradeAccessTokenListener;
import com.paypal.pyplcheckout.auth.AuthListener;
import com.paypal.pyplcheckout.auth.UserAuthentication;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.userprofile.usecase.GetCachedClientIdUseCase;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p651po.C18420a;
import p651po.C18421b;
import p668ro.C18504c;

public final class ThirdPartyAuth implements UserAuthentication {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String NATIVEXO_SCOPES = "https://uri.paypal.com/web/experience/incontextxo";
    /* access modifiers changed from: private */
    public static final String TAG = "ThirdPartyAuth";
    public static final String nativeXoFlowName = "nativeXO";
    private final AbManager abManager;
    private C17136f authenticator = getAuthenticator();
    /* access modifiers changed from: private */
    public final DebugConfigManager debugConfigManager;
    /* access modifiers changed from: private */
    public final FoundationRiskConfig foundationRiskConfig;
    private final GetCachedClientIdUseCase getCachedClientIdUseCase;
    private final LogoutUseCase logoutUseCase;
    private final MerchantConfigRepository merchantConfigRepository;
    private final NativeAuthAccessTokenUseCase nativeAuthAccessTokenUseCase;
    private boolean nativeOtpEnabled;
    /* access modifiers changed from: private */
    public final UpgradeAuthAccessTokenUseCase upgradeAuthAccessTokenUseCase;
    private final WebBasedAuthAccessTokenUseCase webBasedAuthAccessTokenUseCase;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return ThirdPartyAuth.TAG;
        }
    }

    public ThirdPartyAuth(DebugConfigManager debugConfigManager2, FoundationRiskConfig foundationRiskConfig2, AbManager abManager2, MerchantConfigRepository merchantConfigRepository2, NativeAuthAccessTokenUseCase nativeAuthAccessTokenUseCase2, UpgradeAuthAccessTokenUseCase upgradeAuthAccessTokenUseCase2, WebBasedAuthAccessTokenUseCase webBasedAuthAccessTokenUseCase2, LogoutUseCase logoutUseCase2, GetCachedClientIdUseCase getCachedClientIdUseCase2) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(foundationRiskConfig2, "foundationRiskConfig");
        C19383o.m32797g(abManager2, "abManager");
        C19383o.m32797g(merchantConfigRepository2, "merchantConfigRepository");
        C19383o.m32797g(nativeAuthAccessTokenUseCase2, "nativeAuthAccessTokenUseCase");
        C19383o.m32797g(upgradeAuthAccessTokenUseCase2, "upgradeAuthAccessTokenUseCase");
        C19383o.m32797g(webBasedAuthAccessTokenUseCase2, "webBasedAuthAccessTokenUseCase");
        C19383o.m32797g(logoutUseCase2, "logoutUseCase");
        C19383o.m32797g(getCachedClientIdUseCase2, "getCachedClientIdUseCase");
        this.debugConfigManager = debugConfigManager2;
        this.foundationRiskConfig = foundationRiskConfig2;
        this.abManager = abManager2;
        this.merchantConfigRepository = merchantConfigRepository2;
        this.nativeAuthAccessTokenUseCase = nativeAuthAccessTokenUseCase2;
        this.upgradeAuthAccessTokenUseCase = upgradeAuthAccessTokenUseCase2;
        this.webBasedAuthAccessTokenUseCase = webBasedAuthAccessTokenUseCase2;
        this.logoutUseCase = logoutUseCase2;
        this.getCachedClientIdUseCase = getCachedClientIdUseCase2;
        setupUpgradeAccessTokenDelegate();
    }

    private final C17136f getAuthenticator() {
        String str;
        String str2;
        String environment = this.debugConfigManager.getCheckoutEnvironment().getEnvironment();
        environment.getClass();
        char c = 65535;
        switch (environment.hashCode()) {
            case -764914009:
                if (environment.equals("Sandbox")) {
                    c = 0;
                    break;
                }
                break;
            case 2403754:
                if (environment.equals("Mock")) {
                    c = 1;
                    break;
                }
                break;
            case 1370789555:
                if (environment.equals("Stage133")) {
                    c = 2;
                    break;
                }
                break;
            case 1370823160:
                if (environment.equals("StageT24")) {
                    c = 3;
                    break;
                }
                break;
            case 1379812394:
                if (environment.equals("Unknown")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
                str2 = "https://www.sandbox.paypal.com/connect";
                str = "https://www.sandbox.paypal.com/v1/oauth2/token";
                break;
            case 1:
                str2 = "https://www.paypal.com/signin/authorize";
                str = "https://private-ff00bf-manibrundha.apiary-mock.com/v1/oauth2/token";
                break;
            case 2:
                str2 = "https://www.stage2d0133.stage.paypal.com/connect";
                str = "https://www.stage2d0133.stage.paypal.com/v1/oauth2/token";
                break;
            case 3:
                str2 = "https://api.test24.stage.paypal.com/connect";
                str = "https://api.test24.stage.paypal.com/v1/oauth2/token";
                break;
            default:
                str2 = "https://www.paypal.com/connect";
                str = "https://api.paypal.com/v1/oauth2/token";
                break;
        }
        Map<String, String> s0 = C19294b0.m32562s0(new Pair("redirect_uri", "nativexo://paypalpay"), new Pair("signup_redirect_uri", "nativexo://paypalpay"), new Pair("flowName", nativeXoFlowName), new Pair("metadata_id", this.debugConfigManager.getCheckoutToken()), new Pair(ResponseConstants.PROMPT, EventsNameKt.LOGIN));
        C18421b bVar = new C18421b(this.debugConfigManager.getClientId(), str, str2);
        bVar.f40520d = s0;
        return new C17136f(this.debugConfigManager.getProviderContext(), new C18420a(bVar), new ThirdPartyAuth$getAuthenticator$riskDelegate$1(this));
    }

    /* access modifiers changed from: private */
    public final void getFullAuthenticatedAccessToken(UpgradeAccessTokenListener upgradeAccessTokenListener) {
        C17156f fVar;
        String str;
        C17136f fVar2 = this.authenticator;
        ThirdPartyAuth$getFullAuthenticatedAccessToken$1 thirdPartyAuth$getFullAuthenticatedAccessToken$1 = new ThirdPartyAuth$getFullAuthenticatedAccessToken$1(this, upgradeAccessTokenListener);
        Context providerContext = this.debugConfigManager.getProviderContext();
        Class<TokenActivity> cls = TokenActivity.class;
        fVar2.f37485f = thirdPartyAuth$getFullAuthenticatedAccessToken$1;
        try {
            C0005b.f11i = providerContext.getApplicationContext();
            String str2 = fVar2.f37495p;
            if (str2 == null || str2.compareToIgnoreCase("loggedIn") != 0 || (fVar = fVar2.f37496q) == null || (str = fVar.f37614c) == null || str.isEmpty()) {
                C17153d dVar = new C17153d(Uri.parse(fVar2.f37484e.f40514d), Uri.parse(fVar2.f37484e.f40513c), (Uri) null);
                fVar2.f37501v = fVar2.f37497r;
                Intent intent = new Intent(fVar2.f37487h, cls);
                Intent intent2 = new Intent(fVar2.f37487h, cls);
                String str3 = fVar2.f37484e.f40513c;
                C18504c cVar = C18504c.f40748e;
                cVar.mo70011d();
                cVar.mo70010c("authUrl", str3);
                fVar2.mo61661a(dVar, intent, intent2);
                return;
            }
            fVar2.f37485f.completeWithSuccess(fVar2.f37496q);
        } catch (Exception unused) {
            fVar2.f37485f.completeWithFailure((AuthorizationException) null);
        }
    }

    private final void getWebBasedAuthAccessToken(AuthListener authListener) {
        this.webBasedAuthAccessTokenUseCase.invoke(authListener);
    }

    private final void setupUpgradeAccessTokenDelegate() {
        this.merchantConfigRepository.setUpgradeAccessToken(new C17221x16e652ac(this));
    }

    public final boolean getNativeOtpEnabled() {
        return this.nativeOtpEnabled;
    }

    public void getUserAccessToken(AuthListener authListener) {
        ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.NATIVE_OTP_AUTHENTICATION, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Success) {
            boolean b = C19383o.m32792b(ElmoTreatment.NATIVE_OTP_AUTHENTICATION_TRMT.getTreatmentName(), ((ExperimentResponse.Success) treatment).getResponse().getTreatmentName());
            this.nativeOtpEnabled = b;
            if (b) {
                if (this.getCachedClientIdUseCase.invoke()) {
                    this.logoutUseCase.invoke();
                }
                this.nativeAuthAccessTokenUseCase.invoke(authListener);
                return;
            }
            getWebBasedAuthAccessToken(authListener);
            return;
        }
        getWebBasedAuthAccessToken(authListener);
    }

    public void logoutUser(AuthListener authListener) {
        if (this.nativeOtpEnabled) {
            this.logoutUseCase.invoke();
        } else {
            C17136f fVar = this.authenticator;
            fVar.f37496q = null;
            fVar.f37495p = "";
            C18504c.f40748e.mo70011d();
            this.authenticator = getAuthenticator();
        }
        getUserAccessToken(authListener);
    }

    public final void setNativeOtpEnabled(boolean z) {
        this.nativeOtpEnabled = z;
    }
}
