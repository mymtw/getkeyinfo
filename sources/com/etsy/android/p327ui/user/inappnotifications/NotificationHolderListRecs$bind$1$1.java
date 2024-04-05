package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$1$1 */
final class NotificationHolderListRecs$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationListRec $notification;
    public final /* synthetic */ NotificationHolderListRecs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderListRecs$bind$1$1(NotificationHolderListRecs notificationHolderListRecs, InAppNotificationListRec inAppNotificationListRec) {
        super(1);
        this.this$0 = notificationHolderListRecs;
        this.$notification = inAppNotificationListRec;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        NotificationHolderListRecs.m19316e(this.this$0, this.$notification);
    }
}
