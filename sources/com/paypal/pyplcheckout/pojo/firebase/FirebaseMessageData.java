package com.paypal.pyplcheckout.pojo.firebase;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class FirebaseMessageData implements MessageData {
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
    @C18417a("token")
    private String token;

    public FirebaseMessageData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public FirebaseMessageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.orderId = str;
        this.opType = str2;
        this.paymentId = str3;
        this.billingToken = str4;
        this.payerId = str5;
        this.token = str6;
        this.message = str7;
        this.buttonSessionId = str8;
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

    public String getToken() {
        return this.token;
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

    public void setToken(String str) {
        this.token = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FirebaseMessageData(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
