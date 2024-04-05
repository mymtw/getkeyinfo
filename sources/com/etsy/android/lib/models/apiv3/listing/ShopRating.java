package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class ShopRating implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ShopRating> CREATOR = new Creator();
    private final Integer importedCount;
    private final Float rating;
    private final Integer ratingCount;
    private final String stars;
    private final Subratings subratings;

    public static final class Creator implements Parcelable.Creator<ShopRating> {
        public final ShopRating createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            Subratings subratings = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                subratings = Subratings.CREATOR.createFromParcel(parcel);
            }
            return new ShopRating(valueOf, valueOf2, valueOf3, readString, subratings);
        }

        public final ShopRating[] newArray(int i) {
            return new ShopRating[i];
        }
    }

    public ShopRating(@C17402n(name = "imported_count") Integer num, @C17402n(name = "rating") Float f, @C17402n(name = "rating_count") Integer num2, @C17402n(name = "stars") String str, @C17402n(name = "subratings") Subratings subratings2) {
        this.importedCount = num;
        this.rating = f;
        this.ratingCount = num2;
        this.stars = str;
        this.subratings = subratings2;
    }

    public static /* synthetic */ ShopRating copy$default(ShopRating shopRating, Integer num, Float f, Integer num2, String str, Subratings subratings2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shopRating.importedCount;
        }
        if ((i & 2) != 0) {
            f = shopRating.rating;
        }
        Float f2 = f;
        if ((i & 4) != 0) {
            num2 = shopRating.ratingCount;
        }
        Integer num3 = num2;
        if ((i & 8) != 0) {
            str = shopRating.stars;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            subratings2 = shopRating.subratings;
        }
        return shopRating.copy(num, f2, num3, str2, subratings2);
    }

    public final Integer component1() {
        return this.importedCount;
    }

    public final Float component2() {
        return this.rating;
    }

    public final Integer component3() {
        return this.ratingCount;
    }

    public final String component4() {
        return this.stars;
    }

    public final Subratings component5() {
        return this.subratings;
    }

    public final ShopRating copy(@C17402n(name = "imported_count") Integer num, @C17402n(name = "rating") Float f, @C17402n(name = "rating_count") Integer num2, @C17402n(name = "stars") String str, @C17402n(name = "subratings") Subratings subratings2) {
        return new ShopRating(num, f, num2, str, subratings2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRating)) {
            return false;
        }
        ShopRating shopRating = (ShopRating) obj;
        return C19383o.m32792b(this.importedCount, shopRating.importedCount) && C19383o.m32792b(this.rating, shopRating.rating) && C19383o.m32792b(this.ratingCount, shopRating.ratingCount) && C19383o.m32792b(this.stars, shopRating.stars) && C19383o.m32792b(this.subratings, shopRating.subratings);
    }

    public final Integer getImportedCount() {
        return this.importedCount;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Integer getRatingCount() {
        return this.ratingCount;
    }

    public final String getStars() {
        return this.stars;
    }

    public final Subratings getSubratings() {
        return this.subratings;
    }

    public int hashCode() {
        Integer num = this.importedCount;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.rating;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.ratingCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.stars;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Subratings subratings2 = this.subratings;
        if (subratings2 != null) {
            i = subratings2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopRating(importedCount=");
        h.append(this.importedCount);
        h.append(", rating=");
        h.append(this.rating);
        h.append(", ratingCount=");
        h.append(this.ratingCount);
        h.append(", stars=");
        h.append(this.stars);
        h.append(", subratings=");
        h.append(this.subratings);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        Integer num = this.importedCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num2 = this.ratingCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num2);
        }
        parcel.writeString(this.stars);
        Subratings subratings2 = this.subratings;
        if (subratings2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        subratings2.writeToParcel(parcel, i);
    }
}
