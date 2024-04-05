package com.paypal.pyplcheckout.billingagreements.repo;

import android.content.Context;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class BillingAgreementsDaoImpl_Factory implements C17555d<BillingAgreementsDaoImpl> {
    private final C19011a<Context> contextProvider;

    public BillingAgreementsDaoImpl_Factory(C19011a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static BillingAgreementsDaoImpl_Factory create(C19011a<Context> aVar) {
        return new BillingAgreementsDaoImpl_Factory(aVar);
    }

    public static BillingAgreementsDaoImpl newInstance(Context context) {
        return new BillingAgreementsDaoImpl(context);
    }

    public BillingAgreementsDaoImpl get() {
        return newInstance(this.contextProvider.get());
    }
}
