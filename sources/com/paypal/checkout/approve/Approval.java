package com.paypal.checkout.approve;

import com.paypal.checkout.order.OrderActions;
import kotlin.jvm.internal.C19383o;

public final class Approval {
    private ApprovalData internalApprovalData;
    private final OrderActions orderActions;

    public Approval(OrderActions orderActions2) {
        C19383o.m32797g(orderActions2, "orderActions");
        this.orderActions = orderActions2;
    }

    public final ApprovalData getData() {
        ApprovalData approvalData = this.internalApprovalData;
        C19383o.m32794d(approvalData);
        return approvalData;
    }

    public final ApprovalData getInternalApprovalData$pyplcheckout_externalThreedsRelease() {
        return this.internalApprovalData;
    }

    public final OrderActions getOrderActions() {
        return this.orderActions;
    }

    public final void setInternalApprovalData$pyplcheckout_externalThreedsRelease(ApprovalData approvalData) {
        this.internalApprovalData = approvalData;
    }
}
