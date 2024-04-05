package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class SignalNudgeListingCardUiModel$dollarBasedFreeShippingText$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Resources $resources;
    public final /* synthetic */ SignalNudgeListingCardUiModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalNudgeListingCardUiModel$dollarBasedFreeShippingText$2(SignalNudgeListingCardUiModel signalNudgeListingCardUiModel, Resources resources) {
        super(0);
        this.this$0 = signalNudgeListingCardUiModel;
        this.$resources = resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r5.$resources.getString(com.etsy.android.R.string.dollar_conditional_free_shipping, new java.lang.Object[]{r0.getMinOrderPriceMoney().format()});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke() {
        /*
            r5 = this;
            com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel r0 = r5.this$0
            com.etsy.android.lib.models.apiv3.Promotion r0 = com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel.access$getFreeShippingPromotion(r0)
            if (r0 == 0) goto L_0x0021
            android.content.res.Resources r1 = r5.$resources
            r2 = 2131952104(0x7f1301e8, float:1.9540641E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            com.etsy.android.lib.currency.EtsyMoney r0 = r0.getMinOrderPriceMoney()
            java.lang.String r0 = r0.format()
            r3[r4] = r0
            java.lang.String r0 = r1.getString(r2, r3)
            if (r0 != 0) goto L_0x0023
        L_0x0021:
            java.lang.String r0 = ""
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.SignalNudgeListingCardUiModel$dollarBasedFreeShippingText$2.invoke():java.lang.String");
    }
}
