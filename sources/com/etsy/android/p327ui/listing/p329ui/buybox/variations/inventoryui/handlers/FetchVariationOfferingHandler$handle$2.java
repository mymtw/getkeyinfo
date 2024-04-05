package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartUi;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect;
import com.etsy.android.lib.models.apiv3.listing.RangeSelect;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p321cc.C8569c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.FetchVariationOfferingHandler$handle$2 */
public final class FetchVariationOfferingHandler$handle$2 extends Lambda implements C19857l<C8569c.C8576c, C19394m> {
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ FetchVariationOfferingHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchVariationOfferingHandler$handle$2(FetchVariationOfferingHandler fetchVariationOfferingHandler, ListingViewState.C10092d dVar) {
        super(1);
        this.this$0 = fetchVariationOfferingHandler;
        this.$state = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8569c.C8576c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8569c.C8576c cVar) {
        this.this$0.f22691b.mo38043a(C13597g.C13656i1.f30148a);
        String str = null;
        if (cVar instanceof C8569c.C8576c.C8578b) {
            FetchVariationOfferingHandler fetchVariationOfferingHandler = this.this$0;
            ListingViewState.C10092d dVar = this.$state;
            C19383o.m32796f(cVar, "it");
            fetchVariationOfferingHandler.getClass();
            AppsInventoryAddToCartContext appsInventoryAddToCartContext = ((C8569c.C8576c.C8578b) cVar).f18665a;
            AppsInventoryAddToCartContext appsInventoryAddToCartContext2 = dVar.f22241i;
            AppsInventoryAddToCartUi ui = appsInventoryAddToCartContext.getUi();
            C19383o.m32794d(ui);
            RangeSelect quantity = ui.getQuantity();
            C19383o.m32794d(quantity);
            int max = quantity.getMax();
            AppsInventoryAddToCartUi ui2 = appsInventoryAddToCartContext.getUi();
            C19383o.m32794d(ui2);
            RangeSelect quantity2 = ui2.getQuantity();
            C19383o.m32794d(quantity2);
            if (max < quantity2.getMin()) {
                C19383o.m32794d(appsInventoryAddToCartContext2);
                AppsInventoryAddToCartUi ui3 = appsInventoryAddToCartContext2.getUi();
                C19383o.m32794d(ui3);
                List<AppsInventoryUiSelect> selects = ui3.getSelects();
                C19383o.m32794d(selects);
                for (AppsInventoryUiSelect next : selects) {
                    AppsInventoryUiOption selectedOption = next.selectedOption();
                    if (selectedOption != null) {
                        Boolean selected = selectedOption.getSelected();
                        C19383o.m32794d(selected);
                        if (selected.booleanValue()) {
                            str = next.getLabel();
                        }
                    }
                }
                fetchVariationOfferingHandler.f22691b.mo38043a(new C13597g.C13705p1(str));
                fetchVariationOfferingHandler.f22691b.mo38043a(new C13597g.C13639f5(appsInventoryAddToCartContext2));
                return;
            }
            fetchVariationOfferingHandler.f22691b.mo38043a(new C13597g.C13639f5(appsInventoryAddToCartContext));
        } else if (cVar instanceof C8569c.C8576c.C8577a) {
            this.this$0.f22691b.mo38043a(new C13597g.C13599a0((String) null));
        }
    }
}
