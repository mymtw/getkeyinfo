package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase;
import com.paypal.pyplcheckout.services.api.ApproveMemberPaymentApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import okhttp3.C20011u;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$3 extends Lambda implements C19857l<String, ApproveMemberPaymentApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$3 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$3();

    public AuthenticatedApiFactory$Companion$initializeFactories$3() {
        super(1);
    }

    public final ApproveMemberPaymentApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new ApproveMemberPaymentApi(str, (C20011u.C20012a) null, (BillingAgreementsGetBalancePrefUseCase) null, 6, (DefaultConstructorMarker) null);
    }
}
