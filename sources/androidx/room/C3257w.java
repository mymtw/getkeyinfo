package androidx.room;

import android.graphics.Rect;
import android.view.View;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.user.review.CreateReviewViewModel;
import com.etsy.android.p327ui.user.review.ReviewTrackingSource;
import com.paypal.pyplcheckout.home.view.customviews.alertview.PayPalAlertToastView;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;

/* renamed from: androidx.room.w */
public final /* synthetic */ class C3257w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7578b;

    /* renamed from: c */
    public final /* synthetic */ Object f7579c;

    public /* synthetic */ C3257w(Object obj, int i) {
        this.f7578b = i;
        this.f7579c = obj;
    }

    public final void run() {
        switch (this.f7578b) {
            case 0:
                ((C3258x) this.f7579c).getClass();
                throw null;
            case 1:
                View view = (View) this.f7579c;
                C19383o.m32797g(view, "$this_scrollUpToTop");
                view.requestRectangleOnScreen(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                return;
            case 2:
                CreateReviewViewModel createReviewViewModel = (CreateReviewViewModel) this.f7579c;
                C19383o.m32797g(createReviewViewModel, "this$0");
                if (createReviewViewModel.f25947y.size() <= 1 || !createReviewViewModel.f25926d.f19116n.mo21132b(C8592b.C8595c.f18860d)) {
                    createReviewViewModel.mo37844b();
                    return;
                }
                ArrayList arrayList = createReviewViewModel.f25947y;
                Transaction transaction = createReviewViewModel.f25917I;
                EtsyId transactionId = transaction != null ? transaction.getTransactionId() : null;
                C19389t.m32907a(arrayList);
                arrayList.remove(transactionId);
                createReviewViewModel.f25948z = ReviewTrackingSource.REVIEW;
                createReviewViewModel.mo37850i((Integer) null, ((EtsyId) createReviewViewModel.f25947y.get(0)).getId(), !createReviewViewModel.f25910B);
                return;
            default:
                PayPalAlertToastView.m35395animateShow$lambda0((PayPalAlertToastView) this.f7579c);
                return;
        }
    }
}
