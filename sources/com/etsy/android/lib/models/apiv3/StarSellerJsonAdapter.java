package com.etsy.android.lib.models.apiv3;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class StarSellerJsonAdapter extends JsonAdapter<StarSeller> {
    public static final int $stable = 8;
    private final JsonAdapter<StarSellerAboutCard> nullableStarSellerAboutCardAdapter;
    private final JsonAdapter<StarSellerBadge> nullableStarSellerBadgeAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_header", "about_module");

    public StarSellerJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStarSellerBadgeAdapter = yVar.mo68558c(StarSellerBadge.class, emptySet, "badge");
        this.nullableStarSellerAboutCardAdapter = yVar.mo68558c(StarSellerAboutCard.class, emptySet, "aboutCard");
    }

    public String toString() {
        return "GeneratedJsonAdapter(StarSeller)";
    }

    public StarSeller fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        StarSellerBadge starSellerBadge = null;
        StarSellerAboutCard starSellerAboutCard = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                starSellerBadge = this.nullableStarSellerBadgeAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                starSellerAboutCard = this.nullableStarSellerAboutCardAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new StarSeller(starSellerBadge, starSellerAboutCard);
    }

    public void toJson(C17412w wVar, StarSeller starSeller) {
        C19383o.m32797g(wVar, "writer");
        if (starSeller != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_header");
            this.nullableStarSellerBadgeAdapter.toJson(wVar, starSeller.getBadge());
            wVar.mo68529h("about_module");
            this.nullableStarSellerAboutCardAdapter.toJson(wVar, starSeller.getAboutCard());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
