package com.etsy.android.p327ui.common.listingreview.redesign;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.lib.util.C8923u;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.b */
public final class C9448b extends RecyclerView.Adapter<C9447a> {

    /* renamed from: b */
    public List<ReviewUiModel> f20946b;

    /* renamed from: c */
    public final C8923u f20947c;

    /* renamed from: d */
    public final C19857l<ReviewUiModel, C19394m> f20948d;

    /* renamed from: e */
    public final C19861p<Integer, List<ReviewUiModel>, C19394m> f20949e;

    /* renamed from: f */
    public final C19857l<ReviewUiModel, C19394m> f20950f;

    /* renamed from: g */
    public final int f20951g;

    public C9448b(List<ReviewUiModel> list, C8914m mVar, C8923u uVar, C19857l<? super ReviewUiModel, C19394m> lVar, C19861p<? super Integer, ? super List<ReviewUiModel>, C19394m> pVar, C19857l<? super ReviewUiModel, C19394m> lVar2) {
        C19383o.m32797g(list, "data");
        C19383o.m32797g(uVar, "translationHelper");
        this.f20946b = list;
        this.f20947c = uVar;
        this.f20948d = lVar;
        this.f20949e = pVar;
        this.f20950f = lVar2;
        DisplayMetrics displayMetrics = mVar.f19670a;
        this.f20951g = (int) (((double) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) * 0.85d);
    }

    public final int getItemCount() {
        return this.f20946b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9447a aVar = (C9447a) b0Var;
        C19383o.m32797g(aVar, "holder");
        ReviewUiModel reviewUiModel = this.f20946b.get(i);
        C19383o.m32797g(reviewUiModel, "review");
        ReviewViewRedesign reviewViewRedesign = (ReviewViewRedesign) aVar.itemView.findViewById(R.id.listing_review_view);
        C19383o.m32796f(reviewViewRedesign, "reviewView");
        ReviewViewRedesign.setData$default(reviewViewRedesign, reviewUiModel, aVar.f20945e.mo30498a(reviewUiModel.getReview(), reviewUiModel.getLanguage()), (C19857l) null, (C19857l) null, 12, (Object) null);
        reviewViewRedesign.setTranslationClickListener(aVar.f20943c);
        View view = aVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ItemReviewCardViewHolder$bind$1(reviewUiModel, aVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = C9447a.f20941f;
        View inflate = from.inflate(R.layout.view_listing_review_card, viewGroup, false);
        inflate.getLayoutParams().width = this.f20951g;
        return new C9447a(inflate, this.f20948d, this.f20950f, this.f20949e, this.f20947c);
    }
}
