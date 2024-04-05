package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ApprovePaymentResponse {
    @C18417a("data")
    private final ApprovePaymentData data;
    @C18417a("errors")
    private final List<Error> errors;

    public ApprovePaymentResponse(ApprovePaymentData approvePaymentData, List<Error> list) {
        this.data = approvePaymentData;
        this.errors = list;
    }

    public static /* synthetic */ ApprovePaymentResponse copy$default(ApprovePaymentResponse approvePaymentResponse, ApprovePaymentData approvePaymentData, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            approvePaymentData = approvePaymentResponse.data;
        }
        if ((i & 2) != 0) {
            list = approvePaymentResponse.errors;
        }
        return approvePaymentResponse.copy(approvePaymentData, list);
    }

    public final ApprovePaymentData component1() {
        return this.data;
    }

    public final List<Error> component2() {
        return this.errors;
    }

    public final ApprovePaymentResponse copy(ApprovePaymentData approvePaymentData, List<Error> list) {
        return new ApprovePaymentResponse(approvePaymentData, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[Catch:{ JSONException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[Catch:{ JSONException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055 A[Catch:{ JSONException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b A[Catch:{ JSONException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[Catch:{ JSONException -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void createFinalResponseObject(com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r9, com.paypal.pyplcheckout.utils.ReturnToProviderOperationType r10) {
        /*
            r8 = this;
            java.lang.String r0 = "firebaseMessageData"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "opType"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            com.paypal.pyplcheckout.model.DebugConfigManager r0 = com.paypal.pyplcheckout.model.DebugConfigManager.getInstance()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = r0.getCheckoutToken()     // Catch:{ JSONException -> 0x008a }
            r9.setOrderId(r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = r10.toString()     // Catch:{ JSONException -> 0x008a }
            r9.setOpType(r0)     // Catch:{ JSONException -> 0x008a }
            com.paypal.pyplcheckout.pojo.ApprovePaymentData r0 = r8.data     // Catch:{ JSONException -> 0x008a }
            r1 = 0
            if (r0 != 0) goto L_0x0022
            goto L_0x007a
        L_0x0022:
            com.paypal.pyplcheckout.pojo.ApprovePayment r2 = r0.getApprovePayment()     // Catch:{ JSONException -> 0x008a }
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r1
            goto L_0x0035
        L_0x002a:
            com.paypal.pyplcheckout.pojo.Cart r2 = r2.getCart()     // Catch:{ JSONException -> 0x008a }
            if (r2 != 0) goto L_0x0031
            goto L_0x0028
        L_0x0031:
            java.lang.String r2 = r2.getPaymentId()     // Catch:{ JSONException -> 0x008a }
        L_0x0035:
            r9.setPaymentId(r2)     // Catch:{ JSONException -> 0x008a }
            com.paypal.pyplcheckout.pojo.ApprovePayment r2 = r0.getApprovePayment()     // Catch:{ JSONException -> 0x008a }
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r2 = r1
            goto L_0x004b
        L_0x0040:
            com.paypal.pyplcheckout.pojo.Cart r2 = r2.getCart()     // Catch:{ JSONException -> 0x008a }
            if (r2 != 0) goto L_0x0047
            goto L_0x003e
        L_0x0047:
            java.lang.String r2 = r2.getBillingToken()     // Catch:{ JSONException -> 0x008a }
        L_0x004b:
            r9.setBillingToken(r2)     // Catch:{ JSONException -> 0x008a }
            com.paypal.pyplcheckout.pojo.ApprovePayment r2 = r0.getApprovePayment()     // Catch:{ JSONException -> 0x008a }
            if (r2 != 0) goto L_0x0055
            goto L_0x0059
        L_0x0055:
            com.paypal.pyplcheckout.pojo.Buyer r1 = r2.getBuyer()     // Catch:{ JSONException -> 0x008a }
        L_0x0059:
            if (r1 == 0) goto L_0x006b
            com.paypal.pyplcheckout.pojo.ApprovePayment r0 = r0.getApprovePayment()     // Catch:{ JSONException -> 0x008a }
            com.paypal.pyplcheckout.pojo.Buyer r0 = r0.getBuyer()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r0 = r0.getUserId()     // Catch:{ JSONException -> 0x008a }
            r9.setPayerId(r0)     // Catch:{ JSONException -> 0x008a }
            goto L_0x0078
        L_0x006b:
            r0 = 0
            r1 = 0
            r2 = 0
            java.lang.String r4 = "no payerID present"
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E591     // Catch:{ JSONException -> 0x008a }
            r6 = 7
            r7 = 0
            r3 = r9
            com.paypal.pyplcheckout.utils.ErrorUtils.sendOnErrorMessageToFireBase$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ JSONException -> 0x008a }
        L_0x0078:
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ JSONException -> 0x008a }
        L_0x007a:
            if (r1 != 0) goto L_0x0097
            r0 = 0
            r1 = 0
            r2 = 0
            java.lang.String r4 = "Failed to parse finishPayment"
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E592     // Catch:{ JSONException -> 0x008a }
            r6 = 7
            r7 = 0
            r3 = r9
            com.paypal.pyplcheckout.utils.ErrorUtils.sendOnErrorMessageToFireBase$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ JSONException -> 0x008a }
            goto L_0x0097
        L_0x008a:
            r0 = 0
            r1 = 0
            r2 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E596
            r6 = 7
            r7 = 0
            java.lang.String r4 = "Failed to parse finishPayment"
            r3 = r9
            com.paypal.pyplcheckout.utils.ErrorUtils.sendOnErrorMessageToFireBase$default(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.ApprovePaymentResponse.createFinalResponseObject(com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData, com.paypal.pyplcheckout.utils.ReturnToProviderOperationType):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApprovePaymentResponse)) {
            return false;
        }
        ApprovePaymentResponse approvePaymentResponse = (ApprovePaymentResponse) obj;
        return C19383o.m32792b(this.data, approvePaymentResponse.data) && C19383o.m32792b(this.errors, approvePaymentResponse.errors);
    }

    public final ApprovePaymentData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final String getFirstErrorDetails() {
        List<Error> list = this.errors;
        Boolean bool = null;
        Error error = list == null ? null : (Error) C19327t.m32640V0(list);
        String message = error == null ? null : error.getMessage();
        Integer statusCode = error == null ? null : error.getStatusCode();
        if (error != null) {
            bool = error.getContingency();
        }
        return "message: " + message + " statusCode: " + statusCode + " contingency?: " + bool;
    }

    public final String getHref() {
        ApprovePayment approvePayment;
        Cart cart;
        ReturnUrl returnUrl;
        ApprovePaymentData approvePaymentData = this.data;
        if (approvePaymentData == null || (approvePayment = approvePaymentData.getApprovePayment()) == null || (cart = approvePayment.getCart()) == null || (returnUrl = cart.getReturnUrl()) == null) {
            return null;
        }
        return returnUrl.getHref();
    }

    public int hashCode() {
        ApprovePaymentData approvePaymentData = this.data;
        int i = 0;
        int hashCode = (approvePaymentData == null ? 0 : approvePaymentData.hashCode()) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        ApprovePaymentData approvePaymentData = this.data;
        List<Error> list = this.errors;
        return "ApprovePaymentResponse(data=" + approvePaymentData + ", errors=" + list + ")";
    }
}
