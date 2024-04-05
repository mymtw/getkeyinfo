package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Listing {
    public static final int $stable = 8;
    private final String alternateTranslationDescription;
    private final String alternateTranslationTitle;
    private final List<String> availableLanguages;
    private final String canonicalUrl;
    private final String categoryName;
    private final List<String> categoryTags;
    private final long createDate;
    private final String currencyCode;
    private final String currencySymbol;
    private final String description;
    private final String displayLanguage;
    private final int favorites;
    private final int featuredRank;
    private final boolean hasVariationPricing;
    private final List<ImageKey> imageKeys;
    private final List<String> images;
    private final boolean isActive;
    private final boolean isActiveForWholesale;
    private final boolean isAvailable;
    private final boolean isBestseller;
    private final boolean isCopyable;
    private final boolean isCustomizable;
    private final boolean isDeletable;
    private final boolean isDeleted;
    private final boolean isDigital;
    private final boolean isEditable;
    private final boolean isFeatured;
    private final boolean isFrozen;
    private final boolean isLockedForBulkEdit;
    private final boolean isMadeToOrder;
    private final boolean isOnVacation;
    private final boolean isPattern;
    private final boolean isPrivate;
    private final boolean isRenewable;
    private final boolean isReserved;
    private final boolean isReservedListing;
    private final boolean isRetail;
    private final boolean isSoldOut;
    private final boolean isWholesale;
    private final boolean isWholesaleOnly;
    private final String languageToUse;
    private final long listingId;
    private final List<String> materials;
    private final Money moneyPrice;
    private final boolean nonTaxable;
    private final List<String> paymentMethods;
    private final String price;
    private final Integer priceInt;
    private final Integer priceUsd;
    private final Integer quantity;
    private final Long sectionId;
    private final String sectionName;
    private final String sellerAvatar;
    private final String shipsFromCountry;
    private final Long shopId;
    private final String shopName;
    private final String state;
    private final List<String> tags;
    private final TaxonomyNode taxonomyNode;
    private final String title;
    private final long updateDate;
    private final String url;
    private final long userId;
    private final int views;
    private final String whenMade;

    public Listing(@C17402n(name = "alternate_translation_description") String str, @C17402n(name = "alternate_translation_title") String str2, @C17402n(name = "available_languages") List<String> list, @C17402n(name = "canonical_url") String str3, @C17402n(name = "category_name") String str4, @C17402n(name = "category_tags") List<String> list2, @C17402n(name = "create_date") long j, @C17402n(name = "currency_code") String str5, @C17402n(name = "currency_symbol") String str6, @C17402n(name = "description") String str7, @C17402n(name = "display_language") String str8, @C17402n(name = "favorites") int i, @C17402n(name = "featured_rank") int i2, @C17402n(name = "has_variation_pricing") boolean z, @C17402n(name = "image_keys") List<ImageKey> list3, @C17402n(name = "images") List<String> list4, @C17402n(name = "is_active") boolean z2, @C17402n(name = "is_active_for_wholesale") boolean z3, @C17402n(name = "is_available") boolean z4, @C17402n(name = "is_bestseller") boolean z5, @C17402n(name = "is_copyable") boolean z6, @C17402n(name = "is_customizable") boolean z7, @C17402n(name = "is_deletable") boolean z8, @C17402n(name = "is_deleted") boolean z9, @C17402n(name = "is_digital") boolean z10, @C17402n(name = "is_editable") boolean z11, @C17402n(name = "is_featured") boolean z12, @C17402n(name = "is_frozen") boolean z13, @C17402n(name = "is_locked_for_bulk_edit") boolean z14, @C17402n(name = "is_made_to_order") boolean z15, @C17402n(name = "is_on_vacation") boolean z16, @C17402n(name = "is_pattern") boolean z17, @C17402n(name = "is_private") boolean z18, @C17402n(name = "is_renewable") boolean z19, @C17402n(name = "is_reserved") boolean z20, @C17402n(name = "is_reserved_listing") boolean z21, @C17402n(name = "is_retail") boolean z22, @C17402n(name = "is_sold_out") boolean z23, @C17402n(name = "is_wholesale") boolean z24, @C17402n(name = "is_wholesale_only") boolean z25, @C17402n(name = "language_to_use") String str9, @C17402n(name = "listing_id") long j2, @C17402n(name = "materials") List<String> list5, @C17402n(name = "money_price") Money money, @C17402n(name = "non_taxable") boolean z26, @C17402n(name = "payment_methods") List<String> list6, @C17402n(name = "price") String str10, @C17402n(name = "price_int") Integer num, @C17402n(name = "price_usd") Integer num2, @C17402n(name = "quantity") Integer num3, @C17402n(name = "section_id") Long l, @C17402n(name = "section_name") String str11, @C17402n(name = "seller_avatar") String str12, @C17402n(name = "ships_from_country") String str13, @C17402n(name = "shop_id") Long l2, @C17402n(name = "shop_name") String str14, @C17402n(name = "state") String str15, @C17402n(name = "tags") List<String> list7, @C17402n(name = "taxonomy_node") TaxonomyNode taxonomyNode2, @C17402n(name = "title") String str16, @C17402n(name = "update_date") long j3, @C17402n(name = "url") String str17, @C17402n(name = "user_id") long j4, @C17402n(name = "views") int i3, @C17402n(name = "when_made") String str18) {
        this.alternateTranslationDescription = str;
        this.alternateTranslationTitle = str2;
        this.availableLanguages = list;
        this.canonicalUrl = str3;
        this.categoryName = str4;
        this.categoryTags = list2;
        this.createDate = j;
        this.currencyCode = str5;
        this.currencySymbol = str6;
        this.description = str7;
        this.displayLanguage = str8;
        this.favorites = i;
        this.featuredRank = i2;
        this.hasVariationPricing = z;
        this.imageKeys = list3;
        this.images = list4;
        this.isActive = z2;
        this.isActiveForWholesale = z3;
        this.isAvailable = z4;
        this.isBestseller = z5;
        this.isCopyable = z6;
        this.isCustomizable = z7;
        this.isDeletable = z8;
        this.isDeleted = z9;
        this.isDigital = z10;
        this.isEditable = z11;
        this.isFeatured = z12;
        this.isFrozen = z13;
        this.isLockedForBulkEdit = z14;
        this.isMadeToOrder = z15;
        this.isOnVacation = z16;
        this.isPattern = z17;
        this.isPrivate = z18;
        this.isRenewable = z19;
        this.isReserved = z20;
        this.isReservedListing = z21;
        this.isRetail = z22;
        this.isSoldOut = z23;
        this.isWholesale = z24;
        this.isWholesaleOnly = z25;
        this.languageToUse = str9;
        this.listingId = j2;
        this.materials = list5;
        this.moneyPrice = money;
        this.nonTaxable = z26;
        this.paymentMethods = list6;
        this.price = str10;
        this.priceInt = num;
        this.priceUsd = num2;
        this.quantity = num3;
        this.sectionId = l;
        this.sectionName = str11;
        this.sellerAvatar = str12;
        this.shipsFromCountry = str13;
        this.shopId = l2;
        this.shopName = str14;
        this.state = str15;
        this.tags = list7;
        this.taxonomyNode = taxonomyNode2;
        this.title = str16;
        this.updateDate = j3;
        this.url = str17;
        this.userId = j4;
        this.views = i3;
        this.whenMade = str18;
    }

    public static /* synthetic */ Listing copy$default(Listing listing, String str, String str2, List list, String str3, String str4, List list2, long j, String str5, String str6, String str7, String str8, int i, int i2, boolean z, List list3, List list4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, String str9, long j2, List list5, Money money, boolean z26, List list6, String str10, Integer num, Integer num2, Integer num3, Long l, String str11, String str12, String str13, Long l2, String str14, String str15, List list7, TaxonomyNode taxonomyNode2, String str16, long j3, String str17, long j4, int i3, String str18, int i4, int i5, int i6, Object obj) {
        Listing listing2 = listing;
        int i7 = i4;
        int i8 = i5;
        String str19 = (i7 & 1) != 0 ? listing2.alternateTranslationDescription : str;
        String str20 = (i7 & 2) != 0 ? listing2.alternateTranslationTitle : str2;
        List list8 = (i7 & 4) != 0 ? listing2.availableLanguages : list;
        String str21 = (i7 & 8) != 0 ? listing2.canonicalUrl : str3;
        String str22 = (i7 & 16) != 0 ? listing2.categoryName : str4;
        List list9 = (i7 & 32) != 0 ? listing2.categoryTags : list2;
        long j5 = (i7 & 64) != 0 ? listing2.createDate : j;
        String str23 = (i7 & 128) != 0 ? listing2.currencyCode : str5;
        String str24 = (i7 & 256) != 0 ? listing2.currencySymbol : str6;
        String str25 = (i7 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listing2.description : str7;
        String str26 = (i7 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listing2.displayLanguage : str8;
        int i9 = (i7 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listing2.favorites : i;
        int i10 = (i7 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listing2.featuredRank : i2;
        boolean z27 = (i7 & 8192) != 0 ? listing2.hasVariationPricing : z;
        List list10 = (i7 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listing2.imageKeys : list3;
        List list11 = (i7 & 32768) != 0 ? listing2.images : list4;
        boolean z28 = (i7 & 65536) != 0 ? listing2.isActive : z2;
        boolean z29 = (i7 & 131072) != 0 ? listing2.isActiveForWholesale : z3;
        boolean z30 = (i7 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? listing2.isAvailable : z4;
        boolean z31 = (i7 & 524288) != 0 ? listing2.isBestseller : z5;
        boolean z32 = (i7 & 1048576) != 0 ? listing2.isCopyable : z6;
        boolean z33 = (i7 & 2097152) != 0 ? listing2.isCustomizable : z7;
        boolean z34 = (i7 & 4194304) != 0 ? listing2.isDeletable : z8;
        boolean z35 = (i7 & 8388608) != 0 ? listing2.isDeleted : z9;
        boolean z36 = (i7 & 16777216) != 0 ? listing2.isDigital : z10;
        boolean z37 = (i7 & 33554432) != 0 ? listing2.isEditable : z11;
        boolean z38 = (i7 & 67108864) != 0 ? listing2.isFeatured : z12;
        boolean z39 = (i7 & 134217728) != 0 ? listing2.isFrozen : z13;
        boolean z40 = (i7 & 268435456) != 0 ? listing2.isLockedForBulkEdit : z14;
        boolean z41 = (i7 & 536870912) != 0 ? listing2.isMadeToOrder : z15;
        boolean z42 = (i7 & 1073741824) != 0 ? listing2.isOnVacation : z16;
        return listing.copy(str19, str20, list8, str21, str22, list9, j5, str23, str24, str25, str26, i9, i10, z27, list10, list11, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39, z40, z41, z42, (i7 & Integer.MIN_VALUE) != 0 ? listing2.isPattern : z17, (i8 & 1) != 0 ? listing2.isPrivate : z18, (i8 & 2) != 0 ? listing2.isRenewable : z19, (i8 & 4) != 0 ? listing2.isReserved : z20, (i8 & 8) != 0 ? listing2.isReservedListing : z21, (i8 & 16) != 0 ? listing2.isRetail : z22, (i8 & 32) != 0 ? listing2.isSoldOut : z23, (i8 & 64) != 0 ? listing2.isWholesale : z24, (i8 & 128) != 0 ? listing2.isWholesaleOnly : z25, (i8 & 256) != 0 ? listing2.languageToUse : str9, (i8 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listing2.listingId : j2, (i8 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listing2.materials : list5, (i8 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listing2.moneyPrice : money, (i8 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listing2.nonTaxable : z26, (i8 & 8192) != 0 ? listing2.paymentMethods : list6, (i8 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listing2.price : str10, (i8 & 32768) != 0 ? listing2.priceInt : num, (i8 & 65536) != 0 ? listing2.priceUsd : num2, (i8 & 131072) != 0 ? listing2.quantity : num3, (i8 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? listing2.sectionId : l, (i8 & 524288) != 0 ? listing2.sectionName : str11, (i8 & 1048576) != 0 ? listing2.sellerAvatar : str12, (i8 & 2097152) != 0 ? listing2.shipsFromCountry : str13, (i8 & 4194304) != 0 ? listing2.shopId : l2, (i8 & 8388608) != 0 ? listing2.shopName : str14, (i8 & 16777216) != 0 ? listing2.state : str15, (i8 & 33554432) != 0 ? listing2.tags : list7, (i8 & 67108864) != 0 ? listing2.taxonomyNode : taxonomyNode2, (i8 & 134217728) != 0 ? listing2.title : str16, (i8 & 268435456) != 0 ? listing2.updateDate : j3, (i8 & 536870912) != 0 ? listing2.url : str17, (1073741824 & i8) != 0 ? listing2.userId : j4, (i8 & Integer.MIN_VALUE) != 0 ? listing2.views : i3, (i6 & 1) != 0 ? listing2.whenMade : str18);
    }

    public final boolean canAddToCart() {
        return !this.isSoldOut && !C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.EXPIRED_STATE) && !C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.UNAVAILABLE_STATE) && !C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.REMOVED_STATE) && !C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.VACATION_STATE) && !C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.INACTIVE_STATE) && !C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.EDIT_STATE) && !(C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.CLOSED_STATE) || C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.CLOSED_STATE_M));
    }

    public final String component1() {
        return this.alternateTranslationDescription;
    }

    public final String component10() {
        return this.description;
    }

    public final String component11() {
        return this.displayLanguage;
    }

    public final int component12() {
        return this.favorites;
    }

    public final int component13() {
        return this.featuredRank;
    }

    public final boolean component14() {
        return this.hasVariationPricing;
    }

    public final List<ImageKey> component15() {
        return this.imageKeys;
    }

    public final List<String> component16() {
        return this.images;
    }

    public final boolean component17() {
        return this.isActive;
    }

    public final boolean component18() {
        return this.isActiveForWholesale;
    }

    public final boolean component19() {
        return this.isAvailable;
    }

    public final String component2() {
        return this.alternateTranslationTitle;
    }

    public final boolean component20() {
        return this.isBestseller;
    }

    public final boolean component21() {
        return this.isCopyable;
    }

    public final boolean component22() {
        return this.isCustomizable;
    }

    public final boolean component23() {
        return this.isDeletable;
    }

    public final boolean component24() {
        return this.isDeleted;
    }

    public final boolean component25() {
        return this.isDigital;
    }

    public final boolean component26() {
        return this.isEditable;
    }

    public final boolean component27() {
        return this.isFeatured;
    }

    public final boolean component28() {
        return this.isFrozen;
    }

    public final boolean component29() {
        return this.isLockedForBulkEdit;
    }

    public final List<String> component3() {
        return this.availableLanguages;
    }

    public final boolean component30() {
        return this.isMadeToOrder;
    }

    public final boolean component31() {
        return this.isOnVacation;
    }

    public final boolean component32() {
        return this.isPattern;
    }

    public final boolean component33() {
        return this.isPrivate;
    }

    public final boolean component34() {
        return this.isRenewable;
    }

    public final boolean component35() {
        return this.isReserved;
    }

    public final boolean component36() {
        return this.isReservedListing;
    }

    public final boolean component37() {
        return this.isRetail;
    }

    public final boolean component38() {
        return this.isSoldOut;
    }

    public final boolean component39() {
        return this.isWholesale;
    }

    public final String component4() {
        return this.canonicalUrl;
    }

    public final boolean component40() {
        return this.isWholesaleOnly;
    }

    public final String component41() {
        return this.languageToUse;
    }

    public final long component42() {
        return this.listingId;
    }

    public final List<String> component43() {
        return this.materials;
    }

    public final Money component44() {
        return this.moneyPrice;
    }

    public final boolean component45() {
        return this.nonTaxable;
    }

    public final List<String> component46() {
        return this.paymentMethods;
    }

    public final String component47() {
        return this.price;
    }

    public final Integer component48() {
        return this.priceInt;
    }

    public final Integer component49() {
        return this.priceUsd;
    }

    public final String component5() {
        return this.categoryName;
    }

    public final Integer component50() {
        return this.quantity;
    }

    public final Long component51() {
        return this.sectionId;
    }

    public final String component52() {
        return this.sectionName;
    }

    public final String component53() {
        return this.sellerAvatar;
    }

    public final String component54() {
        return this.shipsFromCountry;
    }

    public final Long component55() {
        return this.shopId;
    }

    public final String component56() {
        return this.shopName;
    }

    public final String component57() {
        return this.state;
    }

    public final List<String> component58() {
        return this.tags;
    }

    public final TaxonomyNode component59() {
        return this.taxonomyNode;
    }

    public final List<String> component6() {
        return this.categoryTags;
    }

    public final String component60() {
        return this.title;
    }

    public final long component61() {
        return this.updateDate;
    }

    public final String component62() {
        return this.url;
    }

    public final long component63() {
        return this.userId;
    }

    public final int component64() {
        return this.views;
    }

    public final String component65() {
        return this.whenMade;
    }

    public final long component7() {
        return this.createDate;
    }

    public final String component8() {
        return this.currencyCode;
    }

    public final String component9() {
        return this.currencySymbol;
    }

    public final Listing copy(@C17402n(name = "alternate_translation_description") String str, @C17402n(name = "alternate_translation_title") String str2, @C17402n(name = "available_languages") List<String> list, @C17402n(name = "canonical_url") String str3, @C17402n(name = "category_name") String str4, @C17402n(name = "category_tags") List<String> list2, @C17402n(name = "create_date") long j, @C17402n(name = "currency_code") String str5, @C17402n(name = "currency_symbol") String str6, @C17402n(name = "description") String str7, @C17402n(name = "display_language") String str8, @C17402n(name = "favorites") int i, @C17402n(name = "featured_rank") int i2, @C17402n(name = "has_variation_pricing") boolean z, @C17402n(name = "image_keys") List<ImageKey> list3, @C17402n(name = "images") List<String> list4, @C17402n(name = "is_active") boolean z2, @C17402n(name = "is_active_for_wholesale") boolean z3, @C17402n(name = "is_available") boolean z4, @C17402n(name = "is_bestseller") boolean z5, @C17402n(name = "is_copyable") boolean z6, @C17402n(name = "is_customizable") boolean z7, @C17402n(name = "is_deletable") boolean z8, @C17402n(name = "is_deleted") boolean z9, @C17402n(name = "is_digital") boolean z10, @C17402n(name = "is_editable") boolean z11, @C17402n(name = "is_featured") boolean z12, @C17402n(name = "is_frozen") boolean z13, @C17402n(name = "is_locked_for_bulk_edit") boolean z14, @C17402n(name = "is_made_to_order") boolean z15, @C17402n(name = "is_on_vacation") boolean z16, @C17402n(name = "is_pattern") boolean z17, @C17402n(name = "is_private") boolean z18, @C17402n(name = "is_renewable") boolean z19, @C17402n(name = "is_reserved") boolean z20, @C17402n(name = "is_reserved_listing") boolean z21, @C17402n(name = "is_retail") boolean z22, @C17402n(name = "is_sold_out") boolean z23, @C17402n(name = "is_wholesale") boolean z24, @C17402n(name = "is_wholesale_only") boolean z25, @C17402n(name = "language_to_use") String str9, @C17402n(name = "listing_id") long j2, @C17402n(name = "materials") List<String> list5, @C17402n(name = "money_price") Money money, @C17402n(name = "non_taxable") boolean z26, @C17402n(name = "payment_methods") List<String> list6, @C17402n(name = "price") String str10, @C17402n(name = "price_int") Integer num, @C17402n(name = "price_usd") Integer num2, @C17402n(name = "quantity") Integer num3, @C17402n(name = "section_id") Long l, @C17402n(name = "section_name") String str11, @C17402n(name = "seller_avatar") String str12, @C17402n(name = "ships_from_country") String str13, @C17402n(name = "shop_id") Long l2, @C17402n(name = "shop_name") String str14, @C17402n(name = "state") String str15, @C17402n(name = "tags") List<String> list7, @C17402n(name = "taxonomy_node") TaxonomyNode taxonomyNode2, @C17402n(name = "title") String str16, @C17402n(name = "update_date") long j3, @C17402n(name = "url") String str17, @C17402n(name = "user_id") long j4, @C17402n(name = "views") int i3, @C17402n(name = "when_made") String str18) {
        return new Listing(str, str2, list, str3, str4, list2, j, str5, str6, str7, str8, i, i2, z, list3, list4, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, str9, j2, list5, money, z26, list6, str10, num, num2, num3, l, str11, str12, str13, l2, str14, str15, list7, taxonomyNode2, str16, j3, str17, j4, i3, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) obj;
        return C19383o.m32792b(this.alternateTranslationDescription, listing.alternateTranslationDescription) && C19383o.m32792b(this.alternateTranslationTitle, listing.alternateTranslationTitle) && C19383o.m32792b(this.availableLanguages, listing.availableLanguages) && C19383o.m32792b(this.canonicalUrl, listing.canonicalUrl) && C19383o.m32792b(this.categoryName, listing.categoryName) && C19383o.m32792b(this.categoryTags, listing.categoryTags) && this.createDate == listing.createDate && C19383o.m32792b(this.currencyCode, listing.currencyCode) && C19383o.m32792b(this.currencySymbol, listing.currencySymbol) && C19383o.m32792b(this.description, listing.description) && C19383o.m32792b(this.displayLanguage, listing.displayLanguage) && this.favorites == listing.favorites && this.featuredRank == listing.featuredRank && this.hasVariationPricing == listing.hasVariationPricing && C19383o.m32792b(this.imageKeys, listing.imageKeys) && C19383o.m32792b(this.images, listing.images) && this.isActive == listing.isActive && this.isActiveForWholesale == listing.isActiveForWholesale && this.isAvailable == listing.isAvailable && this.isBestseller == listing.isBestseller && this.isCopyable == listing.isCopyable && this.isCustomizable == listing.isCustomizable && this.isDeletable == listing.isDeletable && this.isDeleted == listing.isDeleted && this.isDigital == listing.isDigital && this.isEditable == listing.isEditable && this.isFeatured == listing.isFeatured && this.isFrozen == listing.isFrozen && this.isLockedForBulkEdit == listing.isLockedForBulkEdit && this.isMadeToOrder == listing.isMadeToOrder && this.isOnVacation == listing.isOnVacation && this.isPattern == listing.isPattern && this.isPrivate == listing.isPrivate && this.isRenewable == listing.isRenewable && this.isReserved == listing.isReserved && this.isReservedListing == listing.isReservedListing && this.isRetail == listing.isRetail && this.isSoldOut == listing.isSoldOut && this.isWholesale == listing.isWholesale && this.isWholesaleOnly == listing.isWholesaleOnly && C19383o.m32792b(this.languageToUse, listing.languageToUse) && this.listingId == listing.listingId && C19383o.m32792b(this.materials, listing.materials) && C19383o.m32792b(this.moneyPrice, listing.moneyPrice) && this.nonTaxable == listing.nonTaxable && C19383o.m32792b(this.paymentMethods, listing.paymentMethods) && C19383o.m32792b(this.price, listing.price) && C19383o.m32792b(this.priceInt, listing.priceInt) && C19383o.m32792b(this.priceUsd, listing.priceUsd) && C19383o.m32792b(this.quantity, listing.quantity) && C19383o.m32792b(this.sectionId, listing.sectionId) && C19383o.m32792b(this.sectionName, listing.sectionName) && C19383o.m32792b(this.sellerAvatar, listing.sellerAvatar) && C19383o.m32792b(this.shipsFromCountry, listing.shipsFromCountry) && C19383o.m32792b(this.shopId, listing.shopId) && C19383o.m32792b(this.shopName, listing.shopName) && C19383o.m32792b(this.state, listing.state) && C19383o.m32792b(this.tags, listing.tags) && C19383o.m32792b(this.taxonomyNode, listing.taxonomyNode) && C19383o.m32792b(this.title, listing.title) && this.updateDate == listing.updateDate && C19383o.m32792b(this.url, listing.url) && this.userId == listing.userId && this.views == listing.views && C19383o.m32792b(this.whenMade, listing.whenMade);
    }

    public final String getAlternateTranslationDescription() {
        return this.alternateTranslationDescription;
    }

    public final String getAlternateTranslationTitle() {
        return this.alternateTranslationTitle;
    }

    public final List<String> getAvailableLanguages() {
        return this.availableLanguages;
    }

    public final String getCanonicalUrl() {
        return this.canonicalUrl;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<String> getCategoryTags() {
        return this.categoryTags;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayLanguage() {
        return this.displayLanguage;
    }

    public final int getFavorites() {
        return this.favorites;
    }

    public final int getFeaturedRank() {
        return this.featuredRank;
    }

    public final boolean getHasVariationPricing() {
        return this.hasVariationPricing;
    }

    public final List<ImageKey> getImageKeys() {
        return this.imageKeys;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final String getLanguageToUse() {
        return this.languageToUse;
    }

    public final long getListingId() {
        return this.listingId;
    }

    public final List<String> getMaterials() {
        return this.materials;
    }

    public final Money getMoneyPrice() {
        return this.moneyPrice;
    }

    public final boolean getNonTaxable() {
        return this.nonTaxable;
    }

    public final List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getPrice() {
        return this.price;
    }

    public final Integer getPriceInt() {
        return this.priceInt;
    }

    public final Integer getPriceUsd() {
        return this.priceUsd;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Long getSectionId() {
        return this.sectionId;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public final String getSellerAvatar() {
        return this.sellerAvatar;
    }

    public final String getShipsFromCountry() {
        return this.shipsFromCountry;
    }

    public final Long getShopId() {
        return this.shopId;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final String getState() {
        return this.state;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final TaxonomyNode getTaxonomyNode() {
        return this.taxonomyNode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getViews() {
        return this.views;
    }

    public final String getWhenMade() {
        return this.whenMade;
    }

    public int hashCode() {
        String str = this.alternateTranslationDescription;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alternateTranslationTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.availableLanguages;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.canonicalUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list2 = this.categoryTags;
        int b = C0071c.m190b(this.createDate, (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        String str5 = this.currencyCode;
        int hashCode6 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currencySymbol;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayLanguage;
        int a = C0069a.m170a(this.featuredRank, C0069a.m170a(this.favorites, (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31);
        boolean z = this.hasVariationPricing;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (a + (z ? 1 : 0)) * 31;
        List<ImageKey> list3 = this.imageKeys;
        int hashCode9 = (i2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.images;
        int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        boolean z3 = this.isActive;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode10 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isActiveForWholesale;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isAvailable;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.isBestseller;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.isCopyable;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.isCustomizable;
        if (z8) {
            z8 = true;
        }
        int i8 = (i7 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.isDeletable;
        if (z9) {
            z9 = true;
        }
        int i9 = (i8 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.isDeleted;
        if (z10) {
            z10 = true;
        }
        int i10 = (i9 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.isDigital;
        if (z11) {
            z11 = true;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.isEditable;
        if (z12) {
            z12 = true;
        }
        int i12 = (i11 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.isFeatured;
        if (z13) {
            z13 = true;
        }
        int i13 = (i12 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.isFrozen;
        if (z14) {
            z14 = true;
        }
        int i14 = (i13 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.isLockedForBulkEdit;
        if (z15) {
            z15 = true;
        }
        int i15 = (i14 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.isMadeToOrder;
        if (z16) {
            z16 = true;
        }
        int i16 = (i15 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.isOnVacation;
        if (z17) {
            z17 = true;
        }
        int i17 = (i16 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.isPattern;
        if (z18) {
            z18 = true;
        }
        int i18 = (i17 + (z18 ? 1 : 0)) * 31;
        boolean z19 = this.isPrivate;
        if (z19) {
            z19 = true;
        }
        int i19 = (i18 + (z19 ? 1 : 0)) * 31;
        boolean z20 = this.isRenewable;
        if (z20) {
            z20 = true;
        }
        int i20 = (i19 + (z20 ? 1 : 0)) * 31;
        boolean z21 = this.isReserved;
        if (z21) {
            z21 = true;
        }
        int i21 = (i20 + (z21 ? 1 : 0)) * 31;
        boolean z22 = this.isReservedListing;
        if (z22) {
            z22 = true;
        }
        int i22 = (i21 + (z22 ? 1 : 0)) * 31;
        boolean z23 = this.isRetail;
        if (z23) {
            z23 = true;
        }
        int i23 = (i22 + (z23 ? 1 : 0)) * 31;
        boolean z24 = this.isSoldOut;
        if (z24) {
            z24 = true;
        }
        int i24 = (i23 + (z24 ? 1 : 0)) * 31;
        boolean z25 = this.isWholesale;
        if (z25) {
            z25 = true;
        }
        int i25 = (i24 + (z25 ? 1 : 0)) * 31;
        boolean z26 = this.isWholesaleOnly;
        if (z26) {
            z26 = true;
        }
        int i26 = (i25 + (z26 ? 1 : 0)) * 31;
        String str9 = this.languageToUse;
        int b2 = C0071c.m190b(this.listingId, (i26 + (str9 == null ? 0 : str9.hashCode())) * 31, 31);
        List<String> list5 = this.materials;
        int hashCode11 = (b2 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Money money = this.moneyPrice;
        int hashCode12 = (hashCode11 + (money == null ? 0 : money.hashCode())) * 31;
        boolean z27 = this.nonTaxable;
        if (!z27) {
            z2 = z27;
        }
        int i27 = (hashCode12 + (z2 ? 1 : 0)) * 31;
        List<String> list6 = this.paymentMethods;
        int hashCode13 = (i27 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str10 = this.price;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.priceInt;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.priceUsd;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.quantity;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.sectionId;
        int hashCode18 = (hashCode17 + (l == null ? 0 : l.hashCode())) * 31;
        String str11 = this.sectionName;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sellerAvatar;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.shipsFromCountry;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l2 = this.shopId;
        int hashCode22 = (hashCode21 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str14 = this.shopName;
        int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.state;
        int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<String> list7 = this.tags;
        int hashCode25 = (hashCode24 + (list7 == null ? 0 : list7.hashCode())) * 31;
        TaxonomyNode taxonomyNode2 = this.taxonomyNode;
        int hashCode26 = (hashCode25 + (taxonomyNode2 == null ? 0 : taxonomyNode2.hashCode())) * 31;
        String str16 = this.title;
        int b3 = C0071c.m190b(this.updateDate, (hashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31, 31);
        String str17 = this.url;
        int a2 = C0069a.m170a(this.views, C0071c.m190b(this.userId, (b3 + (str17 == null ? 0 : str17.hashCode())) * 31, 31), 31);
        String str18 = this.whenMade;
        if (str18 != null) {
            i = str18.hashCode();
        }
        return a2 + i;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isActiveForWholesale() {
        return this.isActiveForWholesale;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isBestseller() {
        return this.isBestseller;
    }

    public final boolean isCopyable() {
        return this.isCopyable;
    }

    public final boolean isCustomizable() {
        return this.isCustomizable;
    }

    public final boolean isDeletable() {
        return this.isDeletable;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isDigital() {
        return this.isDigital;
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final boolean isFeatured() {
        return this.isFeatured;
    }

    public final boolean isFrozen() {
        return this.isFrozen;
    }

    public final boolean isLockedForBulkEdit() {
        return this.isLockedForBulkEdit;
    }

    public final boolean isMadeToOrder() {
        return this.isMadeToOrder;
    }

    public final boolean isOnVacation() {
        return this.isOnVacation;
    }

    public final boolean isPattern() {
        return this.isPattern;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isRenewable() {
        return this.isRenewable;
    }

    public final boolean isReserved() {
        return this.isReserved;
    }

    public final boolean isReservedListing() {
        return this.isReservedListing;
    }

    public final boolean isRetail() {
        return this.isRetail;
    }

    public final boolean isSoldOut() {
        return this.isSoldOut;
    }

    public final boolean isVisible() {
        return C19383o.m32792b(this.state, "active") || C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.VACATION_STATE) || C19383o.m32792b(this.state, com.etsy.android.lib.models.Listing.SOLD_OUT_STATE);
    }

    public final boolean isWholesale() {
        return this.isWholesale;
    }

    public final boolean isWholesaleOnly() {
        return this.isWholesaleOnly;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Listing(alternateTranslationDescription=");
        h.append(this.alternateTranslationDescription);
        h.append(", alternateTranslationTitle=");
        h.append(this.alternateTranslationTitle);
        h.append(", availableLanguages=");
        h.append(this.availableLanguages);
        h.append(", canonicalUrl=");
        h.append(this.canonicalUrl);
        h.append(", categoryName=");
        h.append(this.categoryName);
        h.append(", categoryTags=");
        h.append(this.categoryTags);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", currencySymbol=");
        h.append(this.currencySymbol);
        h.append(", description=");
        h.append(this.description);
        h.append(", displayLanguage=");
        h.append(this.displayLanguage);
        h.append(", favorites=");
        h.append(this.favorites);
        h.append(", featuredRank=");
        h.append(this.featuredRank);
        h.append(", hasVariationPricing=");
        h.append(this.hasVariationPricing);
        h.append(", imageKeys=");
        h.append(this.imageKeys);
        h.append(", images=");
        h.append(this.images);
        h.append(", isActive=");
        h.append(this.isActive);
        h.append(", isActiveForWholesale=");
        h.append(this.isActiveForWholesale);
        h.append(", isAvailable=");
        h.append(this.isAvailable);
        h.append(", isBestseller=");
        h.append(this.isBestseller);
        h.append(", isCopyable=");
        h.append(this.isCopyable);
        h.append(", isCustomizable=");
        h.append(this.isCustomizable);
        h.append(", isDeletable=");
        h.append(this.isDeletable);
        h.append(", isDeleted=");
        h.append(this.isDeleted);
        h.append(", isDigital=");
        h.append(this.isDigital);
        h.append(", isEditable=");
        h.append(this.isEditable);
        h.append(", isFeatured=");
        h.append(this.isFeatured);
        h.append(", isFrozen=");
        h.append(this.isFrozen);
        h.append(", isLockedForBulkEdit=");
        h.append(this.isLockedForBulkEdit);
        h.append(", isMadeToOrder=");
        h.append(this.isMadeToOrder);
        h.append(", isOnVacation=");
        h.append(this.isOnVacation);
        h.append(", isPattern=");
        h.append(this.isPattern);
        h.append(", isPrivate=");
        h.append(this.isPrivate);
        h.append(", isRenewable=");
        h.append(this.isRenewable);
        h.append(", isReserved=");
        h.append(this.isReserved);
        h.append(", isReservedListing=");
        h.append(this.isReservedListing);
        h.append(", isRetail=");
        h.append(this.isRetail);
        h.append(", isSoldOut=");
        h.append(this.isSoldOut);
        h.append(", isWholesale=");
        h.append(this.isWholesale);
        h.append(", isWholesaleOnly=");
        h.append(this.isWholesaleOnly);
        h.append(", languageToUse=");
        h.append(this.languageToUse);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", materials=");
        h.append(this.materials);
        h.append(", moneyPrice=");
        h.append(this.moneyPrice);
        h.append(", nonTaxable=");
        h.append(this.nonTaxable);
        h.append(", paymentMethods=");
        h.append(this.paymentMethods);
        h.append(", price=");
        h.append(this.price);
        h.append(", priceInt=");
        h.append(this.priceInt);
        h.append(", priceUsd=");
        h.append(this.priceUsd);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", sectionId=");
        h.append(this.sectionId);
        h.append(", sectionName=");
        h.append(this.sectionName);
        h.append(", sellerAvatar=");
        h.append(this.sellerAvatar);
        h.append(", shipsFromCountry=");
        h.append(this.shipsFromCountry);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", shopName=");
        h.append(this.shopName);
        h.append(", state=");
        h.append(this.state);
        h.append(", tags=");
        h.append(this.tags);
        h.append(", taxonomyNode=");
        h.append(this.taxonomyNode);
        h.append(", title=");
        h.append(this.title);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", url=");
        h.append(this.url);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", views=");
        h.append(this.views);
        h.append(", whenMade=");
        return C0391c.m1057c(h, this.whenMade, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Listing(java.lang.String r75, java.lang.String r76, java.util.List r77, java.lang.String r78, java.lang.String r79, java.util.List r80, long r81, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, int r87, int r88, boolean r89, java.util.List r90, java.util.List r91, boolean r92, boolean r93, boolean r94, boolean r95, boolean r96, boolean r97, boolean r98, boolean r99, boolean r100, boolean r101, boolean r102, boolean r103, boolean r104, boolean r105, boolean r106, boolean r107, boolean r108, boolean r109, boolean r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, java.lang.String r116, long r117, java.util.List r119, com.etsy.android.lib.models.apiv3.listing.Money r120, boolean r121, java.util.List r122, java.lang.String r123, java.lang.Integer r124, java.lang.Integer r125, java.lang.Integer r126, java.lang.Long r127, java.lang.String r128, java.lang.String r129, java.lang.String r130, java.lang.Long r131, java.lang.String r132, java.lang.String r133, java.util.List r134, com.etsy.android.lib.models.apiv3.listing.TaxonomyNode r135, java.lang.String r136, long r137, java.lang.String r139, long r140, int r142, java.lang.String r143, int r144, int r145, int r146, kotlin.jvm.internal.DefaultConstructorMarker r147) {
        /*
            r74 = this;
            r0 = r144
            r1 = r145
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r5 = 0
            goto L_0x000c
        L_0x000a:
            r5 = r75
        L_0x000c:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0012
            r6 = 0
            goto L_0x0014
        L_0x0012:
            r6 = r76
        L_0x0014:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001a
            r7 = 0
            goto L_0x001c
        L_0x001a:
            r7 = r77
        L_0x001c:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0022
            r8 = 0
            goto L_0x0024
        L_0x0022:
            r8 = r78
        L_0x0024:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x002a
            r9 = 0
            goto L_0x002c
        L_0x002a:
            r9 = r79
        L_0x002c:
            r2 = r0 & 32
            if (r2 == 0) goto L_0x0032
            r10 = 0
            goto L_0x0034
        L_0x0032:
            r10 = r80
        L_0x0034:
            r2 = r0 & 64
            if (r2 == 0) goto L_0x003b
            r13 = 0
            goto L_0x003d
        L_0x003b:
            r13 = r81
        L_0x003d:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0043
            r2 = 0
            goto L_0x0045
        L_0x0043:
            r2 = r83
        L_0x0045:
            r4 = r0 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x004b
            r15 = 0
            goto L_0x004d
        L_0x004b:
            r15 = r84
        L_0x004d:
            r4 = r0 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0054
            r16 = 0
            goto L_0x0056
        L_0x0054:
            r16 = r85
        L_0x0056:
            r4 = r0 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x005d
            r17 = 0
            goto L_0x005f
        L_0x005d:
            r17 = r86
        L_0x005f:
            r4 = r0 & 2048(0x800, float:2.87E-42)
            r18 = 0
            if (r4 == 0) goto L_0x0068
            r19 = r18
            goto L_0x006a
        L_0x0068:
            r19 = r87
        L_0x006a:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0071
            r20 = r18
            goto L_0x0073
        L_0x0071:
            r20 = r88
        L_0x0073:
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x007a
            r21 = r18
            goto L_0x007c
        L_0x007a:
            r21 = r89
        L_0x007c:
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0083
            r22 = 0
            goto L_0x0085
        L_0x0083:
            r22 = r90
        L_0x0085:
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x008e
            r23 = 0
            goto L_0x0090
        L_0x008e:
            r23 = r91
        L_0x0090:
            r4 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0098
            r24 = r18
            goto L_0x009a
        L_0x0098:
            r24 = r92
        L_0x009a:
            r4 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00a2
            r25 = r18
            goto L_0x00a4
        L_0x00a2:
            r25 = r93
        L_0x00a4:
            r4 = 262144(0x40000, float:3.67342E-40)
            r26 = r0 & r4
            if (r26 == 0) goto L_0x00ad
            r26 = r18
            goto L_0x00af
        L_0x00ad:
            r26 = r94
        L_0x00af:
            r27 = 524288(0x80000, float:7.34684E-40)
            r28 = r0 & r27
            if (r28 == 0) goto L_0x00b8
            r28 = r18
            goto L_0x00ba
        L_0x00b8:
            r28 = r95
        L_0x00ba:
            r29 = 1048576(0x100000, float:1.469368E-39)
            r30 = r0 & r29
            if (r30 == 0) goto L_0x00c3
            r30 = r18
            goto L_0x00c5
        L_0x00c3:
            r30 = r96
        L_0x00c5:
            r31 = 2097152(0x200000, float:2.938736E-39)
            r32 = r0 & r31
            if (r32 == 0) goto L_0x00ce
            r32 = r18
            goto L_0x00d0
        L_0x00ce:
            r32 = r97
        L_0x00d0:
            r33 = 4194304(0x400000, float:5.877472E-39)
            r34 = r0 & r33
            if (r34 == 0) goto L_0x00d9
            r34 = r18
            goto L_0x00db
        L_0x00d9:
            r34 = r98
        L_0x00db:
            r35 = 8388608(0x800000, float:1.17549435E-38)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x00e4
            r35 = r18
            goto L_0x00e6
        L_0x00e4:
            r35 = r99
        L_0x00e6:
            r36 = 16777216(0x1000000, float:2.3509887E-38)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x00ef
            r36 = r18
            goto L_0x00f1
        L_0x00ef:
            r36 = r100
        L_0x00f1:
            r37 = 33554432(0x2000000, float:9.403955E-38)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x00fa
            r37 = r18
            goto L_0x00fc
        L_0x00fa:
            r37 = r101
        L_0x00fc:
            r38 = 67108864(0x4000000, float:1.5046328E-36)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x0105
            r38 = r18
            goto L_0x0107
        L_0x0105:
            r38 = r102
        L_0x0107:
            r39 = 134217728(0x8000000, float:3.85186E-34)
            r39 = r0 & r39
            if (r39 == 0) goto L_0x0110
            r39 = r18
            goto L_0x0112
        L_0x0110:
            r39 = r103
        L_0x0112:
            r40 = 268435456(0x10000000, float:2.5243549E-29)
            r40 = r0 & r40
            if (r40 == 0) goto L_0x011b
            r40 = r18
            goto L_0x011d
        L_0x011b:
            r40 = r104
        L_0x011d:
            r41 = 536870912(0x20000000, float:1.0842022E-19)
            r41 = r0 & r41
            if (r41 == 0) goto L_0x0126
            r41 = r18
            goto L_0x0128
        L_0x0126:
            r41 = r105
        L_0x0128:
            r42 = 1073741824(0x40000000, float:2.0)
            r42 = r0 & r42
            if (r42 == 0) goto L_0x0131
            r42 = r18
            goto L_0x0133
        L_0x0131:
            r42 = r106
        L_0x0133:
            r43 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r43
            if (r0 == 0) goto L_0x013c
            r0 = r18
            goto L_0x013e
        L_0x013c:
            r0 = r107
        L_0x013e:
            r43 = r1 & 1
            if (r43 == 0) goto L_0x0145
            r43 = r18
            goto L_0x0147
        L_0x0145:
            r43 = r108
        L_0x0147:
            r44 = r1 & 2
            if (r44 == 0) goto L_0x014e
            r44 = r18
            goto L_0x0150
        L_0x014e:
            r44 = r109
        L_0x0150:
            r45 = r1 & 4
            if (r45 == 0) goto L_0x0157
            r45 = r18
            goto L_0x0159
        L_0x0157:
            r45 = r110
        L_0x0159:
            r46 = r1 & 8
            if (r46 == 0) goto L_0x0160
            r46 = r18
            goto L_0x0162
        L_0x0160:
            r46 = r111
        L_0x0162:
            r47 = r1 & 16
            if (r47 == 0) goto L_0x0169
            r47 = r18
            goto L_0x016b
        L_0x0169:
            r47 = r112
        L_0x016b:
            r48 = r1 & 32
            if (r48 == 0) goto L_0x0172
            r48 = r18
            goto L_0x0174
        L_0x0172:
            r48 = r113
        L_0x0174:
            r49 = r1 & 64
            if (r49 == 0) goto L_0x017b
            r49 = r18
            goto L_0x017d
        L_0x017b:
            r49 = r114
        L_0x017d:
            r3 = r1 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0184
            r3 = r18
            goto L_0x0186
        L_0x0184:
            r3 = r115
        L_0x0186:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x018d
            r50 = 0
            goto L_0x018f
        L_0x018d:
            r50 = r116
        L_0x018f:
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0196
            r51 = 0
            goto L_0x0198
        L_0x0196:
            r51 = r119
        L_0x0198:
            r11 = r1 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x019f
            r52 = 0
            goto L_0x01a1
        L_0x019f:
            r52 = r120
        L_0x01a1:
            r11 = r1 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x01a8
            r53 = r18
            goto L_0x01aa
        L_0x01a8:
            r53 = r121
        L_0x01aa:
            r11 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01b1
            r54 = 0
            goto L_0x01b3
        L_0x01b1:
            r54 = r122
        L_0x01b3:
            r11 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01ba
            r55 = 0
            goto L_0x01bc
        L_0x01ba:
            r55 = r123
        L_0x01bc:
            r4 = r4 & r1
            if (r4 == 0) goto L_0x01c2
            r57 = 0
            goto L_0x01c4
        L_0x01c2:
            r57 = r127
        L_0x01c4:
            r4 = r1 & r27
            if (r4 == 0) goto L_0x01cb
            r58 = 0
            goto L_0x01cd
        L_0x01cb:
            r58 = r128
        L_0x01cd:
            r4 = r1 & r29
            if (r4 == 0) goto L_0x01d4
            r59 = 0
            goto L_0x01d6
        L_0x01d4:
            r59 = r129
        L_0x01d6:
            r4 = r1 & r31
            if (r4 == 0) goto L_0x01dd
            r60 = 0
            goto L_0x01df
        L_0x01dd:
            r60 = r130
        L_0x01df:
            r4 = r1 & r33
            if (r4 == 0) goto L_0x01e6
            r61 = 0
            goto L_0x01e8
        L_0x01e6:
            r61 = r131
        L_0x01e8:
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x01f0
            r62 = 0
            goto L_0x01f2
        L_0x01f0:
            r62 = r132
        L_0x01f2:
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x01fa
            r63 = 0
            goto L_0x01fc
        L_0x01fa:
            r63 = r133
        L_0x01fc:
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0204
            r64 = 0
            goto L_0x0206
        L_0x0204:
            r64 = r134
        L_0x0206:
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x020e
            r65 = 0
            goto L_0x0210
        L_0x020e:
            r65 = r135
        L_0x0210:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0218
            r67 = 0
            goto L_0x021a
        L_0x0218:
            r67 = r137
        L_0x021a:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0222
            r69 = 0
            goto L_0x0224
        L_0x0222:
            r69 = r139
        L_0x0224:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x022c
            r72 = r18
            goto L_0x022e
        L_0x022c:
            r72 = r142
        L_0x022e:
            r1 = r146 & 1
            if (r1 == 0) goto L_0x0235
            r73 = 0
            goto L_0x0237
        L_0x0235:
            r73 = r143
        L_0x0237:
            r4 = r74
            r11 = r13
            r13 = r2
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r28
            r26 = r30
            r27 = r32
            r28 = r34
            r29 = r35
            r30 = r36
            r31 = r37
            r32 = r38
            r33 = r39
            r34 = r40
            r35 = r41
            r36 = r42
            r37 = r0
            r38 = r43
            r39 = r44
            r40 = r45
            r41 = r46
            r42 = r47
            r43 = r48
            r44 = r49
            r45 = r3
            r46 = r50
            r47 = r117
            r49 = r51
            r50 = r52
            r51 = r53
            r52 = r54
            r53 = r55
            r54 = r124
            r55 = r125
            r56 = r126
            r66 = r136
            r70 = r140
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r69, r70, r72, r73)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Listing.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.util.List, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, long, java.util.List, com.etsy.android.lib.models.apiv3.listing.Money, boolean, java.util.List, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.util.List, com.etsy.android.lib.models.apiv3.listing.TaxonomyNode, java.lang.String, long, java.lang.String, long, int, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
