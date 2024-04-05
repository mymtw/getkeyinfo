package com.etsy.android.uikit.viewholder;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedFreeShippingEligible$2 */
public final class C11984xf3b66717 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ SignalNudgeListingCardUiModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11984xf3b66717(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel) {
        super(0);
        this.this$0 = signalNudgeListingCardUiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if ((r0 != null && r0.getMinNumOrderItems() > 1) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke() {
        /*
            r3 = this;
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r3.this$0
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r0 = r0.getFreeShippingData()
            boolean r0 = r0.getHasFreeShipping()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r3.this$0
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r0.listing
            com.etsy.android.lib.models.apiv3.FreeShippingData r0 = r0.getFreeShippingData()
            boolean r0 = r0.getHasMinumim()
            if (r0 == 0) goto L_0x0036
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r3.this$0
            com.etsy.android.lib.models.apiv3.Promotion r0 = com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel.access$getFreeShippingPromotion(r0)
            if (r0 == 0) goto L_0x0032
            int r0 = r0.getMinNumOrderItems()
            if (r0 <= r1) goto L_0x0032
            r0 = r1
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.C11984xf3b66717.invoke():java.lang.Boolean");
    }
}
