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

public final class InAppNotificationYFNOSJsonAdapter extends JsonAdapter<InAppNotificationYFNOS> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationYFNOS> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_subtext", "notification_time_passed", "notification_click_type", "listing_id", "notification_shop_img", "listings", "read", "accessibility_text");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationYFNOSJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "text");
        this.inAppNotificationClickTypeAdapter = yVar.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "listingId");
        this.nullableShopIconAdapter = yVar.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.nullableListOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationYFNOS)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0110, code lost:
        r2 = r18;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0114, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0116, code lost:
        r10 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0118, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011a, code lost:
        r8 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011c, code lost:
        r7 = r24;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS fromJson(com.squareup.moshi.JsonReader r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r40.mo68410b()
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x001b:
            boolean r13 = r40.mo68414f()
            java.lang.String r3 = "read"
            r18 = r2
            java.lang.String r2 = "isRead"
            r19 = r15
            java.lang.String r15 = "listing_id"
            r20 = r14
            java.lang.String r14 = "listingId"
            r21 = r10
            java.lang.String r10 = "notification_click_type"
            r22 = r9
            java.lang.String r9 = "clickType"
            r23 = r8
            java.lang.String r8 = "notification_feed_id"
            r24 = r7
            java.lang.String r7 = "feedId"
            if (r13 == 0) goto L_0x0120
            com.squareup.moshi.JsonReader$b r13 = r0.options
            int r13 = r1.mo68406Q(r13)
            switch(r13) {
                case -1: goto L_0x010a;
                case 0: goto L_0x00f9;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00aa;
                case 5: goto L_0x0098;
                case 6: goto L_0x0086;
                case 7: goto L_0x0077;
                case 8: goto L_0x006a;
                case 9: goto L_0x0058;
                case 10: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0110
        L_0x004a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            r4 = r4 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x0110
        L_0x0058:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r7 = r0.booleanAdapter
            java.lang.Object r7 = r7.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r7
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L_0x0065
            goto L_0x0110
        L_0x0065:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x006a:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.util.List r15 = (java.util.List) r15
            r2 = r18
            goto L_0x0114
        L_0x0077:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r14 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r14
            r2 = r18
            r15 = r19
            goto L_0x0116
        L_0x0086:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0093
            goto L_0x0110
        L_0x0093:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r15, r1)
            throw r1
        L_0x0098:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r11 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r11
            if (r11 == 0) goto L_0x00a5
            goto L_0x0110
        L_0x00a5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r10, r1)
            throw r1
        L_0x00aa:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            r2 = r18
            r15 = r19
            r14 = r20
            goto L_0x0118
        L_0x00ba:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r18
            r15 = r19
            r14 = r20
            r10 = r21
            goto L_0x011a
        L_0x00cc:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r2 = r18
            r15 = r19
            r14 = r20
            r10 = r21
            r9 = r22
            goto L_0x011c
        L_0x00e0:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r4 & -3
            r2 = r18
            r15 = r19
            r14 = r20
            r10 = r21
            r9 = r22
            r8 = r23
            goto L_0x001b
        L_0x00f9:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0105
            goto L_0x0110
        L_0x0105:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r8, r1)
            throw r1
        L_0x010a:
            r40.mo68408S()
            r40.mo68411c0()
        L_0x0110:
            r2 = r18
            r15 = r19
        L_0x0114:
            r14 = r20
        L_0x0116:
            r10 = r21
        L_0x0118:
            r9 = r22
        L_0x011a:
            r8 = r23
        L_0x011c:
            r7 = r24
            goto L_0x001b
        L_0x0120:
            r40.mo68413e()
            r13 = -1027(0xfffffffffffffbfd, float:NaN)
            if (r4 != r13) goto L_0x015f
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS
            if (r6 == 0) goto L_0x015a
            if (r11 == 0) goto L_0x0155
            if (r5 == 0) goto L_0x0150
            long r13 = r5.longValue()
            if (r12 == 0) goto L_0x014b
            boolean r16 = r12.booleanValue()
            r5 = r4
            r7 = r24
            r8 = r23
            r9 = r22
            r10 = r21
            r12 = r13
            r14 = r20
            r15 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            return r4
        L_0x014b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x0150:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r15, r1)
            throw r1
        L_0x0155:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r10, r1)
            throw r1
        L_0x015a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r7, r8, r1)
            throw r1
        L_0x015f:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS> r13 = r0.constructorRef
            r25 = 10
            r26 = 9
            r27 = 8
            r28 = 7
            r29 = 6
            r30 = 5
            r31 = 4
            r32 = 3
            r33 = 2
            r34 = 1
            r35 = 0
            r36 = r7
            r7 = 13
            if (r13 != 0) goto L_0x01bd
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS> r13 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS.class
            r37 = r8
            java.lang.Class[] r8 = new java.lang.Class[r7]
            r8[r35] = r18
            java.lang.Class<java.lang.Long> r38 = java.lang.Long.class
            r8[r34] = r38
            r8[r33] = r18
            r8[r32] = r18
            r8[r31] = r18
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r38 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r8[r30] = r38
            java.lang.Class r38 = java.lang.Long.TYPE
            r8[r29] = r38
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r38 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r8[r28] = r38
            java.lang.Class<java.util.List> r38 = java.util.List.class
            r8[r27] = r38
            java.lang.Class r38 = java.lang.Boolean.TYPE
            r8[r26] = r38
            r8[r25] = r18
            r18 = 11
            java.lang.Class r38 = java.lang.Integer.TYPE
            r8[r18] = r38
            r18 = 12
            java.lang.Class<?> r38 = p618lp.C18215a.f39928c
            r8[r18] = r38
            java.lang.reflect.Constructor r13 = r13.getDeclaredConstructor(r8)
            r0.constructorRef = r13
            java.lang.String r8 = "InAppNotificationYFNOS::…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r13, r8)
            goto L_0x01bf
        L_0x01bd:
            r37 = r8
        L_0x01bf:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r6 == 0) goto L_0x0217
            r7[r35] = r6
            r7[r34] = r24
            r7[r33] = r23
            r7[r32] = r22
            r7[r31] = r21
            if (r11 == 0) goto L_0x0212
            r7[r30] = r11
            if (r5 == 0) goto L_0x020d
            long r5 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r7[r29] = r5
            r7[r28] = r20
            r7[r27] = r19
            if (r12 == 0) goto L_0x0208
            boolean r1 = r12.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7[r26] = r1
            r7[r25] = r17
            r1 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r7[r1] = r2
            r1 = 12
            r2 = 0
            r7[r1] = r2
            java.lang.Object r1 = r13.newInstance(r7)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS) r1
            return r1
        L_0x0208:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x020d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r15, r1)
            throw r1
        L_0x0212:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r10, r1)
            throw r1
        L_0x0217:
            r3 = r36
            r2 = r37
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOSJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS");
    }

    public void toJson(C17412w wVar, InAppNotificationYFNOS inAppNotificationYFNOS) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationYFNOS != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationYFNOS.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationYFNOS.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationYFNOS.getText());
            wVar.mo68529h("notification_subtext");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationYFNOS.getSubtext());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationYFNOS.getTimePassed());
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationYFNOS.getClickType());
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationYFNOS.getListingId()));
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationYFNOS.getShopIcon());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationYFNOS.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationYFNOS.isRead()));
            wVar.mo68529h("accessibility_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationYFNOS.getAccessibilityText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
