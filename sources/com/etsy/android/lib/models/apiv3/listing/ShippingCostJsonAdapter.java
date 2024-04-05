package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShippingCostJsonAdapter extends JsonAdapter<ShippingCost> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("currency", "currency_symbol", ResponseConstants.PRICE);

    public ShippingCostJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "currency");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShippingCost)";
    }

    public ShippingCost fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ShippingCost(str, str2, str3);
    }

    public void toJson(C17412w wVar, ShippingCost shippingCost) {
        C19383o.m32797g(wVar, "writer");
        if (shippingCost != null) {
            wVar.mo68522b();
            wVar.mo68529h("currency");
            this.nullableStringAdapter.toJson(wVar, shippingCost.getCurrency());
            wVar.mo68529h("currency_symbol");
            this.nullableStringAdapter.toJson(wVar, shippingCost.getCurrencySymbol());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, shippingCost.getPrice());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
