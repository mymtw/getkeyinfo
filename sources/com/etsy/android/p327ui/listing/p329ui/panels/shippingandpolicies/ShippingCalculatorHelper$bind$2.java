package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.List;
import kotlin.collections.EmptyList;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.ShippingCalculatorHelper$bind$2 */
public final class ShippingCalculatorHelper$bind$2 extends TrackingOnClickListener {
    public final /* synthetic */ C10563f $calculatedShipping;
    public final /* synthetic */ ShippingCalculatorHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingCalculatorHelper$bind$2(ShippingCalculatorHelper shippingCalculatorHelper, C10563f fVar, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = shippingCalculatorHelper;
        this.$calculatedShipping = fVar;
    }

    public void onViewClick(View view) {
        C13573c cVar = this.this$0.f23124b;
        List list = this.$calculatedShipping.f23159e;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        cVar.mo38043a(new C13597g.C13674k5(list));
    }
}
