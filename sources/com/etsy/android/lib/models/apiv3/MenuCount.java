package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class MenuCount {
    public static final int $stable = 8;
    private final Map<String, ApiGiftCardBalance> giftCardBalances;
    private final Integer notificationCount;
    private final NotificationTooltip notificationsTooltip;
    private final Integer openReviewCount;
    private final Integer unreadConversationCount;
    private final Integer unviewedReviewCount;

    public MenuCount(@C17402n(name = "giftcard_balances") Map<String, ApiGiftCardBalance> map, @C17402n(name = "open_reviews") Integer num, @C17402n(name = "unviewed_reviews") Integer num2, @C17402n(name = "new_activity_count") Integer num3, @C17402n(name = "new_convo_count") Integer num4, @C17402n(name = "notifications_tooltip") NotificationTooltip notificationTooltip) {
        this.giftCardBalances = map;
        this.openReviewCount = num;
        this.unviewedReviewCount = num2;
        this.notificationCount = num3;
        this.unreadConversationCount = num4;
        this.notificationsTooltip = notificationTooltip;
    }

    public static /* synthetic */ MenuCount copy$default(MenuCount menuCount, Map<String, ApiGiftCardBalance> map, Integer num, Integer num2, Integer num3, Integer num4, NotificationTooltip notificationTooltip, int i, Object obj) {
        if ((i & 1) != 0) {
            map = menuCount.giftCardBalances;
        }
        if ((i & 2) != 0) {
            num = menuCount.openReviewCount;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = menuCount.unviewedReviewCount;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            num3 = menuCount.notificationCount;
        }
        Integer num7 = num3;
        if ((i & 16) != 0) {
            num4 = menuCount.unreadConversationCount;
        }
        Integer num8 = num4;
        if ((i & 32) != 0) {
            notificationTooltip = menuCount.notificationsTooltip;
        }
        return menuCount.copy(map, num5, num6, num7, num8, notificationTooltip);
    }

    public final Map<String, ApiGiftCardBalance> component1() {
        return this.giftCardBalances;
    }

    public final Integer component2() {
        return this.openReviewCount;
    }

    public final Integer component3() {
        return this.unviewedReviewCount;
    }

    public final Integer component4() {
        return this.notificationCount;
    }

    public final Integer component5() {
        return this.unreadConversationCount;
    }

    public final NotificationTooltip component6() {
        return this.notificationsTooltip;
    }

    public final MenuCount copy(@C17402n(name = "giftcard_balances") Map<String, ApiGiftCardBalance> map, @C17402n(name = "open_reviews") Integer num, @C17402n(name = "unviewed_reviews") Integer num2, @C17402n(name = "new_activity_count") Integer num3, @C17402n(name = "new_convo_count") Integer num4, @C17402n(name = "notifications_tooltip") NotificationTooltip notificationTooltip) {
        return new MenuCount(map, num, num2, num3, num4, notificationTooltip);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuCount)) {
            return false;
        }
        MenuCount menuCount = (MenuCount) obj;
        return C19383o.m32792b(this.giftCardBalances, menuCount.giftCardBalances) && C19383o.m32792b(this.openReviewCount, menuCount.openReviewCount) && C19383o.m32792b(this.unviewedReviewCount, menuCount.unviewedReviewCount) && C19383o.m32792b(this.notificationCount, menuCount.notificationCount) && C19383o.m32792b(this.unreadConversationCount, menuCount.unreadConversationCount) && C19383o.m32792b(this.notificationsTooltip, menuCount.notificationsTooltip);
    }

    public final Map<String, ApiGiftCardBalance> getGiftCardBalances() {
        return this.giftCardBalances;
    }

    public final Integer getNotificationCount() {
        return this.notificationCount;
    }

    public final NotificationTooltip getNotificationsTooltip() {
        return this.notificationsTooltip;
    }

    public final Integer getOpenReviewCount() {
        return this.openReviewCount;
    }

    public final Integer getUnreadConversationCount() {
        return this.unreadConversationCount;
    }

    public final Integer getUnviewedReviewCount() {
        return this.unviewedReviewCount;
    }

    public int hashCode() {
        Map<String, ApiGiftCardBalance> map = this.giftCardBalances;
        int i = 0;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Integer num = this.openReviewCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unviewedReviewCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.notificationCount;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.unreadConversationCount;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        NotificationTooltip notificationTooltip = this.notificationsTooltip;
        if (notificationTooltip != null) {
            i = notificationTooltip.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("MenuCount(giftCardBalances=");
        h.append(this.giftCardBalances);
        h.append(", openReviewCount=");
        h.append(this.openReviewCount);
        h.append(", unviewedReviewCount=");
        h.append(this.unviewedReviewCount);
        h.append(", notificationCount=");
        h.append(this.notificationCount);
        h.append(", unreadConversationCount=");
        h.append(this.unreadConversationCount);
        h.append(", notificationsTooltip=");
        h.append(this.notificationsTooltip);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MenuCount(Map map, Integer num, Integer num2, Integer num3, Integer num4, NotificationTooltip notificationTooltip, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, num, num2, num3, num4, (i & 32) != 0 ? null : notificationTooltip);
    }
}
