package com.etsy.android.uikit.adapter;

import android.view.View;
import com.etsy.android.uikit.adapter.C11840k;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.uikit.adapter.g */
public final class C11836g extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f26316b;

    /* renamed from: c */
    public final /* synthetic */ C11840k f26317c;

    public C11836g(C11840k kVar, int i) {
        this.f26317c = kVar;
        this.f26316b = i;
    }

    public final void onViewClick(View view) {
        C11840k.C11841a aVar = this.f26317c.f26323f;
        if (aVar != null) {
            aVar.mo34364e(this.f26316b);
        }
    }
}
