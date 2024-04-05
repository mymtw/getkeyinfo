package com.etsy.android.p327ui.common.listingreview.redesign;

import android.view.View;
import com.etsy.android.feedback.ReviewUiModel;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ItemReviewCardViewHolder$bind$1 */
final class ItemReviewCardViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ C9447a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemReviewCardViewHolder$bind$1(ReviewUiModel reviewUiModel, C9447a aVar) {
        super(1);
        this.$review = reviewUiModel;
        this.this$0 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (this.$review.getAppreciationVideo() != null) {
            C9447a aVar = this.this$0;
            C19861p<Integer, List<ReviewUiModel>, C19394m> pVar = aVar.f20944d;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(aVar.getAdapterPosition()), C17782b.m29864d0(this.$review));
                return;
            }
            return;
        }
        C19857l<ReviewUiModel, C19394m> lVar = this.this$0.f20942b;
        if (lVar != null) {
            lVar.invoke(this.$review);
        }
    }
}
