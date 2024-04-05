package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class SignalNudgeListingCardUiModel$quantityBasedSaleText$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Resources $resources;
    public final /* synthetic */ SignalNudgeListingCardUiModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalNudgeListingCardUiModel$quantityBasedSaleText$2(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel, Resources resources) {
        super(0);
        this.this$0 = signalNudgeListingCardUiModel;
        this.$resources = resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r6.$resources.getString(com.etsy.android.R.string.quantity_conditional_sale, new java.lang.Object[]{java.lang.String.valueOf(r0.getMinOrderItems()), java.lang.String.valueOf(r0.getPercentageDiscount())});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke() {
        /*
            r6 = this;
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r6.this$0
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r0.listing
            com.etsy.android.lib.models.apiv3.PromotionData r0 = r0.getPromotionData()
            if (r0 == 0) goto L_0x0030
            android.content.res.Resources r1 = r6.$resources
            r2 = 2131953298(0x7f130692, float:1.9543063E38)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            int r5 = r0.getMinOrderItems()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r4] = r5
            r4 = 1
            int r0 = r0.getPercentageDiscount()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = r1.getString(r2, r3)
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            java.lang.String r0 = ""
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$quantityBasedSaleText$2.invoke():java.lang.String");
    }
}
