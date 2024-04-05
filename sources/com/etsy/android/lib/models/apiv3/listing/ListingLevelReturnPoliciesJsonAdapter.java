package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ListingLevelReturnPoliciesJsonAdapter extends JsonAdapter<ListingLevelReturnPolicies> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("return_policy_id", "shop_id", ResponseConstants.ACCEPTS_RETURNS, "accepts_exchanges", "return_deadline", "returns_title", "returns_subtitle", "returns_description", "deadline_title", "deadline_subtitle", "deadline_description");
    private final JsonAdapter<String> stringAdapter;

    public ListingLevelReturnPoliciesJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "returnPolicyId");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "acceptsReturns");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "returnDeadline");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "returnsTitle");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingLevelReturnPolicies)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016f, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0171, code lost:
        r15 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0173, code lost:
        r14 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0175, code lost:
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0177, code lost:
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0179, code lost:
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017b, code lost:
        r2 = r26;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies fromJson(com.squareup.moshi.JsonReader r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r39.mo68410b()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r13 = r5
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
        L_0x001b:
            boolean r6 = r39.mo68414f()
            java.lang.String r7 = "deadline_description"
            java.lang.String r8 = "deadlineDescription"
            java.lang.String r9 = "deadline_subtitle"
            java.lang.String r10 = "deadlineSubtitle"
            java.lang.String r11 = "deadline_title"
            java.lang.String r12 = "deadlineTitle"
            r20 = r13
            java.lang.String r13 = "returns_description"
            r21 = r15
            java.lang.String r15 = "returnsDescription"
            r22 = r14
            java.lang.String r14 = "returns_subtitle"
            r23 = r5
            java.lang.String r5 = "returnsSubtitle"
            r24 = r4
            java.lang.String r4 = "returns_title"
            r25 = r3
            java.lang.String r3 = "returnsTitle"
            r26 = r2
            java.lang.String r2 = "accepts_exchanges"
            r27 = r2
            java.lang.String r2 = "acceptsExchanges"
            r28 = r2
            java.lang.String r2 = "accepts_returns"
            r29 = r2
            java.lang.String r2 = "acceptsReturns"
            r30 = r2
            java.lang.String r2 = "shop_id"
            r31 = r2
            java.lang.String r2 = "shopId"
            r32 = r2
            java.lang.String r2 = "return_policy_id"
            r33 = r2
            java.lang.String r2 = "returnPolicyId"
            if (r6 == 0) goto L_0x017f
            com.squareup.moshi.JsonReader$b r6 = r0.options
            int r6 = r1.mo68406Q(r6)
            switch(r6) {
                case -1: goto L_0x0169;
                case 0: goto L_0x0149;
                case 1: goto L_0x012a;
                case 2: goto L_0x010d;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00a9;
                case 8: goto L_0x0096;
                case 9: goto L_0x0083;
                case 10: goto L_0x0070;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x016f
        L_0x0070:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L_0x007e
            goto L_0x016f
        L_0x007e:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r8, r7, r1)
            throw r1
        L_0x0083:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            if (r18 == 0) goto L_0x0091
            goto L_0x016f
        L_0x0091:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r9, r1)
            throw r1
        L_0x0096:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L_0x00a4
            goto L_0x016f
        L_0x00a4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r11, r1)
            throw r1
        L_0x00a9:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            if (r16 == 0) goto L_0x00b7
            goto L_0x016f
        L_0x00b7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r13, r1)
            throw r1
        L_0x00bc:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x00cb
            r13 = r20
            goto L_0x0173
        L_0x00cb:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r14, r1)
            throw r1
        L_0x00d0:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x00e1
            r13 = r20
            r15 = r21
            goto L_0x0175
        L_0x00e1:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r4, r1)
            throw r1
        L_0x00e6:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.nullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            java.lang.Integer r13 = (java.lang.Integer) r13
            goto L_0x0171
        L_0x00f1:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0104
            r13 = r20
            r15 = r21
            r14 = r22
            goto L_0x0177
        L_0x0104:
            r6 = r27
            r2 = r28
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r6, r1)
            throw r1
        L_0x010d:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r4 = r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0121
            r13 = r20
            r15 = r21
            r14 = r22
            r5 = r23
            goto L_0x0179
        L_0x0121:
            r2 = r29
            r3 = r30
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x012a:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x0140
            r13 = r20
            r15 = r21
            r14 = r22
            r5 = r23
            r4 = r24
            goto L_0x017b
        L_0x0140:
            r2 = r31
            r3 = r32
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x0149:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r3 = r0.longAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x0162
            r2 = r3
            r13 = r20
            r15 = r21
            r14 = r22
            r5 = r23
            r4 = r24
            r3 = r25
            goto L_0x001b
        L_0x0162:
            r3 = r33
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0169:
            r39.mo68408S()
            r39.mo68411c0()
        L_0x016f:
            r13 = r20
        L_0x0171:
            r15 = r21
        L_0x0173:
            r14 = r22
        L_0x0175:
            r5 = r23
        L_0x0177:
            r4 = r24
        L_0x0179:
            r3 = r25
        L_0x017b:
            r2 = r26
            goto L_0x001b
        L_0x017f:
            r6 = r27
            r0 = r28
            r34 = r30
            r35 = r31
            r36 = r32
            r37 = r33
            r27 = r2
            r2 = r29
            r39.mo68413e()
            com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r28 = new com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies
            if (r26 == 0) goto L_0x01fd
            long r26 = r26.longValue()
            if (r25 == 0) goto L_0x01f4
            long r29 = r25.longValue()
            if (r24 == 0) goto L_0x01ed
            boolean r2 = r24.booleanValue()
            if (r23 == 0) goto L_0x01e8
            boolean r0 = r23.booleanValue()
            if (r22 == 0) goto L_0x01e3
            if (r21 == 0) goto L_0x01de
            if (r16 == 0) goto L_0x01d9
            if (r17 == 0) goto L_0x01d4
            if (r18 == 0) goto L_0x01cf
            if (r19 == 0) goto L_0x01ca
            r6 = r28
            r7 = r26
            r9 = r29
            r11 = r2
            r12 = r0
            r13 = r20
            r14 = r22
            r15 = r21
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r28
        L_0x01ca:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r8, r7, r1)
            throw r0
        L_0x01cf:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r10, r9, r1)
            throw r0
        L_0x01d4:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r11, r1)
            throw r0
        L_0x01d9:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r15, r13, r1)
            throw r0
        L_0x01de:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r5, r14, r1)
            throw r0
        L_0x01e3:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r3, r4, r1)
            throw r0
        L_0x01e8:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r6, r1)
            throw r0
        L_0x01ed:
            r0 = r34
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x01f4:
            r0 = r35
            r2 = r36
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x01fd:
            r2 = r27
            r0 = r37
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPoliciesJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies");
    }

    public void toJson(C17412w wVar, ListingLevelReturnPolicies listingLevelReturnPolicies) {
        C19383o.m32797g(wVar, "writer");
        if (listingLevelReturnPolicies != null) {
            wVar.mo68522b();
            wVar.mo68529h("return_policy_id");
            this.longAdapter.toJson(wVar, Long.valueOf(listingLevelReturnPolicies.getReturnPolicyId()));
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(listingLevelReturnPolicies.getShopId()));
            wVar.mo68529h(ResponseConstants.ACCEPTS_RETURNS);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listingLevelReturnPolicies.getAcceptsReturns()));
            wVar.mo68529h("accepts_exchanges");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listingLevelReturnPolicies.getAcceptsExchanges()));
            wVar.mo68529h("return_deadline");
            this.nullableIntAdapter.toJson(wVar, listingLevelReturnPolicies.getReturnDeadline());
            wVar.mo68529h("returns_title");
            this.stringAdapter.toJson(wVar, listingLevelReturnPolicies.getReturnsTitle());
            wVar.mo68529h("returns_subtitle");
            this.stringAdapter.toJson(wVar, listingLevelReturnPolicies.getReturnsSubtitle());
            wVar.mo68529h("returns_description");
            this.stringAdapter.toJson(wVar, listingLevelReturnPolicies.getReturnsDescription());
            wVar.mo68529h("deadline_title");
            this.stringAdapter.toJson(wVar, listingLevelReturnPolicies.getDeadlineTitle());
            wVar.mo68529h("deadline_subtitle");
            this.stringAdapter.toJson(wVar, listingLevelReturnPolicies.getDeadlineSubtitle());
            wVar.mo68529h("deadline_description");
            this.stringAdapter.toJson(wVar, listingLevelReturnPolicies.getDeadlineDescription());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
