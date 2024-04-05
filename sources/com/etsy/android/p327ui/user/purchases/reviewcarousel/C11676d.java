package com.etsy.android.p327ui.user.purchases.reviewcarousel;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.reviewcarousel.d */
public final class C11676d {

    /* renamed from: a */
    public final String f25862a;

    /* renamed from: b */
    public final String f25863b;

    /* renamed from: c */
    public final String f25864c;

    /* renamed from: d */
    public final String f25865d;

    public C11676d(String str, String str2, String str3, String str4) {
        this.f25862a = str;
        this.f25863b = str2;
        this.f25864c = str3;
        this.f25865d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11676d)) {
            return false;
        }
        C11676d dVar = (C11676d) obj;
        return C19383o.m32792b(this.f25862a, dVar.f25862a) && C19383o.m32792b(this.f25863b, dVar.f25863b) && C19383o.m32792b(this.f25864c, dVar.f25864c) && C19383o.m32792b(this.f25865d, dVar.f25865d);
    }

    public final int hashCode() {
        String str = this.f25862a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25863b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25864c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25865d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SquareImage(url=");
        h.append(this.f25862a);
        h.append(", url75x75=");
        h.append(this.f25863b);
        h.append(", url300x300=");
        h.append(this.f25864c);
        h.append(", url600x600=");
        return C0391c.m1057c(h, this.f25865d, ')');
    }
}
