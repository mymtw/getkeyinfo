package com.etsy.android.p327ui.feedback;

import android.view.View;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.p327ui.feedback.RatingStarBarsView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.feedback.RatingStarBarsView$populatePercentage$1 */
public final class RatingStarBarsView$populatePercentage$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ RatingStarBarsView.C9902a $row;
    public final /* synthetic */ RatingStarBarsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingStarBarsView$populatePercentage$1(RatingStarBarsView ratingStarBarsView, RatingStarBarsView.C9902a aVar) {
        super(1);
        this.this$0 = ratingStarBarsView;
        this.$row = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19857l<Rating, C19394m> onRatingClicked = this.this$0.getOnRatingClicked();
        if (onRatingClicked != null) {
            onRatingClicked.invoke(this.$row.f21841b);
        }
    }
}
