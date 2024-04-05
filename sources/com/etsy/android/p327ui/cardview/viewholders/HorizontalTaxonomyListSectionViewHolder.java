package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.vespa.viewholders.C12086e;
import com.etsy.android.vespa.viewholders.C12100o;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import p357gf.C12796e;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13182k;
import p431qf.C13327b;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.HorizontalTaxonomyListSectionViewHolder */
public final class HorizontalTaxonomyListSectionViewHolder extends C12100o {

    /* renamed from: com.etsy.android.ui.cardview.viewholders.HorizontalTaxonomyListSectionViewHolder$a */
    public static final class C9148a extends C13173c {
        public C9148a(Fragment fragment, C8703p pVar) {
            super(fragment, pVar, (C13182k) null, (C13895a) null, (C8923u) null, (C12796e) null);
        }

        public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
            C19383o.m32797g(b0Var, "holder");
            if (b0Var instanceof C12086e) {
                ((C12086e) b0Var).mo31374b();
            }
        }
    }

    public HorizontalTaxonomyListSectionViewHolder(C9187j0 j0Var) {
        super(j0Var.f20227a, j0Var.f20228b, j0Var.f20229c, j0Var.f20239m, j0Var.f20230d, j0Var.f20241o, j0Var.f20242p, j0Var.f20244r);
        final int dimensionPixelOffset = j0Var.f20227a.getResources().getDimensionPixelOffset(R.dimen.clg_space_8);
        final int dimensionPixelOffset2 = j0Var.f20227a.getResources().getDimensionPixelOffset(R.dimen.clg_space_12);
        this.f26987c.addItemDecoration(new C13327b(dimensionPixelOffset, dimensionPixelOffset, j0Var.f20227a.getResources().getDimensionPixelOffset(R.dimen.clg_space_12), 0, dimensionPixelOffset2));
        RecyclerView recyclerView = this.f26987c;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() {
            /* renamed from: h */
            public final boolean mo11240h(RecyclerView.LayoutParams layoutParams) {
                int i;
                int i2;
                int i3 = this.f7084n;
                RecyclerView recyclerView = this.f7072b;
                if (recyclerView != null) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    i = C2364y.C2369e.m5235f(recyclerView);
                } else {
                    i = 0;
                }
                int i4 = i3 - i;
                RecyclerView recyclerView2 = this.f7072b;
                if (recyclerView2 != null) {
                    WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                    i2 = C2364y.C2369e.m5234e(recyclerView2);
                } else {
                    i2 = 0;
                }
                int i5 = ((i4 - i2) - (dimensionPixelOffset2 * 2)) - (dimensionPixelOffset * 2);
                if (layoutParams != null) {
                    layoutParams.width = (int) (((float) i5) / 3.5f);
                }
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                return layoutParams != null;
            }
        });
        this.f26990f.f28991c.mo45890a(j0Var.f20230d);
    }

    /* renamed from: h */
    public final C13173c mo31381h(Fragment fragment, C8703p pVar, C13172b bVar) {
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(bVar, "viewHolderFactory");
        return new C9148a(fragment, pVar);
    }
}
