package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.u */
public final class C10662u {

    /* renamed from: a */
    public boolean f23449a;

    /* renamed from: b */
    public long f23450b;

    /* renamed from: c */
    public String f23451c;

    /* renamed from: d */
    public C10457d f23452d;

    public C10662u(C10639c cVar) {
        boolean z = cVar.f23372a;
        long j = cVar.f23373b;
        String str = cVar.f23374c;
        C10457d dVar = cVar.f23375d;
        C19383o.m32797g(str, "shopName");
        this.f23449a = z;
        this.f23450b = j;
        this.f23451c = str;
        this.f23452d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10662u)) {
            return false;
        }
        C10662u uVar = (C10662u) obj;
        return this.f23449a == uVar.f23449a && this.f23450b == uVar.f23450b && C19383o.m32792b(this.f23451c, uVar.f23451c) && C19383o.m32792b(this.f23452d, uVar.f23452d);
    }

    public final int hashCode() {
        boolean z = this.f23449a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int e = C0023f.m105e(this.f23451c, C0071c.m190b(this.f23450b, (z ? 1 : 0) * true, 31), 31);
        C10457d dVar = this.f23452d;
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
        StringBuilder h = C0072d.m201h("SellerFavoriteInfoBuilder(isFavorite=");
        h.append(this.f23449a);
        h.append(", shopUserId=");
        h.append(this.f23450b);
        h.append(", shopName=");
        h.append(this.f23451c);
        h.append(", triggerFavoriteAnimation=");
        h.append(this.f23452d);
        h.append(')');
        return h.toString();
    }
}
