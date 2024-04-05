package com.etsy.android.vespa.viewholders;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: com.etsy.android.vespa.viewholders.n */
public final class C12099n extends RecyclerView.C3108s {

    /* renamed from: b */
    public final /* synthetic */ C12100o f26985b;

    public C12099n(C12100o oVar) {
        this.f26985b = oVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onScrolled(recyclerView, i, i2);
        if (i > ViewConfiguration.get(this.f26985b.f26987c.getContext()).getScaledTouchSlop() && (swipeRefreshLayout = this.f26985b.f26991g) != null) {
            swipeRefreshLayout.requestDisallowInterceptTouchEvent(true);
        }
    }
}
