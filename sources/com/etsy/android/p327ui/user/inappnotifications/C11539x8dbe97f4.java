package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$recommendedShopsLink$2 */
public final class C11539x8dbe97f4 extends Lambda implements C19846a<CollageButton> {
    public final /* synthetic */ NotificationHolderRecommendedShopsHighlighted this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11539x8dbe97f4(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted) {
        super(0);
        this.this$0 = notificationHolderRecommendedShopsHighlighted;
    }

    public final CollageButton invoke() {
        return (CollageButton) this.this$0.itemView.findViewById(R.id.recommended_shops_link);
    }
}
