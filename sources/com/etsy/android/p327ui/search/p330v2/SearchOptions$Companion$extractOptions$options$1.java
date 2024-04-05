package com.etsy.android.p327ui.search.p330v2;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p478x9.C13858f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Companion$extractOptions$options$1 */
final class SearchOptions$Companion$extractOptions$options$1 extends Lambda implements C19857l<String, String> {
    public final /* synthetic */ C13858f $route;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchOptions$Companion$extractOptions$options$1(C13858f fVar) {
        super(1);
        this.$route = fVar;
    }

    public final String invoke(String str) {
        C19383o.m32797g(str, "it");
        return this.$route.f30493d.get(str);
    }
}
