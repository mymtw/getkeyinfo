package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class InAppNotificationFavoriteShopsPromo extends InAppNotification {
    public static final int $stable = 8;
    private final DismissAction dismissAction;
    private final String feedId;
    private final Long feedIndex;
    private final boolean isRead;
    private final LandingPageLink landingPageLink;
    private final String subText;
    private final String text;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationFavoriteShopsPromo(String str, Long l, String str2, String str3, boolean z, LandingPageLink landingPageLink2, DismissAction dismissAction2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, str2, str3, z, landingPageLink2, dismissAction2);
    }

    public final DismissAction getDismissAction() {
        return this.dismissAction;
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

    public final String getSubText() {
        return this.subText;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationFavoriteShopsPromo(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "notification_feed_index") Long l, @C17402n(name = "notification_text") String str2, @C17402n(name = "notification_subtext") String str3, @C17402n(name = "read") boolean z, @C17402n(name = "landing_page") LandingPageLink landingPageLink2, @C17402n(name = "dismiss") DismissAction dismissAction2) {
        super(InAppNotificationType.FAVORITE_SHOPS_PROMO);
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(str2, "text");
        C19383o.m32797g(str3, "subText");
        C19383o.m32797g(dismissAction2, "dismissAction");
        this.feedId = str;
        this.feedIndex = l;
        this.text = str2;
        this.subText = str3;
        this.isRead = z;
        this.landingPageLink = landingPageLink2;
        this.dismissAction = dismissAction2;
    }
}
