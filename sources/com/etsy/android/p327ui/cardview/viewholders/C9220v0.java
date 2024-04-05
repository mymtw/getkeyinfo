package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p367ib.C12924b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.v0 */
public final class C9220v0 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SavedCart f20355b;

    /* renamed from: c */
    public final /* synthetic */ C9229z0 f20356c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9220v0(C9229z0 z0Var, C8698l[] lVarArr, SavedCart savedCart) {
        super(lVarArr);
        this.f20356c = z0Var;
        this.f20355b = savedCart;
    }

    public final void onViewClick(View view) {
        C9229z0 z0Var = this.f20356c;
        SavedCartClickHandler savedCartClickHandler = z0Var.f20394t;
        if (savedCartClickHandler != null) {
            SavedCart savedCart = this.f20355b;
            savedCartClickHandler.mo31336h(new C12924b.C12925a(savedCart), z0Var.getAdapterPosition(), savedCartClickHandler.mo45889a().getString(R.string.toast_move_to_cart));
        }
    }
}
