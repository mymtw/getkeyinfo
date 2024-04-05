package com.etsy.android.p327ui.user.inappnotifications;

import android.widget.Button;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$viewAllButton$2 */
public final class NotificationHolderListRecs$viewAllButton$2 extends Lambda implements C19846a<Button> {
    public final /* synthetic */ NotificationHolderListRecs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderListRecs$viewAllButton$2(NotificationHolderListRecs notificationHolderListRecs) {
        super(0);
        this.this$0 = notificationHolderListRecs;
    }

    public final Button invoke() {
        return (Button) this.this$0.itemView.findViewById(R.id.notification_view_all);
    }
}
