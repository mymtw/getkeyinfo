package com.etsy.android.p327ui.user.inappnotifications;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.user.inappnotifications.C11573r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$dependencies$1 */
final class NotificationHolderNFYFS$bind$dependencies$1 extends Lambda implements C19857l<C11573r, C19394m> {
    public final /* synthetic */ InAppNotificationNFYFS $notification;
    public final /* synthetic */ NotificationHolderNFYFS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderNFYFS$bind$dependencies$1(NotificationHolderNFYFS notificationHolderNFYFS, InAppNotificationNFYFS inAppNotificationNFYFS) {
        super(1);
        this.this$0 = notificationHolderNFYFS;
        this.$notification = inAppNotificationNFYFS;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11573r) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11573r rVar) {
        C19383o.m32797g(rVar, "event");
        NotificationHolderNFYFS notificationHolderNFYFS = this.this$0;
        String feedId = this.$notification.getFeedId();
        Long feedIndex = this.$notification.getFeedIndex();
        int i = NotificationHolderNFYFS.f25477g;
        notificationHolderNFYFS.getClass();
        if (rVar instanceof C11573r.C11574a) {
            C11573r.C11574a aVar = (C11573r.C11574a) rVar;
            notificationHolderNFYFS.f25480c.invoke(new C11564q.C11568d(aVar.f25637a, aVar.f25638b, feedId, feedIndex));
        } else if (rVar instanceof C11573r.C11575b) {
            C11573r.C11575b bVar = (C11573r.C11575b) rVar;
            C1993m.m4359T(notificationHolderNFYFS.f25479b, new C11540a("notification_tapped_listing", feedIndex, feedId, Long.valueOf(bVar.f25639a.getListingId().getIdAsLongDeprecated()), (Long) null, (Boolean) null, (String) null, (String) null, 240));
            notificationHolderNFYFS.f25480c.invoke(new C11564q.C11571g(bVar.f25639a));
        }
    }
}
