package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.w */
public final /* synthetic */ class C9221w implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C9223x f20357b;

    public /* synthetic */ C9221w(C9223x xVar) {
        this.f20357b = xVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C9223x xVar = this.f20357b;
        C19383o.m32797g(xVar, "this$0");
        MaterialCardView materialCardView = xVar.f20363f;
        if (materialCardView != null) {
            float measuredWidth = (float) (materialCardView.getMeasuredWidth() / 2);
            if (!(measuredWidth == materialCardView.getRadius())) {
                materialCardView.setRadius(measuredWidth);
            }
        }
    }
}
