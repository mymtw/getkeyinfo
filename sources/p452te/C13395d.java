package p452te;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import kotlin.jvm.internal.C19383o;

/* renamed from: te.d */
public final class C13395d {

    /* renamed from: a */
    public final ShopRating f29338a;

    public C13395d(ShopRating shopRating) {
        this.f29338a = shopRating;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13395d) && C19383o.m32792b(this.f29338a, ((C13395d) obj).f29338a);
    }

    public final int hashCode() {
        return this.f29338a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopHomeReviewsSummaryUiModel(shopRating=");
        h.append(this.f29338a);
        h.append(')');
        return h.toString();
    }
}
