package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.editable.EditableListing;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ListingCardJsonAdapter extends JsonAdapter<ListingCard> {
    public static final int $stable = 8;
    private volatile Constructor<ListingCard> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<FormattedMoney> nullableFormattedMoneyAdapter;
    private final JsonAdapter<FreeShippingData> nullableFreeShippingDataAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SellerMarketingPromotion>> nullableListOfSellerMarketingPromotionAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<ListingImage> nullableListingImageAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<SellerMarketingPromotionData> nullableSellerMarketingPromotionDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ACCEPTS_GIFT_CARD, "bestseller_v2_score", "can_be_waitlisted", ResponseConstants.CONTENT_SOURCE, ResponseConstants.CURRENCY_CODE, "currency_symbol", ResponseConstants.DISCOUNT_DESCRIPTION, "discount_description_unescaped", ResponseConstants.DISCOUNTED_PRICE, "discounted_price_formatted_with_locale", "for_pattern_consumption", "for_public_consumption", ResponseConstants.FREE_SHIPPING_DATA, ResponseConstants.HAS_COLOR_VARIATIONS, "has_manually_adjusted_thumbnail", ResponseConstants.HAS_VARIATIONS, ResponseConstants.IMAGE, "image170", ResponseConstants.IMG, ResponseConstants.IS_BESTSELLER, ResponseConstants.IS_CUSTOMIZABLE, ResponseConstants.IS_DOWNLOAD, "is_favorite", ResponseConstants.IS_IN_CART, ResponseConstants.IS_IN_COLLECTIONS, "collections_count", "is_in_merch_library", "is_listing_image_landscape", "is_machine_translated", "is_pattern", "is_retail", ResponseConstants.IS_SCARCE, ResponseConstants.IS_SOLD_OUT, "is_top_rated", "is_unique", ResponseConstants.IS_VACATION, "is_vintage", EditableListing.FIELD_IS_WHOLESALE, "last_sale_date", "listing_id", ResponseConstants.SearchImpression.LOGGING_KEY, "display_loc", "max_processing_days", "origin_country_id", ResponseConstants.PRICE, "price_formatted", "price_formatted_with_locale", "price_int", ResponseConstants.PRICE_UNFORMATTED, ResponseConstants.PROMOTION_DATA, ResponseConstants.PROMOTIONS, ResponseConstants.QUANTITY, ResponseConstants.SHOP_AVERAGE_RATING, "shop_id", ResponseConstants.SHOP_NAME, ResponseConstants.SHOP_TOTAL_RATING_COUNT, ResponseConstants.SHOP_URL, ResponseConstants.SIGNAL_PECKING_ORDER, "state", "seller_taxonomy_id", "title", "url", "wholesale_url");

    public ListingCardJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "acceptsGiftCard");
        this.nullableFloatAdapter = yVar2.mo68558c(Float.class, emptySet, "bestsellerV2Score");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "contentSource");
        this.nullableFormattedMoneyAdapter = yVar2.mo68558c(FormattedMoney.class, emptySet, "discountDescription");
        this.nullableMoneyAdapter = yVar2.mo68558c(Money.class, emptySet, "discountedPrice");
        this.nullableFreeShippingDataAdapter = yVar2.mo68558c(FreeShippingData.class, emptySet, "freeShippingData");
        this.nullableListingImageAdapter = yVar2.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMG);
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "collectionsCount");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "lastSaleDate");
        this.nullableSellerMarketingPromotionDataAdapter = yVar2.mo68558c(SellerMarketingPromotionData.class, emptySet, "promotionData");
        this.nullableListOfSellerMarketingPromotionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, SellerMarketingPromotion.class), emptySet, ResponseConstants.PROMOTIONS);
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "signalPeckingOrder");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingCard)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x017a, code lost:
        r8 = r8 & r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0344, code lost:
        r6 = r6 & r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.listing.ListingCard fromJson(com.squareup.moshi.JsonReader r76) {
        /*
            r75 = this;
            r0 = r75
            r1 = r76
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            java.lang.String r6 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            r76.mo68410b()
            r6 = -1
            r7 = 0
            r8 = r6
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r64 = r63
            r65 = r64
            r66 = r65
            r67 = r66
            r68 = r67
            r69 = r68
            r70 = r69
            r71 = r70
            r72 = r71
        L_0x008f:
            boolean r9 = r76.mo68414f()
            if (r9 == 0) goto L_0x0429
            com.squareup.moshi.JsonReader$b r9 = r0.options
            int r9 = r1.mo68406Q(r9)
            r73 = -32769(0xffffffffffff7fff, float:NaN)
            switch(r9) {
                case -1: goto L_0x0421;
                case 0: goto L_0x0414;
                case 1: goto L_0x0407;
                case 2: goto L_0x03fa;
                case 3: goto L_0x03ed;
                case 4: goto L_0x03e0;
                case 5: goto L_0x03d3;
                case 6: goto L_0x03c5;
                case 7: goto L_0x03b7;
                case 8: goto L_0x03a9;
                case 9: goto L_0x039b;
                case 10: goto L_0x038d;
                case 11: goto L_0x037f;
                case 12: goto L_0x0371;
                case 13: goto L_0x0363;
                case 14: goto L_0x0355;
                case 15: goto L_0x0347;
                case 16: goto L_0x0337;
                case 17: goto L_0x0329;
                case 18: goto L_0x031b;
                case 19: goto L_0x030d;
                case 20: goto L_0x02ff;
                case 21: goto L_0x02f1;
                case 22: goto L_0x02e3;
                case 23: goto L_0x02d5;
                case 24: goto L_0x02c6;
                case 25: goto L_0x02b7;
                case 26: goto L_0x02a8;
                case 27: goto L_0x0299;
                case 28: goto L_0x028a;
                case 29: goto L_0x027b;
                case 30: goto L_0x026c;
                case 31: goto L_0x025d;
                case 32: goto L_0x024f;
                case 33: goto L_0x0241;
                case 34: goto L_0x0233;
                case 35: goto L_0x0225;
                case 36: goto L_0x0217;
                case 37: goto L_0x0209;
                case 38: goto L_0x01fb;
                case 39: goto L_0x01ed;
                case 40: goto L_0x01df;
                case 41: goto L_0x01d1;
                case 42: goto L_0x01c3;
                case 43: goto L_0x01b5;
                case 44: goto L_0x01a7;
                case 45: goto L_0x0199;
                case 46: goto L_0x018b;
                case 47: goto L_0x017d;
                case 48: goto L_0x016d;
                case 49: goto L_0x015f;
                case 50: goto L_0x0151;
                case 51: goto L_0x0143;
                case 52: goto L_0x0135;
                case 53: goto L_0x0127;
                case 54: goto L_0x0119;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fc;
                case 57: goto L_0x00ed;
                case 58: goto L_0x00de;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00c0;
                case 61: goto L_0x00b1;
                case 62: goto L_0x00a2;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x008f
        L_0x00a2:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r72 = r9
            java.lang.String r72 = (java.lang.String) r72
            r9 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            goto L_0x017a
        L_0x00b1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r71 = r9
            java.lang.String r71 = (java.lang.String) r71
            r9 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            goto L_0x017a
        L_0x00c0:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r70 = r9
            java.lang.String r70 = (java.lang.String) r70
            r9 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            goto L_0x017a
        L_0x00cf:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r69 = r9
            java.lang.Integer r69 = (java.lang.Integer) r69
            r9 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            goto L_0x017a
        L_0x00de:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r68 = r9
            java.lang.Integer r68 = (java.lang.Integer) r68
            r9 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            goto L_0x017a
        L_0x00ed:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r9 = r0.nullableListOfStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r67 = r9
            java.util.List r67 = (java.util.List) r67
            r9 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            goto L_0x017a
        L_0x00fc:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r66 = r9
            java.lang.String r66 = (java.lang.String) r66
            r9 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            goto L_0x017a
        L_0x010b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r65 = r9
            java.lang.String r65 = (java.lang.String) r65
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x017a
        L_0x0119:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r64 = r9
            java.lang.String r64 = (java.lang.String) r64
            r9 = -4194305(0xffffffffffbfffff, float:NaN)
            goto L_0x017a
        L_0x0127:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r9 = r0.nullableLongAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r63 = r9
            java.lang.Long r63 = (java.lang.Long) r63
            r9 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L_0x017a
        L_0x0135:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r62 = r9
            java.lang.String r62 = (java.lang.String) r62
            r9 = -1048577(0xffffffffffefffff, float:NaN)
            goto L_0x017a
        L_0x0143:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r61 = r9
            java.lang.Integer r61 = (java.lang.Integer) r61
            r9 = -524289(0xfffffffffff7ffff, float:NaN)
            goto L_0x017a
        L_0x0151:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotion>> r9 = r0.nullableListOfSellerMarketingPromotionAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r60 = r9
            java.util.List r60 = (java.util.List) r60
            r9 = -262145(0xfffffffffffbffff, float:NaN)
            goto L_0x017a
        L_0x015f:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData> r9 = r0.nullableSellerMarketingPromotionDataAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r59 = r9
            com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData r59 = (com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData) r59
            r9 = -131073(0xfffffffffffdffff, float:NaN)
            goto L_0x017a
        L_0x016d:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r58 = r9
            java.lang.String r58 = (java.lang.String) r58
            r9 = -65537(0xfffffffffffeffff, float:NaN)
        L_0x017a:
            r8 = r8 & r9
            goto L_0x008f
        L_0x017d:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r57 = r9
            java.lang.Integer r57 = (java.lang.Integer) r57
            r8 = r8 & r73
            goto L_0x008f
        L_0x018b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r56 = r9
            java.lang.String r56 = (java.lang.String) r56
            r8 = r8 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x008f
        L_0x0199:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r55 = r9
            java.lang.String r55 = (java.lang.String) r55
            r8 = r8 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x008f
        L_0x01a7:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r54 = r9
            java.lang.String r54 = (java.lang.String) r54
            r8 = r8 & -4097(0xffffffffffffefff, float:NaN)
            goto L_0x008f
        L_0x01b5:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r53 = r9
            java.lang.Integer r53 = (java.lang.Integer) r53
            r8 = r8 & -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x008f
        L_0x01c3:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r52 = r9
            java.lang.Integer r52 = (java.lang.Integer) r52
            r8 = r8 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x008f
        L_0x01d1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r51 = r9
            java.lang.String r51 = (java.lang.String) r51
            r8 = r8 & -513(0xfffffffffffffdff, float:NaN)
            goto L_0x008f
        L_0x01df:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r50 = r9
            java.lang.String r50 = (java.lang.String) r50
            r8 = r8 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x008f
        L_0x01ed:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r9 = r0.nullableLongAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r49 = r9
            java.lang.Long r49 = (java.lang.Long) r49
            r8 = r8 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x008f
        L_0x01fb:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r9 = r0.nullableLongAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r48 = r9
            java.lang.Long r48 = (java.lang.Long) r48
            r8 = r8 & -65
            goto L_0x008f
        L_0x0209:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r47 = r9
            java.lang.Boolean r47 = (java.lang.Boolean) r47
            r8 = r8 & -33
            goto L_0x008f
        L_0x0217:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r46 = r9
            java.lang.Boolean r46 = (java.lang.Boolean) r46
            r8 = r8 & -17
            goto L_0x008f
        L_0x0225:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r45 = r9
            java.lang.Boolean r45 = (java.lang.Boolean) r45
            r8 = r8 & -9
            goto L_0x008f
        L_0x0233:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r44 = r9
            java.lang.Boolean r44 = (java.lang.Boolean) r44
            r8 = r8 & -5
            goto L_0x008f
        L_0x0241:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r43 = r9
            java.lang.Boolean r43 = (java.lang.Boolean) r43
            r8 = r8 & -3
            goto L_0x008f
        L_0x024f:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r42 = r9
            java.lang.Boolean r42 = (java.lang.Boolean) r42
            r8 = r8 & -2
            goto L_0x008f
        L_0x025d:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r41 = r9
            java.lang.Boolean r41 = (java.lang.Boolean) r41
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0344
        L_0x026c:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r40 = r9
            java.lang.Boolean r40 = (java.lang.Boolean) r40
            r9 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            goto L_0x0344
        L_0x027b:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r39 = r9
            java.lang.Boolean r39 = (java.lang.Boolean) r39
            r9 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            goto L_0x0344
        L_0x028a:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r38 = r9
            java.lang.Boolean r38 = (java.lang.Boolean) r38
            r9 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            goto L_0x0344
        L_0x0299:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r37 = r9
            java.lang.Boolean r37 = (java.lang.Boolean) r37
            r9 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            goto L_0x0344
        L_0x02a8:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r36 = r9
            java.lang.Boolean r36 = (java.lang.Boolean) r36
            r9 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            goto L_0x0344
        L_0x02b7:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r9 = r0.nullableIntAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r35 = r9
            java.lang.Integer r35 = (java.lang.Integer) r35
            r9 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            goto L_0x0344
        L_0x02c6:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r34 = r9
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            r9 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            goto L_0x0344
        L_0x02d5:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r33 = r9
            java.lang.Boolean r33 = (java.lang.Boolean) r33
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x0344
        L_0x02e3:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r32 = r9
            java.lang.Boolean r32 = (java.lang.Boolean) r32
            r9 = -4194305(0xffffffffffbfffff, float:NaN)
            goto L_0x0344
        L_0x02f1:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r31 = r9
            java.lang.Boolean r31 = (java.lang.Boolean) r31
            r9 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L_0x0344
        L_0x02ff:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r30 = r9
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            r9 = -1048577(0xffffffffffefffff, float:NaN)
            goto L_0x0344
        L_0x030d:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r29 = r9
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            r9 = -524289(0xfffffffffff7ffff, float:NaN)
            goto L_0x0344
        L_0x031b:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.ListingImage> r9 = r0.nullableListingImageAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r28 = r9
            com.etsy.android.lib.models.apiv3.listing.ListingImage r28 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r28
            r9 = -262145(0xfffffffffffbffff, float:NaN)
            goto L_0x0344
        L_0x0329:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r27 = r9
            java.lang.String r27 = (java.lang.String) r27
            r9 = -131073(0xfffffffffffdffff, float:NaN)
            goto L_0x0344
        L_0x0337:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r26 = r9
            java.lang.String r26 = (java.lang.String) r26
            r9 = -65537(0xfffffffffffeffff, float:NaN)
        L_0x0344:
            r6 = r6 & r9
            goto L_0x008f
        L_0x0347:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r25 = r9
            java.lang.Boolean r25 = (java.lang.Boolean) r25
            r6 = r6 & r73
            goto L_0x008f
        L_0x0355:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r24 = r9
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            r6 = r6 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x008f
        L_0x0363:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r23 = r9
            java.lang.Boolean r23 = (java.lang.Boolean) r23
            r6 = r6 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x008f
        L_0x0371:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.FreeShippingData> r9 = r0.nullableFreeShippingDataAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r22 = r9
            com.etsy.android.lib.models.apiv3.listing.FreeShippingData r22 = (com.etsy.android.lib.models.apiv3.listing.FreeShippingData) r22
            r6 = r6 & -4097(0xffffffffffffefff, float:NaN)
            goto L_0x008f
        L_0x037f:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r21 = r9
            java.lang.Boolean r21 = (java.lang.Boolean) r21
            r6 = r6 & -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x008f
        L_0x038d:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r20 = r9
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            r6 = r6 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x008f
        L_0x039b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r9
            java.lang.String r19 = (java.lang.String) r19
            r6 = r6 & -513(0xfffffffffffffdff, float:NaN)
            goto L_0x008f
        L_0x03a9:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.Money> r9 = r0.nullableMoneyAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r9
            com.etsy.android.lib.models.apiv3.listing.Money r18 = (com.etsy.android.lib.models.apiv3.listing.Money) r18
            r6 = r6 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x008f
        L_0x03b7:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r9
            java.lang.String r17 = (java.lang.String) r17
            r6 = r6 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x008f
        L_0x03c5:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.FormattedMoney> r9 = r0.nullableFormattedMoneyAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r9
            com.etsy.android.lib.models.apiv3.listing.FormattedMoney r16 = (com.etsy.android.lib.models.apiv3.listing.FormattedMoney) r16
            r6 = r6 & -65
            goto L_0x008f
        L_0x03d3:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r6 = r6 & -33
            goto L_0x008f
        L_0x03e0:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r6 = r6 & -17
            goto L_0x008f
        L_0x03ed:
            com.squareup.moshi.JsonAdapter<java.lang.String> r9 = r0.nullableStringAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r6 = r6 & -9
            goto L_0x008f
        L_0x03fa:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r9
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r6 = r6 & -5
            goto L_0x008f
        L_0x0407:
            com.squareup.moshi.JsonAdapter<java.lang.Float> r9 = r0.nullableFloatAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r9
            java.lang.Float r11 = (java.lang.Float) r11
            r6 = r6 & -3
            goto L_0x008f
        L_0x0414:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r9 = r0.nullableBooleanAdapter
            java.lang.Object r9 = r9.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r9
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r6 = r6 & -2
            goto L_0x008f
        L_0x0421:
            r76.mo68408S()
            r76.mo68411c0()
            goto L_0x008f
        L_0x0429:
            r76.mo68413e()
            if (r6 != 0) goto L_0x0439
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r1) goto L_0x0439
            com.etsy.android.lib.models.apiv3.listing.ListingCard r1 = new com.etsy.android.lib.models.apiv3.listing.ListingCard
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            return r1
        L_0x0439:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.listing.ListingCard> r1 = r0.constructorRef
            if (r1 != 0) goto L_0x056c
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ListingCard> r1 = com.etsy.android.lib.models.apiv3.listing.ListingCard.class
            r9 = 66
            java.lang.Class[] r9 = new java.lang.Class[r9]
            r73 = 0
            r9[r73] = r5
            r73 = 1
            java.lang.Class<java.lang.Float> r74 = java.lang.Float.class
            r9[r73] = r74
            r73 = 2
            r9[r73] = r5
            r73 = 3
            r9[r73] = r4
            r73 = 4
            r9[r73] = r4
            r73 = 5
            r9[r73] = r4
            r73 = 6
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.FormattedMoney> r74 = com.etsy.android.lib.models.apiv3.listing.FormattedMoney.class
            r9[r73] = r74
            r73 = 7
            r9[r73] = r4
            r73 = 8
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.Money> r74 = com.etsy.android.lib.models.apiv3.listing.Money.class
            r9[r73] = r74
            r73 = 9
            r9[r73] = r4
            r73 = 10
            r9[r73] = r5
            r73 = 11
            r9[r73] = r5
            r73 = 12
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.FreeShippingData> r74 = com.etsy.android.lib.models.apiv3.listing.FreeShippingData.class
            r9[r73] = r74
            r73 = 13
            r9[r73] = r5
            r73 = 14
            r9[r73] = r5
            r73 = 15
            r9[r73] = r5
            r73 = 16
            r9[r73] = r4
            r73 = 17
            r9[r73] = r4
            r73 = 18
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.ListingImage> r74 = com.etsy.android.lib.models.apiv3.listing.ListingImage.class
            r9[r73] = r74
            r73 = 19
            r9[r73] = r5
            r73 = 20
            r9[r73] = r5
            r73 = 21
            r9[r73] = r5
            r73 = 22
            r9[r73] = r5
            r73 = 23
            r9[r73] = r5
            r73 = 24
            r9[r73] = r5
            r73 = 25
            r9[r73] = r3
            r73 = 26
            r9[r73] = r5
            r73 = 27
            r9[r73] = r5
            r73 = 28
            r9[r73] = r5
            r73 = 29
            r9[r73] = r5
            r73 = 30
            r9[r73] = r5
            r73 = 31
            r9[r73] = r5
            r73 = 32
            r9[r73] = r5
            r73 = 33
            r9[r73] = r5
            r73 = 34
            r9[r73] = r5
            r73 = 35
            r9[r73] = r5
            r73 = 36
            r9[r73] = r5
            r73 = 37
            r9[r73] = r5
            r5 = 38
            r9[r5] = r2
            r5 = 39
            r9[r5] = r2
            r5 = 40
            r9[r5] = r4
            r5 = 41
            r9[r5] = r4
            r5 = 42
            r9[r5] = r3
            r5 = 43
            r9[r5] = r3
            r5 = 44
            r9[r5] = r4
            r5 = 45
            r9[r5] = r4
            r5 = 46
            r9[r5] = r4
            r5 = 47
            r9[r5] = r3
            r5 = 48
            r9[r5] = r4
            r5 = 49
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData> r73 = com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData.class
            r9[r5] = r73
            r5 = 50
            java.lang.Class<java.util.List> r73 = java.util.List.class
            r9[r5] = r73
            r5 = 51
            r9[r5] = r3
            r5 = 52
            r9[r5] = r4
            r5 = 53
            r9[r5] = r2
            r2 = 54
            r9[r2] = r4
            r2 = 55
            r9[r2] = r4
            r2 = 56
            r9[r2] = r4
            r2 = 57
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r2] = r5
            r2 = 58
            r9[r2] = r3
            r2 = 59
            r9[r2] = r3
            r2 = 60
            r9[r2] = r4
            r2 = 61
            r9[r2] = r4
            r2 = 62
            r9[r2] = r4
            r2 = 63
            java.lang.Class r3 = java.lang.Integer.TYPE
            r9[r2] = r3
            r2 = 64
            r9[r2] = r3
            r2 = 65
            java.lang.Class<?> r3 = p618lp.C18215a.f39928c
            r9[r2] = r3
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r9)
            r0.constructorRef = r1
            kotlin.m r2 = kotlin.C19394m.f43287a
            java.lang.String r2 = "ListingCard::class.java.…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
        L_0x056c:
            r2 = 66
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            r3 = 2
            r2[r3] = r12
            r3 = 3
            r2[r3] = r13
            r3 = 4
            r2[r3] = r14
            r3 = 5
            r2[r3] = r15
            r3 = 6
            r2[r3] = r16
            r3 = 7
            r2[r3] = r17
            r3 = 8
            r2[r3] = r18
            r3 = 9
            r2[r3] = r19
            r3 = 10
            r2[r3] = r20
            r3 = 11
            r2[r3] = r21
            r3 = 12
            r2[r3] = r22
            r3 = 13
            r2[r3] = r23
            r3 = 14
            r2[r3] = r24
            r3 = 15
            r2[r3] = r25
            r3 = 16
            r2[r3] = r26
            r3 = 17
            r2[r3] = r27
            r3 = 18
            r2[r3] = r28
            r3 = 19
            r2[r3] = r29
            r3 = 20
            r2[r3] = r30
            r3 = 21
            r2[r3] = r31
            r3 = 22
            r2[r3] = r32
            r3 = 23
            r2[r3] = r33
            r3 = 24
            r2[r3] = r34
            r3 = 25
            r2[r3] = r35
            r3 = 26
            r2[r3] = r36
            r3 = 27
            r2[r3] = r37
            r3 = 28
            r2[r3] = r38
            r3 = 29
            r2[r3] = r39
            r3 = 30
            r2[r3] = r40
            r3 = 31
            r2[r3] = r41
            r3 = 32
            r2[r3] = r42
            r3 = 33
            r2[r3] = r43
            r3 = 34
            r2[r3] = r44
            r3 = 35
            r2[r3] = r45
            r3 = 36
            r2[r3] = r46
            r3 = 37
            r2[r3] = r47
            r3 = 38
            r2[r3] = r48
            r3 = 39
            r2[r3] = r49
            r3 = 40
            r2[r3] = r50
            r3 = 41
            r2[r3] = r51
            r3 = 42
            r2[r3] = r52
            r3 = 43
            r2[r3] = r53
            r3 = 44
            r2[r3] = r54
            r3 = 45
            r2[r3] = r55
            r3 = 46
            r2[r3] = r56
            r3 = 47
            r2[r3] = r57
            r3 = 48
            r2[r3] = r58
            r3 = 49
            r2[r3] = r59
            r3 = 50
            r2[r3] = r60
            r3 = 51
            r2[r3] = r61
            r3 = 52
            r2[r3] = r62
            r3 = 53
            r2[r3] = r63
            r3 = 54
            r2[r3] = r64
            r3 = 55
            r2[r3] = r65
            r3 = 56
            r2[r3] = r66
            r3 = 57
            r2[r3] = r67
            r3 = 58
            r2[r3] = r68
            r3 = 59
            r2[r3] = r69
            r3 = 60
            r2[r3] = r70
            r3 = 61
            r2[r3] = r71
            r3 = 62
            r2[r3] = r72
            r3 = 63
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2[r3] = r4
            r3 = 64
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2[r3] = r4
            r3 = 65
            r2[r3] = r7
            java.lang.Object r1 = r1.newInstance(r2)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.listing.ListingCard r1 = (com.etsy.android.lib.models.apiv3.listing.ListingCard) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingCardJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.listing.ListingCard");
    }

    public void toJson(C17412w wVar, ListingCard listingCard) {
        C19383o.m32797g(wVar, "writer");
        if (listingCard != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ACCEPTS_GIFT_CARD);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getAcceptsGiftCard());
            wVar.mo68529h("bestseller_v2_score");
            this.nullableFloatAdapter.toJson(wVar, listingCard.getBestsellerV2Score());
            wVar.mo68529h("can_be_waitlisted");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getCanBeWaitlisted());
            wVar.mo68529h(ResponseConstants.CONTENT_SOURCE);
            this.nullableStringAdapter.toJson(wVar, listingCard.getContentSource());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, listingCard.getCurrencyCode());
            wVar.mo68529h("currency_symbol");
            this.nullableStringAdapter.toJson(wVar, listingCard.getCurrencySymbol());
            wVar.mo68529h(ResponseConstants.DISCOUNT_DESCRIPTION);
            this.nullableFormattedMoneyAdapter.toJson(wVar, listingCard.getDiscountDescription());
            wVar.mo68529h("discount_description_unescaped");
            this.nullableStringAdapter.toJson(wVar, listingCard.getDiscountDescriptionUnescaped());
            wVar.mo68529h(ResponseConstants.DISCOUNTED_PRICE);
            this.nullableMoneyAdapter.toJson(wVar, listingCard.getDiscountedPrice());
            wVar.mo68529h("discounted_price_formatted_with_locale");
            this.nullableStringAdapter.toJson(wVar, listingCard.getDiscountedPriceFormattedWithLocale());
            wVar.mo68529h("for_pattern_consumption");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getForPatternConsumption());
            wVar.mo68529h("for_public_consumption");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getForPublicConsumption());
            wVar.mo68529h(ResponseConstants.FREE_SHIPPING_DATA);
            this.nullableFreeShippingDataAdapter.toJson(wVar, listingCard.getFreeShippingData());
            wVar.mo68529h(ResponseConstants.HAS_COLOR_VARIATIONS);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getHasColorVariations());
            wVar.mo68529h("has_manually_adjusted_thumbnail");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getHasManuallyAdjustedThumbnail());
            wVar.mo68529h(ResponseConstants.HAS_VARIATIONS);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.getHasVariations());
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.nullableStringAdapter.toJson(wVar, listingCard.getImage());
            wVar.mo68529h("image170");
            this.nullableStringAdapter.toJson(wVar, listingCard.getImage170());
            wVar.mo68529h(ResponseConstants.IMG);
            this.nullableListingImageAdapter.toJson(wVar, listingCard.getImg());
            wVar.mo68529h(ResponseConstants.IS_BESTSELLER);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isBestseller());
            wVar.mo68529h(ResponseConstants.IS_CUSTOMIZABLE);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isCustomizable());
            wVar.mo68529h(ResponseConstants.IS_DOWNLOAD);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isDownload());
            wVar.mo68529h("is_favorite");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isFavorite());
            wVar.mo68529h(ResponseConstants.IS_IN_CART);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isInCart());
            wVar.mo68529h(ResponseConstants.IS_IN_COLLECTIONS);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isInCollections());
            wVar.mo68529h("collections_count");
            this.nullableIntAdapter.toJson(wVar, listingCard.getCollectionsCount());
            wVar.mo68529h("is_in_merch_library");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isInMerchLibrary());
            wVar.mo68529h("is_listing_image_landscape");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isListingImageLandscape());
            wVar.mo68529h("is_machine_translated");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isMachineTranslated());
            wVar.mo68529h("is_pattern");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isPattern());
            wVar.mo68529h("is_retail");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isRetail());
            wVar.mo68529h(ResponseConstants.IS_SCARCE);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isScarce());
            wVar.mo68529h(ResponseConstants.IS_SOLD_OUT);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isSoldOut());
            wVar.mo68529h("is_top_rated");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isTopRated());
            wVar.mo68529h("is_unique");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isUnique());
            wVar.mo68529h(ResponseConstants.IS_VACATION);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isVacation());
            wVar.mo68529h("is_vintage");
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isVintage());
            wVar.mo68529h(EditableListing.FIELD_IS_WHOLESALE);
            this.nullableBooleanAdapter.toJson(wVar, listingCard.isWholesale());
            wVar.mo68529h("last_sale_date");
            this.nullableLongAdapter.toJson(wVar, listingCard.getLastSaleDate());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, listingCard.getListingId());
            wVar.mo68529h(ResponseConstants.SearchImpression.LOGGING_KEY);
            this.nullableStringAdapter.toJson(wVar, listingCard.getLoggingKey());
            wVar.mo68529h("display_loc");
            this.nullableStringAdapter.toJson(wVar, listingCard.getProlistDisplayLocation());
            wVar.mo68529h("max_processing_days");
            this.nullableIntAdapter.toJson(wVar, listingCard.getMaxProcessingDays());
            wVar.mo68529h("origin_country_id");
            this.nullableIntAdapter.toJson(wVar, listingCard.getOriginCountryId());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, listingCard.getPrice());
            wVar.mo68529h("price_formatted");
            this.nullableStringAdapter.toJson(wVar, listingCard.getPriceFormatted());
            wVar.mo68529h("price_formatted_with_locale");
            this.nullableStringAdapter.toJson(wVar, listingCard.getPriceFormattedWithLocale());
            wVar.mo68529h("price_int");
            this.nullableIntAdapter.toJson(wVar, listingCard.getPriceInt());
            wVar.mo68529h(ResponseConstants.PRICE_UNFORMATTED);
            this.nullableStringAdapter.toJson(wVar, listingCard.getPriceUnformatted());
            wVar.mo68529h(ResponseConstants.PROMOTION_DATA);
            this.nullableSellerMarketingPromotionDataAdapter.toJson(wVar, listingCard.getPromotionData());
            wVar.mo68529h(ResponseConstants.PROMOTIONS);
            this.nullableListOfSellerMarketingPromotionAdapter.toJson(wVar, listingCard.getPromotions());
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.nullableIntAdapter.toJson(wVar, listingCard.getQuantity());
            wVar.mo68529h(ResponseConstants.SHOP_AVERAGE_RATING);
            this.nullableStringAdapter.toJson(wVar, listingCard.getShopAverageRating());
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, listingCard.getShopId());
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, listingCard.getShopName());
            wVar.mo68529h(ResponseConstants.SHOP_TOTAL_RATING_COUNT);
            this.nullableStringAdapter.toJson(wVar, listingCard.getShopTotalRatingCount());
            wVar.mo68529h(ResponseConstants.SHOP_URL);
            this.nullableStringAdapter.toJson(wVar, listingCard.getShopUrl());
            wVar.mo68529h(ResponseConstants.SIGNAL_PECKING_ORDER);
            this.nullableListOfStringAdapter.toJson(wVar, listingCard.getSignalPeckingOrder());
            wVar.mo68529h("state");
            this.nullableIntAdapter.toJson(wVar, listingCard.getState());
            wVar.mo68529h("seller_taxonomy_id");
            this.nullableIntAdapter.toJson(wVar, listingCard.getSellerTaxonomyId());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, listingCard.getTitle());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, listingCard.getUrl());
            wVar.mo68529h("wholesale_url");
            this.nullableStringAdapter.toJson(wVar, listingCard.getWholesaleUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
