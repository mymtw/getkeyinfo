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

@C17403o(generateAdapter = true)
public final class InAppNotificationCLOS extends InAppNotification {
    public static final int $stable = 8;
    private String accessibilityText;
    private InAppNotificationClickType clickType;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private List<IANListingCard> listings;
    private ShopIcon shopIcon;
    private String subtext;
    private String text;
    private String timePassed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InAppNotificationCLOS(java.lang.String r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r20, com.etsy.android.lib.models.apiv3.listing.ShopIcon r21, java.util.List r22, boolean r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r16
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0011
            r13 = r2
            goto L_0x0013
        L_0x0011:
            r13 = r24
        L_0x0013:
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType, com.etsy.android.lib.models.apiv3.listing.ShopIcon, java.util.List, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ InAppNotificationCLOS copy$default(InAppNotificationCLOS inAppNotificationCLOS, String str, Long l, String str2, String str3, String str4, InAppNotificationClickType inAppNotificationClickType, ShopIcon shopIcon2, List list, boolean z, String str5, int i, Object obj) {
        InAppNotificationCLOS inAppNotificationCLOS2 = inAppNotificationCLOS;
        int i2 = i;
        return inAppNotificationCLOS.copy((i2 & 1) != 0 ? inAppNotificationCLOS2.feedId : str, (i2 & 2) != 0 ? inAppNotificationCLOS2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationCLOS2.text : str2, (i2 & 8) != 0 ? inAppNotificationCLOS2.subtext : str3, (i2 & 16) != 0 ? inAppNotificationCLOS2.timePassed : str4, (i2 & 32) != 0 ? inAppNotificationCLOS2.clickType : inAppNotificationClickType, (i2 & 64) != 0 ? inAppNotificationCLOS2.shopIcon : shopIcon2, (i2 & 128) != 0 ? inAppNotificationCLOS2.listings : list, (i2 & 256) != 0 ? inAppNotificationCLOS2.isRead : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationCLOS2.accessibilityText : str5);
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
        return this.subtext;
    }

    public final String component5() {
        return this.timePassed;
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

    public final InAppNotificationCLOS copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "notification_time_passed") String str4, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "accessibility_text") String str5) {
        C19383o.m32797g(str, "feedId");
        InAppNotificationClickType inAppNotificationClickType2 = inAppNotificationClickType;
        C19383o.m32797g(inAppNotificationClickType2, "clickType");
        return new InAppNotificationCLOS(str, l, str2, str3, str4, inAppNotificationClickType2, shopIcon2, list, z, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationCLOS)) {
            return false;
        }
        InAppNotificationCLOS inAppNotificationCLOS = (InAppNotificationCLOS) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationCLOS.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationCLOS.feedIndex) && C19383o.m32792b(this.text, inAppNotificationCLOS.text) && C19383o.m32792b(this.subtext, inAppNotificationCLOS.subtext) && C19383o.m32792b(this.timePassed, inAppNotificationCLOS.timePassed) && this.clickType == inAppNotificationCLOS.clickType && C19383o.m32792b(this.shopIcon, inAppNotificationCLOS.shopIcon) && C19383o.m32792b(this.listings, inAppNotificationCLOS.listings) && this.isRead == inAppNotificationCLOS.isRead && C19383o.m32792b(this.accessibilityText, inAppNotificationCLOS.accessibilityText);
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
        int hashCode5 = (this.clickType.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        ShopIcon shopIcon2 = this.shopIcon;
        int hashCode6 = (hashCode5 + (shopIcon2 == null ? 0 : shopIcon2.hashCode())) * 31;
        List<IANListingCard> list = this.listings;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
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
        StringBuilder h = C0072d.m201h("InAppNotificationCLOS(feedId=");
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
    public InAppNotificationCLOS(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "notification_time_passed") String str4, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "notification_shop_img") ShopIcon shopIcon2, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "accessibility_text") String str5) {
        super(InAppNotificationType.CLOS);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(inAppNotificationClickType, "clickType");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.subtext = str3;
        this.timePassed = str4;
        this.clickType = inAppNotificationClickType;
        this.shopIcon = shopIcon2;
        this.listings = list;
        this.isRead = z;
        this.accessibilityText = str5;
    }
}
