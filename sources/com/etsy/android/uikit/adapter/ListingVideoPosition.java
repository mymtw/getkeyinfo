package com.etsy.android.uikit.adapter;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0015b;

public final class ListingVideoPosition implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListingVideoPosition> CREATOR = new Creator();
    private final long currentPosition;
    private final Uri uri;

    public static final class Creator implements Parcelable.Creator<ListingVideoPosition> {
        public final ListingVideoPosition createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ListingVideoPosition((Uri) parcel.readParcelable(ListingVideoPosition.class.getClassLoader()), parcel.readLong());
        }

        public final ListingVideoPosition[] newArray(int i) {
            return new ListingVideoPosition[i];
        }
    }

    public ListingVideoPosition(Uri uri2, long j) {
        C19383o.m32797g(uri2, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        this.uri = uri2;
        this.currentPosition = j;
    }

    public static /* synthetic */ ListingVideoPosition copy$default(ListingVideoPosition listingVideoPosition, Uri uri2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            uri2 = listingVideoPosition.uri;
        }
        if ((i & 2) != 0) {
            j = listingVideoPosition.currentPosition;
        }
        return listingVideoPosition.copy(uri2, j);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final long component2() {
        return this.currentPosition;
    }

    public final ListingVideoPosition copy(Uri uri2, long j) {
        C19383o.m32797g(uri2, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return new ListingVideoPosition(uri2, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingVideoPosition)) {
            return false;
        }
        ListingVideoPosition listingVideoPosition = (ListingVideoPosition) obj;
        return C19383o.m32792b(this.uri, listingVideoPosition.uri) && this.currentPosition == listingVideoPosition.currentPosition;
    }

    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Long.hashCode(this.currentPosition) + (this.uri.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingVideoPosition(uri=");
        h.append(this.uri);
        h.append(", currentPosition=");
        return C0015b.m91j(h, this.currentPosition, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeParcelable(this.uri, i);
        parcel.writeLong(this.currentPosition);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingVideoPosition(Uri uri2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri2, (i & 2) != 0 ? 0 : j);
    }
}
