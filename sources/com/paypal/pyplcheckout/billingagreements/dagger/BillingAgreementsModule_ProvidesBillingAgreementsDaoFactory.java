package com.paypal.pyplcheckout.billingagreements.dagger;

import android.content.Context;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsDao;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

public final class BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory implements C17555d<BillingAgreementsDao> {
    private final C19011a<Context> contextProvider;
    private final BillingAgreementsModule module;

    public BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory(BillingAgreementsModule billingAgreementsModule, C19011a<Context> aVar) {
        this.module = billingAgreementsModule;
        this.contextProvider = aVar;
    }

    public static BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory create(BillingAgreementsModule billingAgreementsModule, C19011a<Context> aVar) {
        return new BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory(billingAgreementsModule, aVar);
    }

    public static BillingAgreementsDao providesBillingAgreementsDao(BillingAgreementsModule billingAgreementsModule, Context context) {
        BillingAgreementsDao providesBillingAgreementsDao = billingAgreementsModule.providesBillingAgreementsDao(context);
        C17782b.m29841G(providesBillingAgreementsDao);
        return providesBillingAgreementsDao;
    }

    public BillingAgreementsDao get() {
        return providesBillingAgreementsDao(this.module, this.contextProvider.get());
    }
}
