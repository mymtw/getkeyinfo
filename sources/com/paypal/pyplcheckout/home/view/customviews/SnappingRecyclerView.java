package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public class SnappingRecyclerView extends RecyclerView {
    private static final int MINIMUM_SCROLL_EVENT_OFFSET_MS = 20;
    private ChildViewMetrics childViewMetrics;
    @SuppressLint({"ClickableViewAccessibility"})
    private final View.OnTouchListener disableScrollTouchListener;
    private OnViewDismissedListener dismissedListener;
    private boolean isScrolling;
    private long lastScrollTime;
    private OnViewSelectedListener listener;
    private Handler mHandler;
    private Orientation orientation;
    private boolean scaleViews;
    /* access modifiers changed from: private */
    public int scrollState;
    /* access modifiers changed from: private */
    public boolean scrolling;
    private int selectedPosition;
    /* access modifiers changed from: private */
    public OnSmoothScrollByListener smoothScrollByListener;
    /* access modifiers changed from: private */
    public boolean userScrolling;

    public static class ChildViewMetrics {
        private Orientation _orientation;

        public ChildViewMetrics(Orientation orientation) {
            this._orientation = orientation;
        }

        public float center(View view) {
            return location(view) + ((float) (size(view) / 2));
        }

        public float location(View view) {
            return this._orientation == Orientation.VERTICAL ? view.getY() : view.getX();
        }

        public int size(View view) {
            return this._orientation == Orientation.VERTICAL ? view.getHeight() : view.getWidth();
        }
    }

    public interface OnSmoothScrollByListener {
        void onCompleted();
    }

    public interface OnViewDismissedListener {
        void onDismissed(View view, int i);
    }

    public interface OnViewSelectedListener {
        void onSelected(View view, int i);
    }

    public enum Orientation {
        HORIZONTAL(0),
        VERTICAL(1);
        
        public int value;

        private Orientation(int i) {
            this.value = i;
        }

        public int intValue() {
            return this.value;
        }
    }

    public SnappingRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void enableSnapping() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                SnappingRecyclerView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
        addOnScrollListener(new RecyclerView.C3108s() {
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    if (!SnappingRecyclerView.this.scrolling) {
                        SnappingRecyclerView.this.userScrolling = true;
                    }
                } else if (i == 0) {
                    if (SnappingRecyclerView.this.userScrolling) {
                        SnappingRecyclerView snappingRecyclerView = SnappingRecyclerView.this;
                        snappingRecyclerView.scrollToView(snappingRecyclerView.getCenterView());
                    }
                    SnappingRecyclerView.this.userScrolling = false;
                    SnappingRecyclerView.this.scrolling = false;
                    if (SnappingRecyclerView.this.getCenterView() != null) {
                        SnappingRecyclerView snappingRecyclerView2 = SnappingRecyclerView.this;
                        if (snappingRecyclerView2.getPercentageFromCenter(snappingRecyclerView2.getCenterView()) > 0.0f) {
                            SnappingRecyclerView snappingRecyclerView3 = SnappingRecyclerView.this;
                            snappingRecyclerView3.scrollToView(snappingRecyclerView3.getCenterView());
                        }
                    }
                    if (SnappingRecyclerView.this.smoothScrollByListener != null) {
                        SnappingRecyclerView.this.smoothScrollByListener.onCompleted();
                        SnappingRecyclerView.this.smoothScrollByListener = null;
                    }
                    SnappingRecyclerView.this.notifyListener();
                } else if (i == 2) {
                    SnappingRecyclerView.this.scrolling = true;
                }
                SnappingRecyclerView.this.scrollState = i;
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                SnappingRecyclerView.this.updateViews();
                super.onScrolled(recyclerView, i, i2);
            }
        });
    }

    private int getCenterLocation() {
        return this.orientation == Orientation.VERTICAL ? getMeasuredHeight() / 2 : getMeasuredWidth() / 2;
    }

    /* access modifiers changed from: private */
    public View getCenterView() {
        return getChildClosestToLocation(getCenterLocation());
    }

    private View getChildClosestToLocation(int i) {
        View view = null;
        if (getChildCount() <= 0) {
            return null;
        }
        int i2 = 9999;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            int center = ((int) this.childViewMetrics.center(childAt)) - i;
            if (Math.abs(center) < Math.abs(i2)) {
                view = childAt;
                i2 = center;
            }
        }
        return view;
    }

    /* access modifiers changed from: private */
    public float getPercentageFromCenter(View view) {
        float centerLocation = (float) getCenterLocation();
        float center = this.childViewMetrics.center(view);
        return (Math.max(centerLocation, center) - Math.min(centerLocation, center)) / (centerLocation + ((float) this.childViewMetrics.size(view)));
    }

    private int getScrollDistance(View view) {
        return ((int) this.childViewMetrics.center(view)) - getCenterLocation();
    }

    private void init() {
        setHasFixedSize(true);
        setOrientation(this.orientation);
        enableSnapping();
    }

    private boolean isChildCorrectlyCentered(View view) {
        int center = (int) this.childViewMetrics.center(view);
        return center > getCenterLocation() + -10 && center < getCenterLocation() + 10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* access modifiers changed from: private */
    public void notifyListener() {
        View centerView = getCenterView();
        int childAdapterPosition = getChildAdapterPosition(centerView);
        if (!(this.dismissedListener == null || childAdapterPosition == this.selectedPosition || childAdapterPosition == -1)) {
            for (int i = 0; i < getChildCount(); i++) {
                this.dismissedListener.onDismissed(getChildAt(i), childAdapterPosition);
            }
        }
        OnViewSelectedListener onViewSelectedListener = this.listener;
        if (!(onViewSelectedListener == null || childAdapterPosition == this.selectedPosition || childAdapterPosition == -1)) {
            onViewSelectedListener.onSelected(centerView, childAdapterPosition);
        }
        this.selectedPosition = childAdapterPosition;
    }

    private void scrollTo(int i) {
        scrollBy(i - getScrollOffset());
    }

    private void setMarginsForChild(View view) {
        int i;
        int i2;
        int i3;
        int B = getLayoutManager().mo11644B() - 1;
        int childAdapterPosition = getChildAdapterPosition(view);
        int i4 = 0;
        if (this.orientation == Orientation.VERTICAL) {
            i = childAdapterPosition == 0 ? getCenterLocation() : 0;
            i2 = childAdapterPosition == B ? getCenterLocation() : 0;
            i3 = 0;
        } else {
            int centerLocation = childAdapterPosition == 0 ? getCenterLocation() : 0;
            i3 = childAdapterPosition == B ? getCenterLocation() : 0;
            i2 = 0;
            i4 = centerLocation;
            i = 0;
        }
        if (this.orientation == Orientation.HORIZONTAL) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(i4);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginEnd(i3);
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2369e.m5233d(view) == 1) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i3, i, i4, i2);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i4, i, i3, i2);
        }
        if (!view.isInLayout()) {
            view.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    public void updateViews() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            setMarginsForChild(childAt);
            if (this.scaleViews) {
                float percentageFromCenter = 1.0f - (getPercentageFromCenter(childAt) * 0.5f);
                childAt.setScaleX(percentageFromCenter);
                childAt.setScaleY(percentageFromCenter);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.scrolling && this.scrollState == 1 && currentTimeMillis - this.lastScrollTime < 20) {
            this.userScrolling = true;
        }
        this.lastScrollTime = currentTimeMillis;
        View childClosestToLocation = getChildClosestToLocation((int) (this.orientation == Orientation.VERTICAL ? motionEvent.getY() : motionEvent.getX()));
        if (this.userScrolling || motionEvent.getAction() != 1 || childClosestToLocation == getCenterView()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        scrollToView(childClosestToLocation);
        return true;
    }

    public void enableViewScaling(boolean z) {
        this.scaleViews = z;
    }

    public int getScrollOffset() {
        return this.orientation == Orientation.VERTICAL ? computeVerticalScrollOffset() : computeHorizontalScrollOffset();
    }

    public int getSelectedPosition() {
        return this.selectedPosition;
    }

    public boolean isCarouselInScrollingState() {
        int i = this.scrollState;
        return i == 1 || i == 2;
    }

    public void onChildAttachedToWindow(View view) {
        super.onChildAttachedToWindow(view);
        if (!this.isScrolling && this.scrollState == 0) {
            this.isScrolling = true;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mHandler.removeCallbacksAndMessages((Object) null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getChildClosestToLocation((int) (this.orientation == Orientation.VERTICAL ? motionEvent.getY() : motionEvent.getX())) != getCenterView()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void scrollBy(int i) {
        if (this.orientation == Orientation.VERTICAL) {
            super.scrollBy(0, i);
        } else {
            super.scrollBy(i, 0);
        }
    }

    public void scrollToPosition(int i) {
        this.childViewMetrics.size(getChildAt(0));
        smoothScrollBy(this.childViewMetrics.size(getChildAt(0)) * i);
    }

    public void scrollToView(View view) {
        if (view != null) {
            stopScroll();
            int scrollDistance = getScrollDistance(view);
            if (scrollDistance != 0) {
                smoothScrollBy(scrollDistance);
            }
        }
    }

    public void setOnViewDismissedListener(OnViewDismissedListener onViewDismissedListener) {
        this.dismissedListener = onViewDismissedListener;
    }

    public void setOnViewSelectedListener(OnViewSelectedListener onViewSelectedListener) {
        this.listener = onViewSelectedListener;
    }

    @SuppressLint({"WrongConstant"})
    public void setOrientation(Orientation orientation2) {
        this.orientation = orientation2;
        this.childViewMetrics = new ChildViewMetrics(orientation2);
        getContext();
        setLayoutManager(new LinearLayoutManager(this.orientation.intValue(), false));
    }

    public void setScrollEnabled(boolean z) {
        if (z) {
            setOnTouchListener((View.OnTouchListener) null);
        } else {
            setOnTouchListener(this.disableScrollTouchListener);
        }
    }

    public void setSelectedPosition(int i) {
        this.selectedPosition = i;
        scrollToView(getChildAt(i));
    }

    public void smoothScrollBy(int i, OnSmoothScrollByListener onSmoothScrollByListener) {
        if (onSmoothScrollByListener != null) {
            this.smoothScrollByListener = onSmoothScrollByListener;
        }
        if (this.orientation == Orientation.VERTICAL) {
            super.smoothScrollBy(0, i);
        } else {
            super.smoothScrollBy(i, 0);
        }
    }

    public SnappingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SnappingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.userScrolling = false;
        this.scrolling = false;
        this.scrollState = 0;
        this.lastScrollTime = 0;
        this.mHandler = new Handler();
        this.scaleViews = true;
        this.orientation = Orientation.HORIZONTAL;
        this.selectedPosition = -1;
        this.disableScrollTouchListener = new C17253q();
        init();
    }

    public void smoothScrollBy(int i) {
        smoothScrollBy(i, (OnSmoothScrollByListener) null);
    }
}
