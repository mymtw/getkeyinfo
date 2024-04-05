package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.C10660a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.d */
public final class C10407d {

    /* renamed from: a */
    public boolean f22779a;

    /* renamed from: b */
    public boolean f22780b;

    /* renamed from: c */
    public C10457d f22781c;

    /* renamed from: d */
    public String f22782d;

    public C10407d(C10660a aVar) {
        boolean z = aVar.f23436a;
        boolean z2 = aVar.f23437b;
        C10457d dVar = aVar.f23438c;
        String str = aVar.f23439d;
        this.f22779a = z;
        this.f22780b = z2;
        this.f22781c = dVar;
        this.f22782d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10407d)) {
            return false;
        }
        C10407d dVar = (C10407d) obj;
        return this.f22779a == dVar.f22779a && this.f22780b == dVar.f22780b && C19383o.m32792b(this.f22781c, dVar.f22781c) && C19383o.m32792b(this.f22782d, dVar.f22782d);
    }

    public final int hashCode() {
        boolean z = this.f22779a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f22780b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        C10457d dVar = this.f22781c;
        int i3 = 0;
        if (dVar == null) {
            z2 = false;
        } else {
            boolean z4 = dVar.f22957a;
            if (!z4) {
                z2 = z4;
            }
        }
        int i4 = (i2 + (z2 ? 1 : 0)) * 31;
        String str = this.f22782d;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FavoriteInfoBuilder(isFavorite=");
        h.append(this.f22779a);
        h.append(", isInCollections=");
        h.append(this.f22780b);
        h.append(", triggerFavoriteAnimation=");
        h.append(this.f22781c);
        h.append(", title=");
        return C0391c.m1057c(h, this.f22782d, ')');
    }
}
