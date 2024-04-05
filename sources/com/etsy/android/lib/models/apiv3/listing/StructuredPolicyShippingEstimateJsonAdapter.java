package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class StructuredPolicyShippingEstimateJsonAdapter extends JsonAdapter<StructuredPolicyShippingEstimate> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.DISPLAY_NAME, "region", ResponseConstants.REGION_CODE, "type", ResponseConstants.MIN, ResponseConstants.MAX, ResponseConstants.UNIT, ResponseConstants.COUNTRY_ID);

    public StructuredPolicyShippingEstimateJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.MIN);
    }

    public String toString() {
        return "GeneratedJsonAdapter(StructuredPolicyShippingEstimate)";
    }

    public StructuredPolicyShippingEstimate fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        Integer num3 = null;
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
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new StructuredPolicyShippingEstimate(str, str2, str3, str4, num, num2, str5, num3);
    }

    public void toJson(C17412w wVar, StructuredPolicyShippingEstimate structuredPolicyShippingEstimate) {
        C19383o.m32797g(wVar, "writer");
        if (structuredPolicyShippingEstimate != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyShippingEstimate.getDisplayName());
            wVar.mo68529h("region");
            this.nullableStringAdapter.toJson(wVar, structuredPolicyShippingEstimate.getRegion());
            wVar.mo68529h(ResponseConstants.REGION_CODE);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyShippingEstimate.getRegionCode());
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, structuredPolicyShippingEstimate.getType());
            wVar.mo68529h(ResponseConstants.MIN);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyShippingEstimate.getMin());
            wVar.mo68529h(ResponseConstants.MAX);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyShippingEstimate.getMax());
            wVar.mo68529h(ResponseConstants.UNIT);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyShippingEstimate.getUnit());
            wVar.mo68529h(ResponseConstants.COUNTRY_ID);
            this.nullableIntAdapter.toJson(wVar, structuredPolicyShippingEstimate.getCountryId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
