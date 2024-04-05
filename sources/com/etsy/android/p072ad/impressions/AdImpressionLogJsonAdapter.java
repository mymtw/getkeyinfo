package com.etsy.android.p072ad.impressions;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ad.impressions.AdImpressionLogJsonAdapter */
public final class AdImpressionLogJsonAdapter extends JsonAdapter<AdImpressionLog> {
    public static final int $stable = 8;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("display_locs", "logging_keys");

    public AdImpressionLogJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, String.class), EmptySet.INSTANCE, "displayLocations");
    }

    public final Object fromJson(JsonReader jsonReader) {
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
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw C18215a.m30734m("displayLocations", "display_locs", jsonReader);
                }
            } else if (Q == 1 && (list2 = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("loggingKeys", "logging_keys", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list == null) {
            throw C18215a.m30728g("displayLocations", "display_locs", jsonReader);
        } else if (list2 != null) {
            return new AdImpressionLog(list, list2);
        } else {
            throw C18215a.m30728g("loggingKeys", "logging_keys", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        AdImpressionLog adImpressionLog = (AdImpressionLog) obj;
        C19383o.m32797g(wVar, "writer");
        if (adImpressionLog != null) {
            wVar.mo68522b();
            wVar.mo68529h("display_locs");
            this.listOfStringAdapter.toJson(wVar, adImpressionLog.f14107a);
            wVar.mo68529h("logging_keys");
            this.listOfStringAdapter.toJson(wVar, adImpressionLog.f14108b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AdImpressionLog)";
    }
}
