package com.etsy.android.p327ui.search.p330v2;

import android.net.Uri;
import com.etsy.android.p327ui.search.C10865h;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Companion$extractOptions$options$2 */
public final class SearchOptions$Companion$extractOptions$options$2 extends Lambda implements C19857l<String, String> {
    public final /* synthetic */ C10865h $searchUriParser;
    public final /* synthetic */ Uri $uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchOptions$Companion$extractOptions$options$2(C10865h hVar, Uri uri) {
        super(1);
        this.$searchUriParser = hVar;
        this.$uri = uri;
    }

    public final String invoke(String str) {
        C19383o.m32797g(str, "it");
        return this.$searchUriParser.mo36068a(this.$uri).get(str);
    }
}
