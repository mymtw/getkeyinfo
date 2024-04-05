package com.paypal.checkout.order;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class BreakDown {
    private final UnitAmount discount;
    private final UnitAmount handling;
    @C18417a("item_total")
    private final UnitAmount itemTotal;
    private final UnitAmount shipping;
    @C18417a("shipping_discount")
    private final UnitAmount shippingDiscount;
    @C18417a("tax_total")
    private final UnitAmount taxTotal;

    public static final class Builder {
        private UnitAmount discount;
        private UnitAmount handling;
        private UnitAmount itemTotal;
        private UnitAmount shipping;
        private UnitAmount shippingDiscount;
        private UnitAmount taxTotal;

        public final BreakDown build() {
            return new BreakDown(this.itemTotal, this.shipping, this.handling, this.taxTotal, this.shippingDiscount, this.discount);
        }

        public final Builder discount(UnitAmount unitAmount) {
            this.discount = unitAmount;
            return this;
        }

        public final Builder handling(UnitAmount unitAmount) {
            this.handling = unitAmount;
            return this;
        }

        public final Builder itemTotal(UnitAmount unitAmount) {
            this.itemTotal = unitAmount;
            return this;
        }

        public final Builder shipping(UnitAmount unitAmount) {
            this.shipping = unitAmount;
            return this;
        }

        public final Builder shippingDiscount(UnitAmount unitAmount) {
            this.shippingDiscount = unitAmount;
            return this;
        }

        public final Builder taxTotal(UnitAmount unitAmount) {
            this.taxTotal = unitAmount;
            return this;
        }
    }

    public BreakDown() {
        this((UnitAmount) null, (UnitAmount) null, (UnitAmount) null, (UnitAmount) null, (UnitAmount) null, (UnitAmount) null, 63, (DefaultConstructorMarker) null);
    }

    public BreakDown(UnitAmount unitAmount, UnitAmount unitAmount2, UnitAmount unitAmount3, UnitAmount unitAmount4, UnitAmount unitAmount5, UnitAmount unitAmount6) {
        this.itemTotal = unitAmount;
        this.shipping = unitAmount2;
        this.handling = unitAmount3;
        this.taxTotal = unitAmount4;
        this.shippingDiscount = unitAmount5;
        this.discount = unitAmount6;
    }

    public static /* synthetic */ BreakDown copy$default(BreakDown breakDown, UnitAmount unitAmount, UnitAmount unitAmount2, UnitAmount unitAmount3, UnitAmount unitAmount4, UnitAmount unitAmount5, UnitAmount unitAmount6, int i, Object obj) {
        if ((i & 1) != 0) {
            unitAmount = breakDown.itemTotal;
        }
        if ((i & 2) != 0) {
            unitAmount2 = breakDown.shipping;
        }
        UnitAmount unitAmount7 = unitAmount2;
        if ((i & 4) != 0) {
            unitAmount3 = breakDown.handling;
        }
        UnitAmount unitAmount8 = unitAmount3;
        if ((i & 8) != 0) {
            unitAmount4 = breakDown.taxTotal;
        }
        UnitAmount unitAmount9 = unitAmount4;
        if ((i & 16) != 0) {
            unitAmount5 = breakDown.shippingDiscount;
        }
        UnitAmount unitAmount10 = unitAmount5;
        if ((i & 32) != 0) {
            unitAmount6 = breakDown.discount;
        }
        return breakDown.copy(unitAmount, unitAmount7, unitAmount8, unitAmount9, unitAmount10, unitAmount6);
    }

    public final UnitAmount component1() {
        return this.itemTotal;
    }

    public final UnitAmount component2() {
        return this.shipping;
    }

    public final UnitAmount component3() {
        return this.handling;
    }

    public final UnitAmount component4() {
        return this.taxTotal;
    }

    public final UnitAmount component5() {
        return this.shippingDiscount;
    }

    public final UnitAmount component6() {
        return this.discount;
    }

    public final BreakDown copy(UnitAmount unitAmount, UnitAmount unitAmount2, UnitAmount unitAmount3, UnitAmount unitAmount4, UnitAmount unitAmount5, UnitAmount unitAmount6) {
        return new BreakDown(unitAmount, unitAmount2, unitAmount3, unitAmount4, unitAmount5, unitAmount6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BreakDown)) {
            return false;
        }
        BreakDown breakDown = (BreakDown) obj;
        return C19383o.m32792b(this.itemTotal, breakDown.itemTotal) && C19383o.m32792b(this.shipping, breakDown.shipping) && C19383o.m32792b(this.handling, breakDown.handling) && C19383o.m32792b(this.taxTotal, breakDown.taxTotal) && C19383o.m32792b(this.shippingDiscount, breakDown.shippingDiscount) && C19383o.m32792b(this.discount, breakDown.discount);
    }

    public final UnitAmount getDiscount() {
        return this.discount;
    }

    public final UnitAmount getHandling() {
        return this.handling;
    }

    public final UnitAmount getItemTotal() {
        return this.itemTotal;
    }

    public final UnitAmount getShipping() {
        return this.shipping;
    }

    public final UnitAmount getShippingDiscount() {
        return this.shippingDiscount;
    }

    public final UnitAmount getTaxTotal() {
        return this.taxTotal;
    }

    public int hashCode() {
        UnitAmount unitAmount = this.itemTotal;
        int i = 0;
        int hashCode = (unitAmount == null ? 0 : unitAmount.hashCode()) * 31;
        UnitAmount unitAmount2 = this.shipping;
        int hashCode2 = (hashCode + (unitAmount2 == null ? 0 : unitAmount2.hashCode())) * 31;
        UnitAmount unitAmount3 = this.handling;
        int hashCode3 = (hashCode2 + (unitAmount3 == null ? 0 : unitAmount3.hashCode())) * 31;
        UnitAmount unitAmount4 = this.taxTotal;
        int hashCode4 = (hashCode3 + (unitAmount4 == null ? 0 : unitAmount4.hashCode())) * 31;
        UnitAmount unitAmount5 = this.shippingDiscount;
        int hashCode5 = (hashCode4 + (unitAmount5 == null ? 0 : unitAmount5.hashCode())) * 31;
        UnitAmount unitAmount6 = this.discount;
        if (unitAmount6 != null) {
            i = unitAmount6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        UnitAmount unitAmount = this.itemTotal;
        UnitAmount unitAmount2 = this.shipping;
        UnitAmount unitAmount3 = this.handling;
        UnitAmount unitAmount4 = this.taxTotal;
        UnitAmount unitAmount5 = this.shippingDiscount;
        UnitAmount unitAmount6 = this.discount;
        return "BreakDown(itemTotal=" + unitAmount + ", shipping=" + unitAmount2 + ", handling=" + unitAmount3 + ", taxTotal=" + unitAmount4 + ", shippingDiscount=" + unitAmount5 + ", discount=" + unitAmount6 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BreakDown(com.paypal.checkout.order.UnitAmount r6, com.paypal.checkout.order.UnitAmount r7, com.paypal.checkout.order.UnitAmount r8, com.paypal.checkout.order.UnitAmount r9, com.paypal.checkout.order.UnitAmount r10, com.paypal.checkout.order.UnitAmount r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.BreakDown.<init>(com.paypal.checkout.order.UnitAmount, com.paypal.checkout.order.UnitAmount, com.paypal.checkout.order.UnitAmount, com.paypal.checkout.order.UnitAmount, com.paypal.checkout.order.UnitAmount, com.paypal.checkout.order.UnitAmount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
