package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiSelect;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.BuyItNowPresenter$showNewStyleVariationBottomSheets$1 */
final class BuyItNowPresenter$showNewStyleVariationBottomSheets$1 extends Lambda implements C19857l<AppsInventoryUiOption, C19394m> {
    public final /* synthetic */ Map<Long, ListingImage> $imagesByVariation;
    public final /* synthetic */ AppsInventoryUiSelect $select2;
    public final /* synthetic */ List<AppsInventoryUiOption> $selectedOptions;
    public final /* synthetic */ List<AppsInventoryUiSelect> $selects;
    public final /* synthetic */ C9665f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyItNowPresenter$showNewStyleVariationBottomSheets$1(List<AppsInventoryUiOption> list, C9665f fVar, AppsInventoryUiSelect appsInventoryUiSelect, Map<Long, ListingImage> map, List<AppsInventoryUiSelect> list2) {
        super(1);
        this.$selectedOptions = list;
        this.this$0 = fVar;
        this.$select2 = appsInventoryUiSelect;
        this.$imagesByVariation = map;
        this.$selects = list2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppsInventoryUiOption) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AppsInventoryUiOption appsInventoryUiOption) {
        C19383o.m32797g(appsInventoryUiOption, "firstSelectedOption");
        this.$selectedOptions.add(appsInventoryUiOption);
        C9665f.m18002a(this.this$0);
        final C9665f fVar = this.this$0;
        AppsInventoryUiSelect appsInventoryUiSelect = this.$select2;
        Map<Long, ListingImage> map = this.$imagesByVariation;
        final List<AppsInventoryUiOption> list = this.$selectedOptions;
        final List<AppsInventoryUiSelect> list2 = this.$selects;
        fVar.mo32381d(appsInventoryUiSelect, map, new C19857l<AppsInventoryUiOption, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AppsInventoryUiOption) obj);
                return C19394m.f43287a;
            }

            public final void invoke(AppsInventoryUiOption appsInventoryUiOption) {
                C9666g gVar;
                C19383o.m32797g(appsInventoryUiOption, "secondSelectedOption");
                fVar.mo32380c();
                list.add(appsInventoryUiOption);
                C9665f.m18002a(fVar);
                if (list.size() == list2.size() && (gVar = fVar.f21408h) != null) {
                    List<AppsInventoryUiOption> list = list;
                    C19383o.m32797g(list, "selectedVariations");
                    gVar.f21418k = list;
                    if (gVar.mo32384c()) {
                        gVar.mo32385d();
                    } else {
                        gVar.mo32383b();
                    }
                }
            }
        });
    }
}
