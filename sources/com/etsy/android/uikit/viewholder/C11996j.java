package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.viewholder.C11997k;
import p415of.C13171a;

/* renamed from: com.etsy.android.uikit.viewholder.j */
public final class C11996j extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11997k.C11998a f26729b;

    /* renamed from: c */
    public final /* synthetic */ C11997k f26730c;

    public C11996j(C11997k kVar, C11997k.C11998a aVar) {
        this.f26730c = kVar;
        this.f26729b = aVar;
    }

    public final void onViewClick(View view) {
        C13171a aVar = this.f26730c.f26733e;
        if (aVar != null) {
            aVar.mo31328c(this.f26729b);
        }
    }
}
