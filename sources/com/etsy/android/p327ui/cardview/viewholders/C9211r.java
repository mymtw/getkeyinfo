package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cardview.viewholders.r */
public final class C9211r extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ FindsCard f20338b;

    /* renamed from: c */
    public final /* synthetic */ C9213s f20339c;

    public C9211r(C9213s sVar, FindsCard findsCard) {
        this.f20339c = sVar;
        this.f20338b = findsCard;
    }

    public final void onViewClick(View view) {
        this.f20339c.f20345f.mo31328c(this.f20338b);
    }
}
