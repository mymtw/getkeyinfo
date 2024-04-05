package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShippingUpgradeResultsJsonAdapter extends JsonAdapter<ShippingUpgradeResults> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<ShippingUpgrade>> nullableListOfShippingUpgradeAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("domestic", "has_domestic", "has_international", "international");

    public ShippingUpgradeResultsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, ShippingUpgrade.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfShippingUpgradeAdapter = yVar.mo68558c(d, emptySet, "domestic");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasDomestic");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShippingUpgradeResults)";
    }

    public ShippingUpgradeResults fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfShippingUpgradeAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                list2 = this.nullableListOfShippingUpgradeAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ShippingUpgradeResults(list, bool, bool2, list2);
    }

    public void toJson(C17412w wVar, ShippingUpgradeResults shippingUpgradeResults) {
        C19383o.m32797g(wVar, "writer");
        if (shippingUpgradeResults != null) {
            wVar.mo68522b();
            wVar.mo68529h("domestic");
            this.nullableListOfShippingUpgradeAdapter.toJson(wVar, shippingUpgradeResults.getDomestic());
            wVar.mo68529h("has_domestic");
            this.nullableBooleanAdapter.toJson(wVar, shippingUpgradeResults.getHasDomestic());
            wVar.mo68529h("has_international");
            this.nullableBooleanAdapter.toJson(wVar, shippingUpgradeResults.getHasInternational());
            wVar.mo68529h("international");
            this.nullableListOfShippingUpgradeAdapter.toJson(wVar, shippingUpgradeResults.getInternational());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
