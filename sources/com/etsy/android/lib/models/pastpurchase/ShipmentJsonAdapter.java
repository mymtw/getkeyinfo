package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShipmentJsonAdapter extends JsonAdapter<Shipment> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RECEIPT_SHIPPING_ID, ResponseConstants.BUYER_NOTE, ResponseConstants.CARRIER_NAME, ResponseConstants.IS_ETSY_ONLY_TRACKING, ResponseConstants.MAIL_CLASS, ResponseConstants.MAILING_DATE, "notification_date", ResponseConstants.TRACKING_CODE, ResponseConstants.TRACKING_URL, ResponseConstants.MAJOR_TRACKING_STATE, ResponseConstants.CURRENT_STEP);

    public ShipmentJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "receiptShippingId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "buyerNote");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isEtsyOnlyTracking");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "notificationDate");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Shipment)";
    }

    public Shipment fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        Long l2 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new Shipment(l, str, str2, bool, str3, l2, num, str4, str5, str6, str7);
    }

    public void toJson(C17412w wVar, Shipment shipment) {
        C19383o.m32797g(wVar, "writer");
        if (shipment != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RECEIPT_SHIPPING_ID);
            this.nullableLongAdapter.toJson(wVar, shipment.getReceiptShippingId());
            wVar.mo68529h(ResponseConstants.BUYER_NOTE);
            this.nullableStringAdapter.toJson(wVar, shipment.getBuyerNote());
            wVar.mo68529h(ResponseConstants.CARRIER_NAME);
            this.nullableStringAdapter.toJson(wVar, shipment.getCarrierName());
            wVar.mo68529h(ResponseConstants.IS_ETSY_ONLY_TRACKING);
            this.nullableBooleanAdapter.toJson(wVar, shipment.isEtsyOnlyTracking());
            wVar.mo68529h(ResponseConstants.MAIL_CLASS);
            this.nullableStringAdapter.toJson(wVar, shipment.getMailClass());
            wVar.mo68529h(ResponseConstants.MAILING_DATE);
            this.nullableLongAdapter.toJson(wVar, shipment.getMailingDate());
            wVar.mo68529h("notification_date");
            this.nullableIntAdapter.toJson(wVar, shipment.getNotificationDate());
            wVar.mo68529h(ResponseConstants.TRACKING_CODE);
            this.nullableStringAdapter.toJson(wVar, shipment.getTrackingCode());
            wVar.mo68529h(ResponseConstants.TRACKING_URL);
            this.nullableStringAdapter.toJson(wVar, shipment.getTrackingUrl());
            wVar.mo68529h(ResponseConstants.MAJOR_TRACKING_STATE);
            this.nullableStringAdapter.toJson(wVar, shipment.getMajorTrackingstate());
            wVar.mo68529h(ResponseConstants.CURRENT_STEP);
            this.nullableStringAdapter.toJson(wVar, shipment.getCurrentStep());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
