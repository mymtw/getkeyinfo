package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
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

public final class ListingJsonAdapter extends JsonAdapter<Listing> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Listing> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ImageKey>> nullableListOfImageKeyAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TaxonomyNode> nullableTaxonomyNodeAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("alternate_translation_description", "alternate_translation_title", "available_languages", "canonical_url", "category_name", "category_tags", ResponseConstants.CREATE_DATE, ResponseConstants.CURRENCY_CODE, "currency_symbol", "description", "display_language", Collection.TYPE_FAVORITES, EditableListing.FIELD_FEATURED_RANK, EditableListing.FIELD_HAS_VARIATION_PRICING, "image_keys", "images", "is_active", "is_active_for_wholesale", "is_available", ResponseConstants.IS_BESTSELLER, "is_copyable", ResponseConstants.IS_CUSTOMIZABLE, "is_deletable", ResponseConstants.IS_DELETED, "is_digital", "is_editable", "is_featured", "is_frozen", "is_locked_for_bulk_edit", "is_made_to_order", "is_on_vacation", "is_pattern", ResponseConstants.IS_PRIVATE, "is_renewable", ResponseConstants.IS_RESERVED, "is_reserved_listing", "is_retail", ResponseConstants.IS_SOLD_OUT, EditableListing.FIELD_IS_WHOLESALE, ResponseConstants.IS_WHOLESALE_ONLY, "language_to_use", "listing_id", EditableListing.FIELD_MATERIALS, "money_price", ResponseConstants.NON_TAXABLE, ResponseConstants.PAYMENT_METHODS, ResponseConstants.PRICE, "price_int", "price_usd", ResponseConstants.QUANTITY, "section_id", "section_name", ResponseConstants.SELLER_AVATAR, "ships_from_country", "shop_id", ResponseConstants.SHOP_NAME, "state", EditableListing.FIELD_TAGS, "taxonomy_node", "title", ResponseConstants.UPDATE_DATE, "url", "user_id", ResponseConstants.VIEWS, EditableListing.FIELD_WHEN_MADE);

    public ListingJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "alternateTranslationDescription");
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "availableLanguages");
        this.longAdapter = yVar2.mo68558c(Long.TYPE, emptySet, "createDate");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, Collection.TYPE_FAVORITES);
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "hasVariationPricing");
        this.nullableListOfImageKeyAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ImageKey.class), emptySet, "imageKeys");
        this.nullableMoneyAdapter = yVar2.mo68558c(Money.class, emptySet, "moneyPrice");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "priceInt");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "sectionId");
        this.nullableTaxonomyNodeAdapter = yVar2.mo68558c(TaxonomyNode.class, emptySet, "taxonomyNode");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Listing)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04c7, code lost:
        r9 = r9 & r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05c2, code lost:
        r14 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05c4, code lost:
        r3 = r52;
        r10 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05c8, code lost:
        r6 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05ca, code lost:
        r15 = r57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01b5, code lost:
        r5 = r5 & r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.listing.Listing fromJson(com.squareup.moshi.JsonReader r110) {
        /*
            r109 = this;
            r0 = r109
            r1 = r110
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r110.mo68410b()
            r8 = -1
            r38 = r2
            r10 = r6
            r11 = r7
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
            r2 = r8
            r5 = r2
            r9 = r5
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r55 = 0
            r56 = 0
            r81 = 0
            r84 = 0
            r85 = 0
            r87 = 0
            r88 = 0
            r89 = 0
            r90 = 0
            r91 = 0
            r92 = 0
            r93 = 0
            r94 = 0
            r95 = 0
            r96 = 0
            r97 = 0
            r98 = 0
            r99 = 0
            r100 = 0
            r101 = 0
            r104 = 0
            r108 = 0
            r7 = r10
            r8 = r7
            r6 = r4
        L_0x009a:
            boolean r47 = r110.mo68414f()
            r52 = r3
            java.lang.String r3 = "user_id"
            r53 = r10
            java.lang.String r10 = "userId"
            r54 = r6
            java.lang.String r6 = "listing_id"
            r57 = r15
            java.lang.String r15 = "listingId"
            if (r47 == 0) goto L_0x05ce
            r47 = r14
            com.squareup.moshi.JsonReader$b r14 = r0.options
            int r14 = r1.mo68406Q(r14)
            switch(r14) {
                case -1: goto L_0x05bc;
                case 0: goto L_0x05af;
                case 1: goto L_0x05a2;
                case 2: goto L_0x0595;
                case 3: goto L_0x0588;
                case 4: goto L_0x057b;
                case 5: goto L_0x056e;
                case 6: goto L_0x0557;
                case 7: goto L_0x054a;
                case 8: goto L_0x053c;
                case 9: goto L_0x052e;
                case 10: goto L_0x0520;
                case 11: goto L_0x0508;
                case 12: goto L_0x04f0;
                case 13: goto L_0x04d8;
                case 14: goto L_0x04ca;
                case 15: goto L_0x04ba;
                case 16: goto L_0x04a2;
                case 17: goto L_0x048a;
                case 18: goto L_0x0470;
                case 19: goto L_0x044e;
                case 20: goto L_0x0434;
                case 21: goto L_0x041a;
                case 22: goto L_0x0400;
                case 23: goto L_0x03e6;
                case 24: goto L_0x03cc;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0398;
                case 27: goto L_0x037e;
                case 28: goto L_0x0364;
                case 29: goto L_0x034a;
                case 30: goto L_0x0330;
                case 31: goto L_0x0316;
                case 32: goto L_0x02fd;
                case 33: goto L_0x02e4;
                case 34: goto L_0x02cb;
                case 35: goto L_0x02b2;
                case 36: goto L_0x0299;
                case 37: goto L_0x0280;
                case 38: goto L_0x0267;
                case 39: goto L_0x024e;
                case 40: goto L_0x0240;
                case 41: goto L_0x022d;
                case 42: goto L_0x021f;
                case 43: goto L_0x0211;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01ea;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01d0;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01b8;
                case 50: goto L_0x01a8;
                case 51: goto L_0x019a;
                case 52: goto L_0x018c;
                case 53: goto L_0x017e;
                case 54: goto L_0x0170;
                case 55: goto L_0x0162;
                case 56: goto L_0x0154;
                case 57: goto L_0x0146;
                case 58: goto L_0x0137;
                case 59: goto L_0x012b;
                case 60: goto L_0x010b;
                case 61: goto L_0x00fc;
                case 62: goto L_0x00e9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            goto L_0x05c2
        L_0x00bd:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r108 = r3
            java.lang.String r108 = (java.lang.String) r108
            r2 = r2 & -2
            goto L_0x05c2
        L_0x00cb:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.intAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r3
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x00e0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r5 = r5 & r3
            r14 = r47
            r3 = r52
            goto L_0x05c8
        L_0x00e0:
            java.lang.String r2 = "views"
            java.lang.String r3 = "views"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x00e9:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r6 = r0.longAdapter
            java.lang.Object r6 = r6.fromJson((com.squareup.moshi.JsonReader) r1)
            r46 = r6
            java.lang.Long r46 = (java.lang.Long) r46
            if (r46 == 0) goto L_0x00f7
            goto L_0x05c2
        L_0x00f7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r3, r1)
            throw r1
        L_0x00fc:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r104 = r3
            java.lang.String r104 = (java.lang.String) r104
            r3 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            goto L_0x01b5
        L_0x010b:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r3 = r0.longAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r3
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L_0x0122
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r5 = r5 & r3
            r14 = r47
            r3 = r52
            r10 = r53
            goto L_0x05ca
        L_0x0122:
            java.lang.String r2 = "updateDate"
            java.lang.String r3 = "update_date"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x012b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r101 = r3
            java.lang.String r101 = (java.lang.String) r101
            goto L_0x05c2
        L_0x0137:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.TaxonomyNode> r3 = r0.nullableTaxonomyNodeAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r100 = r3
            com.etsy.android.lib.models.apiv3.listing.TaxonomyNode r100 = (com.etsy.android.lib.models.apiv3.listing.TaxonomyNode) r100
            r3 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            goto L_0x01b5
        L_0x0146:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r3 = r0.nullableListOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r99 = r3
            java.util.List r99 = (java.util.List) r99
            r3 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            goto L_0x01b5
        L_0x0154:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r98 = r3
            java.lang.String r98 = (java.lang.String) r98
            r3 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            goto L_0x01b5
        L_0x0162:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r97 = r3
            java.lang.String r97 = (java.lang.String) r97
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x01b5
        L_0x0170:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r3 = r0.nullableLongAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r96 = r3
            java.lang.Long r96 = (java.lang.Long) r96
            r3 = -4194305(0xffffffffffbfffff, float:NaN)
            goto L_0x01b5
        L_0x017e:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r95 = r3
            java.lang.String r95 = (java.lang.String) r95
            r3 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L_0x01b5
        L_0x018c:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r94 = r3
            java.lang.String r94 = (java.lang.String) r94
            r3 = -1048577(0xffffffffffefffff, float:NaN)
            goto L_0x01b5
        L_0x019a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r93 = r3
            java.lang.String r93 = (java.lang.String) r93
            r3 = -524289(0xfffffffffff7ffff, float:NaN)
            goto L_0x01b5
        L_0x01a8:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r3 = r0.nullableLongAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r92 = r3
            java.lang.Long r92 = (java.lang.Long) r92
            r3 = -262145(0xfffffffffffbffff, float:NaN)
        L_0x01b5:
            r5 = r5 & r3
            goto L_0x05c2
        L_0x01b8:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r91 = r3
            java.lang.Integer r91 = (java.lang.Integer) r91
            goto L_0x05c2
        L_0x01c4:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r90 = r3
            java.lang.Integer r90 = (java.lang.Integer) r90
            goto L_0x05c2
        L_0x01d0:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r89 = r3
            java.lang.Integer r89 = (java.lang.Integer) r89
            goto L_0x05c2
        L_0x01dc:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r88 = r3
            java.lang.String r88 = (java.lang.String) r88
            r5 = r5 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x05c2
        L_0x01ea:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r3 = r0.nullableListOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r87 = r3
            java.util.List r87 = (java.util.List) r87
            r5 = r5 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x05c2
        L_0x01f8:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r36 = r3
            java.lang.Boolean r36 = (java.lang.Boolean) r36
            if (r36 == 0) goto L_0x0208
            r5 = r5 & -4097(0xffffffffffffefff, float:NaN)
            goto L_0x05c2
        L_0x0208:
            java.lang.String r2 = "nonTaxable"
            java.lang.String r3 = "non_taxable"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0211:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.Money> r3 = r0.nullableMoneyAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r85 = r3
            com.etsy.android.lib.models.apiv3.listing.Money r85 = (com.etsy.android.lib.models.apiv3.listing.Money) r85
            r5 = r5 & -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x05c2
        L_0x021f:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r3 = r0.nullableListOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r84 = r3
            java.util.List r84 = (java.util.List) r84
            r5 = r5 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x05c2
        L_0x022d:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r3 = r0.longAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r39 = r3
            java.lang.Long r39 = (java.lang.Long) r39
            if (r39 == 0) goto L_0x023b
            goto L_0x05c2
        L_0x023b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r6, r1)
            throw r1
        L_0x0240:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r81 = r3
            java.lang.String r81 = (java.lang.String) r81
            r5 = r5 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x05c2
        L_0x024e:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r35 = r3
            java.lang.Boolean r35 = (java.lang.Boolean) r35
            if (r35 == 0) goto L_0x025e
            r5 = r5 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x05c2
        L_0x025e:
            java.lang.String r2 = "isWholesaleOnly"
            java.lang.String r3 = "is_wholesale_only"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0267:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r34 = r3
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            if (r34 == 0) goto L_0x0277
            r5 = r5 & -65
            goto L_0x05c2
        L_0x0277:
            java.lang.String r2 = "isWholesale"
            java.lang.String r3 = "is_wholesale"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0280:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r33 = r3
            java.lang.Boolean r33 = (java.lang.Boolean) r33
            if (r33 == 0) goto L_0x0290
            r5 = r5 & -33
            goto L_0x05c2
        L_0x0290:
            java.lang.String r2 = "isSoldOut"
            java.lang.String r3 = "is_sold_out"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0299:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r32 = r3
            java.lang.Boolean r32 = (java.lang.Boolean) r32
            if (r32 == 0) goto L_0x02a9
            r5 = r5 & -17
            goto L_0x05c2
        L_0x02a9:
            java.lang.String r2 = "isRetail"
            java.lang.String r3 = "is_retail"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x02b2:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r31 = r3
            java.lang.Boolean r31 = (java.lang.Boolean) r31
            if (r31 == 0) goto L_0x02c2
            r5 = r5 & -9
            goto L_0x05c2
        L_0x02c2:
            java.lang.String r2 = "isReservedListing"
            java.lang.String r3 = "is_reserved_listing"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x02cb:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r30 = r3
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            if (r30 == 0) goto L_0x02db
            r5 = r5 & -5
            goto L_0x05c2
        L_0x02db:
            java.lang.String r2 = "isReserved"
            java.lang.String r3 = "is_reserved"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x02e4:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r29 = r3
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            if (r29 == 0) goto L_0x02f4
            r5 = r5 & -3
            goto L_0x05c2
        L_0x02f4:
            java.lang.String r2 = "isRenewable"
            java.lang.String r3 = "is_renewable"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x02fd:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r28 = r3
            java.lang.Boolean r28 = (java.lang.Boolean) r28
            if (r28 == 0) goto L_0x030d
            r5 = r5 & -2
            goto L_0x05c2
        L_0x030d:
            java.lang.String r2 = "isPrivate"
            java.lang.String r3 = "is_private"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0316:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r27 = r3
            java.lang.Boolean r27 = (java.lang.Boolean) r27
            if (r27 == 0) goto L_0x0327
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x04c7
        L_0x0327:
            java.lang.String r2 = "isPattern"
            java.lang.String r3 = "is_pattern"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0330:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r26 = r3
            java.lang.Boolean r26 = (java.lang.Boolean) r26
            if (r26 == 0) goto L_0x0341
            r3 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            goto L_0x04c7
        L_0x0341:
            java.lang.String r2 = "isOnVacation"
            java.lang.String r3 = "is_on_vacation"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x034a:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r25 = r3
            java.lang.Boolean r25 = (java.lang.Boolean) r25
            if (r25 == 0) goto L_0x035b
            r3 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            goto L_0x04c7
        L_0x035b:
            java.lang.String r2 = "isMadeToOrder"
            java.lang.String r3 = "is_made_to_order"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0364:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r24 = r3
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            if (r24 == 0) goto L_0x0375
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            goto L_0x04c7
        L_0x0375:
            java.lang.String r2 = "isLockedForBulkEdit"
            java.lang.String r3 = "is_locked_for_bulk_edit"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x037e:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r23 = r3
            java.lang.Boolean r23 = (java.lang.Boolean) r23
            if (r23 == 0) goto L_0x038f
            r3 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            goto L_0x04c7
        L_0x038f:
            java.lang.String r2 = "isFrozen"
            java.lang.String r3 = "is_frozen"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0398:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r22 = r3
            java.lang.Boolean r22 = (java.lang.Boolean) r22
            if (r22 == 0) goto L_0x03a9
            r3 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            goto L_0x04c7
        L_0x03a9:
            java.lang.String r2 = "isFeatured"
            java.lang.String r3 = "is_featured"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x03b2:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r21 = r3
            java.lang.Boolean r21 = (java.lang.Boolean) r21
            if (r21 == 0) goto L_0x03c3
            r3 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            goto L_0x04c7
        L_0x03c3:
            java.lang.String r2 = "isEditable"
            java.lang.String r3 = "is_editable"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x03cc:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r20 = r3
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            if (r20 == 0) goto L_0x03dd
            r3 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            goto L_0x04c7
        L_0x03dd:
            java.lang.String r2 = "isDigital"
            java.lang.String r3 = "is_digital"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x03e6:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r3
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            if (r19 == 0) goto L_0x03f7
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x04c7
        L_0x03f7:
            java.lang.String r2 = "isDeleted"
            java.lang.String r3 = "is_deleted"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0400:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r3
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            if (r18 == 0) goto L_0x0411
            r3 = -4194305(0xffffffffffbfffff, float:NaN)
            goto L_0x04c7
        L_0x0411:
            java.lang.String r2 = "isDeletable"
            java.lang.String r3 = "is_deletable"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x041a:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r3
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            if (r17 == 0) goto L_0x042b
            r3 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L_0x04c7
        L_0x042b:
            java.lang.String r2 = "isCustomizable"
            java.lang.String r3 = "is_customizable"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0434:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r3
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            if (r16 == 0) goto L_0x0445
            r3 = -1048577(0xffffffffffefffff, float:NaN)
            goto L_0x04c7
        L_0x0445:
            java.lang.String r2 = "isCopyable"
            java.lang.String r3 = "is_copyable"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x044e:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r3
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 == 0) goto L_0x0467
            r3 = -524289(0xfffffffffff7ffff, float:NaN)
            r9 = r9 & r3
            r14 = r47
            r3 = r52
            r10 = r53
            r6 = r54
            goto L_0x009a
        L_0x0467:
            java.lang.String r2 = "isBestseller"
            java.lang.String r3 = "is_bestseller"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0470:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r3
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            if (r14 == 0) goto L_0x0481
            r3 = -262145(0xfffffffffffbffff, float:NaN)
            r9 = r9 & r3
            goto L_0x05c4
        L_0x0481:
            java.lang.String r2 = "isAvailable"
            java.lang.String r3 = "is_available"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x048a:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r3
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x0499
            r3 = -131073(0xfffffffffffdffff, float:NaN)
            goto L_0x04c7
        L_0x0499:
            java.lang.String r2 = "isActiveForWholesale"
            java.lang.String r3 = "is_active_for_wholesale"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x04a2:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r3
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L_0x04b1
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            goto L_0x04c7
        L_0x04b1:
            java.lang.String r2 = "isActive"
            java.lang.String r3 = "is_active"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x04ba:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r3 = r0.nullableListOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r56 = r3
            java.util.List r56 = (java.util.List) r56
            r3 = -32769(0xffffffffffff7fff, float:NaN)
        L_0x04c7:
            r9 = r9 & r3
            goto L_0x05c2
        L_0x04ca:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.listing.ImageKey>> r3 = r0.nullableListOfImageKeyAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r55 = r3
            java.util.List r55 = (java.util.List) r55
            r9 = r9 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x05c2
        L_0x04d8:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r3 = r0.booleanAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r3
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L_0x04e7
            r9 = r9 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x05c2
        L_0x04e7:
            java.lang.String r2 = "hasVariationPricing"
            java.lang.String r3 = "has_variation_pricing"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x04f0:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.intAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x04ff
            r9 = r9 & -4097(0xffffffffffffefff, float:NaN)
            goto L_0x05c2
        L_0x04ff:
            java.lang.String r2 = "featuredRank"
            java.lang.String r3 = "featured_rank"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0508:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.intAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r3
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0517
            r9 = r9 & -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x05c2
        L_0x0517:
            java.lang.String r2 = "favorites"
            java.lang.String r3 = "favorites"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0520:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r51 = r3
            java.lang.String r51 = (java.lang.String) r51
            r9 = r9 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x05c2
        L_0x052e:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r50 = r3
            java.lang.String r50 = (java.lang.String) r50
            r9 = r9 & -513(0xfffffffffffffdff, float:NaN)
            goto L_0x05c2
        L_0x053c:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r49 = r3
            java.lang.String r49 = (java.lang.String) r49
            r9 = r9 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x05c2
        L_0x054a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r48 = r3
            java.lang.String r48 = (java.lang.String) r48
            r9 = r9 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x05c2
        L_0x0557:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r3 = r0.longAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r4 = r3
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0565
            r9 = r9 & -65
            goto L_0x05c2
        L_0x0565:
            java.lang.String r2 = "createDate"
            java.lang.String r3 = "create_date"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x056e:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r3 = r0.nullableListOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r45 = r3
            java.util.List r45 = (java.util.List) r45
            r9 = r9 & -33
            goto L_0x05c2
        L_0x057b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r44 = r3
            java.lang.String r44 = (java.lang.String) r44
            r9 = r9 & -17
            goto L_0x05c2
        L_0x0588:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r43 = r3
            java.lang.String r43 = (java.lang.String) r43
            r9 = r9 & -9
            goto L_0x05c2
        L_0x0595:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r3 = r0.nullableListOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r42 = r3
            java.util.List r42 = (java.util.List) r42
            r9 = r9 & -5
            goto L_0x05c2
        L_0x05a2:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r41 = r3
            java.lang.String r41 = (java.lang.String) r41
            r9 = r9 & -3
            goto L_0x05c2
        L_0x05af:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r40 = r3
            java.lang.String r40 = (java.lang.String) r40
            r9 = r9 & -2
            goto L_0x05c2
        L_0x05bc:
            r110.mo68408S()
            r110.mo68411c0()
        L_0x05c2:
            r14 = r47
        L_0x05c4:
            r3 = r52
            r10 = r53
        L_0x05c8:
            r6 = r54
        L_0x05ca:
            r15 = r57
            goto L_0x009a
        L_0x05ce:
            r47 = r14
            r110.mo68413e()
            if (r9 != 0) goto L_0x067f
            r14 = 1208189440(0x48038200, float:134664.0)
            if (r5 != r14) goto L_0x067f
            r14 = -2
            if (r2 != r14) goto L_0x067f
            com.etsy.android.lib.models.apiv3.listing.Listing r2 = new com.etsy.android.lib.models.apiv3.listing.Listing
            long r4 = r4.longValue()
            int r52 = r7.intValue()
            int r7 = r8.intValue()
            boolean r8 = r11.booleanValue()
            boolean r9 = r12.booleanValue()
            boolean r58 = r13.booleanValue()
            boolean r59 = r47.booleanValue()
            boolean r60 = r57.booleanValue()
            boolean r61 = r16.booleanValue()
            boolean r62 = r17.booleanValue()
            boolean r63 = r18.booleanValue()
            boolean r64 = r19.booleanValue()
            boolean r65 = r20.booleanValue()
            boolean r66 = r21.booleanValue()
            boolean r67 = r22.booleanValue()
            boolean r68 = r23.booleanValue()
            boolean r69 = r24.booleanValue()
            boolean r70 = r25.booleanValue()
            boolean r71 = r26.booleanValue()
            boolean r72 = r27.booleanValue()
            boolean r73 = r28.booleanValue()
            boolean r74 = r29.booleanValue()
            boolean r75 = r30.booleanValue()
            boolean r76 = r31.booleanValue()
            boolean r77 = r32.booleanValue()
            boolean r78 = r33.booleanValue()
            boolean r79 = r34.booleanValue()
            boolean r80 = r35.booleanValue()
            if (r39 == 0) goto L_0x067a
            long r82 = r39.longValue()
            boolean r86 = r36.booleanValue()
            long r102 = r54.longValue()
            if (r46 == 0) goto L_0x0675
            long r105 = r46.longValue()
            int r107 = r53.intValue()
            r39 = r2
            r46 = r4
            r53 = r7
            r54 = r8
            r57 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r104, r105, r107, r108)
            return r2
        L_0x0675:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r3, r1)
            throw r1
        L_0x067a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r6, r1)
            throw r1
        L_0x067f:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.listing.Listing> r14 = r0.constructorRef
            if (r14 != 0) goto L_0x07cb
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.Listing> r14 = com.etsy.android.lib.models.apiv3.listing.Listing.class
            r58 = r6
            r6 = 69
            java.lang.Class[] r6 = new java.lang.Class[r6]
            r37 = 0
            r6[r37] = r52
            r59 = 1
            r6[r59] = r52
            r59 = 2
            java.lang.Class<java.util.List> r60 = java.util.List.class
            r6[r59] = r60
            r59 = 3
            r6[r59] = r52
            r59 = 4
            r6[r59] = r52
            r59 = 5
            java.lang.Class<java.util.List> r60 = java.util.List.class
            r6[r59] = r60
            r59 = 6
            java.lang.Class r60 = java.lang.Long.TYPE
            r6[r59] = r60
            r59 = 7
            r6[r59] = r52
            r59 = 8
            r6[r59] = r52
            r59 = 9
            r6[r59] = r52
            r59 = 10
            r6[r59] = r52
            r59 = 11
            java.lang.Class r61 = java.lang.Integer.TYPE
            r6[r59] = r61
            r59 = 12
            r6[r59] = r61
            r59 = 13
            java.lang.Class r62 = java.lang.Boolean.TYPE
            r6[r59] = r62
            r59 = 14
            java.lang.Class<java.util.List> r63 = java.util.List.class
            r6[r59] = r63
            r59 = 15
            java.lang.Class<java.util.List> r63 = java.util.List.class
            r6[r59] = r63
            r59 = 16
            r6[r59] = r62
            r59 = 17
            r6[r59] = r62
            r59 = 18
            r6[r59] = r62
            r59 = 19
            r6[r59] = r62
            r59 = 20
            r6[r59] = r62
            r59 = 21
            r6[r59] = r62
            r59 = 22
            r6[r59] = r62
            r59 = 23
            r6[r59] = r62
            r59 = 24
            r6[r59] = r62
            r59 = 25
            r6[r59] = r62
            r59 = 26
            r6[r59] = r62
            r59 = 27
            r6[r59] = r62
            r59 = 28
            r6[r59] = r62
            r59 = 29
            r6[r59] = r62
            r59 = 30
            r6[r59] = r62
            r59 = 31
            r6[r59] = r62
            r59 = 32
            r6[r59] = r62
            r59 = 33
            r6[r59] = r62
            r59 = 34
            r6[r59] = r62
            r59 = 35
            r6[r59] = r62
            r59 = 36
            r6[r59] = r62
            r59 = 37
            r6[r59] = r62
            r59 = 38
            r6[r59] = r62
            r59 = 39
            r6[r59] = r62
            r59 = 40
            r6[r59] = r52
            r59 = 41
            r6[r59] = r60
            r59 = 42
            java.lang.Class<java.util.List> r63 = java.util.List.class
            r6[r59] = r63
            r59 = 43
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.Money> r63 = com.etsy.android.lib.models.apiv3.listing.Money.class
            r6[r59] = r63
            r59 = 44
            r6[r59] = r62
            r59 = 45
            java.lang.Class<java.util.List> r62 = java.util.List.class
            r6[r59] = r62
            r59 = 46
            r6[r59] = r52
            r59 = 47
            r6[r59] = r38
            r59 = 48
            r6[r59] = r38
            r59 = 49
            r6[r59] = r38
            r38 = 50
            java.lang.Class<java.lang.Long> r59 = java.lang.Long.class
            r6[r38] = r59
            r38 = 51
            r6[r38] = r52
            r38 = 52
            r6[r38] = r52
            r38 = 53
            r6[r38] = r52
            r38 = 54
            java.lang.Class<java.lang.Long> r59 = java.lang.Long.class
            r6[r38] = r59
            r38 = 55
            r6[r38] = r52
            r38 = 56
            r6[r38] = r52
            r38 = 57
            java.lang.Class<java.util.List> r59 = java.util.List.class
            r6[r38] = r59
            r38 = 58
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.TaxonomyNode> r59 = com.etsy.android.lib.models.apiv3.listing.TaxonomyNode.class
            r6[r38] = r59
            r38 = 59
            r6[r38] = r52
            r38 = 60
            r6[r38] = r60
            r38 = 61
            r6[r38] = r52
            r38 = 62
            r6[r38] = r60
            r38 = 63
            r6[r38] = r61
            r38 = 64
            r6[r38] = r52
            r38 = 65
            r6[r38] = r61
            r38 = 66
            r6[r38] = r61
            r38 = 67
            r6[r38] = r61
            r38 = 68
            java.lang.Class<?> r52 = p618lp.C18215a.f39928c
            r6[r38] = r52
            java.lang.reflect.Constructor r14 = r14.getDeclaredConstructor(r6)
            r0.constructorRef = r14
            kotlin.m r6 = kotlin.C19394m.f43287a
            java.lang.String r6 = "Listing::class.java.getD…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r14, r6)
            goto L_0x07cd
        L_0x07cb:
            r58 = r6
        L_0x07cd:
            r6 = 69
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r37 = 0
            r6[r37] = r40
            r37 = 1
            r6[r37] = r41
            r37 = 2
            r6[r37] = r42
            r37 = 3
            r6[r37] = r43
            r37 = 4
            r6[r37] = r44
            r37 = 5
            r6[r37] = r45
            r37 = 6
            r6[r37] = r4
            r4 = 7
            r6[r4] = r48
            r4 = 8
            r6[r4] = r49
            r4 = 9
            r6[r4] = r50
            r4 = 10
            r6[r4] = r51
            r4 = 11
            r6[r4] = r7
            r4 = 12
            r6[r4] = r8
            r4 = 13
            r6[r4] = r11
            r4 = 14
            r6[r4] = r55
            r4 = 15
            r6[r4] = r56
            r4 = 16
            r6[r4] = r12
            r4 = 17
            r6[r4] = r13
            r4 = 18
            r6[r4] = r47
            r4 = 19
            r6[r4] = r57
            r4 = 20
            r6[r4] = r16
            r4 = 21
            r6[r4] = r17
            r4 = 22
            r6[r4] = r18
            r4 = 23
            r6[r4] = r19
            r4 = 24
            r6[r4] = r20
            r4 = 25
            r6[r4] = r21
            r4 = 26
            r6[r4] = r22
            r4 = 27
            r6[r4] = r23
            r4 = 28
            r6[r4] = r24
            r4 = 29
            r6[r4] = r25
            r4 = 30
            r6[r4] = r26
            r4 = 31
            r6[r4] = r27
            r4 = 32
            r6[r4] = r28
            r4 = 33
            r6[r4] = r29
            r4 = 34
            r6[r4] = r30
            r4 = 35
            r6[r4] = r31
            r4 = 36
            r6[r4] = r32
            r4 = 37
            r6[r4] = r33
            r4 = 38
            r6[r4] = r34
            r4 = 39
            r6[r4] = r35
            r4 = 40
            r6[r4] = r81
            r4 = 41
            if (r39 == 0) goto L_0x0916
            long r7 = r39.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r4] = r7
            r4 = 42
            r6[r4] = r84
            r4 = 43
            r6[r4] = r85
            r4 = 44
            r6[r4] = r36
            r4 = 45
            r6[r4] = r87
            r4 = 46
            r6[r4] = r88
            r4 = 47
            r6[r4] = r89
            r4 = 48
            r6[r4] = r90
            r4 = 49
            r6[r4] = r91
            r4 = 50
            r6[r4] = r92
            r4 = 51
            r6[r4] = r93
            r4 = 52
            r6[r4] = r94
            r4 = 53
            r6[r4] = r95
            r4 = 54
            r6[r4] = r96
            r4 = 55
            r6[r4] = r97
            r4 = 56
            r6[r4] = r98
            r4 = 57
            r6[r4] = r99
            r4 = 58
            r6[r4] = r100
            r4 = 59
            r6[r4] = r101
            r4 = 60
            r6[r4] = r54
            r4 = 61
            r6[r4] = r104
            r4 = 62
            if (r46 == 0) goto L_0x0911
            long r7 = r46.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r6[r4] = r1
            r1 = 63
            r6[r1] = r53
            r1 = 64
            r6[r1] = r108
            r1 = 65
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r6[r1] = r3
            r1 = 66
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r6[r1] = r3
            r1 = 67
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r1] = r2
            r1 = 68
            r2 = 0
            r6[r1] = r2
            java.lang.Object r1 = r14.newInstance(r6)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.listing.Listing r1 = (com.etsy.android.lib.models.apiv3.listing.Listing) r1
            return r1
        L_0x0911:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r3, r1)
            throw r1
        L_0x0916:
            r2 = r58
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.listing.Listing");
    }

    public void toJson(C17412w wVar, Listing listing) {
        C19383o.m32797g(wVar, "writer");
        if (listing != null) {
            wVar.mo68522b();
            wVar.mo68529h("alternate_translation_description");
            this.nullableStringAdapter.toJson(wVar, listing.getAlternateTranslationDescription());
            wVar.mo68529h("alternate_translation_title");
            this.nullableStringAdapter.toJson(wVar, listing.getAlternateTranslationTitle());
            wVar.mo68529h("available_languages");
            this.nullableListOfStringAdapter.toJson(wVar, listing.getAvailableLanguages());
            wVar.mo68529h("canonical_url");
            this.nullableStringAdapter.toJson(wVar, listing.getCanonicalUrl());
            wVar.mo68529h("category_name");
            this.nullableStringAdapter.toJson(wVar, listing.getCategoryName());
            wVar.mo68529h("category_tags");
            this.nullableListOfStringAdapter.toJson(wVar, listing.getCategoryTags());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(listing.getCreateDate()));
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, listing.getCurrencyCode());
            wVar.mo68529h("currency_symbol");
            this.nullableStringAdapter.toJson(wVar, listing.getCurrencySymbol());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, listing.getDescription());
            wVar.mo68529h("display_language");
            this.nullableStringAdapter.toJson(wVar, listing.getDisplayLanguage());
            wVar.mo68529h(Collection.TYPE_FAVORITES);
            this.intAdapter.toJson(wVar, Integer.valueOf(listing.getFavorites()));
            wVar.mo68529h(EditableListing.FIELD_FEATURED_RANK);
            this.intAdapter.toJson(wVar, Integer.valueOf(listing.getFeaturedRank()));
            wVar.mo68529h(EditableListing.FIELD_HAS_VARIATION_PRICING);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.getHasVariationPricing()));
            wVar.mo68529h("image_keys");
            this.nullableListOfImageKeyAdapter.toJson(wVar, listing.getImageKeys());
            wVar.mo68529h("images");
            this.nullableListOfStringAdapter.toJson(wVar, listing.getImages());
            wVar.mo68529h("is_active");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isActive()));
            wVar.mo68529h("is_active_for_wholesale");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isActiveForWholesale()));
            wVar.mo68529h("is_available");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isAvailable()));
            wVar.mo68529h(ResponseConstants.IS_BESTSELLER);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isBestseller()));
            wVar.mo68529h("is_copyable");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isCopyable()));
            wVar.mo68529h(ResponseConstants.IS_CUSTOMIZABLE);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isCustomizable()));
            wVar.mo68529h("is_deletable");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isDeletable()));
            wVar.mo68529h(ResponseConstants.IS_DELETED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isDeleted()));
            wVar.mo68529h("is_digital");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isDigital()));
            wVar.mo68529h("is_editable");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isEditable()));
            wVar.mo68529h("is_featured");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isFeatured()));
            wVar.mo68529h("is_frozen");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isFrozen()));
            wVar.mo68529h("is_locked_for_bulk_edit");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isLockedForBulkEdit()));
            wVar.mo68529h("is_made_to_order");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isMadeToOrder()));
            wVar.mo68529h("is_on_vacation");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isOnVacation()));
            wVar.mo68529h("is_pattern");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isPattern()));
            wVar.mo68529h(ResponseConstants.IS_PRIVATE);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isPrivate()));
            wVar.mo68529h("is_renewable");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isRenewable()));
            wVar.mo68529h(ResponseConstants.IS_RESERVED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isReserved()));
            wVar.mo68529h("is_reserved_listing");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isReservedListing()));
            wVar.mo68529h("is_retail");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isRetail()));
            wVar.mo68529h(ResponseConstants.IS_SOLD_OUT);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isSoldOut()));
            wVar.mo68529h(EditableListing.FIELD_IS_WHOLESALE);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isWholesale()));
            wVar.mo68529h(ResponseConstants.IS_WHOLESALE_ONLY);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.isWholesaleOnly()));
            wVar.mo68529h("language_to_use");
            this.nullableStringAdapter.toJson(wVar, listing.getLanguageToUse());
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(listing.getListingId()));
            wVar.mo68529h(EditableListing.FIELD_MATERIALS);
            this.nullableListOfStringAdapter.toJson(wVar, listing.getMaterials());
            wVar.mo68529h("money_price");
            this.nullableMoneyAdapter.toJson(wVar, listing.getMoneyPrice());
            wVar.mo68529h(ResponseConstants.NON_TAXABLE);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(listing.getNonTaxable()));
            wVar.mo68529h(ResponseConstants.PAYMENT_METHODS);
            this.nullableListOfStringAdapter.toJson(wVar, listing.getPaymentMethods());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, listing.getPrice());
            wVar.mo68529h("price_int");
            this.nullableIntAdapter.toJson(wVar, listing.getPriceInt());
            wVar.mo68529h("price_usd");
            this.nullableIntAdapter.toJson(wVar, listing.getPriceUsd());
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.nullableIntAdapter.toJson(wVar, listing.getQuantity());
            wVar.mo68529h("section_id");
            this.nullableLongAdapter.toJson(wVar, listing.getSectionId());
            wVar.mo68529h("section_name");
            this.nullableStringAdapter.toJson(wVar, listing.getSectionName());
            wVar.mo68529h(ResponseConstants.SELLER_AVATAR);
            this.nullableStringAdapter.toJson(wVar, listing.getSellerAvatar());
            wVar.mo68529h("ships_from_country");
            this.nullableStringAdapter.toJson(wVar, listing.getShipsFromCountry());
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, listing.getShopId());
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, listing.getShopName());
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, listing.getState());
            wVar.mo68529h(EditableListing.FIELD_TAGS);
            this.nullableListOfStringAdapter.toJson(wVar, listing.getTags());
            wVar.mo68529h("taxonomy_node");
            this.nullableTaxonomyNodeAdapter.toJson(wVar, listing.getTaxonomyNode());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, listing.getTitle());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(listing.getUpdateDate()));
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, listing.getUrl());
            wVar.mo68529h("user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(listing.getUserId()));
            wVar.mo68529h(ResponseConstants.VIEWS);
            this.intAdapter.toJson(wVar, Integer.valueOf(listing.getViews()));
            wVar.mo68529h(EditableListing.FIELD_WHEN_MADE);
            this.nullableStringAdapter.toJson(wVar, listing.getWhenMade());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
