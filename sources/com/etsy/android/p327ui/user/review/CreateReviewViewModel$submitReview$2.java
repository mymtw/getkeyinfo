package com.etsy.android.p327ui.user.review;

import com.etsy.android.R;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.util.C12059p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$submitReview$2 */
public final class CreateReviewViewModel$submitReview$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C11719r $cachedViewState;
    public final /* synthetic */ CreateReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewViewModel$submitReview$2(CreateReviewViewModel createReviewViewModel, C11719r rVar) {
        super(1);
        this.this$0 = createReviewViewModel;
        this.$cachedViewState = rVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        Throwable th2 = th;
        C19383o.m32797g(th2, "it");
        CreateReviewViewModel createReviewViewModel = this.this$0;
        if (true && true) {
            th2 = null;
        }
        C11719r rVar = this.$cachedViewState;
        if (rVar != null) {
            createReviewViewModel.f25930h.postValue(rVar);
        }
        createReviewViewModel.f25936n.postValue(new C12059p(new AlertData(R.drawable.clg_icon_core_exclamation_v1, createReviewViewModel.mo37845c((String) null, th2), (String) null, (Integer) null, CollageAlert.AlertType.ERROR, 0, (C19857l) null, 104, (DefaultConstructorMarker) null)));
    }
}
