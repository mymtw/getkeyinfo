package com.paypal.pyplcheckout.flavorauth;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.authcore.authentication.PartnerAuthenticationProvider;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p651po.C18420a;
import p651po.C18421b;
import p716xo.C18833e;

public final class PartnerAuthenticationProviderFactory {
    /* access modifiers changed from: private */
    public final DebugConfigManager debugConfigManager;
    /* access modifiers changed from: private */
    public final FoundationRiskConfig foundationRiskConfig;
    private final C19285c partnerAuthenticationProvider$delegate = C19350d.m32677b(new C17220x5ec26f94(this));
    /* access modifiers changed from: private */
    public final ThirdPartyAuthPresenter thirdPartyAuthPresenter;
    /* access modifiers changed from: private */
    public final ThirdPartyTrackingDelegate thirdPartyTrackingDelegate;

    public PartnerAuthenticationProviderFactory(DebugConfigManager debugConfigManager2, FoundationRiskConfig foundationRiskConfig2, ThirdPartyAuthPresenter thirdPartyAuthPresenter2, ThirdPartyTrackingDelegate thirdPartyTrackingDelegate2) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(foundationRiskConfig2, "foundationRiskConfig");
        C19383o.m32797g(thirdPartyAuthPresenter2, "thirdPartyAuthPresenter");
        C19383o.m32797g(thirdPartyTrackingDelegate2, "thirdPartyTrackingDelegate");
        this.debugConfigManager = debugConfigManager2;
        this.foundationRiskConfig = foundationRiskConfig2;
        this.thirdPartyAuthPresenter = thirdPartyAuthPresenter2;
        this.thirdPartyTrackingDelegate = thirdPartyTrackingDelegate2;
    }

    /* access modifiers changed from: private */
    public final C18420a getAuthClientConfig() {
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
        return new C18420a(bVar);
    }

    private final PartnerAuthenticationProvider getPartnerAuthenticationProvider() {
        return (PartnerAuthenticationProvider) this.partnerAuthenticationProvider$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C18833e getRiskDelegate() {
        return new PartnerAuthenticationProviderFactory$getRiskDelegate$1(this);
    }

    public final PartnerAuthenticationProvider invoke() {
        return getPartnerAuthenticationProvider();
    }
}
