package com.etsy.android.p327ui.search.container;

import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.p327ui.search.p330v2.C10974e;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p357gf.C12794c;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$onViewCreated$1 */
public final class SearchContainerFragment$onViewCreated$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ SearchContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchContainerFragment$onViewCreated$1(SearchContainerFragment searchContainerFragment) {
        super(0);
        this.this$0 = searchContainerFragment;
    }

    public final void invoke() {
        String query;
        C12794c access$getTopChildFragment = this.this$0.getTopChildFragment();
        String str = "";
        if ((access$getTopChildFragment instanceof C10974e) && (query = ((C10974e) access$getTopChildFragment).getQuery()) != null) {
            str = query;
        }
        C10866i access$getSearchHelper$p = this.this$0.searchHelper;
        if (access$getSearchHelper$p != null) {
            access$getSearchHelper$p.mo36074f(str);
        }
    }
}
