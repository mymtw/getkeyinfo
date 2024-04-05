package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyFiltersJsonAdapter extends JsonAdapter<TaxonomyFilters> {
    public static final int $stable = 8;
    private final JsonAdapter<List<TaxonomyFilter>> nullableListOfTaxonomyFilterAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("buyer", "byCraft");

    public TaxonomyFiltersJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableListOfTaxonomyFilterAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, TaxonomyFilter.class), EmptySet.INSTANCE, "buyer");
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyFilters)";
    }

    public TaxonomyFilters fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        List list2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfTaxonomyFilterAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                list2 = this.nullableListOfTaxonomyFilterAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyFilters(list, list2);
    }

    public void toJson(C17412w wVar, TaxonomyFilters taxonomyFilters) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyFilters != null) {
            wVar.mo68522b();
            wVar.mo68529h("buyer");
            this.nullableListOfTaxonomyFilterAdapter.toJson(wVar, taxonomyFilters.getBuyer());
            wVar.mo68529h("byCraft");
            this.nullableListOfTaxonomyFilterAdapter.toJson(wVar, taxonomyFilters.getByCraft());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
