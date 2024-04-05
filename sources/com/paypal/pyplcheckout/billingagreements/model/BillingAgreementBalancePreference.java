package com.paypal.pyplcheckout.billingagreements.model;

public enum BillingAgreementBalancePreference {
    NONE(""),
    ENABLED("OPT_IN"),
    DISABLED("OPT_OUT");
    
    private final String graphQLValue;

    private BillingAgreementBalancePreference(String str) {
        this.graphQLValue = str;
    }

    public String toString() {
        return this.graphQLValue;
    }
}
