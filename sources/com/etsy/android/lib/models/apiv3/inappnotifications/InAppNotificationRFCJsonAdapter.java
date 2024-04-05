package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class InAppNotificationRFCJsonAdapter extends JsonAdapter<InAppNotificationRFC> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationRFC> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_time_passed", "shop_id", "notification_shop_img", "notification_click_type", "listings", "read", ResponseConstants.BUTTON_TEXT, "coupon_code", "button_enabled", "promotion_text", "unavailable_message", "promoted_offer_id", "promoted_offer_listing_tokens");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationRFCJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "text");
        this.longAdapter = yVar2.mo68558c(Long.TYPE, emptySet, "shopId");
        this.nullableShopIconAdapter = yVar2.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.inAppNotificationClickTypeAdapter = yVar2.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.nullableListOfIANListingCardAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "isRead");
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "promoOfferTokens");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationRFC)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ff, code lost:
        r2 = r22;
        r14 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0203, code lost:
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0205, code lost:
        r9 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0207, code lost:
        r8 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0209, code lost:
        r7 = r28;
        r15 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x020d, code lost:
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020f, code lost:
        r10 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0211, code lost:
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0213, code lost:
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0215, code lost:
        r6 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0217, code lost:
        r4 = r35;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC fromJson(com.squareup.moshi.JsonReader r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r46.mo68410b()
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
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r23 = 0
        L_0x0024:
            boolean r18 = r46.mo68414f()
            java.lang.String r3 = "promoted_offer_id"
            r22 = r2
            java.lang.String r2 = "promoOfferId"
            r24 = r14
            java.lang.String r14 = "promotion_text"
            r25 = r12
            java.lang.String r12 = "promoText"
            r26 = r9
            java.lang.String r9 = "button_enabled"
            r27 = r8
            java.lang.String r8 = "buttonEnabled"
            r28 = r7
            java.lang.String r7 = "coupon_code"
            r29 = r15
            java.lang.String r15 = "couponCode"
            r30 = r11
            java.lang.String r11 = "read"
            r31 = r10
            java.lang.String r10 = "isRead"
            r32 = r13
            java.lang.String r13 = "notification_click_type"
            r33 = r5
            java.lang.String r5 = "clickType"
            r34 = r6
            java.lang.String r6 = "shop_id"
            r35 = r4
            java.lang.String r4 = "shopId"
            r36 = r4
            java.lang.String r4 = "notification_feed_id"
            r37 = r4
            java.lang.String r4 = "feedId"
            if (r18 == 0) goto L_0x021b
            r18 = r4
            com.squareup.moshi.JsonReader$b r4 = r0.options
            int r4 = r1.mo68406Q(r4)
            switch(r4) {
                case -1: goto L_0x01f9;
                case 0: goto L_0x01ce;
                case 1: goto L_0x01ab;
                case 2: goto L_0x0198;
                case 3: goto L_0x0187;
                case 4: goto L_0x015f;
                case 5: goto L_0x0150;
                case 6: goto L_0x012c;
                case 7: goto L_0x011f;
                case 8: goto L_0x00fd;
                case 9: goto L_0x00f1;
                case 10: goto L_0x00de;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ab;
                case 13: goto L_0x009f;
                case 14: goto L_0x0081;
                case 15: goto L_0x0075;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x01ff
        L_0x0075:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r2 = r0.nullableListOfStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r23 = r2
            java.util.List r23 = (java.util.List) r23
            goto L_0x01ff
        L_0x0081:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r4 = r0.longAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r4
            java.lang.Long r15 = (java.lang.Long) r15
            if (r15 == 0) goto L_0x009a
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            goto L_0x020d
        L_0x009a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x009f:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            goto L_0x01ff
        L_0x00ab:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L_0x00b9
            goto L_0x01ff
        L_0x00b9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r14, r1)
            throw r1
        L_0x00be:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L_0x00d9
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r15 = r29
            goto L_0x020f
        L_0x00d9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r8, r9, r1)
            throw r1
        L_0x00de:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L_0x00ec
            goto L_0x01ff
        L_0x00ec:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r7, r1)
            throw r1
        L_0x00f1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            goto L_0x01ff
        L_0x00fd:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x011a
            r10 = r2
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r15 = r29
            r11 = r30
            goto L_0x0211
        L_0x011a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r11, r1)
            throw r1
        L_0x011f:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            r2 = r22
            goto L_0x0203
        L_0x012c:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r2 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r2
            if (r2 == 0) goto L_0x014b
            r13 = r2
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r15 = r29
            r11 = r30
            r10 = r31
            goto L_0x0213
        L_0x014b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r13, r1)
            throw r1
        L_0x0150:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r12 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r12
            r2 = r22
            r14 = r24
            goto L_0x0205
        L_0x015f:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0180
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r15 = r29
            r11 = r30
            r10 = r31
            r13 = r32
            goto L_0x0215
        L_0x0180:
            r4 = r36
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r4, r6, r1)
            throw r1
        L_0x0187:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r22
            r14 = r24
            r12 = r25
            goto L_0x0207
        L_0x0198:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            goto L_0x0209
        L_0x01ab:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r35 & -3
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r15 = r29
            r11 = r30
            r10 = r31
            r13 = r32
            r5 = r33
            r6 = r34
            goto L_0x0024
        L_0x01ce:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01f0
            r2 = r22
            r14 = r24
            r12 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r15 = r29
            r11 = r30
            r10 = r31
            r13 = r32
            r5 = r33
            goto L_0x0217
        L_0x01f0:
            r3 = r18
            r2 = r37
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x01f9:
            r46.mo68408S()
            r46.mo68411c0()
        L_0x01ff:
            r2 = r22
            r14 = r24
        L_0x0203:
            r12 = r25
        L_0x0205:
            r9 = r26
        L_0x0207:
            r8 = r27
        L_0x0209:
            r7 = r28
            r15 = r29
        L_0x020d:
            r11 = r30
        L_0x020f:
            r10 = r31
        L_0x0211:
            r13 = r32
        L_0x0213:
            r5 = r33
        L_0x0215:
            r6 = r34
        L_0x0217:
            r4 = r35
            goto L_0x0024
        L_0x021b:
            r38 = r4
            r4 = r36
            r0 = r37
            r46.mo68413e()
            r0 = -3
            r4 = r35
            if (r4 != r0) goto L_0x0291
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC r0 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC
            if (r34 == 0) goto L_0x0288
            if (r33 == 0) goto L_0x0281
            long r21 = r33.longValue()
            if (r32 == 0) goto L_0x027c
            if (r31 == 0) goto L_0x0277
            boolean r4 = r31.booleanValue()
            if (r17 == 0) goto L_0x0272
            if (r30 == 0) goto L_0x026d
            boolean r18 = r30.booleanValue()
            if (r19 == 0) goto L_0x0268
            if (r29 == 0) goto L_0x0263
            long r1 = r29.longValue()
            r5 = r0
            r6 = r34
            r7 = r28
            r8 = r27
            r9 = r26
            r10 = r21
            r12 = r25
            r13 = r32
            r14 = r24
            r15 = r4
            r21 = r1
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23)
            return r0
        L_0x0263:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r0
        L_0x0268:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r14, r1)
            throw r0
        L_0x026d:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r8, r9, r1)
            throw r0
        L_0x0272:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r15, r7, r1)
            throw r0
        L_0x0277:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r10, r11, r1)
            throw r0
        L_0x027c:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r5, r13, r1)
            throw r0
        L_0x0281:
            r0 = r36
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r6, r1)
            throw r0
        L_0x0288:
            r0 = r37
            r2 = r38
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x0291:
            r0 = r45
            r18 = r6
            r39 = r37
            r40 = r38
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC> r6 = r0.constructorRef
            r35 = 1
            r37 = 0
            r38 = r5
            r5 = 18
            if (r6 != 0) goto L_0x030d
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC> r6 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC.class
            r41 = r13
            java.lang.Class[] r13 = new java.lang.Class[r5]
            r13[r37] = r22
            java.lang.Class<java.lang.Long> r42 = java.lang.Long.class
            r13[r35] = r42
            r42 = 2
            r13[r42] = r22
            r42 = 3
            r13[r42] = r22
            r42 = 4
            java.lang.Class r43 = java.lang.Long.TYPE
            r13[r42] = r43
            r42 = 5
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r44 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r13[r42] = r44
            r42 = 6
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r44 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r13[r42] = r44
            r42 = 7
            java.lang.Class<java.util.List> r44 = java.util.List.class
            r13[r42] = r44
            r42 = 8
            java.lang.Class r44 = java.lang.Boolean.TYPE
            r13[r42] = r44
            r42 = 9
            r13[r42] = r22
            r42 = 10
            r13[r42] = r22
            r42 = 11
            r13[r42] = r44
            r42 = 12
            r13[r42] = r22
            r42 = 13
            r13[r42] = r22
            r22 = 14
            r13[r22] = r43
            r22 = 15
            java.lang.Class<java.util.List> r42 = java.util.List.class
            r13[r22] = r42
            r22 = 16
            java.lang.Class r42 = java.lang.Integer.TYPE
            r13[r22] = r42
            r22 = 17
            java.lang.Class<?> r42 = p618lp.C18215a.f39928c
            r13[r22] = r42
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r13)
            r0.constructorRef = r6
            java.lang.String r13 = "InAppNotificationRFC::cl…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r6, r13)
            goto L_0x030f
        L_0x030d:
            r41 = r13
        L_0x030f:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r34 == 0) goto L_0x03bb
            r5[r37] = r34
            r5[r35] = r28
            r13 = 2
            r5[r13] = r27
            r13 = 3
            r5[r13] = r26
            r13 = 4
            if (r33 == 0) goto L_0x03b2
            long r26 = r33.longValue()
            java.lang.Long r18 = java.lang.Long.valueOf(r26)
            r5[r13] = r18
            r13 = 5
            r5[r13] = r25
            r13 = 6
            if (r32 == 0) goto L_0x03a9
            r5[r13] = r32
            r13 = 7
            r5[r13] = r24
            r13 = 8
            if (r31 == 0) goto L_0x03a4
            boolean r10 = r31.booleanValue()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r5[r13] = r10
            r10 = 9
            r5[r10] = r16
            r10 = 10
            if (r17 == 0) goto L_0x039f
            r5[r10] = r17
            r7 = 11
            if (r30 == 0) goto L_0x039a
            boolean r8 = r30.booleanValue()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r5[r7] = r8
            r7 = 12
            if (r19 == 0) goto L_0x0395
            r5[r7] = r19
            r7 = 13
            r5[r7] = r20
            r7 = 14
            if (r29 == 0) goto L_0x0390
            long r1 = r29.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5[r7] = r1
            r1 = 15
            r5[r1] = r23
            r1 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r1] = r2
            r1 = 17
            r2 = 0
            r5[r1] = r2
            java.lang.Object r1 = r6.newInstance(r5)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC) r1
            return r1
        L_0x0390:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x0395:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r14, r1)
            throw r1
        L_0x039a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r8, r9, r1)
            throw r1
        L_0x039f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r7, r1)
            throw r1
        L_0x03a4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r11, r1)
            throw r1
        L_0x03a9:
            r3 = r38
            r2 = r41
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        L_0x03b2:
            r2 = r18
            r3 = r36
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        L_0x03bb:
            r2 = r39
            r3 = r40
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFCJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC");
    }

    public void toJson(C17412w wVar, InAppNotificationRFC inAppNotificationRFC) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationRFC != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationRFC.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationRFC.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationRFC.getText());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationRFC.getTimePassed());
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationRFC.getShopId()));
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationRFC.getShopIcon());
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationRFC.getClickType());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationRFC.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationRFC.isRead()));
            wVar.mo68529h(ResponseConstants.BUTTON_TEXT);
            this.nullableStringAdapter.toJson(wVar, inAppNotificationRFC.getButtonText());
            wVar.mo68529h("coupon_code");
            this.stringAdapter.toJson(wVar, inAppNotificationRFC.getCouponCode());
            wVar.mo68529h("button_enabled");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationRFC.getButtonEnabled()));
            wVar.mo68529h("promotion_text");
            this.stringAdapter.toJson(wVar, inAppNotificationRFC.getPromoText());
            wVar.mo68529h("unavailable_message");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationRFC.getUnavailableText());
            wVar.mo68529h("promoted_offer_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationRFC.getPromoOfferId()));
            wVar.mo68529h("promoted_offer_listing_tokens");
            this.nullableListOfStringAdapter.toJson(wVar, inAppNotificationRFC.getPromoOfferTokens());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
