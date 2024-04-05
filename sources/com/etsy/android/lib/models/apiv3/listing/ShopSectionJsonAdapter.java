package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopSectionJsonAdapter extends JsonAdapter<ShopSection> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ListingCard>> nullableListOfListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ACTIVE_LISTING_COUNT, "listings", ResponseConstants.RANK, ResponseConstants.SHOP_SECTION_ID, "title");

    public ShopSectionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "activeListingCount");
        this.nullableListOfListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ListingCard.class), emptySet, "listings");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "shopSectionId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopSection)";
    }

    public ShopSection fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        List list = null;
        Integer num2 = null;
        Long l = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                list = this.nullableListOfListingCardAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 4) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ShopSection(num, list, num2, l, str);
    }

    public void toJson(C17412w wVar, ShopSection shopSection) {
        C19383o.m32797g(wVar, "writer");
        if (shopSection != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ACTIVE_LISTING_COUNT);
            this.nullableIntAdapter.toJson(wVar, shopSection.getActiveListingCount());
            wVar.mo68529h("listings");
            this.nullableListOfListingCardAdapter.toJson(wVar, shopSection.getListings());
            wVar.mo68529h(ResponseConstants.RANK);
            this.nullableIntAdapter.toJson(wVar, shopSection.getRank());
            wVar.mo68529h(ResponseConstants.SHOP_SECTION_ID);
            this.nullableLongAdapter.toJson(wVar, shopSection.getShopSectionId());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, shopSection.getTitle());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
