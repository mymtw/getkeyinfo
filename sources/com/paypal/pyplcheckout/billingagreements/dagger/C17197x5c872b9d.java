package com.paypal.pyplcheckout.billingagreements.dagger;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsDao;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.billingagreements.dagger.BillingAgreementsModule_ProvidesBillingAgreementsRepositoryFactory */
public final class C17197x5c872b9d implements C17555d<BillingAgreementsRepository> {
    private final C19011a<BillingAgreementsDao> daoProvider;
    private final BillingAgreementsModule module;
    private final C19011a<C19525d0> scopeProvider;

    public C17197x5c872b9d(BillingAgreementsModule billingAgreementsModule, C19011a<BillingAgreementsDao> aVar, C19011a<C19525d0> aVar2) {
        this.module = billingAgreementsModule;
        this.daoProvider = aVar;
        this.scopeProvider = aVar2;
    }

    public static C17197x5c872b9d create(BillingAgreementsModule billingAgreementsModule, C19011a<BillingAgreementsDao> aVar, C19011a<C19525d0> aVar2) {
        return new C17197x5c872b9d(billingAgreementsModule, aVar, aVar2);
    }

    public static BillingAgreementsRepository providesBillingAgreementsRepository(BillingAgreementsModule billingAgreementsModule, BillingAgreementsDao billingAgreementsDao, C19525d0 d0Var) {
        BillingAgreementsRepository providesBillingAgreementsRepository = billingAgreementsModule.providesBillingAgreementsRepository(billingAgreementsDao, d0Var);
        C17782b.m29841G(providesBillingAgreementsRepository);
        return providesBillingAgreementsRepository;
    }

    public BillingAgreementsRepository get() {
        return providesBillingAgreementsRepository(this.module, this.daoProvider.get(), this.scopeProvider.get());
    }
}
