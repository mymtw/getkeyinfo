package com.etsy.android.p327ui.user.inappnotifications;

import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$shopChipCards$2 */
public final class NotificationHolderRecommendedShopsHighlighted$shopChipCards$2 extends Lambda implements C19846a<List<? extends MaterialCardView>> {
    public final /* synthetic */ NotificationHolderRecommendedShopsHighlighted this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderRecommendedShopsHighlighted$shopChipCards$2(NotificationHolderRecommendedShopsHighlighted notificationHolderRecommendedShopsHighlighted) {
        super(0);
        this.this$0 = notificationHolderRecommendedShopsHighlighted;
    }

    public final List<MaterialCardView> invoke() {
        Object value = this.this$0.f25498h.getValue();
        C19383o.m32796f(value, "<get-chip1>(...)");
        Object value2 = this.this$0.f25499i.getValue();
        C19383o.m32796f(value2, "<get-chip2>(...)");
        Object value3 = this.this$0.f25500j.getValue();
        C19383o.m32796f(value3, "<get-chip3>(...)");
        Object value4 = this.this$0.f25501k.getValue();
        C19383o.m32796f(value4, "<get-chip4>(...)");
        return C17782b.m29865e0((MaterialCardView) value, (MaterialCardView) value2, (MaterialCardView) value3, (MaterialCardView) value4);
    }
}
