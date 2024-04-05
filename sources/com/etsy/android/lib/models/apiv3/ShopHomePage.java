package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8697k;
import com.etsy.android.lib.logger.C8699m;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.Manufacturer;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopAbout;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.p327ui.shop.C11200s0;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;

@C17403o(generateAdapter = true)
public final class ShopHomePage implements C8697k, Serializable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 142315733453543034L;
    private final CouponData couponData;
    private final List<FAQ> faqs;
    private final List<ListingCard> featuredListings;
    private final boolean includesTranslations;
    private final List<Manufacturer> manufacturers;
    private ShopHomeMemberData memberData;
    private final ShopListingLevelReturnPolicies returnPolicies;
    private final SellerDetails sellerDetails;
    private final ShopV3 shop;
    private final ShopAbout shopAbout;
    private final String shopListingSortOrder;
    private final List<ListingCard> shopListings;
    private final ShopPolicy shopPolicy;
    private final ShopReviewsResult shopReviews;
    private final List<ShopSection> shopSections;
    private final StructuredShopPolicies structuredShopPolicies;
    private C8699m trackingData;
    private final Boolean useListingLevelReturnPolicies;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ShopHomePage(@C17402n(name = "shop") ShopV3 shopV3, @C17402n(name = "featured_listings") List<? extends ListingCard> list, @C17402n(name = "sections") List<? extends ShopSection> list2, @C17402n(name = "listing_cards") List<? extends ListingCard> list3, @C17402n(name = "listing_sort_order") String str, @C17402n(name = "reviews") ShopReviewsResult shopReviewsResult, @C17402n(name = "shop_about") ShopAbout shopAbout2, @C17402n(name = "manufacturers") List<? extends Manufacturer> list4, @C17402n(name = "policies") ShopPolicy shopPolicy2, @C17402n(name = "structured_policies") StructuredShopPolicies structuredShopPolicies2, @C17402n(name = "faq") List<? extends FAQ> list5, @C17402n(name = "seller_details") SellerDetails sellerDetails2, @C17402n(name = "coupon_data") CouponData couponData2, @C17402n(name = "member_data") ShopHomeMemberData shopHomeMemberData, @C17402n(name = "use_listing_level_return_policies") Boolean bool, @C17402n(name = "return_policies") ShopListingLevelReturnPolicies shopListingLevelReturnPolicies, @C17402n(name = "includes_machine_translations") boolean z) {
        C19383o.m32797g(shopV3, ResponseConstants.SHOP);
        this.shop = shopV3;
        this.featuredListings = list;
        this.shopSections = list2;
        this.shopListings = list3;
        this.shopListingSortOrder = str;
        this.shopReviews = shopReviewsResult;
        this.shopAbout = shopAbout2;
        this.manufacturers = list4;
        this.shopPolicy = shopPolicy2;
        this.structuredShopPolicies = structuredShopPolicies2;
        this.faqs = list5;
        this.sellerDetails = sellerDetails2;
        this.couponData = couponData2;
        this.memberData = shopHomeMemberData;
        this.useListingLevelReturnPolicies = bool;
        this.returnPolicies = shopListingLevelReturnPolicies;
        this.includesTranslations = z;
        HashMap hashMap = new HashMap();
        ShopV3 shop2 = getShop();
        hashMap.put(PredefinedAnalyticsProperty.SHOP_ID, shop2.getShopId().getId());
        hashMap.put(PredefinedAnalyticsProperty.SHOP_USER_ID, shop2.getUserId().getId());
        if (getFeaturedListings() != null) {
            List<ListingCard> featuredListings2 = getFeaturedListings();
            if (!featuredListings2.isEmpty()) {
                hashMap.put(PredefinedAnalyticsProperty.FEATURED_LISTING_IDS, C11200s0.m19143a(featuredListings2));
            }
        }
        if (getShopListings() != null) {
            List<ListingCard> shopListings2 = getShopListings();
            if (!shopListings2.isEmpty()) {
                hashMap.put(PredefinedAnalyticsProperty.LISTING_IDS, C11200s0.m19143a(shopListings2));
            }
        }
        List<String> modules = shop2.getModules();
        hashMap.put(PredefinedAnalyticsProperty.MODULE_FEATURED_ITEMS_ENABLED, Boolean.valueOf(modules.contains(ShopV3.MODULE_FEATURED_ITEMS)));
        hashMap.put(PredefinedAnalyticsProperty.MODULE_ABOUT_ENABLED, Boolean.valueOf(modules.contains(ShopV3.MODULE_ABOUT)));
        hashMap.put(PredefinedAnalyticsProperty.PAGE_SOLD_ITEMS_ENABLED, Boolean.valueOf(modules.contains(ShopV3.PAGE_SOLD_ITEMS)));
        int brandingOption = shop2.getBrandingOption();
        hashMap.put(PredefinedAnalyticsProperty.BRANDING_TYPE, brandingOption != 1 ? brandingOption != 2 ? "new_no_branding" : "new_large_banner" : "new_small_banner");
        this.trackingData = new C8699m(hashMap, 14);
    }

    public static /* synthetic */ ShopHomePage copy$default(ShopHomePage shopHomePage, ShopV3 shopV3, List list, List list2, List list3, String str, ShopReviewsResult shopReviewsResult, ShopAbout shopAbout2, List list4, ShopPolicy shopPolicy2, StructuredShopPolicies structuredShopPolicies2, List list5, SellerDetails sellerDetails2, CouponData couponData2, ShopHomeMemberData shopHomeMemberData, Boolean bool, ShopListingLevelReturnPolicies shopListingLevelReturnPolicies, boolean z, int i, Object obj) {
        ShopHomePage shopHomePage2 = shopHomePage;
        int i2 = i;
        return shopHomePage.copy((i2 & 1) != 0 ? shopHomePage2.shop : shopV3, (i2 & 2) != 0 ? shopHomePage2.featuredListings : list, (i2 & 4) != 0 ? shopHomePage2.shopSections : list2, (i2 & 8) != 0 ? shopHomePage2.shopListings : list3, (i2 & 16) != 0 ? shopHomePage2.shopListingSortOrder : str, (i2 & 32) != 0 ? shopHomePage2.shopReviews : shopReviewsResult, (i2 & 64) != 0 ? shopHomePage2.shopAbout : shopAbout2, (i2 & 128) != 0 ? shopHomePage2.manufacturers : list4, (i2 & 256) != 0 ? shopHomePage2.shopPolicy : shopPolicy2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopHomePage2.structuredShopPolicies : structuredShopPolicies2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shopHomePage2.faqs : list5, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shopHomePage2.sellerDetails : sellerDetails2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shopHomePage2.couponData : couponData2, (i2 & 8192) != 0 ? shopHomePage2.memberData : shopHomeMemberData, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shopHomePage2.useListingLevelReturnPolicies : bool, (i2 & 32768) != 0 ? shopHomePage2.returnPolicies : shopListingLevelReturnPolicies, (i2 & 65536) != 0 ? shopHomePage2.includesTranslations : z);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingData$annotations() {
    }

    public final ShopV3 component1() {
        return this.shop;
    }

    public final StructuredShopPolicies component10() {
        return this.structuredShopPolicies;
    }

    public final List<FAQ> component11() {
        return this.faqs;
    }

    public final SellerDetails component12() {
        return this.sellerDetails;
    }

    public final CouponData component13() {
        return this.couponData;
    }

    public final ShopHomeMemberData component14() {
        return this.memberData;
    }

    public final Boolean component15() {
        return this.useListingLevelReturnPolicies;
    }

    public final ShopListingLevelReturnPolicies component16() {
        return this.returnPolicies;
    }

    public final boolean component17() {
        return this.includesTranslations;
    }

    public final List<ListingCard> component2() {
        return this.featuredListings;
    }

    public final List<ShopSection> component3() {
        return this.shopSections;
    }

    public final List<ListingCard> component4() {
        return this.shopListings;
    }

    public final String component5() {
        return this.shopListingSortOrder;
    }

    public final ShopReviewsResult component6() {
        return this.shopReviews;
    }

    public final ShopAbout component7() {
        return this.shopAbout;
    }

    public final List<Manufacturer> component8() {
        return this.manufacturers;
    }

    public final ShopPolicy component9() {
        return this.shopPolicy;
    }

    public final ShopHomePage copy(@C17402n(name = "shop") ShopV3 shopV3, @C17402n(name = "featured_listings") List<? extends ListingCard> list, @C17402n(name = "sections") List<? extends ShopSection> list2, @C17402n(name = "listing_cards") List<? extends ListingCard> list3, @C17402n(name = "listing_sort_order") String str, @C17402n(name = "reviews") ShopReviewsResult shopReviewsResult, @C17402n(name = "shop_about") ShopAbout shopAbout2, @C17402n(name = "manufacturers") List<? extends Manufacturer> list4, @C17402n(name = "policies") ShopPolicy shopPolicy2, @C17402n(name = "structured_policies") StructuredShopPolicies structuredShopPolicies2, @C17402n(name = "faq") List<? extends FAQ> list5, @C17402n(name = "seller_details") SellerDetails sellerDetails2, @C17402n(name = "coupon_data") CouponData couponData2, @C17402n(name = "member_data") ShopHomeMemberData shopHomeMemberData, @C17402n(name = "use_listing_level_return_policies") Boolean bool, @C17402n(name = "return_policies") ShopListingLevelReturnPolicies shopListingLevelReturnPolicies, @C17402n(name = "includes_machine_translations") boolean z) {
        ShopV3 shopV32 = shopV3;
        ShopV3 shopV33 = shopV32;
        C19383o.m32797g(shopV32, ResponseConstants.SHOP);
        return new ShopHomePage(shopV32, list, list2, list3, str, shopReviewsResult, shopAbout2, list4, shopPolicy2, structuredShopPolicies2, list5, sellerDetails2, couponData2, shopHomeMemberData, bool, shopListingLevelReturnPolicies, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopHomePage)) {
            return false;
        }
        ShopHomePage shopHomePage = (ShopHomePage) obj;
        return C19383o.m32792b(this.shop, shopHomePage.shop) && C19383o.m32792b(this.featuredListings, shopHomePage.featuredListings) && C19383o.m32792b(this.shopSections, shopHomePage.shopSections) && C19383o.m32792b(this.shopListings, shopHomePage.shopListings) && C19383o.m32792b(this.shopListingSortOrder, shopHomePage.shopListingSortOrder) && C19383o.m32792b(this.shopReviews, shopHomePage.shopReviews) && C19383o.m32792b(this.shopAbout, shopHomePage.shopAbout) && C19383o.m32792b(this.manufacturers, shopHomePage.manufacturers) && C19383o.m32792b(this.shopPolicy, shopHomePage.shopPolicy) && C19383o.m32792b(this.structuredShopPolicies, shopHomePage.structuredShopPolicies) && C19383o.m32792b(this.faqs, shopHomePage.faqs) && C19383o.m32792b(this.sellerDetails, shopHomePage.sellerDetails) && C19383o.m32792b(this.couponData, shopHomePage.couponData) && C19383o.m32792b(this.memberData, shopHomePage.memberData) && C19383o.m32792b(this.useListingLevelReturnPolicies, shopHomePage.useListingLevelReturnPolicies) && C19383o.m32792b(this.returnPolicies, shopHomePage.returnPolicies) && this.includesTranslations == shopHomePage.includesTranslations;
    }

    public final CouponData getCouponData() {
        return this.couponData;
    }

    public final FAQs getFAQs() {
        FAQs fAQs = new FAQs();
        List<FAQ> list = this.faqs;
        if (list != null) {
            for (FAQ faq : list) {
                if (C18263b.m30837c0(faq.getQuestion()) && C18263b.m30837c0(faq.getAnswer())) {
                    fAQs.add(faq);
                }
            }
        }
        return fAQs;
    }

    public final List<FAQ> getFaqs() {
        return this.faqs;
    }

    public final List<ListingCard> getFeaturedListings() {
        return this.featuredListings;
    }

    public final boolean getIncludesTranslations() {
        return this.includesTranslations;
    }

    public final List<Manufacturer> getManufacturers() {
        return this.manufacturers;
    }

    public final ShopHomeMemberData getMemberData() {
        return this.memberData;
    }

    public final ShopListingLevelReturnPolicies getReturnPolicies() {
        return this.returnPolicies;
    }

    public final SellerDetails getSellerDetails() {
        return this.sellerDetails;
    }

    public final ShopV3 getShop() {
        return this.shop;
    }

    public final ShopAbout getShopAbout() {
        return this.shopAbout;
    }

    public final String getShopListingSortOrder() {
        return this.shopListingSortOrder;
    }

    public final List<ListingCard> getShopListings() {
        return this.shopListings;
    }

    public final ShopPolicy getShopPolicy() {
        return this.shopPolicy;
    }

    public final ShopReviewsResult getShopReviews() {
        return this.shopReviews;
    }

    public final List<ShopSection> getShopSections() {
        return this.shopSections;
    }

    public final StructuredShopPolicies getStructuredShopPolicies() {
        return this.structuredShopPolicies;
    }

    public C8699m getTrackingData() {
        return this.trackingData;
    }

    public final Boolean getUseListingLevelReturnPolicies() {
        return this.useListingLevelReturnPolicies;
    }

    public final boolean hasAboutSection() {
        List<String> modules = this.shop.getModules();
        return (modules != null && modules.contains(ShopV3.MODULE_ABOUT)) && this.shopAbout != null;
    }

    public final boolean hasMoreSection() {
        SellerDetails sellerDetails2 = this.sellerDetails;
        return (sellerDetails2 != null && sellerDetails2.hasDetails()) || (getFAQs().isEmpty() ^ true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = r1.shopPolicy;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasPolicies() {
        /*
            r1 = this;
            com.etsy.android.lib.models.apiv3.ShopV3 r0 = r1.shop
            boolean r0 = r0.isUsingStructuredPolicies()
            if (r0 == 0) goto L_0x000c
            com.etsy.android.lib.models.apiv3.StructuredShopPolicies r0 = r1.structuredShopPolicies
            if (r0 != 0) goto L_0x0026
        L_0x000c:
            com.etsy.android.lib.models.apiv3.ShopV3 r0 = r1.shop
            boolean r0 = r0.isUsingStructuredPolicies()
            if (r0 != 0) goto L_0x0028
            com.etsy.android.lib.models.apiv3.ShopPolicy r0 = r1.shopPolicy
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0028
            com.etsy.android.lib.models.apiv3.ShopPolicy r0 = r1.shopPolicy
            boolean r0 = r0.hasPolicies()
            if (r0 == 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.ShopHomePage.hasPolicies():boolean");
    }

    public int hashCode() {
        int hashCode = this.shop.hashCode() * 31;
        List<ListingCard> list = this.featuredListings;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ShopSection> list2 = this.shopSections;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ListingCard> list3 = this.shopListings;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.shopListingSortOrder;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        ShopReviewsResult shopReviewsResult = this.shopReviews;
        int hashCode6 = (hashCode5 + (shopReviewsResult == null ? 0 : shopReviewsResult.hashCode())) * 31;
        ShopAbout shopAbout2 = this.shopAbout;
        int hashCode7 = (hashCode6 + (shopAbout2 == null ? 0 : shopAbout2.hashCode())) * 31;
        List<Manufacturer> list4 = this.manufacturers;
        int hashCode8 = (hashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ShopPolicy shopPolicy2 = this.shopPolicy;
        int hashCode9 = (hashCode8 + (shopPolicy2 == null ? 0 : shopPolicy2.hashCode())) * 31;
        StructuredShopPolicies structuredShopPolicies2 = this.structuredShopPolicies;
        int hashCode10 = (hashCode9 + (structuredShopPolicies2 == null ? 0 : structuredShopPolicies2.hashCode())) * 31;
        List<FAQ> list5 = this.faqs;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        SellerDetails sellerDetails2 = this.sellerDetails;
        int hashCode12 = (hashCode11 + (sellerDetails2 == null ? 0 : sellerDetails2.hashCode())) * 31;
        CouponData couponData2 = this.couponData;
        int hashCode13 = (hashCode12 + (couponData2 == null ? 0 : couponData2.hashCode())) * 31;
        ShopHomeMemberData shopHomeMemberData = this.memberData;
        int hashCode14 = (hashCode13 + (shopHomeMemberData == null ? 0 : shopHomeMemberData.hashCode())) * 31;
        Boolean bool = this.useListingLevelReturnPolicies;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        ShopListingLevelReturnPolicies shopListingLevelReturnPolicies = this.returnPolicies;
        if (shopListingLevelReturnPolicies != null) {
            i = shopListingLevelReturnPolicies.hashCode();
        }
        int i2 = (hashCode15 + i) * 31;
        boolean z = this.includesTranslations;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final void setMemberData(ShopHomeMemberData shopHomeMemberData) {
        this.memberData = shopHomeMemberData;
    }

    public void setTrackingData(C8699m mVar) {
        C19383o.m32797g(mVar, "<set-?>");
        this.trackingData = mVar;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopHomePage(shop=");
        h.append(this.shop);
        h.append(", featuredListings=");
        h.append(this.featuredListings);
        h.append(", shopSections=");
        h.append(this.shopSections);
        h.append(", shopListings=");
        h.append(this.shopListings);
        h.append(", shopListingSortOrder=");
        h.append(this.shopListingSortOrder);
        h.append(", shopReviews=");
        h.append(this.shopReviews);
        h.append(", shopAbout=");
        h.append(this.shopAbout);
        h.append(", manufacturers=");
        h.append(this.manufacturers);
        h.append(", shopPolicy=");
        h.append(this.shopPolicy);
        h.append(", structuredShopPolicies=");
        h.append(this.structuredShopPolicies);
        h.append(", faqs=");
        h.append(this.faqs);
        h.append(", sellerDetails=");
        h.append(this.sellerDetails);
        h.append(", couponData=");
        h.append(this.couponData);
        h.append(", memberData=");
        h.append(this.memberData);
        h.append(", useListingLevelReturnPolicies=");
        h.append(this.useListingLevelReturnPolicies);
        h.append(", returnPolicies=");
        h.append(this.returnPolicies);
        h.append(", includesTranslations=");
        return C0391c.m1058d(h, this.includesTranslations, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopHomePage(com.etsy.android.lib.models.apiv3.ShopV3 r18, java.util.List r19, java.util.List r20, java.util.List r21, java.lang.String r22, com.etsy.android.lib.models.apiv3.ShopReviewsResult r23, com.etsy.android.lib.models.ShopAbout r24, java.util.List r25, com.etsy.android.lib.models.apiv3.ShopPolicy r26, com.etsy.android.lib.models.apiv3.StructuredShopPolicies r27, java.util.List r28, com.etsy.android.lib.models.apiv3.SellerDetails r29, com.etsy.android.lib.models.apiv3.CouponData r30, com.etsy.android.lib.models.apiv3.ShopHomeMemberData r31, java.lang.Boolean r32, com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies r33, boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r17 = this;
            r0 = r35
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r19
        L_0x000b:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r20
        L_0x0013:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r21
        L_0x001b:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r22
        L_0x0023:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r23
        L_0x002b:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r24
        L_0x0033:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r25
        L_0x003b:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r26
        L_0x0043:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r27
        L_0x004b:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r28
        L_0x0053:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r29
        L_0x005b:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r30
        L_0x0063:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r31
        L_0x006b:
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r32
        L_0x0073:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r2 = r33
        L_0x007d:
            r16 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0085
            r0 = 0
            goto L_0x0087
        L_0x0085:
            r0 = r34
        L_0x0087:
            r19 = r17
            r20 = r18
            r21 = r1
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.ShopHomePage.<init>(com.etsy.android.lib.models.apiv3.ShopV3, java.util.List, java.util.List, java.util.List, java.lang.String, com.etsy.android.lib.models.apiv3.ShopReviewsResult, com.etsy.android.lib.models.ShopAbout, java.util.List, com.etsy.android.lib.models.apiv3.ShopPolicy, com.etsy.android.lib.models.apiv3.StructuredShopPolicies, java.util.List, com.etsy.android.lib.models.apiv3.SellerDetails, com.etsy.android.lib.models.apiv3.CouponData, com.etsy.android.lib.models.apiv3.ShopHomeMemberData, java.lang.Boolean, com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
