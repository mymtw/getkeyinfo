package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Cart {
    @C18417a("amounts")
    private final CartAmounts amounts;
    @C18417a("billingAddress")
    private final CartAddress billingAddress;
    @C18417a("billingToken")
    private final String billingToken;
    @C18417a("billingType")
    private final BillingType billingType;
    @C18417a("cancelUrl")
    private final Url cancelUrl;
    @C18417a("cartId")
    private final String cartId;
    @C18417a("description")
    private final String description;
    @C18417a("intent")
    private final String intent;
    @C18417a("items")
    private final List<Item> items;
    @C18417a("paymentId")
    private final String paymentId;
    @C18417a("returnUrl")
    private final ReturnUrl returnUrl;
    @C18417a("shippingAddress")
    private final CartAddress shippingAddress;
    @C18417a("shippingMethods")
    private final List<ShippingMethods> shippingMethods;
    @C18417a("total")
    private final Amount total;
    @C18417a("totalAllowedOverCaptureAmount")
    private final Amount totalAllowedOverCaptureAmount;

    public Cart() {
        this((String) null, (String) null, (BillingType) null, (String) null, (String) null, (List) null, (CartAmounts) null, (String) null, (Url) null, (ReturnUrl) null, (Amount) null, (List) null, (CartAddress) null, (CartAddress) null, (Amount) null, 32767, (DefaultConstructorMarker) null);
    }

    public Cart(String str, String str2, BillingType billingType2, String str3, String str4, List<Item> list, CartAmounts cartAmounts, String str5, Url url, ReturnUrl returnUrl2, Amount amount, List<ShippingMethods> list2, CartAddress cartAddress, CartAddress cartAddress2, Amount amount2) {
        this.cartId = str;
        this.intent = str2;
        this.billingType = billingType2;
        this.paymentId = str3;
        this.billingToken = str4;
        this.items = list;
        this.amounts = cartAmounts;
        this.description = str5;
        this.cancelUrl = url;
        this.returnUrl = returnUrl2;
        this.total = amount;
        this.shippingMethods = list2;
        this.shippingAddress = cartAddress;
        this.billingAddress = cartAddress2;
        this.totalAllowedOverCaptureAmount = amount2;
    }

    public static /* synthetic */ Cart copy$default(Cart cart, String str, String str2, BillingType billingType2, String str3, String str4, List list, CartAmounts cartAmounts, String str5, Url url, ReturnUrl returnUrl2, Amount amount, List list2, CartAddress cartAddress, CartAddress cartAddress2, Amount amount2, int i, Object obj) {
        Cart cart2 = cart;
        int i2 = i;
        return cart.copy((i2 & 1) != 0 ? cart2.cartId : str, (i2 & 2) != 0 ? cart2.intent : str2, (i2 & 4) != 0 ? cart2.billingType : billingType2, (i2 & 8) != 0 ? cart2.paymentId : str3, (i2 & 16) != 0 ? cart2.billingToken : str4, (i2 & 32) != 0 ? cart2.items : list, (i2 & 64) != 0 ? cart2.amounts : cartAmounts, (i2 & 128) != 0 ? cart2.description : str5, (i2 & 256) != 0 ? cart2.cancelUrl : url, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? cart2.returnUrl : returnUrl2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? cart2.total : amount, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? cart2.shippingMethods : list2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? cart2.shippingAddress : cartAddress, (i2 & 8192) != 0 ? cart2.billingAddress : cartAddress2, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? cart2.totalAllowedOverCaptureAmount : amount2);
    }

    public final String component1() {
        return this.cartId;
    }

    public final ReturnUrl component10() {
        return this.returnUrl;
    }

    public final Amount component11() {
        return this.total;
    }

    public final List<ShippingMethods> component12() {
        return this.shippingMethods;
    }

    public final CartAddress component13() {
        return this.shippingAddress;
    }

    public final CartAddress component14() {
        return this.billingAddress;
    }

    public final Amount component15() {
        return this.totalAllowedOverCaptureAmount;
    }

    public final String component2() {
        return this.intent;
    }

    public final BillingType component3() {
        return this.billingType;
    }

    public final String component4() {
        return this.paymentId;
    }

    public final String component5() {
        return this.billingToken;
    }

    public final List<Item> component6() {
        return this.items;
    }

    public final CartAmounts component7() {
        return this.amounts;
    }

    public final String component8() {
        return this.description;
    }

    public final Url component9() {
        return this.cancelUrl;
    }

    public final Cart copy(String str, String str2, BillingType billingType2, String str3, String str4, List<Item> list, CartAmounts cartAmounts, String str5, Url url, ReturnUrl returnUrl2, Amount amount, List<ShippingMethods> list2, CartAddress cartAddress, CartAddress cartAddress2, Amount amount2) {
        return new Cart(str, str2, billingType2, str3, str4, list, cartAmounts, str5, url, returnUrl2, amount, list2, cartAddress, cartAddress2, amount2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) obj;
        return C19383o.m32792b(this.cartId, cart.cartId) && C19383o.m32792b(this.intent, cart.intent) && this.billingType == cart.billingType && C19383o.m32792b(this.paymentId, cart.paymentId) && C19383o.m32792b(this.billingToken, cart.billingToken) && C19383o.m32792b(this.items, cart.items) && C19383o.m32792b(this.amounts, cart.amounts) && C19383o.m32792b(this.description, cart.description) && C19383o.m32792b(this.cancelUrl, cart.cancelUrl) && C19383o.m32792b(this.returnUrl, cart.returnUrl) && C19383o.m32792b(this.total, cart.total) && C19383o.m32792b(this.shippingMethods, cart.shippingMethods) && C19383o.m32792b(this.shippingAddress, cart.shippingAddress) && C19383o.m32792b(this.billingAddress, cart.billingAddress) && C19383o.m32792b(this.totalAllowedOverCaptureAmount, cart.totalAllowedOverCaptureAmount);
    }

    public final CartAmounts getAmounts() {
        return this.amounts;
    }

    public final CartAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final String getBillingToken() {
        return this.billingToken;
    }

    public final BillingType getBillingType() {
        return this.billingType;
    }

    public final Url getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final ReturnUrl getReturnUrl() {
        return this.returnUrl;
    }

    public final CartAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final List<ShippingMethods> getShippingMethods() {
        return this.shippingMethods;
    }

    public final Amount getTotal() {
        return this.total;
    }

    public final Amount getTotalAllowedOverCaptureAmount() {
        return this.totalAllowedOverCaptureAmount;
    }

    public int hashCode() {
        String str = this.cartId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.intent;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BillingType billingType2 = this.billingType;
        int hashCode3 = (hashCode2 + (billingType2 == null ? 0 : billingType2.hashCode())) * 31;
        String str3 = this.paymentId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingToken;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Item> list = this.items;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        CartAmounts cartAmounts = this.amounts;
        int hashCode7 = (hashCode6 + (cartAmounts == null ? 0 : cartAmounts.hashCode())) * 31;
        String str5 = this.description;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Url url = this.cancelUrl;
        int hashCode9 = (hashCode8 + (url == null ? 0 : url.hashCode())) * 31;
        ReturnUrl returnUrl2 = this.returnUrl;
        int hashCode10 = (hashCode9 + (returnUrl2 == null ? 0 : returnUrl2.hashCode())) * 31;
        Amount amount = this.total;
        int hashCode11 = (hashCode10 + (amount == null ? 0 : amount.hashCode())) * 31;
        List<ShippingMethods> list2 = this.shippingMethods;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CartAddress cartAddress = this.shippingAddress;
        int hashCode13 = (hashCode12 + (cartAddress == null ? 0 : cartAddress.hashCode())) * 31;
        CartAddress cartAddress2 = this.billingAddress;
        int hashCode14 = (hashCode13 + (cartAddress2 == null ? 0 : cartAddress2.hashCode())) * 31;
        Amount amount2 = this.totalAllowedOverCaptureAmount;
        if (amount2 != null) {
            i = amount2.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        String str = this.cartId;
        String str2 = this.intent;
        BillingType billingType2 = this.billingType;
        String str3 = this.paymentId;
        String str4 = this.billingToken;
        List<Item> list = this.items;
        CartAmounts cartAmounts = this.amounts;
        String str5 = this.description;
        Url url = this.cancelUrl;
        ReturnUrl returnUrl2 = this.returnUrl;
        Amount amount = this.total;
        List<ShippingMethods> list2 = this.shippingMethods;
        CartAddress cartAddress = this.shippingAddress;
        CartAddress cartAddress2 = this.billingAddress;
        StringBuilder f = C0388a.m1050f("Cart(cartId=", str, ", intent=", str2, ", billingType=");
        f.append(billingType2);
        f.append(", paymentId=");
        f.append(str3);
        f.append(", billingToken=");
        f.append(str4);
        f.append(", items=");
        f.append(list);
        f.append(", amounts=");
        f.append(cartAmounts);
        f.append(", description=");
        f.append(str5);
        f.append(", cancelUrl=");
        f.append(url);
        f.append(", returnUrl=");
        f.append(returnUrl2);
        f.append(", total=");
        f.append(amount);
        f.append(", shippingMethods=");
        f.append(list2);
        f.append(", shippingAddress=");
        f.append(cartAddress);
        f.append(", billingAddress=");
        f.append(cartAddress2);
        f.append(", totalAllowedOverCaptureAmount=");
        f.append(this.totalAllowedOverCaptureAmount);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Cart(java.lang.String r17, java.lang.String r18, com.paypal.pyplcheckout.pojo.BillingType r19, java.lang.String r20, java.lang.String r21, java.util.List r22, com.paypal.pyplcheckout.pojo.CartAmounts r23, java.lang.String r24, com.paypal.pyplcheckout.pojo.Url r25, com.paypal.pyplcheckout.pojo.ReturnUrl r26, com.paypal.pyplcheckout.pojo.Amount r27, java.util.List r28, com.paypal.pyplcheckout.pojo.CartAddress r29, com.paypal.pyplcheckout.pojo.CartAddress r30, com.paypal.pyplcheckout.pojo.Amount r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Cart.<init>(java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.BillingType, java.lang.String, java.lang.String, java.util.List, com.paypal.pyplcheckout.pojo.CartAmounts, java.lang.String, com.paypal.pyplcheckout.pojo.Url, com.paypal.pyplcheckout.pojo.ReturnUrl, com.paypal.pyplcheckout.pojo.Amount, java.util.List, com.paypal.pyplcheckout.pojo.CartAddress, com.paypal.pyplcheckout.pojo.CartAddress, com.paypal.pyplcheckout.pojo.Amount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
