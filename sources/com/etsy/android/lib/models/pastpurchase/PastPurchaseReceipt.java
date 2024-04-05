package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.pastpurchase.adapters.ForceToLong;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PastPurchaseReceipt {
    public static final int $stable = 8;
    private final long creationDate;
    private final String currencyCode;
    private final long estimatedShippedDate;
    private final String grandTotal;
    private final boolean isFlaggedForManualFraudReview;
    private final boolean isInPerson;
    private final String multiShopNote;
    private final long receiptId;
    private final PastPurchaseUser seller;
    private final List<PastPurchaseShipment> shipments;
    private final long shippedDate;
    private final List<PastPurchaseTransaction> transactions;
    private final String transparentPricingMessage;
    private final Boolean wasGiftcardBalanceApplied;
    private final boolean wasPaid;
    private final boolean wasShipped;

    public PastPurchaseReceipt(@C17402n(name = "receipt_id") long j, @C17402n(name = "was_paid") boolean z, @C17402n(name = "flagged_for_manual_fraud_review") boolean z2, @C17402n(name = "was_giftcard_balance_applied") Boolean bool, @C17402n(name = "grandtotal") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "was_shipped") boolean z3, @C17402n(name = "is_in_person") boolean z4, @C17402n(name = "creation_tsz") long j2, @C17402n(name = "multi_shop_note") String str3, @C17402n(name = "shipments") List<PastPurchaseShipment> list, @ForceToLong @C17402n(name = "shipped_tsz") long j3, @C17402n(name = "estimated_shipped_tsz") long j4, @C17402n(name = "transparent_price_message") String str4, @C17402n(name = "Seller") PastPurchaseUser pastPurchaseUser, @C17402n(name = "Transactions") List<PastPurchaseTransaction> list2) {
        this.receiptId = j;
        this.wasPaid = z;
        this.isFlaggedForManualFraudReview = z2;
        this.wasGiftcardBalanceApplied = bool;
        this.grandTotal = str;
        this.currencyCode = str2;
        this.wasShipped = z3;
        this.isInPerson = z4;
        this.creationDate = j2;
        this.multiShopNote = str3;
        this.shipments = list;
        this.shippedDate = j3;
        this.estimatedShippedDate = j4;
        this.transparentPricingMessage = str4;
        this.seller = pastPurchaseUser;
        this.transactions = list2;
    }

    public static /* synthetic */ PastPurchaseReceipt copy$default(PastPurchaseReceipt pastPurchaseReceipt, long j, boolean z, boolean z2, Boolean bool, String str, String str2, boolean z3, boolean z4, long j2, String str3, List list, long j3, long j4, String str4, PastPurchaseUser pastPurchaseUser, List list2, int i, Object obj) {
        PastPurchaseReceipt pastPurchaseReceipt2 = pastPurchaseReceipt;
        int i2 = i;
        return pastPurchaseReceipt.copy((i2 & 1) != 0 ? pastPurchaseReceipt2.receiptId : j, (i2 & 2) != 0 ? pastPurchaseReceipt2.wasPaid : z, (i2 & 4) != 0 ? pastPurchaseReceipt2.isFlaggedForManualFraudReview : z2, (i2 & 8) != 0 ? pastPurchaseReceipt2.wasGiftcardBalanceApplied : bool, (i2 & 16) != 0 ? pastPurchaseReceipt2.grandTotal : str, (i2 & 32) != 0 ? pastPurchaseReceipt2.currencyCode : str2, (i2 & 64) != 0 ? pastPurchaseReceipt2.wasShipped : z3, (i2 & 128) != 0 ? pastPurchaseReceipt2.isInPerson : z4, (i2 & 256) != 0 ? pastPurchaseReceipt2.creationDate : j2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? pastPurchaseReceipt2.multiShopNote : str3, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? pastPurchaseReceipt2.shipments : list, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? pastPurchaseReceipt2.shippedDate : j3, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? pastPurchaseReceipt2.estimatedShippedDate : j4, (i2 & 8192) != 0 ? pastPurchaseReceipt2.transparentPricingMessage : str4, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? pastPurchaseReceipt2.seller : pastPurchaseUser, (i2 & 32768) != 0 ? pastPurchaseReceipt2.transactions : list2);
    }

    public final long component1() {
        return this.receiptId;
    }

    public final String component10() {
        return this.multiShopNote;
    }

    public final List<PastPurchaseShipment> component11() {
        return this.shipments;
    }

    public final long component12() {
        return this.shippedDate;
    }

    public final long component13() {
        return this.estimatedShippedDate;
    }

    public final String component14() {
        return this.transparentPricingMessage;
    }

    public final PastPurchaseUser component15() {
        return this.seller;
    }

    public final List<PastPurchaseTransaction> component16() {
        return this.transactions;
    }

    public final boolean component2() {
        return this.wasPaid;
    }

    public final boolean component3() {
        return this.isFlaggedForManualFraudReview;
    }

    public final Boolean component4() {
        return this.wasGiftcardBalanceApplied;
    }

    public final String component5() {
        return this.grandTotal;
    }

    public final String component6() {
        return this.currencyCode;
    }

    public final boolean component7() {
        return this.wasShipped;
    }

    public final boolean component8() {
        return this.isInPerson;
    }

    public final long component9() {
        return this.creationDate;
    }

    public final PastPurchaseReceipt copy(@C17402n(name = "receipt_id") long j, @C17402n(name = "was_paid") boolean z, @C17402n(name = "flagged_for_manual_fraud_review") boolean z2, @C17402n(name = "was_giftcard_balance_applied") Boolean bool, @C17402n(name = "grandtotal") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "was_shipped") boolean z3, @C17402n(name = "is_in_person") boolean z4, @C17402n(name = "creation_tsz") long j2, @C17402n(name = "multi_shop_note") String str3, @C17402n(name = "shipments") List<PastPurchaseShipment> list, @ForceToLong @C17402n(name = "shipped_tsz") long j3, @C17402n(name = "estimated_shipped_tsz") long j4, @C17402n(name = "transparent_price_message") String str4, @C17402n(name = "Seller") PastPurchaseUser pastPurchaseUser, @C17402n(name = "Transactions") List<PastPurchaseTransaction> list2) {
        return new PastPurchaseReceipt(j, z, z2, bool, str, str2, z3, z4, j2, str3, list, j3, j4, str4, pastPurchaseUser, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseReceipt)) {
            return false;
        }
        PastPurchaseReceipt pastPurchaseReceipt = (PastPurchaseReceipt) obj;
        return this.receiptId == pastPurchaseReceipt.receiptId && this.wasPaid == pastPurchaseReceipt.wasPaid && this.isFlaggedForManualFraudReview == pastPurchaseReceipt.isFlaggedForManualFraudReview && C19383o.m32792b(this.wasGiftcardBalanceApplied, pastPurchaseReceipt.wasGiftcardBalanceApplied) && C19383o.m32792b(this.grandTotal, pastPurchaseReceipt.grandTotal) && C19383o.m32792b(this.currencyCode, pastPurchaseReceipt.currencyCode) && this.wasShipped == pastPurchaseReceipt.wasShipped && this.isInPerson == pastPurchaseReceipt.isInPerson && this.creationDate == pastPurchaseReceipt.creationDate && C19383o.m32792b(this.multiShopNote, pastPurchaseReceipt.multiShopNote) && C19383o.m32792b(this.shipments, pastPurchaseReceipt.shipments) && this.shippedDate == pastPurchaseReceipt.shippedDate && this.estimatedShippedDate == pastPurchaseReceipt.estimatedShippedDate && C19383o.m32792b(this.transparentPricingMessage, pastPurchaseReceipt.transparentPricingMessage) && C19383o.m32792b(this.seller, pastPurchaseReceipt.seller) && C19383o.m32792b(this.transactions, pastPurchaseReceipt.transactions);
    }

    public final long getCreationDate() {
        return this.creationDate;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final long getEstimatedShippedDate() {
        return this.estimatedShippedDate;
    }

    public final String getGrandTotal() {
        return this.grandTotal;
    }

    public final String getMultiShopNote() {
        return this.multiShopNote;
    }

    public final long getReceiptId() {
        return this.receiptId;
    }

    public final PastPurchaseUser getSeller() {
        return this.seller;
    }

    public final List<PastPurchaseShipment> getShipments() {
        return this.shipments;
    }

    public final long getShippedDate() {
        return this.shippedDate;
    }

    public final List<PastPurchaseTransaction> getTransactions() {
        return this.transactions;
    }

    public final String getTransparentPricingMessage() {
        return this.transparentPricingMessage;
    }

    public final Boolean getWasGiftcardBalanceApplied() {
        return this.wasGiftcardBalanceApplied;
    }

    public final boolean getWasPaid() {
        return this.wasPaid;
    }

    public final boolean getWasShipped() {
        return this.wasShipped;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.receiptId) * 31;
        boolean z = this.wasPaid;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isFlaggedForManualFraudReview;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        Boolean bool = this.wasGiftcardBalanceApplied;
        int i3 = 0;
        int hashCode2 = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.grandTotal;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z4 = this.wasShipped;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isInPerson;
        if (!z5) {
            z2 = z5;
        }
        int b = C0071c.m190b(this.creationDate, (i4 + (z2 ? 1 : 0)) * 31, 31);
        String str3 = this.multiShopNote;
        int hashCode5 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PastPurchaseShipment> list = this.shipments;
        int b2 = C0071c.m190b(this.estimatedShippedDate, C0071c.m190b(this.shippedDate, (hashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        String str4 = this.transparentPricingMessage;
        int hashCode6 = (b2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PastPurchaseUser pastPurchaseUser = this.seller;
        int hashCode7 = (hashCode6 + (pastPurchaseUser == null ? 0 : pastPurchaseUser.hashCode())) * 31;
        List<PastPurchaseTransaction> list2 = this.transactions;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return hashCode7 + i3;
    }

    public final boolean isFlaggedForManualFraudReview() {
        return this.isFlaggedForManualFraudReview;
    }

    public final boolean isInPerson() {
        return this.isInPerson;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseReceipt(receiptId=");
        h.append(this.receiptId);
        h.append(", wasPaid=");
        h.append(this.wasPaid);
        h.append(", isFlaggedForManualFraudReview=");
        h.append(this.isFlaggedForManualFraudReview);
        h.append(", wasGiftcardBalanceApplied=");
        h.append(this.wasGiftcardBalanceApplied);
        h.append(", grandTotal=");
        h.append(this.grandTotal);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", wasShipped=");
        h.append(this.wasShipped);
        h.append(", isInPerson=");
        h.append(this.isInPerson);
        h.append(", creationDate=");
        h.append(this.creationDate);
        h.append(", multiShopNote=");
        h.append(this.multiShopNote);
        h.append(", shipments=");
        h.append(this.shipments);
        h.append(", shippedDate=");
        h.append(this.shippedDate);
        h.append(", estimatedShippedDate=");
        h.append(this.estimatedShippedDate);
        h.append(", transparentPricingMessage=");
        h.append(this.transparentPricingMessage);
        h.append(", seller=");
        h.append(this.seller);
        h.append(", transactions=");
        return C0070b.m186i(h, this.transactions, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PastPurchaseReceipt(long r25, boolean r27, boolean r28, java.lang.Boolean r29, java.lang.String r30, java.lang.String r31, boolean r32, boolean r33, long r34, java.lang.String r36, java.util.List r37, long r38, long r40, java.lang.String r42, com.etsy.android.lib.models.pastpurchase.PastPurchaseUser r43, java.util.List r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r27
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r28
        L_0x0013:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x001a
            r8 = r3
            goto L_0x001c
        L_0x001a:
            r8 = r29
        L_0x001c:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0022
            r9 = r3
            goto L_0x0024
        L_0x0022:
            r9 = r30
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            r10 = r3
            goto L_0x002c
        L_0x002a:
            r10 = r31
        L_0x002c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0032
            r11 = r2
            goto L_0x0034
        L_0x0032:
            r11 = r32
        L_0x0034:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003a
            r12 = r2
            goto L_0x003c
        L_0x003a:
            r12 = r33
        L_0x003c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r15 = r3
            goto L_0x0044
        L_0x0042:
            r15 = r36
        L_0x0044:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004b
            r16 = r3
            goto L_0x004d
        L_0x004b:
            r16 = r37
        L_0x004d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0056
            r1 = 0
            r19 = r1
            goto L_0x0058
        L_0x0056:
            r19 = r40
        L_0x0058:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005f
            r21 = r3
            goto L_0x0061
        L_0x005f:
            r21 = r42
        L_0x0061:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0068
            r22 = r3
            goto L_0x006a
        L_0x0068:
            r22 = r43
        L_0x006a:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0073
            r23 = r3
            goto L_0x0075
        L_0x0073:
            r23 = r44
        L_0x0075:
            r3 = r24
            r4 = r25
            r13 = r34
            r17 = r38
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r19, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt.<init>(long, boolean, boolean, java.lang.Boolean, java.lang.String, java.lang.String, boolean, boolean, long, java.lang.String, java.util.List, long, long, java.lang.String, com.etsy.android.lib.models.pastpurchase.PastPurchaseUser, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
