package com.etsy.android.uikit.adapter;

import android.view.ScaleGestureDetector;
import com.etsy.android.uikit.adapter.C11840k;

/* renamed from: com.etsy.android.uikit.adapter.j */
public final class C11839j extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: b */
    public final /* synthetic */ int f26319b;

    /* renamed from: c */
    public final /* synthetic */ C11840k f26320c;

    public C11839j(C11840k kVar, int i) {
        this.f26320c = kVar;
        this.f26319b = i;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C11840k.C11841a aVar = this.f26320c.f26323f;
        if (aVar == null) {
            return true;
        }
        aVar.mo34361b(this.f26319b);
        return true;
    }
}
