package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showNewStyleVariationBottomSheets$2 */
final class BuyItNowPresenter$showNewStyleVariationBottomSheets$2 extends Lambda implements C19857l<AppsInventoryUiOption, C19394m> {
    public final /* synthetic */ C9665f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyItNowPresenter$showNewStyleVariationBottomSheets$2(C9665f fVar) {
        super(1);
        this.this$0 = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppsInventoryUiOption) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AppsInventoryUiOption appsInventoryUiOption) {
        C19383o.m32797g(appsInventoryUiOption, "selectedOption");
        this.this$0.mo32380c();
        C9665f.m18002a(this.this$0);
        C9666g gVar = this.this$0.f21408h;
        if (gVar != null) {
            gVar.f21418k = C17782b.m29864d0(appsInventoryUiOption);
            if (gVar.mo32384c()) {
                gVar.mo32385d();
            } else {
                gVar.mo32383b();
            }
        }
    }
}
