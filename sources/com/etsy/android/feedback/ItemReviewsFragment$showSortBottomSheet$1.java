package com.etsy.android.feedback;

import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.feedback.data.SortType;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p131h9.C6962a;
import p753kq.C19857l;

public /* synthetic */ class ItemReviewsFragment$showSortBottomSheet$1 extends FunctionReferenceImpl implements C19857l<SortType, C19394m> {
    public ItemReviewsFragment$showSortBottomSheet$1(Object obj) {
        super(1, obj, FeedbackViewModel.class, "updateSort", "updateSort(Lcom/etsy/android/feedback/data/SortType;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SortType) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SortType sortType) {
        C19383o.m32797g(sortType, "p0");
        FeedbackViewModel feedbackViewModel = (FeedbackViewModel) this.receiver;
        feedbackViewModel.getClass();
        C6962a a = C6962a.m13497a(feedbackViewModel.f14280r, sortType, (Rating) null, false, false, true, 14);
        feedbackViewModel.f14280r = a;
        feedbackViewModel.f14281s.postValue(new FeedbackViewModel.C6448c.C6451c(a));
        feedbackViewModel.mo18351k();
    }
}
