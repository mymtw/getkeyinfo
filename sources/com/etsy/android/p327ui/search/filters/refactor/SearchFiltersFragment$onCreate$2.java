package com.etsy.android.p327ui.search.filters.refactor;

import android.os.Bundle;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersFragment$onCreate$2 */
public final class SearchFiltersFragment$onCreate$2 extends Lambda implements C19861p<String, Bundle, C19394m> {
    public final /* synthetic */ SearchFiltersFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersFragment$onCreate$2(SearchFiltersFragment searchFiltersFragment) {
        super(2);
        this.this$0 = searchFiltersFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Bundle) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, Bundle bundle) {
        C19383o.m32797g(str, "<anonymous parameter 0>");
        C19383o.m32797g(bundle, "bundle");
        FilterCountry filterCountry = (FilterCountry) bundle.getParcelable("ARG_FILTER_COUNTRY");
        if (filterCountry != null) {
            this.this$0.getViewModel().mo35785e(new C10813l.C10833t(filterCountry));
        }
    }
}
