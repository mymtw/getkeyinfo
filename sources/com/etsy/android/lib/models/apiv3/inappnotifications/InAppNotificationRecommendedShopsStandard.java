package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class InAppNotificationRecommendedShopsStandard extends InAppNotification {
    public static final int $stable = 8;
    private final String feedId;
    private final Long feedIndex;
    private final boolean isRead;
    private final LandingPageLink landingPageLink;
    private final List<IANShopCard> recommendedShops;
    private final String subText;
    private final String text;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationRecommendedShopsStandard(String str, Long l, String str2, String str3, boolean z, LandingPageLink landingPageLink2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, z, (i & 32) != 0 ? null : landingPageLink2, list);
    }

    public static /* synthetic */ InAppNotificationRecommendedShopsStandard copy$default(InAppNotificationRecommendedShopsStandard inAppNotificationRecommendedShopsStandard, String str, Long l, String str2, String str3, boolean z, LandingPageLink landingPageLink2, List<IANShopCard> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppNotificationRecommendedShopsStandard.feedId;
        }
        if ((i & 2) != 0) {
            l = inAppNotificationRecommendedShopsStandard.feedIndex;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str2 = inAppNotificationRecommendedShopsStandard.text;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = inAppNotificationRecommendedShopsStandard.subText;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = inAppNotificationRecommendedShopsStandard.isRead;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            landingPageLink2 = inAppNotificationRecommendedShopsStandard.landingPageLink;
        }
        LandingPageLink landingPageLink3 = landingPageLink2;
        if ((i & 64) != 0) {
            list = inAppNotificationRecommendedShopsStandard.recommendedShops;
        }
        return inAppNotificationRecommendedShopsStandard.copy(str, l2, str4, str5, z2, landingPageLink3, list);
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
        return this.subText;
    }

    public final boolean component5() {
        return this.isRead;
    }

    public final LandingPageLink component6() {
        return this.landingPageLink;
    }

    public final List<IANShopCard> component7() {
        return this.recommendedShops;
    }

    public final InAppNotificationRecommendedShopsStandard copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "read") boolean z, @C17402n(name = "landing_page") LandingPageLink landingPageLink2, @C17402n(name = "recommended_shops") List<IANShopCard> list) {
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(str2, "text");
        C19383o.m32797g(str3, "subText");
        List<IANShopCard> list2 = list;
        C19383o.m32797g(list2, "recommendedShops");
        return new InAppNotificationRecommendedShopsStandard(str, l, str2, str3, z, landingPageLink2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationRecommendedShopsStandard)) {
            return false;
        }
        InAppNotificationRecommendedShopsStandard inAppNotificationRecommendedShopsStandard = (InAppNotificationRecommendedShopsStandard) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationRecommendedShopsStandard.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationRecommendedShopsStandard.feedIndex) && C19383o.m32792b(this.text, inAppNotificationRecommendedShopsStandard.text) && C19383o.m32792b(this.subText, inAppNotificationRecommendedShopsStandard.subText) && this.isRead == inAppNotificationRecommendedShopsStandard.isRead && C19383o.m32792b(this.landingPageLink, inAppNotificationRecommendedShopsStandard.landingPageLink) && C19383o.m32792b(this.recommendedShops, inAppNotificationRecommendedShopsStandard.recommendedShops);
    }

    public final IANShopCard findShopByUserId(long j) {
        T t;
        boolean z;
        Iterator<T> it = this.recommendedShops.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((IANShopCard) t).getUserId() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (IANShopCard) t;
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final Long getFeedIndex() {
        return this.feedIndex;
    }

    public final LandingPageLink getLandingPageLink() {
        return this.landingPageLink;
    }

    public final List<IANShopCard> getRecommendedShops() {
        return this.recommendedShops;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.feedId.hashCode() * 31;
        Long l = this.feedIndex;
        int i = 0;
        int e = C0023f.m105e(this.subText, C0023f.m105e(this.text, (hashCode + (l == null ? 0 : l.hashCode())) * 31, 31), 31);
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        int i2 = (e + (z ? 1 : 0)) * 31;
        LandingPageLink landingPageLink2 = this.landingPageLink;
        if (landingPageLink2 != null) {
            i = landingPageLink2.hashCode();
        }
        return this.recommendedShops.hashCode() + ((i2 + i) * 31);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationRecommendedShopsStandard(feedId=");
        h.append(this.feedId);
        h.append(", feedIndex=");
        h.append(this.feedIndex);
        h.append(", text=");
        h.append(this.text);
        h.append(", subText=");
        h.append(this.subText);
        h.append(", isRead=");
        h.append(this.isRead);
        h.append(", landingPageLink=");
        h.append(this.landingPageLink);
        h.append(", recommendedShops=");
        return C0070b.m186i(h, this.recommendedShops, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationRecommendedShopsStandard(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "read") boolean z, @C17402n(name = "landing_page") LandingPageLink landingPageLink2, @C17402n(name = "recommended_shops") List<IANShopCard> list) {
        super(InAppNotificationType.RECOMMENDED_SHOPS_STANDARD);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(str2, "text");
        C19383o.m32797g(str3, "subText");
        C19383o.m32797g(list, "recommendedShops");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.subText = str3;
        this.isRead = z;
        this.landingPageLink = landingPageLink2;
        this.recommendedShops = list;
    }
}
