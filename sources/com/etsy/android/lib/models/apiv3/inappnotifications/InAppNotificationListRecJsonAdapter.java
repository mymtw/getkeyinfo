package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class InAppNotificationListRecJsonAdapter extends JsonAdapter<InAppNotificationListRec> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationListRec> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<InAppNotificationClickType> nullableInAppNotificationClickTypeAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", ResponseConstants.BUTTON_TEXT, "notification_time_passed", "notification_click_type", "user_id", "listings", "read", "collection_slug", ListRecommendationsFragment.COLLECTION_KEY, ResponseConstants.COLLECTION_ID);
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationListRecJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "buttonText");
        this.nullableInAppNotificationClickTypeAdapter = yVar.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "userId");
        this.nullableListOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationListRec)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b1, code lost:
        r2 = r19;
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b5, code lost:
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b7, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b9, code lost:
        r7 = r23;
        r13 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01bd, code lost:
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bf, code lost:
        r5 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c1, code lost:
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c3, code lost:
        r8 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c5, code lost:
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c7, code lost:
        r4 = r30;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec fromJson(com.squareup.moshi.JsonReader r42) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r42.mo68410b()
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
        L_0x001d:
            boolean r15 = r42.mo68414f()
            java.lang.String r3 = "collection_id"
            r19 = r2
            java.lang.String r2 = "collectionId"
            r20 = r14
            java.lang.String r14 = "collection_key"
            r21 = r11
            java.lang.String r11 = "collectionKey"
            r22 = r9
            java.lang.String r9 = "collection_slug"
            r23 = r7
            java.lang.String r7 = "collectionSlug"
            r24 = r13
            java.lang.String r13 = "read"
            r25 = r12
            java.lang.String r12 = "isRead"
            r26 = r5
            java.lang.String r5 = "user_id"
            r27 = r10
            java.lang.String r10 = "userId"
            r28 = r8
            java.lang.String r8 = "notification_time_passed"
            r29 = r6
            java.lang.String r6 = "timePassed"
            r30 = r4
            java.lang.String r4 = "notification_text"
            r31 = r4
            java.lang.String r4 = "text"
            r32 = r4
            java.lang.String r4 = "notification_feed_id"
            r33 = r4
            java.lang.String r4 = "feedId"
            if (r15 == 0) goto L_0x01cb
            com.squareup.moshi.JsonReader$b r15 = r0.options
            int r15 = r1.mo68406Q(r15)
            switch(r15) {
                case -1: goto L_0x01ab;
                case 0: goto L_0x0184;
                case 1: goto L_0x0163;
                case 2: goto L_0x013b;
                case 3: goto L_0x012a;
                case 4: goto L_0x0108;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00d9;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00ae;
                case 9: goto L_0x009b;
                case 10: goto L_0x0088;
                case 11: goto L_0x006c;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x01b1
        L_0x006c:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r4 = r0.longAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r4
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto L_0x0083
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r7 = r23
            goto L_0x01bd
        L_0x0083:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0088:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L_0x0096
            goto L_0x01b1
        L_0x0096:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r11, r14, r1)
            throw r1
        L_0x009b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            if (r16 == 0) goto L_0x00a9
            goto L_0x01b1
        L_0x00a9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r9, r1)
            throw r1
        L_0x00ae:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00c7
            r12 = r2
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r7 = r23
            r13 = r24
            goto L_0x01bf
        L_0x00c7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r13, r1)
            throw r1
        L_0x00cc:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            r2 = r19
            goto L_0x01b5
        L_0x00d9:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x00f4
            r5 = r2
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r7 = r23
            r13 = r24
            r12 = r25
            goto L_0x01c1
        L_0x00f4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r5, r1)
            throw r1
        L_0x00f9:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.nullableInAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r11 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r11
            r2 = r19
            r14 = r20
            goto L_0x01b7
        L_0x0108:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0125
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r7 = r23
            r13 = r24
            r12 = r25
            r5 = r26
            goto L_0x01c3
        L_0x0125:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r6, r8, r1)
            throw r1
        L_0x012a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r19
            r14 = r20
            r11 = r21
            goto L_0x01b9
        L_0x013b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x015a
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r7 = r23
            r13 = r24
            r12 = r25
            r5 = r26
            r10 = r27
            goto L_0x01c5
        L_0x015a:
            r15 = r31
            r2 = r32
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r15, r1)
            throw r1
        L_0x0163:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r30 & -3
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r13 = r24
            r12 = r25
            r5 = r26
            r10 = r27
            r8 = r28
            r6 = r29
            goto L_0x001d
        L_0x0184:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01a4
            r2 = r19
            r14 = r20
            r11 = r21
            r9 = r22
            r7 = r23
            r13 = r24
            r12 = r25
            r5 = r26
            r10 = r27
            r8 = r28
            goto L_0x01c7
        L_0x01a4:
            r2 = r33
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r4, r2, r1)
            throw r1
        L_0x01ab:
            r42.mo68408S()
            r42.mo68411c0()
        L_0x01b1:
            r2 = r19
            r14 = r20
        L_0x01b5:
            r11 = r21
        L_0x01b7:
            r9 = r22
        L_0x01b9:
            r7 = r23
            r13 = r24
        L_0x01bd:
            r12 = r25
        L_0x01bf:
            r5 = r26
        L_0x01c1:
            r10 = r27
        L_0x01c3:
            r8 = r28
        L_0x01c5:
            r6 = r29
        L_0x01c7:
            r4 = r30
            goto L_0x001d
        L_0x01cb:
            r15 = r31
            r0 = r32
            r34 = r33
            r42.mo68413e()
            r31 = r4
            r4 = -3
            r0 = r30
            if (r0 != r4) goto L_0x023e
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec r0 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec
            if (r29 == 0) goto L_0x0235
            if (r28 == 0) goto L_0x022e
            if (r27 == 0) goto L_0x0229
            if (r26 == 0) goto L_0x0224
            long r18 = r26.longValue()
            if (r25 == 0) goto L_0x021f
            boolean r15 = r25.booleanValue()
            if (r16 == 0) goto L_0x021a
            if (r17 == 0) goto L_0x0215
            if (r24 == 0) goto L_0x0210
            long r1 = r24.longValue()
            r5 = r0
            r6 = r29
            r7 = r23
            r8 = r28
            r9 = r22
            r10 = r27
            r11 = r21
            r12 = r18
            r14 = r20
            r18 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            return r0
        L_0x0210:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r0
        L_0x0215:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r11, r14, r1)
            throw r0
        L_0x021a:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r7, r9, r1)
            throw r0
        L_0x021f:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r13, r1)
            throw r0
        L_0x0224:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r10, r5, r1)
            throw r0
        L_0x0229:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r6, r8, r1)
            throw r0
        L_0x022e:
            r0 = r32
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r15, r1)
            throw r0
        L_0x0235:
            r0 = r31
            r4 = r34
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r4, r1)
            throw r0
        L_0x023e:
            r4 = r41
            r36 = r31
            r35 = r32
            r33 = r34
            r31 = r15
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec> r15 = r4.constructorRef
            r30 = 1
            r32 = 0
            r34 = r6
            r6 = 14
            if (r15 != 0) goto L_0x02a8
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec> r15 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec.class
            r37 = r8
            java.lang.Class[] r8 = new java.lang.Class[r6]
            r8[r32] = r19
            java.lang.Class<java.lang.Long> r38 = java.lang.Long.class
            r8[r30] = r38
            r38 = 2
            r8[r38] = r19
            r38 = 3
            r8[r38] = r19
            r38 = 4
            r8[r38] = r19
            r38 = 5
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r39 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r8[r38] = r39
            r38 = 6
            java.lang.Class r39 = java.lang.Long.TYPE
            r8[r38] = r39
            r38 = 7
            java.lang.Class<java.util.List> r40 = java.util.List.class
            r8[r38] = r40
            r38 = 8
            java.lang.Class r40 = java.lang.Boolean.TYPE
            r8[r38] = r40
            r38 = 9
            r8[r38] = r19
            r38 = 10
            r8[r38] = r19
            r19 = 11
            r8[r19] = r39
            r19 = 12
            java.lang.Class r38 = java.lang.Integer.TYPE
            r8[r19] = r38
            r19 = 13
            java.lang.Class<?> r38 = p618lp.C18215a.f39928c
            r8[r19] = r38
            java.lang.reflect.Constructor r15 = r15.getDeclaredConstructor(r8)
            r4.constructorRef = r15
            java.lang.String r8 = "InAppNotificationListRec…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r15, r8)
            goto L_0x02aa
        L_0x02a8:
            r37 = r8
        L_0x02aa:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            if (r29 == 0) goto L_0x033e
            r6[r32] = r29
            r6[r30] = r23
            r8 = 2
            if (r28 == 0) goto L_0x0335
            r6[r8] = r28
            r8 = 3
            r6[r8] = r22
            r8 = 4
            if (r27 == 0) goto L_0x032c
            r6[r8] = r27
            r8 = 5
            r6[r8] = r21
            r8 = 6
            if (r26 == 0) goto L_0x0327
            long r21 = r26.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r21)
            r6[r8] = r5
            r5 = 7
            r6[r5] = r20
            r5 = 8
            if (r25 == 0) goto L_0x0322
            boolean r8 = r25.booleanValue()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6[r5] = r8
            r5 = 9
            if (r16 == 0) goto L_0x031d
            r6[r5] = r16
            r5 = 10
            if (r17 == 0) goto L_0x0318
            r6[r5] = r17
            r5 = 11
            if (r24 == 0) goto L_0x0313
            long r1 = r24.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6[r5] = r1
            r1 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            r0 = 13
            r1 = 0
            r6[r0] = r1
            java.lang.Object r0 = r15.newInstance(r6)
            java.lang.String r1 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec r0 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec) r0
            return r0
        L_0x0313:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r0
        L_0x0318:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r11, r14, r1)
            throw r0
        L_0x031d:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r7, r9, r1)
            throw r0
        L_0x0322:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r13, r1)
            throw r0
        L_0x0327:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r10, r5, r1)
            throw r0
        L_0x032c:
            r2 = r34
            r0 = r37
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x0335:
            r0 = r31
            r2 = r35
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x033e:
            r0 = r33
            r2 = r36
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRecJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec");
    }

    public void toJson(C17412w wVar, InAppNotificationListRec inAppNotificationListRec) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationListRec != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationListRec.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationListRec.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.stringAdapter.toJson(wVar, inAppNotificationListRec.getText());
            wVar.mo68529h(ResponseConstants.BUTTON_TEXT);
            this.nullableStringAdapter.toJson(wVar, inAppNotificationListRec.getButtonText());
            wVar.mo68529h("notification_time_passed");
            this.stringAdapter.toJson(wVar, inAppNotificationListRec.getTimePassed());
            wVar.mo68529h("notification_click_type");
            this.nullableInAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationListRec.getClickType());
            wVar.mo68529h("user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationListRec.getUserId()));
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationListRec.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationListRec.isRead()));
            wVar.mo68529h("collection_slug");
            this.stringAdapter.toJson(wVar, inAppNotificationListRec.getCollectionSlug());
            wVar.mo68529h(ListRecommendationsFragment.COLLECTION_KEY);
            this.stringAdapter.toJson(wVar, inAppNotificationListRec.getCollectionKey());
            wVar.mo68529h(ResponseConstants.COLLECTION_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationListRec.getCollectionId()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
