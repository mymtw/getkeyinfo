package com.etsy.android.lib.models.apiv3.search;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class GiftGuideJsonAdapter extends JsonAdapter<GiftGuide> {
    public static final int $stable = 8;
    private final JsonAdapter<ListingImage> listingImageAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", ResponseConstants.IMAGE, ResponseConstants.DEEP_LINK);
    private final JsonAdapter<String> stringAdapter;

    public GiftGuideJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.listingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMAGE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(GiftGuide)";
    }

    public GiftGuide fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        ListingImage listingImage = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("title", "title", jsonReader);
                }
            } else if (Q == 1) {
                listingImage = this.listingImageAdapter.fromJson(jsonReader);
                if (listingImage == null) {
                    throw C18215a.m30734m(ResponseConstants.IMAGE, ResponseConstants.IMAGE, jsonReader);
                }
            } else if (Q == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("deepLink", ResponseConstants.DEEP_LINK, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("title", "title", jsonReader);
        } else if (listingImage == null) {
            throw C18215a.m30728g(ResponseConstants.IMAGE, ResponseConstants.IMAGE, jsonReader);
        } else if (str2 != null) {
            return new GiftGuide(str, listingImage, str2);
        } else {
            throw C18215a.m30728g("deepLink", ResponseConstants.DEEP_LINK, jsonReader);
        }
    }

    public void toJson(C17412w wVar, GiftGuide giftGuide) {
        C19383o.m32797g(wVar, "writer");
        if (giftGuide != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, giftGuide.getTitle());
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.listingImageAdapter.toJson(wVar, giftGuide.getImage());
            wVar.mo68529h(ResponseConstants.DEEP_LINK);
            this.stringAdapter.toJson(wVar, giftGuide.getDeepLink());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
