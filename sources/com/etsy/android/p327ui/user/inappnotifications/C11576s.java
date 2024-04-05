package com.etsy.android.p327ui.user.inappnotifications;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.s */
public final class C11576s extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f25640a;

    public C11576s(int i) {
        this.f25640a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (childAdapterPosition < (adapter != null ? adapter.getItemCount() : 0) - 1) {
            rect.right = this.f25640a;
        }
    }
}
