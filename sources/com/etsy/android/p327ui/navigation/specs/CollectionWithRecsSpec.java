package com.etsy.android.p327ui.navigation.specs;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.navigation.specs.CollectionWithRecsSpec */
public final class CollectionWithRecsSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollectionWithRecsSpec> CREATOR = new Creator();
    private final long collectionId;
    private final String collectionKey;
    private final int count;
    private final boolean showSuggestionsTabFirst;
    private final String slug;
    private final long userId;

    /* renamed from: com.etsy.android.ui.navigation.specs.CollectionWithRecsSpec$Creator */
    public static final class Creator implements Parcelable.Creator<CollectionWithRecsSpec> {
        public final CollectionWithRecsSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new CollectionWithRecsSpec(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0);
        }

        public final CollectionWithRecsSpec[] newArray(int i) {
            return new CollectionWithRecsSpec[i];
        }
    }

    public CollectionWithRecsSpec(String str, long j, String str2, int i, long j2, boolean z) {
        C19383o.m32797g(str, "collectionKey");
        C19383o.m32797g(str2, "slug");
        this.collectionKey = str;
        this.userId = j;
        this.slug = str2;
        this.count = i;
        this.collectionId = j2;
        this.showSuggestionsTabFirst = z;
    }

    public static /* synthetic */ CollectionWithRecsSpec copy$default(CollectionWithRecsSpec collectionWithRecsSpec, String str, long j, String str2, int i, long j2, boolean z, int i2, Object obj) {
        CollectionWithRecsSpec collectionWithRecsSpec2 = collectionWithRecsSpec;
        return collectionWithRecsSpec.copy((i2 & 1) != 0 ? collectionWithRecsSpec2.collectionKey : str, (i2 & 2) != 0 ? collectionWithRecsSpec2.userId : j, (i2 & 4) != 0 ? collectionWithRecsSpec2.slug : str2, (i2 & 8) != 0 ? collectionWithRecsSpec2.count : i, (i2 & 16) != 0 ? collectionWithRecsSpec2.collectionId : j2, (i2 & 32) != 0 ? collectionWithRecsSpec2.showSuggestionsTabFirst : z);
    }

    public final String component1() {
        return this.collectionKey;
    }

    public final long component2() {
        return this.userId;
    }

    public final String component3() {
        return this.slug;
    }

    public final int component4() {
        return this.count;
    }

    public final long component5() {
        return this.collectionId;
    }

    public final boolean component6() {
        return this.showSuggestionsTabFirst;
    }

    public final CollectionWithRecsSpec copy(String str, long j, String str2, int i, long j2, boolean z) {
        C19383o.m32797g(str, "collectionKey");
        C19383o.m32797g(str2, "slug");
        return new CollectionWithRecsSpec(str, j, str2, i, j2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionWithRecsSpec)) {
            return false;
        }
        CollectionWithRecsSpec collectionWithRecsSpec = (CollectionWithRecsSpec) obj;
        return C19383o.m32792b(this.collectionKey, collectionWithRecsSpec.collectionKey) && this.userId == collectionWithRecsSpec.userId && C19383o.m32792b(this.slug, collectionWithRecsSpec.slug) && this.count == collectionWithRecsSpec.count && this.collectionId == collectionWithRecsSpec.collectionId && this.showSuggestionsTabFirst == collectionWithRecsSpec.showSuggestionsTabFirst;
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionKey() {
        return this.collectionKey;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getShowSuggestionsTabFirst() {
        return this.showSuggestionsTabFirst;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int b = C0071c.m190b(this.collectionId, C0069a.m170a(this.count, C0023f.m105e(this.slug, C0071c.m190b(this.userId, this.collectionKey.hashCode() * 31, 31), 31), 31), 31);
        boolean z = this.showSuggestionsTabFirst;
        if (z) {
            z = true;
        }
        return b + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CollectionWithRecsSpec(collectionKey=");
        h.append(this.collectionKey);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", slug=");
        h.append(this.slug);
        h.append(", count=");
        h.append(this.count);
        h.append(", collectionId=");
        h.append(this.collectionId);
        h.append(", showSuggestionsTabFirst=");
        return C0391c.m1058d(h, this.showSuggestionsTabFirst, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.collectionKey);
        parcel.writeLong(this.userId);
        parcel.writeString(this.slug);
        parcel.writeInt(this.count);
        parcel.writeLong(this.collectionId);
        parcel.writeInt(this.showSuggestionsTabFirst ? 1 : 0);
    }
}
