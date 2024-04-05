package com.etsy.android.p327ui.search.container;

import android.os.Bundle;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$onViewCreated$2 */
public final class SearchContainerFragment$onViewCreated$2 extends Lambda implements C19861p<String, Bundle, C19394m> {
    public final /* synthetic */ SearchContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchContainerFragment$onViewCreated$2(SearchContainerFragment searchContainerFragment) {
        super(2);
        this.this$0 = searchContainerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Bundle) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, Bundle bundle) {
        C19383o.m32797g(str, "<anonymous parameter 0>");
        C19383o.m32797g(bundle, "bundle");
        String string = bundle.getString("query", "");
        SearchOptions searchOptions = (SearchOptions) bundle.getParcelable("filters");
        boolean z = bundle.getBoolean("featured_categories", false);
        if (searchOptions != null) {
            SearchContainerFragment searchContainerFragment = this.this$0;
            C19383o.m32796f(string, "query");
            SearchContainerFragment.onShowResultsClicked$default(searchContainerFragment, string, searchOptions, z, false, 8, (Object) null);
        }
    }
}
