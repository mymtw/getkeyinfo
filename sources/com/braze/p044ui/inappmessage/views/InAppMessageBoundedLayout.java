package com.braze.p044ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.appboy.p043ui.C4940R;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageBoundedLayout */
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int mMaxDefinedHeightPixels;
    private int mMaxDefinedWidthPixels;
    private int mMinDefinedHeightPixels;
    private int mMinDefinedWidthPixels;

    public InAppMessageBoundedLayout(Context context) {
        super(context);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.mMinDefinedWidthPixels;
        if (i3 <= 0 || size >= i3) {
            int i4 = this.mMaxDefinedWidthPixels;
            if (i4 > 0 && size > i4) {
                i = View.MeasureSpec.makeMeasureSpec(this.mMaxDefinedWidthPixels, View.MeasureSpec.getMode(i));
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(this.mMinDefinedWidthPixels, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.mMinDefinedHeightPixels;
        if (i5 <= 0 || size2 >= i5) {
            int i6 = this.mMaxDefinedHeightPixels;
            if (i6 > 0 && size2 > i6) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.mMaxDefinedHeightPixels, View.MeasureSpec.getMode(i2));
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mMinDefinedHeightPixels, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4940R.styleable.InAppMessageBoundedLayout);
        this.mMaxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(C4940R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
        this.mMinDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(C4940R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
        this.mMaxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(C4940R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
        this.mMinDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(C4940R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }
}
