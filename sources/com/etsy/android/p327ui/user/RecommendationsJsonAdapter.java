package com.etsy.android.p327ui.user;

import com.etsy.android.lib.models.apiv3.ListingCard;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.RecommendationsJsonAdapter */
public final class RecommendationsJsonAdapter extends JsonAdapter<Recommendations> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ListingCard>> nullableListOfListingCardAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("complementary_listing_cards");

    public RecommendationsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableListOfListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ListingCard.class), EmptySet.INSTANCE, "complementaryListings");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfListingCardAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new Recommendations(list);
    }

    public final void toJson(C17412w wVar, Object obj) {
        Recommendations recommendations = (Recommendations) obj;
        C19383o.m32797g(wVar, "writer");
        if (recommendations != null) {
            wVar.mo68522b();
            wVar.mo68529h("complementary_listing_cards");
            this.nullableListOfListingCardAdapter.toJson(wVar, recommendations.f25015a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Recommendations)";
    }
}
