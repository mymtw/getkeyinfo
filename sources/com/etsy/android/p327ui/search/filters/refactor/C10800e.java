package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;

/* renamed from: com.etsy.android.ui.search.filters.refactor.e */
public final class C10800e extends C10862y {

    /* renamed from: b */
    public final TextView f23927b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10800e(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_none, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.text_search_filter_missing);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…xt_search_filter_missing)");
        this.f23927b = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        TextView textView = this.f23927b;
        StringBuilder h = C0072d.m201h("Missing ViewHolder or viewtype() implementation for ");
        h.append(C19386q.m32807a(searchFiltersUiGroupItem.getClass()).mo71918b());
        textView.setText(h.toString());
    }
}
