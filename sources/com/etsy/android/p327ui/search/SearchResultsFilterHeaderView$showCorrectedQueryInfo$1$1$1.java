package com.etsy.android.p327ui.search;

import android.view.View;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView$showCorrectedQueryInfo$1$1$1 */
public final class SearchResultsFilterHeaderView$showCorrectedQueryInfo$1$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9141v $clickHandler;
    public final /* synthetic */ String $url;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView$showCorrectedQueryInfo$1$1$1(C9141v vVar, String str) {
        super(1);
        this.$clickHandler = vVar;
        this.$url = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9141v vVar = this.$clickHandler;
        String str = this.$url;
        vVar.getClass();
        C19383o.m32797g(str, "url");
        vVar.f20082b.invoke(str);
    }
}
