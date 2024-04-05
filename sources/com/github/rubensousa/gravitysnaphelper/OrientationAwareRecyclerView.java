package com.github.rubensousa.gravitysnaphelper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class OrientationAwareRecyclerView extends RecyclerView {
    private float lastX;
    private float lastY;
    /* access modifiers changed from: private */
    public boolean scrolling;

    /* renamed from: com.github.rubensousa.gravitysnaphelper.OrientationAwareRecyclerView$a */
    public class C12599a extends RecyclerView.C3108s {
        public C12599a() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            boolean unused = OrientationAwareRecyclerView.this.scrolling = i != 0;
        }
    }

    public OrientationAwareRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RecyclerView.C3100o layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked == 0) {
            this.lastX = motionEvent.getX();
            this.lastY = motionEvent.getY();
            if (this.scrolling) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(1);
                return super.onInterceptTouchEvent(obtain);
            }
        } else if (actionMasked == 2) {
            z = Math.abs(motionEvent.getY() - this.lastY) > Math.abs(motionEvent.getX() - this.lastX) ? layoutManager.mo11298g() : layoutManager.mo11297f();
        }
        if (!z) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public OrientationAwareRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OrientationAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastX = 0.0f;
        this.lastY = 0.0f;
        this.scrolling = false;
        addOnScrollListener(new C12599a());
    }
}
