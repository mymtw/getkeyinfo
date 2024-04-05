package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyCategoryJsonAdapter extends JsonAdapter<TaxonomyCategory> {
    public static final int $stable = 8;
    private final JsonAdapter<DeepLink> nullableDeepLinkAdapter;
    private final JsonAdapter<List<ListingImage>> nullableListOfListingImageAdapter;
    private final JsonAdapter<SearchPageLink> nullableSearchPageLinkAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", "images", ResponseConstants.PAGE_LINK, ResponseConstants.TAXONOMY_ID, ResponseConstants.DEEP_LINK);

    public TaxonomyCategoryJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.nullableListOfListingImageAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ListingImage.class), emptySet, "images");
        this.nullableSearchPageLinkAdapter = yVar.mo68558c(SearchPageLink.class, emptySet, "pageLink");
        this.nullableDeepLinkAdapter = yVar.mo68558c(DeepLink.class, emptySet, "deepLinkField");
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyCategory)";
    }

    public TaxonomyCategory fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        List list = null;
        SearchPageLink searchPageLink = null;
        String str2 = null;
        DeepLink deepLink = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                list = this.nullableListOfListingImageAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                searchPageLink = this.nullableSearchPageLinkAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 4) {
                deepLink = this.nullableDeepLinkAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new TaxonomyCategory(str, list, searchPageLink, str2, deepLink);
    }

    public void toJson(C17412w wVar, TaxonomyCategory taxonomyCategory) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyCategory != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, taxonomyCategory.getName());
            wVar.mo68529h("images");
            this.nullableListOfListingImageAdapter.toJson(wVar, taxonomyCategory.getImages());
            wVar.mo68529h(ResponseConstants.PAGE_LINK);
            this.nullableSearchPageLinkAdapter.toJson(wVar, taxonomyCategory.getPageLink());
            wVar.mo68529h(ResponseConstants.TAXONOMY_ID);
            this.nullableStringAdapter.toJson(wVar, taxonomyCategory.getTaxonomyStringId());
            wVar.mo68529h(ResponseConstants.DEEP_LINK);
            this.nullableDeepLinkAdapter.toJson(wVar, taxonomyCategory.getDeepLinkField());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
