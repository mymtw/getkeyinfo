package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.text.input.C1993m;

public class FlowLayout extends ViewGroup {
    private boolean centerVertically = false;
    private int horizontalSpacing;
    private int verticalSpacing;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4490e);
        try {
            this.horizontalSpacing = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.verticalSpacing = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.centerVertically = obtainStyledAttributes.getBoolean(4, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void verticallyAdjustChildView(int i, int i2) {
        View childAt = getChildAt(i2);
        FlowLayoutParams flowLayoutParams = (FlowLayoutParams) childAt.getLayoutParams();
        flowLayoutParams.f26480y = ((i - childAt.getMeasuredHeight()) / 2) + flowLayoutParams.f26480y;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FlowLayoutParams;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                FlowLayoutParams flowLayoutParams = (FlowLayoutParams) childAt.getLayoutParams();
                int i6 = flowLayoutParams.f26479x;
                childAt.layout(i6, flowLayoutParams.f26480y, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + flowLayoutParams.f26480y);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = i;
        int i6 = i2;
        int size = View.MeasureSpec.getSize(i) - getPaddingRight();
        boolean z2 = View.MeasureSpec.getMode(i) != 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z3 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        while (i9 < childCount) {
            int i13 = childCount;
            View childAt = getChildAt(i9);
            int i14 = i12;
            int i15 = i11;
            if (childAt.getVisibility() == 8) {
                i12 = i14;
                i11 = i15;
            } else {
                measureChild(childAt, i5, i6);
                FlowLayoutParams flowLayoutParams = (FlowLayoutParams) childAt.getLayoutParams();
                i11 = this.horizontalSpacing;
                if (!z2 || (!z4 && childAt.getMeasuredWidth() + paddingLeft <= size)) {
                    i8 = Math.max(i8, childAt.getMeasuredHeight());
                    i3 = i10;
                    z = false;
                } else {
                    if (this.centerVertically) {
                        for (int i16 = i14; i16 < i9; i16++) {
                            verticallyAdjustChildView(i8, i16);
                        }
                        i4 = i9;
                        i8 = 0;
                    } else {
                        i4 = i14;
                    }
                    paddingTop += i7 + this.verticalSpacing;
                    int max = Math.max(i10, paddingLeft - i11);
                    paddingLeft = getPaddingLeft();
                    i14 = i4;
                    z = true;
                    i3 = max;
                    i7 = 0;
                }
                flowLayoutParams.f26479x = paddingLeft;
                flowLayoutParams.f26480y = paddingTop;
                int measuredWidth = childAt.getMeasuredWidth() + i11 + paddingLeft;
                i7 = Math.max(i7, childAt.getMeasuredHeight());
                boolean z5 = flowLayoutParams.breakLine;
                z3 = z;
                i10 = i3;
                i12 = i14;
                int i17 = measuredWidth;
                z4 = z5;
                paddingLeft = i17;
            }
            i9++;
            childCount = i13;
        }
        int i18 = i11;
        int i19 = i12;
        if (!z3) {
            i10 = Math.max(i10, paddingLeft - i18);
            if (this.centerVertically) {
                for (int i20 = i19; i20 < getChildCount(); i20++) {
                    verticallyAdjustChildView(i7, i20);
                }
            }
        }
        setMeasuredDimension(View.resolveSize(getPaddingRight() + i10, i5), View.resolveSize(getPaddingBottom() + i7 + paddingTop, i6));
    }

    public FlowLayoutParams generateDefaultLayoutParams() {
        return new FlowLayoutParams(-2, -2);
    }

    public FlowLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FlowLayoutParams(getContext(), attributeSet);
    }

    public FlowLayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FlowLayoutParams(layoutParams.width, layoutParams.height);
    }

    public static class FlowLayoutParams extends ViewGroup.LayoutParams {
        public boolean breakLine;

        /* renamed from: x */
        public int f26479x;

        /* renamed from: y */
        public int f26480y;

        public FlowLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4491f);
            try {
                this.breakLine = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public FlowLayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
