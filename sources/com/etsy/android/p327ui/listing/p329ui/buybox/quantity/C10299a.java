package com.etsy.android.p327ui.listing.p329ui.buybox.quantity;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.quantity.a */
public final class C10299a extends C10423j {

    /* renamed from: a */
    public int f22609a;

    /* renamed from: b */
    public final int[] f22610b;

    /* renamed from: c */
    public final boolean f22611c;

    public C10299a(int i, boolean z, int[] iArr) {
        this.f22609a = i;
        this.f22610b = iArr;
        this.f22611c = z;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.QUANTITY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(C10299a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buybox.quantity.Quantity");
        C10299a aVar = (C10299a) obj;
        return this.f22609a == aVar.f22609a && Arrays.equals(this.f22610b, aVar.f22610b) && this.f22611c == aVar.f22611c;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f22610b);
        return Boolean.hashCode(this.f22611c) + ((hashCode + (this.f22609a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Quantity(selectedValue=");
        h.append(this.f22609a);
        h.append(", range=");
        h.append(Arrays.toString(this.f22610b));
        h.append(", enabled=");
        return C0391c.m1058d(h, this.f22611c, ')');
    }
}
