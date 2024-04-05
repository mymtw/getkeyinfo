package com.etsy.android.feedback;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.apiv3.listing.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.common.listingreview.itemview.C9444a;
import com.etsy.android.p327ui.common.listingreview.itemview.ListingReviewItemView;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.uikit.adapter.C11832c;
import java.text.NumberFormat;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p753kq.C19857l;

/* renamed from: com.etsy.android.feedback.d */
public final class C6459d extends C11832c<ReviewUiModel> {

    /* renamed from: c */
    public final C8923u f14314c;

    /* renamed from: d */
    public final List<ReviewImage> f14315d;

    /* renamed from: e */
    public final C9444a f14316e;

    /* renamed from: f */
    public final NumberFormat f14317f;

    /* renamed from: g */
    public final C11139d0 f14318g;

    /* renamed from: h */
    public final C19857l<Integer, C19394m> f14319h;

    /* renamed from: i */
    public String f14320i = "";

    /* renamed from: j */
    public ShopIcon f14321j;

    /* renamed from: k */
    public ShopRating f14322k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6459d(FragmentActivity fragmentActivity, C8923u uVar, List<ReviewImage> list, C9444a aVar, NumberFormat numberFormat, C11139d0 d0Var, C19857l<? super Integer, C19394m> lVar) {
        super(fragmentActivity);
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(aVar, "reviewListener");
        C19383o.m32797g(numberFormat, "numberFormat");
        C19383o.m32797g(d0Var, "shopHomeEligibility");
        this.f14314c = uVar;
        this.f14315d = list;
        this.f14316e = aVar;
        this.f14317f = numberFormat;
        this.f14318g = d0Var;
        this.f14319h = lVar;
        mo18485j();
    }

    public final int getListItemViewType(int i) {
        return 0;
    }

    /* renamed from: j */
    public final void mo18485j() {
        removeHeader(10);
        removeHeader(11);
        ShopRating shopRating = this.f14322k;
        Subratings subratings = shopRating != null ? shopRating.getSubratings() : null;
        if (subratings != null && !subratings.isEmpty() && this.f14318g.f24633a.mo21132b(C8592b.C8607o.f18914a)) {
            addHeader(10);
        }
        int headerCount = getHeaderCount();
        int i = 0;
        while (true) {
            if (i >= headerCount) {
                break;
            } else if (getHeaderItemViewType(i) == 10) {
                notifyItemChanged(i);
                break;
            } else {
                i++;
            }
        }
        if (C19543e0.m33306Y(this.f14315d)) {
            addHeader(11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006e, code lost:
        r3 = r10.getRatingCount();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindHeaderViewHolder(androidx.recyclerview.widget.RecyclerView.C3084b0 r9, int r10) {
        /*
            r8 = this;
            int r10 = r8.getHeaderItemViewType(r10)
            r0 = 10
            r1 = 0
            if (r10 == r0) goto L_0x005a
            r0 = 11
            if (r10 != r0) goto L_0x004c
            java.lang.String r10 = "null cannot be cast to non-null type com.etsy.android.feedback.ReviewPhotosCarouselViewHolder"
            kotlin.jvm.internal.C19383o.m32795e(r9, r10)
            com.etsy.android.feedback.p r9 = (com.etsy.android.feedback.C6471p) r9
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ReviewImage> r10 = r8.f14315d
            kotlin.jvm.internal.C19383o.m32794d(r10)
            kq.l<java.lang.Integer, kotlin.m> r0 = r8.f14319h
            java.lang.String r2 = "onReviewPhotoClicked"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            com.etsy.android.ui.common.listingreview.a r2 = new com.etsy.android.ui.common.listingreview.a
            r2.<init>(r0)
            java.util.ArrayList<com.etsy.android.lib.models.apiv3.listing.ReviewImage> r0 = r2.f20933d
            r0.clear()
            java.util.ArrayList<com.etsy.android.lib.models.apiv3.listing.ReviewImage> r0 = r2.f20933d
            r0.addAll(r10)
            android.view.View r10 = r9.itemView
            r0 = 2131429490(0x7f0b0872, float:1.8480654E38)
            android.view.View r10 = r10.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.View r9 = r9.itemView
            r9.getContext()
            r0.<init>(r1, r1)
            r10.setLayoutManager(r0)
            r10.setAdapter(r2)
            goto L_0x00d8
        L_0x004c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Header type "
            java.lang.String r1 = " is not supported"
            java.lang.String r10 = android.support.p013v4.media.C0069a.m175f(r0, r10, r1)
            r9.<init>(r10)
            throw r9
        L_0x005a:
            java.lang.String r10 = "null cannot be cast to non-null type com.etsy.android.feedback.SubratingsViewHolder"
            kotlin.jvm.internal.C19383o.m32795e(r9, r10)
            com.etsy.android.feedback.s r9 = (com.etsy.android.feedback.C6474s) r9
            com.etsy.android.lib.models.apiv3.listing.ShopRating r10 = r8.f14322k
            java.lang.String r0 = r8.f14320i
            com.etsy.android.lib.models.apiv3.ShopIcon r2 = r8.f14321j
            java.lang.String r3 = "shopName"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            if (r10 == 0) goto L_0x0079
            java.lang.Integer r3 = r10.getRatingCount()
            if (r3 == 0) goto L_0x0079
            int r3 = r3.intValue()
            goto L_0x007a
        L_0x0079:
            r3 = r1
        L_0x007a:
            java.text.NumberFormat r4 = r9.f14377b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r4.format(r5)
            android.widget.TextView r5 = r9.f14379d
            r5.setText(r0)
            android.widget.TextView r0 = r9.f14380e
            android.view.View r5 = r9.itemView
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131820575(0x7f11001f, float:1.9273869E38)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r4
            java.lang.String r1 = r5.getQuantityString(r6, r3, r7)
            r0.setText(r1)
            com.etsy.android.ui.common.listingreview.redesign.ShopSubratingsGraphView r0 = r9.f14378c
            r0.setData(r10)
            if (r2 == 0) goto L_0x00d8
            kotlin.Pair<java.lang.Integer, java.lang.String> r10 = com.etsy.android.lib.models.apiv3.ShopIcon.IMG_SIZE_75
            java.lang.Object r10 = r10.getFirst()
            java.lang.String r0 = "IMG_SIZE_75.first"
            kotlin.jvm.internal.C19383o.m32796f(r10, r0)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.String r10 = r2.getImageUrlForPixelWidth(r10)
            if (r10 == 0) goto L_0x00d8
            android.widget.ImageView r0 = r9.f14381f
            com.etsy.android.lib.core.img.GlideRequests r0 = androidx.activity.C0114h.m272C0(r0)
            u9.b r10 = r0.load((java.lang.String) r10)
            com.bumptech.glide.load.resource.bitmap.w r0 = new com.bumptech.glide.load.resource.bitmap.w
            int r1 = r9.f14382g
            r0.<init>(r1)
            u9.b r10 = r10.mo17139B(r0)
            android.widget.ImageView r9 = r9.f14381f
            r10.mo16816M(r9)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.C6459d.onBindHeaderViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.feedback.FeedbackReviewViewHolder");
        C6458c cVar = (C6458c) b0Var;
        Object obj = getItems().get(i - getHeaderCount());
        C19383o.m32796f(obj, "items[position - headerCount]");
        ReviewUiModel reviewUiModel = (ReviewUiModel) obj;
        View view = cVar.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView");
        ((ListingReviewItemView) view).bindReview(reviewUiModel, true, cVar.f14313b.mo30498a(reviewUiModel.getReview(), reviewUiModel.getLanguage()));
    }

    public final RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i == 10) {
            return new C6474s(viewGroup, this.f14317f);
        }
        if (i == 11) {
            return new C6471p(viewGroup);
        }
        throw new IllegalStateException(C0069a.m175f("Header type ", i, " is not supported"));
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C6458c(viewGroup, this.f14316e, this.f14314c);
    }
}
