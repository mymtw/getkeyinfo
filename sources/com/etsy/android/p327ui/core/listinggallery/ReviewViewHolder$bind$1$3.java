package com.etsy.android.p327ui.core.listinggallery;

import com.etsy.android.p327ui.core.listinggallery.C9643b;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.ReviewViewHolder$bind$1$3 */
public final class ReviewViewHolder$bind$1$3 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ReviewViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewViewHolder$bind$1$3(ReviewViewHolder reviewViewHolder) {
        super(0);
        this.this$0 = reviewViewHolder;
    }

    public final void invoke() {
        C9643b.C9644a aVar = this.this$0.f21338c;
        if (aVar != null) {
            aVar.onDragStopped();
        }
    }
}
