package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyFilterJsonAdapter extends JsonAdapter<TaxonomyFilter> {
    public static final int $stable = 8;
    private final JsonAdapter<List<TaxonomyAttributeValue>> nullableListOfTaxonomyAttributeValueAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(AttributeFacet.ATTRIBUTE, ResponseConstants.DISPLAY_NAME_CAMELCASE, ResponseConstants.VALUES);

    public TaxonomyFilterJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, AttributeFacet.ATTRIBUTE);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        this.nullableListOfTaxonomyAttributeValueAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, TaxonomyAttributeValue.class), emptySet, ResponseConstants.VALUES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyFilter)";
    }

    public TaxonomyFilter fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                list = this.nullableListOfTaxonomyAttributeValueAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyFilter(l, str, list);
    }

    public void toJson(C17412w wVar, TaxonomyFilter taxonomyFilter) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyFilter != null) {
            wVar.mo68522b();
            wVar.mo68529h(AttributeFacet.ATTRIBUTE);
            this.nullableLongAdapter.toJson(wVar, taxonomyFilter.getAttribute());
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME_CAMELCASE);
            this.nullableStringAdapter.toJson(wVar, taxonomyFilter.getDisplayName());
            wVar.mo68529h(ResponseConstants.VALUES);
            this.nullableListOfTaxonomyAttributeValueAdapter.toJson(wVar, taxonomyFilter.getValues());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
