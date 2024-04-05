package com.paypal.checkout.order;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class PurchaseUnit {
    private final Amount amount;
    @C18417a("custom_id")
    private final String customId;
    private final String description;
    @C18417a("invoice_id")
    private final String invoiceId;
    private final List<Items> items;
    private final Payee payee;
    private final Payments payments;
    @C18417a("reference_id")
    private final String referenceId;
    private final Shipping shipping;
    @C18417a("soft_descriptor")
    private final String softDescriptor;

    public static final class Builder {
        private Amount amount;
        private String customId;
        private String description;
        private String invoiceId;
        private List<Items> items;
        private Payee payee;
        private String referenceId;
        private Shipping shipping;
        private String softDescriptor;

        public final Builder amount(Amount amount2) {
            C19383o.m32797g(amount2, ResponseConstants.AMOUNT);
            this.amount = amount2;
            return this;
        }

        public final PurchaseUnit build() {
            String str = this.referenceId;
            String str2 = this.description;
            String str3 = this.invoiceId;
            String str4 = this.customId;
            String str5 = this.softDescriptor;
            Shipping shipping2 = this.shipping;
            List<Items> list = this.items;
            Payee payee2 = this.payee;
            Amount amount2 = this.amount;
            if (amount2 != null) {
                return new PurchaseUnit(str, str2, str3, str4, str5, shipping2, list, (Payments) null, payee2, amount2);
            }
            C19383o.m32805o(ResponseConstants.AMOUNT);
            throw null;
        }

        public final Builder customId(String str) {
            this.customId = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder invoiceId(String str) {
            this.invoiceId = str;
            return this;
        }

        public final Builder items(List<Items> list) {
            this.items = list;
            return this;
        }

        public final Builder payee(Payee payee2) {
            this.payee = payee2;
            return this;
        }

        public final Builder referenceId(String str) {
            this.referenceId = str;
            return this;
        }

        public final Builder shipping(Shipping shipping2) {
            this.shipping = shipping2;
            return this;
        }

        public final Builder softDescriptor(String str) {
            this.softDescriptor = str;
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PurchaseUnit(Amount amount2) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Shipping) null, (List) null, (Payments) null, (Payee) null, amount2, 511, (DefaultConstructorMarker) null);
        C19383o.m32797g(amount2, ResponseConstants.AMOUNT);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, com.paypal.checkout.order.Amount r16) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r16
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 510(0x1fe, float:7.15E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, com.paypal.checkout.order.Amount r17) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r17
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 508(0x1fc, float:7.12E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, com.paypal.checkout.order.Amount r18) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r18
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 504(0x1f8, float:7.06E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.paypal.checkout.order.Amount r19) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r19
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 496(0x1f0, float:6.95E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.paypal.checkout.order.Amount r20) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r20
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 480(0x1e0, float:6.73E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.paypal.checkout.order.Shipping r20, com.paypal.checkout.order.Amount r21) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r21
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 448(0x1c0, float:6.28E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Shipping, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.paypal.checkout.order.Shipping r20, java.util.List<com.paypal.checkout.order.Items> r21, com.paypal.checkout.order.Amount r22) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r22
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r9 = 0
            r10 = 0
            r12 = 384(0x180, float:5.38E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Shipping, java.util.List, com.paypal.checkout.order.Amount):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.paypal.checkout.order.Shipping r20, java.util.List<com.paypal.checkout.order.Items> r21, com.paypal.checkout.order.Payments r22, com.paypal.checkout.order.Amount r23) {
        /*
            r14 = this;
            java.lang.String r0 = "amount"
            r11 = r23
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r10 = 0
            r12 = 256(0x100, float:3.59E-43)
            r13 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Shipping, java.util.List, com.paypal.checkout.order.Payments, com.paypal.checkout.order.Amount):void");
    }

    public PurchaseUnit(String str, String str2, String str3, String str4, String str5, Shipping shipping2, List<Items> list, Payments payments2, Payee payee2, Amount amount2) {
        C19383o.m32797g(amount2, ResponseConstants.AMOUNT);
        this.referenceId = str;
        this.description = str2;
        this.invoiceId = str3;
        this.customId = str4;
        this.softDescriptor = str5;
        this.shipping = shipping2;
        this.items = list;
        this.payments = payments2;
        this.payee = payee2;
        this.amount = amount2;
    }

    public static /* synthetic */ PurchaseUnit copy$default(PurchaseUnit purchaseUnit, String str, String str2, String str3, String str4, String str5, Shipping shipping2, List list, Payments payments2, Payee payee2, Amount amount2, int i, Object obj) {
        PurchaseUnit purchaseUnit2 = purchaseUnit;
        int i2 = i;
        return purchaseUnit.copy((i2 & 1) != 0 ? purchaseUnit2.referenceId : str, (i2 & 2) != 0 ? purchaseUnit2.description : str2, (i2 & 4) != 0 ? purchaseUnit2.invoiceId : str3, (i2 & 8) != 0 ? purchaseUnit2.customId : str4, (i2 & 16) != 0 ? purchaseUnit2.softDescriptor : str5, (i2 & 32) != 0 ? purchaseUnit2.shipping : shipping2, (i2 & 64) != 0 ? purchaseUnit2.items : list, (i2 & 128) != 0 ? purchaseUnit2.payments : payments2, (i2 & 256) != 0 ? purchaseUnit2.payee : payee2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? purchaseUnit2.amount : amount2);
    }

    public final String component1() {
        return this.referenceId;
    }

    public final Amount component10() {
        return this.amount;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.invoiceId;
    }

    public final String component4() {
        return this.customId;
    }

    public final String component5() {
        return this.softDescriptor;
    }

    public final Shipping component6() {
        return this.shipping;
    }

    public final List<Items> component7() {
        return this.items;
    }

    public final Payments component8() {
        return this.payments;
    }

    public final Payee component9() {
        return this.payee;
    }

    public final PurchaseUnit copy(String str, String str2, String str3, String str4, String str5, Shipping shipping2, List<Items> list, Payments payments2, Payee payee2, Amount amount2) {
        Amount amount3 = amount2;
        C19383o.m32797g(amount3, ResponseConstants.AMOUNT);
        return new PurchaseUnit(str, str2, str3, str4, str5, shipping2, list, payments2, payee2, amount3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseUnit)) {
            return false;
        }
        PurchaseUnit purchaseUnit = (PurchaseUnit) obj;
        return C19383o.m32792b(this.referenceId, purchaseUnit.referenceId) && C19383o.m32792b(this.description, purchaseUnit.description) && C19383o.m32792b(this.invoiceId, purchaseUnit.invoiceId) && C19383o.m32792b(this.customId, purchaseUnit.customId) && C19383o.m32792b(this.softDescriptor, purchaseUnit.softDescriptor) && C19383o.m32792b(this.shipping, purchaseUnit.shipping) && C19383o.m32792b(this.items, purchaseUnit.items) && C19383o.m32792b(this.payments, purchaseUnit.payments) && C19383o.m32792b(this.payee, purchaseUnit.payee) && C19383o.m32792b(this.amount, purchaseUnit.amount);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final List<Items> getItems() {
        return this.items;
    }

    public final Payee getPayee() {
        return this.payee;
    }

    public final Payments getPayments() {
        return this.payments;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public final String getSoftDescriptor() {
        return this.softDescriptor;
    }

    public int hashCode() {
        String str = this.referenceId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.invoiceId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.softDescriptor;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Shipping shipping2 = this.shipping;
        int hashCode6 = (hashCode5 + (shipping2 == null ? 0 : shipping2.hashCode())) * 31;
        List<Items> list = this.items;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Payments payments2 = this.payments;
        int hashCode8 = (hashCode7 + (payments2 == null ? 0 : payments2.hashCode())) * 31;
        Payee payee2 = this.payee;
        if (payee2 != null) {
            i = payee2.hashCode();
        }
        return this.amount.hashCode() + ((hashCode8 + i) * 31);
    }

    public String toString() {
        String str = this.referenceId;
        String str2 = this.description;
        String str3 = this.invoiceId;
        String str4 = this.customId;
        String str5 = this.softDescriptor;
        Shipping shipping2 = this.shipping;
        List<Items> list = this.items;
        Payments payments2 = this.payments;
        Payee payee2 = this.payee;
        Amount amount2 = this.amount;
        StringBuilder f = C0388a.m1050f("PurchaseUnit(referenceId=", str, ", description=", str2, ", invoiceId=");
        C0391c.m1061h(f, str3, ", customId=", str4, ", softDescriptor=");
        f.append(str5);
        f.append(", shipping=");
        f.append(shipping2);
        f.append(", items=");
        f.append(list);
        f.append(", payments=");
        f.append(payments2);
        f.append(", payee=");
        f.append(payee2);
        f.append(", amount=");
        f.append(amount2);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PurchaseUnit(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.paypal.checkout.order.Shipping r20, java.util.List r21, com.paypal.checkout.order.Payments r22, com.paypal.checkout.order.Payee r23, com.paypal.checkout.order.Amount r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
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
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0040
            r11 = r2
            goto L_0x0042
        L_0x0040:
            r11 = r22
        L_0x0042:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0048
            r12 = r2
            goto L_0x004a
        L_0x0048:
            r12 = r23
        L_0x004a:
            r3 = r14
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.PurchaseUnit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.checkout.order.Shipping, java.util.List, com.paypal.checkout.order.Payments, com.paypal.checkout.order.Payee, com.paypal.checkout.order.Amount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
