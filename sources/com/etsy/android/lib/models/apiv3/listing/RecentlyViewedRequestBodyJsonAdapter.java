package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class RecentlyViewedRequestBodyJsonAdapter extends JsonAdapter<RecentlyViewedRequestBody> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("uaid", "limit", "listing_id", "listing_ids_to_timestamps");
    private final JsonAdapter<String> stringAdapter;

    public RecentlyViewedRequestBodyJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "uaid");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "limit");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "listingId");
        this.mapOfStringStringAdapter = yVar.mo68558c(C17387a0.m29126d(Map.class, cls, cls), emptySet, "listingIdsToTimestamps");
    }

    public String toString() {
        return "GeneratedJsonAdapter(RecentlyViewedRequestBody)";
    }

    public RecentlyViewedRequestBody fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        Integer num = null;
        Map map = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("uaid", "uaid", jsonReader);
                }
            } else if (Q == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("listingId", "listing_id", jsonReader);
                }
            } else if (Q == 3 && (map = this.mapOfStringStringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("listingIdsToTimestamps", "listing_ids_to_timestamps", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("uaid", "uaid", jsonReader);
        } else if (l != null) {
            long longValue = l.longValue();
            if (map != null) {
                return new RecentlyViewedRequestBody(str, num, longValue, map);
            }
            throw C18215a.m30728g("listingIdsToTimestamps", "listing_ids_to_timestamps", jsonReader);
        } else {
            throw C18215a.m30728g("listingId", "listing_id", jsonReader);
        }
    }

    public void toJson(C17412w wVar, RecentlyViewedRequestBody recentlyViewedRequestBody) {
        C19383o.m32797g(wVar, "writer");
        if (recentlyViewedRequestBody != null) {
            wVar.mo68522b();
            wVar.mo68529h("uaid");
            this.stringAdapter.toJson(wVar, recentlyViewedRequestBody.getUaid());
            wVar.mo68529h("limit");
            this.nullableIntAdapter.toJson(wVar, recentlyViewedRequestBody.getLimit());
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(recentlyViewedRequestBody.getListingId()));
            wVar.mo68529h("listing_ids_to_timestamps");
            this.mapOfStringStringAdapter.toJson(wVar, recentlyViewedRequestBody.getListingIdsToTimestamps());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
