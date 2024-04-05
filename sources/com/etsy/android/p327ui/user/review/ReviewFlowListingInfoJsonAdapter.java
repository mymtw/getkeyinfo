package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowListingInfoJsonAdapter */
public final class ReviewFlowListingInfoJsonAdapter extends JsonAdapter<ReviewFlowListingInfo> {
    public static final int $stable = 8;
    private final JsonAdapter<ListingImage> nullableListingImageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LISTING_TITLE, "variation", ResponseConstants.IMG);

    public ReviewFlowListingInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.nullableListingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMAGE);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        ListingImage listingImage = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                listingImage = this.nullableListingImageAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ReviewFlowListingInfo(str, str2, listingImage);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowListingInfo reviewFlowListingInfo = (ReviewFlowListingInfo) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowListingInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LISTING_TITLE);
            this.nullableStringAdapter.toJson(wVar, reviewFlowListingInfo.f25995a);
            wVar.mo68529h("variation");
            this.nullableStringAdapter.toJson(wVar, reviewFlowListingInfo.f25996b);
            wVar.mo68529h(ResponseConstants.IMG);
            this.nullableListingImageAdapter.toJson(wVar, reviewFlowListingInfo.f25997c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowListingInfo)";
    }
}
