package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Country {
    public static final int $stable = 0;
    private final String name;

    public Country(@C17402n(name = "name") String str) {
        this.name = str;
    }

    public static /* synthetic */ Country copy$default(Country country, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = country.name;
        }
        return country.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final Country copy(@C17402n(name = "name") String str) {
        return new Country(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Country) && C19383o.m32792b(this.name, ((Country) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("Country(name="), this.name, ')');
    }
}
