package com.etsy.android.p327ui.search;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.p330v2.C10969a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.d */
public final class C10744d extends C10969a {

    /* renamed from: h */
    public final boolean f23677h;

    public C10744d(int i, int i2, boolean z) {
        super(i, i2, z);
        this.f23677h = z;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        super.getItemOffsets(rect, view, recyclerView, yVar);
        if (!this.f23677h) {
            return;
        }
        if (this.f24324f) {
            rect.left = 0;
        } else if (this.f24325g) {
            rect.right = 0;
        }
    }
}
