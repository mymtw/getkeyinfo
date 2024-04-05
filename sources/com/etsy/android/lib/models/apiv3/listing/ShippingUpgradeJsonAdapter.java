package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShippingUpgradeJsonAdapter extends JsonAdapter<ShippingUpgrade> {
    public static final int $stable = 8;
    private final JsonAdapter<ShippingCost> nullableShippingCostAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("destination", "primary_cost", "secondary_cost");

    public ShippingUpgradeJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "destination");
        this.nullableShippingCostAdapter = yVar.mo68558c(ShippingCost.class, emptySet, "primaryCost");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShippingUpgrade)";
    }

    public ShippingUpgrade fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        ShippingCost shippingCost = null;
        ShippingCost shippingCost2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                shippingCost = this.nullableShippingCostAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                shippingCost2 = this.nullableShippingCostAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ShippingUpgrade(str, shippingCost, shippingCost2);
    }

    public void toJson(C17412w wVar, ShippingUpgrade shippingUpgrade) {
        C19383o.m32797g(wVar, "writer");
        if (shippingUpgrade != null) {
            wVar.mo68522b();
            wVar.mo68529h("destination");
            this.nullableStringAdapter.toJson(wVar, shippingUpgrade.getDestination());
            wVar.mo68529h("primary_cost");
            this.nullableShippingCostAdapter.toJson(wVar, shippingUpgrade.getPrimaryCost());
            wVar.mo68529h("secondary_cost");
            this.nullableShippingCostAdapter.toJson(wVar, shippingUpgrade.getSecondaryCost());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
