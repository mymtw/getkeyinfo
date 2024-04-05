package com.etsy.android.p327ui.user.purchases.module;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.purchases.module.g */
public final class C11666g {

    /* renamed from: a */
    public final long f25822a;

    /* renamed from: b */
    public final long f25823b;

    /* renamed from: c */
    public final String f25824c;

    /* renamed from: d */
    public final String f25825d;

    /* renamed from: e */
    public boolean f25826e;

    /* renamed from: f */
    public boolean f25827f;

    /* renamed from: g */
    public final C11665f f25828g;

    /* renamed from: h */
    public final String f25829h;

    public C11666g(long j, long j2, String str, String str2, boolean z, boolean z2, C11665f fVar, String str3) {
        C19383o.m32797g(str2, "listingUrl");
        this.f25822a = j;
        this.f25823b = j2;
        this.f25824c = str;
        this.f25825d = str2;
        this.f25826e = z;
        this.f25827f = z2;
        this.f25828g = fVar;
        this.f25829h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11666g)) {
            return false;
        }
        C11666g gVar = (C11666g) obj;
        return this.f25822a == gVar.f25822a && this.f25823b == gVar.f25823b && C19383o.m32792b(this.f25824c, gVar.f25824c) && C19383o.m32792b(this.f25825d, gVar.f25825d) && this.f25826e == gVar.f25826e && this.f25827f == gVar.f25827f && C19383o.m32792b(this.f25828g, gVar.f25828g) && C19383o.m32792b(this.f25829h, gVar.f25829h);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f25825d, C0023f.m105e(this.f25824c, C0071c.m190b(this.f25823b, Long.hashCode(this.f25822a) * 31, 31), 31), 31);
        boolean z = this.f25826e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25827f;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        C11665f fVar = this.f25828g;
        int i3 = 0;
        int hashCode = (i2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f25829h;
        if (str != null) {
            i3 = str.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ModuleListingUiModel(listingId=");
        h.append(this.f25822a);
        h.append(", shopId=");
        h.append(this.f25823b);
        h.append(", listingTitle=");
        h.append(this.f25824c);
        h.append(", listingUrl=");
        h.append(this.f25825d);
        h.append(", isFav=");
        h.append(this.f25826e);
        h.append(", isInCollections=");
        h.append(this.f25827f);
        h.append(", image=");
        h.append(this.f25828g);
        h.append(", contentSource=");
        return C0391c.m1057c(h, this.f25829h, ')');
    }
}
