package com.etsy.android.lib.models.apiv3.circles;

import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CircledUserListingInfoJsonAdapter extends JsonAdapter<CircledUserListingInfo> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ListingImage>> listOfListingImageAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("images");

    public CircledUserListingInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfListingImageAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ListingImage.class), EmptySet.INSTANCE, "images");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CircledUserListingInfo)";
    }

    public CircledUserListingInfo fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (list = this.listOfListingImageAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("images", "images", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new CircledUserListingInfo(list);
        }
        throw C18215a.m30728g("images", "images", jsonReader);
    }

    public void toJson(C17412w wVar, CircledUserListingInfo circledUserListingInfo) {
        C19383o.m32797g(wVar, "writer");
        if (circledUserListingInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h("images");
            this.listOfListingImageAdapter.toJson(wVar, circledUserListingInfo.getImages());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
