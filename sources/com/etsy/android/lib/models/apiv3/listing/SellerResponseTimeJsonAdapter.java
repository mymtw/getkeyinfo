package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SellerResponseTimeJsonAdapter extends JsonAdapter<SellerResponseTime> {
    public static final int $stable = 8;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.DISPLAY_TEXT, "average_days");

    public SellerResponseTimeJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "displayText");
        this.doubleAdapter = yVar.mo68558c(Double.TYPE, emptySet, "averageDays");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SellerResponseTime)";
    }

    public SellerResponseTime fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Double d = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1 && (d = this.doubleAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("averageDays", "average_days", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (d != null) {
            return new SellerResponseTime(str, d.doubleValue());
        }
        throw C18215a.m30728g("averageDays", "average_days", jsonReader);
    }

    public void toJson(C17412w wVar, SellerResponseTime sellerResponseTime) {
        C19383o.m32797g(wVar, "writer");
        if (sellerResponseTime != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.DISPLAY_TEXT);
            this.nullableStringAdapter.toJson(wVar, sellerResponseTime.getDisplayText());
            wVar.mo68529h("average_days");
            this.doubleAdapter.toJson(wVar, Double.valueOf(sellerResponseTime.getAverageDays()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
