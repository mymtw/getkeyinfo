package com.etsy.android.p327ui.search.p330v2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.b */
public final class C10970b extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f24326a;

    /* renamed from: b */
    public final int f24327b;

    /* renamed from: c */
    public final int f24328c;

    /* renamed from: d */
    public final int f24329d;

    public C10970b(int i, int i2, int i3, int i4) {
        this.f24326a = i;
        this.f24327b = i2;
        this.f24328c = i3;
        this.f24329d = i4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition >= 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(childAdapterPosition)) : null;
            if (valueOf != null && valueOf.intValue() == R.id.view_type_search_query_reformulations_list) {
                rect.top = this.f24326a;
                rect.bottom = this.f24327b;
            } else if (valueOf != null && valueOf.intValue() == R.id.view_type_search_query_reformulations_list_inline) {
                rect.top = this.f24328c;
                rect.bottom = this.f24329d;
            }
        }
    }
}
