package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.models.apiv3.AppreciationPhoto;
import com.etsy.android.p327ui.shop.C11178m0;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.shop.viewholder.i */
public final class C11278i extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11178m0 f24895b;

    /* renamed from: c */
    public final /* synthetic */ AppreciationPhoto f24896c;

    public C11278i(C11178m0 m0Var, AppreciationPhoto appreciationPhoto) {
        this.f24895b = m0Var;
        this.f24896c = appreciationPhoto;
    }

    public final void onViewClick(View view) {
        this.f24895b.mo36811m(this.f24896c.getTransactionId());
    }
}
