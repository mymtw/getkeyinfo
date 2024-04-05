package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ListingJsonAdapter extends JsonAdapter<Listing> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<MainImage> nullableMainImageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", ResponseConstants.HAS_VARIATIONS, ResponseConstants.IS_PERSONALIZABLE, "is_digital", "state", "title", "is_vintage", "main_image");

    public ListingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "listingId");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasVariations");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.nullableMainImageAdapter = yVar.mo68558c(MainImage.class, emptySet, "mainImage");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Listing)";
    }

    public Listing fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num2 = null;
        String str = null;
        Boolean bool4 = null;
        MainImage mainImage = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    mainImage = this.nullableMainImageAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new Listing(num, bool, bool2, bool3, num2, str, bool4, mainImage);
    }

    public void toJson(C17412w wVar, Listing listing) {
        C19383o.m32797g(wVar, "writer");
        if (listing != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.nullableIntAdapter.toJson(wVar, listing.getListingId());
            wVar.mo68529h(ResponseConstants.HAS_VARIATIONS);
            this.nullableBooleanAdapter.toJson(wVar, listing.getHasVariations());
            wVar.mo68529h(ResponseConstants.IS_PERSONALIZABLE);
            this.nullableBooleanAdapter.toJson(wVar, listing.isPersonalizable());
            wVar.mo68529h("is_digital");
            this.nullableBooleanAdapter.toJson(wVar, listing.isDigital());
            wVar.mo68529h("state");
            this.nullableIntAdapter.toJson(wVar, listing.getState());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, listing.getTitle());
            wVar.mo68529h("is_vintage");
            this.nullableBooleanAdapter.toJson(wVar, listing.isVintage());
            wVar.mo68529h("main_image");
            this.nullableMainImageAdapter.toJson(wVar, listing.getMainImage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
