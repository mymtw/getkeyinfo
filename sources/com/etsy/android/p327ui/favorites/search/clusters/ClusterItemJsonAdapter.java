package com.etsy.android.p327ui.favorites.search.clusters;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.search.clusters.ClusterItemJsonAdapter */
public final class ClusterItemJsonAdapter extends JsonAdapter<ClusterItem> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("query", ResponseConstants.IMAGE_URL);

    public ClusterItemJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "query");
    }

    public final Object fromJson(JsonReader jsonReader) {
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
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ClusterItem(str, str2);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ClusterItem clusterItem = (ClusterItem) obj;
        C19383o.m32797g(wVar, "writer");
        if (clusterItem != null) {
            wVar.mo68522b();
            wVar.mo68529h("query");
            this.nullableStringAdapter.toJson(wVar, clusterItem.f21811a);
            wVar.mo68529h(ResponseConstants.IMAGE_URL);
            this.nullableStringAdapter.toJson(wVar, clusterItem.f21812b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ClusterItem)";
    }
}
