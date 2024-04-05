package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ListingDescription {
    public static final int $stable = 0;
    private final String name;
    private final String value;

    public ListingDescription(@C17402n(name = "name") String str, @C17402n(name = "value") String str2) {
        this.name = str;
        this.value = str2;
    }

    public static /* synthetic */ ListingDescription copy$default(ListingDescription listingDescription, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listingDescription.name;
        }
        if ((i & 2) != 0) {
            str2 = listingDescription.value;
        }
        return listingDescription.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final ListingDescription copy(@C17402n(name = "name") String str, @C17402n(name = "value") String str2) {
        return new ListingDescription(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingDescription)) {
            return false;
        }
        ListingDescription listingDescription = (ListingDescription) obj;
        return C19383o.m32792b(this.name, listingDescription.name) && C19383o.m32792b(this.value, listingDescription.value);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingDescription(name=");
        h.append(this.name);
        h.append(", value=");
        return C0391c.m1057c(h, this.value, ')');
    }
}
