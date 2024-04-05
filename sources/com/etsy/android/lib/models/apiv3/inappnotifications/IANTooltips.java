package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class IANTooltips {
    public static final int $stable = 8;
    private final List<IANTooltip> tooltips;

    public IANTooltips(@C17402n(name = "tooltips") List<IANTooltip> list) {
        C19383o.m32797g(list, "tooltips");
        this.tooltips = list;
    }

    public static /* synthetic */ IANTooltips copy$default(IANTooltips iANTooltips, List<IANTooltip> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iANTooltips.tooltips;
        }
        return iANTooltips.copy(list);
    }

    public final List<IANTooltip> component1() {
        return this.tooltips;
    }

    public final IANTooltips copy(@C17402n(name = "tooltips") List<IANTooltip> list) {
        C19383o.m32797g(list, "tooltips");
        return new IANTooltips(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IANTooltips) && C19383o.m32792b(this.tooltips, ((IANTooltips) obj).tooltips);
    }

    public final List<IANTooltip> getTooltips() {
        return this.tooltips;
    }

    public int hashCode() {
        return this.tooltips.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("IANTooltips(tooltips="), this.tooltips, ')');
    }
}
