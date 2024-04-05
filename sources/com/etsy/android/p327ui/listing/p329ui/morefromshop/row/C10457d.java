package com.etsy.android.p327ui.listing.p329ui.morefromshop.row;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.row.d */
public final class C10457d {

    /* renamed from: a */
    public final boolean f22957a;

    public C10457d(boolean z) {
        this.f22957a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10457d) && this.f22957a == ((C10457d) obj).f22957a;
    }

    public final int hashCode() {
        boolean z = this.f22957a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return C0391c.m1058d(C0072d.m201h("TriggerFavoriteAnimation(asFavorite="), this.f22957a, ')');
    }
}
