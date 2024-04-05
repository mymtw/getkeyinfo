package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PastPurchaseShipment {
    public static final int $stable = 0;
    private final String buyerNote;
    private final String carrierName;
    private final String mailClass;
    private final long mailingDate;
    private final String majorTrackingState;
    private final Long receiptShippingId;
    private final PastPurchaseShippingState shippingState;
    private final String trackingCode;
    private final String trackingUrl;

    public PastPurchaseShipment(@C17402n(name = "receipt_shipping_id") Long l, @C17402n(name = "tracking_code") String str, @C17402n(name = "tracking_url") String str2, @C17402n(name = "carrier_name") String str3, @C17402n(name = "mail_class") String str4, @C17402n(name = "buyer_note") String str5, @C17402n(name = "mailing_date") long j, @C17402n(name = "current_step") PastPurchaseShippingState pastPurchaseShippingState, @C17402n(name = "major_tracking_state") String str6) {
        this.receiptShippingId = l;
        this.trackingCode = str;
        this.trackingUrl = str2;
        this.carrierName = str3;
        this.mailClass = str4;
        this.buyerNote = str5;
        this.mailingDate = j;
        this.shippingState = pastPurchaseShippingState;
        this.majorTrackingState = str6;
    }

    public static /* synthetic */ PastPurchaseShipment copy$default(PastPurchaseShipment pastPurchaseShipment, Long l, String str, String str2, String str3, String str4, String str5, long j, PastPurchaseShippingState pastPurchaseShippingState, String str6, int i, Object obj) {
        PastPurchaseShipment pastPurchaseShipment2 = pastPurchaseShipment;
        int i2 = i;
        return pastPurchaseShipment.copy((i2 & 1) != 0 ? pastPurchaseShipment2.receiptShippingId : l, (i2 & 2) != 0 ? pastPurchaseShipment2.trackingCode : str, (i2 & 4) != 0 ? pastPurchaseShipment2.trackingUrl : str2, (i2 & 8) != 0 ? pastPurchaseShipment2.carrierName : str3, (i2 & 16) != 0 ? pastPurchaseShipment2.mailClass : str4, (i2 & 32) != 0 ? pastPurchaseShipment2.buyerNote : str5, (i2 & 64) != 0 ? pastPurchaseShipment2.mailingDate : j, (i2 & 128) != 0 ? pastPurchaseShipment2.shippingState : pastPurchaseShippingState, (i2 & 256) != 0 ? pastPurchaseShipment2.majorTrackingState : str6);
    }

    public final Long component1() {
        return this.receiptShippingId;
    }

    public final String component2() {
        return this.trackingCode;
    }

    public final String component3() {
        return this.trackingUrl;
    }

    public final String component4() {
        return this.carrierName;
    }

    public final String component5() {
        return this.mailClass;
    }

    public final String component6() {
        return this.buyerNote;
    }

    public final long component7() {
        return this.mailingDate;
    }

    public final PastPurchaseShippingState component8() {
        return this.shippingState;
    }

    public final String component9() {
        return this.majorTrackingState;
    }

    public final PastPurchaseShipment copy(@C17402n(name = "receipt_shipping_id") Long l, @C17402n(name = "tracking_code") String str, @C17402n(name = "tracking_url") String str2, @C17402n(name = "carrier_name") String str3, @C17402n(name = "mail_class") String str4, @C17402n(name = "buyer_note") String str5, @C17402n(name = "mailing_date") long j, @C17402n(name = "current_step") PastPurchaseShippingState pastPurchaseShippingState, @C17402n(name = "major_tracking_state") String str6) {
        return new PastPurchaseShipment(l, str, str2, str3, str4, str5, j, pastPurchaseShippingState, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseShipment)) {
            return false;
        }
        PastPurchaseShipment pastPurchaseShipment = (PastPurchaseShipment) obj;
        return C19383o.m32792b(this.receiptShippingId, pastPurchaseShipment.receiptShippingId) && C19383o.m32792b(this.trackingCode, pastPurchaseShipment.trackingCode) && C19383o.m32792b(this.trackingUrl, pastPurchaseShipment.trackingUrl) && C19383o.m32792b(this.carrierName, pastPurchaseShipment.carrierName) && C19383o.m32792b(this.mailClass, pastPurchaseShipment.mailClass) && C19383o.m32792b(this.buyerNote, pastPurchaseShipment.buyerNote) && this.mailingDate == pastPurchaseShipment.mailingDate && this.shippingState == pastPurchaseShipment.shippingState && C19383o.m32792b(this.majorTrackingState, pastPurchaseShipment.majorTrackingState);
    }

    public final String getBuyerNote() {
        return this.buyerNote;
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getMailClass() {
        return this.mailClass;
    }

    public final long getMailingDate() {
        return this.mailingDate;
    }

    public final String getMajorTrackingState() {
        return this.majorTrackingState;
    }

    public final Long getReceiptShippingId() {
        return this.receiptShippingId;
    }

    public final PastPurchaseShippingState getShippingState() {
        return this.shippingState;
    }

    public final String getTrackingCode() {
        return this.trackingCode;
    }

    public final String getTrackingUrl() {
        return this.trackingUrl;
    }

    public int hashCode() {
        Long l = this.receiptShippingId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.trackingCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carrierName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mailClass;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buyerNote;
        int b = C0071c.m190b(this.mailingDate, (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        PastPurchaseShippingState pastPurchaseShippingState = this.shippingState;
        int hashCode6 = (b + (pastPurchaseShippingState == null ? 0 : pastPurchaseShippingState.hashCode())) * 31;
        String str6 = this.majorTrackingState;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseShipment(receiptShippingId=");
        h.append(this.receiptShippingId);
        h.append(", trackingCode=");
        h.append(this.trackingCode);
        h.append(", trackingUrl=");
        h.append(this.trackingUrl);
        h.append(", carrierName=");
        h.append(this.carrierName);
        h.append(", mailClass=");
        h.append(this.mailClass);
        h.append(", buyerNote=");
        h.append(this.buyerNote);
        h.append(", mailingDate=");
        h.append(this.mailingDate);
        h.append(", shippingState=");
        h.append(this.shippingState);
        h.append(", majorTrackingState=");
        return C0391c.m1057c(h, this.majorTrackingState, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PastPurchaseShipment(java.lang.Long r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20, com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000e
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3 = r1
            goto L_0x000f
        L_0x000e:
            r3 = r14
        L_0x000f:
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r4 = r2
            goto L_0x0017
        L_0x0016:
            r4 = r15
        L_0x0017:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001d
            r5 = r2
            goto L_0x001f
        L_0x001d:
            r5 = r16
        L_0x001f:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r17
        L_0x0027:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r18
        L_0x002f:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r19
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState r1 = com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState.UNKNOWN
            r11 = r1
            goto L_0x0041
        L_0x003f:
            r11 = r22
        L_0x0041:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0047
            r12 = r2
            goto L_0x0049
        L_0x0047:
            r12 = r23
        L_0x0049:
            r2 = r13
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.pastpurchase.PastPurchaseShipment.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
