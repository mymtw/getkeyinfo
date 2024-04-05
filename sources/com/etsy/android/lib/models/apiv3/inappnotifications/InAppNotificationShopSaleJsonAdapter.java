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

public final class InAppNotificationShopSaleJsonAdapter extends JsonAdapter<InAppNotificationShopSale> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationShopSale> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_time_passed", "shop_id", "notification_shop_img", "notification_click_type", "listings", "read");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationShopSaleJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "text");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "shopId");
        this.nullableShopIconAdapter = yVar.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.inAppNotificationClickTypeAdapter = yVar.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.nullableListOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationShopSale)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        r2 = r16;
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ec, code lost:
        r9 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ee, code lost:
        r8 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        r7 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale fromJson(com.squareup.moshi.JsonReader r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r36.mo68410b()
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
        L_0x0018:
            boolean r11 = r36.mo68414f()
            java.lang.String r15 = "read"
            java.lang.String r3 = "isRead"
            r16 = r2
            java.lang.String r2 = "notification_click_type"
            r17 = r14
            java.lang.String r14 = "clickType"
            r18 = r12
            java.lang.String r12 = "shop_id"
            r19 = r9
            java.lang.String r9 = "shopId"
            r20 = r8
            java.lang.String r8 = "notification_feed_id"
            r21 = r7
            java.lang.String r7 = "feedId"
            if (r11 == 0) goto L_0x00f4
            com.squareup.moshi.JsonReader$b r11 = r0.options
            int r11 = r1.mo68406Q(r11)
            switch(r11) {
                case -1: goto L_0x00e0;
                case 0: goto L_0x00cf;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00a6;
                case 3: goto L_0x0096;
                case 4: goto L_0x0085;
                case 5: goto L_0x0076;
                case 6: goto L_0x0064;
                case 7: goto L_0x0057;
                case 8: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x00e6
        L_0x0045:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x0052
            goto L_0x00e6
        L_0x0052:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r15, r1)
            throw r1
        L_0x0057:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            r2 = r16
            goto L_0x00ea
        L_0x0064:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r3 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r3
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r13 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r13
            if (r13 == 0) goto L_0x0071
            goto L_0x00e6
        L_0x0071:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r2, r1)
            throw r1
        L_0x0076:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r12 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r12
            r2 = r16
            r14 = r17
            goto L_0x00ec
        L_0x0085:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0091
            goto L_0x00e6
        L_0x0091:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r12, r1)
            throw r1
        L_0x0096:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r16
            r14 = r17
            r12 = r18
            goto L_0x00ee
        L_0x00a6:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r2 = r16
            r14 = r17
            r12 = r18
            r9 = r19
            goto L_0x00f0
        L_0x00b8:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r4 & -3
            r2 = r16
            r14 = r17
            r12 = r18
            r9 = r19
            r8 = r20
            goto L_0x0018
        L_0x00cf:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00db
            goto L_0x00e6
        L_0x00db:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r8, r1)
            throw r1
        L_0x00e0:
            r36.mo68408S()
            r36.mo68411c0()
        L_0x00e6:
            r2 = r16
            r14 = r17
        L_0x00ea:
            r12 = r18
        L_0x00ec:
            r9 = r19
        L_0x00ee:
            r8 = r20
        L_0x00f0:
            r7 = r21
            goto L_0x0018
        L_0x00f4:
            r36.mo68413e()
            r11 = -3
            if (r4 != r11) goto L_0x0130
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale
            if (r6 == 0) goto L_0x012b
            if (r5 == 0) goto L_0x0126
            long r11 = r5.longValue()
            if (r13 == 0) goto L_0x0121
            if (r10 == 0) goto L_0x011c
            boolean r15 = r10.booleanValue()
            r5 = r4
            r7 = r21
            r8 = r20
            r9 = r19
            r10 = r11
            r12 = r18
            r14 = r17
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return r4
        L_0x011c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r15, r1)
            throw r1
        L_0x0121:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r2, r1)
            throw r1
        L_0x0126:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r12, r1)
            throw r1
        L_0x012b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r7, r8, r1)
            throw r1
        L_0x0130:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale> r11 = r0.constructorRef
            r22 = 9
            r23 = 8
            r24 = 7
            r25 = 6
            r26 = 5
            r27 = 4
            r28 = 3
            r29 = 2
            r30 = 1
            r31 = 0
            r32 = r7
            r7 = 11
            if (r11 != 0) goto L_0x0186
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale> r11 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale.class
            r33 = r8
            java.lang.Class[] r8 = new java.lang.Class[r7]
            r8[r31] = r16
            java.lang.Class<java.lang.Long> r34 = java.lang.Long.class
            r8[r30] = r34
            r8[r29] = r16
            r8[r28] = r16
            java.lang.Class r16 = java.lang.Long.TYPE
            r8[r27] = r16
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r16 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r8[r26] = r16
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r16 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r8[r25] = r16
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r8[r24] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r8[r23] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r8[r22] = r16
            r16 = 10
            java.lang.Class<?> r34 = p618lp.C18215a.f39928c
            r8[r16] = r34
            java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r8)
            r0.constructorRef = r11
            java.lang.String r8 = "InAppNotificationShopSal…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r11, r8)
            goto L_0x0188
        L_0x0186:
            r33 = r8
        L_0x0188:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r6 == 0) goto L_0x01da
            r7[r31] = r6
            r7[r30] = r21
            r7[r29] = r20
            r7[r28] = r19
            if (r5 == 0) goto L_0x01d5
            long r5 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r7[r27] = r5
            r7[r26] = r18
            if (r13 == 0) goto L_0x01d0
            r7[r25] = r13
            r7[r24] = r17
            if (r10 == 0) goto L_0x01cb
            boolean r1 = r10.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7[r23] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r7[r22] = r1
            r1 = 10
            r2 = 0
            r7[r1] = r2
            java.lang.Object r1 = r11.newInstance(r7)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale) r1
            return r1
        L_0x01cb:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r15, r1)
            throw r1
        L_0x01d0:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r2, r1)
            throw r1
        L_0x01d5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r12, r1)
            throw r1
        L_0x01da:
            r3 = r32
            r2 = r33
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSaleJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale");
    }

    public void toJson(C17412w wVar, InAppNotificationShopSale inAppNotificationShopSale) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationShopSale != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationShopSale.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationShopSale.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationShopSale.getText());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationShopSale.getTimePassed());
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationShopSale.getShopId()));
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationShopSale.getShopIcon());
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationShopSale.getClickType());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationShopSale.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationShopSale.isRead()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
