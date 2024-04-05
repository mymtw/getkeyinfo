package com.paypal.checkout.order.billingagreements;

public abstract class BillingAgreementActionsModule {
    public abstract ExecuteBillingAgreementAction provideExecuteBillingAgreementAction(ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl);
}
