package com.paypal.pyplcheckout.billingagreements.repo;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;

public interface BillingAgreementsDao {
    void clear();

    boolean getAlwaysUseBalancePreference();

    String getBillingAgreementToken();

    BillingAgreementType getBillingAgreementType();

    void setAlwaysUseBalancePreference(boolean z);

    void setBillingAgreementToken(String str);

    void setBillingAgreementType(BillingAgreementType billingAgreementType);
}
