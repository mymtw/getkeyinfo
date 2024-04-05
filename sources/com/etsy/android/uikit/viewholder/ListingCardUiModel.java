package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import com.etsy.android.R;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.SearchImpressionMetadata;
import com.etsy.android.lib.models.apiv3.FreeShippingData;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.apiv3.Promotion;
import com.etsy.android.lib.models.apiv3.PromotionData;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.ListingVideo;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.Promotable;
import com.etsy.android.uikit.pageindicator.ScalingPageIndicator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ListingCardUiModel extends ListingCard implements Promotable {
    public static final int $stable = 8;

    /* renamed from: b */
    public final transient Resources f26574b;

    /* renamed from: c */
    public transient CharSequence f26575c;

    /* renamed from: d */
    public transient ScalingPageIndicator.C11872b f26576d;
    private final String discountedInfoContentDescription;
    private boolean hasFetchedAdditionalImages;
    private final boolean hasFreeShippingCopy;
    private final boolean hasPromotionCopy;
    private boolean hasSwipedAllImages;
    private final boolean hasVariationPrices;
    private final ListingCard listing;
    private final ListingVideo listingVideo;
    private final String menuItemContentDescription;
    private String priceContentDescription;
    private final String ratingsAndReviewsContentDescription;
    private final String renderedDiscountDescription;
    private final String renderedDiscountedPrice;
    private final String renderedFreeShippingCopy;
    private final String renderedPrice;
    private final float roundedRating;
    private final String shopReviewCountText;
    private SignalNudgeListingCardUiModel signalNudgeValues;
    private final String soldText;
    private final String titleContentDescription;
    private boolean viewedInLast24Hours;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingCardUiModel(ListingCard listingCard, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(listingCard, z, z2, (i & 8) != 0 ? false : z3);
    }

    /* renamed from: e */
    public final void mo38747e() {
        boolean z = true;
        if (this.renderedDiscountedPrice.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.renderedPrice);
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
            String str = this.renderedDiscountDescription;
            if (str.length() <= 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.append(" ").append(str);
            }
            this.f26575c = spannableStringBuilder;
            return;
        }
        this.f26575c = "";
    }

    public String getContentSource() {
        return this.listing.getContentSource();
    }

    public final String getDiscountedInfoContentDescription() {
        return this.discountedInfoContentDescription;
    }

    public Money getDiscountedPrice() {
        return this.listing.getDiscountedPrice();
    }

    public final String getFavIconContentDescription() {
        if (this.listing.isFavorite() || this.listing.hasCollections()) {
            String string = this.f26574b.getString(R.string.favorited, new Object[]{this.listing.getTitle()});
            C19383o.m32796f(string, "{\n                resour…ting.title)\n            }");
            return string;
        }
        String string2 = this.f26574b.getString(R.string.add_to_favorites, new Object[]{this.listing.getTitle()});
        C19383o.m32796f(string2, "{\n                resour…ting.title)\n            }");
        return string2;
    }

    public String getFormattedDiscountDescription() {
        return this.renderedDiscountDescription;
    }

    public String getFormattedDiscountedPrice() {
        return this.renderedDiscountedPrice;
    }

    public FreeShippingData getFreeShippingData() {
        return this.listing.getFreeShippingData();
    }

    public final boolean getHasFetchedAdditionalImages() {
        return this.hasFetchedAdditionalImages;
    }

    public final boolean getHasFreeShippingCopy() {
        return this.hasFreeShippingCopy;
    }

    public final boolean getHasPromotionCopy() {
        return this.hasPromotionCopy;
    }

    public final boolean getHasSwipedAllImages() {
        return this.hasSwipedAllImages;
    }

    public final boolean getHasVariationPrices() {
        return this.hasVariationPrices;
    }

    public ListingCardSize getListingCardSize() {
        return this.listing.getListingCardSize();
    }

    public EtsyId getListingId() {
        EtsyId listingId = this.listing.getListingId();
        C19383o.m32796f(listingId, "listing.listingId");
        return listingId;
    }

    public ListingImage getListingImage() {
        return this.listing.getListingImage();
    }

    public int getListingImageCount() {
        return this.listing.getListingImageCount();
    }

    public List<ListingImage> getListingImages() {
        List<ListingImage> listingImages = this.listing.getListingImages();
        C19383o.m32796f(listingImages, "listing.listingImages");
        return listingImages;
    }

    public final ListingVideo getListingVideo() {
        return this.listingVideo;
    }

    public final String getMenuItemContentDescription() {
        return this.menuItemContentDescription;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return C19388s.m32861f0(this.listing);
    }

    public EtsyMoney getPrice() {
        return this.listing.getPrice();
    }

    public String getPriceAsString() {
        if (this.listing.isSoldOut()) {
            return this.soldText;
        }
        String priceAsString = this.listing.getPriceAsString();
        C19383o.m32796f(priceAsString, "{\n            listing.priceAsString\n        }");
        return priceAsString;
    }

    public final String getPriceContentDescription() {
        return this.priceContentDescription;
    }

    public double getPriceUnformatted() {
        return this.listing.getPriceUnformatted();
    }

    public String getProlistDisplayLocation() {
        return this.listing.getProlistDisplayLocation();
    }

    public String getProlistLoggingKey() {
        return this.listing.getProlistLoggingKey();
    }

    public PromotionData getPromotionData() {
        return this.listing.getPromotionData();
    }

    public List<Promotion> getPromotions() {
        return this.listing.getPromotions();
    }

    public int getQuantity() {
        return this.listing.getQuantity();
    }

    public final String getRatingsAndReviewsContentDescription() {
        return this.ratingsAndReviewsContentDescription;
    }

    public final String getRenderedDiscountDescription() {
        return this.renderedDiscountDescription;
    }

    public final CharSequence getRenderedDiscountInfo() {
        if (this.f26575c == null) {
            mo38747e();
        }
        return this.f26575c;
    }

    public final String getRenderedDiscountedPrice() {
        return this.renderedDiscountedPrice;
    }

    public final String getRenderedFreeShippingCopy() {
        return this.renderedFreeShippingCopy;
    }

    public final String getRenderedPrice() {
        return this.renderedPrice;
    }

    public final Resources getResources() {
        return this.f26574b;
    }

    public final float getRoundedRating() {
        return this.roundedRating;
    }

    public final ScalingPageIndicator.C11872b getScalingPageIndicatorState() {
        return this.f26576d;
    }

    public SearchImpressionMetadata getSearchImpressionMetadata() {
        return this.listing.getSearchImpressionMetadata();
    }

    public float getShopAverageRating() {
        return this.listing.getShopAverageRating();
    }

    public EtsyId getShopId() {
        return this.listing.getShopId();
    }

    public String getShopName() {
        return this.listing.getShopName();
    }

    public final String getShopReviewCountText() {
        return this.shopReviewCountText;
    }

    public int getShopTotalRatingCount() {
        return this.listing.getShopTotalRatingCount();
    }

    public final SignalNudgeListingCardUiModel getSignalNudgeValues() {
        return this.signalNudgeValues;
    }

    public List<String> getSignalPeckingOrderList() {
        return this.listing.getSignalPeckingOrderList();
    }

    public final String getSoldText() {
        return this.soldText;
    }

    public String getTitle() {
        return this.listing.getTitle();
    }

    public final String getTitleContentDescription() {
        return this.titleContentDescription;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        ListingCard listingCard = this.listing;
        C19383o.m32797g(listingCard, "<this>");
        return C19388s.m32880q0(listingCard);
    }

    @JsonIgnore
    public String getTrackingName() {
        return C19388s.m32863g0(this.listing);
    }

    @JsonIgnore
    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        ListingCard listingCard = this.listing;
        C19383o.m32797g(listingCard, "<this>");
        return C19294b0.m32558A0(C19388s.m32882r0(listingCard));
    }

    public String getUrl() {
        return this.listing.getUrl();
    }

    public int getViewType() {
        return this.listing.getViewType();
    }

    public final boolean getViewedInLast24Hours() {
        return this.viewedInLast24Hours;
    }

    public boolean hasCollections() {
        return this.listing.hasCollections();
    }

    public boolean hasColorVariations() {
        return this.listing.hasColorVariations();
    }

    public boolean hasError() {
        return this.listing.hasError();
    }

    public boolean isAd() {
        return this.listing.isAd();
    }

    public boolean isBestseller() {
        return this.listing.isBestseller();
    }

    public boolean isCustomizable() {
        return this.listing.isCustomizable();
    }

    public boolean isDownload() {
        return this.listing.isDownload();
    }

    public boolean isFavorite() {
        return this.listing.isFavorite();
    }

    public boolean isInCart() {
        return this.listing.isInCart();
    }

    public boolean isSoldOut() {
        return this.listing.isSoldOut();
    }

    public boolean isVintage() {
        return this.listing.isVintage();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        C19383o.m32797g(jsonParser, "jp");
        this.listing.parseData(jsonParser);
    }

    public void setHasCollections(boolean z) {
        this.listing.setHasCollections(z);
    }

    public final void setHasFetchedAdditionalImages(boolean z) {
        this.hasFetchedAdditionalImages = z;
    }

    public final void setHasSwipedAllImages(boolean z) {
        this.hasSwipedAllImages = z;
    }

    public void setIsFavorite(boolean z) {
        this.listing.setIsFavorite(z);
    }

    public void setListingImages(List<ListingImage> list) {
        C19383o.m32797g(list, "listingImages");
        this.listing.setListingImages(list);
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "value");
        ListingCard listingCard = this.listing;
        C19383o.m32797g(listingCard, "<this>");
        C19388s.m32820F0(listingCard, list);
    }

    public final void setPriceContentDescription(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.priceContentDescription = str;
    }

    public final void setScalingPageIndicatorState(ScalingPageIndicator.C11872b bVar) {
        this.f26576d = bVar;
    }

    public void setShouldShowRelatedListings(boolean z) {
        this.listing.setShouldShowRelatedListings(z);
    }

    public final void setSignalNudgeValues(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel) {
        this.signalNudgeValues = signalNudgeListingCardUiModel;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
        ListingCard listingCard = this.listing;
        C19383o.m32797g(listingCard, "<this>");
        C19388s.m32822G0(listingCard, i);
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    @JsonIgnore
    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        ListingCard listingCard = this.listing;
        if (map == null) {
            map = C19294b0.m32559p0();
        }
        C19388s.m32898z0(listingCard, map);
    }

    public void setViewType(int i) {
        this.listing.setViewType(i);
    }

    public final void setViewedInLast24Hours(boolean z) {
        this.viewedInLast24Hours = z;
    }

    public boolean shouldShowPricePill() {
        return this.listing.shouldShowPricePill();
    }

    public boolean shouldShowRelatedListings() {
        return this.listing.shouldShowRelatedListings();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x00a4, code lost:
        r2 = r2.getFreeShippingCopy();
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ListingCardUiModel(com.etsy.android.lib.models.apiv3.ListingCard r8, boolean r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            java.lang.String r0 = "listing"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            r7.<init>()
            r7.listing = r8
            com.etsy.android.lib.core.EtsyApplication r0 = com.etsy.android.lib.core.EtsyApplication.get()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "get().resources"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            r7.f26574b = r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r8.getTitle()
            r4 = 0
            r2[r4] = r3
            r3 = 2131952393(0x7f130309, float:1.9541227E38)
            java.lang.String r2 = r0.getString(r3, r2)
            java.lang.String r3 = "resources.getString(R.st…em_button, listing.title)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r7.titleContentDescription = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r8.getShopTotalRatingCount()
            double r5 = (double) r3
            java.lang.String r3 = com.etsy.android.lib.util.C8885d0.m17318b(r5)
            r2[r4] = r3
            r3 = 2131952732(0x7f13045c, float:1.9541915E38)
            java.lang.String r2 = r0.getString(r3, r2)
            java.lang.String r3 = "resources.getString(\n   …gCount.toDouble()),\n    )"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r7.shopReviewCountText = r2
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            float r5 = r7.getShopAverageRating()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r4] = r5
            java.lang.String r5 = "5"
            r3[r1] = r5
            r5 = 2
            r3[r5] = r2
            r2 = 2131953307(0x7f13069b, float:1.9543081E38)
            java.lang.String r2 = r0.getString(r2, r3)
            java.lang.String r3 = "resources.getString(\n   …hopReviewCountText,\n    )"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r7.ratingsAndReviewsContentDescription = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r8.getTitle()
            r2[r4] = r3
            r3 = 2131953539(0x7f130783, float:1.9543552E38)
            java.lang.String r2 = r0.getString(r3, r2)
            java.lang.String r3 = "resources.getString(R.st…tions_for, listing.title)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r7.menuItemContentDescription = r2
            r2 = 2131953569(0x7f1307a1, float:1.9543613E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "resources.getString(R.string.sold)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r7.soldText = r2
            com.etsy.android.lib.currency.EtsyMoney r2 = r8.getPrice()
            java.lang.String r2 = r2.format()
            r7.renderedPrice = r2
            com.etsy.android.lib.models.apiv3.FreeShippingData r2 = r8.getFreeShippingData()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = r2.getFreeShippingCopy()
            if (r2 != 0) goto L_0x00ab
        L_0x00aa:
            r2 = r3
        L_0x00ab:
            r7.renderedFreeShippingCopy = r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00b5
            r2 = r1
            goto L_0x00b6
        L_0x00b5:
            r2 = r4
        L_0x00b6:
            r7.hasFreeShippingCopy = r2
            java.lang.String r2 = r8.getFormattedDiscountedPrice()
            java.lang.String r5 = "listing.formattedDiscountedPrice"
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            r7.renderedDiscountedPrice = r2
            java.lang.String r5 = r8.getFormattedDiscountDescription()
            java.lang.String r6 = "listing.formattedDiscountDescription"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r7.renderedDiscountDescription = r5
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x00d6
            r6 = r1
            goto L_0x00d7
        L_0x00d6:
            r6 = r4
        L_0x00d7:
            if (r6 != 0) goto L_0x00e7
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x00e1
            r5 = r1
            goto L_0x00e2
        L_0x00e1:
            r5 = r4
        L_0x00e2:
            if (r5 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r5 = r4
            goto L_0x00e8
        L_0x00e7:
            r5 = r1
        L_0x00e8:
            r7.hasPromotionCopy = r5
            float r5 = r7.getShopAverageRating()
            float r5 = com.google.android.play.core.assetpacks.C15588c1.m25295N0(r5)
            r7.roundedRating = r5
            java.util.List r5 = r8.getListingVideos()
            java.lang.String r6 = "listing.listingVideos"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            java.lang.Object r5 = kotlin.collections.C19327t.m32640V0(r5)
            com.etsy.android.lib.models.apiv3.listing.ListingVideo r5 = (com.etsy.android.lib.models.apiv3.listing.ListingVideo) r5
            r7.listingVideo = r5
            boolean r5 = r8.hasVariationPrices()
            r7.hasVariationPrices = r5
            r7.mo38747e()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x0116
            r5 = r1
            goto L_0x0117
        L_0x0116:
            r5 = r4
        L_0x0117:
            if (r5 == 0) goto L_0x0142
            r3 = 2131952709(0x7f130445, float:1.9541868E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.CharSequence r6 = r7.getRenderedDiscountInfo()
            r5[r4] = r6
            java.lang.String r3 = r0.getString(r3, r5)
            java.lang.String r5 = "resources.getString(R.st…ce, renderedDiscountInfo)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            r7.discountedInfoContentDescription = r3
            r3 = 2131952651(0x7f13040b, float:1.954175E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r2
            java.lang.String r1 = r0.getString(r3, r1)
            java.lang.String r2 = "resources.getString(R.st… renderedDiscountedPrice)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            r7.priceContentDescription = r1
            goto L_0x0146
        L_0x0142:
            r7.discountedInfoContentDescription = r3
            r7.priceContentDescription = r3
        L_0x0146:
            if (r9 == 0) goto L_0x014f
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r9 = new com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel
            r9.<init>(r0, r8, r10, r11)
            r7.signalNudgeValues = r9
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.ListingCardUiModel.<init>(com.etsy.android.lib.models.apiv3.ListingCard, boolean, boolean, boolean):void");
    }
}
