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

public final class IANShopCardJsonAdapter extends JsonAdapter<IANShopCard> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<IANShopCard> constructorRef;
    private final JsonAdapter<List<IANListingCard>> listOfIANListingCardAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<IANShopRating> nullableIANShopRatingAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_id", "user_id", ResponseConstants.SHOP_NAME, ResponseConstants.SELLER_AVATAR, "is_favorite", ResponseConstants.ICON, ResponseConstants.RATING, ResponseConstants.DISPLAY_LISTINGS);
    private final JsonAdapter<String> stringAdapter;

    public IANShopCardJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls2, emptySet, "shopId");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "shopName");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "sellerAvatarUrl");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isFavorite");
        this.nullableShopIconAdapter = yVar.mo68558c(ShopIcon.class, emptySet, "shopIcon");
        this.nullableIANShopRatingAdapter = yVar.mo68558c(IANShopRating.class, emptySet, ResponseConstants.RATING);
        this.listOfIANListingCardAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANListingCard.class), emptySet, "displayListings");
    }

    public String toString() {
        return "GeneratedJsonAdapter(IANShopCard)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r2 = r19;
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e7, code lost:
        r7 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        r12 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard fromJson(com.squareup.moshi.JsonReader r37) {
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
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0019:
            boolean r8 = r37.mo68414f()
            java.lang.String r9 = "display_listings"
            java.lang.String r10 = "displayListings"
            java.lang.String r11 = "is_favorite"
            java.lang.String r14 = "isFavorite"
            java.lang.String r3 = "shop_name"
            r19 = r2
            java.lang.String r2 = "shopName"
            r20 = r15
            java.lang.String r15 = "user_id"
            r21 = r13
            java.lang.String r13 = "userId"
            r22 = r7
            java.lang.String r7 = "shop_id"
            r23 = r12
            java.lang.String r12 = "shopId"
            if (r8 == 0) goto L_0x00ed
            com.squareup.moshi.JsonReader$b r8 = r0.options
            int r8 = r1.mo68406Q(r8)
            switch(r8) {
                case -1: goto L_0x00db;
                case 0: goto L_0x00ca;
                case 1: goto L_0x00b9;
                case 2: goto L_0x009f;
                case 3: goto L_0x008f;
                case 4: goto L_0x0078;
                case 5: goto L_0x0069;
                case 6: goto L_0x005b;
                case 7: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x00e1
        L_0x0048:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard>> r2 = r0.listOfIANListingCardAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.util.List r17 = (java.util.List) r17
            if (r17 == 0) goto L_0x0056
            goto L_0x00e1
        L_0x0056:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r9, r1)
            throw r1
        L_0x005b:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating> r2 = r0.nullableIANShopRatingAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating r16 = (com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating) r16
            r4 = r4 & -65
            goto L_0x00e1
        L_0x0069:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r2 = r0.nullableShopIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r15 = (com.etsy.android.lib.models.apiv3.listing.ShopIcon) r15
            r4 = r4 & -33
            r2 = r19
            goto L_0x00e5
        L_0x0078:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x008a
            r2 = r19
            r15 = r20
            r13 = r21
            goto L_0x00e9
        L_0x008a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r11, r1)
            throw r1
        L_0x008f:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            r4 = r4 & -9
            r2 = r19
            r15 = r20
            goto L_0x00e7
        L_0x009f:
            com.squareup.moshi.JsonAdapter<java.lang.String> r7 = r0.stringAdapter
            java.lang.Object r7 = r7.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00b4
            r2 = r19
            r15 = r20
            r13 = r21
            r7 = r22
            goto L_0x0019
        L_0x00b4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x00b9:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L_0x00c5
            goto L_0x00e1
        L_0x00c5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r13, r15, r1)
            throw r1
        L_0x00ca:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x00d6
            goto L_0x00e1
        L_0x00d6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r7, r1)
            throw r1
        L_0x00db:
            r37.mo68408S()
            r37.mo68411c0()
        L_0x00e1:
            r2 = r19
            r15 = r20
        L_0x00e5:
            r13 = r21
        L_0x00e7:
            r7 = r22
        L_0x00e9:
            r12 = r23
            goto L_0x0019
        L_0x00ed:
            r37.mo68413e()
            r8 = -105(0xffffffffffffff97, float:NaN)
            if (r4 != r8) goto L_0x0133
            com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard
            if (r5 == 0) goto L_0x012e
            long r18 = r5.longValue()
            if (r6 == 0) goto L_0x0129
            long r5 = r6.longValue()
            if (r23 == 0) goto L_0x0124
            if (r22 == 0) goto L_0x011f
            boolean r14 = r22.booleanValue()
            if (r17 == 0) goto L_0x011a
            r7 = r4
            r8 = r18
            r10 = r5
            r12 = r23
            r13 = r21
            r15 = r20
            r7.<init>(r8, r10, r12, r13, r14, r15, r16, r17)
            return r4
        L_0x011a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r9, r1)
            throw r1
        L_0x011f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r11, r1)
            throw r1
        L_0x0124:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x0129:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r15, r1)
            throw r1
        L_0x012e:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r7, r1)
            throw r1
        L_0x0133:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard> r8 = r0.constructorRef
            r24 = 8
            r25 = 7
            r26 = 6
            r27 = 5
            r28 = 4
            r29 = 3
            r30 = 2
            r31 = 1
            r32 = 0
            r33 = r7
            r7 = 10
            if (r8 != 0) goto L_0x0183
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard> r8 = com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard.class
            r34 = r12
            java.lang.Class[] r12 = new java.lang.Class[r7]
            java.lang.Class r35 = java.lang.Long.TYPE
            r12[r32] = r35
            r12[r31] = r35
            r12[r30] = r19
            r12[r29] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r12[r28] = r19
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ShopIcon> r19 = com.etsy.android.lib.models.apiv3.listing.ShopIcon.class
            r12[r27] = r19
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating> r19 = com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating.class
            r12[r26] = r19
            java.lang.Class<java.util.List> r19 = java.util.List.class
            r12[r25] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r12[r24] = r19
            r19 = 9
            java.lang.Class<?> r35 = p618lp.C18215a.f39928c
            r12[r19] = r35
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r12)
            r0.constructorRef = r8
            java.lang.String r12 = "IANShopCard::class.java.…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r8, r12)
            goto L_0x0185
        L_0x0183:
            r34 = r12
        L_0x0185:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r5 == 0) goto L_0x01e4
            long r33 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r7[r32] = r5
            if (r6 == 0) goto L_0x01df
            long r5 = r6.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r7[r31] = r5
            if (r23 == 0) goto L_0x01da
            r7[r30] = r23
            r7[r29] = r21
            if (r22 == 0) goto L_0x01d5
            boolean r2 = r22.booleanValue()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7[r28] = r2
            r7[r27] = r20
            r7[r26] = r16
            if (r17 == 0) goto L_0x01d0
            r7[r25] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r7[r24] = r1
            r1 = 9
            r2 = 0
            r7[r1] = r2
            java.lang.Object r1 = r8.newInstance(r7)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard) r1
            return r1
        L_0x01d0:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r9, r1)
            throw r1
        L_0x01d5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r11, r1)
            throw r1
        L_0x01da:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r3, r1)
            throw r1
        L_0x01df:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r15, r1)
            throw r1
        L_0x01e4:
            r2 = r33
            r3 = r34
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCardJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard");
    }

    public void toJson(C17412w wVar, IANShopCard iANShopCard) {
        C19383o.m32797g(wVar, "writer");
        if (iANShopCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(iANShopCard.getShopId()));
            wVar.mo68529h("user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(iANShopCard.getUserId()));
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.stringAdapter.toJson(wVar, iANShopCard.getShopName());
            wVar.mo68529h(ResponseConstants.SELLER_AVATAR);
            this.nullableStringAdapter.toJson(wVar, iANShopCard.getSellerAvatarUrl());
            wVar.mo68529h("is_favorite");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(iANShopCard.isFavorite()));
            wVar.mo68529h(ResponseConstants.ICON);
            this.nullableShopIconAdapter.toJson(wVar, iANShopCard.getShopIcon());
            wVar.mo68529h(ResponseConstants.RATING);
            this.nullableIANShopRatingAdapter.toJson(wVar, iANShopCard.getRating());
            wVar.mo68529h(ResponseConstants.DISPLAY_LISTINGS);
            this.listOfIANListingCardAdapter.toJson(wVar, iANShopCard.getDisplayListings());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
