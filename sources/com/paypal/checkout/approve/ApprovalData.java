package com.paypal.checkout.approve;

import androidx.compose.animation.C0388a;
import com.paypal.pyplcheckout.pojo.Address;
import com.paypal.pyplcheckout.pojo.ApprovePayment;
import com.paypal.pyplcheckout.pojo.ApprovePaymentData;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.Buyer;
import com.paypal.pyplcheckout.pojo.Cart;
import com.paypal.pyplcheckout.pojo.VaultData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApprovalData {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String billingToken;
    private final Cart cart;
    private final String orderId;
    private final Buyer payer;
    private final String payerId;
    private final String paymentId;
    private final Address shippingAddress;
    private final VaultData vaultData;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApprovalData from(ApprovePaymentResponse approvePaymentResponse) {
            List<Address> shippingAddresses;
            boolean z;
            Cart cart;
            Cart cart2;
            Cart cart3;
            Buyer buyer;
            C19383o.m32797g(approvePaymentResponse, "approvePaymentResponse");
            ApprovePaymentData data = approvePaymentResponse.getData();
            T t = null;
            ApprovePayment approvePayment = data == null ? null : data.getApprovePayment();
            String userId = (approvePayment == null || (buyer = approvePayment.getBuyer()) == null) ? null : buyer.getUserId();
            String cartId = (approvePayment == null || (cart3 = approvePayment.getCart()) == null) ? null : cart3.getCartId();
            String paymentId = (approvePayment == null || (cart2 = approvePayment.getCart()) == null) ? null : cart2.getPaymentId();
            Buyer buyer2 = approvePayment == null ? null : approvePayment.getBuyer();
            Cart cart4 = approvePayment == null ? null : approvePayment.getCart();
            String billingToken = (approvePayment == null || (cart = approvePayment.getCart()) == null) ? null : cart.getBillingToken();
            if (!(approvePayment == null || (shippingAddresses = approvePayment.getShippingAddresses()) == null)) {
                Iterator<T> it = shippingAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    Boolean isSelected = ((Address) next).isSelected();
                    if (isSelected == null) {
                        z = false;
                        continue;
                    } else {
                        z = isSelected.booleanValue();
                        continue;
                    }
                    if (z) {
                        t = next;
                        break;
                    }
                }
                t = (Address) t;
            }
            return new ApprovalData(userId, cartId, paymentId, buyer2, cart4, t, (VaultData) null, billingToken, 64, (DefaultConstructorMarker) null);
        }
    }

    public ApprovalData(String str, String str2, String str3, Buyer buyer, Cart cart2, Address address, VaultData vaultData2, String str4) {
        this.payerId = str;
        this.orderId = str2;
        this.paymentId = str3;
        this.payer = buyer;
        this.cart = cart2;
        this.shippingAddress = address;
        this.vaultData = vaultData2;
        this.billingToken = str4;
    }

    public static /* synthetic */ ApprovalData copy$default(ApprovalData approvalData, String str, String str2, String str3, Buyer buyer, Cart cart2, Address address, VaultData vaultData2, String str4, int i, Object obj) {
        ApprovalData approvalData2 = approvalData;
        int i2 = i;
        return approvalData.copy((i2 & 1) != 0 ? approvalData2.payerId : str, (i2 & 2) != 0 ? approvalData2.orderId : str2, (i2 & 4) != 0 ? approvalData2.paymentId : str3, (i2 & 8) != 0 ? approvalData2.payer : buyer, (i2 & 16) != 0 ? approvalData2.cart : cart2, (i2 & 32) != 0 ? approvalData2.shippingAddress : address, (i2 & 64) != 0 ? approvalData2.vaultData : vaultData2, (i2 & 128) != 0 ? approvalData2.billingToken : str4);
    }

    public static final ApprovalData from(ApprovePaymentResponse approvePaymentResponse) {
        return Companion.from(approvePaymentResponse);
    }

    public static /* synthetic */ void getShippingAddress$annotations() {
    }

    public final String component1() {
        return this.payerId;
    }

    public final String component2() {
        return this.orderId;
    }

    public final String component3() {
        return this.paymentId;
    }

    public final Buyer component4() {
        return this.payer;
    }

    public final Cart component5() {
        return this.cart;
    }

    public final Address component6() {
        return this.shippingAddress;
    }

    public final VaultData component7() {
        return this.vaultData;
    }

    public final String component8() {
        return this.billingToken;
    }

    public final ApprovalData copy(String str, String str2, String str3, Buyer buyer, Cart cart2, Address address, VaultData vaultData2, String str4) {
        return new ApprovalData(str, str2, str3, buyer, cart2, address, vaultData2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApprovalData)) {
            return false;
        }
        ApprovalData approvalData = (ApprovalData) obj;
        return C19383o.m32792b(this.payerId, approvalData.payerId) && C19383o.m32792b(this.orderId, approvalData.orderId) && C19383o.m32792b(this.paymentId, approvalData.paymentId) && C19383o.m32792b(this.payer, approvalData.payer) && C19383o.m32792b(this.cart, approvalData.cart) && C19383o.m32792b(this.shippingAddress, approvalData.shippingAddress) && C19383o.m32792b(this.vaultData, approvalData.vaultData) && C19383o.m32792b(this.billingToken, approvalData.billingToken);
    }

    public final String getBillingToken() {
        return this.billingToken;
    }

    public final Cart getCart() {
        return this.cart;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Buyer getPayer() {
        return this.payer;
    }

    public final String getPayerId() {
        return this.payerId;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public final VaultData getVaultData() {
        return this.vaultData;
    }

    public int hashCode() {
        String str = this.payerId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Buyer buyer = this.payer;
        int hashCode4 = (hashCode3 + (buyer == null ? 0 : buyer.hashCode())) * 31;
        Cart cart2 = this.cart;
        int hashCode5 = (hashCode4 + (cart2 == null ? 0 : cart2.hashCode())) * 31;
        Address address = this.shippingAddress;
        int hashCode6 = (hashCode5 + (address == null ? 0 : address.hashCode())) * 31;
        VaultData vaultData2 = this.vaultData;
        int hashCode7 = (hashCode6 + (vaultData2 == null ? 0 : vaultData2.hashCode())) * 31;
        String str4 = this.billingToken;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.payerId;
        String str2 = this.orderId;
        String str3 = this.paymentId;
        Buyer buyer = this.payer;
        Cart cart2 = this.cart;
        Address address = this.shippingAddress;
        VaultData vaultData2 = this.vaultData;
        String str4 = this.billingToken;
        StringBuilder f = C0388a.m1050f("ApprovalData(payerId=", str, ", orderId=", str2, ", paymentId=");
        f.append(str3);
        f.append(", payer=");
        f.append(buyer);
        f.append(", cart=");
        f.append(cart2);
        f.append(", shippingAddress=");
        f.append(address);
        f.append(", vaultData=");
        f.append(vaultData2);
        f.append(", billingToken=");
        f.append(str4);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApprovalData(java.lang.String r13, java.lang.String r14, java.lang.String r15, com.paypal.pyplcheckout.pojo.Buyer r16, com.paypal.pyplcheckout.pojo.Cart r17, com.paypal.pyplcheckout.pojo.Address r18, com.paypal.pyplcheckout.pojo.VaultData r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r17
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r19
        L_0x0023:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r20
        L_0x002b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.approve.ApprovalData.<init>(java.lang.String, java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.Buyer, com.paypal.pyplcheckout.pojo.Cart, com.paypal.pyplcheckout.pojo.Address, com.paypal.pyplcheckout.pojo.VaultData, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
