package com.etsy.android.p327ui.search.filters.refactor;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersSelectedSpec$toMap$1 */
final class SearchFiltersSelectedSpec$toMap$1 extends Lambda implements C19857l<ShippingFilter, CharSequence> {
    public static final SearchFiltersSelectedSpec$toMap$1 INSTANCE = new SearchFiltersSelectedSpec$toMap$1();

    public SearchFiltersSelectedSpec$toMap$1() {
        super(1);
    }

    public final CharSequence invoke(ShippingFilter shippingFilter) {
        C19383o.m32797g(shippingFilter, "it");
        return String.valueOf(shippingFilter.getDays());
    }
}
