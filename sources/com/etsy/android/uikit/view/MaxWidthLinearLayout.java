package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.p015ui.text.input.C1993m;

public class MaxWidthLinearLayout extends LinearLayout {
    public int mMaxWidth;

    public MaxWidthLinearLayout(Context context) {
        super(context);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1993m.f4497l, 0, 0);
        try {
            this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.mMaxWidth > 0 && View.MeasureSpec.getSize(i) > (i3 = this.mMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
