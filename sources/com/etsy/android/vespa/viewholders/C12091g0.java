package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.vespa.viewholders.g0 */
public final class C12091g0 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ UserAction f26969b;

    /* renamed from: c */
    public final /* synthetic */ C12093h0 f26970c;

    public C12091g0(C12093h0 h0Var, UserAction userAction) {
        this.f26970c = h0Var;
        this.f26969b = userAction;
    }

    public final void onViewClick(View view) {
        this.f26970c.f26974c.mo31328c(this.f26969b);
    }
}
