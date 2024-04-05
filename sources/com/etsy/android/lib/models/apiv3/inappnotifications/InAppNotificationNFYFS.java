package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class InAppNotificationNFYFS extends InAppNotification {
    public static final int $stable = 8;
    private InAppNotificationClickType clickType;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private Long listingId;
    private List<IANListingCard> listings;
    private ShopIcon shopIcon;
    private Long shopId;
    private String text;
    private String timePassed;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationNFYFS(String str, Long l, String str2, String str3, Long l2, Long l3, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, l2, l3, shopIcon2, inAppNotificationClickType, list, z);
    }

    public static /* synthetic */ InAppNotificationNFYFS copy$default(InAppNotificationNFYFS inAppNotificationNFYFS, String str, Long l, String str2, String str3, Long l2, Long l3, ShopIcon shopIcon2, InAppNotificationClickType inAppNotificationClickType, List list, boolean z, int i, Object obj) {
        InAppNotificationNFYFS inAppNotificationNFYFS2 = inAppNotificationNFYFS;
        int i2 = i;
        return inAppNotificationNFYFS.copy((i2 & 1) != 0 ? inAppNotificationNFYFS2.feedId : str, (i2 & 2) != 0 ? inAppNotificationNFYFS2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationNFYFS2.text : str2, (i2 & 8) != 0 ? inAppNotificationNFYFS2.timePassed : str3, (i2 & 16) != 0 ? inAppNotificationNFYFS2.shopId : l2, (i2 & 32) != 0 ? inAppNotificationNFYFS2.listingId : l3, (i2 & 64) != 0 ? inAppNotificationNFYFS2.shopIcon : shopIcon2, (i2 & 128) != 0 ? inAppNotificationNFYFS2.clickType : inAppNotificationClickType, (i2 & 256) != 0 ? inAppNotificationNFYFS2.listings : list, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationNFYFS2.isRead : z);
    }

    public final String component1() {
        return this.feedId;
    }

    public final boolean component10() {
        return this.isRead;
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

    public final Long component5() {
        return this.shopId;
    }

    public final Long component6() {
        return this.listingId;
    }

    public final ShopIcon component7() {
        return this.shopIcon;
    }

    public final InAppNotificationClickType component8() {
        return this.clickType;
    }

    public final List<IANListingCard> component9() {
        return this.listings;
    }

    public final InAppNotificationNFYFS copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") Long l2, @C17402n(name = "listing_id") Long l3, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z) {
        C19383o.m32797g(str, "feedId");
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        return new InAppNotificationNFYFS(str, l, str2, str3, l2, l3, shopIcon2, inAppNotificationClickType2, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationNFYFS)) {
            return false;
        }
        InAppNotificationNFYFS inAppNotificationNFYFS = (InAppNotificationNFYFS) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationNFYFS.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationNFYFS.feedIndex) && C19383o.m32792b(this.text, inAppNotificationNFYFS.text) && C19383o.m32792b(this.timePassed, inAppNotificationNFYFS.timePassed) && C19383o.m32792b(this.shopId, inAppNotificationNFYFS.shopId) && C19383o.m32792b(this.listingId, inAppNotificationNFYFS.listingId) && C19383o.m32792b(this.shopIcon, inAppNotificationNFYFS.shopIcon) && this.clickType == inAppNotificationNFYFS.clickType && C19383o.m32792b(this.listings, inAppNotificationNFYFS.listings) && this.isRead == inAppNotificationNFYFS.isRead;
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
            Long listingId2 = ((IANListingCard) next).getListingId();
            if (listingId2 != null && listingId2.longValue() == j) {
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

    public final Long getListingId() {
        return this.listingId;
    }

    public final List<IANListingCard> getListings() {
        return this.listings;
    }

    public final ShopIcon getShopIcon() {
        return this.shopIcon;
    }

    public final Long getShopId() {
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
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.shopId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.listingId;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ShopIcon shopIcon2 = this.shopIcon;
        int hashCode7 = (this.clickType.hashCode() + ((hashCode6 + (shopIcon2 == null ? 0 : shopIcon2.hashCode())) * 31)) * 31;
        List<IANListingCard> list = this.listings;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
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

    public final void setListingId(Long l) {
        this.listingId = l;
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

    public final void setShopId(Long l) {
        this.shopId = l;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTimePassed(String str) {
        this.timePassed = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationNFYFS(feedId=");
        h.append(this.feedId);
        h.append(", feedIndex=");
        h.append(this.feedIndex);
        h.append(", text=");
        h.append(this.text);
        h.append(", timePassed=");
        h.append(this.timePassed);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", listingId=");
        h.append(this.listingId);
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
    public InAppNotificationNFYFS(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") Long l2, @C17402n(name = "listing_id") Long l3, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z) {
        super(InAppNotificationType.NFYFS);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.timePassed = str3;
        this.shopId = l2;
        this.listingId = l3;
        this.shopIcon = shopIcon2;
        this.clickType = inAppNotificationClickType;
        this.listings = list;
        this.isRead = z;
    }
}
