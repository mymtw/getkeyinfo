package p040c9;

import com.etsy.android.p327ui.search.container.SearchContainerFragment;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.ba */
public final class C4476ba implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9780b;

    public C4476ba(C4579j1 j1Var) {
        this.f9780b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) obj;
        searchContainerFragment.logCat = this.f9780b.f10212b0.get();
        searchContainerFragment.schedulers = new C13461f();
        searchContainerFragment.homeEventManager = this.f9780b.f10208a2.get();
    }
}
