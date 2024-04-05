package com.etsy.android.p327ui.search.p330v2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.a */
public class C10969a extends RecyclerView.C3099n {

    /* renamed from: a */
    public final boolean f24319a;

    /* renamed from: b */
    public final int f24320b;

    /* renamed from: c */
    public final int f24321c;

    /* renamed from: d */
    public GridLayoutManager f24322d;

    /* renamed from: e */
    public GridLayoutManager.C3075b f24323e;

    /* renamed from: f */
    public boolean f24324f;

    /* renamed from: g */
    public boolean f24325g;

    public C10969a(int i, int i2, boolean z) {
        this.f24319a = z;
        this.f24320b = i;
        this.f24321c = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        if (this.f24322d == null) {
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f24322d = gridLayoutManager;
            this.f24323e = gridLayoutManager.f7008K;
        }
        GridLayoutManager gridLayoutManager2 = this.f24322d;
        C19383o.m32794d(gridLayoutManager2);
        int i = gridLayoutManager2.f7003F;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition >= 0) {
            GridLayoutManager.C3075b bVar = this.f24323e;
            C19383o.m32794d(bVar);
            int d = bVar.mo11265d(childAdapterPosition);
            if (d != i) {
                GridLayoutManager.C3075b bVar2 = this.f24323e;
                C19383o.m32794d(bVar2);
                int c = bVar2.mo11264c(childAdapterPosition, i);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                C19383o.m32794d(adapter);
                int itemCount = adapter.getItemCount();
                int i2 = 0;
                boolean z = true;
                boolean z2 = d != 1 ? childAdapterPosition - (c / d) > itemCount - 1 : (childAdapterPosition + i) - c > itemCount - 1;
                GridLayoutManager.C3075b bVar3 = this.f24323e;
                C19383o.m32794d(bVar3);
                boolean z3 = bVar3.mo11267b(childAdapterPosition, i) == 0;
                this.f24324f = c == 0;
                if (c != d) {
                    z = false;
                }
                this.f24325g = z;
                if (this.f24319a) {
                    int i3 = this.f24320b;
                    rect.left = i3 - ((c * i3) / i);
                    rect.right = ((c + d) * i3) / i;
                    int i4 = this.f24321c;
                    rect.top = i4;
                    if (z2) {
                        i2 = i4;
                    }
                    rect.bottom = i2;
                    return;
                }
                int i5 = this.f24320b;
                rect.left = (c * i5) / i;
                rect.right = i5 - (((c + d) * i5) / i);
                if (!z3) {
                    i2 = this.f24321c;
                }
                rect.top = i2;
            }
        }
    }
}
