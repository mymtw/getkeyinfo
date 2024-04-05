package com.etsy.android.feedback;

import android.view.View;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.feedback.data.SortType;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p131h9.C6962a;
import p753kq.C19857l;

public final class ItemReviewsFragment$onCreateView$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ItemReviewsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemReviewsFragment$onCreateView$1(ItemReviewsFragment itemReviewsFragment) {
        super(1);
        this.this$0 = itemReviewsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        FeedbackViewModel access$getViewModel$p = this.this$0.viewModel;
        if (access$getViewModel$p != null) {
            C6962a a = C6962a.m13497a(access$getViewModel$p.f14280r, (SortType) null, Rating.NONE, false, false, false, 25);
            access$getViewModel$p.f14280r = a;
            access$getViewModel$p.f14281s.postValue(new FeedbackViewModel.C6448c.C6451c(a));
            access$getViewModel$p.mo18351k();
            return;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }
}
