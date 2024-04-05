package com.etsy.android.vespa.viewholders;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.Banner;

/* renamed from: com.etsy.android.vespa.viewholders.c */
public final class C12082c extends RecyclerView.C3108s {

    /* renamed from: b */
    public final /* synthetic */ Banner f26952b;

    /* renamed from: c */
    public final /* synthetic */ C12076a f26953c;

    public C12082c(C12076a aVar, Banner banner) {
        this.f26953c = aVar;
        this.f26952b = banner;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (C12076a.m19892h(this.f26953c, recyclerView)) {
            C12076a aVar = this.f26953c;
            if (aVar.f26942k) {
                C12076a.m19893i(aVar, this.f26952b);
                recyclerView.removeOnScrollListener(this);
            }
        }
    }
}
