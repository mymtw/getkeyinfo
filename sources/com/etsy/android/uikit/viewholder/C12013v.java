package com.etsy.android.uikit.viewholder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.etsy.android.uikit.viewholder.v */
public class C12013v extends RecyclerView.C3099n {

    /* renamed from: a */
    public int f26773a = 0;

    /* renamed from: b */
    public int f26774b;

    /* renamed from: c */
    public int f26775c;

    /* renamed from: d */
    public int f26776d;

    public C12013v(int i) {
        this.f26774b = i;
        this.f26775c = 0;
        this.f26776d = 0;
    }

    /* renamed from: f */
    public boolean mo31303f(View view, RecyclerView recyclerView) {
        throw null;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        if (mo31303f(view, recyclerView)) {
            rect.left = this.f26773a;
            rect.top = this.f26774b;
            rect.right = this.f26775c;
            rect.bottom = this.f26776d;
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, yVar);
    }
}
