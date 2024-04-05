package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class IANShopRatingJsonAdapter extends JsonAdapter<IANShopRating> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.COUNT, ResponseConstants.RATING);

    public IANShopRatingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "ratingCount");
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, emptySet, ResponseConstants.RATING);
    }

    public String toString() {
        return "GeneratedJsonAdapter(IANShopRating)";
    }

    public IANShopRating fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Float f = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("ratingCount", ResponseConstants.COUNT, jsonReader);
                }
            } else if (Q == 1) {
                f = this.nullableFloatAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            return new IANShopRating(num.intValue(), f);
        }
        throw C18215a.m30728g("ratingCount", ResponseConstants.COUNT, jsonReader);
    }

    public void toJson(C17412w wVar, IANShopRating iANShopRating) {
        C19383o.m32797g(wVar, "writer");
        if (iANShopRating != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.COUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(iANShopRating.getRatingCount()));
            wVar.mo68529h(ResponseConstants.RATING);
            this.nullableFloatAdapter.toJson(wVar, iANShopRating.getRating());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
