package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.C0174p;
import androidx.appcompat.view.menu.C0218f;
import androidx.core.view.C2319n;
import androidx.core.view.C2321o;
import androidx.core.view.C2323p;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import p289y0.C8352d;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0357w, C2319n, C2321o {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    public static final int[] ATTRS = {R.attr.actionBarSize, 16842841};
    private static final String TAG = "ActionBarOverlayLayout";
    private int mActionBarHeight;
    public ActionBarContainer mActionBarTop;
    private C0229d mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    public boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private C2348w0 mBaseInnerInsets;
    private final Rect mBaseInnerInsetsRect;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    public ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private C0358x mDecorToolbar;
    private OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private C2348w0 mInnerInsets;
    private final Rect mInnerInsetsRect;
    private final Rect mLastBaseContentInsets;
    private C2348w0 mLastBaseInnerInsets;
    private final Rect mLastBaseInnerInsetsRect;
    private C2348w0 mLastInnerInsets;
    private final Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final C2323p mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    public final AnimatorListenerAdapter mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    private int mWindowVisibility;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0226a extends AnimatorListenerAdapter {
        public C0226a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
            actionBarOverlayLayout.mAnimatingForFling = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
            actionBarOverlayLayout.mAnimatingForFling = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0227b implements Runnable {
        public C0227b() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0228c implements Runnable {
        public C0228c() {
        }

        public final void run() {
            ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY((float) (-ActionBarOverlayLayout.this.mActionBarTop.getHeight())).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0229d {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }

    private boolean applyInsets(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    private C0358x getDecorToolbar(View view) {
        if (view instanceof C0358x) {
            return (C0358x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder h = C0072d.m201h("Can't make a decor toolbar out of ");
        h.append(view.getClass().getSimpleName());
        throw new IllegalStateException(h.toString());
    }

    private void init(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        boolean z = false;
        this.mActionBarHeight = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.mWindowContentOverlay = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.mIgnoreWindowContentOverlay = z;
        this.mFlingEstimator = new OverScroller(context);
    }

    private void postAddActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mAddActionBarHideOffset, 600);
    }

    private void postRemoveActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mRemoveActionBarHideOffset, 600);
    }

    private void removeActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }

    private boolean shouldHideActionBarOnFling(float f) {
        this.mFlingEstimator.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.mFlingEstimator.getFinalY() > this.mActionBarTop.getHeight();
    }

    public boolean canShowOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.canShowOverflowMenu();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopups() {
        pullChildren();
        this.mDecorToolbar.mo3139j();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.mWindowContentOverlay != null && !this.mIgnoreWindowContentOverlay) {
            if (this.mActionBarTop.getVisibility() == 0) {
                i = (int) (this.mActionBarTop.getTranslationY() + ((float) this.mActionBarTop.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.mWindowContentOverlay.setBounds(0, i, getWidth(), this.mWindowContentOverlay.getIntrinsicHeight() + i);
            this.mWindowContentOverlay.draw(canvas);
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.mActionBarTop;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C2323p pVar = this.mParentHelper;
        return pVar.f5582b | pVar.f5581a;
    }

    public CharSequence getTitle() {
        pullChildren();
        return this.mDecorToolbar.getTitle();
    }

    public void haltActionBarHideOffsetAnimations() {
        removeCallbacks(this.mRemoveActionBarHideOffset);
        removeCallbacks(this.mAddActionBarHideOffset);
        ViewPropertyAnimator viewPropertyAnimator = this.mCurrentActionBarTopAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean hasIcon() {
        pullChildren();
        return this.mDecorToolbar.mo3131g();
    }

    public boolean hasLogo() {
        pullChildren();
        return this.mDecorToolbar.mo3148s();
    }

    public boolean hideOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.hideOverflowMenu();
    }

    public void initFeature(int i) {
        pullChildren();
        if (i == 2) {
            this.mDecorToolbar.mo3134h();
        } else if (i == 5) {
            this.mDecorToolbar.mo3159v();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.mHideOnContentScroll;
    }

    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }

    public boolean isOverflowMenuShowPending() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowing();
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        pullChildren();
        C2348w0 k = C2348w0.m5100k(this, windowInsets);
        boolean applyInsets = applyInsets(this.mActionBarTop, new Rect(k.mo8945e(), k.mo8948g(), k.mo8947f(), k.mo8944d()), true, true, false, true);
        Rect rect = this.mBaseContentInsets;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5255b(this, k, rect);
        Rect rect2 = this.mBaseContentInsets;
        C2348w0 m = k.f5615a.mo8965m(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.mBaseInnerInsets = m;
        boolean z = true;
        if (!this.mLastBaseInnerInsets.equals(m)) {
            this.mLastBaseInnerInsets = this.mBaseInnerInsets;
            applyInsets = true;
        }
        if (!this.mLastBaseContentInsets.equals(this.mBaseContentInsets)) {
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
        } else {
            z = applyInsets;
        }
        if (z) {
            requestLayout();
        }
        return k.f5615a.mo8978a().f5615a.mo8974c().f5615a.mo8973b().mo8951j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        init(getContext());
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2372h.m5253c(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        pullChildren();
        measureChildWithMargins(this.mActionBarTop, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.mActionBarTop.getLayoutParams();
        int max = Math.max(0, this.mActionBarTop.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.mActionBarTop.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.mActionBarTop.getMeasuredState());
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean z = (C2364y.C2368d.m5217g(this) & 256) != 0;
        if (z) {
            i3 = this.mActionBarHeight;
            if (this.mHasNonEmbeddedTabs && this.mActionBarTop.getTabContainer() != null) {
                i3 += this.mActionBarHeight;
            }
        } else {
            i3 = this.mActionBarTop.getVisibility() != 8 ? this.mActionBarTop.getMeasuredHeight() : 0;
        }
        this.mContentInsets.set(this.mBaseContentInsets);
        C2348w0 w0Var = this.mBaseInnerInsets;
        this.mInnerInsets = w0Var;
        if (this.mOverlayMode || z) {
            C8352d b = C8352d.m16668b(w0Var.mo8945e(), this.mInnerInsets.mo8948g() + i3, this.mInnerInsets.mo8947f(), this.mInnerInsets.mo8944d() + 0);
            C2348w0 w0Var2 = this.mInnerInsets;
            int i4 = Build.VERSION.SDK_INT;
            C2348w0.C2353e dVar = i4 >= 30 ? new C2348w0.C2352d(w0Var2) : i4 >= 29 ? new C2348w0.C2351c(w0Var2) : new C2348w0.C2350b(w0Var2);
            dVar.mo8954g(b);
            this.mInnerInsets = dVar.mo8952b();
        } else {
            Rect rect = this.mContentInsets;
            rect.top += i3;
            rect.bottom += 0;
            this.mInnerInsets = w0Var.f5615a.mo8965m(0, i3, 0, 0);
        }
        applyInsets(this.mContent, this.mContentInsets, true, true, true, true);
        if (!this.mLastInnerInsets.equals(this.mInnerInsets)) {
            C2348w0 w0Var3 = this.mInnerInsets;
            this.mLastInnerInsets = w0Var3;
            C2364y.m5187b(this.mContent, w0Var3);
        }
        measureChildWithMargins(this.mContent, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.mContent.getLayoutParams();
        int max3 = Math.max(max, this.mContent.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.mContent.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.mContent.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.mHideOnContentScroll || !z) {
            return false;
        }
        if (shouldHideActionBarOnFling(f2)) {
            addActionBarHideOffset();
        } else {
            removeActionBarHideOffset();
        }
        this.mAnimatingForFling = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        pullChildren();
        int i2 = this.mLastSystemUiVisibility ^ i;
        this.mLastSystemUiVisibility = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C0229d dVar = this.mActionBarVisibilityCallback;
        if (dVar != null) {
            ((C0174p) dVar).f440p = !z2;
            if (z || !z2) {
                C0174p pVar = (C0174p) dVar;
                if (pVar.f442r) {
                    pVar.f442r = false;
                    pVar.mo1431M(true);
                }
            } else {
                C0174p pVar2 = (C0174p) dVar;
                if (!pVar2.f442r) {
                    pVar2.f442r = true;
                    pVar2.mo1431M(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.mActionBarVisibilityCallback != null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.mWindowVisibility = i;
        C0229d dVar = this.mActionBarVisibilityCallback;
        if (dVar != null) {
            ((C0174p) dVar).f439o = i;
        }
    }

    public void pullChildren() {
        if (this.mContent == null) {
            this.mContent = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.mActionBarTop = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.mDecorToolbar = getDecorToolbar(findViewById(R.id.action_bar));
        }
    }

    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.mDecorToolbar.mo3147r(sparseArray);
    }

    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.mDecorToolbar.mo3143n(sparseArray);
    }

    public void setActionBarHideOffset(int i) {
        haltActionBarHideOffsetAnimations();
        this.mActionBarTop.setTranslationY((float) (-Math.max(0, Math.min(i, this.mActionBarTop.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0229d dVar) {
        this.mActionBarVisibilityCallback = dVar;
        if (getWindowToken() != null) {
            ((C0174p) this.mActionBarVisibilityCallback).f439o = this.mWindowVisibility;
            int i = this.mLastSystemUiVisibility;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2372h.m5253c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.mHasNonEmbeddedTabs = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.mHideOnContentScroll) {
            this.mHideOnContentScroll = z;
            if (!z) {
                haltActionBarHideOffsetAnimations();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        pullChildren();
        this.mDecorToolbar.setIcon(i);
    }

    public void setLogo(int i) {
        pullChildren();
        this.mDecorToolbar.mo3144o(i);
    }

    public void setMenu(Menu menu, C0218f.C0219a aVar) {
        pullChildren();
        this.mDecorToolbar.setMenu(menu, aVar);
    }

    public void setMenuPrepared() {
        pullChildren();
        this.mDecorToolbar.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.mOverlayMode = z;
        this.mIgnoreWindowContentOverlay = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        pullChildren();
        this.mDecorToolbar.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean showOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.showOverflowMenu();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mBaseInnerInsetsRect = new Rect();
        this.mLastBaseInnerInsetsRect = new Rect();
        this.mInnerInsetsRect = new Rect();
        this.mLastInnerInsetsRect = new Rect();
        C2348w0 w0Var = C2348w0.f5614b;
        this.mBaseInnerInsets = w0Var;
        this.mLastBaseInnerInsets = w0Var;
        this.mInnerInsets = w0Var;
        this.mLastInnerInsets = w0Var;
        this.mTopAnimatorListener = new C0226a();
        this.mRemoveActionBarHideOffset = new C0227b();
        this.mAddActionBarHideOffset = new C0228c();
        init(context);
        this.mParentHelper = new C2323p();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r1 = (androidx.appcompat.app.C0174p) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            androidx.core.view.p r1 = r0.mParentHelper
            r2 = 0
            r1.mo8912a(r3, r2)
            int r1 = r0.getActionBarHideOffset()
            r0.mHideOnContentScrollReference = r1
            r0.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.mActionBarVisibilityCallback
            if (r1 == 0) goto L_0x001f
            androidx.appcompat.app.p r1 = (androidx.appcompat.app.C0174p) r1
            f.b r2 = r1.f445u
            if (r2 == 0) goto L_0x001f
            r2.mo18910a()
            r2 = 0
            r1.f445u = r2
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.mActionBarTop.getVisibility() != 0) {
            return false;
        }
        return this.mHideOnContentScroll;
    }

    public void onStopNestedScroll(View view) {
        if (this.mHideOnContentScroll && !this.mAnimatingForFling) {
            if (this.mHideOnContentScrollReference <= this.mActionBarTop.getHeight()) {
                postRemoveActionBarHideOffset();
            } else {
                postAddActionBarHideOffset();
            }
        }
        C0229d dVar = this.mActionBarVisibilityCallback;
        if (dVar != null) {
            dVar.getClass();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.mHideOnContentScrollReference + i2;
        this.mHideOnContentScrollReference = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        pullChildren();
        this.mDecorToolbar.setIcon(drawable);
    }
}
