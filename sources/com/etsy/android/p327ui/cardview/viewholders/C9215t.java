package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cardview.viewholders.t */
public final class C9215t extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ FindsCard f20347b;

    /* renamed from: c */
    public final /* synthetic */ C9217u f20348c;

    public C9215t(C9217u uVar, FindsCard findsCard) {
        this.f20348c = uVar;
        this.f20347b = findsCard;
    }

    public final void onViewClick(View view) {
        this.f20348c.f20352e.mo31328c(this.f20347b);
    }
}
