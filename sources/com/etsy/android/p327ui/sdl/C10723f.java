package com.etsy.android.p327ui.sdl;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.sdl.f */
public final class C10723f extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f23654a;

    /* renamed from: b */
    public GridLayoutManager f23655b;

    /* renamed from: c */
    public GridLayoutManager.C3075b f23656c;

    public C10723f(int i) {
        this.f23654a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        if (this.f23655b == null) {
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f23655b = gridLayoutManager;
            this.f23656c = gridLayoutManager.f7008K;
        }
        GridLayoutManager gridLayoutManager2 = this.f23655b;
        C19383o.m32794d(gridLayoutManager2);
        int i = gridLayoutManager2.f7003F;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition >= 0) {
            GridLayoutManager.C3075b bVar = this.f23656c;
            C19383o.m32794d(bVar);
            if (i / bVar.mo11265d(childAdapterPosition) == 3) {
                int i2 = this.f23654a;
                rect.top = i2;
                rect.bottom = i2;
                rect.left = i2;
                rect.right = i2;
            }
        }
    }
}
