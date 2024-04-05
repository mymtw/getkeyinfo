package p467vd;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;

/* renamed from: vd.d */
public final class C13783d extends C10423j {

    /* renamed from: a */
    public final int f30315a;

    /* renamed from: b */
    public final int f30316b;

    public C13783d(int i, int i2) {
        this.f30315a = i;
        this.f30316b = i2;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SPACE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13783d)) {
            return false;
        }
        C13783d dVar = (C13783d) obj;
        return this.f30315a == dVar.f30315a && this.f30316b == dVar.f30316b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30316b) + (Integer.hashCode(this.f30315a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TopSpace(statusBarHeight=");
        h.append(this.f30315a);
        h.append(", actionBarHeight=");
        return C0073e.m208h(h, this.f30316b, ')');
    }
}
