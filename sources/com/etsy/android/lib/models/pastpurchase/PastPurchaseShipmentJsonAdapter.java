package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseShipmentJsonAdapter extends JsonAdapter<PastPurchaseShipment> {
    public static final int $stable = 8;
    private volatile Constructor<PastPurchaseShipment> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<PastPurchaseShippingState> nullablePastPurchaseShippingStateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RECEIPT_SHIPPING_ID, ResponseConstants.TRACKING_CODE, ResponseConstants.TRACKING_URL, ResponseConstants.CARRIER_NAME, ResponseConstants.MAIL_CLASS, ResponseConstants.BUYER_NOTE, ResponseConstants.MAILING_DATE, ResponseConstants.CURRENT_STEP, ResponseConstants.MAJOR_TRACKING_STATE);

    public PastPurchaseShipmentJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "receiptShippingId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "trackingCode");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "mailingDate");
        this.nullablePastPurchaseShippingStateAdapter = yVar.mo68558c(PastPurchaseShippingState.class, emptySet, PayPalNewShippingAddressReviewViewKt.SHIPPING_STATE_FIELD);
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseShipment)";
    }

    public PastPurchaseShipment fromJson(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        PastPurchaseShippingState pastPurchaseShippingState = null;
        String str7 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("mailingDate", ResponseConstants.MAILING_DATE, jsonReader2);
                    }
                case 7:
                    pastPurchaseShippingState = this.nullablePastPurchaseShippingStateAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -448) {
            Constructor<PastPurchaseShipment> constructor = this.constructorRef;
            if (constructor == null) {
                str = "mailingDate";
                constructor = PastPurchaseShipment.class.getDeclaredConstructor(new Class[]{Long.class, cls, cls, cls, cls, cls, Long.TYPE, PastPurchaseShippingState.class, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "PastPurchaseShipment::cl…his.constructorRef = it }");
            } else {
                str = "mailingDate";
            }
            Object[] objArr = new Object[11];
            objArr[0] = l2;
            objArr[1] = str2;
            objArr[2] = str3;
            objArr[3] = str4;
            objArr[4] = str5;
            objArr[5] = str6;
            if (l != null) {
                objArr[6] = Long.valueOf(l.longValue());
                objArr[7] = pastPurchaseShippingState;
                objArr[8] = str7;
                objArr[9] = Integer.valueOf(i);
                objArr[10] = null;
                PastPurchaseShipment newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g(str, ResponseConstants.MAILING_DATE, jsonReader);
        } else if (l != null) {
            return new PastPurchaseShipment(l2, str2, str3, str4, str5, str6, l.longValue(), pastPurchaseShippingState, str7);
        } else {
            throw C18215a.m30728g("mailingDate", ResponseConstants.MAILING_DATE, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, PastPurchaseShipment pastPurchaseShipment) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseShipment != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RECEIPT_SHIPPING_ID);
            this.nullableLongAdapter.toJson(wVar, pastPurchaseShipment.getReceiptShippingId());
            wVar.mo68529h(ResponseConstants.TRACKING_CODE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShipment.getTrackingCode());
            wVar.mo68529h(ResponseConstants.TRACKING_URL);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShipment.getTrackingUrl());
            wVar.mo68529h(ResponseConstants.CARRIER_NAME);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShipment.getCarrierName());
            wVar.mo68529h(ResponseConstants.MAIL_CLASS);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShipment.getMailClass());
            wVar.mo68529h(ResponseConstants.BUYER_NOTE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShipment.getBuyerNote());
            wVar.mo68529h(ResponseConstants.MAILING_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(pastPurchaseShipment.getMailingDate()));
            wVar.mo68529h(ResponseConstants.CURRENT_STEP);
            this.nullablePastPurchaseShippingStateAdapter.toJson(wVar, pastPurchaseShipment.getShippingState());
            wVar.mo68529h(ResponseConstants.MAJOR_TRACKING_STATE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShipment.getMajorTrackingState());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
