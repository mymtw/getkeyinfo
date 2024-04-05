package com.paypal.pyplcheckout.billingagreements.repo;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import kotlinx.coroutines.flow.C19689x1;

public interface BillingAgreementsRepository {
    void clear();

    C19689x1<Boolean> getAlwaysUseBalancePreference();

    C19689x1<BillingAgreementState> getBillingAgreementSessionState();

    String getBillingAgreementToken();

    void setAlwaysUseBalancePreference(boolean z);

    void setBillingAgreementSessionType(BillingAgreementType billingAgreementType);

    void setBillingAgreementToken(String str);
}
