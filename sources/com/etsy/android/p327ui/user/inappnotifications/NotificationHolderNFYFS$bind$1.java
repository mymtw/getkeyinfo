package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$1 */
final class NotificationHolderNFYFS$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationNFYFS $notification;
    public final /* synthetic */ NotificationHolderNFYFS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderNFYFS$bind$1(NotificationHolderNFYFS notificationHolderNFYFS, InAppNotificationNFYFS inAppNotificationNFYFS) {
        super(1);
        this.this$0 = notificationHolderNFYFS;
        this.$notification = inAppNotificationNFYFS;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderNFYFS notificationHolderNFYFS = this.this$0;
        Long shopId = this.$notification.getShopId();
        C19383o.m32794d(shopId);
        NotificationHolderNFYFS.m19320e(notificationHolderNFYFS, shopId.longValue(), this.$notification.getFeedId(), this.$notification.getFeedIndex());
    }
}
