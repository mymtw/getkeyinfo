package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.FormattedTaxonomyCategoriesPillsViewHolder$bind$1$2 */
final class FormattedTaxonomyCategoriesPillsViewHolder$bind$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IFormattedTaxonomyCategory $formattedTaxonomyCategory;
    public final /* synthetic */ C9219v this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormattedTaxonomyCategoriesPillsViewHolder$bind$1$2(C9219v vVar, IFormattedTaxonomyCategory iFormattedTaxonomyCategory) {
        super(1);
        this.this$0 = vVar;
        this.$formattedTaxonomyCategory = iFormattedTaxonomyCategory;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9134o oVar = this.this$0.f20354c;
        if (oVar != null) {
            oVar.mo31328c(this.$formattedTaxonomyCategory);
        }
    }
}
