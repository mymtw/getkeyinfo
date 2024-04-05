package com.etsy.android.p327ui.cardview.viewholders;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ReviewCardViewHolder$titleText$2 */
public final class ReviewCardViewHolder$titleText$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ ReviewCardViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCardViewHolder$titleText$2(ReviewCardViewHolder reviewCardViewHolder) {
        super(0);
        this.this$0 = reviewCardViewHolder;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.title_text);
    }
}
