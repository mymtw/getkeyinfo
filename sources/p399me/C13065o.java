package p399me;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.stylekit.views.CollageContentToggle;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: me.o */
public final class C13065o extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f28731b;

    /* renamed from: c */
    public final CollageContentToggle f28732c;

    /* renamed from: d */
    public final C13068r f28733d;

    /* renamed from: e */
    public final RecyclerView f28734e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13065o(android.view.ViewGroup r8, p753kq.C19857l<? super com.etsy.android.p327ui.search.filters.refactor.C10813l, kotlin.C19394m> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "onEvent"
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
            r7.f28731b = r9
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggle"
            kotlin.jvm.internal.C19383o.m32795e(r0, r1)
            com.etsy.android.stylekit.views.CollageContentToggle r0 = (com.etsy.android.stylekit.views.CollageContentToggle) r0
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>((int) r2, (int) r3)
            r0.setLayoutParams(r1)
            r7.f28732c = r0
            me.r r1 = new me.r
            r1.<init>(r9)
            r7.f28733d = r1
            androidx.recyclerview.widget.RecyclerView r9 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r2 = r0.getContext()
            r9.<init>(r2)
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r8.getContext()
            r8 = 3
            r2.<init>(r8)
            me.r$b r8 = new me.r$b
            r8.<init>()
            r2.f7008K = r8
            r9.setLayoutManager(r2)
            r9.setAdapter(r1)
            r8 = 1
            r9.setHasFixedSize(r8)
            r7.f28734e = r9
            r0.addView(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p399me.C13065o.<init>(android.view.ViewGroup, kq.l):void");
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.SizeSelect) {
            this.f28732c.setListener(new C13058h(searchFiltersUiGroupItem.mo35793b(), this.f28731b));
            this.f28732c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f28732c.setDescription(searchFiltersUiGroupItem.mo35794c());
            SearchFiltersUiGroupItem.SizeSelect sizeSelect = (SearchFiltersUiGroupItem.SizeSelect) searchFiltersUiGroupItem;
            if (sizeSelect.f23834d.isEmpty()) {
                ViewExtensions.m12860d(this.f28734e);
                return;
            }
            ViewExtensions.m12869m(this.f28734e);
            this.f28733d.mo11950j(sizeSelect.f23834d);
            this.f28732c.setExpanded(searchFiltersUiGroupItem.mo35792a());
        }
    }
}
