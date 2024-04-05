package com.etsy.android.p327ui.search.filters.refactor.category;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.stylekit.views.CollageContentToggle;

/* renamed from: com.etsy.android.ui.search.filters.refactor.category.SearchFiltersCategoryViewHolder */
public final class SearchFiltersCategoryViewHolder extends C10862y {

    /* renamed from: b */
    public final CollageContentToggle f23911b;

    /* renamed from: c */
    public final C10794a f23912c;

    /* renamed from: d */
    public final RecyclerView f23913d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchFiltersCategoryViewHolder(android.view.ViewGroup r8, p753kq.C19857l<? super com.etsy.android.p327ui.search.filters.refactor.C10813l, kotlin.C19394m> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "onItemChange"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            com.etsy.android.stylekit.views.CollageContentToggle r0 = new com.etsy.android.stylekit.views.CollageContentToggle
            android.content.Context r2 = r8.getContext()
            java.lang.String r1 = "parent.context"
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.<init>(r0)
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggle"
            kotlin.jvm.internal.C19383o.m32795e(r0, r1)
            com.etsy.android.stylekit.views.CollageContentToggle r0 = (com.etsy.android.stylekit.views.CollageContentToggle) r0
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>((int) r2, (int) r3)
            r0.setLayoutParams(r1)
            r7.f23911b = r0
            com.etsy.android.ui.search.filters.refactor.category.a r1 = new com.etsy.android.ui.search.filters.refactor.category.a
            r1.<init>(r9)
            r7.f23912c = r1
            androidx.recyclerview.widget.RecyclerView r9 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r2 = r0.getContext()
            r9.<init>(r2)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.getContext()
            r2.<init>()
            r9.setLayoutManager(r2)
            r9.setAdapter(r1)
            r7.f23913d = r9
            r0.addView(r9)
            android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.START
            r0.setDescriptionEllipsize(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.category.SearchFiltersCategoryViewHolder.<init>(android.view.ViewGroup, kq.l):void");
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.C10781b) {
            this.f23911b.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f23911b.setDescription(searchFiltersUiGroupItem.mo35794c());
            ViewExtensions.m12870n(this.f23913d, new SearchFiltersCategoryViewHolder$bind$1(searchFiltersUiGroupItem));
            this.f23912c.mo11950j(((SearchFiltersUiGroupItem.C10781b) searchFiltersUiGroupItem).f23847d);
        }
    }
}
