package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SelfUserListingJsonAdapter extends JsonAdapter<SelfUserListing> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", ResponseConstants.LISTING);
    private final JsonAdapter<SelfUserListingDetails> selfUserListingDetailsAdapter;

    public SelfUserListingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "listingId");
        this.selfUserListingDetailsAdapter = yVar.mo68558c(SelfUserListingDetails.class, emptySet, "details");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        SelfUserListingDetails selfUserListingDetails = null;
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
            } else if (Q == 1 && (selfUserListingDetails = this.selfUserListingDetailsAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("details", ResponseConstants.LISTING, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            long longValue = l.longValue();
            if (selfUserListingDetails != null) {
                return new SelfUserListing(longValue, selfUserListingDetails);
            }
            throw C18215a.m30728g("details", ResponseConstants.LISTING, jsonReader);
        }
        throw C18215a.m30728g("listingId", "listing_id", jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserListing selfUserListing = (SelfUserListing) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserListing != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(selfUserListing.f19490a));
            wVar.mo68529h(ResponseConstants.LISTING);
            this.selfUserListingDetailsAdapter.toJson(wVar, selfUserListing.f19491b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserListing)";
    }
}
