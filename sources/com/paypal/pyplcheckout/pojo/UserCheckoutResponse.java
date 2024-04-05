package com.paypal.pyplcheckout.pojo;

import java.util.List;
import p650pn.C18417a;

public final class UserCheckoutResponse {
    @C18417a("data")
    private Data data;
    @C18417a("errors")
    private List<Error> errors;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r1 = r1.getCheckoutSession();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean checkForUnSupportedFlows() {
        /*
            r5 = this;
            com.paypal.pyplcheckout.di.SdkComponent$Companion r0 = com.paypal.pyplcheckout.p543di.SdkComponent.Companion
            com.paypal.pyplcheckout.di.SdkComponent r0 = r0.getInstance()
            com.paypal.pyplcheckout.services.Repository r0 = r0.getRepository()
            com.paypal.pyplcheckout.pojo.Data r1 = r5.data
            r2 = 0
            if (r1 != 0) goto L_0x0011
        L_0x000f:
            r1 = r2
            goto L_0x001c
        L_0x0011:
            com.paypal.pyplcheckout.pojo.CheckoutSession r1 = r1.getCheckoutSession()
            if (r1 != 0) goto L_0x0018
            goto L_0x000f
        L_0x0018:
            com.paypal.pyplcheckout.pojo.Flags r1 = r1.getFlags()
        L_0x001c:
            r3 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r3
            goto L_0x002b
        L_0x0021:
            java.lang.Boolean r1 = r1.isBillingAgreement()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r4)
        L_0x002b:
            if (r1 == 0) goto L_0x004b
            com.paypal.pyplcheckout.model.DebugConfigManager r1 = com.paypal.pyplcheckout.model.DebugConfigManager.getInstance()
            boolean r1 = r1.shouldEnableBillingAgreements()
            if (r1 != 0) goto L_0x004b
            com.paypal.pyplcheckout.ab.featureflag.Feature r1 = com.paypal.pyplcheckout.p539ab.featureflag.Feature.NATIVE_BA
            r4 = 2
            com.paypal.pyplcheckout.ab.featureflag.FeatureResponse r1 = com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager.isEnabled$default(r1, r3, r4, r2)
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x004a
            boolean r0 = r0.isVaultFlow()
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r3 = 1
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.UserCheckoutResponse.checkForUnSupportedFlows():boolean");
    }

    public final Data getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final String getFirstError() {
        Error error;
        List<Error> list = this.errors;
        if (list == null || (error = list.get(0)) == null) {
            return null;
        }
        return error.getMessage();
    }

    public final boolean hasContingencyErrors() {
        List<Error> list = this.errors;
        if (list == null) {
            return false;
        }
        return ErrorKt.containsContingencies(list);
    }

    public final boolean hasUnsupportedContingencies() {
        CheckoutSession checkoutSession;
        Data data2 = this.data;
        PaymentContingencies paymentContingencies = null;
        if (!(data2 == null || (checkoutSession = data2.getCheckoutSession()) == null)) {
            paymentContingencies = checkoutSession.getPaymentContingencies();
        }
        if (paymentContingencies == null) {
            return false;
        }
        return (paymentContingencies.getConfirmCreditCardCvvData() == null && paymentContingencies.getSepaMandateAcceptanceNeeded() == null && paymentContingencies.getNeedConsentForBankAccountInfoRetrieval() == null && paymentContingencies.getNeedRealTimeBalanceForBankAccount() == null) ? false : true;
    }

    public final void setData(Data data2) {
        this.data = data2;
    }

    public final void setErrors(List<Error> list) {
        this.errors = list;
    }
}
