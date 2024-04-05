package com.paypal.pyplcheckout.flavorauth;

import android.content.Context;
import com.paypal.authcore.authentication.PartnerAuthenticationProvider;
import com.paypal.platform.authsdk.AuthProviders;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p651po.C18420a;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.flavorauth.PartnerAuthenticationProviderFactory$partnerAuthenticationProvider$2 */
public final class C17220x5ec26f94 extends Lambda implements C19846a<PartnerAuthenticationProvider> {
    public final /* synthetic */ PartnerAuthenticationProviderFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17220x5ec26f94(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        super(0);
        this.this$0 = partnerAuthenticationProviderFactory;
    }

    public final PartnerAuthenticationProvider invoke() {
        AuthProviders authProviders = new AuthProviders(this.this$0.thirdPartyAuthPresenter, this.this$0.getRiskDelegate(), this.this$0.thirdPartyTrackingDelegate);
        C18420a access$getAuthClientConfig = this.this$0.getAuthClientConfig();
        Context providerContext = this.this$0.debugConfigManager.getProviderContext();
        C19383o.m32796f(providerContext, "debugConfigManager.providerContext");
        return new PartnerAuthenticationProvider(access$getAuthClientConfig, providerContext, authProviders);
    }
}
