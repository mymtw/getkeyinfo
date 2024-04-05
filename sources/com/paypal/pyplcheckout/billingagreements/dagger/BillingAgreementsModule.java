package com.paypal.pyplcheckout.billingagreements.dagger;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsDao;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsDaoImpl;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepositoryImpl;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;

public final class BillingAgreementsModule {
    public final BillingAgreementsDao providesBillingAgreementsDao(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new BillingAgreementsDaoImpl(context);
    }

    public final BillingAgreementsRepository providesBillingAgreementsRepository(BillingAgreementsDao billingAgreementsDao, C19525d0 d0Var) {
        C19383o.m32797g(billingAgreementsDao, "dao");
        C19383o.m32797g(d0Var, "scope");
        return new BillingAgreementsRepositoryImpl(billingAgreementsDao, d0Var);
    }
}
