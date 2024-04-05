package com.etsy.android.p327ui.search.p330v2.taxonomy;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$onCreate$2 */
public final class SearchTaxonomyCategoryPageFragment$onCreate$2 extends Lambda implements C19861p<String, String, C19394m> {
    public final /* synthetic */ SearchTaxonomyCategoryPageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchTaxonomyCategoryPageFragment$onCreate$2(SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment) {
        super(2);
        this.this$0 = searchTaxonomyCategoryPageFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, String str2) {
        C19383o.m32797g(str, "displayLocation");
        C19383o.m32797g(str2, "loggingKey");
        this.this$0.getAdImpressionRepository().mo20868b(str, str2);
    }
}
