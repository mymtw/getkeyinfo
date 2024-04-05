package com.etsy.android.uikit.adapter;

import com.etsy.android.uikit.adapter.C11840k;
import com.etsy.android.uikit.zoom.C12029a;

/* renamed from: com.etsy.android.uikit.adapter.m */
public final class C11844m implements C12029a {

    /* renamed from: a */
    public final /* synthetic */ C11842l f26336a;

    /* renamed from: b */
    public final /* synthetic */ int f26337b;

    public C11844m(C11842l lVar, int i) {
        this.f26336a = lVar;
        this.f26337b = i;
    }

    public final void onDoubleTap() {
        C11840k.C11841a aVar = this.f26336a.f26333p;
        if (aVar != null) {
            aVar.mo34360a(this.f26337b);
        }
    }
}
