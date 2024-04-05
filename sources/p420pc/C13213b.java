package p420pc;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.favorites.search.filters.Filter;
import kotlin.jvm.internal.C19383o;

/* renamed from: pc.b */
public final class C13213b {

    /* renamed from: a */
    public final Filter f29051a;

    /* renamed from: b */
    public final boolean f29052b;

    public C13213b(Filter filter, boolean z) {
        C19383o.m32797g(filter, "filter");
        this.f29051a = filter;
        this.f29052b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13213b)) {
            return false;
        }
        C13213b bVar = (C13213b) obj;
        return this.f29051a == bVar.f29051a && this.f29052b == bVar.f29052b;
    }

    public final int hashCode() {
        int hashCode = this.f29051a.hashCode() * 31;
        boolean z = this.f29052b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FilterData(filter=");
        h.append(this.f29051a);
        h.append(", isSelected=");
        return C0391c.m1058d(h, this.f29052b, ')');
    }
}
