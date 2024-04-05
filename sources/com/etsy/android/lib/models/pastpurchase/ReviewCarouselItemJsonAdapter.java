package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ReviewCarouselItemJsonAdapter extends JsonAdapter<ReviewCarouselItem> {
    public static final int $stable = 8;
    private final JsonAdapter<ListingImage> listingImageAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.TRANSACTION_ID, ResponseConstants.IMAGE, "title", ResponseConstants.LISTING_TITLE);
    private final JsonAdapter<String> stringAdapter;

    public ReviewCarouselItemJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "transactionId");
        this.listingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMAGE);
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "title");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReviewCarouselItem)";
    }

    public ReviewCarouselItem fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        ListingImage listingImage = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("transactionId", ResponseConstants.TRANSACTION_ID, jsonReader);
                }
            } else if (Q == 1) {
                listingImage = this.listingImageAdapter.fromJson(jsonReader);
                if (listingImage == null) {
                    throw C18215a.m30734m(ResponseConstants.IMAGE, ResponseConstants.IMAGE, jsonReader);
                }
            } else if (Q == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("title", "title", jsonReader);
                }
            } else if (Q == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("listingTitle", ResponseConstants.LISTING_TITLE, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            long longValue = l.longValue();
            if (listingImage == null) {
                throw C18215a.m30728g(ResponseConstants.IMAGE, ResponseConstants.IMAGE, jsonReader);
            } else if (str == null) {
                throw C18215a.m30728g("title", "title", jsonReader);
            } else if (str2 != null) {
                return new ReviewCarouselItem(longValue, listingImage, str, str2);
            } else {
                throw C18215a.m30728g("listingTitle", ResponseConstants.LISTING_TITLE, jsonReader);
            }
        } else {
            throw C18215a.m30728g("transactionId", ResponseConstants.TRANSACTION_ID, jsonReader);
        }
    }

    public void toJson(C17412w wVar, ReviewCarouselItem reviewCarouselItem) {
        C19383o.m32797g(wVar, "writer");
        if (reviewCarouselItem != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(reviewCarouselItem.getTransactionId()));
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.listingImageAdapter.toJson(wVar, reviewCarouselItem.getImage());
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, reviewCarouselItem.getTitle());
            wVar.mo68529h(ResponseConstants.LISTING_TITLE);
            this.stringAdapter.toJson(wVar, reviewCarouselItem.getListingTitle());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
