package com.etsy.android.p327ui.user.inappnotifications;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$recyclerView$2 */
public final class NotificationHolderNFYFS$recyclerView$2 extends Lambda implements C19846a<RecyclerView> {
    public final /* synthetic */ NotificationHolderNFYFS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderNFYFS$recyclerView$2(NotificationHolderNFYFS notificationHolderNFYFS) {
        super(0);
        this.this$0 = notificationHolderNFYFS;
    }

    public final RecyclerView invoke() {
        return (RecyclerView) this.this$0.itemView.findViewById(R.id.in_app_notify_recyclerview);
    }
}
