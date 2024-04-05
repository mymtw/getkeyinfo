package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class InAppNotificationThankYouCoupon extends InAppNotification {
    public static final int $stable = 8;
    private boolean buttonEnabled;
    private String buttonText;
    private InAppNotificationClickType clickType;
    private String couponCode;
    private String disclaimerText;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private long promoId;
    private String promoText;
    private ShopIcon shopIcon;
    private long shopId;
    private String text;
    private String timePassed;
    private String unavailableText;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationThankYouCoupon(String str, Long l, String str2, String str3, long j, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, boolean z, String str4, String str5, boolean z2, String str6, String str7, long j2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, j, shopIcon2, inAppNotificationClickType, z, str4, str5, z2, str6, str7, j2, str8);
    }

    public static /* synthetic */ InAppNotificationThankYouCoupon copy$default(InAppNotificationThankYouCoupon inAppNotificationThankYouCoupon, String str, Long l, String str2, String str3, long j, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, boolean z, String str4, String str5, boolean z2, String str6, String str7, long j2, String str8, int i, Object obj) {
        InAppNotificationThankYouCoupon inAppNotificationThankYouCoupon2 = inAppNotificationThankYouCoupon;
        int i2 = i;
        return inAppNotificationThankYouCoupon.copy((i2 & 1) != 0 ? inAppNotificationThankYouCoupon2.feedId : str, (i2 & 2) != 0 ? inAppNotificationThankYouCoupon2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationThankYouCoupon2.text : str2, (i2 & 8) != 0 ? inAppNotificationThankYouCoupon2.timePassed : str3, (i2 & 16) != 0 ? inAppNotificationThankYouCoupon2.shopId : j, (i2 & 32) != 0 ? inAppNotificationThankYouCoupon2.shopIcon : shopIcon2, (i2 & 64) != 0 ? inAppNotificationThankYouCoupon2.clickType : inAppNotificationClickType, (i2 & 128) != 0 ? inAppNotificationThankYouCoupon2.isRead : z, (i2 & 256) != 0 ? inAppNotificationThankYouCoupon2.buttonText : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationThankYouCoupon2.couponCode : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? inAppNotificationThankYouCoupon2.buttonEnabled : z2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? inAppNotificationThankYouCoupon2.promoText : str6, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? inAppNotificationThankYouCoupon2.unavailableText : str7, (i2 & 8192) != 0 ? inAppNotificationThankYouCoupon2.promoId : j2, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? inAppNotificationThankYouCoupon2.disclaimerText : str8);
    }

    public final String component1() {
        return this.feedId;
    }

    public final String component10() {
        return this.couponCode;
    }

    public final boolean component11() {
        return this.buttonEnabled;
    }

    public final String component12() {
        return this.promoText;
    }

    public final String component13() {
        return this.unavailableText;
    }

    public final long component14() {
        return this.promoId;
    }

    public final String component15() {
        return this.disclaimerText;
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

    public final boolean component8() {
        return this.isRead;
    }

    public final String component9() {
        return this.buttonText;
    }

    public final InAppNotificationThankYouCoupon copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "read") boolean z, @C17402n(name = "button_text") String str4, @C17402n(name = "coupon_code") String str5, @C17402n(name = "button_enabled") boolean z2, @C17402n(name = "promotion_text") String str6, @C17402n(name = "unavailable_message") String str7, @C17402n(name = "promotion_id") long j2, @C17402n(name = "disclaimer_message") String str8) {
        String str9 = str;
        C19383o.m32797g(str9, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        C19383o.m32797g(str5, "couponCode");
        C19383o.m32797g(str6, "promoText");
        C19383o.m32797g(str8, "disclaimerText");
        return new InAppNotificationThankYouCoupon(str9, l, str2, str3, j, shopIcon2, inAppNotificationClickType, z, str4, str5, z2, str6, str7, j2, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationThankYouCoupon)) {
            return false;
        }
        InAppNotificationThankYouCoupon inAppNotificationThankYouCoupon = (InAppNotificationThankYouCoupon) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationThankYouCoupon.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationThankYouCoupon.feedIndex) && C19383o.m32792b(this.text, inAppNotificationThankYouCoupon.text) && C19383o.m32792b(this.timePassed, inAppNotificationThankYouCoupon.timePassed) && this.shopId == inAppNotificationThankYouCoupon.shopId && C19383o.m32792b(this.shopIcon, inAppNotificationThankYouCoupon.shopIcon) && this.clickType == inAppNotificationThankYouCoupon.clickType && this.isRead == inAppNotificationThankYouCoupon.isRead && C19383o.m32792b(this.buttonText, inAppNotificationThankYouCoupon.buttonText) && C19383o.m32792b(this.couponCode, inAppNotificationThankYouCoupon.couponCode) && this.buttonEnabled == inAppNotificationThankYouCoupon.buttonEnabled && C19383o.m32792b(this.promoText, inAppNotificationThankYouCoupon.promoText) && C19383o.m32792b(this.unavailableText, inAppNotificationThankYouCoupon.unavailableText) && this.promoId == inAppNotificationThankYouCoupon.promoId && C19383o.m32792b(this.disclaimerText, inAppNotificationThankYouCoupon.disclaimerText);
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

    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final Long getFeedIndex() {
        return this.feedIndex;
    }

    public final long getPromoId() {
        return this.promoId;
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
        boolean z = this.isRead;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str3 = this.buttonText;
        int e = C0023f.m105e(this.couponCode, (i2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z3 = this.buttonEnabled;
        if (!z3) {
            z2 = z3;
        }
        int e2 = C0023f.m105e(this.promoText, (e + (z2 ? 1 : 0)) * 31, 31);
        String str4 = this.unavailableText;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return this.disclaimerText.hashCode() + C0071c.m190b(this.promoId, (e2 + i) * 31, 31);
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

    public final void setDisclaimerText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.disclaimerText = str;
    }

    public final void setFeedId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.feedId = str;
    }

    public final void setFeedIndex(Long l) {
        this.feedIndex = l;
    }

    public final void setPromoId(long j) {
        this.promoId = j;
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
        StringBuilder h = C0072d.m201h("InAppNotificationThankYouCoupon(feedId=");
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
        h.append(", promoId=");
        h.append(this.promoId);
        h.append(", disclaimerText=");
        return C0391c.m1057c(h, this.disclaimerText, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationThankYouCoupon(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "read") boolean z, @C17402n(name = "button_text") String str4, @C17402n(name = "coupon_code") String str5, @C17402n(name = "button_enabled") boolean z2, @C17402n(name = "promotion_text") String str6, @C17402n(name = "unavailable_message") String str7, @C17402n(name = "promotion_id") long j2, @C17402n(name = "disclaimer_message") String str8) {
        super(InAppNotificationType.THANK_YOU_COUPON);
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        String str9 = str5;
        String str10 = str6;
        String str11 = str8;
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        C19383o.m32797g(str9, "couponCode");
        C19383o.m32797g(str10, "promoText");
        C19383o.m32797g(str11, "disclaimerText");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.timePassed = str3;
        this.shopId = j;
        this.shopIcon = shopIcon2;
        this.clickType = inAppNotificationClickType2;
        this.isRead = z;
        this.buttonText = str4;
        this.couponCode = str9;
        this.buttonEnabled = z2;
        this.promoText = str10;
        this.unavailableText = str7;
        this.promoId = j2;
        this.disclaimerText = str11;
    }
}
