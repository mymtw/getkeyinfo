package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.r */
public final class C11015r {

    /* renamed from: a */
    public final String f24417a;

    /* renamed from: b */
    public final String f24418b;

    /* renamed from: c */
    public final SearchOptions f24419c;

    /* renamed from: d */
    public final String f24420d;

    /* renamed from: e */
    public final Map<String, String> f24421e;

    /* renamed from: f */
    public final C10971c f24422f;

    /* renamed from: g */
    public final Integer f24423g;

    /* renamed from: h */
    public final String f24424h;

    /* renamed from: i */
    public final Boolean f24425i;

    /* renamed from: j */
    public final boolean f24426j;

    /* renamed from: k */
    public final boolean f24427k;

    /* renamed from: l */
    public final C8707d f24428l;

    /* renamed from: m */
    public final Long f24429m;

    /* renamed from: n */
    public final Boolean f24430n;

    public C11015r(String str, String str2, SearchOptions searchOptions, String str3, Map<String, String> map, C10971c cVar, Integer num, String str4, Boolean bool, boolean z, boolean z2, C8707d dVar, Long l, Boolean bool2) {
        C19383o.m32797g(str, "query");
        C19383o.m32797g(searchOptions, "searchOptions");
        C19383o.m32797g(map, "requestParams");
        this.f24417a = str;
        this.f24418b = str2;
        this.f24419c = searchOptions;
        this.f24420d = str3;
        this.f24421e = map;
        this.f24422f = cVar;
        this.f24423g = num;
        this.f24424h = str4;
        this.f24425i = bool;
        this.f24426j = z;
        this.f24427k = z2;
        this.f24428l = dVar;
        this.f24429m = l;
        this.f24430n = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11015r)) {
            return false;
        }
        C11015r rVar = (C11015r) obj;
        return C19383o.m32792b(this.f24417a, rVar.f24417a) && C19383o.m32792b(this.f24418b, rVar.f24418b) && C19383o.m32792b(this.f24419c, rVar.f24419c) && C19383o.m32792b(this.f24420d, rVar.f24420d) && C19383o.m32792b(this.f24421e, rVar.f24421e) && C19383o.m32792b(this.f24422f, rVar.f24422f) && C19383o.m32792b(this.f24423g, rVar.f24423g) && C19383o.m32792b(this.f24424h, rVar.f24424h) && C19383o.m32792b(this.f24425i, rVar.f24425i) && this.f24426j == rVar.f24426j && this.f24427k == rVar.f24427k && C19383o.m32792b(this.f24428l, rVar.f24428l) && C19383o.m32792b(this.f24429m, rVar.f24429m) && C19383o.m32792b(this.f24430n, rVar.f24430n);
    }

    public final int hashCode() {
        int hashCode = this.f24417a.hashCode() * 31;
        String str = this.f24418b;
        int i = 0;
        int hashCode2 = (this.f24419c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f24420d;
        int hashCode3 = (this.f24421e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C10971c cVar = this.f24422f;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f24423g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f24424h;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f24425i;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.f24426j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f24427k;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        C8707d dVar = this.f24428l;
        int hashCode8 = (i3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l = this.f24429m;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.f24430n;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchWithAdsSpecs(query=");
        h.append(this.f24417a);
        h.append(", anchorListingId=");
        h.append(this.f24418b);
        h.append(", searchOptions=");
        h.append(this.f24419c);
        h.append(", currencyCode=");
        h.append(this.f24420d);
        h.append(", requestParams=");
        h.append(this.f24421e);
        h.append(", buyerFeatures=");
        h.append(this.f24422f);
        h.append(", limit=");
        h.append(this.f24423g);
        h.append(", nextPageUrl=");
        h.append(this.f24424h);
        h.append(", excludeListings=");
        h.append(this.f24425i);
        h.append(", withStaticFilters=");
        h.append(this.f24426j);
        h.append(", includeAdditionalListingImages=");
        h.append(this.f24427k);
        h.append(", performanceTimer=");
        h.append(this.f24428l);
        h.append(", savedSearchId=");
        h.append(this.f24429m);
        h.append(", includeFeaturedCategories=");
        h.append(this.f24430n);
        h.append(')');
        return h.toString();
    }
}
