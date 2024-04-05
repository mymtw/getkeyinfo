package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cardview.viewholders.y0 */
public final class C9227y0 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C9163b1 f20370b;

    /* renamed from: c */
    public final /* synthetic */ C9229z0 f20371c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9227y0(C9229z0 z0Var, C8698l[] lVarArr, C9163b1 b1Var) {
        super(lVarArr);
        this.f20371c = z0Var;
        this.f20370b = b1Var;
    }

    public final void onViewClick(View view) {
        SavedCartClickHandler savedCartClickHandler = this.f20371c.f20394t;
        if (savedCartClickHandler != null) {
            savedCartClickHandler.mo31335g(this.f20370b.f20153b);
        }
    }
}
