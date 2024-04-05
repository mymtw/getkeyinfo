package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyValueScaleJsonAdapter extends JsonAdapter<TaxonomyValueScale> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("id", ResponseConstants.ETSYWEB_UNIT, ResponseConstants.ORDER, "active", ResponseConstants.LEGACY_SCALE, ResponseConstants.VERSION, ResponseConstants.DISPLAY_NAME_CAMELCASE, "description", ResponseConstants.FORMAT, "buyerShortName", "etsywebUnitName");

    public TaxonomyValueScaleJsonAdapter(C17414y yVar) {
        Class<Integer> cls = Integer.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "id");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.ETSYWEB_UNIT);
        this.nullableIntAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.ORDER);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "active");
        this.nullableListOfIntAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.LEGACY_SCALE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyValueScale)";
    }

    public TaxonomyValueScale fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        Integer num = null;
        Boolean bool = null;
        List list = null;
        String str2 = null;
        String str3 = null;
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
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.nullableListOfIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
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
        return new TaxonomyValueScale(l, str, num, bool, list, str2, str3, str4, str5, str6, str7);
    }

    public void toJson(C17412w wVar, TaxonomyValueScale taxonomyValueScale) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyValueScale != null) {
            wVar.mo68522b();
            wVar.mo68529h("id");
            this.nullableLongAdapter.toJson(wVar, taxonomyValueScale.getId());
            wVar.mo68529h(ResponseConstants.ETSYWEB_UNIT);
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getEtsywebUnit());
            wVar.mo68529h(ResponseConstants.ORDER);
            this.nullableIntAdapter.toJson(wVar, taxonomyValueScale.getOrder());
            wVar.mo68529h("active");
            this.nullableBooleanAdapter.toJson(wVar, taxonomyValueScale.getActive());
            wVar.mo68529h(ResponseConstants.LEGACY_SCALE);
            this.nullableListOfIntAdapter.toJson(wVar, taxonomyValueScale.getLegacyScale());
            wVar.mo68529h(ResponseConstants.VERSION);
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getVersion());
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME_CAMELCASE);
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getDisplayName());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getDescription());
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getFormat());
            wVar.mo68529h("buyerShortName");
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getBuyerShortName());
            wVar.mo68529h("etsywebUnitName");
            this.nullableStringAdapter.toJson(wVar, taxonomyValueScale.getEtsywebUnitName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
