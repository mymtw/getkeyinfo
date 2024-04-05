package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.pojo.AddCardError;
import kotlin.jvm.internal.C19383o;

public final class AddCardUseCaseKt {
    public static final String FI_CONFIRMATION_CONTINGENCY = "FI_CONFIRMATION_CONTINGENCY";

    public static /* synthetic */ void getFI_CONFIRMATION_CONTINGENCY$annotations() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = r2.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isAuthenticationError(com.paypal.pyplcheckout.pojo.AddCardError r2) {
        /*
            java.lang.Integer r2 = r2.getStatusCode()
            r0 = 0
            if (r2 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r2 = r2.intValue()
            r1 = 400(0x190, float:5.6E-43)
            if (r1 > r2) goto L_0x0015
            r1 = 404(0x194, float:5.66E-43)
            if (r2 >= r1) goto L_0x0015
            r0 = 1
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addcard.usecase.AddCardUseCaseKt.isAuthenticationError(com.paypal.pyplcheckout.pojo.AddCardError):boolean");
    }

    /* access modifiers changed from: private */
    public static final boolean isThreeDsContingency(AddCardError addCardError) {
        return C19383o.m32792b(addCardError.getContingency(), Boolean.TRUE) && C19383o.m32792b(addCardError.getMessage(), FI_CONFIRMATION_CONTINGENCY);
    }
}
