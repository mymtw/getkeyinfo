package com.etsy.android.p327ui.search.listingresults;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsViewHolderFactory$create$1 */
public final class SearchResultsViewHolderFactory$create$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ SearchResultsViewHolderFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsViewHolderFactory$create$1(SearchResultsViewHolderFactory searchResultsViewHolderFactory) {
        super(1);
        this.this$0 = searchResultsViewHolderFactory;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "url");
        this.this$0.f24196l.invoke(str);
    }
}
