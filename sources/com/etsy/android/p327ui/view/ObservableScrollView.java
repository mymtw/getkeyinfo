package com.etsy.android.p327ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* renamed from: com.etsy.android.ui.view.ObservableScrollView */
public class ObservableScrollView extends NestedScrollView {
    private C11792a mCallbacks;
    private float mLastX;
    private float mLastY;
    private float mXDistance;
    private float mYDistance;

    /* renamed from: com.etsy.android.ui.view.ObservableScrollView$a */
    public interface C11792a {
        void onScrollChanged();
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mYDistance = 0.0f;
            this.mXDistance = 0.0f;
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mXDistance = Math.abs(x - this.mLastX) + this.mXDistance;
            float abs = Math.abs(y - this.mLastY) + this.mYDistance;
            this.mYDistance = abs;
            this.mLastX = x;
            this.mLastY = y;
            if (this.mXDistance > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C11792a aVar = this.mCallbacks;
        if (aVar != null) {
            aVar.onScrollChanged();
        }
    }

    public void setCallbacks(C11792a aVar) {
        this.mCallbacks = aVar;
    }
}
