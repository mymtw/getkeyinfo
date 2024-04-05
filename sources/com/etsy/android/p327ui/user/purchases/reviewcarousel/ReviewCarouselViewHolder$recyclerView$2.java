package com.etsy.android.p327ui.user.purchases.reviewcarousel;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.reviewcarousel.ReviewCarouselViewHolder$recyclerView$2 */
public final class ReviewCarouselViewHolder$recyclerView$2 extends Lambda implements C19846a<RecyclerView> {
    public final /* synthetic */ ReviewCarouselViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCarouselViewHolder$recyclerView$2(ReviewCarouselViewHolder reviewCarouselViewHolder) {
        super(0);
        this.this$0 = reviewCarouselViewHolder;
    }

    public final RecyclerView invoke() {
        return (RecyclerView) this.this$0.itemView.findViewById(R.id.carousel_recycler_view);
    }
}
