package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.R;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$chip1$2 */
public final class NotificationHolderRecommendedShopsHighlighted$chip1$2 extends Lambda implements C19846a<MaterialCardView> {
    public final /* synthetic */ NotificationHolderRecommendedShopsHighlighted this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsHighlighted$chip1$2(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted) {
        super(0);
        this.this$0 = notificationHolderRecommendedShopsHighlighted;
    }

    public final MaterialCardView invoke() {
        return (MaterialCardView) NotificationHolderRecommendedShopsHighlighted.m19326e(this.this$0).findViewById(R.id.shop_chip1);
    }
}
