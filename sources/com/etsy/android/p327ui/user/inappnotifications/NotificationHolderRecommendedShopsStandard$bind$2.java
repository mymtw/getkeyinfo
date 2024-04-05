package com.etsy.android.p327ui.user.inappnotifications;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.user.inappnotifications.C11580v;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$bind$2 */
final class NotificationHolderRecommendedShopsStandard$bind$2 extends Lambda implements C19857l<C11580v, C19394m> {
    public final /* synthetic */ InAppNotificationRecommendedShopsStandard $notification;
    public final /* synthetic */ NotificationHolderRecommendedShopsStandard this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsStandard$bind$2(NotificationHolderRecommendedShopsStandard notificationHolderRecommendedShopsStandard, InAppNotificationRecommendedShopsStandard inAppNotificationRecommendedShopsStandard) {
        super(1);
        this.this$0 = notificationHolderRecommendedShopsStandard;
        this.$notification = inAppNotificationRecommendedShopsStandard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11580v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11580v vVar) {
        C19383o.m32797g(vVar, "event");
        NotificationHolderRecommendedShopsStandard notificationHolderRecommendedShopsStandard = this.this$0;
        String feedId = this.$notification.getFeedId();
        Long feedIndex = this.$notification.getFeedIndex();
        int i = NotificationHolderRecommendedShopsStandard.f25503h;
        notificationHolderRecommendedShopsStandard.getClass();
        if (vVar instanceof C11580v.C11582b) {
            C11580v.C11582b bVar = (C11580v.C11582b) vVar;
            C1993m.m4359T(notificationHolderRecommendedShopsStandard.f25504b, new C11540a("notification_tapped_shop", feedIndex, feedId, (Long) null, Long.valueOf(bVar.f25671a), Boolean.FALSE, (String) null, (String) null, 200));
            notificationHolderRecommendedShopsStandard.f25505c.invoke(new C11564q.C11572h(bVar.f25671a, (String) null));
        } else if (vVar instanceof C11580v.C11581a) {
            C11580v.C11581a aVar = (C11580v.C11581a) vVar;
            notificationHolderRecommendedShopsStandard.f25505c.invoke(new C11564q.C11569e(aVar.f25668a, aVar.f25669b, aVar.f25670c));
        }
    }
}
