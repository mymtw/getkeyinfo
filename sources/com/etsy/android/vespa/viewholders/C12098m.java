package com.etsy.android.vespa.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p415of.C13183l;

/* renamed from: com.etsy.android.vespa.viewholders.m */
public final class C12098m implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C12100o f26984b;

    public C12098m(C12100o oVar) {
        this.f26984b = oVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        RecyclerView recyclerView;
        C12100o oVar = this.f26984b;
        C13183l lVar = oVar.f26994j;
        if (lVar != null && oVar.f26990f != null && (recyclerView = oVar.f26987c) != null) {
            lVar.setLayoutState(recyclerView.getLayoutManager().mo11306k0());
        }
    }
}
