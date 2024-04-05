package com.etsy.android.p327ui.search.shopresults;

import kotlin.C19394m;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.shopresults.SearchResultsShopsFragment$onCreate$1 */
public /* synthetic */ class SearchResultsShopsFragment$onCreate$1 extends FunctionReferenceImpl implements C19857l<Long, C19394m> {
    public SearchResultsShopsFragment$onCreate$1(Object obj) {
        super(1, obj, SearchResultsShopsFragment.class, "onShopCardClicked", "onShopCardClicked(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C19394m.f43287a;
    }

    public final void invoke(long j) {
        ((SearchResultsShopsFragment) this.receiver).onShopCardClicked(j);
    }
}
