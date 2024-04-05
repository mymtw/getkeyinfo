package com.etsy.android.p327ui.util;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.util.j */
public final class C11782j {

    /* renamed from: a */
    public final EtsyId f26248a;

    /* renamed from: b */
    public final String f26249b;

    /* renamed from: c */
    public boolean f26250c;

    public C11782j(EtsyId etsyId, String str, boolean z) {
        C19383o.m32797g(etsyId, "etsyUserId");
        C19383o.m32797g(str, "shopName");
        this.f26248a = etsyId;
        this.f26249b = str;
        this.f26250c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11782j)) {
            return false;
        }
        C11782j jVar = (C11782j) obj;
        return C19383o.m32792b(this.f26248a, jVar.f26248a) && C19383o.m32792b(this.f26249b, jVar.f26249b) && this.f26250c == jVar.f26250c;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f26249b, this.f26248a.hashCode() * 31, 31);
        boolean z = this.f26250c;
        if (z) {
            z = true;
        }
        return e + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FavoriteShopSpecs(etsyUserId=");
        h.append(this.f26248a);
        h.append(", shopName=");
        h.append(this.f26249b);
        h.append(", toFavoriteState=");
        return C0391c.m1058d(h, this.f26250c, ')');
    }
}
