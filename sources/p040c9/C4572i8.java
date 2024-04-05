package p040c9;

import com.etsy.android.p327ui.core.review.C9711b;
import com.etsy.android.p327ui.core.review.ListingReviewPagerAdapter;
import com.etsy.android.p327ui.core.review.ListingReviewPagerFragment;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import dagger.android.C17550a;
import kotlin.C19285c;
import p346fa.C12703a;
import p568fn.C17782b;

/* renamed from: c9.i8 */
public final class C4572i8 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10056b;

    /* renamed from: c */
    public final C4690r4 f10057c;

    public C4572i8(C4579j1 j1Var, C4690r4 r4Var) {
        this.f10056b = j1Var;
        this.f10057c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ListingReviewPagerFragment listingReviewPagerFragment = (ListingReviewPagerFragment) obj;
        this.f10056b.f10205a.getClass();
        C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
        TransactionDataRepository a = TransactionDataRepository.C11867a.m19552a();
        C17782b.m29841G(a);
        listingReviewPagerFragment.viewModel = new C9711b(a, this.f10056b.f10198Y2.get(), (C12703a) this.f10056b.f10308s0.get());
        listingReviewPagerFragment.pagerAdapter = new ListingReviewPagerAdapter(this.f10056b.f10298q0.get(), this.f10057c.mo14417c());
    }
}
