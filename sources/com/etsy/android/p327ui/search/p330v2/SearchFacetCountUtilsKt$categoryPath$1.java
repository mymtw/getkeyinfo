package com.etsy.android.p327ui.search.p330v2;

import com.etsy.android.lib.models.apiv3.FacetCount;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.SearchFacetCountUtilsKt$categoryPath$1 */
public final class SearchFacetCountUtilsKt$categoryPath$1 extends Lambda implements C19857l<FacetCount, CharSequence> {
    public static final SearchFacetCountUtilsKt$categoryPath$1 INSTANCE = new SearchFacetCountUtilsKt$categoryPath$1();

    public SearchFacetCountUtilsKt$categoryPath$1() {
        super(1);
    }

    public final CharSequence invoke(FacetCount facetCount) {
        C19383o.m32797g(facetCount, "it");
        String name = facetCount.getName();
        C19383o.m32796f(name, "it.name");
        return name;
    }
}
