package com.etsy.android.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.lib.logger.C8694h;

public class FixedViewPager extends ViewPager {
    private static final String TAG = FixedViewPager.class.getName();

    public FixedViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isFakeDragging()) {
            C8694h.f19097a.mo21310e("onInterceptTouchEvent would have crashed fakeDragBy");
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public FixedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
