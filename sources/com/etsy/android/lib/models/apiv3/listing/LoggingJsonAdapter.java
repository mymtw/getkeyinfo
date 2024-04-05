package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class LoggingJsonAdapter extends JsonAdapter<Logging> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("seller_currency", "seller_currency_price", "seller_currency_price_int");

    public LoggingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "sellerCurrency");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "sellerCurrencyPriceInt");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Logging)";
    }

    public Logging fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Integer num = null;
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
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new Logging(str, str2, num);
    }

    public void toJson(C17412w wVar, Logging logging) {
        C19383o.m32797g(wVar, "writer");
        if (logging != null) {
            wVar.mo68522b();
            wVar.mo68529h("seller_currency");
            this.nullableStringAdapter.toJson(wVar, logging.getSellerCurrency());
            wVar.mo68529h("seller_currency_price");
            this.nullableStringAdapter.toJson(wVar, logging.getSellerCurrencyPrice());
            wVar.mo68529h("seller_currency_price_int");
            this.nullableIntAdapter.toJson(wVar, logging.getSellerCurrencyPriceInt());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
