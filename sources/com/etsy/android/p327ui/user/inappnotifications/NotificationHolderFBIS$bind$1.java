package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$1 */
final class NotificationHolderFBIS$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationFBIS $notification;
    public final /* synthetic */ NotificationHolderFBIS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderFBIS$bind$1(NotificationHolderFBIS notificationHolderFBIS, InAppNotificationFBIS inAppNotificationFBIS) {
        super(1);
        this.this$0 = notificationHolderFBIS;
        this.$notification = inAppNotificationFBIS;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderFBIS.m19313e(this.this$0, this.$notification.getShopId(), this.$notification.getFeedId(), this.$notification.getFeedIndex());
    }
}
