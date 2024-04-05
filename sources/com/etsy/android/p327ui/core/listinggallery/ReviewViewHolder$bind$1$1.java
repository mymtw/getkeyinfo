package com.etsy.android.p327ui.core.listinggallery;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.core.listinggallery.C9643b;
import com.etsy.android.uikit.view.draggable.DraggableViewDelegateWithShrink;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.ReviewViewHolder$bind$1$1 */
public final class ReviewViewHolder$bind$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ DraggableViewDelegateWithShrink $this_apply;
    public final /* synthetic */ ReviewViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewViewHolder$bind$1$1(ReviewViewHolder reviewViewHolder, DraggableViewDelegateWithShrink draggableViewDelegateWithShrink) {
        super(0);
        this.this$0 = reviewViewHolder;
        this.$this_apply = draggableViewDelegateWithShrink;
    }

    public final void invoke() {
        this.this$0.f21337b.f26550a.mo21333d("listing_gallery_swipe_to_dismiss", (Map<? extends AnalyticsProperty, Object>) null);
        C9643b.C9644a aVar = this.this$0.f21338c;
        if (aVar != null) {
            aVar.onImageDismissed();
        }
        this.$this_apply.cleanup();
    }
}
