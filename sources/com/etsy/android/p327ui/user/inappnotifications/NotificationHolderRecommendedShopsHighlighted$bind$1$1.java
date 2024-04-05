package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsHighlighted;
import com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$bind$1$1 */
final class NotificationHolderRecommendedShopsHighlighted$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ LandingPageLink $landingPageLink;
    public final /* synthetic */ InAppNotificationRecommendedShopsHighlighted $notification;
    public final /* synthetic */ NotificationHolderRecommendedShopsHighlighted this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsHighlighted$bind$1$1(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted, LandingPageLink landingPageLink, InAppNotificationRecommendedShopsHighlighted inAppNotificationRecommendedShopsHighlighted) {
        super(1);
        this.this$0 = notificationHolderRecommendedShopsHighlighted;
        this.$landingPageLink = landingPageLink;
        this.$notification = inAppNotificationRecommendedShopsHighlighted;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted = this.this$0;
        LandingPageLink landingPageLink = this.$landingPageLink;
        String feedId = this.$notification.getFeedId();
        Long feedIndex = this.$notification.getFeedIndex();
        int i = NotificationHolderRecommendedShopsHighlighted.f25491m;
        notificationHolderRecommendedShopsHighlighted.getClass();
        C1993m.m4359T(notificationHolderRecommendedShopsHighlighted.f25492b, new C11540a("notification_tapped_shop_recommendations", feedIndex, feedId, (Long) null, (Long) null, Boolean.TRUE, (String) null, (String) null, 216));
        notificationHolderRecommendedShopsHighlighted.f25493c.invoke(new C11564q.C11570f(landingPageLink));
    }
}
