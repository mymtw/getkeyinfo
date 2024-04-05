package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class FreeShippingDataJsonAdapter extends JsonAdapter<FreeShippingData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FREE_SHIPPING_COPY, ResponseConstants.HAS_FREE_SHIPPING, ResponseConstants.FREE_SHIPPING_MINIMUM, ResponseConstants.IS_ELIGIBLE, "promotion_id", "promotion_type", "tooltip_copy");

    public FreeShippingDataJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "freeShippingCopy");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasFreeShipping");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "promotionId");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "promotionType");
    }

    public String toString() {
        return "GeneratedJsonAdapter(FreeShippingData)";
    }

    public FreeShippingData fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l = null;
        Integer num = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new FreeShippingData(str, bool, bool2, bool3, l, num, str2);
    }

    public void toJson(C17412w wVar, FreeShippingData freeShippingData) {
        C19383o.m32797g(wVar, "writer");
        if (freeShippingData != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FREE_SHIPPING_COPY);
            this.nullableStringAdapter.toJson(wVar, freeShippingData.getFreeShippingCopy());
            wVar.mo68529h(ResponseConstants.HAS_FREE_SHIPPING);
            this.nullableBooleanAdapter.toJson(wVar, freeShippingData.getHasFreeShipping());
            wVar.mo68529h(ResponseConstants.FREE_SHIPPING_MINIMUM);
            this.nullableBooleanAdapter.toJson(wVar, freeShippingData.getHasMin());
            wVar.mo68529h(ResponseConstants.IS_ELIGIBLE);
            this.nullableBooleanAdapter.toJson(wVar, freeShippingData.isEligible());
            wVar.mo68529h("promotion_id");
            this.nullableLongAdapter.toJson(wVar, freeShippingData.getPromotionId());
            wVar.mo68529h("promotion_type");
            this.nullableIntAdapter.toJson(wVar, freeShippingData.getPromotionType());
            wVar.mo68529h("tooltip_copy");
            this.nullableStringAdapter.toJson(wVar, freeShippingData.getTooltipCopy());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
