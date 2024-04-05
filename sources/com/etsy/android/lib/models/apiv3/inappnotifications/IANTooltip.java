package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class IANTooltip {
    public static final int $stable = 0;
    private final String text;
    private final String tooltipType;

    public IANTooltip(@C17402n(name = "text") String str, @C17402n(name = "type") String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "tooltipType");
        this.text = str;
        this.tooltipType = str2;
    }

    public static /* synthetic */ IANTooltip copy$default(IANTooltip iANTooltip, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iANTooltip.text;
        }
        if ((i & 2) != 0) {
            str2 = iANTooltip.tooltipType;
        }
        return iANTooltip.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.tooltipType;
    }

    public final IANTooltip copy(@C17402n(name = "text") String str, @C17402n(name = "type") String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "tooltipType");
        return new IANTooltip(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IANTooltip)) {
            return false;
        }
        IANTooltip iANTooltip = (IANTooltip) obj;
        return C19383o.m32792b(this.text, iANTooltip.text) && C19383o.m32792b(this.tooltipType, iANTooltip.tooltipType);
    }

    public final String getText() {
        return this.text;
    }

    public final String getTooltipType() {
        return this.tooltipType;
    }

    public int hashCode() {
        return this.tooltipType.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("IANTooltip(text=");
        h.append(this.text);
        h.append(", tooltipType=");
        return C0391c.m1057c(h, this.tooltipType, ')');
    }
}
