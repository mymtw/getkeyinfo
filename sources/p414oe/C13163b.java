package p414oe;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: oe.b */
public final class C13163b {

    /* renamed from: a */
    public final String f28953a;

    /* renamed from: b */
    public final SearchFiltersV2Type f28954b;

    /* renamed from: c */
    public List<C13166d> f28955c;

    /* renamed from: d */
    public final String f28956d;

    /* renamed from: e */
    public final int f28957e;

    /* renamed from: f */
    public final boolean f28958f;

    /* renamed from: g */
    public final int f28959g;

    /* renamed from: h */
    public String f28960h;

    /* renamed from: i */
    public C11016s.C11020d f28961i;

    public C13163b(String str, SearchFiltersV2Type searchFiltersV2Type, ArrayList arrayList, String str2, int i, boolean z, int i2) {
        C19383o.m32797g(searchFiltersV2Type, "filterType");
        C19383o.m32797g(str2, "currencySymbol");
        this.f28953a = str;
        this.f28954b = searchFiltersV2Type;
        this.f28955c = arrayList;
        this.f28956d = str2;
        this.f28957e = i;
        this.f28958f = z;
        this.f28959g = i2;
        C13166d dVar = null;
        this.f28960h = arrayList.size() > i ? this.f28955c.get(i).f28973e : null;
        this.f28961i = new C11016s.C11020d(i, this.f28955c.size() > i ? this.f28955c.get(i) : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13163b)) {
            return false;
        }
        C13163b bVar = (C13163b) obj;
        return C19383o.m32792b(this.f28953a, bVar.f28953a) && this.f28954b == bVar.f28954b && C19383o.m32792b(this.f28955c, bVar.f28955c) && C19383o.m32792b(this.f28956d, bVar.f28956d) && this.f28957e == bVar.f28957e && this.f28958f == bVar.f28958f && this.f28959g == bVar.f28959g;
    }

    public final int hashCode() {
        int hashCode = this.f28954b.hashCode();
        int a = C0069a.m170a(this.f28957e, C0023f.m105e(this.f28956d, C13983i.m21488g(this.f28955c, (hashCode + (this.f28953a.hashCode() * 31)) * 31, 31), 31), 31);
        boolean z = this.f28958f;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.f28959g) + ((a + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceFilter(name=");
        h.append(this.f28953a);
        h.append(", filterType=");
        h.append(this.f28954b);
        h.append(", priceOptions=");
        h.append(this.f28955c);
        h.append(", currencySymbol=");
        h.append(this.f28956d);
        h.append(", currentSelection=");
        h.append(this.f28957e);
        h.append(", customInputsByUser=");
        h.append(this.f28958f);
        h.append(", customPriceOptionIndex=");
        return C0073e.m208h(h, this.f28959g, ')');
    }
}
