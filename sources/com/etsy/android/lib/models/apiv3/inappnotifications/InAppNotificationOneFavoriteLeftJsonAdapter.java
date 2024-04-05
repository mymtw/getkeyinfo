package com.etsy.android.lib.models.apiv3.inappnotifications;

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

public final class InAppNotificationOneFavoriteLeftJsonAdapter extends JsonAdapter<InAppNotificationOneFavoriteLeft> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationOneFavoriteLeft> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_time_passed", "shop_id", "notification_click_type", "notification_shop_img", "listings", "read", "accessibility_text");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationOneFavoriteLeftJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "text");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "shopId");
        this.inAppNotificationClickTypeAdapter = yVar.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.nullableShopIconAdapter = yVar.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.nullableListOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationOneFavoriteLeft)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f6, code lost:
        r2 = r18;
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fa, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fc, code lost:
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fe, code lost:
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0100, code lost:
        r7 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft fromJson(com.squareup.moshi.JsonReader r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r39.mo68410b()
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
        L_0x001a:
            boolean r11 = r39.mo68414f()
            java.lang.String r15 = "read"
            java.lang.String r3 = "isRead"
            r18 = r2
            java.lang.String r2 = "notification_click_type"
            r19 = r14
            java.lang.String r14 = "clickType"
            r20 = r13
            java.lang.String r13 = "shop_id"
            r21 = r9
            java.lang.String r9 = "shopId"
            r22 = r8
            java.lang.String r8 = "notification_feed_id"
            r23 = r7
            java.lang.String r7 = "feedId"
            if (r11 == 0) goto L_0x0104
            com.squareup.moshi.JsonReader$b r11 = r0.options
            int r11 = r1.mo68406Q(r11)
            switch(r11) {
                case -1: goto L_0x00f0;
                case 0: goto L_0x00df;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00a6;
                case 4: goto L_0x0095;
                case 5: goto L_0x0083;
                case 6: goto L_0x0074;
                case 7: goto L_0x0067;
                case 8: goto L_0x0055;
                case 9: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00f6
        L_0x0047:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r4 = r4 & -513(0xfffffffffffffdff, float:NaN)
            goto L_0x00f6
        L_0x0055:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x0062
            goto L_0x00f6
        L_0x0062:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r15, r1)
            throw r1
        L_0x0067:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            r2 = r18
            goto L_0x00fa
        L_0x0074:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r13 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r13
            r2 = r18
            r14 = r19
            goto L_0x00fc
        L_0x0083:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r3 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r3
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r12 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r12
            if (r12 == 0) goto L_0x0090
            goto L_0x00f6
        L_0x0090:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r2, r1)
            throw r1
        L_0x0095:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x00a1
            goto L_0x00f6
        L_0x00a1:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r13, r1)
            throw r1
        L_0x00a6:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r18
            r14 = r19
            r13 = r20
            goto L_0x00fe
        L_0x00b6:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r2 = r18
            r14 = r19
            r13 = r20
            r9 = r21
            goto L_0x0100
        L_0x00c8:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r4 & -3
            r2 = r18
            r14 = r19
            r13 = r20
            r9 = r21
            r8 = r22
            goto L_0x001a
        L_0x00df:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00eb
            goto L_0x00f6
        L_0x00eb:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r8, r1)
            throw r1
        L_0x00f0:
            r39.mo68408S()
            r39.mo68411c0()
        L_0x00f6:
            r2 = r18
            r14 = r19
        L_0x00fa:
            r13 = r20
        L_0x00fc:
            r9 = r21
        L_0x00fe:
            r8 = r22
        L_0x0100:
            r7 = r23
            goto L_0x001a
        L_0x0104:
            r39.mo68413e()
            r11 = -515(0xfffffffffffffdfd, float:NaN)
            if (r4 != r11) goto L_0x0142
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft
            if (r6 == 0) goto L_0x013d
            if (r5 == 0) goto L_0x0138
            long r17 = r5.longValue()
            if (r12 == 0) goto L_0x0133
            if (r10 == 0) goto L_0x012e
            boolean r15 = r10.booleanValue()
            r5 = r4
            r7 = r23
            r8 = r22
            r9 = r21
            r10 = r17
            r13 = r20
            r14 = r19
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16)
            return r4
        L_0x012e:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r15, r1)
            throw r1
        L_0x0133:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r2, r1)
            throw r1
        L_0x0138:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r13, r1)
            throw r1
        L_0x013d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r7, r8, r1)
            throw r1
        L_0x0142:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft> r11 = r0.constructorRef
            r24 = 10
            r25 = 9
            r26 = 8
            r27 = 7
            r28 = 6
            r29 = 5
            r30 = 4
            r31 = 3
            r32 = 2
            r33 = 1
            r34 = 0
            r35 = r7
            r7 = 12
            if (r11 != 0) goto L_0x019c
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft> r11 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft.class
            r36 = r8
            java.lang.Class[] r8 = new java.lang.Class[r7]
            r8[r34] = r18
            java.lang.Class<java.lang.Long> r37 = java.lang.Long.class
            r8[r33] = r37
            r8[r32] = r18
            r8[r31] = r18
            java.lang.Class r37 = java.lang.Long.TYPE
            r8[r30] = r37
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r37 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r8[r29] = r37
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r37 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r8[r28] = r37
            java.lang.Class<java.util.List> r37 = java.util.List.class
            r8[r27] = r37
            java.lang.Class r37 = java.lang.Boolean.TYPE
            r8[r26] = r37
            r8[r25] = r18
            java.lang.Class r18 = java.lang.Integer.TYPE
            r8[r24] = r18
            r18 = 11
            java.lang.Class<?> r37 = p618lp.C18215a.f39928c
            r8[r18] = r37
            java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r8)
            r0.constructorRef = r11
            java.lang.String r8 = "InAppNotificationOneFavo…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r11, r8)
            goto L_0x019e
        L_0x019c:
            r36 = r8
        L_0x019e:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r6 == 0) goto L_0x01f2
            r7[r34] = r6
            r7[r33] = r23
            r7[r32] = r22
            r7[r31] = r21
            if (r5 == 0) goto L_0x01ed
            long r5 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r7[r30] = r5
            if (r12 == 0) goto L_0x01e8
            r7[r29] = r12
            r7[r28] = r20
            r7[r27] = r19
            if (r10 == 0) goto L_0x01e3
            boolean r1 = r10.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7[r26] = r1
            r7[r25] = r16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r7[r24] = r1
            r1 = 11
            r2 = 0
            r7[r1] = r2
            java.lang.Object r1 = r11.newInstance(r7)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft) r1
            return r1
        L_0x01e3:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r15, r1)
            throw r1
        L_0x01e8:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r2, r1)
            throw r1
        L_0x01ed:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r13, r1)
            throw r1
        L_0x01f2:
            r3 = r35
            r2 = r36
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeftJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft");
    }

    public void toJson(C17412w wVar, InAppNotificationOneFavoriteLeft inAppNotificationOneFavoriteLeft) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationOneFavoriteLeft != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getText());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getTimePassed());
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationOneFavoriteLeft.getShopId()));
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getClickType());
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getShopIcon());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationOneFavoriteLeft.isRead()));
            wVar.mo68529h("accessibility_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationOneFavoriteLeft.getAccessibilityText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
