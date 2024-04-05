package com.etsy.android.vespa.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.Banner;

/* renamed from: com.etsy.android.vespa.viewholders.d */
public final class C12084d implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ Banner f26957b;

    /* renamed from: c */
    public final /* synthetic */ RecyclerView.C3108s f26958c;

    /* renamed from: d */
    public final /* synthetic */ C12076a f26959d;

    public C12084d(C12076a aVar, Banner banner, C12082c cVar) {
        this.f26959d = aVar;
        this.f26957b = banner;
        this.f26958c = cVar;
    }

    public final void onViewAttachedToWindow(View view) {
        RecyclerView g = C12076a.m19891g(this.f26959d);
        if (g != null) {
            if (C12076a.m19892h(this.f26959d, g)) {
                C12076a aVar = this.f26959d;
                if (aVar.f26942k) {
                    C12076a.m19893i(aVar, this.f26957b);
                    return;
                }
            }
            g.addOnScrollListener(this.f26958c);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        RecyclerView g = C12076a.m19891g(this.f26959d);
        if (g != null) {
            g.removeOnScrollListener(this.f26958c);
        }
    }
}
