package com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.favoriteinfo.a */
public final class C10660a {

    /* renamed from: a */
    public final boolean f23436a;

    /* renamed from: b */
    public final boolean f23437b;

    /* renamed from: c */
    public final C10457d f23438c;

    /* renamed from: d */
    public final String f23439d;

    public C10660a(boolean z, boolean z2, C10457d dVar, String str) {
        this.f23436a = z;
        this.f23437b = z2;
        this.f23438c = dVar;
        this.f23439d = str;
    }

    /* renamed from: a */
    public final boolean mo34327a() {
        return this.f23436a || this.f23437b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10660a)) {
            return false;
        }
        C10660a aVar = (C10660a) obj;
        return this.f23436a == aVar.f23436a && this.f23437b == aVar.f23437b && C19383o.m32792b(this.f23438c, aVar.f23438c) && C19383o.m32792b(this.f23439d, aVar.f23439d);
    }

    public final int hashCode() {
        boolean z = this.f23436a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f23437b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        C10457d dVar = this.f23438c;
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
        String str = this.f23439d;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FavoriteInfo(isFavorite=");
        h.append(this.f23436a);
        h.append(", isInCollections=");
        h.append(this.f23437b);
        h.append(", triggerFavoriteAnimation=");
        h.append(this.f23438c);
        h.append(", title=");
        return C0391c.m1057c(h, this.f23439d, ')');
    }
}
