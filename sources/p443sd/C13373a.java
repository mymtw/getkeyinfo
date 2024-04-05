package p443sd;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;

/* renamed from: sd.a */
public final class C13373a extends C10423j {

    /* renamed from: a */
    public final boolean f29299a;

    public C13373a() {
        this(false);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.MORE_FROM_SHOP_TITLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13373a) && this.f29299a == ((C13373a) obj).f29299a;
    }

    public final int hashCode() {
        boolean z = this.f29299a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return C0391c.m1058d(C0072d.m201h("MoreFromShopTitle(hasBeenTracked="), this.f29299a, ')');
    }

    public C13373a(boolean z) {
        this.f29299a = z;
    }
}
