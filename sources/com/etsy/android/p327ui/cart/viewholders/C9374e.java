package com.etsy.android.p327ui.cart.viewholders;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;

/* renamed from: com.etsy.android.ui.cart.viewholders.e */
public final class C9374e extends RecyclerView.C3099n {

    /* renamed from: a */
    public int f20763a = -1;

    public C9374e(FragmentActivity fragmentActivity) {
        this.f20763a = fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.msco_cart_group_spacing);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        super.getItemOffsets(rect, view, recyclerView, yVar);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && C8914m.m17345c(view.getContext()) && childAdapterPosition == 0) {
            rect.top = this.f20763a;
        }
    }
}
