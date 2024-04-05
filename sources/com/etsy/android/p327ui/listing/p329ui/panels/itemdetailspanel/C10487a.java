package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.a */
public final class C10487a {

    /* renamed from: a */
    public final int f23046a;

    /* renamed from: b */
    public final String f23047b;

    public C10487a(int i, String str) {
        this.f23046a = i;
        this.f23047b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10487a)) {
            return false;
        }
        C10487a aVar = (C10487a) obj;
        return this.f23046a == aVar.f23046a && C19383o.m32792b(this.f23047b, aVar.f23047b);
    }

    public final int hashCode() {
        return this.f23047b.hashCode() + (Integer.hashCode(this.f23046a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ItemDetailUi(icon=");
        h.append(this.f23046a);
        h.append(", displayText=");
        return C0391c.m1057c(h, this.f23047b, ')');
    }
}
