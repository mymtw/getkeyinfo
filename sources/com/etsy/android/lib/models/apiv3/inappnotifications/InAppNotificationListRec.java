package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0015b;
import p003a2.C0023f;
import p568fn.C17782b;

@C17403o(generateAdapter = true)
public final class InAppNotificationListRec extends InAppNotification {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String buttonText;
    private InAppNotificationClickType clickType;
    private long collectionId;
    private String collectionKey;
    private String collectionSlug;
    private String feedId;
    private Long feedIndex;
    private boolean isRead;
    private List<IANListingCard> listings;
    private String text;
    private String timePassed;
    private long userId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InAppNotificationListRec fake() {
            InAppNotificationClickType inAppNotificationClickType = InAppNotificationClickType.COLLECTION_RECOMMENDATIONS;
            IANListingCard.Companion companion = IANListingCard.Companion;
            return new InAppNotificationListRec("123", 0L, "Is it time for <B>:meow-pizza:</B> yet?", "Yes, it is", "16h", inAppNotificationClickType, 1234567890, C17782b.m29865e0(companion.fake(), companion.fake(), companion.fake(), companion.fake()), false, "aaa", "MzEyOTI1MTV8MTE4ODc4MjAx", 31292515);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationListRec(String str, Long l, String str2, String str3, String str4, InAppNotificationClickType inAppNotificationClickType, long j, List list, boolean z, String str5, String str6, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, str4, inAppNotificationClickType, j, list, z, str5, str6, j2);
    }

    public static /* synthetic */ InAppNotificationListRec copy$default(InAppNotificationListRec inAppNotificationListRec, String str, Long l, String str2, String str3, String str4, InAppNotificationClickType inAppNotificationClickType, long j, List list, boolean z, String str5, String str6, long j2, int i, Object obj) {
        InAppNotificationListRec inAppNotificationListRec2 = inAppNotificationListRec;
        int i2 = i;
        return inAppNotificationListRec.copy((i2 & 1) != 0 ? inAppNotificationListRec2.feedId : str, (i2 & 2) != 0 ? inAppNotificationListRec2.feedIndex : l, (i2 & 4) != 0 ? inAppNotificationListRec2.text : str2, (i2 & 8) != 0 ? inAppNotificationListRec2.buttonText : str3, (i2 & 16) != 0 ? inAppNotificationListRec2.timePassed : str4, (i2 & 32) != 0 ? inAppNotificationListRec2.clickType : inAppNotificationClickType, (i2 & 64) != 0 ? inAppNotificationListRec2.userId : j, (i2 & 128) != 0 ? inAppNotificationListRec2.listings : list, (i2 & 256) != 0 ? inAppNotificationListRec2.isRead : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inAppNotificationListRec2.collectionSlug : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? inAppNotificationListRec2.collectionKey : str6, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? inAppNotificationListRec2.collectionId : j2);
    }

    public final String component1() {
        return this.feedId;
    }

    public final String component10() {
        return this.collectionSlug;
    }

    public final String component11() {
        return this.collectionKey;
    }

    public final long component12() {
        return this.collectionId;
    }

    public final Long component2() {
        return this.feedIndex;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.buttonText;
    }

    public final String component5() {
        return this.timePassed;
    }

    public final InAppNotificationClickType component6() {
        return this.clickType;
    }

    public final long component7() {
        return this.userId;
    }

    public final List<IANListingCard> component8() {
        return this.listings;
    }

    public final boolean component9() {
        return this.isRead;
    }

    public final InAppNotificationListRec copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "button_text") String str3, @C17402n(name = "notification_time_passed") String str4, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "user_id") long j, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "collection_slug") String str5, @C17402n(name = "collection_key") String str6, @C17402n(name = "collection_id") long j2) {
        String str7 = str;
        C19383o.m32797g(str7, "feedId");
        String str8 = str2;
        C19383o.m32797g(str8, "text");
        String str9 = str4;
        C19383o.m32797g(str9, "timePassed");
        String str10 = str5;
        C19383o.m32797g(str10, "collectionSlug");
        String str11 = str6;
        C19383o.m32797g(str11, "collectionKey");
        return new InAppNotificationListRec(str7, l, str8, str3, str9, inAppNotificationClickType, j, list, z, str10, str11, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationListRec)) {
            return false;
        }
        InAppNotificationListRec inAppNotificationListRec = (InAppNotificationListRec) obj;
        return C19383o.m32792b(this.feedId, inAppNotificationListRec.feedId) && C19383o.m32792b(this.feedIndex, inAppNotificationListRec.feedIndex) && C19383o.m32792b(this.text, inAppNotificationListRec.text) && C19383o.m32792b(this.buttonText, inAppNotificationListRec.buttonText) && C19383o.m32792b(this.timePassed, inAppNotificationListRec.timePassed) && this.clickType == inAppNotificationListRec.clickType && this.userId == inAppNotificationListRec.userId && C19383o.m32792b(this.listings, inAppNotificationListRec.listings) && this.isRead == inAppNotificationListRec.isRead && C19383o.m32792b(this.collectionSlug, inAppNotificationListRec.collectionSlug) && C19383o.m32792b(this.collectionKey, inAppNotificationListRec.collectionKey) && this.collectionId == inAppNotificationListRec.collectionId;
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

    public final String getButtonText() {
        return this.buttonText;
    }

    public final InAppNotificationClickType getClickType() {
        return this.clickType;
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionKey() {
        return this.collectionKey;
    }

    public final String getCollectionSlug() {
        return this.collectionSlug;
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

    public final String getText() {
        return this.text;
    }

    public final String getTimePassed() {
        return this.timePassed;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.feedId.hashCode() * 31;
        Long l = this.feedIndex;
        int i = 0;
        int e = C0023f.m105e(this.text, (hashCode + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str = this.buttonText;
        int e2 = C0023f.m105e(this.timePassed, (e + (str == null ? 0 : str.hashCode())) * 31, 31);
        InAppNotificationClickType inAppNotificationClickType = this.clickType;
        int b = C0071c.m190b(this.userId, (e2 + (inAppNotificationClickType == null ? 0 : inAppNotificationClickType.hashCode())) * 31, 31);
        List<IANListingCard> list = this.listings;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (b + i) * 31;
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        return Long.hashCode(this.collectionId) + C0023f.m105e(this.collectionKey, C0023f.m105e(this.collectionSlug, (i2 + (z ? 1 : 0)) * 31, 31), 31);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setClickType(InAppNotificationClickType inAppNotificationClickType) {
        this.clickType = inAppNotificationClickType;
    }

    public final void setCollectionId(long j) {
        this.collectionId = j;
    }

    public final void setCollectionKey(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.collectionKey = str;
    }

    public final void setCollectionSlug(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.collectionSlug = str;
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

    public final void setText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.text = str;
    }

    public final void setTimePassed(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.timePassed = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationListRec(feedId=");
        h.append(this.feedId);
        h.append(", feedIndex=");
        h.append(this.feedIndex);
        h.append(", text=");
        h.append(this.text);
        h.append(", buttonText=");
        h.append(this.buttonText);
        h.append(", timePassed=");
        h.append(this.timePassed);
        h.append(", clickType=");
        h.append(this.clickType);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", listings=");
        h.append(this.listings);
        h.append(", isRead=");
        h.append(this.isRead);
        h.append(", collectionSlug=");
        h.append(this.collectionSlug);
        h.append(", collectionKey=");
        h.append(this.collectionKey);
        h.append(", collectionId=");
        return C0015b.m91j(h, this.collectionId, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationListRec(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "button_text") String str3, @C17402n(name = "notification_time_passed") String str4, @C17402n(name = "notification_click_type") InAppNotificationClickType inAppNotificationClickType, @C17402n(name = "user_id") long j, @C17402n(name = "listings") List<IANListingCard> list, @C17402n(name = "read") boolean z, @C17402n(name = "collection_slug") String str5, @C17402n(name = "collection_key") String str6, @C17402n(name = "collection_id") long j2) {
        super(InAppNotificationType.COLLECTION_RECS);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(str2, "text");
        C19383o.m32797g(str4, "timePassed");
        C19383o.m32797g(str5, "collectionSlug");
        C19383o.m32797g(str6, "collectionKey");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.buttonText = str3;
        this.timePassed = str4;
        this.clickType = inAppNotificationClickType;
        this.userId = j;
        this.listings = list;
        this.isRead = z;
        this.collectionSlug = str5;
        this.collectionKey = str6;
        this.collectionId = j2;
    }
}
