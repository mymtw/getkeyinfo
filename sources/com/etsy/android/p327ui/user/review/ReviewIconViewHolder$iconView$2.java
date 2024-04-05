package com.etsy.android.p327ui.user.review;

import android.view.View;
import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.review.ReviewIconViewHolder$iconView$2 */
public final class ReviewIconViewHolder$iconView$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ View $itemView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewIconViewHolder$iconView$2(View view) {
        super(0);
        this.$itemView = view;
    }

    public final ImageView invoke() {
        return (ImageView) this.$itemView.findViewById(R.id.create_review_icon_image);
    }
}
