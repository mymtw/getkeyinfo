package com.etsy.android.p327ui.search.listingresults;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.qualtrics.BOEQualtricsPromptDisplay$Companion$showPrompt$1;
import com.etsy.android.qualtrics.C8949a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onCreateView$3 */
public final class SearchResultsListingsFragment$onCreateView$3 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ SearchResultsListingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsFragment$onCreateView$3(SearchResultsListingsFragment searchResultsListingsFragment) {
        super(1);
        this.this$0 = searchResultsListingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "url");
        FragmentActivity requireActivity = this.this$0.requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        requireActivity.getLifecycle().mo10733a(new BOEQualtricsPromptDisplay$Companion$showPrompt$1(requireActivity, new C8949a(), str));
    }
}
