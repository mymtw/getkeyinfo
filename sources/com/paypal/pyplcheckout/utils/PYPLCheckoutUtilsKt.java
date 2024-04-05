package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.exception.CheckoutCancelReason;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;

public final class PYPLCheckoutUtilsKt {
    /* access modifiers changed from: private */
    public static final CheckoutCancelReason getCancelReason(ReturnToProviderOperationType returnToProviderOperationType) {
        return returnToProviderOperationType instanceof ReturnToProviderOperationType.Cancel ? CheckoutCancelReason.USER_CANCELLED : CheckoutCancelReason.CHECKOUT_ERROR;
    }

    @IgnoreGeneratedTestReport
    public static final boolean isDebug() {
        return false;
    }
}
