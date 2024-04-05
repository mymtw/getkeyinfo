package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import com.etsy.android.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C15370j;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p629nk.C18271d;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C2244b {
    private static final long ANIMATION_DURATION = 300;
    private static final int DEF_STYLE_RES = 2132018565;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private ArrayList<C15210j> animationListeners;
    private Behavior behavior;
    /* access modifiers changed from: private */
    public int bottomInset;
    /* access modifiers changed from: private */
    public int fabAlignmentMode;
    public AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    /* access modifiers changed from: private */
    public boolean fabAttached;
    /* access modifiers changed from: private */
    public final int fabOffsetEndMode;
    public C18271d<FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    /* access modifiers changed from: private */
    public int leftInset;
    /* access modifiers changed from: private */
    public final MaterialShapeDrawable materialShapeDrawable;
    /* access modifiers changed from: private */
    public boolean menuAnimatingWithFabAlignmentMode;
    /* access modifiers changed from: private */
    public Animator menuAnimator;
    /* access modifiers changed from: private */
    public Animator modeAnimator;
    private Integer navigationIconTint;
    /* access modifiers changed from: private */
    public final boolean paddingBottomSystemWindowInsets;
    /* access modifiers changed from: private */
    public final boolean paddingLeftSystemWindowInsets;
    /* access modifiers changed from: private */
    public final boolean paddingRightSystemWindowInsets;
    /* access modifiers changed from: private */
    public int pendingMenuResId;
    /* access modifiers changed from: private */
    public int rightInset;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15199a();

        /* renamed from: b */
        public int f34115b;

        /* renamed from: c */
        public boolean f34116c;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public static class C15199a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34115b);
            parcel.writeInt(this.f34116c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34115b = parcel.readInt();
            this.f34116c = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C15200a extends AnimatorListenerAdapter {
        public C15200a() {
        }

        public final void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.menuAnimatingWithFabAlignmentMode) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, BottomAppBar.this.fabAttached);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C15201b implements C18271d<FloatingActionButton> {
        public C15201b() {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C15202c implements C15370j.C15372b {
        public C15202c() {
        }

        /* renamed from: a */
        public final C2348w0 mo53146a(View view, C2348w0 w0Var, C15370j.C15373c cVar) {
            boolean z;
            if (BottomAppBar.this.paddingBottomSystemWindowInsets) {
                int unused = BottomAppBar.this.bottomInset = w0Var.mo8944d();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.paddingLeftSystemWindowInsets) {
                z = BottomAppBar.this.leftInset != w0Var.mo8945e();
                int unused2 = BottomAppBar.this.leftInset = w0Var.mo8945e();
            } else {
                z = false;
            }
            if (BottomAppBar.this.paddingRightSystemWindowInsets) {
                if (BottomAppBar.this.rightInset == w0Var.mo8947f()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.rightInset = w0Var.mo8947f();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.cancelAnimations();
                BottomAppBar.this.setCutoutState();
                BottomAppBar.this.setActionMenuViewPosition();
            }
            return w0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C15203d extends AnimatorListenerAdapter {
        public C15203d() {
        }

        public final void onAnimationEnd(Animator animator) {
            BottomAppBar.this.dispatchAnimationEnd();
            Animator unused = BottomAppBar.this.modeAnimator = null;
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar.this.dispatchAnimationStart();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C15204e extends FloatingActionButton.C15318b {

        /* renamed from: a */
        public final /* synthetic */ int f34121a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        public class C15205a extends FloatingActionButton.C15318b {
            public C15205a() {
            }

            /* renamed from: b */
            public final void mo53150b() {
                BottomAppBar.this.dispatchAnimationEnd();
            }
        }

        public C15204e(int i) {
            this.f34121a = i;
        }

        /* renamed from: a */
        public final void mo53149a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.getFabTranslationX(this.f34121a));
            floatingActionButton.show(new C15205a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public class C15206f extends AnimatorListenerAdapter {
        public C15206f() {
        }

        public final void onAnimationEnd(Animator animator) {
            BottomAppBar.this.dispatchAnimationEnd();
            boolean unused = BottomAppBar.this.menuAnimatingWithFabAlignmentMode = false;
            Animator unused2 = BottomAppBar.this.menuAnimator = null;
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar.this.dispatchAnimationStart();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public class C15207g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f34125a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f34126b;

        /* renamed from: c */
        public final /* synthetic */ int f34127c;

        /* renamed from: d */
        public final /* synthetic */ boolean f34128d;

        public C15207g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f34126b = actionMenuView;
            this.f34127c = i;
            this.f34128d = z;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f34125a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f34125a) {
                boolean z = BottomAppBar.this.pendingMenuResId != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.replaceMenu(bottomAppBar.pendingMenuResId);
                BottomAppBar.this.translateActionMenuView(this.f34126b, this.f34127c, this.f34128d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    public class C15208h implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f34130b;

        /* renamed from: c */
        public final /* synthetic */ int f34131c;

        /* renamed from: d */
        public final /* synthetic */ boolean f34132d;

        public C15208h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f34130b = actionMenuView;
            this.f34131c = i;
            this.f34132d = z;
        }

        public final void run() {
            ActionMenuView actionMenuView = this.f34130b;
            actionMenuView.setTranslationX((float) BottomAppBar.this.getActionMenuViewTranslationX(actionMenuView, this.f34131c, this.f34132d));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    public class C15209i extends AnimatorListenerAdapter {
        public C15209i() {
        }

        public final void onAnimationStart(Animator animator) {
            BottomAppBar.this.fabAnimationListener.onAnimationStart(animator);
            FloatingActionButton access$2200 = BottomAppBar.this.findDependentFab();
            if (access$2200 != null) {
                access$2200.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    public interface C15210j {
        /* renamed from: b */
        void mo53157b();

        void onAnimationEnd();
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void addFabAnimationListeners(FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.addOnShowAnimationListener(new C15209i());
        floatingActionButton.addTransformationCallback(this.fabTransformationCallback);
    }

    /* access modifiers changed from: private */
    public void cancelAnimations() {
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.modeAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void createFabTranslationXAnimation(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findDependentFab(), "translationX", new float[]{getFabTranslationX(i)});
        ofFloat.setDuration(ANIMATION_DURATION);
        list.add(ofFloat);
    }

    private void createMenuViewTranslationAnimation(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) getActionMenuViewTranslationX(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C15207g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        ArrayList<C15210j> arrayList;
        int i = this.animatingModeChangeCounter - 1;
        this.animatingModeChangeCounter = i;
        if (i == 0 && (arrayList = this.animationListeners) != null) {
            Iterator<C15210j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onAnimationEnd();
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchAnimationStart() {
        ArrayList<C15210j> arrayList;
        int i = this.animatingModeChangeCounter;
        this.animatingModeChangeCounter = i + 1;
        if (i == 0 && (arrayList = this.animationListeners) != null) {
            Iterator<C15210j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo53157b();
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton findDependentFab() {
        View findDependentView = findDependentView();
        if (findDependentView instanceof FloatingActionButton) {
            return (FloatingActionButton) findDependentView;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findDependentView() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.findDependentView():android.view.View");
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.bottomInset;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX(int i) {
        boolean d = C15370j.m24963d(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.fabOffsetEndMode + (d ? this.leftInset : this.rightInset));
        if (d) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f34138e;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.leftInset;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.rightInset;
    }

    /* access modifiers changed from: private */
    public C15211a getTopEdgeTreatment() {
        return (C15211a) this.materialShapeDrawable.getShapeAppearanceModel().f34579i;
    }

    private boolean isFabVisibleOrWillBeShown() {
        FloatingActionButton findDependentFab = findDependentFab();
        return findDependentFab != null && findDependentFab.isOrWillBeShown();
    }

    /* access modifiers changed from: private */
    public void maybeAnimateMenuView(int i, boolean z) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (!C2364y.C2371g.m5246c(this)) {
            this.menuAnimatingWithFabAlignmentMode = false;
            replaceMenu(this.pendingMenuResId);
            return;
        }
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!isFabVisibleOrWillBeShown()) {
            i = 0;
            z = false;
        }
        createMenuViewTranslationAnimation(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.menuAnimator = animatorSet;
        animatorSet.addListener(new C15206f());
        this.menuAnimator.start();
    }

    private void maybeAnimateModeChange(int i) {
        if (this.fabAlignmentMode != i) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2371g.m5246c(this)) {
                Animator animator = this.modeAnimator;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.fabAnimationMode == 1) {
                    createFabTranslationXAnimation(i, arrayList);
                } else {
                    createFabDefaultXAnimation(i, arrayList);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.modeAnimator = animatorSet;
                animatorSet.addListener(new C15203d());
                this.modeAnimator.start();
            }
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        mutate.setTint(this.navigationIconTint.intValue());
        return mutate;
    }

    /* access modifiers changed from: private */
    public void setActionMenuViewPosition() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.menuAnimator == null) {
            actionMenuView.setAlpha(1.0f);
            if (!isFabVisibleOrWillBeShown()) {
                translateActionMenuView(actionMenuView, 0, false);
            } else {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setCutoutState() {
        getTopEdgeTreatment().f34139f = getFabTranslationX();
        View findDependentView = findDependentView();
        this.materialShapeDrawable.setInterpolation((!this.fabAttached || !isFabVisibleOrWillBeShown()) ? 0.0f : 1.0f);
        if (findDependentView != null) {
            findDependentView.setTranslationY(getFabTranslationY());
            findDependentView.setTranslationX(getFabTranslationX());
        }
    }

    private void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z) {
        translateActionMenuView(actionMenuView, i, z, false);
    }

    public void addAnimationListener(C15210j jVar) {
        if (this.animationListeners == null) {
            this.animationListeners = new ArrayList<>();
        }
        this.animationListeners.add(jVar);
    }

    public void createFabDefaultXAnimation(int i, List<Animator> list) {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab != null && !findDependentFab.isOrWillBeHidden()) {
            dispatchAnimationStart();
            findDependentFab.hide(new C15204e(i));
        }
    }

    public int getActionMenuViewTranslationX(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean d = C15370j.m24963d(this);
        int measuredWidth = d ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                measuredWidth = d ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d ? this.rightInset : -this.leftInset));
    }

    public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f34138e;
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public int getFabAnimationMode() {
        return this.fabAnimationMode;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f34136c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f34135b;
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public boolean isScrolledDown() {
        return getBehavior().f34092b == 1;
    }

    public boolean isScrolledUp() {
        return getBehavior().f34092b == 2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19543e0.m33317j0(this, this.materialShapeDrawable);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            cancelAnimations();
            setCutoutState();
        }
        setActionMenuViewPosition();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.fabAlignmentMode = savedState.f34115b;
        this.fabAttached = savedState.f34116c;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f34115b = this.fabAlignmentMode;
        savedState.f34116c = this.fabAttached;
        return savedState;
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    public void removeAnimationListener(C15210j jVar) {
        ArrayList<C15210j> arrayList = this.animationListeners;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    public void replaceMenu(int i) {
        if (i != 0) {
            this.pendingMenuResId = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.materialShapeDrawable.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C15211a topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.f34138e = f;
                this.materialShapeDrawable.invalidateSelf();
                setCutoutState();
                return;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f) {
        this.materialShapeDrawable.setElevation(f);
        int shadowRadius = this.materialShapeDrawable.getShadowRadius() - this.materialShapeDrawable.getShadowOffsetY();
        Behavior behavior2 = getBehavior();
        behavior2.f34093c = shadowRadius;
        if (behavior2.f34092b == 1) {
            setTranslationY((float) (behavior2.f34091a + shadowRadius));
        }
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.pendingMenuResId = i2;
        this.menuAnimatingWithFabAlignmentMode = true;
        maybeAnimateMenuView(i, this.fabAttached);
        maybeAnimateModeChange(i);
        this.fabAlignmentMode = i;
    }

    public void setFabAnimationMode(int i) {
        this.fabAnimationMode = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().f34140g) {
            getTopEdgeTreatment().f34140g = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f34136c = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f34135b = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public boolean setFabDiameter(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().f34137d) {
            return false;
        }
        getTopEdgeTreatment().f34137d = f;
        this.materialShapeDrawable.invalidateSelf();
        return true;
    }

    public void setHideOnScroll(boolean z) {
        this.hideOnScroll = z;
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    /* access modifiers changed from: private */
    public void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C15208h hVar = new C15208h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public Behavior getBehavior() {
        if (this.behavior == null) {
            this.behavior = new Behavior();
        }
        return this.behavior;
    }

    public void performHide(boolean z) {
        getBehavior().mo53106b(this, z);
    }

    public void performShow(boolean z) {
        getBehavior().mo53107c(this, z);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f34110e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f34111f;

        /* renamed from: g */
        public int f34112g;

        /* renamed from: h */
        public final C15198a f34113h = new C15198a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C15198a implements View.OnLayoutChangeListener {
            public C15198a() {
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f34111f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.getMeasuredContentRect(Behavior.this.f34110e);
                int height = Behavior.this.f34110e.height();
                bottomAppBar.setFabDiameter(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f34575e.mo68901a(new RectF(Behavior.this.f34110e)));
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (Behavior.this.f34112g == 0) {
                    layoutParams.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    layoutParams.leftMargin = bottomAppBar.getLeftInset();
                    layoutParams.rightMargin = bottomAppBar.getRightInset();
                    if (C15370j.m24963d(floatingActionButton)) {
                        layoutParams.leftMargin = bottomAppBar.fabOffsetEndMode + layoutParams.leftMargin;
                        return;
                    }
                    layoutParams.rightMargin = bottomAppBar.fabOffsetEndMode + layoutParams.rightMargin;
                }
            }
        }

        public Behavior() {
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f34111f = new WeakReference<>(bottomAppBar);
            View access$3100 = bottomAppBar.findDependentView();
            if (access$3100 != null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (!C2364y.C2371g.m5246c(access$3100)) {
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) access$3100.getLayoutParams();
                    layoutParams.anchorGravity = 49;
                    this.f34112g = layoutParams.bottomMargin;
                    if (access$3100 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) access$3100;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f34113h);
                        bottomAppBar.addFabAnimationListeners(floatingActionButton);
                    }
                    bottomAppBar.setCutoutState();
                }
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r13 = p574gl.C17790a.m29918a(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            com.google.android.material.shape.MaterialShapeDrawable r13 = new com.google.android.material.shape.MaterialShapeDrawable
            r13.<init>()
            r12.materialShapeDrawable = r13
            r7 = 0
            r12.animatingModeChangeCounter = r7
            r12.pendingMenuResId = r7
            r12.menuAnimatingWithFabAlignmentMode = r7
            r8 = 1
            r12.fabAttached = r8
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r12.fabAnimationListener = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r12.fabTransformationCallback = r0
            android.content.Context r9 = r12.getContext()
            int[] r2 = p610kp.C18161c.f39688g
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r14
            r3 = r15
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            android.content.res.ColorStateList r1 = p507al.C14025c.m21582a(r9, r0, r7)
            r2 = 8
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x004c
            r3 = -1
            int r2 = r0.getColor(r2, r3)
            r12.setNavigationIconTint(r2)
        L_0x004c:
            int r2 = r0.getDimensionPixelSize(r8, r7)
            r3 = 4
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            r4 = 5
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            r5 = 6
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            r10 = 2
            int r11 = r0.getInt(r10, r7)
            r12.fabAlignmentMode = r11
            r11 = 3
            int r11 = r0.getInt(r11, r7)
            r12.fabAnimationMode = r11
            r11 = 7
            boolean r11 = r0.getBoolean(r11, r7)
            r12.hideOnScroll = r11
            r11 = 9
            boolean r11 = r0.getBoolean(r11, r7)
            r12.paddingBottomSystemWindowInsets = r11
            r11 = 10
            boolean r11 = r0.getBoolean(r11, r7)
            r12.paddingLeftSystemWindowInsets = r11
            r11 = 11
            boolean r11 = r0.getBoolean(r11, r7)
            r12.paddingRightSystemWindowInsets = r11
            r0.recycle()
            android.content.res.Resources r0 = r12.getResources()
            r11 = 2131165984(0x7f070320, float:1.79462E38)
            int r0 = r0.getDimensionPixelOffset(r11)
            r12.fabOffsetEndMode = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.a$a r3 = new com.google.android.material.shape.a$a
            r3.<init>()
            r3.f34591i = r0
            com.google.android.material.shape.a r0 = new com.google.android.material.shape.a
            r0.<init>(r3)
            r13.setShapeAppearanceModel(r0)
            r13.setShadowCompatibilityMode(r10)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r13.setPaintStyle(r0)
            r13.initializeElevationOverlay(r9)
            float r0 = (float) r2
            r12.setElevation(r0)
            r13.setTintList(r1)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r0 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5227q(r12, r13)
            com.google.android.material.bottomappbar.BottomAppBar$c r13 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r13.<init>()
            android.content.Context r0 = r12.getContext()
            int[] r1 = p610kp.C18161c.f39720x
            android.content.res.TypedArray r14 = r0.obtainStyledAttributes(r14, r1, r15, r6)
            boolean r15 = r14.getBoolean(r7, r7)
            boolean r0 = r14.getBoolean(r8, r7)
            boolean r1 = r14.getBoolean(r10, r7)
            r14.recycle()
            com.google.android.material.internal.i r14 = new com.google.android.material.internal.i
            r14.<init>(r15, r0, r1, r13)
            com.google.android.material.internal.C15370j.m24960a(r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return getFabTranslationX(this.fabAlignmentMode);
    }
}
