package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SelfUserListingDetails {

    /* renamed from: a */
    public final long f19492a;

    /* renamed from: b */
    public final SelfUserListingImage f19493b;

    public SelfUserListingDetails(@C17402n(name = "listing_id") long j, @C17402n(name = "main_image") SelfUserListingImage selfUserListingImage) {
        C19383o.m32797g(selfUserListingImage, ResponseConstants.IMAGE);
        this.f19492a = j;
        this.f19493b = selfUserListingImage;
    }

    public final SelfUserListingDetails copy(@C17402n(name = "listing_id") long j, @C17402n(name = "main_image") SelfUserListingImage selfUserListingImage) {
        C19383o.m32797g(selfUserListingImage, ResponseConstants.IMAGE);
        return new SelfUserListingDetails(j, selfUserListingImage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserListingDetails)) {
            return false;
        }
        SelfUserListingDetails selfUserListingDetails = (SelfUserListingDetails) obj;
        return this.f19492a == selfUserListingDetails.f19492a && C19383o.m32792b(this.f19493b, selfUserListingDetails.f19493b);
    }

    public final int hashCode() {
        return this.f19493b.hashCode() + (Long.hashCode(this.f19492a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserListingDetails(listingId=");
        h.append(this.f19492a);
        h.append(", image=");
        h.append(this.f19493b);
        h.append(')');
        return h.toString();
    }
}
