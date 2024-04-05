package com.etsy.android.lib.models.apiv3.listing.extensions;

import android.graphics.Color;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.Image;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import org.apache.commons.lang3.StringEscapeUtils;

public final class ListingFetchExtensionsKt {
    public static final List<ListingImage> convertListingImagesToV2(ListingFetch listingFetch) {
        C19383o.m32797g(listingFetch, "<this>");
        List<ListingImage> listingImages = listingFetch.getListingImages();
        if (listingImages == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(listingImages));
        for (ListingImage listingImage : listingImages) {
            Integer num = null;
            String color = listingImage.getColor();
            int i = 0;
            if (color != null) {
                if (!C19457k.m33025c1(color, "#", false)) {
                    color = '#' + color;
                }
                num = Integer.valueOf(Color.parseColor(color));
            }
            EtsyId imageId = listingImage.getImageId();
            String altText = listingImage.getAltText();
            String urlFullxFull = listingImage.getUrlFullxFull();
            String str = urlFullxFull == null ? "" : urlFullxFull;
            String url75x75 = listingImage.getUrl75x75();
            String str2 = url75x75 == null ? "" : url75x75;
            String url170x135 = listingImage.getUrl170x135();
            String str3 = url170x135 == null ? "" : url170x135;
            String url224xN = listingImage.getUrl224xN();
            String str4 = url224xN == null ? "" : url224xN;
            String url300x300 = listingImage.getUrl300x300();
            String str5 = url300x300 == null ? "" : url300x300;
            String url340x270 = listingImage.getUrl340x270();
            String str6 = url340x270 == null ? "" : url340x270;
            String url570xN = listingImage.getUrl570xN();
            String str7 = url570xN == null ? "" : url570xN;
            String url680x540 = listingImage.getUrl680x540();
            String str8 = url680x540 == null ? "" : url680x540;
            Integer hue = listingImage.getHue();
            int intValue = hue != null ? hue.intValue() : 0;
            Integer saturation = listingImage.getSaturation();
            int intValue2 = saturation != null ? saturation.intValue() : 0;
            int fullHeight = listingImage.getFullHeight();
            int fullWidth = listingImage.getFullWidth();
            int red = num != null ? Color.red(num.intValue()) : 0;
            int green = num != null ? Color.green(num.intValue()) : 0;
            if (num != null) {
                i = Color.blue(num.intValue());
            }
            arrayList.add(new ListingImage((String) null, red, green, i, (String) null, (String) null, 0, Integer.valueOf(intValue), imageId, (Integer) null, Integer.valueOf(intValue2), (String) null, (String) null, str3, str4, str5, str6, str7, (String) null, (String) null, str8, str2, str, (Integer) null, (Integer) null, fullWidth, fullHeight, (Integer) null, (Integer) null, (Long) null, altText, 0, (String) null, (String) null, false, -1182000527, 7, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = toV2((r1 = r1.getListingReviewImages()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.etsy.android.lib.models.ReviewImage> convertListingReviewImagesToV2(com.etsy.android.lib.models.apiv3.listing.ListingFetch r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            com.etsy.android.lib.models.apiv3.listing.Reviews r1 = r1.getReviews()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.getListingReviewImages()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = toV2(r1)
            if (r1 != 0) goto L_0x0019
        L_0x0017:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.ListingFetchExtensionsKt.convertListingReviewImagesToV2(com.etsy.android.lib.models.apiv3.listing.ListingFetch):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = toV2((r1 = r1.getShopReviewImages()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.etsy.android.lib.models.ReviewImage> convertShopReviewImagesToV2(com.etsy.android.lib.models.apiv3.listing.ListingFetch r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            com.etsy.android.lib.models.apiv3.listing.Reviews r1 = r1.getReviews()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.getShopReviewImages()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = toV2(r1)
            if (r1 != 0) goto L_0x0019
        L_0x0017:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.extensions.ListingFetchExtensionsKt.convertShopReviewImagesToV2(com.etsy.android.lib.models.apiv3.listing.ListingFetch):java.util.List");
    }

    public static final EtsyMoney getPrice(ListingFetch listingFetch, C8630b bVar) {
        C19383o.m32797g(listingFetch, "<this>");
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        return (listingFetch.getListing().getPrice() == null || listingFetch.getListing().getCurrencyCode() == null) ? bVar.mo21250c() : bVar.mo21248a(StringEscapeUtils.unescapeHtml4(listingFetch.getListing().getPrice()), StringEscapeUtils.unescapeHtml4(listingFetch.getListing().getCurrencyCode()));
    }

    public static final List<ReviewImage> toV2(List<com.etsy.android.lib.models.apiv3.listing.ReviewImage> list) {
        if (list == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (com.etsy.android.lib.models.apiv3.listing.ReviewImage reviewImage : list) {
            ReviewImage reviewImage2 = new ReviewImage();
            Image image = reviewImage.getImage();
            reviewImage2.setImage(image != null ? ImageExtensionsKt.convertToV2Image(image) : null);
            String review = reviewImage.getReview();
            String str = "";
            if (review == null) {
                review = str;
            }
            reviewImage2.setReviewText(review);
            reviewImage2.setTranslatedReview(reviewImage.getTranslatedReview());
            reviewImage2.setTranslationState(new MachineTranslationViewState(reviewImage2.getTranslatedReview()));
            int rating = reviewImage.getRating();
            if (rating == null) {
                rating = 0;
            }
            reviewImage2.setReviewRating(rating);
            String buyerAvatarUrl = reviewImage.getBuyerAvatarUrl();
            if (buyerAvatarUrl == null) {
                buyerAvatarUrl = str;
            }
            reviewImage2.setBuyerAvatarUrl(buyerAvatarUrl);
            String buyerName = reviewImage.getBuyerName();
            if (buyerName == null) {
                buyerName = str;
            }
            reviewImage2.setBuyerName(buyerName);
            String buyerProfileUrl = reviewImage.getBuyerProfileUrl();
            if (buyerProfileUrl != null) {
                str = buyerProfileUrl;
            }
            reviewImage2.setBuyerProfileUrl(str);
            Long createDate = reviewImage.getCreateDate();
            long j = 0;
            reviewImage2.setCreateDate(new Date((createDate != null ? createDate.longValue() : 0) * 1000));
            reviewImage2.setListingOnly(reviewImage.isListingOnly());
            Long listingId = reviewImage.getListingId();
            if (listingId != null) {
                j = listingId.longValue();
            }
            reviewImage2.setListingId(new EtsyId(j));
            reviewImage2.setListingTitle(reviewImage.getListingTitle());
            reviewImage2.setListingImages(reviewImage.getListingImages());
            reviewImage2.setTransactionId(reviewImage.getTransactionId());
            arrayList.add(reviewImage2);
        }
        return arrayList;
    }
}
