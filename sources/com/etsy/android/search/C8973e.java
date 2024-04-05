package com.etsy.android.search;

import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ILink;
import com.etsy.android.lib.models.apiv3.ILinkCollection;
import java.util.List;
import p415of.C13186o;

/* renamed from: com.etsy.android.search.e */
public final class C8973e implements ILinkCollection, C13186o, C8698l {

    /* renamed from: b */
    public final String f19798b;

    /* renamed from: c */
    public final List<C8974f> f19799c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8973e(com.etsy.android.lib.models.apiv3.search.GuidedSearch r4, com.etsy.android.p327ui.search.p330v2.SearchOptions r5, java.lang.String r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.f19798b = r6
            r6 = 0
            if (r5 == 0) goto L_0x000d
            java.util.Map r5 = r5.asMap()
            goto L_0x000e
        L_0x000d:
            r5 = r6
        L_0x000e:
            if (r5 != 0) goto L_0x0014
            java.util.Map r5 = kotlin.collections.C19294b0.m32559p0()
        L_0x0014:
            java.util.LinkedHashMap r5 = kotlin.collections.C19294b0.m32558A0(r5)
            java.lang.String r0 = "ref"
            java.lang.String r1 = "guided_search"
            r5.put(r0, r1)
            if (r4 == 0) goto L_0x0056
            java.util.List r4 = r4.getQueryReformulations()
            if (r4 == 0) goto L_0x0056
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = kotlin.collections.C19322o.m32624F0(r4)
            r6.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L_0x0034:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r4.next()
            com.etsy.android.lib.models.apiv3.search.QueryReformulation r0 = (com.etsy.android.lib.models.apiv3.search.QueryReformulation) r0
            java.lang.String r1 = r0.getQuery()
            java.lang.String r2 = "q"
            r5.put(r2, r1)
            com.etsy.android.search.f r1 = new com.etsy.android.search.f
            java.lang.String r2 = com.etsy.android.http.C6489a.m12900a(r5)
            r1.<init>(r0, r2)
            r6.add(r1)
            goto L_0x0034
        L_0x0056:
            if (r6 != 0) goto L_0x005a
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x005a:
            r3.f19799c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.search.C8973e.<init>(com.etsy.android.lib.models.apiv3.search.GuidedSearch, com.etsy.android.ui.search.v2.SearchOptions, java.lang.String):void");
    }

    public final List<ILink> getLinks() {
        return this.f19799c;
    }

    public final int getNumberOfRows() {
        return 1;
    }

    public final String getTitle() {
        String str = this.f19798b;
        return str == null ? "" : str;
    }

    public final int getViewType() {
        return R.id.view_type_search_query_reformulations_list_inline;
    }
}
