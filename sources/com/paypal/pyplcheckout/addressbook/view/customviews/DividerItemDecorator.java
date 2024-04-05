package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class DividerItemDecorator extends RecyclerView.C3099n {
    private final Drawable mDivider;

    public DividerItemDecorator(Drawable drawable) {
        C19383o.m32797g(drawable, "divider");
        this.mDivider = drawable;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(canvas, "canvas");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 1;
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            C19383o.m32796f(childAt, "parent.getChildAt(i)");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) layoutParams).bottomMargin;
                this.mDivider.setBounds(paddingLeft, bottom, width, this.mDivider.getIntrinsicHeight() + bottom);
                this.mDivider.draw(canvas);
                i = i2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            }
        }
    }
}
