package com.etsy.android.p327ui.user.inappnotifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$shopChipPanel$2 */
public final class NotificationHolderRecommendedShopsHighlighted$shopChipPanel$2 extends Lambda implements C19846a<ConstraintLayout> {
    public final /* synthetic */ NotificationHolderRecommendedShopsHighlighted this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsHighlighted$shopChipPanel$2(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted) {
        super(0);
        this.this$0 = notificationHolderRecommendedShopsHighlighted;
    }

    public final ConstraintLayout invoke() {
        return (ConstraintLayout) this.this$0.itemView.findViewById(R.id.shop_chip_panel);
    }
}
