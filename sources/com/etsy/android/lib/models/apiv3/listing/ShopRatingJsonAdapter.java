package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopRatingJsonAdapter extends JsonAdapter<ShopRating> {
    public static final int $stable = 8;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Subratings> nullableSubratingsAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("imported_count", ResponseConstants.RATING, "rating_count", ResponseConstants.STARS, "subratings");

    public ShopRatingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "importedCount");
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, emptySet, ResponseConstants.RATING);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.STARS);
        this.nullableSubratingsAdapter = yVar.mo68558c(Subratings.class, emptySet, "subratings");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopRating)";
    }

    public ShopRating fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Float f = null;
        Integer num2 = null;
        String str = null;
        Subratings subratings = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                f = this.nullableFloatAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 4) {
                subratings = this.nullableSubratingsAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ShopRating(num, f, num2, str, subratings);
    }

    public void toJson(C17412w wVar, ShopRating shopRating) {
        C19383o.m32797g(wVar, "writer");
        if (shopRating != null) {
            wVar.mo68522b();
            wVar.mo68529h("imported_count");
            this.nullableIntAdapter.toJson(wVar, shopRating.getImportedCount());
            wVar.mo68529h(ResponseConstants.RATING);
            this.nullableFloatAdapter.toJson(wVar, shopRating.getRating());
            wVar.mo68529h("rating_count");
            this.nullableIntAdapter.toJson(wVar, shopRating.getRatingCount());
            wVar.mo68529h(ResponseConstants.STARS);
            this.nullableStringAdapter.toJson(wVar, shopRating.getStars());
            wVar.mo68529h("subratings");
            this.nullableSubratingsAdapter.toJson(wVar, shopRating.getSubratings());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
