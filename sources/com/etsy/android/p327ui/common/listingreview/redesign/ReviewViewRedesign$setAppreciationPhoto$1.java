package com.etsy.android.p327ui.common.listingreview.redesign;

import android.view.View;
import com.etsy.android.feedback.ReviewUiModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ReviewViewRedesign$setAppreciationPhoto$1 */
public final class ReviewViewRedesign$setAppreciationPhoto$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C19857l<ReviewUiModel, C19394m> $clickListener;
    public final /* synthetic */ ReviewUiModel $review;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewViewRedesign$setAppreciationPhoto$1(C19857l<? super ReviewUiModel, C19394m> lVar, ReviewUiModel reviewUiModel) {
        super(1);
        this.$clickListener = lVar;
        this.$review = reviewUiModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$clickListener.invoke(this.$review);
    }
}
