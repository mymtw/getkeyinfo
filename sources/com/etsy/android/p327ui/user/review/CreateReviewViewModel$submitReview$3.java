package com.etsy.android.p327ui.user.review;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C2895z;
import androidx.room.C3257w;
import com.etsy.android.R;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.p327ui.user.review.C11751v;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.util.C12059p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$submitReview$3 */
public final class CreateReviewViewModel$submitReview$3 extends Lambda implements C19857l<C11751v, C19394m> {
    public final /* synthetic */ C11719r $cachedViewState;
    public final /* synthetic */ CreateReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewViewModel$submitReview$3(CreateReviewViewModel createReviewViewModel, C11719r rVar) {
        super(1);
        this.this$0 = createReviewViewModel;
        this.$cachedViewState = rVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11751v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11751v vVar) {
        String str;
        C11751v vVar2 = vVar;
        if (vVar2 instanceof C11751v.C11753b) {
            CreateReviewViewModel createReviewViewModel = this.this$0;
            createReviewViewModel.getClass();
            Transaction transaction = new Transaction();
            EtsyId transactionId = transaction.getTransactionId();
            ReviewFlow reviewFlow = createReviewViewModel.f25946x;
            if (reviewFlow != null) {
                String str2 = reviewFlow.f25980a.f26038d;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                transactionId.setIdKt(str2);
                transaction.setReview(new Review());
                Review review = transaction.getReview();
                ReviewFlow reviewFlow2 = createReviewViewModel.f25946x;
                if (reviewFlow2 != null) {
                    Integer num = reviewFlow2.f25980a.f26037c;
                    int i = 0;
                    if (num != null) {
                        i = num.intValue();
                    }
                    review.setRating(i);
                    createReviewViewModel.f25917I = transaction;
                    C2895z<C11719r> zVar = createReviewViewModel.f25930h;
                    ReviewFlow reviewFlow3 = createReviewViewModel.f25946x;
                    if (reviewFlow3 != null) {
                        ReviewFlowAction reviewFlowAction = reviewFlow3.f25980a.f26035a;
                        if (!(reviewFlowAction == null || (str = reviewFlowAction.f25986e) == null)) {
                            str3 = str;
                        }
                        zVar.setValue(new C11719r.C11728i(str3));
                        new Handler(Looper.getMainLooper()).postDelayed(new C3257w(createReviewViewModel, 2), 800);
                        return;
                    }
                    C19383o.m32805o("reviewFlowModel");
                    throw null;
                }
                C19383o.m32805o("reviewFlowModel");
                throw null;
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        } else if (vVar2 instanceof C11751v.C11752a) {
            CreateReviewViewModel createReviewViewModel2 = this.this$0;
            C19383o.m32796f(vVar2, "it");
            C11751v.C11752a aVar = (C11751v.C11752a) vVar2;
            C11719r rVar = this.$cachedViewState;
            if (rVar != null) {
                createReviewViewModel2.f25930h.postValue(rVar);
            }
            createReviewViewModel2.f25936n.postValue(new C12059p(new AlertData(R.drawable.clg_icon_core_exclamation_v1, createReviewViewModel2.mo37845c(aVar.f26188a, aVar.f26190c), (String) null, (Integer) null, CollageAlert.AlertType.ERROR, 0, (C19857l) null, 104, (DefaultConstructorMarker) null)));
        }
    }
}
