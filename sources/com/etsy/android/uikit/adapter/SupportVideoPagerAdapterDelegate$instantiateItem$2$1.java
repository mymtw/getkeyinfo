package com.etsy.android.uikit.adapter;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.BaseModelImageCompat;
import com.etsy.android.uikit.view.C11951f;
import com.etsy.android.uikit.view.draggable.DraggableViewDelegate;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class SupportVideoPagerAdapterDelegate$instantiateItem$2$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ DraggableViewDelegate $this_apply;
    public final /* synthetic */ C11850r<BaseModelImageCompat> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportVideoPagerAdapterDelegate$instantiateItem$2$1(C11850r<BaseModelImageCompat> rVar, DraggableViewDelegate draggableViewDelegate) {
        super(0);
        this.this$0 = rVar;
        this.$this_apply = draggableViewDelegate;
    }

    public final void invoke() {
        C11951f fVar = this.this$0.f26346b;
        if (fVar != null) {
            fVar.f26550a.mo21333d("listing_gallery_swipe_to_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.this$0.getClass();
        this.$this_apply.cleanup();
    }
}
