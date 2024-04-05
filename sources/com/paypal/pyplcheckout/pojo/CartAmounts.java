package com.paypal.pyplcheckout.pojo;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CartAmounts {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("handlingFee")
    private final Amount handlingFee;
    @C18417a("insurance")
    private final Amount insurance;
    @C18417a("shippingAndHandling")
    private final Amount shippingAndHandling;
    @C18417a("shippingDiscount")
    private final Amount shippingDiscount;
    @C18417a("subtotal")
    private final Amount subtotal;
    @C18417a("tax")
    private final Amount tax;
    @C18417a("total")
    private final Amount total;

    public CartAmounts() {
        this((Amount) null, (Amount) null, (Amount) null, (Amount) null, (Amount) null, (Amount) null, (Amount) null, (Map) null, 255, (DefaultConstructorMarker) null);
    }

    public CartAmounts(Amount amount, Amount amount2, Amount amount3, Amount amount4, Amount amount5, Amount amount6, Amount amount7, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.handlingFee = amount;
        this.insurance = amount2;
        this.shippingAndHandling = amount3;
        this.shippingDiscount = amount4;
        this.subtotal = amount5;
        this.tax = amount6;
        this.total = amount7;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CartAmounts copy$default(CartAmounts cartAmounts, Amount amount, Amount amount2, Amount amount3, Amount amount4, Amount amount5, Amount amount6, Amount amount7, Map map, int i, Object obj) {
        CartAmounts cartAmounts2 = cartAmounts;
        int i2 = i;
        return cartAmounts.copy((i2 & 1) != 0 ? cartAmounts2.handlingFee : amount, (i2 & 2) != 0 ? cartAmounts2.insurance : amount2, (i2 & 4) != 0 ? cartAmounts2.shippingAndHandling : amount3, (i2 & 8) != 0 ? cartAmounts2.shippingDiscount : amount4, (i2 & 16) != 0 ? cartAmounts2.subtotal : amount5, (i2 & 32) != 0 ? cartAmounts2.tax : amount6, (i2 & 64) != 0 ? cartAmounts2.total : amount7, (i2 & 128) != 0 ? cartAmounts2.additionalProperties : map);
    }

    public final Amount component1() {
        return this.handlingFee;
    }

    public final Amount component2() {
        return this.insurance;
    }

    public final Amount component3() {
        return this.shippingAndHandling;
    }

    public final Amount component4() {
        return this.shippingDiscount;
    }

    public final Amount component5() {
        return this.subtotal;
    }

    public final Amount component6() {
        return this.tax;
    }

    public final Amount component7() {
        return this.total;
    }

    public final Map<String, Object> component8() {
        return this.additionalProperties;
    }

    public final CartAmounts copy(Amount amount, Amount amount2, Amount amount3, Amount amount4, Amount amount5, Amount amount6, Amount amount7, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new CartAmounts(amount, amount2, amount3, amount4, amount5, amount6, amount7, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartAmounts)) {
            return false;
        }
        CartAmounts cartAmounts = (CartAmounts) obj;
        return C19383o.m32792b(this.handlingFee, cartAmounts.handlingFee) && C19383o.m32792b(this.insurance, cartAmounts.insurance) && C19383o.m32792b(this.shippingAndHandling, cartAmounts.shippingAndHandling) && C19383o.m32792b(this.shippingDiscount, cartAmounts.shippingDiscount) && C19383o.m32792b(this.subtotal, cartAmounts.subtotal) && C19383o.m32792b(this.tax, cartAmounts.tax) && C19383o.m32792b(this.total, cartAmounts.total) && C19383o.m32792b(this.additionalProperties, cartAmounts.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Amount getHandlingFee() {
        return this.handlingFee;
    }

    public final Amount getInsurance() {
        return this.insurance;
    }

    public final Amount getShippingAndHandling() {
        return this.shippingAndHandling;
    }

    public final Amount getShippingDiscount() {
        return this.shippingDiscount;
    }

    public final Amount getSubtotal() {
        return this.subtotal;
    }

    public final Amount getTax() {
        return this.tax;
    }

    public final Amount getTotal() {
        return this.total;
    }

    public int hashCode() {
        Amount amount = this.handlingFee;
        int i = 0;
        int hashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.insurance;
        int hashCode2 = (hashCode + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.shippingAndHandling;
        int hashCode3 = (hashCode2 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        Amount amount4 = this.shippingDiscount;
        int hashCode4 = (hashCode3 + (amount4 == null ? 0 : amount4.hashCode())) * 31;
        Amount amount5 = this.subtotal;
        int hashCode5 = (hashCode4 + (amount5 == null ? 0 : amount5.hashCode())) * 31;
        Amount amount6 = this.tax;
        int hashCode6 = (hashCode5 + (amount6 == null ? 0 : amount6.hashCode())) * 31;
        Amount amount7 = this.total;
        if (amount7 != null) {
            i = amount7.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode6 + i) * 31);
    }

    public String toString() {
        Amount amount = this.handlingFee;
        Amount amount2 = this.insurance;
        Amount amount3 = this.shippingAndHandling;
        Amount amount4 = this.shippingDiscount;
        Amount amount5 = this.subtotal;
        Amount amount6 = this.tax;
        Amount amount7 = this.total;
        Map<String, Object> map = this.additionalProperties;
        return "CartAmounts(handlingFee=" + amount + ", insurance=" + amount2 + ", shippingAndHandling=" + amount3 + ", shippingDiscount=" + amount4 + ", subtotal=" + amount5 + ", tax=" + amount6 + ", total=" + amount7 + ", additionalProperties=" + map + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CartAmounts(com.paypal.pyplcheckout.pojo.Amount r10, com.paypal.pyplcheckout.pojo.Amount r11, com.paypal.pyplcheckout.pojo.Amount r12, com.paypal.pyplcheckout.pojo.Amount r13, com.paypal.pyplcheckout.pojo.Amount r14, com.paypal.pyplcheckout.pojo.Amount r15, com.paypal.pyplcheckout.pojo.Amount r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
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
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L_0x0040
        L_0x003e:
            r0 = r17
        L_0x0040:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r2
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.CartAmounts.<init>(com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
