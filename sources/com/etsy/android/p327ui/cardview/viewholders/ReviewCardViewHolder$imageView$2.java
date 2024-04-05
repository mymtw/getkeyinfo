package com.etsy.android.p327ui.cardview.viewholders;

import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ReviewCardViewHolder$imageView$2 */
public final class ReviewCardViewHolder$imageView$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ ReviewCardViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCardViewHolder$imageView$2(ReviewCardViewHolder reviewCardViewHolder) {
        super(0);
        this.this$0 = reviewCardViewHolder;
    }

    public final ImageView invoke() {
        return (ImageView) this.this$0.itemView.findViewById(R.id.image_view);
    }
}
