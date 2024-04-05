package com.etsy.android.feedback;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.common.listingreview.redesign.ReviewViewRedesign;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.feedback.i */
public final class C6464i extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final ReviewViewRedesign f14350b;

    /* renamed from: c */
    public final C8923u f14351c;

    /* renamed from: d */
    public final C19857l<ReviewUiModel, C19394m> f14352d;

    /* renamed from: e */
    public final C19857l<ReviewUiModel, C19394m> f14353e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6464i(ReviewViewRedesign reviewViewRedesign, C8923u uVar, C19857l<? super ReviewUiModel, C19394m> lVar, C19857l<? super ReviewUiModel, C19394m> lVar2, C19857l<? super ReviewUiModel, C19394m> lVar3) {
        super(reviewViewRedesign);
        C19383o.m32797g(uVar, "translationHelper");
        this.f14350b = reviewViewRedesign;
        this.f14351c = uVar;
        this.f14352d = lVar2;
        this.f14353e = lVar3;
        reviewViewRedesign.setShowFullReview(true);
        reviewViewRedesign.setTranslationClickListener(lVar);
    }
}
