package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.apiv3.listing.Subrating;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class Subrating_ItemQualityJsonAdapter extends JsonAdapter<Subrating.ItemQuality> {
    public static final int $stable = 8;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("average");

    public Subrating_ItemQualityJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, EmptySet.INSTANCE, "average");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Subrating.ItemQuality)";
    }

    public Subrating.ItemQuality fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Float f = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                f = this.nullableFloatAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new Subrating.ItemQuality(f);
    }

    public void toJson(C17412w wVar, Subrating.ItemQuality itemQuality) {
        C19383o.m32797g(wVar, "writer");
        if (itemQuality != null) {
            wVar.mo68522b();
            wVar.mo68529h("average");
            this.nullableFloatAdapter.toJson(wVar, itemQuality.getAverage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
