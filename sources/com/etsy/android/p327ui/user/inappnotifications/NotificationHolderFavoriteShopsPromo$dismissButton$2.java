package com.etsy.android.p327ui.user.inappnotifications;

import android.widget.Button;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$dismissButton$2 */
public final class NotificationHolderFavoriteShopsPromo$dismissButton$2 extends Lambda implements C19846a<Button> {
    public final /* synthetic */ NotificationHolderFavoriteShopsPromo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderFavoriteShopsPromo$dismissButton$2(NotificationHolderFavoriteShopsPromo notificationHolderFavoriteShopsPromo) {
        super(0);
        this.this$0 = notificationHolderFavoriteShopsPromo;
    }

    public final Button invoke() {
        return (Button) this.this$0.itemView.findViewById(R.id.updates_banner_dismiss);
    }
}
