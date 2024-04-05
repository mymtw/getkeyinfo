package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.shop.viewholder.n */
public final class C11290n extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11292o f24919b;

    public C11290n(C11292o oVar) {
        this.f24919b = oVar;
    }

    public final void onViewClick(View view) {
        this.f24919b.f24929j.mo36772h(ResponseConstants.REVIEWS, true);
    }
}
