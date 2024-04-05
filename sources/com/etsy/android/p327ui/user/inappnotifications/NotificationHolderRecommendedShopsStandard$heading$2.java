package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageHeadingLayout;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$heading$2 */
public final class NotificationHolderRecommendedShopsStandard$heading$2 extends Lambda implements C19846a<CollageHeadingLayout> {
    public final /* synthetic */ NotificationHolderRecommendedShopsStandard this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsStandard$heading$2(NotificationHolderRecommendedShopsStandard notificationHolderRecommendedShopsStandard) {
        super(0);
        this.this$0 = notificationHolderRecommendedShopsStandard;
    }

    public final CollageHeadingLayout invoke() {
        return (CollageHeadingLayout) this.this$0.itemView.findViewById(R.id.recommended_shops_heading);
    }
}
