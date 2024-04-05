package com.paypal.pyplcheckout.pojo.firebase;

import androidx.core.internal.view.SupportMenu;
import com.paypal.checkout.order.Options;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p650pn.C18417a;

public final class ShippingDataRequest implements MessageData {
    @C18417a("billingToken")
    private String billingToken;
    @C18417a("buttonSessionID")
    private String buttonSessionId;
    @C18417a("country")
    private String country;
    @C18417a("line1")
    private String line1;
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
    @C18417a("paymentToken")
    private String paymentToken;
    @C18417a("postal_code")
    private String postalCode;
    @C18417a("selected_shipping_option_amount")
    private String selectedShippingOptionAmount;
    @C18417a("shipping_address")
    private JSONObject shippingAddress;
    @C18417a("shipping_options")
    private List<Options> shippingOptions;
    @C18417a("state")
    private String state;
    @C18417a("token")
    private String token;

    public ShippingDataRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (JSONObject) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, SupportMenu.USER_MASK, (DefaultConstructorMarker) null);
    }

    public ShippingDataRequest(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6, List<Options> list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.line1 = str;
        this.state = str2;
        this.postalCode = str3;
        this.country = str4;
        this.paymentToken = str5;
        this.shippingAddress = jSONObject;
        this.selectedShippingOptionAmount = str6;
        this.shippingOptions = list;
        this.orderId = str7;
        this.opType = str8;
        this.paymentId = str9;
        this.billingToken = str10;
        this.payerId = str11;
        this.token = str12;
        this.message = str13;
        this.buttonSessionId = str14;
    }

    public String getBillingToken() {
        return this.billingToken;
    }

    public String getButtonSessionId() {
        return this.buttonSessionId;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLine1() {
        return this.line1;
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

    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getSelectedShippingOptionAmount() {
        return this.selectedShippingOptionAmount;
    }

    public final JSONObject getShippingAddress() {
        return this.shippingAddress;
    }

    public final List<Options> getShippingOptions() {
        return this.shippingOptions;
    }

    public final String getState() {
        return this.state;
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

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setLine1(String str) {
        this.line1 = str;
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

    public final void setPaymentToken(String str) {
        this.paymentToken = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setSelectedShippingOptionAmount(String str) {
        this.selectedShippingOptionAmount = str;
    }

    public final void setShippingAddress(JSONObject jSONObject) {
        this.shippingAddress = jSONObject;
    }

    public final void setShippingOptions(List<Options> list) {
        this.shippingOptions = list;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShippingDataRequest(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, org.json.JSONObject r23, java.lang.String r24, java.util.List r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r19
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r20
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r22
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r23
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r24
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r25
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r26
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r27
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r28
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r29
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r30
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r31
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r32
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r33
        L_0x0085:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.firebase.ShippingDataRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
