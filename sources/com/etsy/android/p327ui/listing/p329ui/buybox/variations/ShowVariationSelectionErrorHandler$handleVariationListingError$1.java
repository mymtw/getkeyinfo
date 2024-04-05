package com.etsy.android.p327ui.listing.p329ui.buybox.variations;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10350b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.ShowVariationSelectionErrorHandler$handleVariationListingError$1 */
final class ShowVariationSelectionErrorHandler$handleVariationListingError$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C10349a $variationOne;
    public final /* synthetic */ C10350b $variationTwo;
    public final /* synthetic */ C10329c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowVariationSelectionErrorHandler$handleVariationListingError$1(C10349a aVar, C10329c cVar, C10350b bVar) {
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
        final C10349a aVar = this.$variationOne;
        final C10329c cVar = this.this$0;
        final C10350b bVar = this.$variationTwo;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10349a aVar = aVar;
                if (aVar != null && aVar.f22710b == null) {
                    bVar.f22383i = C10349a.m18393b(aVar, (VariationValue) null, cVar.f22669a.mo38059c(R.string.listing_variation_error, new Object[0]), 3);
                }
                C10350b bVar2 = bVar;
                if (bVar2 != null && bVar2.f22713b == null) {
                    bVar.f22384j = C10350b.m18395b(bVar2, (VariationValue) null, cVar.f22669a.mo38059c(R.string.listing_variation_error, new Object[0]), 3);
                }
            }
        });
    }
}
