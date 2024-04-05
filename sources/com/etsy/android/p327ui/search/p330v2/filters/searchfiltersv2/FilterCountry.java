package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterCountry */
public final class FilterCountry implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FilterCountry> CREATOR = new Creator();
    private final String countryCode;
    private final String displayName;

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterCountry$Creator */
    public static final class Creator implements Parcelable.Creator<FilterCountry> {
        public final FilterCountry createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new FilterCountry(parcel.readString(), parcel.readString());
        }

        public final FilterCountry[] newArray(int i) {
            return new FilterCountry[i];
        }
    }

    public FilterCountry(String str, String str2) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        C19383o.m32797g(str2, "countryCode");
        this.displayName = str;
        this.countryCode = str2;
    }

    public static /* synthetic */ FilterCountry copy$default(FilterCountry filterCountry, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterCountry.displayName;
        }
        if ((i & 2) != 0) {
            str2 = filterCountry.countryCode;
        }
        return filterCountry.copy(str, str2);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final FilterCountry copy(String str, String str2) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        C19383o.m32797g(str2, "countryCode");
        return new FilterCountry(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterCountry)) {
            return false;
        }
        FilterCountry filterCountry = (FilterCountry) obj;
        return C19383o.m32792b(this.displayName, filterCountry.displayName) && C19383o.m32792b(this.countryCode, filterCountry.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        return this.countryCode.hashCode() + (this.displayName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FilterCountry(displayName=");
        h.append(this.displayName);
        h.append(", countryCode=");
        return C0391c.m1057c(h, this.countryCode, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.displayName);
        parcel.writeString(this.countryCode);
    }
}
