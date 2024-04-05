package p040c9;

import com.etsy.android.p327ui.core.review.C9715e;
import com.etsy.android.p327ui.core.review.ListingVideoReviewFragment;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import dagger.android.C17550a;
import kotlin.C19285c;
import p568fn.C17782b;

/* renamed from: c9.l8 */
public final class C4614l8 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10408b;

    public C4614l8(C4579j1 j1Var) {
        this.f10408b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        this.f10408b.f10205a.getClass();
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        TransactionDataRepository a = TransactionDataRepository.C11867a.m19552a();
        C17782b.m29841G(a);
        ((ListingVideoReviewFragment) obj).viewModel = new C9715e(a, this.f10408b.f10198Y2.get());
    }
}
