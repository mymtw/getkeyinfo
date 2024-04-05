package com.etsy.android.feedback.view;

import android.view.View;
import com.etsy.android.feedback.data.Rating;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class RatingBottomSheet$buildRatingRow$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ Rating $rating;
    public final /* synthetic */ RatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingBottomSheet$buildRatingRow$1(RatingBottomSheet ratingBottomSheet, Rating rating) {
        super(1);
        this.this$0 = ratingBottomSheet;
        this.$rating = rating;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19857l<Rating, C19394m> ratingClickListener = this.this$0.getRatingClickListener();
        if (ratingClickListener != null) {
            ratingClickListener.invoke(this.$rating);
        }
    }
}
