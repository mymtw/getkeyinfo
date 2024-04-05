package com.etsy.android.uikit.viewholder;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.etsy.android.uikit.util.C11914o;

/* renamed from: com.etsy.android.uikit.viewholder.b */
public final class C11986b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ C11988d f26683b;

    public C11986b(C11988d dVar) {
        this.f26683b = dVar;
    }

    public final void onGlobalLayout() {
        C11914o.m19630b(this.f26683b.f26697m.getViewTreeObserver(), this);
        int measuredHeight = this.f26683b.f26697m.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = this.f26683b.f26698n.getLayoutParams();
        layoutParams.height = measuredHeight;
        this.f26683b.f26698n.setLayoutParams(layoutParams);
    }
}
