package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.QuickDelivery;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class QuickDeliveryJsonAdapter extends JsonAdapter<QuickDelivery> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", QuickDelivery.ESTIMATED_DELIVERY_DATE);
    private final JsonAdapter<String> stringAdapter;

    public QuickDeliveryJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "quickDeliveryTitle");
    }

    public String toString() {
        return "GeneratedJsonAdapter(QuickDelivery)";
    }

    public QuickDelivery fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("quickDeliveryTitle", "title", jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("estimatedDeliveryDate", QuickDelivery.ESTIMATED_DELIVERY_DATE, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("quickDeliveryTitle", "title", jsonReader);
        } else if (str2 != null) {
            return new QuickDelivery(str, str2);
        } else {
            throw C18215a.m30728g("estimatedDeliveryDate", QuickDelivery.ESTIMATED_DELIVERY_DATE, jsonReader);
        }
    }

    public void toJson(C17412w wVar, QuickDelivery quickDelivery) {
        C19383o.m32797g(wVar, "writer");
        if (quickDelivery != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, quickDelivery.getQuickDeliveryTitle());
            wVar.mo68529h(QuickDelivery.ESTIMATED_DELIVERY_DATE);
            this.stringAdapter.toJson(wVar, quickDelivery.getEstimatedDeliveryDate());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
