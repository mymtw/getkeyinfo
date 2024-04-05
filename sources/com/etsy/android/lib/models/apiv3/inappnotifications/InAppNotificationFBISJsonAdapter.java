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

public final class InAppNotificationFBISJsonAdapter extends JsonAdapter<InAppNotificationFBIS> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationFBIS> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_subtext", "notification_time_passed", "shop_id", "notification_click_type", "notification_shop_img", "listings", "read");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationFBISJsonAdapter(C17414y yVar) {
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
        return "GeneratedJsonAdapter(InAppNotificationFBIS)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0100, code lost:
        r2 = r17;
        r15 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0104, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0106, code lost:
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0108, code lost:
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010a, code lost:
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010c, code lost:
        r7 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS fromJson(com.squareup.moshi.JsonReader r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r38.mo68410b()
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0019:
            boolean r12 = r38.mo68414f()
            java.lang.String r3 = "read"
            r17 = r2
            java.lang.String r2 = "isRead"
            r18 = r15
            java.lang.String r15 = "notification_click_type"
            r19 = r14
            java.lang.String r14 = "clickType"
            r20 = r10
            java.lang.String r10 = "shop_id"
            r21 = r9
            java.lang.String r9 = "shopId"
            r22 = r8
            java.lang.String r8 = "notification_feed_id"
            r23 = r7
            java.lang.String r7 = "feedId"
            if (r12 == 0) goto L_0x0110
            com.squareup.moshi.JsonReader$b r12 = r0.options
            int r12 = r1.mo68406Q(r12)
            switch(r12) {
                case -1: goto L_0x00fa;
                case 0: goto L_0x00e9;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00aa;
                case 4: goto L_0x009a;
                case 5: goto L_0x0088;
                case 6: goto L_0x0076;
                case 7: goto L_0x0067;
                case 8: goto L_0x005a;
                case 9: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0100
        L_0x0048:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r7 = r0.booleanAdapter
            java.lang.Object r7 = r7.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r7
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L_0x0055
            goto L_0x0100
        L_0x0055:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x005a:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.util.List r15 = (java.util.List) r15
            r2 = r17
            goto L_0x0104
        L_0x0067:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r14 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r14
            r2 = r17
            r15 = r18
            goto L_0x0106
        L_0x0076:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r13 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r13
            if (r13 == 0) goto L_0x0083
            goto L_0x0100
        L_0x0083:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r15, r1)
            throw r1
        L_0x0088:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0095
            goto L_0x0100
        L_0x0095:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r10, r1)
            throw r1
        L_0x009a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            r2 = r17
            r15 = r18
            r14 = r19
            goto L_0x0108
        L_0x00aa:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r17
            r15 = r18
            r14 = r19
            r10 = r20
            goto L_0x010a
        L_0x00bc:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r2 = r17
            r15 = r18
            r14 = r19
            r10 = r20
            r9 = r21
            goto L_0x010c
        L_0x00d0:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r4 & -3
            r2 = r17
            r15 = r18
            r14 = r19
            r10 = r20
            r9 = r21
            r8 = r22
            goto L_0x0019
        L_0x00e9:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00f5
            goto L_0x0100
        L_0x00f5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r8, r1)
            throw r1
        L_0x00fa:
            r38.mo68408S()
            r38.mo68411c0()
        L_0x0100:
            r2 = r17
            r15 = r18
        L_0x0104:
            r14 = r19
        L_0x0106:
            r10 = r20
        L_0x0108:
            r9 = r21
        L_0x010a:
            r8 = r22
        L_0x010c:
            r7 = r23
            goto L_0x0019
        L_0x0110:
            r38.mo68413e()
            r12 = -3
            if (r4 != r12) goto L_0x0151
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS
            if (r6 == 0) goto L_0x014c
            if (r5 == 0) goto L_0x0147
            long r16 = r5.longValue()
            if (r13 == 0) goto L_0x0142
            if (r11 == 0) goto L_0x013d
            boolean r1 = r11.booleanValue()
            r5 = r4
            r7 = r23
            r8 = r22
            r9 = r21
            r10 = r20
            r11 = r16
            r14 = r19
            r15 = r18
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return r4
        L_0x013d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x0142:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r15, r1)
            throw r1
        L_0x0147:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r10, r1)
            throw r1
        L_0x014c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r7, r8, r1)
            throw r1
        L_0x0151:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS> r12 = r0.constructorRef
            r24 = 9
            r25 = 8
            r26 = 7
            r27 = 6
            r28 = 5
            r29 = 4
            r30 = 3
            r31 = 2
            r32 = 1
            r33 = 0
            r34 = r7
            r7 = 12
            if (r12 != 0) goto L_0x01ab
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS> r12 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS.class
            r35 = r8
            java.lang.Class[] r8 = new java.lang.Class[r7]
            r8[r33] = r17
            java.lang.Class<java.lang.Long> r36 = java.lang.Long.class
            r8[r32] = r36
            r8[r31] = r17
            r8[r30] = r17
            r8[r29] = r17
            java.lang.Class r17 = java.lang.Long.TYPE
            r8[r28] = r17
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r17 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r8[r27] = r17
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r17 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r8[r26] = r17
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r8[r25] = r17
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r8[r24] = r17
            r17 = 10
            java.lang.Class r36 = java.lang.Integer.TYPE
            r8[r17] = r36
            r17 = 11
            java.lang.Class<?> r36 = p618lp.C18215a.f39928c
            r8[r17] = r36
            java.lang.reflect.Constructor r12 = r12.getDeclaredConstructor(r8)
            r0.constructorRef = r12
            java.lang.String r8 = "InAppNotificationFBIS::c…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r12, r8)
            goto L_0x01ad
        L_0x01ab:
            r35 = r8
        L_0x01ad:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r6 == 0) goto L_0x0203
            r7[r33] = r6
            r7[r32] = r23
            r7[r31] = r22
            r7[r30] = r21
            r7[r29] = r20
            if (r5 == 0) goto L_0x01fe
            long r5 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r7[r28] = r5
            if (r13 == 0) goto L_0x01f9
            r7[r27] = r13
            r7[r26] = r19
            r7[r25] = r18
            if (r11 == 0) goto L_0x01f4
            boolean r1 = r11.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7[r24] = r1
            r1 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r7[r1] = r2
            r1 = 11
            r2 = 0
            r7[r1] = r2
            java.lang.Object r1 = r12.newInstance(r7)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS) r1
            return r1
        L_0x01f4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x01f9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r15, r1)
            throw r1
        L_0x01fe:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r10, r1)
            throw r1
        L_0x0203:
            r3 = r34
            r2 = r35
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBISJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS");
    }

    public void toJson(C17412w wVar, InAppNotificationFBIS inAppNotificationFBIS) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationFBIS != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationFBIS.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationFBIS.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationFBIS.getText());
            wVar.mo68529h("notification_subtext");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationFBIS.getSubtext());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationFBIS.getTimePassed());
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationFBIS.getShopId()));
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationFBIS.getClickType());
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationFBIS.getShopIcon());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationFBIS.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationFBIS.isRead()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
