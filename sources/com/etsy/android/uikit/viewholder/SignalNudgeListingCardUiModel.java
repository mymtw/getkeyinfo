package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.Promotion;
import com.etsy.android.lib.models.apiv3.PromotionData;
import com.etsy.android.lib.util.C8890e0;
import com.google.android.material.badge.BadgeDrawable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class SignalNudgeListingCardUiModel implements Serializable {
    public static final int $stable = 8;

    /* renamed from: b */
    public transient SpannableStringBuilder f26679b;
    private final int badgeVisibility;
    private final boolean bestSellerEligible;
    private final int bestSellerIcon;
    private final int bestsellerVariantVisibility;
    private final int bestsellerVisibility;
    private final boolean buyerFulfillmentPromiseEligible;

    /* renamed from: c */
    public transient SpannableStringBuilder f26680c;
    private final String discountInfoText;
    private final int discountInfoVisibility;
    private final C19285c dollarBasedFreeShippingEligible$delegate;
    private final C19285c dollarBasedFreeShippingText$delegate;
    private final int freeShippingDividerVisibility;
    private final C19285c freeShippingPromotion$delegate;
    private final String freeShippingText;
    private final int freeShippingVisibility;
    private final int freeShippingVisibilityVariant;
    private final boolean inNCartsEligible;
    private final boolean inNCartsVariantEligible;
    private final int inNCartsVariantVisibility;
    /* access modifiers changed from: private */
    public final ListingCard listing;
    private final int moreColorsVisibility;
    private final boolean onlyNLeftEligible;
    private final boolean onlyNLeftVariantEligible;
    private final int onlyNLeftVariantVisibility;
    private final int onlyNLeftVisibility;
    private final boolean popularNowEligible;
    private final CharSequence priceContentDescription;
    private final String priceText;
    private final int priceVariantTextColor;
    private final C19285c quantityBasedFreeShippingEligible$delegate;
    private final C19285c quantityBasedFreeShippingText$delegate;
    private final C19285c quantityBasedSaleEligible$delegate;
    private final C19285c quantityBasedSaleText$delegate;
    private final String renderedDiscountDescription;
    private final String renderedDiscountedPrice;
    private final String renderedPrice;
    private final String saleContentDescription;
    private final String saleTextUnformatted;
    private boolean showVariationPriceIndicator;
    private final boolean signalListContainsFreeShipping;
    private final boolean signalListContainsFreeShippingVariant;
    private final boolean signalListContainsPromotion;
    private final boolean signalListContainsPromotionVariant;
    private final boolean starSellerEligible;

    public enum BadgeType {
        BESTSELLER,
        STAR_SELLER,
        POPULAR_NOW,
        NONE
    }

    public enum ComboNudgeType {
        IN_N_CARTS,
        NONE
    }

    public enum FloatingNudgeType {
        BESTSELLER,
        NONE
    }

    public enum ListingNudgeType {
        ONLY_N_LEFT,
        SALE_ENDING,
        NONE
    }

    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0423, code lost:
        if ((r2.length() <= 0 ? false : r3) != false) goto L_0x0427;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SignalNudgeListingCardUiModel(android.content.res.Resources r17, com.etsy.android.lib.models.apiv3.ListingCard r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "resources"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.lang.String r3 = "listing"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            r16.<init>()
            r0.listing = r2
            r3 = r20
            r0.showVariationPriceIndicator = r3
            r3 = 1
            r4 = 0
            java.lang.String r5 = "promotion"
            java.lang.String r6 = "free_shipping"
            r7 = 0
            if (r19 == 0) goto L_0x0056
            java.util.List r2 = r18.getSignalPeckingOrderList()
            if (r2 == 0) goto L_0x0050
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x004c
            java.lang.Object r8 = r2.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r9, r6)
            if (r10 != 0) goto L_0x0048
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r5)
            if (r9 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r9 = r4
            goto L_0x0049
        L_0x0048:
            r9 = r3
        L_0x0049:
            if (r9 == 0) goto L_0x002c
            goto L_0x004d
        L_0x004c:
            r8 = r7
        L_0x004d:
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0051
        L_0x0050:
            r8 = r7
        L_0x0051:
            boolean r2 = kotlin.text.C19457k.m33019W0(r8, r6, r4)
            goto L_0x0062
        L_0x0056:
            java.util.List r2 = r18.getSignalPeckingOrderList()
            if (r2 == 0) goto L_0x0061
            boolean r2 = r2.contains(r6)
            goto L_0x0062
        L_0x0061:
            r2 = r4
        L_0x0062:
            r0.signalListContainsFreeShipping = r2
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            java.util.List r2 = r2.getSignalPeckingOrderList()
            if (r2 == 0) goto L_0x0071
            boolean r2 = r2.contains(r6)
            goto L_0x0072
        L_0x0071:
            r2 = r4
        L_0x0072:
            r0.signalListContainsFreeShippingVariant = r2
            if (r19 == 0) goto L_0x00ac
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            java.util.List r2 = r2.getSignalPeckingOrderList()
            if (r2 == 0) goto L_0x00a6
            java.util.Iterator r2 = r2.iterator()
        L_0x0082:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00a2
            java.lang.Object r8 = r2.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r9, r5)
            if (r10 != 0) goto L_0x009e
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r6)
            if (r9 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r9 = r4
            goto L_0x009f
        L_0x009e:
            r9 = r3
        L_0x009f:
            if (r9 == 0) goto L_0x0082
            goto L_0x00a3
        L_0x00a2:
            r8 = r7
        L_0x00a3:
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00a7
        L_0x00a6:
            r8 = r7
        L_0x00a7:
            boolean r2 = kotlin.text.C19457k.m33019W0(r8, r5, r4)
            goto L_0x00ba
        L_0x00ac:
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            java.util.List r2 = r2.getSignalPeckingOrderList()
            if (r2 == 0) goto L_0x00b9
            boolean r2 = r2.contains(r5)
            goto L_0x00ba
        L_0x00b9:
            r2 = r4
        L_0x00ba:
            r0.signalListContainsPromotion = r2
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            java.util.List r2 = r2.getSignalPeckingOrderList()
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r2.contains(r5)
            goto L_0x00ca
        L_0x00c9:
            r2 = r4
        L_0x00ca:
            r0.signalListContainsPromotionVariant = r2
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            boolean r2 = r2.isSoldOut()
            r8 = 8
            if (r2 != 0) goto L_0x00e8
            boolean r2 = r0.signalListContainsFreeShipping
            if (r2 == 0) goto L_0x00e8
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r2 = r2.getFreeShippingData()
            boolean r2 = r2.getHasMinumim()
            if (r2 != 0) goto L_0x00e8
            r2 = r4
            goto L_0x00e9
        L_0x00e8:
            r2 = r8
        L_0x00e9:
            r0.freeShippingVisibility = r2
            com.etsy.android.lib.models.apiv3.ListingCard r9 = r0.listing
            boolean r9 = r9.isSoldOut()
            if (r9 != 0) goto L_0x0105
            boolean r9 = r0.signalListContainsFreeShippingVariant
            if (r9 == 0) goto L_0x0105
            com.etsy.android.lib.models.apiv3.ListingCard r9 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r9 = r9.getFreeShippingData()
            boolean r9 = r9.getHasMinumim()
            if (r9 != 0) goto L_0x0105
            r9 = r4
            goto L_0x0106
        L_0x0105:
            r9 = r8
        L_0x0106:
            r0.freeShippingVisibilityVariant = r9
            com.etsy.android.lib.models.apiv3.ListingCard r10 = r0.listing
            float r10 = r10.getShopAverageRating()
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x011f
            com.etsy.android.lib.models.apiv3.ListingCard r10 = r0.listing
            int r10 = r10.getShopTotalRatingCount()
            if (r10 <= 0) goto L_0x011f
            if (r9 != 0) goto L_0x011f
            r9 = r4
            goto L_0x0120
        L_0x011f:
            r9 = r8
        L_0x0120:
            r0.freeShippingDividerVisibility = r9
            if (r2 != r8) goto L_0x0132
            com.etsy.android.lib.models.apiv3.ListingCard r9 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r9 = r9.getFreeShippingData()
            boolean r9 = r9.isBuyerPromiseEligible()
            if (r9 == 0) goto L_0x0132
            r9 = r3
            goto L_0x0133
        L_0x0132:
            r9 = r4
        L_0x0133:
            r0.buyerFulfillmentPromiseEligible = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedSaleEligible$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedSaleEligible$2
            r9.<init>(r0)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.quantityBasedSaleEligible$delegate = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedSaleText$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedSaleText$2
            r9.<init>(r0, r1)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.quantityBasedSaleText$delegate = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$freeShippingPromotion$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$freeShippingPromotion$2
            r9.<init>(r0)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.freeShippingPromotion$delegate = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedFreeShippingEligible$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedFreeShippingEligible$2
            r9.<init>(r0)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.quantityBasedFreeShippingEligible$delegate = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedFreeShippingText$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedFreeShippingText$2
            r9.<init>(r0, r1)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.quantityBasedFreeShippingText$delegate = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$dollarBasedFreeShippingEligible$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$dollarBasedFreeShippingEligible$2
            r9.<init>(r0)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.dollarBasedFreeShippingEligible$delegate = r9
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$dollarBasedFreeShippingText$2 r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$dollarBasedFreeShippingText$2
            r9.<init>(r0, r1)
            kotlin.c r9 = kotlin.C19350d.m32677b(r9)
            r0.dollarBasedFreeShippingText$delegate = r9
            r9 = 0
            if (r2 != r8) goto L_0x0196
            int r11 = saleVisibility$default(r0, r9, r3, r7)
            if (r11 != r8) goto L_0x0196
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            boolean r11 = r11.isBestseller()
            if (r11 == 0) goto L_0x0196
            r11 = r4
            goto L_0x0197
        L_0x0196:
            r11 = r8
        L_0x0197:
            r0.bestsellerVisibility = r11
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            boolean r11 = r11.isBestseller()
            r0.bestSellerEligible = r11
            if (r11 == 0) goto L_0x01a5
            r12 = r4
            goto L_0x01a6
        L_0x01a5:
            r12 = r8
        L_0x01a6:
            r0.bestsellerVariantVisibility = r12
            r12 = 2131230940(0x7f0800dc, float:1.8077947E38)
            r0.bestSellerIcon = r12
            com.etsy.android.lib.models.apiv3.ListingCard r12 = r0.listing
            boolean r12 = r12.isStarSeller()
            r0.starSellerEligible = r12
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            boolean r13 = r13.isPopularNow()
            r0.popularNowEligible = r13
            if (r2 != r8) goto L_0x01cd
            int r14 = saleVisibility$default(r0, r9, r3, r7)
            if (r14 != r8) goto L_0x01cd
            if (r11 != 0) goto L_0x01cb
            if (r12 != 0) goto L_0x01cb
            if (r13 == 0) goto L_0x01cd
        L_0x01cb:
            r11 = r4
            goto L_0x01ce
        L_0x01cd:
            r11 = r8
        L_0x01ce:
            r0.badgeVisibility = r11
            com.etsy.android.lib.models.apiv3.ListingCard r12 = r0.listing
            boolean r12 = r12.hasColorVariations()
            if (r12 == 0) goto L_0x01da
            r12 = r4
            goto L_0x01db
        L_0x01da:
            r12 = r8
        L_0x01db:
            r0.moreColorsVisibility = r12
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            int r13 = r13.getQuantity()
            r14 = 4
            if (r3 > r13) goto L_0x01ea
            if (r13 >= r14) goto L_0x01ea
            r13 = r3
            goto L_0x01eb
        L_0x01ea:
            r13 = r4
        L_0x01eb:
            if (r13 == 0) goto L_0x0223
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            boolean r13 = r13.isSoldOut()
            if (r13 != 0) goto L_0x0223
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            boolean r13 = r13.isCustomizable()
            if (r13 != 0) goto L_0x0223
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            boolean r13 = r13.isDownload()
            if (r13 != 0) goto L_0x0223
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            boolean r13 = r13.isVintage()
            if (r13 != 0) goto L_0x0223
            com.etsy.android.lib.models.apiv3.ListingCard r13 = r0.listing
            boolean r13 = r13.isScarce()
            if (r13 == 0) goto L_0x0223
            if (r2 != r8) goto L_0x0223
            int r2 = saleVisibility$default(r0, r9, r3, r7)
            if (r2 != r8) goto L_0x0223
            if (r11 != r8) goto L_0x0223
            if (r12 != r8) goto L_0x0223
            r2 = r3
            goto L_0x0224
        L_0x0223:
            r2 = r4
        L_0x0224:
            r0.onlyNLeftEligible = r2
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            int r2 = r2.getQuantity()
            if (r3 > r2) goto L_0x0232
            if (r2 >= r14) goto L_0x0232
            r2 = r3
            goto L_0x0233
        L_0x0232:
            r2 = r4
        L_0x0233:
            if (r2 == 0) goto L_0x025f
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            boolean r2 = r2.isSoldOut()
            if (r2 != 0) goto L_0x025f
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            boolean r2 = r2.isCustomizable()
            if (r2 != 0) goto L_0x025f
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            boolean r2 = r2.isDownload()
            if (r2 != 0) goto L_0x025f
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            boolean r2 = r2.isVintage()
            if (r2 != 0) goto L_0x025f
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            boolean r2 = r2.isScarce()
            if (r2 == 0) goto L_0x025f
            r2 = r3
            goto L_0x0260
        L_0x025f:
            r2 = r4
        L_0x0260:
            r0.onlyNLeftVariantEligible = r2
            boolean r2 = r16.getOnlyNLeftVariantEligible$Etsy_release()
            if (r2 == 0) goto L_0x026a
            r2 = r4
            goto L_0x026b
        L_0x026a:
            r2 = r8
        L_0x026b:
            r0.onlyNLeftVariantVisibility = r2
            boolean r2 = r16.getOnlyNLeftEligible$Etsy_release()
            if (r2 == 0) goto L_0x0275
            r2 = r4
            goto L_0x0276
        L_0x0275:
            r2 = r8
        L_0x0276:
            r0.onlyNLeftVisibility = r2
            boolean r2 = r16.getOnlyNLeftEligible$Etsy_release()
            if (r2 == 0) goto L_0x0288
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            int r2 = r2.inCartCount()
            if (r2 <= 0) goto L_0x0288
            r2 = r3
            goto L_0x0289
        L_0x0288:
            r2 = r4
        L_0x0289:
            r0.inNCartsEligible = r2
            boolean r2 = r16.getOnlyNLeftVariantEligible$Etsy_release()
            if (r2 == 0) goto L_0x029b
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            int r2 = r2.inCartCount()
            if (r2 <= 0) goto L_0x029b
            r2 = r3
            goto L_0x029c
        L_0x029b:
            r2 = r4
        L_0x029c:
            r0.inNCartsVariantEligible = r2
            boolean r2 = r16.getInNCartsVariantEligible()
            if (r2 == 0) goto L_0x02a6
            r2 = r4
            goto L_0x02a7
        L_0x02a6:
            r2 = r8
        L_0x02a7:
            r0.inNCartsVariantVisibility = r2
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r2 = r2.getFreeShippingData()
            java.lang.String r2 = r2.getFreeShippingCopy()
            java.lang.String r11 = "listing.freeShippingData.freeShippingCopy"
            kotlin.jvm.internal.C19383o.m32796f(r2, r11)
            r0.freeShippingText = r2
            com.etsy.android.lib.models.apiv3.ListingCard r2 = r0.listing
            com.etsy.android.lib.currency.EtsyMoney r2 = r2.getPrice()
            java.lang.String r2 = r2.format()
            r0.renderedPrice = r2
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            java.lang.String r11 = r11.getFormattedDiscountDescription()
            java.lang.String r12 = "listing.formattedDiscountDescription"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            r0.renderedDiscountDescription = r11
            com.etsy.android.lib.models.apiv3.ListingCard r12 = r0.listing
            java.lang.String r12 = r12.getFormattedDiscountedPrice()
            java.lang.String r13 = "listing.formattedDiscountedPrice"
            kotlin.jvm.internal.C19383o.m32796f(r12, r13)
            r0.renderedDiscountedPrice = r12
            int r13 = r12.length()
            if (r13 <= 0) goto L_0x02e8
            r13 = r3
            goto L_0x02e9
        L_0x02e8:
            r13 = r4
        L_0x02e9:
            if (r13 == 0) goto L_0x0319
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r2)
            com.etsy.android.lib.models.apiv3.ListingCard r14 = r0.listing
            boolean r14 = r14.hasVariationPrices()
            if (r14 == 0) goto L_0x0301
            boolean r14 = r0.showVariationPriceIndicator
            if (r14 == 0) goto L_0x0301
            java.lang.String r14 = "+"
            r13.append(r14)
        L_0x0301:
            int r14 = r11.length()
            if (r14 <= 0) goto L_0x0309
            r14 = r3
            goto L_0x030a
        L_0x0309:
            r14 = r4
        L_0x030a:
            if (r14 == 0) goto L_0x0314
            java.lang.String r14 = " "
            r13.append(r14)
            r13.append(r11)
        L_0x0314:
            java.lang.String r11 = r13.toString()
            goto L_0x031a
        L_0x0319:
            r11 = r7
        L_0x031a:
            r0.saleTextUnformatted = r11
            r11 = 2131952709(0x7f130445, float:1.9541868E38)
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r4] = r2
            java.lang.String r11 = r1.getString(r11, r13)
            java.lang.String r13 = "resources.getString(R.st…old_price, renderedPrice)"
            kotlin.jvm.internal.C19383o.m32796f(r11, r13)
            r0.saleContentDescription = r11
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            boolean r11 = r11.isSoldOut()
            java.lang.String r13 = "resources.getString(R.string.sold)"
            r14 = 2131953569(0x7f1307a1, float:1.9543613E38)
            if (r11 == 0) goto L_0x0343
            java.lang.String r11 = r1.getString(r14)
            kotlin.jvm.internal.C19383o.m32796f(r11, r13)
            goto L_0x0376
        L_0x0343:
            int r11 = saleVisibility$default(r0, r9, r3, r7)
            if (r11 == 0) goto L_0x0375
            int r11 = r12.length()
            if (r11 <= 0) goto L_0x0351
            r11 = r3
            goto L_0x0352
        L_0x0351:
            r11 = r4
        L_0x0352:
            if (r11 == 0) goto L_0x0355
            goto L_0x0375
        L_0x0355:
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            boolean r11 = r11.hasVariationPrices()
            if (r11 == 0) goto L_0x0373
            boolean r11 = r0.showVariationPriceIndicator
            if (r11 == 0) goto L_0x0373
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r15 = 43
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            goto L_0x0376
        L_0x0373:
            r11 = r2
            goto L_0x0376
        L_0x0375:
            r11 = r12
        L_0x0376:
            r0.priceText = r11
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            boolean r11 = r11.isSoldOut()
            if (r11 == 0) goto L_0x0388
            java.lang.String r2 = r1.getString(r14)
            kotlin.jvm.internal.C19383o.m32796f(r2, r13)
            goto L_0x039e
        L_0x0388:
            int r9 = saleVisibility$default(r0, r9, r3, r7)
            if (r9 != 0) goto L_0x039e
            r2 = 2131952651(0x7f13040b, float:1.954175E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r4] = r12
            java.lang.String r2 = r1.getString(r2, r9)
            java.lang.String r1 = "resources.getString(R.st… renderedDiscountedPrice)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)
        L_0x039e:
            r0.priceContentDescription = r2
            com.etsy.android.lib.util.e0 r1 = new com.etsy.android.lib.util.e0
            r1.<init>()
            int r1 = r0.saleVisibilityVariant(r1)
            if (r1 != 0) goto L_0x03af
            r1 = 2130968931(0x7f040163, float:1.754653E38)
            goto L_0x03b2
        L_0x03af:
            r1 = 2130968938(0x7f04016a, float:1.7546544E38)
        L_0x03b2:
            r0.priceVariantTextColor = r1
            com.etsy.android.lib.models.apiv3.ListingCard r1 = r0.listing
            java.util.List r1 = r1.getSignalPeckingOrderList()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0413
            int r7 = r1.size()
            r9 = r4
        L_0x03c3:
            if (r9 >= r7) goto L_0x0412
            java.lang.Object r10 = r1.get(r9)
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r10, r6)
            if (r11 == 0) goto L_0x03f1
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            boolean r11 = r11.isSoldOut()
            if (r11 != 0) goto L_0x03f1
            com.etsy.android.lib.models.apiv3.ListingCard r11 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r11 = r11.getFreeShippingData()
            boolean r11 = r11.getHasMinumim()
            if (r11 == 0) goto L_0x03f1
            com.etsy.android.lib.models.apiv3.ListingCard r1 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r1 = r1.getFreeShippingData()
            java.lang.String r1 = r1.getFreeShippingCopy()
        L_0x03ef:
            r7 = r1
            goto L_0x0413
        L_0x03f1:
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r5)
            if (r10 == 0) goto L_0x040f
            com.etsy.android.lib.models.apiv3.ListingCard r10 = r0.listing
            boolean r10 = r10.isSoldOut()
            if (r10 != 0) goto L_0x040f
            java.lang.String r10 = r0.renderedDiscountedPrice
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0409
            r10 = r3
            goto L_0x040a
        L_0x0409:
            r10 = r4
        L_0x040a:
            if (r10 == 0) goto L_0x040f
            java.lang.String r1 = r0.renderedDiscountDescription
            goto L_0x03ef
        L_0x040f:
            int r9 = r9 + 1
            goto L_0x03c3
        L_0x0412:
            r7 = r2
        L_0x0413:
            if (r7 != 0) goto L_0x0416
            goto L_0x0417
        L_0x0416:
            r2 = r7
        L_0x0417:
            r0.discountInfoText = r2
            if (r19 == 0) goto L_0x0426
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x0422
            goto L_0x0423
        L_0x0422:
            r3 = r4
        L_0x0423:
            if (r3 == 0) goto L_0x0426
            goto L_0x0427
        L_0x0426:
            r4 = r8
        L_0x0427:
            r0.discountInfoVisibility = r4
            r16.mo38815d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel.<init>(android.content.res.Resources, com.etsy.android.lib.models.apiv3.ListingCard, boolean, boolean):void");
    }

    /* renamed from: a */
    public static Long m19797a(List list, PromotionData promotionData) {
        Object obj;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Promotion promotion = (Promotion) obj;
            boolean z = false;
            if (promotionData != null && promotion.getPromotionId() == promotionData.getPromotionId()) {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        Promotion promotion2 = (Promotion) obj;
        if (promotion2 != null) {
            return Long.valueOf(promotion2.getPromotionEnd());
        }
        return null;
    }

    public static final Promotion access$getFreeShippingPromotion(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel) {
        return (Promotion) signalNudgeListingCardUiModel.freeShippingPromotion$delegate.getValue();
    }

    /* renamed from: e */
    public static boolean m19798e(List list, PromotionData promotionData, long j) {
        Long a = m19797a(list, promotionData);
        if (a != null) {
            a.longValue();
            if (TimeUnit.MINUTES.convert((a.longValue() * ((long) 1000)) - j, TimeUnit.MILLISECONDS) > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m19799f(List list, PromotionData promotionData, long j) {
        Long a = m19797a(list, promotionData);
        if (a != null) {
            a.longValue();
            if (TimeUnit.HOURS.convert((a.longValue() * ((long) 1000)) - j, TimeUnit.MILLISECONDS) < 48) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getSaleTextUnformatted$annotations() {
    }

    public static /* synthetic */ boolean saleEndingEligible$default(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return signalNudgeListingCardUiModel.saleEndingEligible(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saleEndingEligible");
    }

    public static /* synthetic */ String saleEndingText$default(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel, Resources resources, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = System.currentTimeMillis();
            }
            return signalNudgeListingCardUiModel.saleEndingText(resources, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saleEndingText");
    }

    public static /* synthetic */ int saleVisibility$default(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return signalNudgeListingCardUiModel.saleVisibility(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saleVisibility");
    }

    public final String bestSellerText(Resources resources) {
        C19383o.m32797g(resources, "resources");
        String string = resources.getString(R.string.listing_bestseller_badge);
        C19383o.m32796f(string, "resources.getString(R.st…listing_bestseller_badge)");
        return string;
    }

    /* renamed from: d */
    public final void mo38815d() {
        SpannableStringBuilder spannableStringBuilder;
        String str = this.saleTextUnformatted;
        if (str != null) {
            String str2 = this.renderedPrice;
            spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str2.length(), 33);
        } else {
            spannableStringBuilder = null;
        }
        this.f26679b = spannableStringBuilder;
    }

    public final int getBadgeVisibility() {
        return this.badgeVisibility;
    }

    public final boolean getBestSellerEligible() {
        return this.bestSellerEligible;
    }

    public final int getBestSellerIcon() {
        return this.bestSellerIcon;
    }

    public final int getBestsellerVariantVisibility() {
        return this.bestsellerVariantVisibility;
    }

    public final int getBestsellerVisibility() {
        return this.bestsellerVisibility;
    }

    public final boolean getBuyerFulfillmentPromiseEligible() {
        return this.buyerFulfillmentPromiseEligible;
    }

    public final ComboNudgeType getComboNudgeType() {
        return getInNCartsVariantEligible() ? ComboNudgeType.IN_N_CARTS : ComboNudgeType.NONE;
    }

    public final String getDiscountInfoText() {
        return this.discountInfoText;
    }

    public final int getDiscountInfoVisibility() {
        return this.discountInfoVisibility;
    }

    public final boolean getDollarBasedFreeShippingEligible() {
        return ((Boolean) this.dollarBasedFreeShippingEligible$delegate.getValue()).booleanValue();
    }

    public final String getDollarBasedFreeShippingText() {
        return (String) this.dollarBasedFreeShippingText$delegate.getValue();
    }

    public final FloatingNudgeType getFloatingNudgeType() {
        return this.bestSellerEligible ? FloatingNudgeType.BESTSELLER : FloatingNudgeType.NONE;
    }

    public final int getFreeShippingDividerVisibility() {
        return this.freeShippingDividerVisibility;
    }

    public final String getFreeShippingText() {
        return this.freeShippingText;
    }

    public final int getFreeShippingVisibility() {
        return this.freeShippingVisibility;
    }

    public final int getFreeShippingVisibilityVariant() {
        return this.freeShippingVisibilityVariant;
    }

    public boolean getInNCartsEligible() {
        return this.inNCartsEligible;
    }

    public boolean getInNCartsVariantEligible() {
        return this.inNCartsVariantEligible;
    }

    public int getInNCartsVariantVisibility() {
        return this.inNCartsVariantVisibility;
    }

    public final ListingNudgeType getListingNudgeType() {
        return getOnlyNLeftVariantEligible$Etsy_release() ? ListingNudgeType.ONLY_N_LEFT : saleEndingVariantEligible(new C8890e0()) ? ListingNudgeType.SALE_ENDING : ListingNudgeType.NONE;
    }

    public final int getMoreColorsVisibility() {
        return this.moreColorsVisibility;
    }

    public final SpannableStringBuilder getNewListingPrice() {
        SpannableStringBuilder spannableStringBuilder;
        if (this.f26680c == null) {
            boolean z = this.listing.hasVariationPrices() && this.showVariationPriceIndicator;
            String str = this.saleTextUnformatted;
            if (str != null) {
                String str2 = this.renderedPrice;
                StringBuilder sb = new StringBuilder();
                sb.append(this.renderedDiscountedPrice);
                sb.append(z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "");
                String sb2 = sb.toString();
                spannableStringBuilder = new SpannableStringBuilder(sb2 + ' ' + str);
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, sb2.length(), 18);
                spannableStringBuilder.setSpan(new StrikethroughSpan(), sb2.length() + 1, str2.length() + sb2.length() + 1, 18);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(this.priceText);
            }
            this.f26680c = spannableStringBuilder;
        }
        return this.f26680c;
    }

    public boolean getOnlyNLeftEligible$Etsy_release() {
        return this.onlyNLeftEligible;
    }

    public boolean getOnlyNLeftVariantEligible$Etsy_release() {
        return this.onlyNLeftVariantEligible;
    }

    public int getOnlyNLeftVariantVisibility() {
        return this.onlyNLeftVariantVisibility;
    }

    public int getOnlyNLeftVisibility() {
        return this.onlyNLeftVisibility;
    }

    public final boolean getPopularNowEligible() {
        return this.popularNowEligible;
    }

    public final CharSequence getPriceContentDescription() {
        return this.priceContentDescription;
    }

    public final String getPriceText() {
        return this.priceText;
    }

    public final int getPriceVariantTextColor() {
        return this.priceVariantTextColor;
    }

    public final boolean getQuantityBasedFreeShippingEligible() {
        return ((Boolean) this.quantityBasedFreeShippingEligible$delegate.getValue()).booleanValue();
    }

    public final String getQuantityBasedFreeShippingText() {
        return (String) this.quantityBasedFreeShippingText$delegate.getValue();
    }

    public final boolean getQuantityBasedSaleEligible() {
        return ((Boolean) this.quantityBasedSaleEligible$delegate.getValue()).booleanValue();
    }

    public final String getQuantityBasedSaleText() {
        return (String) this.quantityBasedSaleText$delegate.getValue();
    }

    public final String getSaleContentDescription() {
        return this.saleContentDescription;
    }

    public final SpannableStringBuilder getSaleText() {
        if (this.f26679b == null) {
            mo38815d();
        }
        return this.f26679b;
    }

    public final String getSaleTextUnformatted() {
        return this.saleTextUnformatted;
    }

    public final boolean getStarSellerEligible() {
        return this.starSellerEligible;
    }

    public final String inNCartsText(Resources resources) {
        C19383o.m32797g(resources, "resources");
        if (getInNCartsEligible()) {
            int inCartCount = this.listing.inCartCount();
            if (1 <= inCartCount && inCartCount < 21) {
                String quantityString = resources.getQuantityString(R.plurals.in_n_carts, this.listing.inCartCount(), new Object[]{Integer.valueOf(this.listing.inCartCount())});
                C19383o.m32796f(quantityString, "resources.getQuantityStr…CartCount()\n            )");
                return quantityString;
            }
        }
        if (!getInNCartsEligible() || this.listing.inCartCount() <= 20) {
            return "";
        }
        String string = resources.getString(R.string.in_20_plus_carts);
        C19383o.m32796f(string, "resources.getString(\n   …_plus_carts\n            )");
        return string;
    }

    public final String inNCartsVariantText(Resources resources) {
        C19383o.m32797g(resources, "resources");
        if (getInNCartsVariantEligible()) {
            int inCartCount = this.listing.inCartCount();
            if (1 <= inCartCount && inCartCount < 21) {
                String quantityString = resources.getQuantityString(R.plurals.in_n_carts_variant, this.listing.inCartCount(), new Object[]{Integer.valueOf(this.listing.inCartCount())});
                C19383o.m32796f(quantityString, "resources.getQuantityStr…CartCount()\n            )");
                return quantityString;
            }
        }
        if (!getInNCartsVariantEligible() || this.listing.inCartCount() <= 20) {
            return "";
        }
        String string = resources.getString(R.string.in_20_plus_carts_variant);
        C19383o.m32796f(string, "resources.getString(\n   …rts_variant\n            )");
        return string;
    }

    public final String onlyNLeftText(Resources resources) {
        C19383o.m32797g(resources, "resources");
        if (!getOnlyNLeftEligible$Etsy_release()) {
            return "";
        }
        String string = resources.getString(R.string.only_n_left, new Object[]{String.valueOf(this.listing.getQuantity())});
        C19383o.m32796f(string, "{\n        resources.getS…uantity.toString())\n    }");
        return string;
    }

    public final String onlyNLeftVariantText(Resources resources) {
        C19383o.m32797g(resources, "resources");
        if (!getOnlyNLeftVariantEligible$Etsy_release()) {
            return "";
        }
        String string = resources.getString(R.string.only_n_left, new Object[]{String.valueOf(this.listing.getQuantity())});
        C19383o.m32796f(string, "{\n        resources.getS…uantity.toString())\n    }");
        return string;
    }

    public final String popularNowText(Resources resources) {
        C19383o.m32797g(resources, "resources");
        String string = resources.getString(R.string.popular_now_badge);
        C19383o.m32796f(string, "resources.getString(R.string.popular_now_badge)");
        return string;
    }

    public final boolean saleEndingEligible(long j) {
        return saleVisibility(j) == 0 && this.freeShippingVisibility == 8 && m19799f(this.listing.getPromotions(), this.listing.getPromotionData(), j);
    }

    public final String saleEndingText(Resources resources, long j) {
        C19383o.m32797g(resources, "resources");
        Long a = m19797a(this.listing.getPromotions(), this.listing.getPromotionData());
        if (a == null) {
            return "";
        }
        a.longValue();
        long longValue = (a.longValue() * ((long) 1000)) - j;
        TimeUnit timeUnit = TimeUnit.HOURS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long convert = timeUnit.convert(longValue, timeUnit2);
        long convert2 = TimeUnit.MINUTES.convert(longValue, timeUnit2);
        if (1 <= convert && convert < 49) {
            String quantityString = resources.getQuantityString(R.plurals.sale_ending_hours, (int) convert, new Object[]{Long.valueOf(convert)});
            C19383o.m32796f(quantityString, "resources.getQuantityStr…maining\n                )");
            return quantityString;
        }
        if (!(1 <= convert2 && convert2 < 60)) {
            return "";
        }
        String quantityString2 = resources.getQuantityString(R.plurals.sale_ending_mins, (int) convert2, new Object[]{Long.valueOf(convert2)});
        C19383o.m32796f(quantityString2, "resources.getQuantityStr…maining\n                )");
        return quantityString2;
    }

    public final boolean saleEndingVariantEligible(C8890e0 e0Var) {
        C19383o.m32797g(e0Var, "time");
        return saleVisibilityVariant(e0Var) == 0 && m19799f(this.listing.getPromotions(), this.listing.getPromotionData(), System.currentTimeMillis());
    }

    public final int saleVisibility(long j) {
        if (m19798e(this.listing.getPromotions(), this.listing.getPromotionData(), j) && !this.listing.isSoldOut() && this.signalListContainsPromotion) {
            String formattedDiscountedPrice = this.listing.getFormattedDiscountedPrice();
            C19383o.m32796f(formattedDiscountedPrice, "listing.formattedDiscountedPrice");
            if (formattedDiscountedPrice.length() > 0) {
                return 0;
            }
        }
        return 8;
    }

    public final int saleVisibilityVariant(C8890e0 e0Var) {
        C19383o.m32797g(e0Var, "time");
        if (m19798e(this.listing.getPromotions(), this.listing.getPromotionData(), System.currentTimeMillis()) && !this.listing.isSoldOut() && this.signalListContainsPromotionVariant) {
            String formattedDiscountedPrice = this.listing.getFormattedDiscountedPrice();
            C19383o.m32796f(formattedDiscountedPrice, "listing.formattedDiscountedPrice");
            if (formattedDiscountedPrice.length() > 0) {
                return 0;
            }
        }
        return 8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignalNudgeListingCardUiModel(Resources resources, ListingCard listingCard, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, listingCard, z, (i & 8) != 0 ? false : z2);
    }
}
