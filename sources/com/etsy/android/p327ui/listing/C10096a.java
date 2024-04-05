package com.etsy.android.p327ui.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.a */
public final class C10096a {

    /* renamed from: a */
    public final String f22247a;

    /* renamed from: b */
    public final String f22248b;

    /* renamed from: c */
    public final Integer f22249c;

    /* renamed from: d */
    public final boolean f22250d;

    /* renamed from: e */
    public final boolean f22251e;

    public C10096a() {
        this(0);
    }

    public /* synthetic */ C10096a(int i) {
        this("", "", (Integer) null, true, true);
    }

    /* renamed from: a */
    public static C10096a m18256a(C10096a aVar, String str, String str2, Integer num, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = aVar.f22247a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = aVar.f22248b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            num = aVar.f22249c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            z = aVar.f22250d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = aVar.f22251e;
        }
        aVar.getClass();
        C19383o.m32797g(str3, "analyticsGuid");
        C19383o.m32797g(str4, "referrer");
        return new C10096a(str3, str4, num2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10096a)) {
            return false;
        }
        C10096a aVar = (C10096a) obj;
        return C19383o.m32792b(this.f22247a, aVar.f22247a) && C19383o.m32792b(this.f22248b, aVar.f22248b) && C19383o.m32792b(this.f22249c, aVar.f22249c) && this.f22250d == aVar.f22250d && this.f22251e == aVar.f22251e;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f22248b, this.f22247a.hashCode() * 31, 31);
        Integer num = this.f22249c;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f22250d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22251e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CommonListingState(analyticsGuid=");
        h.append(this.f22247a);
        h.append(", referrer=");
        h.append(this.f22248b);
        h.append(", statusBarSpacingAdjustment=");
        h.append(this.f22249c);
        h.append(", includeRelatedListings=");
        h.append(this.f22250d);
        h.append(", shouldShowAddToCartInterstitial=");
        return C0391c.m1058d(h, this.f22251e, ')');
    }

    public C10096a(String str, String str2, Integer num, boolean z, boolean z2) {
        C19383o.m32797g(str, "analyticsGuid");
        C19383o.m32797g(str2, "referrer");
        this.f22247a = str;
        this.f22248b = str2;
        this.f22249c = num;
        this.f22250d = z;
        this.f22251e = z2;
    }
}
