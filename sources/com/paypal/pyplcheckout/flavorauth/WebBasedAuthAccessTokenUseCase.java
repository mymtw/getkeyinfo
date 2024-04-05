package com.paypal.pyplcheckout.flavorauth;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.authcore.authentication.C17136f;
import com.paypal.pyplcheckout.auth.AuthListener;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p651po.C18420a;
import p651po.C18421b;

public final class WebBasedAuthAccessTokenUseCase {
    private final C19285c authenticator$delegate = C19350d.m32677b(new WebBasedAuthAccessTokenUseCase$authenticator$2(this));
    /* access modifiers changed from: private */
    public final DebugConfigManager debugConfigManager;
    /* access modifiers changed from: private */
    public final FoundationRiskConfig foundationRiskConfig;

    public WebBasedAuthAccessTokenUseCase(DebugConfigManager debugConfigManager2, FoundationRiskConfig foundationRiskConfig2) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(foundationRiskConfig2, "foundationRiskConfig");
        this.debugConfigManager = debugConfigManager2;
        this.foundationRiskConfig = foundationRiskConfig2;
    }

    /* access modifiers changed from: private */
    public final C17136f createAuthenticator() {
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
        Map<String, String> s0 = C19294b0.m32562s0(new Pair("redirect_uri", "nativexo://paypalpay"), new Pair("signup_redirect_uri", "nativexo://paypalpay"), new Pair("flowName", ThirdPartyAuth.nativeXoFlowName), new Pair("metadata_id", this.debugConfigManager.getCheckoutToken()), new Pair(ResponseConstants.PROMPT, EventsNameKt.LOGIN));
        C18421b bVar = new C18421b(this.debugConfigManager.getClientId(), str, str2);
        bVar.f40520d = s0;
        return new C17136f(this.debugConfigManager.getProviderContext(), new C18420a(bVar), new C17222x5f5b21c9(this));
    }

    public final C17136f getAuthenticator() {
        return (C17136f) this.authenticator$delegate.getValue();
    }

    public final void invoke(AuthListener authListener) {
        getAuthenticator().mo61663c(new WebBasedAuthAccessTokenUseCase$invoke$authDelegate$1(authListener, this), this.debugConfigManager.getProviderContext());
    }
}
