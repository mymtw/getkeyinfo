package com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.favoriting.c */
public final class C10639c {

    /* renamed from: a */
    public final boolean f23372a;

    /* renamed from: b */
    public final long f23373b;

    /* renamed from: c */
    public final String f23374c;

    /* renamed from: d */
    public final C10457d f23375d;

    public C10639c(boolean z, long j, String str, C10457d dVar) {
        C19383o.m32797g(str, "shopName");
        this.f23372a = z;
        this.f23373b = j;
        this.f23374c = str;
        this.f23375d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10639c)) {
            return false;
        }
        C10639c cVar = (C10639c) obj;
        return this.f23372a == cVar.f23372a && this.f23373b == cVar.f23373b && C19383o.m32792b(this.f23374c, cVar.f23374c) && C19383o.m32792b(this.f23375d, cVar.f23375d);
    }

    public final int hashCode() {
        boolean z = this.f23372a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int e = C0023f.m105e(this.f23374c, C0071c.m190b(this.f23373b, (z ? 1 : 0) * true, 31), 31);
        C10457d dVar = this.f23375d;
        if (dVar == null) {
            z2 = false;
        } else {
            boolean z3 = dVar.f22957a;
            if (!z3) {
                z2 = z3;
            }
        }
        return e + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SellerFavoriteInfo(isFavorite=");
        h.append(this.f23372a);
        h.append(", shopUserId=");
        h.append(this.f23373b);
        h.append(", shopName=");
        h.append(this.f23374c);
        h.append(", triggerFavoriteAnimation=");
        h.append(this.f23375d);
        h.append(')');
        return h.toString();
    }
}
