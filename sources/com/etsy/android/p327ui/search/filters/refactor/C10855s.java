package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest;
import java.util.ArrayList;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.s */
public final class C10855s {

    /* renamed from: a */
    public final C10856t f24058a;

    /* renamed from: b */
    public final FilterParams f24059b;

    /* renamed from: c */
    public final FacetCount f24060c;

    /* renamed from: d */
    public final C10861x f24061d;

    /* renamed from: e */
    public final String f24062e;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r7 = (com.etsy.android.lib.models.apiv3.FacetCount) kotlin.collections.C19327t.m32646b1((r7 = (r7 = (r7 = r8.getFiltersRequest()).getOptions()).getCategoryFacets()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10855s(com.etsy.android.p327ui.search.filters.refactor.C10856t r7, com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams r8, com.etsy.android.lib.models.apiv3.FacetCount r9) {
        /*
            r6 = this;
            r6.<init>()
            r6.f24058a = r7
            r6.f24059b = r8
            r6.f24060c = r9
            com.etsy.android.ui.search.filters.refactor.x r9 = new com.etsy.android.ui.search.filters.refactor.x
            java.util.List<com.etsy.android.ui.search.filters.refactor.q> r1 = r7.f24074l
            java.util.ArrayList r2 = r7.mo36033b()
            java.lang.Integer r3 = r7.f24075m
            boolean r4 = r7.f24076n
            boolean r5 = r7.f24077o
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f24061d = r9
            if (r8 == 0) goto L_0x003e
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchFiltersRequest r7 = r8.getFiltersRequest()
            if (r7 == 0) goto L_0x003e
            com.etsy.android.ui.search.v2.SearchOptions r7 = r7.getOptions()
            if (r7 == 0) goto L_0x003e
            java.util.List r7 = r7.getCategoryFacets()
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = kotlin.collections.C19327t.m32646b1(r7)
            com.etsy.android.lib.models.apiv3.FacetCount r7 = (com.etsy.android.lib.models.apiv3.FacetCount) r7
            if (r7 == 0) goto L_0x003e
            java.lang.String r7 = r7.getId()
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            r6.f24062e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.C10855s.<init>(com.etsy.android.ui.search.filters.refactor.t, com.etsy.android.ui.search.v2.filters.searchfiltersv2.FilterParams, com.etsy.android.lib.models.apiv3.FacetCount):void");
    }

    /* renamed from: b */
    public static C10855s m18848b(C10855s sVar, C10856t tVar, FilterParams filterParams, FacetCount facetCount, int i) {
        if ((i & 1) != 0) {
            tVar = sVar.f24058a;
        }
        if ((i & 2) != 0) {
            filterParams = sVar.f24059b;
        }
        if ((i & 4) != 0) {
            facetCount = sVar.f24060c;
        }
        sVar.getClass();
        C19383o.m32797g(tVar, "searchFiltersUi");
        return new C10855s(tVar, filterParams, facetCount);
    }

    /* renamed from: a */
    public final C10855s mo36025a(C10849q qVar) {
        C10856t tVar = this.f24058a;
        return m18848b(this, C10856t.m18854a(tVar, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, C19327t.m32651g1(tVar.f24074l, qVar), (Integer) null, false, false, 30719), (FilterParams) null, (FacetCount) null, 6);
    }

    /* renamed from: c */
    public final FilterParams mo36026c() {
        return this.f24059b;
    }

    /* renamed from: d */
    public final boolean mo36027d() {
        SearchFiltersRequest filtersRequest;
        String str = this.f24062e;
        SearchFiltersUiGroupItem.C10781b bVar = this.f24058a.f24064b;
        if (!C19383o.m32792b(str, bVar != null ? bVar.mo35828f() : null)) {
            return false;
        }
        FilterParams filterParams = this.f24059b;
        return (filterParams == null || (filtersRequest = filterParams.getFiltersRequest()) == null) ? false : C19383o.m32792b(filtersRequest.getParentIncludeFeatureCategories(), Boolean.TRUE);
    }

    /* renamed from: e */
    public final FacetCount mo36028e() {
        return this.f24060c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10855s)) {
            return false;
        }
        C10855s sVar = (C10855s) obj;
        return C19383o.m32792b(this.f24058a, sVar.f24058a) && C19383o.m32792b(this.f24059b, sVar.f24059b) && C19383o.m32792b(this.f24060c, sVar.f24060c);
    }

    /* renamed from: f */
    public final C10856t mo36030f() {
        return this.f24058a;
    }

    public final int hashCode() {
        int hashCode = this.f24058a.hashCode() * 31;
        FilterParams filterParams = this.f24059b;
        int i = 0;
        int hashCode2 = (hashCode + (filterParams == null ? 0 : filterParams.hashCode())) * 31;
        FacetCount facetCount = this.f24060c;
        if (facetCount != null) {
            i = facetCount.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchFiltersState(searchFiltersUi=");
        h.append(this.f24058a);
        h.append(", filterParams=");
        h.append(this.f24059b);
        h.append(", rootFacet=");
        h.append(this.f24060c);
        h.append(')');
        return h.toString();
    }
}
