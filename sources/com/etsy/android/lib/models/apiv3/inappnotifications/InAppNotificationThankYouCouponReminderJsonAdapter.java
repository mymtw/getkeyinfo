package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class InAppNotificationThankYouCouponReminderJsonAdapter extends JsonAdapter<InAppNotificationThankYouCouponReminder> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationThankYouCouponReminder> constructorRef;
    private final JsonAdapter<InAppNotificationClickType> inAppNotificationClickTypeAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_time_passed", "shop_id", "notification_shop_img", "notification_click_type", "read", ResponseConstants.BUTTON_TEXT, "coupon_code", "button_enabled", "promotion_text", "unavailable_message", "promotion_id", "disclaimer_message");
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationThankYouCouponReminderJsonAdapter(C17414y yVar) {
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
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationThankYouCouponReminder)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0204, code lost:
        r2 = r21;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0208, code lost:
        r12 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020a, code lost:
        r9 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x020c, code lost:
        r8 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020e, code lost:
        r7 = r27;
        r14 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0212, code lost:
        r11 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0214, code lost:
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0216, code lost:
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0218, code lost:
        r5 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021a, code lost:
        r6 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021c, code lost:
        r4 = r34;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder fromJson(com.squareup.moshi.JsonReader r47) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r47.mo68410b()
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
            r18 = 0
            r19 = 0
            r22 = 0
        L_0x0022:
            boolean r17 = r47.mo68414f()
            java.lang.String r3 = "disclaimer_message"
            r21 = r2
            java.lang.String r2 = "disclaimerText"
            r23 = r15
            java.lang.String r15 = "promotion_id"
            r24 = r12
            java.lang.String r12 = "promoId"
            r25 = r9
            java.lang.String r9 = "promotion_text"
            r26 = r8
            java.lang.String r8 = "promoText"
            r27 = r7
            java.lang.String r7 = "button_enabled"
            r28 = r14
            java.lang.String r14 = "buttonEnabled"
            r29 = r11
            java.lang.String r11 = "coupon_code"
            r30 = r10
            java.lang.String r10 = "couponCode"
            r31 = r13
            java.lang.String r13 = "read"
            r32 = r5
            java.lang.String r5 = "isRead"
            r33 = r6
            java.lang.String r6 = "notification_click_type"
            r34 = r4
            java.lang.String r4 = "clickType"
            r35 = r4
            java.lang.String r4 = "shop_id"
            r36 = r4
            java.lang.String r4 = "shopId"
            r37 = r4
            java.lang.String r4 = "notification_feed_id"
            r38 = r4
            java.lang.String r4 = "feedId"
            if (r17 == 0) goto L_0x0220
            r17 = r4
            com.squareup.moshi.JsonReader$b r4 = r0.options
            int r4 = r1.mo68406Q(r4)
            switch(r4) {
                case -1: goto L_0x01fe;
                case 0: goto L_0x01d3;
                case 1: goto L_0x01b0;
                case 2: goto L_0x019d;
                case 3: goto L_0x018c;
                case 4: goto L_0x0162;
                case 5: goto L_0x0153;
                case 6: goto L_0x012d;
                case 7: goto L_0x010b;
                case 8: goto L_0x00fe;
                case 9: goto L_0x00eb;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00b8;
                case 12: goto L_0x00ac;
                case 13: goto L_0x008e;
                case 14: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0204
        L_0x007b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r4 = r0.stringAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.JsonReader) r1)
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22
            if (r22 == 0) goto L_0x0089
            goto L_0x0204
        L_0x0089:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x008e:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L_0x00a7
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            goto L_0x0212
        L_0x00a7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r15, r1)
            throw r1
        L_0x00ac:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            goto L_0x0204
        L_0x00b8:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            if (r18 == 0) goto L_0x00c6
            goto L_0x0204
        L_0x00c6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r8, r9, r1)
            throw r1
        L_0x00cb:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L_0x00e6
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            r14 = r28
            goto L_0x0214
        L_0x00e6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r7, r1)
            throw r1
        L_0x00eb:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            if (r16 == 0) goto L_0x00f9
            goto L_0x0204
        L_0x00f9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r11, r1)
            throw r1
        L_0x00fe:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            r2 = r21
            goto L_0x0208
        L_0x010b:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x0128
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            r14 = r28
            r11 = r29
            goto L_0x0216
        L_0x0128:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r13, r1)
            throw r1
        L_0x012d:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r2 = r0.inAppNotificationClickTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r13 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType) r13
            if (r13 == 0) goto L_0x014c
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            r14 = r28
            r11 = r29
            r10 = r30
            goto L_0x0218
        L_0x014c:
            r4 = r35
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r4, r6, r1)
            throw r1
        L_0x0153:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r12 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r12
            r2 = r21
            r15 = r23
            goto L_0x020a
        L_0x0162:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0183
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            r14 = r28
            r11 = r29
            r10 = r30
            r13 = r31
            goto L_0x021a
        L_0x0183:
            r2 = r36
            r3 = r37
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x018c:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r21
            r15 = r23
            r12 = r24
            goto L_0x020c
        L_0x019d:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            goto L_0x020e
        L_0x01b0:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r34 & -3
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r14 = r28
            r11 = r29
            r10 = r30
            r13 = r31
            r5 = r32
            r6 = r33
            goto L_0x0022
        L_0x01d3:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01f5
            r2 = r21
            r15 = r23
            r12 = r24
            r9 = r25
            r8 = r26
            r7 = r27
            r14 = r28
            r11 = r29
            r10 = r30
            r13 = r31
            r5 = r32
            goto L_0x021c
        L_0x01f5:
            r3 = r17
            r2 = r38
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x01fe:
            r47.mo68408S()
            r47.mo68411c0()
        L_0x0204:
            r2 = r21
            r15 = r23
        L_0x0208:
            r12 = r24
        L_0x020a:
            r9 = r25
        L_0x020c:
            r8 = r26
        L_0x020e:
            r7 = r27
            r14 = r28
        L_0x0212:
            r11 = r29
        L_0x0214:
            r10 = r30
        L_0x0216:
            r13 = r31
        L_0x0218:
            r5 = r32
        L_0x021a:
            r6 = r33
        L_0x021c:
            r4 = r34
            goto L_0x0022
        L_0x0220:
            r41 = r4
            r4 = r35
            r0 = r36
            r39 = r37
            r40 = r38
            r47.mo68413e()
            r0 = -3
            r4 = r34
            if (r4 != r0) goto L_0x02a5
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder r0 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder
            if (r33 == 0) goto L_0x029c
            if (r32 == 0) goto L_0x0293
            long r20 = r32.longValue()
            if (r31 == 0) goto L_0x028c
            if (r30 == 0) goto L_0x0287
            boolean r4 = r30.booleanValue()
            if (r16 == 0) goto L_0x0282
            if (r29 == 0) goto L_0x027d
            boolean r17 = r29.booleanValue()
            if (r18 == 0) goto L_0x0278
            if (r28 == 0) goto L_0x0273
            long r28 = r28.longValue()
            if (r22 == 0) goto L_0x026e
            r5 = r0
            r6 = r33
            r7 = r27
            r8 = r26
            r9 = r25
            r10 = r20
            r12 = r24
            r13 = r31
            r14 = r4
            r15 = r23
            r20 = r28
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            return r0
        L_0x026e:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r0
        L_0x0273:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r15, r1)
            throw r0
        L_0x0278:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r8, r9, r1)
            throw r0
        L_0x027d:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r14, r7, r1)
            throw r0
        L_0x0282:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r10, r11, r1)
            throw r0
        L_0x0287:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r5, r13, r1)
            throw r0
        L_0x028c:
            r0 = r35
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r6, r1)
            throw r0
        L_0x0293:
            r0 = r36
            r2 = r39
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x029c:
            r0 = r40
            r2 = r41
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x02a5:
            r0 = r46
            r17 = r6
            r42 = r36
            r43 = r39
            r44 = r40
            r45 = r41
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder> r6 = r0.constructorRef
            r34 = r5
            r5 = 17
            if (r6 != 0) goto L_0x031d
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder> r6 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder.class
            r36 = r13
            java.lang.Class[] r13 = new java.lang.Class[r5]
            r37 = 0
            r13[r37] = r21
            r37 = 1
            java.lang.Class<java.lang.Long> r38 = java.lang.Long.class
            r13[r37] = r38
            r37 = 2
            r13[r37] = r21
            r37 = 3
            r13[r37] = r21
            r37 = 4
            java.lang.Class r38 = java.lang.Long.TYPE
            r13[r37] = r38
            r37 = 5
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r39 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r13[r37] = r39
            r37 = 6
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType> r39 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType.class
            r13[r37] = r39
            r37 = 7
            java.lang.Class r39 = java.lang.Boolean.TYPE
            r13[r37] = r39
            r37 = 8
            r13[r37] = r21
            r37 = 9
            r13[r37] = r21
            r37 = 10
            r13[r37] = r39
            r37 = 11
            r13[r37] = r21
            r37 = 12
            r13[r37] = r21
            r37 = 13
            r13[r37] = r38
            r37 = 14
            r13[r37] = r21
            r21 = 15
            java.lang.Class r37 = java.lang.Integer.TYPE
            r13[r21] = r37
            r21 = 16
            java.lang.Class<?> r37 = p618lp.C18215a.f39928c
            r13[r21] = r37
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r13)
            r0.constructorRef = r6
            java.lang.String r13 = "InAppNotificationThankYo…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r6, r13)
            goto L_0x031f
        L_0x031d:
            r36 = r13
        L_0x031f:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r13 = 0
            if (r33 == 0) goto L_0x03d4
            r5[r13] = r33
            r13 = 1
            r5[r13] = r27
            r13 = 2
            r5[r13] = r26
            r13 = 3
            r5[r13] = r25
            r13 = 4
            if (r32 == 0) goto L_0x03cb
            long r25 = r32.longValue()
            java.lang.Long r21 = java.lang.Long.valueOf(r25)
            r5[r13] = r21
            r13 = 5
            r5[r13] = r24
            r13 = 6
            if (r31 == 0) goto L_0x03c2
            r5[r13] = r31
            r13 = 7
            if (r30 == 0) goto L_0x03b9
            boolean r17 = r30.booleanValue()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
            r5[r13] = r17
            r13 = 8
            r5[r13] = r23
            r13 = 9
            if (r16 == 0) goto L_0x03b4
            r5[r13] = r16
            r10 = 10
            if (r29 == 0) goto L_0x03af
            boolean r7 = r29.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5[r10] = r7
            r7 = 11
            if (r18 == 0) goto L_0x03aa
            r5[r7] = r18
            r7 = 12
            r5[r7] = r19
            r7 = 13
            if (r28 == 0) goto L_0x03a5
            long r8 = r28.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5[r7] = r8
            r7 = 14
            if (r22 == 0) goto L_0x03a0
            r5[r7] = r22
            r1 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r1] = r2
            r1 = 16
            r2 = 0
            r5[r1] = r2
            java.lang.Object r1 = r6.newInstance(r5)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder) r1
            return r1
        L_0x03a0:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x03a5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r15, r1)
            throw r1
        L_0x03aa:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r8, r9, r1)
            throw r1
        L_0x03af:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r7, r1)
            throw r1
        L_0x03b4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r11, r1)
            throw r1
        L_0x03b9:
            r3 = r34
            r2 = r36
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        L_0x03c2:
            r2 = r17
            r3 = r35
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        L_0x03cb:
            r2 = r42
            r3 = r43
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        L_0x03d4:
            r2 = r44
            r3 = r45
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminderJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder");
    }

    public void toJson(C17412w wVar, InAppNotificationThankYouCouponReminder inAppNotificationThankYouCouponReminder) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationThankYouCouponReminder != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getText());
            wVar.mo68529h("notification_time_passed");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getTimePassed());
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationThankYouCouponReminder.getShopId()));
            wVar.mo68529h("notification_shop_img");
            this.nullableShopIconAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getShopIcon());
            wVar.mo68529h("notification_click_type");
            this.inAppNotificationClickTypeAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getClickType());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationThankYouCouponReminder.isRead()));
            wVar.mo68529h(ResponseConstants.BUTTON_TEXT);
            this.nullableStringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getButtonText());
            wVar.mo68529h("coupon_code");
            this.stringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getCouponCode());
            wVar.mo68529h("button_enabled");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationThankYouCouponReminder.getButtonEnabled()));
            wVar.mo68529h("promotion_text");
            this.stringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getPromoText());
            wVar.mo68529h("unavailable_message");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getUnavailableText());
            wVar.mo68529h("promotion_id");
            this.longAdapter.toJson(wVar, Long.valueOf(inAppNotificationThankYouCouponReminder.getPromoId()));
            wVar.mo68529h("disclaimer_message");
            this.stringAdapter.toJson(wVar, inAppNotificationThankYouCouponReminder.getDisclaimerText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
