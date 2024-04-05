package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cardview.viewholders.w0 */
public final class C9222w0 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SavedCart f20358b;

    /* renamed from: c */
    public final /* synthetic */ C9229z0 f20359c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9222w0(C9229z0 z0Var, C8698l[] lVarArr, SavedCart savedCart) {
        super(lVarArr);
        this.f20359c = z0Var;
        this.f20358b = savedCart;
    }

    public final void onViewClick(View view) {
        C9229z0 z0Var = this.f20359c;
        SavedCartClickHandler savedCartClickHandler = z0Var.f20394t;
        if (savedCartClickHandler != null) {
            savedCartClickHandler.mo31332d(this.f20358b, z0Var.getAdapterPosition());
        }
    }
}
