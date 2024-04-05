package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class InAppNotificationAbandonedCartOffer extends InAppNotification {
    public static final int $stable = 8;
    private boolean buttonEnabled;
    private String buttonText;
    private InAppNotificationClickType clickType;
    private String couponCode;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private List<IANListingCard> listings;
    private long promoOfferId;
    private List<String> promoOfferTokens;
    private String promoText;
    private ShopIcon shopIcon;
    private long shopId;
    private String text;
    private String timePassed;
    private String unavailableText;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationAbandonedCartOffer(String str, Long l, String str2, String str3, long j, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, List list, boolean z, String str4, String str5, boolean z2, String str6, String str7, long j2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, j, shopIcon2, inAppNotificationClickType, list, z, str4, str5, z2, str6, str7, j2, list2);
    }

    public static /* synthetic */ InAppNotificationAbandonedCartOffer copy$default(InAppNotificationAbandonedCartOffer inAppNotificationAbandonedCartOffer, String str, Long l, String str2, String str3, long j, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, List list, boolean z, String str4, String str5, boolean z2, String str6, String str7, long j2, List list2, int i, Object obj) {
        InAppNotificationAbandonedCartOffer inAppNotificationAbandonedCartOffer2 = inAppNotificationAbandonedCartOffer;
        int i2 = i;
        return inAppNotificationAbandonedCartOffer.copy((i2 & 1) != 0 ? inAppNotificationAbandonedCartOffer2.feedId : str, (i2 & 2) != 0 ? inAppNotificationAbandonedCartOffer2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationAbandonedCartOffer2.text : str2, (i2 & 8) != 0 ? inAppNotificationAbandonedCartOffer2.timePassed : str3, (i2 & 16) != 0 ? inAppNotificationAbandonedCartOffer2.shopId : j, (i2 & 32) != 0 ? inAppNotificationAbandonedCartOffer2.shopIcon : shopIcon2, (i2 & 64) != 0 ? inAppNotificationAbandonedCartOffer2.clickType : inAppNotificationClickType, (i2 & 128) != 0 ? inAppNotificationAbandonedCartOffer2.listings : list, (i2 & 256) != 0 ? inAppNotificationAbandonedCartOffer2.isRead : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationAbandonedCartOffer2.buttonText : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? inAppNotificationAbandonedCartOffer2.couponCode : str5, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? inAppNotificationAbandonedCartOffer2.buttonEnabled : z2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? inAppNotificationAbandonedCartOffer2.promoText : str6, (i2 & 8192) != 0 ? inAppNotificationAbandonedCartOffer2.unavailableText : str7, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? inAppNotificationAbandonedCartOffer2.promoOfferId : j2, (i2 & 32768) != 0 ? inAppNotificationAbandonedCartOffer2.promoOfferTokens : list2);
    }

    public final String component1() {
        return this.feedId;
    }

    public final String component10() {
        return this.buttonText;
    }

    public final String component11() {
        return this.couponCode;
    }

    public final boolean component12() {
        return this.buttonEnabled;
    }

    public final String component13() {
        return this.promoText;
    }

    public final String component14() {
        return this.unavailableText;
    }

    public final long component15() {
        return this.promoOfferId;
    }

    public final List<String> component16() {
        return this.promoOfferTokens;
    }

    public final Long component2() {
        return this.feedIndex;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.timePassed;
    }

    public final long component5() {
        return this.shopId;
    }

    public final ShopIcon component6() {
        return this.shopIcon;
    }

    public final InAppNotificationClickType component7() {
        return this.clickType;
    }

    public final List<IANListingCard> component8() {
        return this.listings;
    }

    public final boolean component9() {
        return this.isRead;
    }

    public final InAppNotificationAbandonedCartOffer copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "button_text") String str4, @C17402n(name = "coupon_code") String str5, @C17402n(name = "button_enabled") boolean z2, @C17402n(name = "promotion_text") String str6, @C17402n(name = "unavailable_message") String str7, @C17402n(name = "promoted_offer_id") long j2, @C17402n(name = "promoted_offer_listing_tokens") List<String> list2) {
        String str8 = str;
        C19383o.m32797g(str8, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        C19383o.m32797g(str5, "couponCode");
        C19383o.m32797g(str6, "promoText");
        return new InAppNotificationAbandonedCartOffer(str8, l, str2, str3, j, shopIcon2, inAppNotificationClickType, list, z, str4, str5, z2, str6, str7, j2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationAbandonedCartOffer)) {
            return false;
        }
        InAppNotificationAbandonedCartOffer inAppNotificationAbandonedCartOffer = (InAppNotificationAbandonedCartOffer) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationAbandonedCartOffer.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationAbandonedCartOffer.feedIndex) && C19383o.m32792b(this.text, inAppNotificationAbandonedCartOffer.text) && C19383o.m32792b(this.timePassed, inAppNotificationAbandonedCartOffer.timePassed) && this.shopId == inAppNotificationAbandonedCartOffer.shopId && C19383o.m32792b(this.shopIcon, inAppNotificationAbandonedCartOffer.shopIcon) && this.clickType == inAppNotificationAbandonedCartOffer.clickType && C19383o.m32792b(this.listings, inAppNotificationAbandonedCartOffer.listings) && this.isRead == inAppNotificationAbandonedCartOffer.isRead && C19383o.m32792b(this.buttonText, inAppNotificationAbandonedCartOffer.buttonText) && C19383o.m32792b(this.couponCode, inAppNotificationAbandonedCartOffer.couponCode) && this.buttonEnabled == inAppNotificationAbandonedCartOffer.buttonEnabled && C19383o.m32792b(this.promoText, inAppNotificationAbandonedCartOffer.promoText) && C19383o.m32792b(this.unavailableText, inAppNotificationAbandonedCartOffer.unavailableText) && this.promoOfferId == inAppNotificationAbandonedCartOffer.promoOfferId && C19383o.m32792b(this.promoOfferTokens, inAppNotificationAbandonedCartOffer.promoOfferTokens);
    }

    public final IANListingCard findListing(long j) {
        boolean z;
        List<IANListingCard> list = this.listings;
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Long listingId = ((IANListingCard) next).getListingId();
            if (listingId != null && listingId.longValue() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (IANListingCard) t;
    }

    public final boolean getButtonEnabled() {
        return this.buttonEnabled;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final InAppNotificationClickType getClickType() {
        return this.clickType;
    }

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final Long getFeedIndex() {
        return this.feedIndex;
    }

    public final List<IANListingCard> getListings() {
        return this.listings;
    }

    public final long getPromoOfferId() {
        return this.promoOfferId;
    }

    public final List<String> getPromoOfferTokens() {
        return this.promoOfferTokens;
    }

    public final String getPromoText() {
        return this.promoText;
    }

    public final ShopIcon getShopIcon() {
        return this.shopIcon;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTimePassed() {
        return this.timePassed;
    }

    public final String getUnavailableText() {
        return this.unavailableText;
    }

    public int hashCode() {
        int hashCode = this.feedId.hashCode() * 31;
        Long l = this.feedIndex;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timePassed;
        int b = C0071c.m190b(this.shopId, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ShopIcon shopIcon2 = this.shopIcon;
        int hashCode4 = (this.clickType.hashCode() + ((b + (shopIcon2 == null ? 0 : shopIcon2.hashCode())) * 31)) * 31;
        List<IANListingCard> list = this.listings;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.isRead;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str3 = this.buttonText;
        int e = C0023f.m105e(this.couponCode, (i2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z3 = this.buttonEnabled;
        if (!z3) {
            z2 = z3;
        }
        int e2 = C0023f.m105e(this.promoText, (e + (z2 ? 1 : 0)) * 31, 31);
        String str4 = this.unavailableText;
        int b2 = C0071c.m190b(this.promoOfferId, (e2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        List<String> list2 = this.promoOfferTokens;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return b2 + i;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setButtonEnabled(boolean z) {
        this.buttonEnabled = z;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setClickType(InAppNotificationClickType inAppNotificationClickType) {
        C19383o.m32797g(inAppNotificationClickType, "<set-?>");
        this.clickType = inAppNotificationClickType;
    }

    public final void setCouponCode(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.couponCode = str;
    }

    public final void setFeedId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.feedId = str;
    }

    public final void setFeedIndex(Long l) {
        this.feedIndex = l;
    }

    public final void setListings(List<IANListingCard> list) {
        this.listings = list;
    }

    public final void setPromoOfferId(long j) {
        this.promoOfferId = j;
    }

    public final void setPromoOfferTokens(List<String> list) {
        this.promoOfferTokens = list;
    }

    public final void setPromoText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.promoText = str;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setShopIcon(ShopIcon shopIcon2) {
        this.shopIcon = shopIcon2;
    }

    public final void setShopId(long j) {
        this.shopId = j;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTimePassed(String str) {
        this.timePassed = str;
    }

    public final void setUnavailableText(String str) {
        this.unavailableText = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationAbandonedCartOffer(feedId=");
        h.append(this.feedId);
        h.append(", feedIndex=");
        h.append(this.feedIndex);
        h.append(", text=");
        h.append(this.text);
        h.append(", timePassed=");
        h.append(this.timePassed);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", shopIcon=");
        h.append(this.shopIcon);
        h.append(", clickType=");
        h.append(this.clickType);
        h.append(", listings=");
        h.append(this.listings);
        h.append(", isRead=");
        h.append(this.isRead);
        h.append(", buttonText=");
        h.append(this.buttonText);
        h.append(", couponCode=");
        h.append(this.couponCode);
        h.append(", buttonEnabled=");
        h.append(this.buttonEnabled);
        h.append(", promoText=");
        h.append(this.promoText);
        h.append(", unavailableText=");
        h.append(this.unavailableText);
        h.append(", promoOfferId=");
        h.append(this.promoOfferId);
        h.append(", promoOfferTokens=");
        return C0070b.m186i(h, this.promoOfferTokens, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationAbandonedCartOffer(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "button_text") String str4, @C17402n(name = "coupon_code") String str5, @C17402n(name = "button_enabled") boolean z2, @C17402n(name = "promotion_text") String str6, @C17402n(name = "unavailable_message") String str7, @C17402n(name = "promoted_offer_id") long j2, @C17402n(name = "promoted_offer_listing_tokens") List<String> list2) {
        super(InAppNotificationType.ABANDONED_CART_OFFER);
        String str8 = str5;
        String str9 = str6;
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        C19383o.m32797g(str8, "couponCode");
        C19383o.m32797g(str9, "promoText");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.timePassed = str3;
        this.shopId = j;
        this.shopIcon = shopIcon2;
        this.clickType = inAppNotificationClickType;
        this.listings = list;
        this.isRead = z;
        this.buttonText = str4;
        this.couponCode = str8;
        this.buttonEnabled = z2;
        this.promoText = str9;
        this.unavailableText = str7;
        this.promoOfferId = j2;
        this.promoOfferTokens = list2;
    }
}
