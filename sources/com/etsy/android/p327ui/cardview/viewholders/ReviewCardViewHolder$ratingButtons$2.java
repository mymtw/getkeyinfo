package com.etsy.android.p327ui.cardview.viewholders;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.ratings.CollageRatingButtons;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ReviewCardViewHolder$ratingButtons$2 */
public final class ReviewCardViewHolder$ratingButtons$2 extends Lambda implements C19846a<CollageRatingButtons> {
    public final /* synthetic */ ReviewCardViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCardViewHolder$ratingButtons$2(ReviewCardViewHolder reviewCardViewHolder) {
        super(0);
        this.this$0 = reviewCardViewHolder;
    }

    public final CollageRatingButtons invoke() {
        return (CollageRatingButtons) this.this$0.itemView.findViewById(R.id.rating_buttons);
    }
}
