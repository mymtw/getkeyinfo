package com.paypal.pyplcheckout.pojo.firebase;

import p650pn.C18417a;

public final class IndefiniteFallbackRequest implements MessageData {
    @C18417a("billingToken")
    private String billingToken;
    @C18417a("buttonSessionID")
    private String buttonSessionId;
    @C18417a("message")
    private String message;
    @C18417a("opType")
    private String opType;
    @C18417a("orderID")
    private String orderId;
    @C18417a("payerID")
    private String payerId;
    @C18417a("paymentID")
    private String paymentId;
    @C18417a("skip_native_duration")
    private Long skipNativeDuration;
    @C18417a("token")
    private String token;
    @C18417a("type")
    private String type;

    public IndefiniteFallbackRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l) {
        this.orderId = str;
        this.opType = str2;
        this.paymentId = str3;
        this.billingToken = str4;
        this.payerId = str5;
        this.token = str6;
        this.message = str7;
        this.buttonSessionId = str8;
        this.type = str9;
        this.skipNativeDuration = l;
    }

    public String getBillingToken() {
        return this.billingToken;
    }

    public String getButtonSessionId() {
        return this.buttonSessionId;
    }

    public String getMessage() {
        return this.message;
    }

    public String getOpType() {
        return this.opType;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPayerId() {
        return this.payerId;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public final Long getSkipNativeDuration() {
        return this.skipNativeDuration;
    }

    public String getToken() {
        return this.token;
    }

    public final String getType() {
        return this.type;
    }

    public void setBillingToken(String str) {
        this.billingToken = str;
    }

    public void setButtonSessionId(String str) {
        this.buttonSessionId = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setOpType(String str) {
        this.opType = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPayerId(String str) {
        this.payerId = str;
    }

    public void setPaymentId(String str) {
        this.paymentId = str;
    }

    public final void setSkipNativeDuration(Long l) {
        this.skipNativeDuration = l;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IndefiniteFallbackRequest(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Long r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0012
        L_0x0010:
            r5 = r16
        L_0x0012:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0018
            r6 = r2
            goto L_0x001a
        L_0x0018:
            r6 = r17
        L_0x001a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0020
            r7 = r2
            goto L_0x0022
        L_0x0020:
            r7 = r18
        L_0x0022:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0028
            r8 = r2
            goto L_0x002a
        L_0x0028:
            r8 = r19
        L_0x002a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0030
            r9 = r2
            goto L_0x0032
        L_0x0030:
            r9 = r20
        L_0x0032:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0038
            r10 = r2
            goto L_0x003a
        L_0x0038:
            r10 = r21
        L_0x003a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
            r11 = r2
            goto L_0x0042
        L_0x0040:
            r11 = r22
        L_0x0042:
            r3 = r14
            r12 = r23
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.firebase.IndefiniteFallbackRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
