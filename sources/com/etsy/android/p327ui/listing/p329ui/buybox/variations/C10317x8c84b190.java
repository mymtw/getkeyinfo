package com.etsy.android.p327ui.listing.p329ui.buybox.variations;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.ShowVariationSelectionErrorHandler$handleVariationOfferingError$1 */
final class C10317x8c84b190 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C10334a $variationOne;
    public final /* synthetic */ C10336b $variationTwo;
    public final /* synthetic */ C10329c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10317x8c84b190(C10334a aVar, C10329c cVar, C10336b bVar) {
        super(1);
        this.$variationOne = aVar;
        this.this$0 = cVar;
        this.$variationTwo = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10334a aVar = this.$variationOne;
        final C10329c cVar = this.this$0;
        final C10336b bVar = this.$variationTwo;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10334a aVar = aVar;
                if (aVar != null) {
                    AppsInventoryUiOption appsInventoryUiOption = aVar.f22681d;
                    if ((appsInventoryUiOption != null ? appsInventoryUiOption.getValue() : null) == null) {
                        bVar.f22383i = C10334a.m18378b(aVar, (AppsInventoryUiOption) null, cVar.f22669a.mo38059c(R.string.listing_variation_error, new Object[0]), 47);
                    }
                }
                C10336b bVar2 = bVar;
                if (bVar2 != null) {
                    AppsInventoryUiOption appsInventoryUiOption2 = bVar2.f22687d;
                    if ((appsInventoryUiOption2 != null ? appsInventoryUiOption2.getValue() : null) == null) {
                        bVar.f22384j = C10336b.m18381b(bVar, (AppsInventoryUiOption) null, cVar.f22669a.mo38059c(R.string.listing_variation_error, new Object[0]), 47);
                    }
                }
            }
        });
    }
}
