package com.etsy.android.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.feedback.view.ReviewsSortFilterHeader;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.common.listingreview.redesign.ReviewViewRedesign;
import com.etsy.android.uikit.adapter.C11832c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

/* renamed from: com.etsy.android.feedback.j */
public final class C6465j extends C11832c<ReviewUiModel> {

    /* renamed from: c */
    public final C8923u f14354c;

    /* renamed from: d */
    public C19857l<? super ReviewUiModel, C19394m> f14355d;

    /* renamed from: e */
    public C19857l<? super ReviewUiModel, C19394m> f14356e;

    /* renamed from: f */
    public C19857l<? super ReviewUiModel, C19394m> f14357f;

    /* renamed from: g */
    public boolean f14358g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6465j(FragmentActivity fragmentActivity, C8923u uVar, C19857l<? super ReviewUiModel, C19394m> lVar, C19857l<? super ReviewUiModel, C19394m> lVar2, C19857l<? super ReviewUiModel, C19394m> lVar3) {
        super(fragmentActivity);
        C19383o.m32797g(uVar, "translationHelper");
        this.f14354c = uVar;
        this.f14355d = lVar;
        this.f14356e = lVar2;
        this.f14357f = lVar3;
        addHeader(0);
    }

    public final int getListItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final void onBindHeaderViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.feedback.ReviewSortFilterViewHolder");
        boolean z = this.f14358g;
        View view = ((C6472q) b0Var).itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.feedback.view.ReviewsSortFilterHeader");
        ReviewsSortFilterHeader reviewsSortFilterHeader = (ReviewsSortFilterHeader) view;
        if (z) {
            reviewsSortFilterHeader.showResultCount();
        } else {
            reviewsSortFilterHeader.hideResultCount();
        }
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.feedback.ItemReviewViewHolder");
        C6464i iVar = (C6464i) b0Var;
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        ReviewUiModel reviewUiModel = (ReviewUiModel) item;
        iVar.f14350b.setData(reviewUiModel, iVar.f14351c.mo30498a(reviewUiModel.getReview(), reviewUiModel.getLanguage()), iVar.f14352d, iVar.f14353e);
    }

    public final RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C6472q(viewGroup);
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        Context context = viewGroup.getContext();
        C19383o.m32796f(context, "parent.context");
        ReviewViewRedesign reviewViewRedesign = new ReviewViewRedesign(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        reviewViewRedesign.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C6464i(reviewViewRedesign, this.f14354c, this.f14355d, this.f14356e, this.f14357f);
    }
}
