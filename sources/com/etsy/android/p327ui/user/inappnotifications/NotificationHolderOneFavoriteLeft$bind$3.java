package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$3 */
final class NotificationHolderOneFavoriteLeft$bind$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationOneFavoriteLeft $notification;
    public final /* synthetic */ NotificationHolderOneFavoriteLeft this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderOneFavoriteLeft$bind$3(NotificationHolderOneFavoriteLeft notificationHolderOneFavoriteLeft, InAppNotificationOneFavoriteLeft inAppNotificationOneFavoriteLeft) {
        super(1);
        this.this$0 = notificationHolderOneFavoriteLeft;
        this.$notification = inAppNotificationOneFavoriteLeft;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderOneFavoriteLeft.m19323e(this.this$0, this.$notification.getShopId(), this.$notification.getFeedId(), this.$notification.getFeedIndex());
    }
}
