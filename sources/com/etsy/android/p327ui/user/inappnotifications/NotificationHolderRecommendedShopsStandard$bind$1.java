package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard;
import com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$bind$1 */
final class NotificationHolderRecommendedShopsStandard$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationRecommendedShopsStandard $notification;
    public final /* synthetic */ NotificationHolderRecommendedShopsStandard this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsStandard$bind$1(NotificationHolderRecommendedShopsStandard notificationHolderRecommendedShopsStandard, InAppNotificationRecommendedShopsStandard inAppNotificationRecommendedShopsStandard) {
        super(1);
        this.this$0 = notificationHolderRecommendedShopsStandard;
        this.$notification = inAppNotificationRecommendedShopsStandard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderRecommendedShopsStandard notificationHolderRecommendedShopsStandard = this.this$0;
        LandingPageLink landingPageLink = this.$notification.getLandingPageLink();
        String feedId = this.$notification.getFeedId();
        Long feedIndex = this.$notification.getFeedIndex();
        int i = NotificationHolderRecommendedShopsStandard.f25503h;
        notificationHolderRecommendedShopsStandard.getClass();
        C1993m.m4359T(notificationHolderRecommendedShopsStandard.f25504b, new C11540a("notification_tapped_shop_recommendations", feedIndex, feedId, (Long) null, (Long) null, Boolean.FALSE, (String) null, (String) null, 216));
        if (landingPageLink != null) {
            notificationHolderRecommendedShopsStandard.f25505c.invoke(new C11564q.C11570f(landingPageLink));
        }
    }
}
