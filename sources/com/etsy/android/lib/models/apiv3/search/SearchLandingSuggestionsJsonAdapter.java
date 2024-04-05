package com.etsy.android.lib.models.apiv3.search;

import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SearchLandingSuggestionsJsonAdapter extends JsonAdapter<SearchLandingSuggestions> {
    public static final int $stable = 8;
    private volatile Constructor<SearchLandingSuggestions> constructorRef;
    private final JsonAdapter<List<TaxonomyNode>> listOfTaxonomyNodeAdapter;
    private final JsonAdapter<List<GiftGuide>> nullableListOfGiftGuideAdapter;
    private final JsonAdapter<List<Query>> nullableListOfQueryAdapter;
    private final JsonAdapter<List<SearchLandingSuggestions.RecentlyViewed>> nullableListOfRecentlyViewedAdapter;
    private final JsonAdapter<List<SearchLandingSuggestions.SavableSearchQuery>> nullableListOfSavableSearchQueryAdapter;
    private final JsonAdapter<SearchLandingSuggestions.PurchaseGiftCard> nullablePurchaseGiftCardAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("categories", "recent_searches", "popular_searches", "gift_guides", "purchase_gift_card", "recently_viewed", "saved_searches");

    public SearchLandingSuggestionsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, TaxonomyNode.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfTaxonomyNodeAdapter = yVar.mo68558c(d, emptySet, "categories");
        this.nullableListOfQueryAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Query.class), emptySet, "recentSearches");
        this.nullableListOfGiftGuideAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, GiftGuide.class), emptySet, "giftGuides");
        this.nullablePurchaseGiftCardAdapter = yVar.mo68558c(SearchLandingSuggestions.PurchaseGiftCard.class, emptySet, "purchaseGiftCard");
        this.nullableListOfRecentlyViewedAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SearchLandingSuggestions.RecentlyViewed.class), emptySet, "recentlyViewed");
        this.nullableListOfSavableSearchQueryAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SearchLandingSuggestions.SavableSearchQuery.class), emptySet, "savedSearches");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchLandingSuggestions)";
    }

    public SearchLandingSuggestions fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        SearchLandingSuggestions.PurchaseGiftCard purchaseGiftCard = null;
        List list5 = null;
        List list6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    list = this.listOfTaxonomyNodeAdapter.fromJson(jsonReader2);
                    if (list != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("categories", "categories", jsonReader2);
                    }
                case 1:
                    list2 = this.nullableListOfQueryAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    list3 = this.nullableListOfQueryAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    list4 = this.nullableListOfGiftGuideAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    purchaseGiftCard = this.nullablePurchaseGiftCardAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    list5 = this.nullableListOfRecentlyViewedAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    list6 = this.nullableListOfSavableSearchQueryAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -128) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.lib.models.apiv3.search.TaxonomyNode>");
            return new SearchLandingSuggestions(list, list2, list3, list4, purchaseGiftCard, list5, list6);
        }
        Constructor<SearchLandingSuggestions> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SearchLandingSuggestions.class.getDeclaredConstructor(new Class[]{List.class, List.class, List.class, List.class, SearchLandingSuggestions.PurchaseGiftCard.class, List.class, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SearchLandingSuggestions…his.constructorRef = it }");
        }
        SearchLandingSuggestions newInstance = constructor.newInstance(new Object[]{list, list2, list3, list4, purchaseGiftCard, list5, list6, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, SearchLandingSuggestions searchLandingSuggestions) {
        C19383o.m32797g(wVar, "writer");
        if (searchLandingSuggestions != null) {
            wVar.mo68522b();
            wVar.mo68529h("categories");
            this.listOfTaxonomyNodeAdapter.toJson(wVar, searchLandingSuggestions.getCategories());
            wVar.mo68529h("recent_searches");
            this.nullableListOfQueryAdapter.toJson(wVar, searchLandingSuggestions.getRecentSearches());
            wVar.mo68529h("popular_searches");
            this.nullableListOfQueryAdapter.toJson(wVar, searchLandingSuggestions.getPopularSearches());
            wVar.mo68529h("gift_guides");
            this.nullableListOfGiftGuideAdapter.toJson(wVar, searchLandingSuggestions.getGiftGuides());
            wVar.mo68529h("purchase_gift_card");
            this.nullablePurchaseGiftCardAdapter.toJson(wVar, searchLandingSuggestions.getPurchaseGiftCard());
            wVar.mo68529h("recently_viewed");
            this.nullableListOfRecentlyViewedAdapter.toJson(wVar, searchLandingSuggestions.getRecentlyViewed());
            wVar.mo68529h("saved_searches");
            this.nullableListOfSavableSearchQueryAdapter.toJson(wVar, searchLandingSuggestions.getSavedSearches());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
