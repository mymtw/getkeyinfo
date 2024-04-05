package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.view.View;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p466vc.C13573c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.ShippingCalculatorHelper$bind$1 */
public final class ShippingCalculatorHelper$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10563f $calculatedShipping;
    public final /* synthetic */ ShippingCalculatorHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingCalculatorHelper$bind$1(ShippingCalculatorHelper shippingCalculatorHelper, C10563f fVar) {
        super(1);
        this.this$0 = shippingCalculatorHelper;
        this.$calculatedShipping = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13573c cVar = this.this$0.f23124b;
        List list = this.$calculatedShipping.f23159e;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        cVar.mo38043a(new C13597g.C13674k5(list));
    }
}
