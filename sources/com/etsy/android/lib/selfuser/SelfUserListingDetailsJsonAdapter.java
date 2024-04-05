package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SelfUserListingDetailsJsonAdapter extends JsonAdapter<SelfUserListingDetails> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "main_image");
    private final JsonAdapter<SelfUserListingImage> selfUserListingImageAdapter;

    public SelfUserListingDetailsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "listingId");
        this.selfUserListingImageAdapter = yVar.mo68558c(SelfUserListingImage.class, emptySet, ResponseConstants.IMAGE);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        SelfUserListingImage selfUserListingImage = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("listingId", "listing_id", jsonReader);
                }
            } else if (Q == 1 && (selfUserListingImage = this.selfUserListingImageAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.IMAGE, "main_image", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            long longValue = l.longValue();
            if (selfUserListingImage != null) {
                return new SelfUserListingDetails(longValue, selfUserListingImage);
            }
            throw C18215a.m30728g(ResponseConstants.IMAGE, "main_image", jsonReader);
        }
        throw C18215a.m30728g("listingId", "listing_id", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserListingDetails selfUserListingDetails = (SelfUserListingDetails) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserListingDetails != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(selfUserListingDetails.f19492a));
            wVar.mo68529h("main_image");
            this.selfUserListingImageAdapter.toJson(wVar, selfUserListingDetails.f19493b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserListingDetails)";
    }
}
