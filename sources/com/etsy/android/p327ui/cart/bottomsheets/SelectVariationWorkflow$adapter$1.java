package com.etsy.android.p327ui.cart.bottomsheets;

import com.etsy.android.lib.models.apiv3.OfferingOption;
import com.etsy.android.p327ui.cart.bottomsheets.SelectVariationWorkflow;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.SelectVariationWorkflow$adapter$1 */
public final class SelectVariationWorkflow$adapter$1 extends Lambda implements C19857l<OfferingOption, C19394m> {
    public final /* synthetic */ SelectVariationWorkflow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectVariationWorkflow$adapter$1(SelectVariationWorkflow selectVariationWorkflow) {
        super(1);
        this.this$0 = selectVariationWorkflow;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((OfferingOption) obj);
        return C19394m.f43287a;
    }

    public final void invoke(OfferingOption offeringOption) {
        C19383o.m32797g(offeringOption, "it");
        SelectVariationWorkflow selectVariationWorkflow = this.this$0;
        SelectVariationWorkflow.C9248b bVar = selectVariationWorkflow.f20425g;
        if (bVar instanceof SelectVariationWorkflow.C9248b.C9249a) {
            selectVariationWorkflow.mo31555c(((SelectVariationWorkflow.C9248b.C9249a) bVar).f20432c, offeringOption);
        } else if (bVar instanceof SelectVariationWorkflow.C9248b.C9253e) {
            selectVariationWorkflow.mo31555c(((SelectVariationWorkflow.C9248b.C9253e) bVar).f20438c, offeringOption);
        }
    }
}
