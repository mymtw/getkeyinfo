package com.etsy.android.feedback;

import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.models.RatingsPercents;
import com.etsy.android.p327ui.shop.C11135c1;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.feedback.f */
public final /* synthetic */ class C6461f implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ FeedbackViewModel f14326b;

    /* renamed from: c */
    public final /* synthetic */ String f14327c;

    /* renamed from: d */
    public final /* synthetic */ String f14328d;

    public /* synthetic */ C6461f(FeedbackViewModel feedbackViewModel, String str, String str2) {
        this.f14326b = feedbackViewModel;
        this.f14327c = str;
        this.f14328d = str2;
    }

    public final void accept(Object obj) {
        FeedbackViewModel feedbackViewModel = this.f14326b;
        String str = this.f14327c;
        String str2 = this.f14328d;
        C11135c1 c1Var = (C11135c1) obj;
        C19383o.m32797g(feedbackViewModel, "this$0");
        if (c1Var instanceof C11135c1.C11137b) {
            C11135c1.C11137b bVar = (C11135c1.C11137b) c1Var;
            feedbackViewModel.f14275m.postValue(new FeedbackViewModel.C6440b.C6443c(FeedbackViewModel.m12874d(str, str2, bVar.f24629a), bVar.f24630b, 0, (RatingsPercents) null));
            feedbackViewModel.mo18350j();
            return;
        }
        feedbackViewModel.f14275m.postValue(FeedbackViewModel.C6440b.C6441a.f14291a);
    }
}
