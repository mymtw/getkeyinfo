package com.etsy.android.search;

import com.etsy.android.lib.models.apiv3.search.GiftGuide;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.search.CompositeSuggestions;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CompositeSuggestionsJsonAdapter extends JsonAdapter<CompositeSuggestions> {
    public static final int $stable = 8;
    private final JsonAdapter<List<GiftGuide>> nullableListOfGiftGuideAdapter;
    private final JsonAdapter<List<SearchLandingSuggestions.RecentlyViewed>> nullableListOfRecentlyViewedAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<CompositeSuggestions.ShopsResponse> nullableShopsResponseAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("autosuggest", "shop_search", "gift_guides", "recently_viewed");

    public CompositeSuggestionsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfStringAdapter = yVar.mo68558c(d, emptySet, "autosuggest");
        this.nullableShopsResponseAdapter = yVar.mo68558c(CompositeSuggestions.ShopsResponse.class, emptySet, "shopSearch");
        this.nullableListOfGiftGuideAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, GiftGuide.class), emptySet, "giftGuides");
        this.nullableListOfRecentlyViewedAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SearchLandingSuggestions.RecentlyViewed.class), emptySet, "recentlyViewed");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        CompositeSuggestions.ShopsResponse shopsResponse = null;
        List list2 = null;
        List list3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                shopsResponse = this.nullableShopsResponseAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                list2 = this.nullableListOfGiftGuideAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                list3 = this.nullableListOfRecentlyViewedAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new CompositeSuggestions(list, shopsResponse, list2, list3);
    }

    public final void toJson(C17412w wVar, Object obj) {
        CompositeSuggestions compositeSuggestions = (CompositeSuggestions) obj;
        C19383o.m32797g(wVar, "writer");
        if (compositeSuggestions != null) {
            wVar.mo68522b();
            wVar.mo68529h("autosuggest");
            this.nullableListOfStringAdapter.toJson(wVar, compositeSuggestions.f19775a);
            wVar.mo68529h("shop_search");
            this.nullableShopsResponseAdapter.toJson(wVar, compositeSuggestions.f19776b);
            wVar.mo68529h("gift_guides");
            this.nullableListOfGiftGuideAdapter.toJson(wVar, compositeSuggestions.f19777c);
            wVar.mo68529h("recently_viewed");
            this.nullableListOfRecentlyViewedAdapter.toJson(wVar, compositeSuggestions.f19778d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CompositeSuggestions)";
    }
}
