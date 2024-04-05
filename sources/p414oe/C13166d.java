package p414oe;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: oe.d */
public final class C13166d {

    /* renamed from: a */
    public final C13162a f28969a;

    /* renamed from: b */
    public final String f28970b;

    /* renamed from: c */
    public final PriceFilterOptionType f28971c;

    /* renamed from: d */
    public boolean f28972d;

    /* renamed from: e */
    public String f28973e;

    public C13166d(C13162a aVar, String str, PriceFilterOptionType priceFilterOptionType, boolean z) {
        C19383o.m32797g(priceFilterOptionType, "type");
        this.f28969a = aVar;
        this.f28970b = str;
        this.f28971c = priceFilterOptionType;
        this.f28972d = z;
        this.f28973e = str;
    }

    /* renamed from: a */
    public static C13166d m20828a(C13166d dVar) {
        C13162a aVar = dVar.f28969a;
        String str = dVar.f28970b;
        PriceFilterOptionType priceFilterOptionType = dVar.f28971c;
        boolean z = dVar.f28972d;
        dVar.getClass();
        C19383o.m32797g(aVar, "priceBucket");
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        C19383o.m32797g(priceFilterOptionType, "type");
        return new C13166d(aVar, str, priceFilterOptionType, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13166d)) {
            return false;
        }
        C13166d dVar = (C13166d) obj;
        return C19383o.m32792b(this.f28969a, dVar.f28969a) && C19383o.m32792b(this.f28970b, dVar.f28970b) && this.f28971c == dVar.f28971c && this.f28972d == dVar.f28972d;
    }

    public final int hashCode() {
        int hashCode = (this.f28971c.hashCode() + C0023f.m105e(this.f28970b, this.f28969a.hashCode() * 31, 31)) * 31;
        boolean z = this.f28972d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceFilterOption(priceBucket=");
        h.append(this.f28969a);
        h.append(", displayName=");
        h.append(this.f28970b);
        h.append(", type=");
        h.append(this.f28971c);
        h.append(", isChecked=");
        return C0391c.m1058d(h, this.f28972d, ')');
    }
}
