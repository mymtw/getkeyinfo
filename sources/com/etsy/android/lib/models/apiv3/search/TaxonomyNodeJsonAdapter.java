package com.etsy.android.lib.models.apiv3.search;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TaxonomyNodeJsonAdapter extends JsonAdapter<TaxonomyNode> {
    public static final int $stable = 8;
    private volatile Constructor<TaxonomyNode> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<TaxonomyNode>> listOfTaxonomyNodeAdapter;
    private final JsonAdapter<ListingImage> listingImageAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<Long>> nullableListOfLongAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("id", "name", "children_ids", ResponseConstants.PATH, ResponseConstants.CHILDREN, "level", ResponseConstants.PARENT, "parent_id", "short_name", "all_name", "description", ResponseConstants.CATEGORY_ID, ResponseConstants.IMAGE);
    private final JsonAdapter<String> stringAdapter;

    public TaxonomyNodeJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(yVar2, "moshi");
        Class cls3 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar2.mo68558c(cls3, emptySet, "id");
        this.stringAdapter = yVar2.mo68558c(cls2, emptySet, "name");
        this.nullableListOfLongAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "childrenIds");
        this.listOfTaxonomyNodeAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, TaxonomyNode.class), emptySet, ResponseConstants.CHILDREN);
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, "level");
        this.nullableStringAdapter = yVar2.mo68558c(cls2, emptySet, ResponseConstants.PARENT);
        this.nullableLongAdapter = yVar2.mo68558c(cls, emptySet, "parentId");
        this.listingImageAdapter = yVar2.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMAGE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(TaxonomyNode)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013c, code lost:
        r2 = r20;
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0140, code lost:
        r14 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0142, code lost:
        r10 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0144, code lost:
        r7 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        r6 = r26;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.search.TaxonomyNode fromJson(com.squareup.moshi.JsonReader r44) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r44.mo68410b()
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
        L_0x0020:
            boolean r8 = r44.mo68414f()
            java.lang.String r13 = "category_id"
            java.lang.String r3 = "categoryId"
            r20 = r2
            java.lang.String r2 = "image"
            r22 = r15
            java.lang.String r15 = "level"
            r23 = r14
            java.lang.String r14 = "children"
            r24 = r10
            java.lang.String r10 = "path"
            r25 = r7
            java.lang.String r7 = "name"
            r26 = r6
            java.lang.String r6 = "id"
            if (r8 == 0) goto L_0x014a
            com.squareup.moshi.JsonReader$b r8 = r0.options
            int r8 = r1.mo68406Q(r8)
            switch(r8) {
                case -1: goto L_0x0136;
                case 0: goto L_0x0125;
                case 1: goto L_0x0114;
                case 2: goto L_0x0102;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00e0;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00a4;
                case 8: goto L_0x0096;
                case 9: goto L_0x0088;
                case 10: goto L_0x007a;
                case 11: goto L_0x0060;
                case 12: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x013c
        L_0x004d:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ListingImage> r3 = r0.listingImageAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r21 = r3
            com.etsy.android.lib.models.apiv3.listing.ListingImage r21 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r21
            if (r21 == 0) goto L_0x005b
            goto L_0x013c
        L_0x005b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r2, r1)
            throw r1
        L_0x0060:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x0075
            r2 = r20
            r15 = r22
            r14 = r23
            r10 = r24
            goto L_0x0146
        L_0x0075:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r13, r1)
            throw r1
        L_0x007a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            r4 = r4 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x013c
        L_0x0088:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            r4 = r4 & -513(0xfffffffffffffdff, float:NaN)
            goto L_0x013c
        L_0x0096:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r4 = r4 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x013c
        L_0x00a4:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.lang.Long r15 = (java.lang.Long) r15
            r4 = r4 & -129(0xffffffffffffff7f, float:NaN)
            r2 = r20
            goto L_0x0140
        L_0x00b3:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            r4 = r4 & -65
            r2 = r20
            r15 = r22
            goto L_0x0142
        L_0x00c4:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x00db
            r2 = r20
            r15 = r22
            r14 = r23
            r10 = r24
            r7 = r25
            goto L_0x0020
        L_0x00db:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r15, r1)
            throw r1
        L_0x00e0:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.search.TaxonomyNode>> r2 = r0.listOfTaxonomyNodeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x00ec
            goto L_0x013c
        L_0x00ec:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r14, r1)
            throw r1
        L_0x00f1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00fd
            goto L_0x013c
        L_0x00fd:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r10, r1)
            throw r1
        L_0x0102:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.Long>> r2 = r0.nullableListOfLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r4 = r4 & -5
            r2 = r20
            r15 = r22
            r14 = r23
            goto L_0x0144
        L_0x0114:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0120
            goto L_0x013c
        L_0x0120:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r7, r1)
            throw r1
        L_0x0125:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0131
            goto L_0x013c
        L_0x0131:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r6, r6, r1)
            throw r1
        L_0x0136:
            r44.mo68408S()
            r44.mo68411c0()
        L_0x013c:
            r2 = r20
            r15 = r22
        L_0x0140:
            r14 = r23
        L_0x0142:
            r10 = r24
        L_0x0144:
            r7 = r25
        L_0x0146:
            r6 = r26
            goto L_0x0020
        L_0x014a:
            r44.mo68413e()
            r8 = -1989(0xfffffffffffff83b, float:NaN)
            if (r4 != r8) goto L_0x01a0
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r4 = new com.etsy.android.lib.models.apiv3.search.TaxonomyNode
            if (r5 == 0) goto L_0x019b
            long r19 = r5.longValue()
            if (r9 == 0) goto L_0x0196
            if (r11 == 0) goto L_0x0191
            if (r12 == 0) goto L_0x018c
            if (r26 == 0) goto L_0x0187
            int r5 = r26.intValue()
            if (r25 == 0) goto L_0x0182
            long r25 = r25.longValue()
            if (r21 == 0) goto L_0x017d
            r6 = r4
            r7 = r19
            r10 = r24
            r13 = r5
            r14 = r23
            r15 = r22
            r19 = r25
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return r4
        L_0x017d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r1
        L_0x0182:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r13, r1)
            throw r1
        L_0x0187:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r15, r1)
            throw r1
        L_0x018c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r14, r1)
            throw r1
        L_0x0191:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r10, r1)
            throw r1
        L_0x0196:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r7, r7, r1)
            throw r1
        L_0x019b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r6, r6, r1)
            throw r1
        L_0x01a0:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.search.TaxonomyNode> r8 = r0.constructorRef
            r27 = 10
            r28 = 9
            r29 = 8
            r30 = 7
            r31 = 6
            r32 = 5
            r33 = 4
            r34 = 3
            r35 = 2
            r36 = 1
            r37 = 0
            r38 = r6
            r6 = 15
            if (r8 != 0) goto L_0x0204
            java.lang.Class<com.etsy.android.lib.models.apiv3.search.TaxonomyNode> r8 = com.etsy.android.lib.models.apiv3.search.TaxonomyNode.class
            r39 = r7
            java.lang.Class[] r7 = new java.lang.Class[r6]
            java.lang.Class r40 = java.lang.Long.TYPE
            r7[r37] = r40
            r7[r36] = r20
            java.lang.Class<java.util.List> r41 = java.util.List.class
            r7[r35] = r41
            r7[r34] = r20
            java.lang.Class<java.util.List> r41 = java.util.List.class
            r7[r33] = r41
            java.lang.Class r41 = java.lang.Integer.TYPE
            r7[r32] = r41
            r7[r31] = r20
            java.lang.Class<java.lang.Long> r42 = java.lang.Long.class
            r7[r30] = r42
            r7[r29] = r20
            r7[r28] = r20
            r7[r27] = r20
            r20 = 11
            r7[r20] = r40
            r20 = 12
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ListingImage> r40 = com.etsy.android.lib.models.apiv3.listing.ListingImage.class
            r7[r20] = r40
            r20 = 13
            r7[r20] = r41
            r20 = 14
            java.lang.Class<?> r40 = p618lp.C18215a.f39928c
            r7[r20] = r40
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r7)
            r0.constructorRef = r8
            java.lang.String r7 = "TaxonomyNode::class.java…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r8, r7)
            goto L_0x0206
        L_0x0204:
            r39 = r7
        L_0x0206:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            if (r5 == 0) goto L_0x0285
            long r40 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r40)
            r6[r37] = r5
            if (r9 == 0) goto L_0x027e
            r6[r36] = r9
            r6[r35] = r24
            if (r11 == 0) goto L_0x0279
            r6[r34] = r11
            if (r12 == 0) goto L_0x0274
            r6[r33] = r12
            if (r26 == 0) goto L_0x026f
            int r5 = r26.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r32] = r5
            r6[r31] = r23
            r6[r30] = r22
            r6[r29] = r16
            r6[r28] = r17
            r6[r27] = r18
            r5 = 11
            if (r25 == 0) goto L_0x026a
            long r9 = r25.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r6[r5] = r3
            r3 = 12
            if (r21 == 0) goto L_0x0265
            r6[r3] = r21
            r1 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r6[r1] = r2
            r1 = 14
            r2 = 0
            r6[r1] = r2
            java.lang.Object r1 = r8.newInstance(r6)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = (com.etsy.android.lib.models.apiv3.search.TaxonomyNode) r1
            return r1
        L_0x0265:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r1
        L_0x026a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r13, r1)
            throw r1
        L_0x026f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r15, r1)
            throw r1
        L_0x0274:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r14, r1)
            throw r1
        L_0x0279:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r10, r1)
            throw r1
        L_0x027e:
            r2 = r39
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r1
        L_0x0285:
            r2 = r38
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.search.TaxonomyNodeJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.search.TaxonomyNode");
    }

    public void toJson(C17412w wVar, TaxonomyNode taxonomyNode) {
        C19383o.m32797g(wVar, "writer");
        if (taxonomyNode != null) {
            wVar.mo68522b();
            wVar.mo68529h("id");
            this.longAdapter.toJson(wVar, Long.valueOf(taxonomyNode.getId()));
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, taxonomyNode.getName());
            wVar.mo68529h("children_ids");
            this.nullableListOfLongAdapter.toJson(wVar, taxonomyNode.getChildrenIds());
            wVar.mo68529h(ResponseConstants.PATH);
            this.stringAdapter.toJson(wVar, taxonomyNode.getPath());
            wVar.mo68529h(ResponseConstants.CHILDREN);
            this.listOfTaxonomyNodeAdapter.toJson(wVar, taxonomyNode.getChildren());
            wVar.mo68529h("level");
            this.intAdapter.toJson(wVar, Integer.valueOf(taxonomyNode.getLevel()));
            wVar.mo68529h(ResponseConstants.PARENT);
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getParent());
            wVar.mo68529h("parent_id");
            this.nullableLongAdapter.toJson(wVar, taxonomyNode.getParentId());
            wVar.mo68529h("short_name");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getShortName());
            wVar.mo68529h("all_name");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getAllName());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, taxonomyNode.getDescription());
            wVar.mo68529h(ResponseConstants.CATEGORY_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(taxonomyNode.getCategoryId()));
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.listingImageAdapter.toJson(wVar, taxonomyNode.getImage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
