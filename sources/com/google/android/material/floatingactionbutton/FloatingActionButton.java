package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0317g;
import androidx.appcompat.widget.C0328k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.C15211a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C15323c;
import com.google.android.material.internal.C15345b;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p193o.C7506i;
import p522cl.C14170b;
import p550dl.C17585k;
import p610kp.C18161c;
import p629nk.C18269b;
import p629nk.C18271d;
import p696vk.C18656a;
import p696vk.C18657b;
import p704wk.C18720c;
import p704wk.C18723e;
import p704wk.C18724f;

public class FloatingActionButton extends VisibilityAwareImageButton implements C18656a, C17585k, CoordinatorLayout.C2244b {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = 2132018407;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    public boolean compatPadding;
    private int customSize;
    private final C18657b expandableWidgetHelper;
    private final C0328k imageHelper;
    private PorterDuff.Mode imageMode;
    /* access modifiers changed from: private */
    public int imagePadding;
    private ColorStateList imageTint;
    private C15323c impl;
    private int maxImageSize;
    private ColorStateList rippleColor;
    public final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C15317a implements C15323c.C15330g {

        /* renamed from: a */
        public final /* synthetic */ C15318b f34318a;

        public C15317a(C15318b bVar) {
            this.f34318a = bVar;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C15318b {
        /* renamed from: a */
        public void mo53149a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo53150b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C15319c implements C14170b {
        public C15319c() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public class C15320d<T extends FloatingActionButton> implements C15323c.C15329f {

        /* renamed from: a */
        public final C18271d<T> f34321a;

        public C15320d(C18271d<T> dVar) {
            this.f34321a = dVar;
        }

        /* renamed from: a */
        public final void mo54045a() {
            C18271d<T> dVar = this.f34321a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C15201b bVar = (BottomAppBar.C15201b) dVar;
            bVar.getClass();
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().f34139f != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().f34139f = translationX;
                BottomAppBar.this.materialShapeDrawable.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().f34138e != max) {
                C15211a access$500 = BottomAppBar.this.getTopEdgeTreatment();
                if (max >= 0.0f) {
                    access$500.f34138e = max;
                    BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                } else {
                    access$500.getClass();
                    throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                }
            }
            MaterialShapeDrawable access$400 = BottomAppBar.this.materialShapeDrawable;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            access$400.setInterpolation(f);
        }

        /* renamed from: b */
        public final void mo54046b() {
            C18271d<T> dVar = this.f34321a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C15201b bVar = (BottomAppBar.C15201b) dVar;
            bVar.getClass();
            BottomAppBar.this.materialShapeDrawable.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C15320d) && ((C15320d) obj).f34321a.equals(this.f34321a);
        }

        public final int hashCode() {
            return this.f34321a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private C15323c createImpl() {
        return new C18724f(this, new C15319c());
    }

    private C15323c getImpl() {
        if (this.impl == null) {
            this.impl = createImpl();
        }
        return this.impl;
    }

    private void offsetRectWithShadow(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.shadowPadding;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void onApplySupportImageTint() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.imageTint;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.imageMode;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0317g.m821c(colorForState, mode));
        }
    }

    private static int resolveAdjustedSize(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size2);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size2;
        }
        throw new IllegalArgumentException();
    }

    private C15323c.C15330g wrapOnVisibilityChangedListener(C15318b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C15317a(bVar);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        C15323c impl2 = getImpl();
        if (impl2.f34358t == null) {
            impl2.f34358t = new ArrayList<>();
        }
        impl2.f34358t.add(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        C15323c impl2 = getImpl();
        if (impl2.f34357s == null) {
            impl2.f34357s = new ArrayList<>();
        }
        impl2.f34357s.add(animatorListener);
    }

    public void addTransformationCallback(C18271d<? extends FloatingActionButton> dVar) {
        C15323c impl2 = getImpl();
        C15320d dVar2 = new C15320d(dVar);
        if (impl2.f34359u == null) {
            impl2.f34359u = new ArrayList<>();
        }
        impl2.f34359u.add(dVar2);
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo54062j(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public CoordinatorLayout.C2245c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo54057e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f34347i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f34348j;
    }

    public Drawable getContentBackground() {
        return getImpl().f34343e;
    }

    @Deprecated
    public boolean getContentRect(Rect rect) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (!C2364y.C2371g.m5246c(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        offsetRectWithShadow(rect);
        return true;
    }

    public int getCustomSize() {
        return this.customSize;
    }

    public int getExpandedComponentIdHint() {
        return this.expandableWidgetHelper.f41266c;
    }

    public C18269b getHideMotionSpec() {
        return getImpl().f34352n;
    }

    public void getMeasuredContentRect(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        offsetRectWithShadow(rect);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.rippleColor;
    }

    public C15401a getShapeAppearanceModel() {
        C15401a aVar = getImpl().f34339a;
        aVar.getClass();
        return aVar;
    }

    public C18269b getShowMotionSpec() {
        return getImpl().f34351m;
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeDimension() {
        return getSizeDimension(this.size);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.imageTint;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.imageMode;
    }

    public boolean getUseCompatPadding() {
        return this.compatPadding;
    }

    public void hide() {
        hide((C15318b) null);
    }

    public boolean isExpanded() {
        return this.expandableWidgetHelper.f41265b;
    }

    public boolean isOrWillBeHidden() {
        C15323c impl2 = getImpl();
        if (impl2.f34360v.getVisibility() == 0) {
            if (impl2.f34356r != 1) {
                return false;
            }
        } else if (impl2.f34356r == 2) {
            return false;
        }
        return true;
    }

    public boolean isOrWillBeShown() {
        C15323c impl2 = getImpl();
        if (impl2.f34360v.getVisibility() != 0) {
            if (impl2.f34356r != 2) {
                return false;
            }
        } else if (impl2.f34356r == 1) {
            return false;
        }
        return true;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo54060h();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15323c impl2 = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl2.f34340b;
        if (materialShapeDrawable != null) {
            C19543e0.m33317j0(impl2.f34360v, materialShapeDrawable);
        }
        if (!(impl2 instanceof C18724f)) {
            ViewTreeObserver viewTreeObserver = impl2.f34360v.getViewTreeObserver();
            if (impl2.f34338B == null) {
                impl2.f34338B = new C18723e(impl2);
            }
            viewTreeObserver.addOnPreDrawListener(impl2.f34338B);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15323c impl2 = getImpl();
        ViewTreeObserver viewTreeObserver = impl2.f34360v.getViewTreeObserver();
        C18723e eVar = impl2.f34338B;
        if (eVar != null) {
            viewTreeObserver.removeOnPreDrawListener(eVar);
            impl2.f34338B = null;
        }
    }

    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.imagePadding = (sizeDimension - this.maxImageSize) / 2;
        getImpl().mo54069q();
        int min = Math.min(resolveAdjustedSize(sizeDimension, i), resolveAdjustedSize(sizeDimension, i2));
        Rect rect = this.shadowPadding;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        C18657b bVar = this.expandableWidgetHelper;
        Bundle orDefault = extendableSavedState.extendableStates.getOrDefault(EXPANDABLE_WIDGET_HELPER_KEY, null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        bVar.getClass();
        bVar.f41265b = bundle.getBoolean("expanded", false);
        bVar.f41266c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f41265b) {
            ViewParent parent = bVar.f41264a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(bVar.f41264a);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        C7506i<String, Bundle> iVar = extendableSavedState.extendableStates;
        C18657b bVar = this.expandableWidgetHelper;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f41265b);
        bundle.putInt("expandedComponentIdHint", bVar.f41266c);
        iVar.put(EXPANDABLE_WIDGET_HELPER_KEY, bundle);
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !getContentRect(this.touchArea) || this.touchArea.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f34358t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f34357s;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void removeTransformationCallback(C18271d<? extends FloatingActionButton> dVar) {
        C15323c impl2 = getImpl();
        C15320d dVar2 = new C15320d(dVar);
        ArrayList<C15323c.C15329f> arrayList = impl2.f34359u;
        if (arrayList != null) {
            arrayList.remove(dVar2);
        }
    }

    public void setBackgroundColor(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            C15323c impl2 = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl2.f34340b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            C18720c cVar = impl2.f34342d;
            if (cVar != null) {
                if (colorStateList != null) {
                    cVar.f41490m = colorStateList.getColorForState(cVar.getState(), cVar.f41490m);
                }
                cVar.f41493p = colorStateList;
                cVar.f41491n = true;
                cVar.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f34340b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C15323c impl2 = getImpl();
        if (impl2.f34346h != f) {
            impl2.f34346h = f;
            impl2.mo54063k(f, impl2.f34347i, impl2.f34348j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C15323c impl2 = getImpl();
        if (impl2.f34347i != f) {
            impl2.f34347i = f;
            impl2.mo54063k(impl2.f34346h, f, impl2.f34348j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C15323c impl2 = getImpl();
        if (impl2.f34348j != f) {
            impl2.f34348j = f;
            impl2.mo54063k(impl2.f34346h, impl2.f34347i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.customSize) {
            this.customSize = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = getImpl().f34340b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f34344f) {
            getImpl().f34344f = z;
            requestLayout();
        }
    }

    public boolean setExpanded(boolean z) {
        C18657b bVar = this.expandableWidgetHelper;
        if (bVar.f41265b == z) {
            return false;
        }
        bVar.f41265b = z;
        ViewParent parent = bVar.f41264a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(bVar.f41264a);
        }
        return true;
    }

    public void setExpandedComponentIdHint(int i) {
        this.expandableWidgetHelper.f41266c = i;
    }

    public void setHideMotionSpec(C18269b bVar) {
        getImpl().f34352n = bVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C18269b.m30886b(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C15323c impl2 = getImpl();
            float f = impl2.f34354p;
            impl2.f34354p = f;
            Matrix matrix = impl2.f34337A;
            impl2.mo54054a(f, matrix);
            impl2.f34360v.setImageMatrix(matrix);
            if (this.imageTint != null) {
                onApplySupportImageTint();
            }
        }
    }

    public void setImageResource(int i) {
        this.imageHelper.mo3074c(i);
        onApplySupportImageTint();
    }

    public void setMaxImageSize(int i) {
        this.maxImageSize = i;
        C15323c impl2 = getImpl();
        if (impl2.f34355q != i) {
            impl2.f34355q = i;
            float f = impl2.f34354p;
            impl2.f34354p = f;
            Matrix matrix = impl2.f34337A;
            impl2.mo54054a(f, matrix);
            impl2.f34360v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<C15323c.C15329f> arrayList = getImpl().f34359u;
        if (arrayList != null) {
            Iterator<C15323c.C15329f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo54046b();
            }
        }
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<C15323c.C15329f> arrayList = getImpl().f34359u;
        if (arrayList != null) {
            Iterator<C15323c.C15329f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo54046b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        C15323c impl2 = getImpl();
        impl2.f34345g = z;
        impl2.mo54069q();
    }

    public void setShapeAppearanceModel(C15401a aVar) {
        getImpl().mo54066n(aVar);
    }

    public void setShowMotionSpec(C18269b bVar) {
        getImpl().f34351m = bVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C18269b.m30886b(getContext(), i));
    }

    public void setSize(int i) {
        this.customSize = 0;
        if (i != this.size) {
            this.size = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.imageTint != colorStateList) {
            this.imageTint = colorStateList;
            onApplySupportImageTint();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.imageMode != mode) {
            this.imageMode = mode;
            onApplySupportImageTint();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo54064l();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo54064l();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo54064l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.compatPadding != z) {
            this.compatPadding = z;
            getImpl().mo54061i();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().f34344f;
    }

    public void show() {
        show((C15318b) null);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C2245c<T> {

        /* renamed from: a */
        public Rect f34316a;

        /* renamed from: b */
        public boolean f34317b;

        public BaseBehavior() {
            this.f34317b = true;
        }

        /* renamed from: a */
        public final boolean mo54042a(View view, FloatingActionButton floatingActionButton) {
            return this.f34317b && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: b */
        public final boolean mo54043b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo54042a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f34316a == null) {
                this.f34316a = new Rect();
            }
            Rect rect = this.f34316a;
            C15345b.m24941a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.hide((C15318b) null, false);
                return true;
            }
            floatingActionButton.show((C15318b) null, false);
            return true;
        }

        /* renamed from: c */
        public final boolean mo54044c(View view, FloatingActionButton floatingActionButton) {
            if (!mo54042a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.hide((C15318b) null, false);
                return true;
            }
            floatingActionButton.show((C15318b) null, false);
            return true;
        }

        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.shadowPadding;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo54043b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    mo54044c(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = dependencies.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && mo54044c(view2, floatingActionButton)) {
                        break;
                    }
                } else if (mo54043b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            Rect rect = floatingActionButton.shadowPadding;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams2.rightMargin ? rect.right : floatingActionButton.getLeft() <= layoutParams2.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams2.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= layoutParams2.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39714u);
            this.f34317b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    private int getSizeDimension(int i) {
        int i2 = this.customSize;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < AUTO_MINI_LARGEST_SCREEN_WIDTH) {
            return getSizeDimension(1);
        } else {
            return getSizeDimension(0);
        }
    }

    public void hide(C15318b bVar) {
        hide(bVar, true);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            getImpl().mo54065m(this.rippleColor);
        }
    }

    public void show(C15318b bVar) {
        show(bVar, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r12 = p574gl.C17790a.m29918a(r12, r13, r14, r6)
            r11.<init>(r12, r13, r14)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r11.shadowPadding = r12
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r11.touchArea = r12
            android.content.Context r12 = r11.getContext()
            int[] r2 = p610kp.C18161c.f39712t
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r12
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            r1 = 1
            android.content.res.ColorStateList r2 = p507al.C14025c.m21582a(r12, r0, r1)
            r11.backgroundTint = r2
            r2 = 2
            r3 = -1
            int r2 = r0.getInt(r2, r3)
            r4 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C15370j.m24964e(r2, r4)
            r11.backgroundTintMode = r2
            r2 = 12
            android.content.res.ColorStateList r2 = p507al.C14025c.m21582a(r12, r0, r2)
            r11.rippleColor = r2
            r2 = 7
            int r2 = r0.getInt(r2, r3)
            r11.size = r2
            r2 = 6
            int r2 = r0.getDimensionPixelSize(r2, r7)
            r11.customSize = r2
            r2 = 3
            int r2 = r0.getDimensionPixelSize(r2, r7)
            r11.borderWidth = r2
            r2 = 4
            r3 = 0
            float r2 = r0.getDimension(r2, r3)
            r4 = 9
            float r4 = r0.getDimension(r4, r3)
            r5 = 11
            float r3 = r0.getDimension(r5, r3)
            r5 = 16
            boolean r5 = r0.getBoolean(r5, r7)
            r11.compatPadding = r5
            android.content.res.Resources r5 = r11.getResources()
            r8 = 2131166086(0x7f070386, float:1.7946407E38)
            int r5 = r5.getDimensionPixelSize(r8)
            r8 = 10
            int r8 = r0.getDimensionPixelSize(r8, r7)
            r11.setMaxImageSize(r8)
            r8 = 15
            nk.b r8 = p629nk.C18269b.m30885a(r12, r0, r8)
            r9 = 8
            nk.b r9 = p629nk.C18269b.m30885a(r12, r0, r9)
            dl.h r10 = com.google.android.material.shape.C15401a.f34570m
            com.google.android.material.shape.a$a r12 = com.google.android.material.shape.C15401a.m24982c(r12, r13, r14, r6, r10)
            com.google.android.material.shape.a r6 = new com.google.android.material.shape.a
            r6.<init>(r12)
            r12 = 5
            boolean r12 = r0.getBoolean(r12, r7)
            boolean r1 = r0.getBoolean(r7, r1)
            r11.setEnabled(r1)
            r0.recycle()
            androidx.appcompat.widget.k r0 = new androidx.appcompat.widget.k
            r0.<init>(r11)
            r11.imageHelper = r0
            r0.mo3073b(r13, r14)
            vk.b r13 = new vk.b
            r13.<init>(r11)
            r11.expandableWidgetHelper = r13
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            r13.mo54066n(r6)
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            android.content.res.ColorStateList r14 = r11.backgroundTint
            android.graphics.PorterDuff$Mode r0 = r11.backgroundTintMode
            android.content.res.ColorStateList r1 = r11.rippleColor
            int r6 = r11.borderWidth
            r13.mo54059g(r14, r0, r1, r6)
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            r13.f34349k = r5
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            float r14 = r13.f34346h
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x00ed
            r13.f34346h = r2
            float r14 = r13.f34347i
            float r0 = r13.f34348j
            r13.mo54063k(r2, r14, r0)
        L_0x00ed:
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            float r14 = r13.f34347i
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0100
            r13.f34347i = r4
            float r14 = r13.f34346h
            float r0 = r13.f34348j
            r13.mo54063k(r14, r4, r0)
        L_0x0100:
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            float r14 = r13.f34348j
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L_0x0113
            r13.f34348j = r3
            float r14 = r13.f34346h
            float r0 = r13.f34347i
            r13.mo54063k(r14, r0, r3)
        L_0x0113:
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            r13.f34351m = r8
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            r13.f34352n = r9
            com.google.android.material.floatingactionbutton.c r13 = r11.getImpl()
            r13.f34344f = r12
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.MATRIX
            r11.setScaleType(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void hide(C15318b bVar, boolean z) {
        AnimatorSet animatorSet;
        C15323c impl2 = getImpl();
        C15323c.C15330g wrapOnVisibilityChangedListener = wrapOnVisibilityChangedListener(bVar);
        boolean z2 = true;
        if (!(impl2.f34360v.getVisibility() != 0 ? impl2.f34356r != 2 : impl2.f34356r == 1)) {
            Animator animator = impl2.f34350l;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl2.f34360v;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(floatingActionButton) || impl2.f34360v.isInEditMode()) {
                z2 = false;
            }
            if (z2) {
                C18269b bVar2 = impl2.f34352n;
                if (bVar2 != null) {
                    animatorSet = impl2.mo54055b(bVar2, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = impl2.mo54056c(0.0f, 0.4f, 0.4f);
                }
                animatorSet.addListener(new C15321a(impl2, z, wrapOnVisibilityChangedListener));
                ArrayList<Animator.AnimatorListener> arrayList = impl2.f34358t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl2.f34360v.internalSetVisibility(z ? 8 : 4, z);
            if (wrapOnVisibilityChangedListener != null) {
                C15317a aVar = (C15317a) wrapOnVisibilityChangedListener;
                aVar.f34318a.mo53149a(FloatingActionButton.this);
            }
        }
    }

    public void show(C15318b bVar, boolean z) {
        AnimatorSet animatorSet;
        C15323c impl2 = getImpl();
        C15323c.C15330g wrapOnVisibilityChangedListener = wrapOnVisibilityChangedListener(bVar);
        boolean z2 = true;
        if (!(impl2.f34360v.getVisibility() == 0 ? impl2.f34356r != 1 : impl2.f34356r == 2)) {
            Animator animator = impl2.f34350l;
            if (animator != null) {
                animator.cancel();
            }
            boolean z3 = impl2.f34351m == null;
            FloatingActionButton floatingActionButton = impl2.f34360v;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(floatingActionButton) || impl2.f34360v.isInEditMode()) {
                z2 = false;
            }
            if (z2) {
                if (impl2.f34360v.getVisibility() != 0) {
                    float f = 0.0f;
                    impl2.f34360v.setAlpha(0.0f);
                    impl2.f34360v.setScaleY(z3 ? 0.4f : 0.0f);
                    impl2.f34360v.setScaleX(z3 ? 0.4f : 0.0f);
                    if (z3) {
                        f = 0.4f;
                    }
                    impl2.f34354p = f;
                    Matrix matrix = impl2.f34337A;
                    impl2.mo54054a(f, matrix);
                    impl2.f34360v.setImageMatrix(matrix);
                }
                C18269b bVar2 = impl2.f34351m;
                if (bVar2 != null) {
                    animatorSet = impl2.mo54055b(bVar2, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = impl2.mo54056c(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new C15322b(impl2, z, wrapOnVisibilityChangedListener));
                ArrayList<Animator.AnimatorListener> arrayList = impl2.f34357s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl2.f34360v.internalSetVisibility(0, z);
            impl2.f34360v.setAlpha(1.0f);
            impl2.f34360v.setScaleY(1.0f);
            impl2.f34360v.setScaleX(1.0f);
            impl2.f34354p = 1.0f;
            Matrix matrix2 = impl2.f34337A;
            impl2.mo54054a(1.0f, matrix2);
            impl2.f34360v.setImageMatrix(matrix2);
            if (wrapOnVisibilityChangedListener != null) {
                ((C15317a) wrapOnVisibilityChangedListener).f34318a.mo53150b();
            }
        }
    }
}
