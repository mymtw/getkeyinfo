package com.paypal.pyplcheckout.billingagreements.repo;

import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class BillingAgreementsRepositoryImpl_Factory implements C17555d<BillingAgreementsRepositoryImpl> {
    private final C19011a<BillingAgreementsDao> daoProvider;
    private final C19011a<C19525d0> scopeProvider;

    public BillingAgreementsRepositoryImpl_Factory(C19011a<BillingAgreementsDao> aVar, C19011a<C19525d0> aVar2) {
        this.daoProvider = aVar;
        this.scopeProvider = aVar2;
    }

    public static BillingAgreementsRepositoryImpl_Factory create(C19011a<BillingAgreementsDao> aVar, C19011a<C19525d0> aVar2) {
        return new BillingAgreementsRepositoryImpl_Factory(aVar, aVar2);
    }

    public static BillingAgreementsRepositoryImpl newInstance(BillingAgreementsDao billingAgreementsDao, C19525d0 d0Var) {
        return new BillingAgreementsRepositoryImpl(billingAgreementsDao, d0Var);
    }

    public BillingAgreementsRepositoryImpl get() {
        return newInstance(this.daoProvider.get(), this.scopeProvider.get());
    }
}
