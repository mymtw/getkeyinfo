package com.etsy.android.lib.models.apiv3.shophome;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShopListingsSearchResultJsonAdapter extends JsonAdapter<ShopListingsSearchResult> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ListingCard>> nullableListOfListingCardAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LISTING_CARDS, ResponseConstants.SORT_ORDER);
    private final JsonAdapter<String> stringAdapter;

    public ShopListingsSearchResultJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, ListingCard.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfListingCardAdapter = yVar.mo68558c(d, emptySet, "listings");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "sortOrder");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopListingsSearchResult)";
    }

    public ShopListingsSearchResult fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfListingCardAdapter.fromJson(jsonReader);
            } else if (Q == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("sortOrder", ResponseConstants.SORT_ORDER, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new ShopListingsSearchResult(list, str);
        }
        throw C18215a.m30728g("sortOrder", ResponseConstants.SORT_ORDER, jsonReader);
    }

    public void toJson(C17412w wVar, ShopListingsSearchResult shopListingsSearchResult) {
        C19383o.m32797g(wVar, "writer");
        if (shopListingsSearchResult != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LISTING_CARDS);
            this.nullableListOfListingCardAdapter.toJson(wVar, shopListingsSearchResult.getListings());
            wVar.mo68529h(ResponseConstants.SORT_ORDER);
            this.stringAdapter.toJson(wVar, shopListingsSearchResult.getSortOrder());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
