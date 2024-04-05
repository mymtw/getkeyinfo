package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.f */
public final class C9174f extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TaxonomyCategory f20199b;

    /* renamed from: c */
    public final /* synthetic */ C9177g f20200c;

    public C9174f(C9177g gVar, TaxonomyCategory taxonomyCategory) {
        this.f20200c = gVar;
        this.f20199b = taxonomyCategory;
    }

    public final void onViewClick(View view) {
        C13171a aVar = this.f20200c.f20206g;
        if (aVar != null) {
            aVar.mo31328c(this.f20199b);
        }
    }
}
