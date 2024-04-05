package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p123h1.C6916c;
import p260v0.C8184a;

public class SlidingPaneLayout extends ViewGroup {
    private static final int DEFAULT_FADE_COLOR = -858993460;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    public final C6916c mDragHelper;
    private boolean mFirstLayout;
    private Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    public boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private C3279d mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    public final ArrayList<C3277b> mPostedRunnables;
    public boolean mPreservedOpenState;
    private Field mRecreateDisplayList;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    public float mSlideOffset;
    public int mSlideRange;
    public View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3275a();

        /* renamed from: b */
        public boolean f7620b;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public static class C3275a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7620b ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel, (ClassLoader) null);
            this.f7620b = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C3276a extends C2273a {

        /* renamed from: a */
        public final Rect f7621a = new Rect();

        public C3276a() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(bVar.f14759a);
            C6689b bVar2 = new C6689b(obtain);
            super.onInitializeAccessibilityNodeInfo(view, bVar2);
            Rect rect = this.f7621a;
            bVar2.mo18854e(rect);
            bVar.mo18864n(rect);
            obtain.getBoundsInScreen(rect);
            bVar.f14759a.setBoundsInScreen(rect);
            bVar.f14759a.setVisibleToUser(bVar2.mo18860i());
            bVar.f14759a.setPackageName(obtain.getPackageName());
            bVar.mo18867q(obtain.getClassName());
            bVar.mo18870t(bVar2.mo18856f());
            bVar.f14759a.setEnabled(obtain.isEnabled());
            bVar.f14759a.setClickable(obtain.isClickable());
            bVar.f14759a.setFocusable(obtain.isFocusable());
            bVar.f14759a.setFocused(obtain.isFocused());
            bVar.mo18863m(obtain.isAccessibilityFocused());
            bVar.f14759a.setSelected(obtain.isSelected());
            bVar.f14759a.setLongClickable(obtain.isLongClickable());
            bVar.mo18850a(obtain.getActions());
            bVar.f14759a.setMovementGranularities(obtain.getMovementGranularities());
            bVar2.mo18861k();
            bVar.mo18867q(SlidingPaneLayout.class.getName());
            bVar.f14761c = -1;
            bVar.f14759a.setSource(view);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            ViewParent f = C2364y.C2368d.m5216f(view);
            if (f instanceof View) {
                bVar.f14760b = -1;
                bVar.f14759a.setParent((View) f);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!SlidingPaneLayout.this.isDimmed(childAt) && childAt.getVisibility() == 0) {
                    C2364y.C2368d.m5229s(childAt, 1);
                    bVar.f14759a.addChild(childAt);
                }
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!SlidingPaneLayout.this.isDimmed(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C3277b implements Runnable {

        /* renamed from: b */
        public final View f7623b;

        public C3277b(View view) {
            this.f7623b = view;
        }

        public final void run() {
            if (this.f7623b.getParent() == SlidingPaneLayout.this) {
                this.f7623b.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.invalidateChildRegion(this.f7623b);
            }
            SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C3278c extends C6916c.C6919c {
        public C3278c() {
        }

        /* renamed from: a */
        public final int mo10012a(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.mSlideableView.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin));
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        /* renamed from: b */
        public final int mo10013b(View view, int i) {
            return view.getTop();
        }

        /* renamed from: c */
        public final int mo10014c(View view) {
            return SlidingPaneLayout.this.mSlideRange;
        }

        /* renamed from: e */
        public final void mo10015e(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.mo19041c(i2, slidingPaneLayout.mSlideableView);
        }

        /* renamed from: g */
        public final void mo10017g(int i, View view) {
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        /* renamed from: h */
        public final void mo10018h(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.mDragHelper.f15308a != 0) {
                return;
            }
            if (slidingPaneLayout.mSlideOffset == 0.0f) {
                slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                SlidingPaneLayout.this.mPreservedOpenState = false;
                return;
            }
            slidingPaneLayout.dispatchOnPanelOpened(slidingPaneLayout.mSlideableView);
            SlidingPaneLayout.this.mPreservedOpenState = true;
        }

        /* renamed from: i */
        public final void mo10019i(View view, int i, int i2) {
            SlidingPaneLayout.this.onPanelDragged(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: j */
        public final void mo10020j(float f, float f2, View view) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.mSlideRange;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    i += SlidingPaneLayout.this.mSlideRange;
                }
            }
            SlidingPaneLayout.this.mDragHelper.mo19056t(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: k */
        public final boolean mo10021k(int i, View view) {
            if (SlidingPaneLayout.this.mIsUnableToDrag) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).slideable;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C3279d {
        /* renamed from: a */
        void mo12200a();

        /* renamed from: b */
        void mo12201b();

        /* renamed from: c */
        void mo12202c();
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean closePane(View view, int i) {
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private void dimChildView(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.dimPaint == null) {
                layoutParams.dimPaint = new Paint();
            }
            layoutParams.dimPaint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.dimPaint);
            }
            invalidateChildRegion(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.dimPaint;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            C3277b bVar = new C3277b(view);
            this.mPostedRunnables.add(bVar);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5223m(this, bVar);
        }
    }

    private boolean openPane(View view, int i) {
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parallaxOtherViews(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.isLayoutRtlSupport()
            android.view.View r1 = r9.mSlideableView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.dimWhenOffset
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0057
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.mSlideableView
            if (r4 != r5) goto L_0x002c
            goto L_0x0054
        L_0x002c:
            float r5 = r9.mParallaxOffset
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.mParallaxBy
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.mParallaxOffset = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0042
            int r5 = -r5
        L_0x0042:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0054
            float r5 = r9.mParallaxOffset
            if (r0 == 0) goto L_0x004d
            float r5 = r5 - r6
            goto L_0x004f
        L_0x004d:
            float r5 = r6 - r5
        L_0x004f:
            int r6 = r9.mCoveredFadeColor
            r9.dimChildView(r4, r5, r6)
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.parallaxOtherViews(float):void");
    }

    private static boolean viewIsOpaque(View view) {
        return view.isOpaque();
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(isLayoutRtlSupport() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.mDragHelper.mo19046h()) {
            return;
        }
        if (!this.mCanSlide) {
            this.mDragHelper.mo19039a();
            return;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5221k(this);
    }

    public void dispatchOnPanelClosed(View view) {
        C3279d dVar = this.mPanelSlideListener;
        if (dVar != null) {
            dVar.mo12201b();
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelOpened(View view) {
        C3279d dVar = this.mPanelSlideListener;
        if (dVar != null) {
            dVar.mo12202c();
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelSlide(View view) {
        C3279d dVar = this.mPanelSlideListener;
        if (dVar != null) {
            dVar.mo12200a();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = isLayoutRtlSupport() ? this.mShadowDrawableRight : this.mShadowDrawableLeft;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isLayoutRtlSupport()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (isLayoutRtlSupport()) {
                Rect rect = this.mTmpRect;
                rect.left = Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                Rect rect2 = this.mTmpRect;
                rect2.right = Math.min(rect2.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    public void invalidateChildRegion(View view) {
        Paint paint = ((LayoutParams) view.getLayoutParams()).dimPaint;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2369e.m5238i(view, paint);
    }

    public boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        return this.mCanSlide && ((LayoutParams) view.getLayoutParams()).dimWhenOffset && this.mSlideOffset > 0.0f;
    }

    public boolean isLayoutRtlSupport() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(this) == 1;
    }

    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 1.0f;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        int size = this.mPostedRunnables.size();
        for (int i = 0; i < size; i++) {
            this.mPostedRunnables.get(i).run();
        }
        this.mPostedRunnables.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mDragHelper.getClass();
            this.mPreservedOpenState = !C6916c.m13376m(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.mCanSlide || (this.mIsUnableToDrag && actionMasked != 0)) {
            this.mDragHelper.mo19040b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.mDragHelper.mo19040b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.mIsUnableToDrag = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.mInitialMotionX = x;
                this.mInitialMotionY = y;
                this.mDragHelper.getClass();
                if (C6916c.m13376m(this.mSlideableView, (int) x, (int) y) && isDimmed(this.mSlideableView)) {
                    z = true;
                    return this.mDragHelper.mo19057u(motionEvent) || z;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.mInitialMotionX);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                C6916c cVar = this.mDragHelper;
                if (abs > ((float) cVar.f15309b) && abs2 > abs) {
                    cVar.mo19040b();
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
            z = false;
            if (this.mDragHelper.mo19057u(motionEvent)) {
                return true;
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        if (isLayoutRtlSupport) {
            this.mDragHelper.f15324q = 2;
        } else {
            this.mDragHelper.f15324q = 1;
        }
        int i10 = i3 - i;
        int paddingRight = isLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            this.mSlideOffset = (!this.mCanSlide || !this.mPreservedOpenState) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13 - this.mOverhangSize) - i11) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.mSlideRange = min;
                    int i14 = isLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.dimWhenOffset = (measuredWidth / 2) + ((i11 + i14) + min) > i13;
                    int i15 = (int) (((float) min) * this.mSlideOffset);
                    i6 = i14 + i15 + i11;
                    this.mSlideOffset = ((float) i15) / ((float) min);
                    i5 = 0;
                } else if (!this.mCanSlide || (i9 = this.mParallaxBy) == 0) {
                    i6 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.mSlideOffset) * ((float) i9));
                    i6 = paddingRight;
                }
                if (isLayoutRtlSupport) {
                    i7 = (i10 - i6) + i5;
                    i8 = i7 - measuredWidth;
                } else {
                    i8 = i6 - i5;
                    i7 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i7, childAt.getMeasuredHeight() + paddingTop);
                i11 = i6;
                paddingRight = childAt.getWidth() + paddingRight;
            }
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide) {
                if (this.mParallaxBy != 0) {
                    parallaxOtherViews(this.mSlideOffset);
                }
                if (((LayoutParams) this.mSlideableView.getLayoutParams()).dimWhenOffset) {
                    dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    dimChildView(getChildAt(i16), 0.0f, this.mSliderFadeColor);
                }
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x002f
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0027
            if (r1 != r6) goto L_0x0023
            goto L_0x0044
        L_0x0023:
            if (r1 != 0) goto L_0x0044
            r2 = r5
            goto L_0x0044
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            if (r3 != 0) goto L_0x0044
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0044
            r4 = r5
            r3 = r6
            goto L_0x0044
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            r1 = 0
            if (r3 == r6) goto L_0x0057
            if (r3 == r7) goto L_0x004c
            r4 = r1
        L_0x004a:
            r5 = r4
            goto L_0x0063
        L_0x004c:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            goto L_0x004a
        L_0x0057:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = r1
        L_0x0063:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 2
            if (r9 <= r10) goto L_0x007c
            java.lang.String r10 = "SlidingPaneLayout"
            java.lang.String r11 = "onMeasure: More than two child views are not supported."
            android.util.Log.e(r10, r11)
        L_0x007c:
            r10 = 0
            r0.mSlideableView = r10
            r11 = r1
            r12 = r11
            r14 = r8
            r13 = 0
        L_0x0083:
            r15 = 8
            r16 = 1
            if (r11 >= r9) goto L_0x0122
            android.view.View r6 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r17 = r6.getLayoutParams()
            r7 = r17
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x009f
            r7.dimWhenOffset = r1
            goto L_0x0119
        L_0x009f:
            float r10 = r7.weight
            r15 = 0
            int r18 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x00ad
            float r13 = r13 + r10
            int r10 = r7.width
            if (r10 != 0) goto L_0x00ad
            goto L_0x0119
        L_0x00ad:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00c5
            int r10 = r8 - r10
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r22 = r13
            r13 = r15
            r1 = -1
        L_0x00c3:
            r15 = r10
            goto L_0x00db
        L_0x00c5:
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r1) goto L_0x00d5
            int r10 = r8 - r10
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            goto L_0x00c3
        L_0x00d5:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00db:
            int r10 = r7.height
            r1 = -2
            if (r10 != r1) goto L_0x00e5
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            goto L_0x00f6
        L_0x00e5:
            r1 = -1
            if (r10 != r1) goto L_0x00ef
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            goto L_0x00f5
        L_0x00ef:
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
        L_0x00f5:
            r1 = r10
        L_0x00f6:
            r6.measure(r15, r1)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            if (r3 != r13) goto L_0x0109
            if (r10 <= r4) goto L_0x0109
            int r4 = java.lang.Math.min(r10, r5)
        L_0x0109:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x010f
            r1 = r16
            goto L_0x0110
        L_0x010f:
            r1 = 0
        L_0x0110:
            r7.slideable = r1
            r12 = r12 | r1
            if (r1 == 0) goto L_0x0117
            r0.mSlideableView = r6
        L_0x0117:
            r13 = r22
        L_0x0119:
            int r11 = r11 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0083
        L_0x0122:
            if (r12 != 0) goto L_0x0129
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0216
        L_0x0129:
            int r1 = r0.mOverhangSize
            int r1 = r8 - r1
            r3 = 0
        L_0x012e:
            if (r3 >= r9) goto L_0x0216
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 != r15) goto L_0x0141
        L_0x013a:
            r19 = r1
        L_0x013c:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x020e
        L_0x0141:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x014e
            goto L_0x013a
        L_0x014e:
            int r10 = r7.width
            if (r10 != 0) goto L_0x015c
            float r10 = r7.weight
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x015c
            r10 = r16
            goto L_0x015d
        L_0x015c:
            r10 = 0
        L_0x015d:
            if (r10 == 0) goto L_0x0161
            r11 = 0
            goto L_0x0165
        L_0x0161:
            int r11 = r6.getMeasuredWidth()
        L_0x0165:
            if (r12 == 0) goto L_0x01ab
            android.view.View r15 = r0.mSlideableView
            if (r6 == r15) goto L_0x01ab
            int r15 = r7.width
            if (r15 >= 0) goto L_0x013a
            if (r11 > r1) goto L_0x0178
            float r11 = r7.weight
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x013a
        L_0x0178:
            if (r10 == 0) goto L_0x0199
            int r7 = r7.height
            r10 = -2
            if (r7 != r10) goto L_0x0188
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x01a3
        L_0x0188:
            r10 = -1
            if (r7 != r10) goto L_0x0192
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x01a3
        L_0x0192:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            goto L_0x01a3
        L_0x0199:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
        L_0x01a3:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r6.measure(r11, r7)
            goto L_0x013a
        L_0x01ab:
            float r10 = r7.weight
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x013a
            int r10 = r7.width
            if (r10 != 0) goto L_0x01d5
            int r10 = r7.height
            r15 = -2
            if (r10 != r15) goto L_0x01c4
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01df
        L_0x01c4:
            r15 = -1
            if (r10 != r15) goto L_0x01ce
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            goto L_0x01df
        L_0x01ce:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            goto L_0x01df
        L_0x01d5:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = r6.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
        L_0x01df:
            if (r12 == 0) goto L_0x01f7
            int r15 = r7.leftMargin
            int r7 = r7.rightMargin
            int r15 = r15 + r7
            int r7 = r8 - r15
            r19 = r1
            r15 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r15)
            if (r11 == r7) goto L_0x013c
            r6.measure(r1, r10)
            goto L_0x013c
        L_0x01f7:
            r19 = r1
            r1 = 0
            int r15 = java.lang.Math.max(r1, r14)
            float r7 = r7.weight
            float r15 = (float) r15
            float r7 = r7 * r15
            float r7 = r7 / r13
            int r7 = (int) r7
            int r11 = r11 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r7)
            r6.measure(r11, r10)
        L_0x020e:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x012e
        L_0x0216:
            int r1 = r20.getPaddingTop()
            int r1 = r1 + r4
            int r3 = r20.getPaddingBottom()
            int r3 = r3 + r1
            r0.setMeasuredDimension(r2, r3)
            r0.mCanSlide = r12
            h1.c r1 = r0.mDragHelper
            int r2 = r1.f15308a
            if (r2 == 0) goto L_0x0230
            if (r12 != 0) goto L_0x0230
            r1.mo19039a()
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public void onPanelDragged(int i) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (isLayoutRtlSupport) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((isLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (isLayoutRtlSupport ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.mSlideRange);
        this.mSlideOffset = paddingRight;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(paddingRight);
        }
        if (layoutParams.dimWhenOffset) {
            dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f7620b) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.f7620b;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7620b = isSlideable() ? isOpen() : this.mPreservedOpenState;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.mFirstLayout = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.mo19050n(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
        } else if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.mInitialMotionX;
            float f2 = y2 - this.mInitialMotionY;
            int i = this.mDragHelper.f15309b;
            if ((f2 * f2) + (f * f) < ((float) (i * i)) && C6916c.m13376m(this.mSlideableView, (int) x2, (int) y2)) {
                closePane(this.mSlideableView, 0);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.mCanSlide) {
            this.mPreservedOpenState = view == this.mSlideableView;
        }
    }

    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public void setCoveredFadeColor(int i) {
        this.mCoveredFadeColor = i;
    }

    public void setPanelSlideListener(C3279d dVar) {
        this.mPanelSlideListener = dVar;
    }

    public void setParallaxDistance(int i) {
        this.mParallaxBy = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setShadowDrawableLeft(C8184a.C8187c.m16466b(context, i));
    }

    public void setShadowResourceRight(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setShadowDrawableRight(C8184a.C8187c.m16466b(context, i));
    }

    public void setSliderFadeColor(int i) {
        this.mSliderFadeColor = i;
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public boolean smoothSlideTo(float f, int i) {
        int i2;
        if (!this.mCanSlide) {
            return false;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (isLayoutRtlSupport) {
            int paddingRight = getPaddingRight() + layoutParams.rightMargin;
            int width = this.mSlideableView.getWidth();
            i2 = (int) (((float) getWidth()) - (((f * ((float) this.mSlideRange)) + ((float) paddingRight)) + ((float) width)));
        } else {
            i2 = (int) ((f * ((float) this.mSlideRange)) + ((float) (getPaddingLeft() + layoutParams.leftMargin)));
        }
        C6916c cVar = this.mDragHelper;
        View view = this.mSlideableView;
        if (!cVar.mo19058v(view, i2, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5221k(this);
        return true;
    }

    public void updateObscuredViewsVisibility(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int width = isLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !viewIsOpaque(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = isLayoutRtlSupport;
                } else {
                    z = isLayoutRtlSupport;
                    childAt.setVisibility((Math.max(isLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(isLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                }
                i5++;
                view2 = view;
                isLayoutRtlSupport = z;
            } else {
                return;
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {16843137};
        public Paint dimPaint;
        public boolean dimWhenOffset;
        public boolean slideable;
        public float weight = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = layoutParams.weight;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSliderFadeColor = DEFAULT_FADE_COLOR;
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.mOverhangSize = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C2364y.m5201p(this, new C3276a());
        C2364y.C2368d.m5229s(this, 1);
        C6916c i2 = C6916c.m13375i(this, 0.5f, new C3278c());
        this.mDragHelper = i2;
        i2.f15321n = f * 400.0f;
    }

    public boolean closePane() {
        return closePane(this.mSlideableView, 0);
    }

    public boolean openPane() {
        return openPane(this.mSlideableView, 0);
    }
}
