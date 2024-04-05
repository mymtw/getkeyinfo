package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class InAppNotificationShopSale extends InAppNotification {
    public static final int $stable = 8;
    private InAppNotificationClickType clickType;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private List<IANListingCard> listings;
    private ShopIcon shopIcon;
    private long shopId;
    private String text;
    private String timePassed;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationShopSale(String str, Long l, String str2, String str3, long j, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, j, shopIcon2, inAppNotificationClickType, list, z);
    }

    public static /* synthetic */ InAppNotificationShopSale copy$default(InAppNotificationShopSale inAppNotificationShopSale, String str, Long l, String str2, String str3, long j, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, List list, boolean z, int i, Object obj) {
        InAppNotificationShopSale inAppNotificationShopSale2 = inAppNotificationShopSale;
        int i2 = i;
        return inAppNotificationShopSale.copy((i2 & 1) != 0 ? inAppNotificationShopSale2.feedId : str, (i2 & 2) != 0 ? inAppNotificationShopSale2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationShopSale2.text : str2, (i2 & 8) != 0 ? inAppNotificationShopSale2.timePassed : str3, (i2 & 16) != 0 ? inAppNotificationShopSale2.shopId : j, (i2 & 32) != 0 ? inAppNotificationShopSale2.shopIcon : shopIcon2, (i2 & 64) != 0 ? inAppNotificationShopSale2.clickType : inAppNotificationClickType, (i2 & 128) != 0 ? inAppNotificationShopSale2.listings : list, (i2 & 256) != 0 ? inAppNotificationShopSale2.isRead : z);
    }

    public final String component1() {
        return this.feedId;
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

    public final InAppNotificationShopSale copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z) {
        C19383o.m32797g(str, "feedId");
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        return new InAppNotificationShopSale(str, l, str2, str3, j, shopIcon2, inAppNotificationClickType2, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationShopSale)) {
            return false;
        }
        InAppNotificationShopSale inAppNotificationShopSale = (InAppNotificationShopSale) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationShopSale.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationShopSale.feedIndex) && C19383o.m32792b(this.text, inAppNotificationShopSale.text) && C19383o.m32792b(this.timePassed, inAppNotificationShopSale.timePassed) && this.shopId == inAppNotificationShopSale.shopId && C19383o.m32792b(this.shopIcon, inAppNotificationShopSale.shopIcon) && this.clickType == inAppNotificationShopSale.clickType && C19383o.m32792b(this.listings, inAppNotificationShopSale.listings) && this.isRead == inAppNotificationShopSale.isRead;
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

    public final InAppNotificationClickType getClickType() {
        return this.clickType;
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
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setClickType(InAppNotificationClickType inAppNotificationClickType) {
        C19383o.m32797g(inAppNotificationClickType, "<set-?>");
        this.clickType = inAppNotificationClickType;
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

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationShopSale(feedId=");
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
        return C0391c.m1058d(h, this.isRead, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationShopSale(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z) {
        super(InAppNotificationType.SHOPSALE);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.timePassed = str3;
        this.shopId = j;
        this.shopIcon = shopIcon2;
        this.clickType = inAppNotificationClickType;
        this.listings = list;
        this.isRead = z;
    }
}
