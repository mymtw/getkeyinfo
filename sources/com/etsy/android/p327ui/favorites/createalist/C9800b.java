package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;

/* renamed from: com.etsy.android.ui.favorites.createalist.b */
public final class C9800b {

    /* renamed from: a */
    public boolean f21687a;

    /* renamed from: b */
    public boolean f21688b;

    public C9800b() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9800b)) {
            return false;
        }
        C9800b bVar = (C9800b) obj;
        return this.f21687a == bVar.f21687a && this.f21688b == bVar.f21688b;
    }

    public final int hashCode() {
        boolean z = this.f21687a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f21688b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CreateACollectionState(isEnabled=");
        h.append(this.f21687a);
        h.append(", isFavoritesOnly=");
        return C0391c.m1058d(h, this.f21688b, ')');
    }

    public C9800b(boolean z, boolean z2) {
        this.f21687a = z;
        this.f21688b = z2;
    }
}
