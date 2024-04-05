package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$3 */
final class NotificationHolderCLOS$bind$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationCLOS $notification;
    public final /* synthetic */ NotificationHolderCLOS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderCLOS$bind$3(NotificationHolderCLOS notificationHolderCLOS, InAppNotificationCLOS inAppNotificationCLOS) {
        super(1);
        this.this$0 = notificationHolderCLOS;
        this.$notification = inAppNotificationCLOS;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderCLOS.m19310e(this.this$0, this.$notification.getFeedId(), this.$notification.getFeedIndex());
    }
}
