package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ApprovePayment {
    @C18417a("buyer")
    private final Buyer buyer;
    @C18417a("cart")
    private final Cart cart;
    @C18417a("paymentContingencies")
    private final PaymentContingencies paymentContingencies;
    @C18417a("shippingAddresses")
    private final List<Address> shippingAddresses;

    public ApprovePayment(PaymentContingencies paymentContingencies2, Cart cart2, Buyer buyer2, List<Address> list) {
        this.paymentContingencies = paymentContingencies2;
        this.cart = cart2;
        this.buyer = buyer2;
        this.shippingAddresses = list;
    }

    public static /* synthetic */ ApprovePayment copy$default(ApprovePayment approvePayment, PaymentContingencies paymentContingencies2, Cart cart2, Buyer buyer2, List<Address> list, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentContingencies2 = approvePayment.paymentContingencies;
        }
        if ((i & 2) != 0) {
            cart2 = approvePayment.cart;
        }
        if ((i & 4) != 0) {
            buyer2 = approvePayment.buyer;
        }
        if ((i & 8) != 0) {
            list = approvePayment.shippingAddresses;
        }
        return approvePayment.copy(paymentContingencies2, cart2, buyer2, list);
    }

    public final PaymentContingencies component1() {
        return this.paymentContingencies;
    }

    public final Cart component2() {
        return this.cart;
    }

    public final Buyer component3() {
        return this.buyer;
    }

    public final List<Address> component4() {
        return this.shippingAddresses;
    }

    public final ApprovePayment copy(PaymentContingencies paymentContingencies2, Cart cart2, Buyer buyer2, List<Address> list) {
        return new ApprovePayment(paymentContingencies2, cart2, buyer2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApprovePayment)) {
            return false;
        }
        ApprovePayment approvePayment = (ApprovePayment) obj;
        return C19383o.m32792b(this.paymentContingencies, approvePayment.paymentContingencies) && C19383o.m32792b(this.cart, approvePayment.cart) && C19383o.m32792b(this.buyer, approvePayment.buyer) && C19383o.m32792b(this.shippingAddresses, approvePayment.shippingAddresses);
    }

    public final Buyer getBuyer() {
        return this.buyer;
    }

    public final Cart getCart() {
        return this.cart;
    }

    public final PaymentContingencies getPaymentContingencies() {
        return this.paymentContingencies;
    }

    public final List<Address> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public int hashCode() {
        PaymentContingencies paymentContingencies2 = this.paymentContingencies;
        int i = 0;
        int hashCode = (paymentContingencies2 == null ? 0 : paymentContingencies2.hashCode()) * 31;
        Cart cart2 = this.cart;
        int hashCode2 = (hashCode + (cart2 == null ? 0 : cart2.hashCode())) * 31;
        Buyer buyer2 = this.buyer;
        int hashCode3 = (hashCode2 + (buyer2 == null ? 0 : buyer2.hashCode())) * 31;
        List<Address> list = this.shippingAddresses;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        PaymentContingencies paymentContingencies2 = this.paymentContingencies;
        Cart cart2 = this.cart;
        Buyer buyer2 = this.buyer;
        List<Address> list = this.shippingAddresses;
        return "ApprovePayment(paymentContingencies=" + paymentContingencies2 + ", cart=" + cart2 + ", buyer=" + buyer2 + ", shippingAddresses=" + list + ")";
    }
}
