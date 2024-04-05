package com.etsy.android.uikit.viewholder;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class SignalNudgeListingCardUiModel$quantityBasedSaleEligible$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ SignalNudgeListingCardUiModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalNudgeListingCardUiModel$quantityBasedSaleEligible$2(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel) {
        super(0);
        this.this$0 = signalNudgeListingCardUiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r0 != null && r0.hasMinimum() && r0.getMinOrderItems() > 1) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke() {
        /*
            r4 = this;
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r4.this$0
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r0.listing
            boolean r0 = r0.isSoldOut()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002c
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r4.this$0
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r0.listing
            com.etsy.android.lib.models.apiv3.PromotionData r0 = r0.getPromotionData()
            if (r0 == 0) goto L_0x0028
            boolean r3 = r0.hasMinimum()
            if (r3 == 0) goto L_0x0028
            int r0 = r0.getMinOrderItems()
            if (r0 <= r1) goto L_0x0028
            r0 = r1
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedSaleEligible$2.invoke():java.lang.Boolean");
    }
}
