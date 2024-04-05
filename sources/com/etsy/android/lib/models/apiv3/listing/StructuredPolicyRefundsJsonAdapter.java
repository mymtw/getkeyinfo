package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class StructuredPolicyRefundsJsonAdapter extends JsonAdapter<StructuredPolicyRefunds> {
    public static final int $stable = 8;
    private volatile Constructor<StructuredPolicyRefunds> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<NonRefundableItem>> nullableListOfNonRefundableItemAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ACCEPTED_SUMMARY_STRING, ResponseConstants.ACCEPTS_CANCELLATIONS, ResponseConstants.ACCEPTS_RETURNS, ResponseConstants.CANCEL_WITHIN_HOURS, ResponseConstants.CANCELLATION_WINDOW_TYPE, ResponseConstants.CONTACT_SELLER_WITHIN_DAYS, ResponseConstants.EXCHANGES, ResponseConstants.NON_REFUNDABLE_ITEMS, ResponseConstants.NOT_ACCEPTED_SUMMARY_STRING, ResponseConstants.RETURN_ITEMS_WITHIN_DAYS);

    public StructuredPolicyRefundsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "acceptedSummaryString");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "acceptsCancellations");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "cancelWithinHours");
        this.nullableListOfNonRefundableItemAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, NonRefundableItem.class), emptySet, "nonRefundableItems");
    }

    public String toString() {
        return "GeneratedJsonAdapter(StructuredPolicyRefunds)";
    }

    public StructuredPolicyRefunds fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<Boolean> cls2 = Boolean.class;
        Class<String> cls3 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        Boolean bool3 = null;
        List list = null;
        String str3 = null;
        Integer num3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    list = this.nullableListOfNonRefundableItemAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -1024) {
            return new StructuredPolicyRefunds(str, bool, bool2, num, str2, num2, bool3, list, str3, num3);
        }
        Constructor<StructuredPolicyRefunds> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = StructuredPolicyRefunds.class.getDeclaredConstructor(new Class[]{cls3, cls2, cls2, cls, cls3, cls, cls2, List.class, cls3, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "StructuredPolicyRefunds:…his.constructorRef = it }");
        }
        StructuredPolicyRefunds newInstance = constructor.newInstance(new Object[]{str, bool, bool2, num, str2, num2, bool3, list, str3, num3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, StructuredPolicyRefunds structuredPolicyRefunds) {
        C19383o.m32797g(wVar, "writer");
        if (structuredPolicyRefunds != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ACCEPTED_SUMMARY_STRING);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyRefunds.getAcceptedSummaryString());
            wVar.mo68529h(ResponseConstants.ACCEPTS_CANCELLATIONS);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyRefunds.getAcceptsCancellations());
            wVar.mo68529h(ResponseConstants.ACCEPTS_RETURNS);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyRefunds.getAcceptsReturns());
            wVar.mo68529h(ResponseConstants.CANCEL_WITHIN_HOURS);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyRefunds.getCancelWithinHours());
            wVar.mo68529h(ResponseConstants.CANCELLATION_WINDOW_TYPE);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyRefunds.getCancellationWindowType());
            wVar.mo68529h(ResponseConstants.CONTACT_SELLER_WITHIN_DAYS);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyRefunds.getContactSellerWithinDays());
            wVar.mo68529h(ResponseConstants.EXCHANGES);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyRefunds.getExchanges());
            wVar.mo68529h(ResponseConstants.NON_REFUNDABLE_ITEMS);
            this.nullableListOfNonRefundableItemAdapter.toJson(wVar, structuredPolicyRefunds.getNonRefundableItems());
            wVar.mo68529h(ResponseConstants.NOT_ACCEPTED_SUMMARY_STRING);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyRefunds.getNotAcceptedSummaryString());
            wVar.mo68529h(ResponseConstants.RETURN_ITEMS_WITHIN_DAYS);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyRefunds.getReturnItemsWithinDays());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
