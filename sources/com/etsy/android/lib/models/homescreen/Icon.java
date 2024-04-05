package com.etsy.android.lib.models.homescreen;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.Listing;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Icon {
    public static final int $stable = 0;
    private final String active;
    private final String inactive;

    public Icon(@C17402n(name = "active") String str, @C17402n(name = "inactive") String str2) {
        C19383o.m32797g(str, "active");
        C19383o.m32797g(str2, Listing.INACTIVE_STATE);
        this.active = str;
        this.inactive = str2;
    }

    public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = icon.active;
        }
        if ((i & 2) != 0) {
            str2 = icon.inactive;
        }
        return icon.copy(str, str2);
    }

    public final String component1() {
        return this.active;
    }

    public final String component2() {
        return this.inactive;
    }

    public final Icon copy(@C17402n(name = "active") String str, @C17402n(name = "inactive") String str2) {
        C19383o.m32797g(str, "active");
        C19383o.m32797g(str2, Listing.INACTIVE_STATE);
        return new Icon(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return C19383o.m32792b(this.active, icon.active) && C19383o.m32792b(this.inactive, icon.inactive);
    }

    public final String getActive() {
        return this.active;
    }

    public final String getInactive() {
        return this.inactive;
    }

    public int hashCode() {
        return this.inactive.hashCode() + (this.active.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Icon(active=");
        h.append(this.active);
        h.append(", inactive=");
        return C0391c.m1057c(h, this.inactive, ')');
    }
}
