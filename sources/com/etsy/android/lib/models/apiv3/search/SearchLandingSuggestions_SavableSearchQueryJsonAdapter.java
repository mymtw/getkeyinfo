package com.etsy.android.lib.models.apiv3.search;

import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SearchLandingSuggestions_SavableSearchQueryJsonAdapter extends JsonAdapter<SearchLandingSuggestions.SavableSearchQuery> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SearchLandingSuggestions.SavableSearchQuery> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("query", "is_favorite", "type", SavableSearchQuery.DISPLAY_FILTERS_FIELD_NAME, SavableSearchQuery.SAVED_SEARCH_ID_FIELD_NAME, "filters", "new_results_count");
    private final JsonAdapter<String> stringAdapter;

    public SearchLandingSuggestions_SavableSearchQueryJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "query");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isFavorite");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "savedSearchId");
        this.mapOfStringStringAdapter = yVar.mo68558c(C17387a0.m29126d(Map.class, cls, cls), emptySet, "filters");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "newResultsCount");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchLandingSuggestions.SavableSearchQuery)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        r2 = r17;
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        r11 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery fromJson(com.squareup.moshi.JsonReader r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r34.mo68410b()
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x001a:
            boolean r12 = r34.mo68414f()
            java.lang.String r13 = "saved_search_id"
            java.lang.String r15 = "savedSearchId"
            java.lang.String r5 = "filters_display_value"
            java.lang.String r3 = "filtersDisplayValue"
            r17 = r2
            java.lang.String r2 = "is_favorite"
            r18 = r4
            java.lang.String r4 = "isFavorite"
            r19 = r14
            java.lang.String r14 = "filters"
            r20 = r9
            java.lang.String r9 = "type"
            r21 = r11
            java.lang.String r11 = "query"
            if (r12 == 0) goto L_0x00ed
            com.squareup.moshi.JsonReader$b r12 = r0.options
            int r12 = r1.mo68406Q(r12)
            switch(r12) {
                case -1: goto L_0x00da;
                case 0: goto L_0x00c9;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00a7;
                case 3: goto L_0x008e;
                case 4: goto L_0x0077;
                case 5: goto L_0x0061;
                case 6: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00e0
        L_0x0047:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x0058
            r6 = r6 & -65
            r2 = r17
            goto L_0x00e4
        L_0x0058:
            java.lang.String r2 = "newResultsCount"
            java.lang.String r3 = "new_results_count"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0061:
            com.squareup.moshi.JsonAdapter<java.util.Map<java.lang.String, java.lang.String>> r2 = r0.mapOfStringStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0072
            r14 = r2
            r2 = r17
            r4 = r18
            goto L_0x00e6
        L_0x0072:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r14, r1)
            throw r1
        L_0x0077:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 == 0) goto L_0x0089
            r2 = r17
            r4 = r18
            r14 = r19
            goto L_0x00e8
        L_0x0089:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r13, r1)
            throw r1
        L_0x008e:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00a2
            r2 = r17
            r4 = r18
            r14 = r19
            r9 = r20
            goto L_0x00ea
        L_0x00a2:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r5, r1)
            throw r1
        L_0x00a7:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00b3
            goto L_0x00e0
        L_0x00b3:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r9, r1)
            throw r1
        L_0x00b8:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r3
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x00c4
            goto L_0x00e0
        L_0x00c4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r4, r2, r1)
            throw r1
        L_0x00c9:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00d5
            goto L_0x00e0
        L_0x00d5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r11, r11, r1)
            throw r1
        L_0x00da:
            r34.mo68408S()
            r34.mo68411c0()
        L_0x00e0:
            r2 = r17
            r4 = r18
        L_0x00e4:
            r14 = r19
        L_0x00e6:
            r9 = r20
        L_0x00e8:
            r11 = r21
        L_0x00ea:
            r3 = 0
            goto L_0x001a
        L_0x00ed:
            r34.mo68413e()
            r12 = -65
            if (r6 != r12) goto L_0x0136
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r6 = new com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery
            if (r8 == 0) goto L_0x0131
            if (r7 == 0) goto L_0x012c
            boolean r2 = r7.booleanValue()
            if (r10 == 0) goto L_0x0127
            if (r21 == 0) goto L_0x0122
            if (r20 == 0) goto L_0x011d
            long r12 = r20.longValue()
            if (r19 == 0) goto L_0x0118
            int r15 = r18.intValue()
            r7 = r6
            r9 = r2
            r11 = r21
            r14 = r19
            r7.<init>(r8, r9, r10, r11, r12, r14, r15)
            return r6
        L_0x0118:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r14, r1)
            throw r1
        L_0x011d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r13, r1)
            throw r1
        L_0x0122:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r5, r1)
            throw r1
        L_0x0127:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r9, r1)
            throw r1
        L_0x012c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r4, r2, r1)
            throw r1
        L_0x0131:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r11, r1)
            throw r1
        L_0x0136:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery> r12 = r0.constructorRef
            r22 = 8
            r23 = 7
            r24 = 6
            r25 = 5
            r26 = 4
            r27 = 3
            r28 = 2
            r29 = 1
            r30 = r11
            r11 = 9
            if (r12 != 0) goto L_0x017e
            java.lang.Class<com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery> r12 = com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery.class
            r31 = r2
            java.lang.Class[] r2 = new java.lang.Class[r11]
            r16 = 0
            r2[r16] = r17
            java.lang.Class r32 = java.lang.Boolean.TYPE
            r2[r29] = r32
            r2[r28] = r17
            r2[r27] = r17
            java.lang.Class r17 = java.lang.Long.TYPE
            r2[r26] = r17
            java.lang.Class<java.util.Map> r17 = java.util.Map.class
            r2[r25] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r2[r24] = r17
            r2[r23] = r17
            java.lang.Class<?> r17 = p618lp.C18215a.f39928c
            r2[r22] = r17
            java.lang.reflect.Constructor r12 = r12.getDeclaredConstructor(r2)
            r0.constructorRef = r12
            java.lang.String r2 = "SearchLandingSuggestions…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r12, r2)
            goto L_0x0180
        L_0x017e:
            r31 = r2
        L_0x0180:
            java.lang.Object[] r2 = new java.lang.Object[r11]
            if (r8 == 0) goto L_0x01dd
            r11 = 0
            r2[r11] = r8
            if (r7 == 0) goto L_0x01d6
            boolean r4 = r7.booleanValue()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r29] = r4
            if (r10 == 0) goto L_0x01d1
            r2[r28] = r10
            if (r21 == 0) goto L_0x01cc
            r2[r27] = r21
            if (r20 == 0) goto L_0x01c7
            long r3 = r20.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r26] = r3
            if (r19 == 0) goto L_0x01c2
            r2[r25] = r19
            r2[r24] = r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2[r23] = r1
            r1 = 0
            r2[r22] = r1
            java.lang.Object r1 = r12.newInstance(r2)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r1 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery) r1
            return r1
        L_0x01c2:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r14, r1)
            throw r1
        L_0x01c7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r13, r1)
            throw r1
        L_0x01cc:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r5, r1)
            throw r1
        L_0x01d1:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r9, r1)
            throw r1
        L_0x01d6:
            r2 = r31
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r4, r2, r1)
            throw r1
        L_0x01dd:
            r2 = r30
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions_SavableSearchQueryJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery");
    }

    public void toJson(C17412w wVar, SearchLandingSuggestions.SavableSearchQuery savableSearchQuery) {
        C19383o.m32797g(wVar, "writer");
        if (savableSearchQuery != null) {
            wVar.mo68522b();
            wVar.mo68529h("query");
            this.stringAdapter.toJson(wVar, savableSearchQuery.getQuery());
            wVar.mo68529h("is_favorite");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(savableSearchQuery.isFavorite()));
            wVar.mo68529h("type");
            this.stringAdapter.toJson(wVar, savableSearchQuery.getType());
            wVar.mo68529h(SavableSearchQuery.DISPLAY_FILTERS_FIELD_NAME);
            this.stringAdapter.toJson(wVar, savableSearchQuery.getFiltersDisplayValue());
            wVar.mo68529h(SavableSearchQuery.SAVED_SEARCH_ID_FIELD_NAME);
            this.longAdapter.toJson(wVar, Long.valueOf(savableSearchQuery.getSavedSearchId()));
            wVar.mo68529h("filters");
            this.mapOfStringStringAdapter.toJson(wVar, savableSearchQuery.getFilters());
            wVar.mo68529h("new_results_count");
            this.intAdapter.toJson(wVar, Integer.valueOf(savableSearchQuery.getNewResultsCount()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
