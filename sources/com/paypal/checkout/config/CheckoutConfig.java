package com.paypal.checkout.config;

import android.app.Application;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CheckoutConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EMPTY_CLIENT_ID = "Your clientId is empty! Ensure you're passing the clientId from the PayPal Developer Portal.";
    public static final String INVALID_RETURN_URL = "Check your returnUrl! It should contain your app's package name appended with \"://paypalpay\".";
    private final Application application;
    private final String clientId;
    private final CurrencyCode currencyCode;
    private final Environment environment;
    private final PaymentButtonIntent paymentButtonIntent;
    private final SettingsConfig settingsConfig;
    private final UIConfig uiConfig;
    private final UserAction userAction;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CheckoutConfig(Application application2, String str, Environment environment2) {
        this(application2, str, environment2, (CurrencyCode) null, (UserAction) null, (PaymentButtonIntent) null, (SettingsConfig) null, (UIConfig) null, 248, (DefaultConstructorMarker) null);
        C19383o.m32797g(application2, "application");
        C19383o.m32797g(str, "clientId");
        C19383o.m32797g(environment2, "environment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CheckoutConfig(Application application2, String str, Environment environment2, CurrencyCode currencyCode2) {
        this(application2, str, environment2, currencyCode2, (UserAction) null, (PaymentButtonIntent) null, (SettingsConfig) null, (UIConfig) null, 240, (DefaultConstructorMarker) null);
        C19383o.m32797g(application2, "application");
        C19383o.m32797g(str, "clientId");
        C19383o.m32797g(environment2, "environment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CheckoutConfig(Application application2, String str, Environment environment2, CurrencyCode currencyCode2, UserAction userAction2) {
        this(application2, str, environment2, currencyCode2, userAction2, (PaymentButtonIntent) null, (SettingsConfig) null, (UIConfig) null, 224, (DefaultConstructorMarker) null);
        C19383o.m32797g(application2, "application");
        C19383o.m32797g(str, "clientId");
        C19383o.m32797g(environment2, "environment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CheckoutConfig(Application application2, String str, Environment environment2, CurrencyCode currencyCode2, UserAction userAction2, PaymentButtonIntent paymentButtonIntent2) {
        this(application2, str, environment2, currencyCode2, userAction2, paymentButtonIntent2, (SettingsConfig) null, (UIConfig) null, 192, (DefaultConstructorMarker) null);
        C19383o.m32797g(application2, "application");
        C19383o.m32797g(str, "clientId");
        C19383o.m32797g(environment2, "environment");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckoutConfig(android.app.Application r13, java.lang.String r14, com.paypal.checkout.config.Environment r15, com.paypal.checkout.createorder.CurrencyCode r16, com.paypal.checkout.createorder.UserAction r17, com.paypal.checkout.config.PaymentButtonIntent r18, com.paypal.checkout.config.SettingsConfig r19) {
        /*
            r12 = this;
            java.lang.String r0 = "application"
            r2 = r13
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "clientId"
            r3 = r14
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.lang.String r0 = "environment"
            r4 = r15
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "settingsConfig"
            r8 = r19
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            r9 = 0
            r10 = 128(0x80, float:1.794E-43)
            r11 = 0
            r1 = r12
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.config.CheckoutConfig.<init>(android.app.Application, java.lang.String, com.paypal.checkout.config.Environment, com.paypal.checkout.createorder.CurrencyCode, com.paypal.checkout.createorder.UserAction, com.paypal.checkout.config.PaymentButtonIntent, com.paypal.checkout.config.SettingsConfig):void");
    }

    public CheckoutConfig(Application application2, String str, Environment environment2, CurrencyCode currencyCode2, UserAction userAction2, PaymentButtonIntent paymentButtonIntent2, SettingsConfig settingsConfig2, UIConfig uIConfig) {
        C19383o.m32797g(application2, "application");
        C19383o.m32797g(str, "clientId");
        C19383o.m32797g(environment2, "environment");
        C19383o.m32797g(settingsConfig2, "settingsConfig");
        C19383o.m32797g(uIConfig, "uiConfig");
        this.application = application2;
        this.clientId = str;
        this.environment = environment2;
        this.currencyCode = currencyCode2;
        this.userAction = userAction2;
        this.paymentButtonIntent = paymentButtonIntent2;
        this.settingsConfig = settingsConfig2;
        this.uiConfig = uIConfig;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final CurrencyCode getCurrencyCode() {
        return this.currencyCode;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final PaymentButtonIntent getPaymentButtonIntent() {
        return this.paymentButtonIntent;
    }

    public final SettingsConfig getSettingsConfig() {
        return this.settingsConfig;
    }

    public final UIConfig getUiConfig() {
        return this.uiConfig;
    }

    public final UserAction getUserAction() {
        return this.userAction;
    }

    public final void verifyConfig$pyplcheckout_externalThreedsRelease() {
        if (this.clientId.length() == 0) {
            throw new IllegalArgumentException(EMPTY_CLIENT_ID);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckoutConfig(android.app.Application r13, java.lang.String r14, com.paypal.checkout.config.Environment r15, com.paypal.checkout.createorder.CurrencyCode r16, com.paypal.checkout.createorder.UserAction r17, com.paypal.checkout.config.PaymentButtonIntent r18, com.paypal.checkout.config.SettingsConfig r19, com.paypal.checkout.config.UIConfig r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r17
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L_0x0028
            com.paypal.checkout.config.SettingsConfig r1 = new com.paypal.checkout.config.SettingsConfig
            r4 = 3
            r1.<init>(r3, r3, r4, r2)
            r10 = r1
            goto L_0x002a
        L_0x0028:
            r10 = r19
        L_0x002a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0036
            com.paypal.checkout.config.UIConfig r0 = new com.paypal.checkout.config.UIConfig
            r1 = 1
            r0.<init>(r3, r1, r2)
            r11 = r0
            goto L_0x0038
        L_0x0036:
            r11 = r20
        L_0x0038:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.config.CheckoutConfig.<init>(android.app.Application, java.lang.String, com.paypal.checkout.config.Environment, com.paypal.checkout.createorder.CurrencyCode, com.paypal.checkout.createorder.UserAction, com.paypal.checkout.config.PaymentButtonIntent, com.paypal.checkout.config.SettingsConfig, com.paypal.checkout.config.UIConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
