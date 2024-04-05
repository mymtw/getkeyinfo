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
public final class InAppNotificationYFNOS extends InAppNotification {
    public static final int $stable = 8;
    private String accessibilityText;
    private InAppNotificationClickType clickType;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private long listingId;
    private List<IANListingCard> listings;
    private ShopIcon shopIcon;
    private String subtext;
    private String text;
    private String timePassed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InAppNotificationYFNOS(java.lang.String r17, java.lang.Long r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r22, long r23, com.etsy.android.lib.models.apiv3.listing.ShopIcon r25, java.util.List r26, boolean r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r18
        L_0x000b:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0011
            r15 = r2
            goto L_0x0013
        L_0x0011:
            r15 = r28
        L_0x0013:
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r25
            r13 = r26
            r14 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType, long, com.etsy.android.lib.models.apiv3.listing.ShopIcon, java.util.List, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ InAppNotificationYFNOS copy$default(InAppNotificationYFNOS inAppNotificationYFNOS, String str, Long l, String str2, String str3, String str4, InAppNotificationClickType inAppNotificationClickType, long j, ShopIcon shopIcon2, List list, boolean z, String str5, int i, Object obj) {
        InAppNotificationYFNOS inAppNotificationYFNOS2 = inAppNotificationYFNOS;
        int i2 = i;
        return inAppNotificationYFNOS.copy((i2 & 1) != 0 ? inAppNotificationYFNOS2.feedId : str, (i2 & 2) != 0 ? inAppNotificationYFNOS2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationYFNOS2.text : str2, (i2 & 8) != 0 ? inAppNotificationYFNOS2.subtext : str3, (i2 & 16) != 0 ? inAppNotificationYFNOS2.timePassed : str4, (i2 & 32) != 0 ? inAppNotificationYFNOS2.clickType : inAppNotificationClickType, (i2 & 64) != 0 ? inAppNotificationYFNOS2.listingId : j, (i2 & 128) != 0 ? inAppNotificationYFNOS2.shopIcon : shopIcon2, (i2 & 256) != 0 ? inAppNotificationYFNOS2.listings : list, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationYFNOS2.isRead : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? inAppNotificationYFNOS2.accessibilityText : str5);
    }

    public final String component1() {
        return this.feedId;
    }

    public final boolean component10() {
        return this.isRead;
    }

    public final String component11() {
        return this.accessibilityText;
    }

    public final Long component2() {
        return this.feedIndex;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.subtext;
    }

    public final String component5() {
        return this.timePassed;
    }

    public final InAppNotificationClickType component6() {
        return this.clickType;
    }

    public final long component7() {
        return this.listingId;
    }

    public final ShopIcon component8() {
        return this.shopIcon;
    }

    public final List<IANListingCard> component9() {
        return this.listings;
    }

    public final InAppNotificationYFNOS copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "notification_time_passed") String str4, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listing_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "accessibility_text") String str5) {
        C19383o.m32797g(str, "feedId");
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        return new InAppNotificationYFNOS(str, l, str2, str3, str4, inAppNotificationClickType2, j, shopIcon2, list, z, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationYFNOS)) {
            return false;
        }
        InAppNotificationYFNOS inAppNotificationYFNOS = (InAppNotificationYFNOS) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationYFNOS.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationYFNOS.feedIndex) && C19383o.m32792b(this.text, inAppNotificationYFNOS.text) && C19383o.m32792b(this.subtext, inAppNotificationYFNOS.subtext) && C19383o.m32792b(this.timePassed, inAppNotificationYFNOS.timePassed) && this.clickType == inAppNotificationYFNOS.clickType && this.listingId == inAppNotificationYFNOS.listingId && C19383o.m32792b(this.shopIcon, inAppNotificationYFNOS.shopIcon) && C19383o.m32792b(this.listings, inAppNotificationYFNOS.listings) && this.isRead == inAppNotificationYFNOS.isRead && C19383o.m32792b(this.accessibilityText, inAppNotificationYFNOS.accessibilityText);
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

    public final long getListingId() {
        return this.listingId;
    }

    public final List<IANListingCard> getListings() {
        return this.listings;
    }

    public final ShopIcon getShopIcon() {
        return this.shopIcon;
    }

    public final String getSubtext() {
        return this.subtext;
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
        String str2 = this.subtext;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timePassed;
        int b = C0071c.m190b(this.listingId, (this.clickType.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31);
        ShopIcon shopIcon2 = this.shopIcon;
        int hashCode5 = (b + (shopIcon2 == null ? 0 : shopIcon2.hashCode())) * 31;
        List<IANListingCard> list = this.listings;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str4 = this.accessibilityText;
        if (str4 != null) {
            i = str4.hashCode();
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

    public final void setListingId(long j) {
        this.listingId = j;
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

    public final void setSubtext(String str) {
        this.subtext = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTimePassed(String str) {
        this.timePassed = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationYFNOS(feedId=");
        h.append(this.feedId);
        h.append(", feedIndex=");
        h.append(this.feedIndex);
        h.append(", text=");
        h.append(this.text);
        h.append(", subtext=");
        h.append(this.subtext);
        h.append(", timePassed=");
        h.append(this.timePassed);
        h.append(", clickType=");
        h.append(this.clickType);
        h.append(", listingId=");
        h.append(this.listingId);
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
    public InAppNotificationYFNOS(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "notification_time_passed") String str4, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "listing_id") long j, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "accessibility_text") String str5) {
        super(InAppNotificationType.YFNOS);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.subtext = str3;
        this.timePassed = str4;
        this.clickType = inAppNotificationClickType;
        this.listingId = j;
        this.shopIcon = shopIcon2;
        this.listings = list;
        this.isRead = z;
        this.accessibilityText = str5;
    }
}
