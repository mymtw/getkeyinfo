package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class InAppNotificationOneFavoriteLeft extends InAppNotification {
    public static final int $stable = 8;
    private String accessibilityText;
    private InAppNotificationClickType clickType;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private List<IANListingCard> listings;
    private ShopIcon shopIcon;
    private long shopId;
    private String text;
    private String timePassed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InAppNotificationOneFavoriteLeft(java.lang.String r16, java.lang.Long r17, java.lang.String r18, java.lang.String r19, long r20, com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r22, com.etsy.android.lib.models.apiv3.listing.ShopIcon r23, java.util.List r24, boolean r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r17
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r26
        L_0x0013:
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, long, com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType, com.etsy.android.lib.models.apiv3.listing.ShopIcon, java.util.List, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ InAppNotificationOneFavoriteLeft copy$default(InAppNotificationOneFavoriteLeft inAppNotificationOneFavoriteLeft, String str, Long l, String str2, String str3, long j, InAppNotificationClickType inAppNotificationClickType, ShopIcon shopIcon2, List list, boolean z, String str4, int i, Object obj) {
        InAppNotificationOneFavoriteLeft inAppNotificationOneFavoriteLeft2 = inAppNotificationOneFavoriteLeft;
        int i2 = i;
        return inAppNotificationOneFavoriteLeft.copy((i2 & 1) != 0 ? inAppNotificationOneFavoriteLeft2.feedId : str, (i2 & 2) != 0 ? inAppNotificationOneFavoriteLeft2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationOneFavoriteLeft2.text : str2, (i2 & 8) != 0 ? inAppNotificationOneFavoriteLeft2.timePassed : str3, (i2 & 16) != 0 ? inAppNotificationOneFavoriteLeft2.shopId : j, (i2 & 32) != 0 ? inAppNotificationOneFavoriteLeft2.clickType : inAppNotificationClickType, (i2 & 64) != 0 ? inAppNotificationOneFavoriteLeft2.shopIcon : shopIcon2, (i2 & 128) != 0 ? inAppNotificationOneFavoriteLeft2.listings : list, (i2 & 256) != 0 ? inAppNotificationOneFavoriteLeft2.isRead : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationOneFavoriteLeft2.accessibilityText : str4);
    }

    public final String component1() {
        return this.feedId;
    }

    public final String component10() {
        return this.accessibilityText;
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

    public final InAppNotificationClickType component6() {
        return this.clickType;
    }

    public final ShopIcon component7() {
        return this.shopIcon;
    }

    public final List<IANListingCard> component8() {
        return this.listings;
    }

    public final boolean component9() {
        return this.isRead;
    }

    public final InAppNotificationOneFavoriteLeft copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "accessibility_text") String str4) {
        C19383o.m32797g(str, "feedId");
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        return new InAppNotificationOneFavoriteLeft(str, l, str2, str3, j, inAppNotificationClickType2, shopIcon2, list, z, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationOneFavoriteLeft)) {
            return false;
        }
        InAppNotificationOneFavoriteLeft inAppNotificationOneFavoriteLeft = (InAppNotificationOneFavoriteLeft) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationOneFavoriteLeft.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationOneFavoriteLeft.feedIndex) && C19383o.m32792b(this.text, inAppNotificationOneFavoriteLeft.text) && C19383o.m32792b(this.timePassed, inAppNotificationOneFavoriteLeft.timePassed) && this.shopId == inAppNotificationOneFavoriteLeft.shopId && this.clickType == inAppNotificationOneFavoriteLeft.clickType && C19383o.m32792b(this.shopIcon, inAppNotificationOneFavoriteLeft.shopIcon) && C19383o.m32792b(this.listings, inAppNotificationOneFavoriteLeft.listings) && this.isRead == inAppNotificationOneFavoriteLeft.isRead && C19383o.m32792b(this.accessibilityText, inAppNotificationOneFavoriteLeft.accessibilityText);
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

    public final String getAccessibilityText() {
        return this.accessibilityText;
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
        int hashCode4 = (this.clickType.hashCode() + C0071c.m190b(this.shopId, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        ShopIcon shopIcon2 = this.shopIcon;
        int hashCode5 = (hashCode4 + (shopIcon2 == null ? 0 : shopIcon2.hashCode())) * 31;
        List<IANListingCard> list = this.listings;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str3 = this.accessibilityText;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setAccessibilityText(String str) {
        this.accessibilityText = str;
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
        StringBuilder h = C0072d.m201h("InAppNotificationOneFavoriteLeft(feedId=");
        h.append(this.feedId);
        h.append(", feedIndex=");
        h.append(this.feedIndex);
        h.append(", text=");
        h.append(this.text);
        h.append(", timePassed=");
        h.append(this.timePassed);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", clickType=");
        h.append(this.clickType);
        h.append(", shopIcon=");
        h.append(this.shopIcon);
        h.append(", listings=");
        h.append(this.listings);
        h.append(", isRead=");
        h.append(this.isRead);
        h.append(", accessibilityText=");
        return C0391c.m1057c(h, this.accessibilityText, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationOneFavoriteLeft(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_time_passed") String str3, @C17402n(name = "shop_id") long j, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "accessibility_text") String str4) {
        super(InAppNotificationType.ONE_FAVORITE_LEFT);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.timePassed = str3;
        this.shopId = j;
        this.clickType = inAppNotificationClickType;
        this.shopIcon = shopIcon2;
        this.listings = list;
        this.isRead = z;
        this.accessibilityText = str4;
    }
}
