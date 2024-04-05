package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SelfUserListing {

    /* renamed from: a */
    public final long f19490a;

    /* renamed from: b */
    public final SelfUserListingDetails f19491b;

    public SelfUserListing(@C17402n(name = "listing_id") long j, @C17402n(name = "listing") SelfUserListingDetails selfUserListingDetails) {
        C19383o.m32797g(selfUserListingDetails, "details");
        this.f19490a = j;
        this.f19491b = selfUserListingDetails;
    }

    public final SelfUserListing copy(@C17402n(name = "listing_id") long j, @C17402n(name = "listing") SelfUserListingDetails selfUserListingDetails) {
        C19383o.m32797g(selfUserListingDetails, "details");
        return new SelfUserListing(j, selfUserListingDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserListing)) {
            return false;
        }
        SelfUserListing selfUserListing = (SelfUserListing) obj;
        return this.f19490a == selfUserListing.f19490a && C19383o.m32792b(this.f19491b, selfUserListing.f19491b);
    }

    public final int hashCode() {
        return this.f19491b.hashCode() + (Long.hashCode(this.f19490a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserListing(listingId=");
        h.append(this.f19490a);
        h.append(", details=");
        h.append(this.f19491b);
        h.append(')');
        return h.toString();
    }
}
