package p467vd;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;

/* renamed from: vd.a */
public final class C13780a extends C10423j {

    /* renamed from: a */
    public final int f30310a;

    public C13780a(int i) {
        this.f30310a = i;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SPACE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13780a) && this.f30310a == ((C13780a) obj).f30310a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30310a);
    }

    public final String toString() {
        return C0073e.m208h(C0072d.m201h("Space(height="), this.f30310a, ')');
    }
}
