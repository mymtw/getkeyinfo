package com.paypal.pyplcheckout.p543di;

import com.paypal.checkout.approve.Approval;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.di.MerchantActions */
public final class MerchantActions {
    private final Approval approval;

    public MerchantActions(Approval approval2) {
        C19383o.m32797g(approval2, "approval");
        this.approval = approval2;
    }

    public final Approval getApproval() {
        return this.approval;
    }
}
