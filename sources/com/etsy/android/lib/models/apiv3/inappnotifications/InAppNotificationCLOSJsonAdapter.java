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

public final class InAppNotificationCLOSJsonAdapter extends JsonAdapter<InAppNotificationCLOS> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationCLOS> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<List<IANListingCard>> nullableListOfIANListingCardAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_subtext", "notification_time_passed", "notification_click_type", "notification_shop_img", "listings", "read", "accessibility_text");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationCLOSJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "text");
        this.inAppNotificationClickTypeAdapter = yVar.mo68558c(InAppNotificationClickType.class, emptySet, "clickType");
        this.nullableShopIconAdapter = yVar.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.nullableListOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "listings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationCLOS)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        r2 = r16;
        r15 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00de, code lost:
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        r10 = r20;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS fromJson(com.squareup.moshi.JsonReader r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r37.mo68410b()
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
            r15 = 0
        L_0x0019:
            boolean r14 = r37.mo68414f()
            java.lang.String r3 = "read"
            r16 = r2
            java.lang.String r2 = "isRead"
            r17 = r15
            java.lang.String r15 = "notification_click_type"
            r18 = r13
            java.lang.String r13 = "clickType"
            r19 = r12
            java.lang.String r12 = "notification_feed_id"
            r20 = r10
            java.lang.String r10 = "feedId"
            if (r14 == 0) goto L_0x00e6
            com.squareup.moshi.JsonReader$b r14 = r0.options
            int r14 = r1.mo68406Q(r14)
            switch(r14) {
                case -1: goto L_0x00d4;
                case 0: goto L_0x00c3;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00a3;
                case 4: goto L_0x0090;
                case 5: goto L_0x007f;
                case 6: goto L_0x006f;
                case 7: goto L_0x0060;
                case 8: goto L_0x004f;
                case 9: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x00da
        L_0x0040:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            r4 = r4 & -513(0xfffffffffffffdff, float:NaN)
            r2 = r16
            goto L_0x00de
        L_0x004f:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r5 = r0.booleanAdapter
            java.lang.Object r5 = r5.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x005b
            goto L_0x00da
        L_0x005b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0060:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.nullableListOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            java.util.List r13 = (java.util.List) r13
            r2 = r16
            r15 = r17
            goto L_0x00e0
        L_0x006f:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r12 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r12
            r2 = r16
            r15 = r17
            r13 = r18
            goto L_0x00e2
        L_0x007f:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r11 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r11
            if (r11 == 0) goto L_0x008b
            goto L_0x00da
        L_0x008b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r13, r15, r1)
            throw r1
        L_0x0090:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            r2 = r16
            r15 = r17
            r13 = r18
            r12 = r19
            goto L_0x0019
        L_0x00a3:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00da
        L_0x00ad:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00da
        L_0x00b7:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r4 & -3
            goto L_0x00da
        L_0x00c3:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00cf
            goto L_0x00da
        L_0x00cf:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r12, r1)
            throw r1
        L_0x00d4:
            r37.mo68408S()
            r37.mo68411c0()
        L_0x00da:
            r2 = r16
            r15 = r17
        L_0x00de:
            r13 = r18
        L_0x00e0:
            r12 = r19
        L_0x00e2:
            r10 = r20
            goto L_0x0019
        L_0x00e6:
            r37.mo68413e()
            r14 = -515(0xfffffffffffffdfd, float:NaN)
            if (r4 != r14) goto L_0x0115
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS
            if (r6 == 0) goto L_0x0110
            if (r11 == 0) goto L_0x010b
            if (r5 == 0) goto L_0x0106
            boolean r14 = r5.booleanValue()
            r5 = r4
            r10 = r20
            r12 = r19
            r13 = r18
            r15 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        L_0x0106:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x010b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r15, r1)
            throw r1
        L_0x0110:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r12, r1)
            throw r1
        L_0x0115:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS> r14 = r0.constructorRef
            r21 = 11
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
            r33 = r10
            r10 = 12
            if (r14 != 0) goto L_0x016d
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS> r14 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS.class
            r34 = r12
            java.lang.Class[] r12 = new java.lang.Class[r10]
            r12[r32] = r16
            java.lang.Class<java.lang.Long> r35 = java.lang.Long.class
            r12[r31] = r35
            r12[r30] = r16
            r12[r29] = r16
            r12[r28] = r16
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r35 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r12[r27] = r35
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r35 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r12[r26] = r35
            java.lang.Class<java.util.List> r35 = java.util.List.class
            r12[r25] = r35
            java.lang.Class r35 = java.lang.Boolean.TYPE
            r12[r24] = r35
            r12[r23] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r12[r22] = r16
            java.lang.Class<?> r16 = p618lp.C18215a.f39928c
            r12[r21] = r16
            java.lang.reflect.Constructor r14 = r14.getDeclaredConstructor(r12)
            r0.constructorRef = r14
            java.lang.String r12 = "InAppNotificationCLOS::c…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r14, r12)
            goto L_0x016f
        L_0x016d:
            r34 = r12
        L_0x016f:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            if (r6 == 0) goto L_0x01b2
            r10[r32] = r6
            r10[r31] = r7
            r10[r30] = r8
            r10[r29] = r9
            r10[r28] = r20
            if (r11 == 0) goto L_0x01ad
            r10[r27] = r11
            r10[r26] = r19
            r10[r25] = r18
            if (r5 == 0) goto L_0x01a8
            boolean r1 = r5.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10[r24] = r1
            r10[r23] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r10[r22] = r1
            r1 = 0
            r10[r21] = r1
            java.lang.Object r1 = r14.newInstance(r10)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS) r1
            return r1
        L_0x01a8:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x01ad:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r15, r1)
            throw r1
        L_0x01b2:
            r3 = r33
            r2 = r34
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOSJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS");
    }

    public void toJson(C17412w wVar, InAppNotificationCLOS inAppNotificationCLOS) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationCLOS != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationCLOS.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationCLOS.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationCLOS.getText());
            wVar.mo68529h("notification_subtext");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationCLOS.getSubtext());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationCLOS.getTimePassed());
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationCLOS.getClickType());
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationCLOS.getShopIcon());
            wVar.mo68529h("listings");
            this.nullableListOfIANListingCardAdapter.toJson(wVar, inAppNotificationCLOS.getListings());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationCLOS.isRead()));
            wVar.mo68529h("accessibility_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationCLOS.getAccessibilityText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
