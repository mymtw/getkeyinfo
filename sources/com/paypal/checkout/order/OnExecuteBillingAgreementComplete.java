package com.paypal.checkout.order;

import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface OnExecuteBillingAgreementComplete {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnExecuteBillingAgreementComplete invoke(C19857l<? super ExecuteBillingAgreementResult, C19394m> lVar) {
            C19383o.m32797g(lVar, "executeBillingAgreementComplete");
            return new OnExecuteBillingAgreementComplete$Companion$invoke$1(lVar);
        }
    }

    void onExecuteBillingAgreementComplete(ExecuteBillingAgreementResult executeBillingAgreementResult);
}
