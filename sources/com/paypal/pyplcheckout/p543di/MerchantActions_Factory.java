package com.paypal.pyplcheckout.p543di;

import com.paypal.checkout.approve.Approval;
import dagger.internal.C17555d;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.MerchantActions_Factory */
public final class MerchantActions_Factory implements C17555d<MerchantActions> {
    private final C19011a<Approval> approvalProvider;

    public MerchantActions_Factory(C19011a<Approval> aVar) {
        this.approvalProvider = aVar;
    }

    public static MerchantActions_Factory create(C19011a<Approval> aVar) {
        return new MerchantActions_Factory(aVar);
    }

    public static MerchantActions newInstance(Approval approval) {
        return new MerchantActions(approval);
    }

    public MerchantActions get() {
        return newInstance(this.approvalProvider.get());
    }
}
