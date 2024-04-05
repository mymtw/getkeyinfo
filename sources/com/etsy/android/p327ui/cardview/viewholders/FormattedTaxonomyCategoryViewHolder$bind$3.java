package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p415of.C13171a;
import p415of.C13186o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.FormattedTaxonomyCategoryViewHolder$bind$3 */
final class FormattedTaxonomyCategoryViewHolder$bind$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IFormattedTaxonomyCategory $data;
    public final /* synthetic */ C9223x this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormattedTaxonomyCategoryViewHolder$bind$3(C9223x xVar, IFormattedTaxonomyCategory iFormattedTaxonomyCategory) {
        super(1);
        this.this$0 = xVar;
        this.$data = iFormattedTaxonomyCategory;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13171a<C13186o> aVar = this.this$0.f20360c;
        if (aVar != null) {
            aVar.mo31328c(this.$data);
        }
    }
}
