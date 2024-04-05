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

public final class TaxonomyAttributeValueJsonAdapter extends JsonAdapter<TaxonomyAttributeValue> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Long>> nullableListOfLongAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("id", "active", "name", ResponseConstants.VERSION, ResponseConstants.SCALE, ResponseConstants.ORDER, ResponseConstants.EQTO, "value");

    public TaxonomyAttributeValueJsonAdapter(C17414y yVar) {
        Class<Long> cls = Long.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(cls, emptySet, "id");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "active");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.ORDER);
        this.nullableListOfLongAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.EQTO);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyAttributeValue)";
    }

    public TaxonomyAttributeValue fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        Long l2 = null;
        Integer num = null;
        List list = null;
        String str3 = null;
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
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list = this.nullableListOfLongAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyAttributeValue(l, bool, str, str2, l2, num, list, str3);
    }

    public void toJson(C17412w wVar, TaxonomyAttributeValue taxonomyAttributeValue) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyAttributeValue != null) {
            wVar.mo68522b();
            wVar.mo68529h("id");
            this.nullableLongAdapter.toJson(wVar, taxonomyAttributeValue.getId());
            wVar.mo68529h("active");
            this.nullableBooleanAdapter.toJson(wVar, taxonomyAttributeValue.getActive());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, taxonomyAttributeValue.getName());
            wVar.mo68529h(ResponseConstants.VERSION);
            this.nullableStringAdapter.toJson(wVar, taxonomyAttributeValue.getVersion());
            wVar.mo68529h(ResponseConstants.SCALE);
            this.nullableLongAdapter.toJson(wVar, taxonomyAttributeValue.getScale());
            wVar.mo68529h(ResponseConstants.ORDER);
            this.nullableIntAdapter.toJson(wVar, taxonomyAttributeValue.getOrder());
            wVar.mo68529h(ResponseConstants.EQTO);
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyAttributeValue.getEqTo());
            wVar.mo68529h("value");
            this.nullableStringAdapter.toJson(wVar, taxonomyAttributeValue.getValue());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
