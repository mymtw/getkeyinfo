package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Shipment {
    public static final int $stable = 0;
    private final String buyerNote;
    private final String carrierName;
    private final String currentStep;
    private final Boolean isEtsyOnlyTracking;
    private final String mailClass;
    private final Long mailingDate;
    private final String majorTrackingstate;
    private final Integer notificationDate;
    private final Long receiptShippingId;
    private final String trackingCode;
    private final String trackingUrl;

    public Shipment(@C17402n(name = "receipt_shipping_id") Long l, @C17402n(name = "buyer_note") String str, @C17402n(name = "carrier_name") String str2, @C17402n(name = "is_etsy_only_tracking") Boolean bool, @C17402n(name = "mail_class") String str3, @C17402n(name = "mailing_date") Long l2, @C17402n(name = "notification_date") Integer num, @C17402n(name = "tracking_code") String str4, @C17402n(name = "tracking_url") String str5, @C17402n(name = "major_tracking_state") String str6, @C17402n(name = "current_step") String str7) {
        this.receiptShippingId = l;
        this.buyerNote = str;
        this.carrierName = str2;
        this.isEtsyOnlyTracking = bool;
        this.mailClass = str3;
        this.mailingDate = l2;
        this.notificationDate = num;
        this.trackingCode = str4;
        this.trackingUrl = str5;
        this.majorTrackingstate = str6;
        this.currentStep = str7;
    }

    public static /* synthetic */ Shipment copy$default(Shipment shipment, Long l, String str, String str2, Boolean bool, String str3, Long l2, Integer num, String str4, String str5, String str6, String str7, int i, Object obj) {
        Shipment shipment2 = shipment;
        int i2 = i;
        return shipment.copy((i2 & 1) != 0 ? shipment2.receiptShippingId : l, (i2 & 2) != 0 ? shipment2.buyerNote : str, (i2 & 4) != 0 ? shipment2.carrierName : str2, (i2 & 8) != 0 ? shipment2.isEtsyOnlyTracking : bool, (i2 & 16) != 0 ? shipment2.mailClass : str3, (i2 & 32) != 0 ? shipment2.mailingDate : l2, (i2 & 64) != 0 ? shipment2.notificationDate : num, (i2 & 128) != 0 ? shipment2.trackingCode : str4, (i2 & 256) != 0 ? shipment2.trackingUrl : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shipment2.majorTrackingstate : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shipment2.currentStep : str7);
    }

    public final Long component1() {
        return this.receiptShippingId;
    }

    public final String component10() {
        return this.majorTrackingstate;
    }

    public final String component11() {
        return this.currentStep;
    }

    public final String component2() {
        return this.buyerNote;
    }

    public final String component3() {
        return this.carrierName;
    }

    public final Boolean component4() {
        return this.isEtsyOnlyTracking;
    }

    public final String component5() {
        return this.mailClass;
    }

    public final Long component6() {
        return this.mailingDate;
    }

    public final Integer component7() {
        return this.notificationDate;
    }

    public final String component8() {
        return this.trackingCode;
    }

    public final String component9() {
        return this.trackingUrl;
    }

    public final Shipment copy(@C17402n(name = "receipt_shipping_id") Long l, @C17402n(name = "buyer_note") String str, @C17402n(name = "carrier_name") String str2, @C17402n(name = "is_etsy_only_tracking") Boolean bool, @C17402n(name = "mail_class") String str3, @C17402n(name = "mailing_date") Long l2, @C17402n(name = "notification_date") Integer num, @C17402n(name = "tracking_code") String str4, @C17402n(name = "tracking_url") String str5, @C17402n(name = "major_tracking_state") String str6, @C17402n(name = "current_step") String str7) {
        return new Shipment(l, str, str2, bool, str3, l2, num, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shipment)) {
            return false;
        }
        Shipment shipment = (Shipment) obj;
        return C19383o.m32792b(this.receiptShippingId, shipment.receiptShippingId) && C19383o.m32792b(this.buyerNote, shipment.buyerNote) && C19383o.m32792b(this.carrierName, shipment.carrierName) && C19383o.m32792b(this.isEtsyOnlyTracking, shipment.isEtsyOnlyTracking) && C19383o.m32792b(this.mailClass, shipment.mailClass) && C19383o.m32792b(this.mailingDate, shipment.mailingDate) && C19383o.m32792b(this.notificationDate, shipment.notificationDate) && C19383o.m32792b(this.trackingCode, shipment.trackingCode) && C19383o.m32792b(this.trackingUrl, shipment.trackingUrl) && C19383o.m32792b(this.majorTrackingstate, shipment.majorTrackingstate) && C19383o.m32792b(this.currentStep, shipment.currentStep);
    }

    public final String getBuyerNote() {
        return this.buyerNote;
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getCurrentStep() {
        return this.currentStep;
    }

    public final String getMailClass() {
        return this.mailClass;
    }

    public final Long getMailingDate() {
        return this.mailingDate;
    }

    public final String getMajorTrackingstate() {
        return this.majorTrackingstate;
    }

    public final Integer getNotificationDate() {
        return this.notificationDate;
    }

    public final Long getReceiptShippingId() {
        return this.receiptShippingId;
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
        String str = this.buyerNote;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.carrierName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isEtsyOnlyTracking;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.mailClass;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.mailingDate;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.notificationDate;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.trackingCode;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackingUrl;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.majorTrackingstate;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currentStep;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    public final Boolean isEtsyOnlyTracking() {
        return this.isEtsyOnlyTracking;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Shipment(receiptShippingId=");
        h.append(this.receiptShippingId);
        h.append(", buyerNote=");
        h.append(this.buyerNote);
        h.append(", carrierName=");
        h.append(this.carrierName);
        h.append(", isEtsyOnlyTracking=");
        h.append(this.isEtsyOnlyTracking);
        h.append(", mailClass=");
        h.append(this.mailClass);
        h.append(", mailingDate=");
        h.append(this.mailingDate);
        h.append(", notificationDate=");
        h.append(this.notificationDate);
        h.append(", trackingCode=");
        h.append(this.trackingCode);
        h.append(", trackingUrl=");
        h.append(this.trackingUrl);
        h.append(", majorTrackingstate=");
        h.append(this.majorTrackingstate);
        h.append(", currentStep=");
        return C0391c.m1057c(h, this.currentStep, ')');
    }
}
