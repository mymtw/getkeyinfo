package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C15342a;
import com.google.android.material.internal.C15345b;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p003a2.C0023f;
import p260v0.C8184a;
import p507al.C14022a;
import p610kp.C18161c;
import p629nk.C18268a;
import p638ok.C18312d;
import p688uk.C18602a;

public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = 2132018406;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    public final C15342a collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    private Drawable contentScrim;
    public int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    public final C18602a elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;
    public C2348w0 lastInsets;
    private AppBarLayout.C15185g onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    public Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;
    private ViewGroup toolbar;
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C15186a implements C2325q {
        public C15186a() {
        }

        /* renamed from: b */
        public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
            return CollapsingToolbarLayout.this.onWindowInsetChanged(w0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C15187b implements ValueAnimator.AnimatorUpdateListener {
        public C15187b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public class C15188c implements AppBarLayout.C15185g {
        public C15188c() {
        }

        /* renamed from: a */
        public final void mo52957a(int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i;
            C2348w0 w0Var = collapsingToolbarLayout.lastInsets;
            int g = w0Var != null ? w0Var.mo8948g() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C18312d viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i3 = layoutParams.collapseMode;
                if (i3 == 1) {
                    viewOffsetHelper.mo69851b(C19543e0.m33285A(-i, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i3 == 2) {
                    viewOffsetHelper.mo69851b(Math.round(((float) (-i)) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && g > 0) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5221k(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            int d = (height - C2364y.C2368d.m5214d(collapsingToolbarLayout3)) - g;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            C15342a aVar = CollapsingToolbarLayout.this.collapsingTextHelper;
            float f = (float) d;
            float min = Math.min(1.0f, ((float) scrimVisibleHeightTrigger) / f);
            aVar.f34434e = min;
            aVar.f34436f = C0023f.m103b(1.0f, min, 0.5f, min);
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            C15342a aVar2 = collapsingToolbarLayout4.collapsingTextHelper;
            aVar2.f34438g = collapsingToolbarLayout4.currentOffset + d;
            aVar2.mo54190n(((float) Math.abs(i)) / f);
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void animateScrim(int i) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.scrimAlpha ? C18268a.f40093c : C18268a.f40094d);
            this.scrimAnimator.addUpdateListener(new C15187b());
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(new int[]{this.scrimAlpha, i});
        this.scrimAnimator.start();
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void ensureToolbar() {
        /*
            r6 = this;
            boolean r0 = r6.refreshToolbar
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.toolbar = r0
            r6.toolbarDirectChild = r0
            int r1 = r6.toolbarId
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.toolbar = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.findDirectChild(r1)
            r6.toolbarDirectChild = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.toolbar
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = isToolbar(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.toolbar = r0
        L_0x003e:
            r6.updateDummyView()
            r6.refreshToolbar = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.ensureToolbar():void");
    }

    private View findDirectChild(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private static int getHeightWithMargins(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    public static C18312d getViewOffsetHelper(View view) {
        C18312d dVar = (C18312d) view.getTag(R.id.view_offset_helper);
        if (dVar != null) {
            return dVar;
        }
        C18312d dVar2 = new C18312d(view);
        view.setTag(R.id.view_offset_helper, dVar2);
        return dVar2;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            if (view == this.toolbar) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void updateCollapsedBounds(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        C15345b.m24941a(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        boolean z2 = false;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar2 = (Toolbar) viewGroup;
            i3 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i4 = toolbar2.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar3 = (android.widget.Toolbar) viewGroup;
            i3 = toolbar3.getTitleMarginStart();
            i2 = toolbar3.getTitleMarginEnd();
            i = toolbar3.getTitleMarginTop();
            i4 = toolbar3.getTitleMarginBottom();
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        C15342a aVar = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i5 = rect.left + (z ? i2 : i3);
        int i6 = rect.top + maxOffsetForPinChild + i;
        int i7 = rect.right;
        if (!z) {
            i3 = i2;
        }
        int i8 = i7 - i3;
        int i9 = (rect.bottom + maxOffsetForPinChild) - i4;
        Rect rect2 = aVar.f34442i;
        if (rect2.left == i5 && rect2.top == i6 && rect2.right == i8 && rect2.bottom == i9) {
            z2 = true;
        }
        if (!z2) {
            rect2.set(i5, i6, i8, i9);
            aVar.f34410K = true;
            aVar.mo54184h();
        }
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateContentScrimBounds(Drawable drawable, int i, int i2) {
        updateContentScrimBounds(drawable, this.toolbar, i, i2);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (this.collapsingTitleEnabled && this.toolbar != null) {
            if (this.dummyView == null) {
                this.dummyView = new View(getContext());
            }
            if (this.dummyView.getParent() == null) {
                this.toolbar.addView(this.dummyView, -1, -1);
            }
        }
    }

    private void updateTextBounds(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z2 = false;
            boolean z3 = C2364y.C2371g.m5245b(view) && this.dummyView.getVisibility() == 0;
            this.drawCollapsingTitle = z3;
            if (z3 || z) {
                boolean z4 = C2364y.C2369e.m5233d(this) == 1;
                updateCollapsedBounds(z4);
                C15342a aVar = this.collapsingTextHelper;
                int i5 = z4 ? this.expandedMarginEnd : this.expandedMarginStart;
                int i6 = this.tmpRect.top + this.expandedMarginTop;
                int i7 = (i3 - i) - (z4 ? this.expandedMarginStart : this.expandedMarginEnd);
                int i8 = (i4 - i2) - this.expandedMarginBottom;
                Rect rect = aVar.f34440h;
                if (rect.left == i5 && rect.top == i6 && rect.right == i7 && rect.bottom == i8) {
                    z2 = true;
                }
                if (!z2) {
                    rect.set(i5, i6, i7, i8);
                    aVar.f34410K = true;
                    aVar.mo54184h();
                }
                this.collapsingTextHelper.mo54185i(z);
            }
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.f34402C)) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar != null && this.contentScrim != null && this.scrimAlpha > 0 && isTitleCollapseFadeMode()) {
                C15342a aVar = this.collapsingTextHelper;
                if (aVar.f34430c < aVar.f34436f) {
                    int save = canvas.save();
                    canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                    this.collapsingTextHelper.mo54181d(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.collapsingTextHelper.mo54181d(canvas);
        }
        if (this.statusBarScrim != null && this.scrimAlpha > 0) {
            C2348w0 w0Var = this.lastInsets;
            int g = w0Var != null ? w0Var.mo8948g() : 0;
            if (g > 0) {
                this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), g - this.currentOffset);
                this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
                this.statusBarScrim.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C15342a aVar = this.collapsingTextHelper;
        if (aVar != null) {
            z |= aVar.mo54192p(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.f34446l;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.collapsingTextHelper.f34458x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.f34445k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.collapsingTextHelper.f34459y;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.f34443i0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.collapsingTextHelper.f34425Z;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.f34425Z.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.f34425Z.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.collapsingTextHelper.f34437f0;
    }

    public final int getMaxOffsetForPinChild(View view) {
        return ((getHeight() - getViewOffsetHelper(view).f40204b) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.scrimVisibleHeightTrigger;
        if (i >= 0) {
            return i + this.topInsetApplied + this.extraMultilineHeight;
        }
        C2348w0 w0Var = this.lastInsets;
        int g = w0Var != null ? w0Var.mo8948g() : 0;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int d = C2364y.C2368d.m5214d(this);
        return d > 0 ? Math.min((d * 2) + g, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.f34402C;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.f34413N;
    }

    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.f34405F;
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            setFitsSystemWindows(C2364y.C2368d.m5212b(appBarLayout));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new C15188c();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            C2364y.C2372h.m5253c(this);
        }
    }

    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C15185g gVar = this.onOffsetChangedListener;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(gVar);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2348w0 w0Var = this.lastInsets;
        if (w0Var != null) {
            int g = w0Var.mo8948g();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (!C2364y.C2368d.m5212b(childAt) && childAt.getTop() < g) {
                    childAt.offsetTopAndBottom(g);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            C18312d viewOffsetHelper = getViewOffsetHelper(getChildAt(i6));
            viewOffsetHelper.f40204b = viewOffsetHelper.f40203a.getTop();
            viewOffsetHelper.f40205c = viewOffsetHelper.f40203a.getLeft();
        }
        updateTextBounds(i, i2, i3, i4, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            getViewOffsetHelper(getChildAt(i7)).mo69850a();
        }
    }

    public void onMeasure(int i, int i2) {
        ensureToolbar();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C2348w0 w0Var = this.lastInsets;
        int g = w0Var != null ? w0Var.mo8948g() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && g > 0) {
            this.topInsetApplied = g;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + g, 1073741824));
        }
        if (this.extraMultilineHeightEnabled && this.collapsingTextHelper.f34437f0 > 1) {
            updateTitleFromToolbarIfNeeded();
            updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            C15342a aVar = this.collapsingTextHelper;
            int i3 = aVar.f34451q;
            if (i3 > 1) {
                TextPaint textPaint = aVar.f34412M;
                textPaint.setTextSize(aVar.f34447m);
                textPaint.setTypeface(aVar.f34459y);
                textPaint.setLetterSpacing(aVar.f34424Y);
                this.extraMultilineHeight = (i3 - 1) * Math.round(aVar.f34412M.descent() + (-aVar.f34412M.ascent()));
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.extraMultilineHeight, 1073741824));
            }
        }
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            View view = this.toolbarDirectChild;
            if (view == null || view == this) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i, i2);
        }
    }

    public C2348w0 onWindowInsetChanged(C2348w0 w0Var) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2348w0 w0Var2 = C2364y.C2368d.m5212b(this) ? w0Var : null;
        if (!Objects.equals(this.lastInsets, w0Var2)) {
            this.lastInsets = w0Var2;
            requestLayout();
        }
        return w0Var.f5615a.mo8974c();
    }

    public void setCollapsedTitleGravity(int i) {
        this.collapsingTextHelper.mo54188l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.collapsingTextHelper.mo54186j(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C15342a aVar = this.collapsingTextHelper;
        C14022a aVar2 = aVar.f34401B;
        boolean z = true;
        if (aVar2 != null) {
            aVar2.f30858c = true;
        }
        if (aVar.f34458x != typeface) {
            aVar.f34458x = typeface;
        } else {
            z = false;
        }
        if (z) {
            aVar.mo54185i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.contentScrim = drawable3;
            if (drawable3 != null) {
                updateContentScrimBounds(drawable3, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setContentScrim(C8184a.C8187c.m16466b(context, i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C15342a aVar = this.collapsingTextHelper;
        if (aVar.f34445k != i) {
            aVar.f34445k = i;
            aVar.mo54185i(false);
        }
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.expandedMarginStart = i;
        this.expandedMarginTop = i2;
        this.expandedMarginEnd = i3;
        this.expandedMarginBottom = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.expandedMarginBottom = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.expandedMarginEnd = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.expandedMarginStart = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.expandedMarginTop = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.collapsingTextHelper.mo54189m(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C15342a aVar = this.collapsingTextHelper;
        if (aVar.f34449o != colorStateList) {
            aVar.f34449o = colorStateList;
            aVar.mo54185i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C15342a aVar = this.collapsingTextHelper;
        C14022a aVar2 = aVar.f34400A;
        boolean z = true;
        if (aVar2 != null) {
            aVar2.f30858c = true;
        }
        if (aVar.f34459y != typeface) {
            aVar.f34459y = typeface;
        } else {
            z = false;
        }
        if (z) {
            aVar.mo54185i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.extraMultilineHeightEnabled = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.forceApplySystemWindowInsetTop = z;
    }

    public void setHyphenationFrequency(int i) {
        this.collapsingTextHelper.f34443i0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.collapsingTextHelper.f34439g0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.collapsingTextHelper.f34441h0 = f;
    }

    public void setMaxLines(int i) {
        C15342a aVar = this.collapsingTextHelper;
        if (i != aVar.f34437f0) {
            aVar.f34437f0 = i;
            Bitmap bitmap = aVar.f34406G;
            if (bitmap != null) {
                bitmap.recycle();
                aVar.f34406G = null;
            }
            aVar.mo54185i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.collapsingTextHelper.f34405F = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.scrimAlpha) {
            if (!(this.contentScrim == null || (viewGroup = this.toolbar) == null)) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5221k(viewGroup);
            }
            this.scrimAlpha = i;
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.scrimAnimationDuration = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.scrimVisibleHeightTrigger != i) {
            this.scrimVisibleHeightTrigger = i;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        setScrimsShown(z, C2364y.C2371g.m5246c(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarScrim = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                Drawable drawable4 = this.statusBarScrim;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                drawable4.setLayoutDirection(C2364y.C2369e.m5233d(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setStatusBarScrim(C8184a.C8187c.m16466b(context, i));
    }

    public void setTitle(CharSequence charSequence) {
        C15342a aVar = this.collapsingTextHelper;
        if (charSequence == null || !TextUtils.equals(aVar.f34402C, charSequence)) {
            aVar.f34402C = charSequence;
            aVar.f34403D = null;
            Bitmap bitmap = aVar.f34406G;
            if (bitmap != null) {
                bitmap.recycle();
                aVar.f34406G = null;
            }
            aVar.mo54185i(false);
        }
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i) {
        this.titleCollapseMode = i;
        boolean isTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.f34432d = isTitleCollapseFadeMode;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (isTitleCollapseFadeMode && this.contentScrim == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            C18602a aVar = this.elevationOverlayProvider;
            setContentScrimColor(aVar.mo70113b(dimension, aVar.f41088d));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C15342a aVar = this.collapsingTextHelper;
        aVar.f34413N = timeInterpolator;
        aVar.mo54185i(false);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarScrim;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.statusBarScrim.setVisible(z, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.contentScrim.setVisible(z, false);
        }
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim != null || this.statusBarScrim != null) {
            setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    private void updateContentScrimBounds(Drawable drawable, View view, int i, int i2) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.collapsingTextHelper.mo54187k(colorStateList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r11 = p574gl.C17790a.m29918a(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.refreshToolbar = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.tmpRect = r0
            r6 = -1
            r10.scrimVisibleHeightTrigger = r6
            r7 = 0
            r10.topInsetApplied = r7
            r10.extraMultilineHeight = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>(r10)
            r10.collapsingTextHelper = r9
            android.view.animation.DecelerateInterpolator r0 = p629nk.C18268a.f40095e
            r9.f34414O = r0
            r9.mo54185i(r7)
            r9.f34405F = r7
            uk.a r0 = new uk.a
            r0.<init>(r8)
            r10.elevationOverlayProvider = r0
            int[] r2 = p610kp.C18161c.f39704p
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            r13 = 4
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            int r0 = r9.f34445k
            if (r0 == r13) goto L_0x0052
            r9.f34445k = r13
            r9.mo54185i(r7)
        L_0x0052:
            r13 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r7, r13)
            r9.mo54188l(r13)
            r13 = 5
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginBottom = r13
            r10.expandedMarginEnd = r13
            r10.expandedMarginTop = r13
            r10.expandedMarginStart = r13
            r13 = 8
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0077
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginStart = r13
        L_0x0077:
            r13 = 7
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0084
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginEnd = r13
        L_0x0084:
            r13 = 9
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0092
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginTop = r13
        L_0x0092:
            r13 = 6
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x009f
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.expandedMarginBottom = r13
        L_0x009f:
            r13 = 20
            boolean r13 = r12.getBoolean(r13, r11)
            r10.collapsingTitleEnabled = r13
            r13 = 18
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            r13 = 2132017998(0x7f14034e, float:1.967429E38)
            r9.mo54189m(r13)
            r13 = 2132017972(0x7f140334, float:1.9674237E38)
            r9.mo54186j(r13)
            r13 = 10
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00cb
            int r13 = r12.getResourceId(r13, r7)
            r9.mo54189m(r13)
        L_0x00cb:
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x00d8
            int r13 = r12.getResourceId(r11, r7)
            r9.mo54186j(r13)
        L_0x00d8:
            r13 = 11
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00ed
            android.content.res.ColorStateList r13 = p507al.C14025c.m21582a(r8, r12, r13)
            android.content.res.ColorStateList r0 = r9.f34449o
            if (r0 == r13) goto L_0x00ed
            r9.f34449o = r13
            r9.mo54185i(r7)
        L_0x00ed:
            r13 = 2
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00fb
            android.content.res.ColorStateList r13 = p507al.C14025c.m21582a(r8, r12, r13)
            r9.mo54187k(r13)
        L_0x00fb:
            r13 = 16
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.scrimVisibleHeightTrigger = r13
            r13 = 14
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0122
            int r11 = r12.getInt(r13, r11)
            int r13 = r9.f34437f0
            if (r11 == r13) goto L_0x0122
            r9.f34437f0 = r11
            android.graphics.Bitmap r11 = r9.f34406G
            if (r11 == 0) goto L_0x011f
            r11.recycle()
            r11 = 0
            r9.f34406G = r11
        L_0x011f:
            r9.mo54185i(r7)
        L_0x0122:
            r11 = 21
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x0137
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.f34413N = r11
            r9.mo54185i(r7)
        L_0x0137:
            r11 = 15
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.scrimAnimationDuration = r0
            r11 = 3
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            r11 = 17
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            r11 = 19
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            r11 = 22
            int r11 = r12.getResourceId(r11, r6)
            r10.toolbarId = r11
            r11 = 13
            boolean r11 = r12.getBoolean(r11, r7)
            r10.forceApplySystemWindowInsetTop = r11
            r11 = 12
            boolean r11 = r12.getBoolean(r11, r7)
            r10.extraMultilineHeightEnabled = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r11.<init>()
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r12 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2373i.m5274u(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                animateScrim(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.scrimsAreShown = z;
        }
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        public int collapseMode = 0;
        public float parallaxMult = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39706q);
            this.collapseMode = obtainStyledAttributes.getInt(0, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(1, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i) {
            this.collapseMode = i;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
