package com.paypal.checkout.paymentbutton;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19861p;

public interface PaymentButtonContainerViewState {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PaymentButtonContainerViewState invoke(C19846a<C19394m> aVar, C19861p<? super FundingEligibilityState, ? super Exception, C19394m> pVar) {
            C19383o.m32797g(aVar, "onLoading");
            C19383o.m32797g(pVar, "onFinish");
            return new PaymentButtonContainerViewState$Companion$invoke$1(aVar, pVar);
        }
    }

    void onFinish(FundingEligibilityState fundingEligibilityState, Exception exc);

    void onLoading();
}
