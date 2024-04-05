package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.m1 */
public final class C9198m1 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TaxonomyCategory f20299b;

    /* renamed from: c */
    public final /* synthetic */ C9201n1 f20300c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9198m1(C9201n1 n1Var, C8698l[] lVarArr, TaxonomyCategory taxonomyCategory) {
        super(lVarArr);
        this.f20300c = n1Var;
        this.f20299b = taxonomyCategory;
    }

    public final void onViewClick(View view) {
        C13171a aVar = this.f20300c.f20307c;
        if (aVar != null) {
            aVar.mo31328c(this.f20299b);
        }
    }
}
