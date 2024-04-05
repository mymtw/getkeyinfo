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

public final class InAppNotificationNFYFSJsonAdapter extends JsonAdapter<InAppNotificationNFYFS> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationNFYFS> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_time_passed", "shop_id", "listing_id", "notification_shop_img", "notification_click_type", "listings", "read");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationNFYFSJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "text");
        this.nullableShopIconAdapter = yVar.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.inAppNotificationClickTypeAdapter = yVar.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.nullableListOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationNFYFS)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e1, code lost:
        r11 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e3, code lost:
        r2 = r17;
        r3 = r18;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00eb, code lost:
        r12 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS fromJson(com.squareup.moshi.JsonReader r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            r36.mo68410b()
            r5 = -1
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
        L_0x001b:
            boolean r16 = r36.mo68414f()
            java.lang.String r4 = "read"
            r17 = r2
            java.lang.String r2 = "isRead"
            r18 = r3
            java.lang.String r3 = "notification_click_type"
            r19 = r15
            java.lang.String r15 = "clickType"
            r20 = r13
            java.lang.String r13 = "notification_feed_id"
            r21 = r12
            java.lang.String r12 = "feedId"
            if (r16 == 0) goto L_0x00ef
            r16 = r11
            com.squareup.moshi.JsonReader$b r11 = r0.options
            int r11 = r1.mo68406Q(r11)
            switch(r11) {
                case -1: goto L_0x00db;
                case 0: goto L_0x00ca;
                case 1: goto L_0x00be;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a0;
                case 5: goto L_0x008b;
                case 6: goto L_0x0079;
                case 7: goto L_0x0067;
                case 8: goto L_0x0056;
                case 9: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x00e1
        L_0x0044:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r3
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0051
            goto L_0x00e1
        L_0x0051:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r4, r1)
            throw r1
        L_0x0056:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.util.List r15 = (java.util.List) r15
            r11 = r16
            r2 = r17
            r3 = r18
            goto L_0x00e9
        L_0x0067:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r14 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r14
            if (r14 == 0) goto L_0x0074
            goto L_0x00e1
        L_0x0074:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r3, r1)
            throw r1
        L_0x0079:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r13 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r13
            r11 = r16
            r2 = r17
            r3 = r18
            r15 = r19
            goto L_0x00eb
        L_0x008b:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            java.lang.Long r12 = (java.lang.Long) r12
            r11 = r16
            r2 = r17
            r3 = r18
            r15 = r19
            r13 = r20
            goto L_0x001b
        L_0x00a0:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.Long r11 = (java.lang.Long) r11
            goto L_0x00e3
        L_0x00aa:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00e1
        L_0x00b4:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00e1
        L_0x00be:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.Long r8 = (java.lang.Long) r8
            r5 = r5 & -3
            goto L_0x00e1
        L_0x00ca:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00d6
            goto L_0x00e1
        L_0x00d6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r13, r1)
            throw r1
        L_0x00db:
            r36.mo68408S()
            r36.mo68411c0()
        L_0x00e1:
            r11 = r16
        L_0x00e3:
            r2 = r17
            r3 = r18
            r15 = r19
        L_0x00e9:
            r13 = r20
        L_0x00eb:
            r12 = r21
            goto L_0x001b
        L_0x00ef:
            r16 = r11
            r36.mo68413e()
            r11 = -3
            if (r5 != r11) goto L_0x0121
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS r5 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS
            if (r7 == 0) goto L_0x011c
            if (r14 == 0) goto L_0x0117
            if (r6 == 0) goto L_0x0112
            boolean r1 = r6.booleanValue()
            r6 = r5
            r11 = r16
            r12 = r21
            r13 = r20
            r15 = r19
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
        L_0x0112:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r4, r1)
            throw r1
        L_0x0117:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r3, r1)
            throw r1
        L_0x011c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r13, r1)
            throw r1
        L_0x0121:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS> r11 = r0.constructorRef
            r22 = 10
            r23 = 9
            r24 = 8
            r25 = 7
            r26 = 6
            r27 = 5
            r28 = 4
            r29 = 3
            r30 = 2
            r31 = 1
            r32 = 0
            r33 = r12
            r12 = 12
            if (r11 != 0) goto L_0x0177
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS> r11 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS.class
            r34 = r13
            java.lang.Class[] r13 = new java.lang.Class[r12]
            r13[r32] = r18
            r13[r31] = r17
            r13[r30] = r18
            r13[r29] = r18
            r13[r28] = r17
            r13[r27] = r17
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r17 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r13[r26] = r17
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r17 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r13[r25] = r17
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r13[r24] = r17
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r13[r23] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r13[r22] = r17
            r17 = 11
            java.lang.Class<?> r18 = p618lp.C18215a.f39928c
            r13[r17] = r18
            java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r13)
            r0.constructorRef = r11
            java.lang.String r13 = "InAppNotificationNFYFS::…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r11, r13)
            goto L_0x0179
        L_0x0177:
            r34 = r13
        L_0x0179:
            java.lang.Object[] r12 = new java.lang.Object[r12]
            if (r7 == 0) goto L_0x01be
            r12[r32] = r7
            r12[r31] = r8
            r12[r30] = r9
            r12[r29] = r10
            r12[r28] = r16
            r12[r27] = r21
            r12[r26] = r20
            if (r14 == 0) goto L_0x01b9
            r12[r25] = r14
            r12[r24] = r19
            if (r6 == 0) goto L_0x01b4
            boolean r1 = r6.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r12[r23] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r12[r22] = r1
            r1 = 11
            r2 = 0
            r12[r1] = r2
            java.lang.Object r1 = r11.newInstance(r12)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS) r1
            return r1
        L_0x01b4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r4, r1)
            throw r1
        L_0x01b9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r3, r1)
            throw r1
        L_0x01be:
            r3 = r33
            r2 = r34
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFSJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS");
    }

    public void toJson(C17412w wVar, InAppNotificationNFYFS inAppNotificationNFYFS) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationNFYFS != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationNFYFS.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationNFYFS.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationNFYFS.getText());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationNFYFS.getTimePassed());
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationNFYFS.getShopId());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationNFYFS.getListingId());
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationNFYFS.getShopIcon());
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationNFYFS.getClickType());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationNFYFS.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationNFYFS.isRead()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
