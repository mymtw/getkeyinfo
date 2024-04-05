package com.etsy.android.uikit.viewholder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.viewholder.l */
public final class C11999l extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f26738a;

    /* renamed from: b */
    public final int f26739b;

    public C11999l(int i, int i2) {
        this.f26738a = i;
        this.f26739b = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        rect.left = recyclerView.getChildAdapterPosition(view) == 0 ? this.f26739b : this.f26738a;
        rect.right = recyclerView.getChildAdapterPosition(view) == yVar.mo11715b() + -1 ? this.f26739b : this.f26738a;
    }
}
