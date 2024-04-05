package com.etsy.android.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.Collection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserCollection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserCollection> CREATOR = new Creator();
    private final String avatar;
    private final Collection collection;
    private final String displayName;

    public static final class Creator implements Parcelable.Creator<UserCollection> {
        public final UserCollection createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new UserCollection((Collection) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        public final UserCollection[] newArray(int i) {
            return new UserCollection[i];
        }
    }

    public UserCollection(Collection collection2, String str, String str2) {
        C19383o.m32797g(collection2, Collection.TYPE_COLLECTION);
        this.collection = collection2;
        this.displayName = str;
        this.avatar = str2;
    }

    public static /* synthetic */ UserCollection copy$default(UserCollection userCollection, Collection collection2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            collection2 = userCollection.collection;
        }
        if ((i & 2) != 0) {
            str = userCollection.displayName;
        }
        if ((i & 4) != 0) {
            str2 = userCollection.avatar;
        }
        return userCollection.copy(collection2, str, str2);
    }

    public final Collection component1() {
        return this.collection;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.avatar;
    }

    public final UserCollection copy(Collection collection2, String str, String str2) {
        C19383o.m32797g(collection2, Collection.TYPE_COLLECTION);
        return new UserCollection(collection2, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCollection)) {
            return false;
        }
        UserCollection userCollection = (UserCollection) obj;
        return C19383o.m32792b(this.collection, userCollection.collection) && C19383o.m32792b(this.displayName, userCollection.displayName) && C19383o.m32792b(this.avatar, userCollection.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final Collection getCollection() {
        return this.collection;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        int hashCode = this.collection.hashCode() * 31;
        String str = this.displayName;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("UserCollection(collection=");
        h.append(this.collection);
        h.append(", displayName=");
        h.append(this.displayName);
        h.append(", avatar=");
        return C0391c.m1057c(h, this.avatar, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeSerializable(this.collection);
        parcel.writeString(this.displayName);
        parcel.writeString(this.avatar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserCollection(Collection collection2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
