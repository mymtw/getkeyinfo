package com.etsy.android.p327ui.user.purchases;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.Transaction;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p001a0.C0005b;
import p143i9.C7003e;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesFragment$handleOnReviewUpdated$1$1 */
public final class PurchasesFragment$handleOnReviewUpdated$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Transaction $it;
    public final /* synthetic */ PurchasesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesFragment$handleOnReviewUpdated$1$1(PurchasesFragment purchasesFragment, Transaction transaction) {
        super(0);
        this.this$0 = purchasesFragment;
        this.$it = transaction;
    }

    public final void invoke() {
        C11672r presenter = this.this$0.getPresenter();
        Transaction transaction = this.$it;
        presenter.getClass();
        C19383o.m32797g(transaction, "transaction");
        FragmentActivity fragmentActivity = presenter.f25838a.getFragmentActivity();
        if (fragmentActivity != null) {
            Review review = transaction.getReview();
            boolean z = false;
            if (review != null && review.getRating() == 5) {
                z = true;
            }
            if (z && presenter.f25849l.f15562b.mo21132b(C8592b.f18784d1)) {
                C19697g.m33468f(presenter.f25851n, (CoroutineContext) null, (CoroutineStart) null, new PurchasesPresenter$handleReviewUpdated$1(new C7003e(presenter.f25849l, presenter.f25844g, C0005b.m28V(fragmentActivity)), fragmentActivity, (C19340c<? super PurchasesPresenter$handleReviewUpdated$1>) null), 3);
            }
        }
    }
}
