package com.etsy.android.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class MaxHeightFrameLayout extends LinearLayout {
    public int mMaxHeight;

    public MaxHeightFrameLayout(Context context) {
        super(context);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.mMaxHeight > 0 && View.MeasureSpec.getSize(i2) > (i3 = this.mMaxHeight)) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.mMaxHeight = i;
    }

    public MaxHeightFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
