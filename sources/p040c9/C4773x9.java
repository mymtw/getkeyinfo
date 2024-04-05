package p040c9;

import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.x9 */
public final class C4773x9 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10757b;

    public C4773x9(C4579j1 j1Var) {
        this.f10757b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SavedSearchEmailPromptFragment savedSearchEmailPromptFragment = (SavedSearchEmailPromptFragment) obj;
        savedSearchEmailPromptFragment.savedSearchRepository = this.f10757b.mo14409r();
        savedSearchEmailPromptFragment.schedulers = new C13461f();
    }
}
