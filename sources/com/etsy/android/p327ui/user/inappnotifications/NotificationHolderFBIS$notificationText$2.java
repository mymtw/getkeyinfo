package com.etsy.android.p327ui.user.inappnotifications;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$notificationText$2 */
public final class NotificationHolderFBIS$notificationText$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ NotificationHolderFBIS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderFBIS$notificationText$2(NotificationHolderFBIS notificationHolderFBIS) {
        super(0);
        this.this$0 = notificationHolderFBIS;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.notification_text);
    }
}
