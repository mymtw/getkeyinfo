package com.etsy.android.p327ui.search;

import android.view.View;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p414oe.C13166d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView$bindFilterPills$1$1 */
public final class SearchResultsFilterHeaderView$bindFilterPills$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9141v $clickHandler;
    public final /* synthetic */ C13166d $priceOption;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView$bindFilterPills$1$1(C9141v vVar, C13166d dVar) {
        super(1);
        this.$clickHandler = vVar;
        this.$priceOption = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (view != null) {
            C9141v vVar = this.$clickHandler;
            C13166d dVar = this.$priceOption;
            boolean z = !view.isSelected();
            view.setSelected(z);
            vVar.getClass();
            C19383o.m32797g(dVar, "priceFilterOption");
            vVar.f20085e.invoke(dVar, Boolean.valueOf(z));
        }
    }
}
