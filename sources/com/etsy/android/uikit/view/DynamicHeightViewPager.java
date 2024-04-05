package com.etsy.android.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.shadow.ShadowDrawableWrapper;

public class DynamicHeightViewPager extends FixedViewPager {
    private int dynamicHeight;
    private double heightRatio;

    public DynamicHeightViewPager(Context context) {
        super(context);
    }

    public double getHeightRatio() {
        return this.heightRatio;
    }

    public void onMeasure(int i, int i2) {
        if (this.heightRatio > ShadowDrawableWrapper.COS_45) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * this.heightRatio), 1073741824);
        } else {
            int i3 = this.dynamicHeight;
            if (i3 > 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setHeight(int i) {
        if (this.dynamicHeight != i) {
            this.dynamicHeight = i;
            requestLayout();
        }
    }

    public void setHeightRatio(double d) {
        if (d != this.heightRatio) {
            this.heightRatio = d;
            requestLayout();
        }
    }

    public DynamicHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
