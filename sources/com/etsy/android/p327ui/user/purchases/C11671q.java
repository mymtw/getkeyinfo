package com.etsy.android.p327ui.user.purchases;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.q */
public final class C11671q extends RecyclerView.C3099n {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        if (recyclerView.getChildAdapterPosition(view) == yVar.mo11715b() - 1) {
            rect.bottom = recyclerView.getResources().getDimensionPixelSize(R.dimen.clg_space_12);
        }
    }
}
