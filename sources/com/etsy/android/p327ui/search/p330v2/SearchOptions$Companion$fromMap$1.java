package com.etsy.android.p327ui.search.p330v2;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Companion$fromMap$1 */
public final class SearchOptions$Companion$fromMap$1 extends Lambda implements C19857l<String, String> {
    public final /* synthetic */ Map<String, String> $filterMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchOptions$Companion$fromMap$1(Map<String, String> map) {
        super(1);
        this.$filterMap = map;
    }

    public final String invoke(String str) {
        C19383o.m32797g(str, "it");
        return this.$filterMap.get(str);
    }
}
