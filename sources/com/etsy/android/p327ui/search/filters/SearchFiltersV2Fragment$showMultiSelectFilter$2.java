package com.etsy.android.p327ui.search.filters;

import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showMultiSelectFilter$2 */
public final class SearchFiltersV2Fragment$showMultiSelectFilter$2 extends Lambda implements C19861p<ValueFacet, Boolean, C19394m> {
    public final /* synthetic */ AttributeFacet $facet;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showMultiSelectFilter$2(SearchFiltersV2Fragment searchFiltersV2Fragment, AttributeFacet attributeFacet) {
        super(2);
        this.this$0 = searchFiltersV2Fragment;
        this.$facet = attributeFacet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ValueFacet) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0217  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(com.etsy.android.lib.models.apiv3.filters.ValueFacet r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "valueFacet"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment r3 = r0.this$0
            com.etsy.android.ui.search.filters.e r3 = r3.getViewModel()
            com.etsy.android.lib.models.apiv3.filters.AttributeFacet r4 = r0.$facet
            r3.getClass()
            java.lang.String r5 = "facet"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r5 = r4.getAttribute()
            if (r5 == 0) goto L_0x0026
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r5 = r5.getFilterType()
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            r7 = -1
            if (r5 != 0) goto L_0x002c
            r8 = r7
            goto L_0x0034
        L_0x002c:
            int[] r8 = com.etsy.android.p327ui.search.filters.C10767e.C10768a.f23762a
            int r9 = r5.ordinal()
            r8 = r8[r9]
        L_0x0034:
            r9 = 4
            java.lang.String r10 = ""
            if (r8 == r9) goto L_0x0142
            r9 = 5
            if (r8 == r9) goto L_0x0120
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$a r5 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$a
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r8 = r4.getAttribute()
            if (r8 == 0) goto L_0x004a
            java.lang.String r8 = r8.getId()
            if (r8 != 0) goto L_0x004b
        L_0x004a:
            r8 = r10
        L_0x004b:
            r5.<init>(r8)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$g r8 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$g
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r9 = r19.getAttributeValue()
            if (r9 == 0) goto L_0x005b
            java.lang.String r9 = r9.getId()
            goto L_0x005c
        L_0x005b:
            r9 = 0
        L_0x005c:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.<init>(r9)
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.AttributeFacet, ? extends java.util.Set<com.etsy.android.lib.models.apiv3.filters.ValueFacet>> r9 = r3.f23729B
            java.util.LinkedHashMap r1 = com.etsy.android.p327ui.search.filters.C10767e.m18651t(r4, r1, r2, r9)
            r3.f23729B = r1
            java.util.ArrayList r11 = new java.util.ArrayList
            int r9 = r1.size()
            r11.<init>(r9)
            java.util.Set r9 = r1.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x007c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x010b
            java.lang.Object r12 = r9.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            com.etsy.android.lib.models.apiv3.filters.AttributeFacet r13 = (com.etsy.android.lib.models.apiv3.filters.AttributeFacet) r13
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r10)
            boolean r15 = r12.isEmpty()
            r15 = r15 ^ 1
            if (r15 == 0) goto L_0x00fc
            if (r13 == 0) goto L_0x00ae
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r13 = r13.getAttribute()
            if (r13 == 0) goto L_0x00ae
            java.lang.String r13 = r13.getId()
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14.append(r13)
            java.lang.String r13 = ":"
            r14.append(r13)
            java.lang.String r13 = "{"
            r14.append(r13)
            r13 = 0
            java.util.Iterator r15 = r12.iterator()
        L_0x00c1:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00fc
            java.lang.Object r16 = r15.next()
            int r17 = r13 + 1
            if (r13 < 0) goto L_0x00f7
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r16 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r16
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r16 = r16.getAttributeValue()
            if (r16 == 0) goto L_0x00de
            java.lang.String r16 = r16.getId()
            r6 = r16
            goto L_0x00df
        L_0x00de:
            r6 = 0
        L_0x00df:
            r14.append(r6)
            int r6 = r12.size()
            int r6 = r6 + r7
            if (r13 != r6) goto L_0x00ef
            java.lang.String r6 = "}"
            r14.append(r6)
            goto L_0x00f4
        L_0x00ef:
            java.lang.String r6 = "|"
            r14.append(r6)
        L_0x00f4:
            r13 = r17
            goto L_0x00c1
        L_0x00f7:
            p568fn.C17782b.m29877o0()
            r6 = 0
            throw r6
        L_0x00fc:
            r6 = 0
            java.lang.String r12 = r14.toString()
            java.lang.String r13 = "result.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r12, r13)
            r11.add(r12)
            goto L_0x007c
        L_0x010b:
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 62
            java.lang.String r12 = ","
            java.lang.String r7 = kotlin.collections.C19327t.m32644Z0(r11, r12, r13, r14, r15, r16)
            com.etsy.android.ui.search.v2.SearchOptions r9 = r3.f23731D
            r9.setAttributeValuesParam(r7)
            r3.mo35748l()
            goto L_0x0164
        L_0x0120:
            r6 = 0
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$b r7 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$b
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type, java.lang.Integer> r8 = r3.f23734G
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r9 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.OTHER_OPTIONS
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r7.<init>(r8)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$e r8 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$e
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type, java.lang.Integer> r9 = r3.f23734G
            java.lang.Object r5 = r9.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r8.<init>(r5)
            java.util.LinkedHashMap r1 = r3.mo35754s(r4, r1, r2)
            goto L_0x0163
        L_0x0142:
            r6 = 0
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$b r7 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$b
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type, java.lang.Integer> r8 = r3.f23734G
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r9 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.SHIPPING
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r7.<init>(r8)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$e r8 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$e
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type, java.lang.Integer> r9 = r3.f23734G
            java.lang.Object r5 = r9.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r8.<init>(r5)
            java.util.LinkedHashMap r1 = r3.mo35754s(r4, r1, r2)
        L_0x0163:
            r5 = r7
        L_0x0164:
            io.reactivex.subjects.PublishSubject<com.etsy.android.ui.search.v2.filters.searchfiltersv2.c> r7 = r3.f23728A
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.c r9 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.c
            java.util.LinkedHashMap r11 = r3.mo35741c()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r20)
            r9.<init>(r5, r11, r8, r2)
            r7.onNext(r9)
            java.lang.Object r1 = r1.get(r4)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x020b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0187:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01a6
            java.lang.Object r5 = r1.next()
            r7 = r5
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r7 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r7
            java.lang.String r7 = r7.getCount()
            java.lang.String r8 = "0"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x0187
            r2.add(r5)
            goto L_0x0187
        L_0x01a6:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01b4:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01d7
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r8 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r8
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r8 = r8.getAttributeValue()
            if (r8 == 0) goto L_0x01cc
            java.lang.String r8 = r8.getName()
            goto L_0x01cd
        L_0x01cc:
            r8 = r6
        L_0x01cd:
            boolean r8 = r1.add(r8)
            if (r8 == 0) goto L_0x01b4
            r5.add(r7)
            goto L_0x01b4
        L_0x01d7:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = kotlin.collections.C19322o.m32624F0(r5)
            r9.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x01e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0200
            java.lang.Object r2 = r1.next()
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r2 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r2
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r2 = r2.getAttributeValue()
            if (r2 == 0) goto L_0x01fb
            java.lang.String r2 = r2.getName()
            goto L_0x01fc
        L_0x01fb:
            r2 = r6
        L_0x01fc:
            r9.add(r2)
            goto L_0x01e4
        L_0x0200:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 62
            java.lang.String r10 = ", "
            java.lang.String r10 = kotlin.collections.C19327t.m32644Z0(r9, r10, r11, r12, r13, r14)
        L_0x020b:
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r1 = r4.getAttribute()
            if (r1 == 0) goto L_0x0226
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L_0x0226
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.a r2 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.a
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$g r4 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$g
            r4.<init>(r10)
            r2.<init>(r1, r4)
            io.reactivex.subjects.PublishSubject<com.etsy.android.ui.search.v2.filters.searchfiltersv2.a> r1 = r3.f23761z
            r1.onNext(r2)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment$showMultiSelectFilter$2.invoke(com.etsy.android.lib.models.apiv3.filters.ValueFacet, boolean):void");
    }
}
