package com.etsy.android.p327ui.user.purchases;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;

/* renamed from: com.etsy.android.ui.user.purchases.c */
public final class C11632c {

    /* renamed from: a */
    public final int f25753a;

    /* renamed from: b */
    public final int f25754b;

    /* renamed from: c */
    public final boolean f25755c;

    public C11632c(int i, int i2, boolean z) {
        this.f25753a = i;
        this.f25754b = i2;
        this.f25755c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11632c)) {
            return false;
        }
        C11632c cVar = (C11632c) obj;
        return this.f25753a == cVar.f25753a && this.f25754b == cVar.f25754b && this.f25755c == cVar.f25755c;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f25754b, Integer.hashCode(this.f25753a) * 31, 31);
        boolean z = this.f25755c;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GetUserReceiptsSpec(limit=");
        h.append(this.f25753a);
        h.append(", offset=");
        h.append(this.f25754b);
        h.append(", includeReviewCarouselItems=");
        return C0391c.m1058d(h, this.f25755c, ')');
    }
}
