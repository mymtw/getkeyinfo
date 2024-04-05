package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C15345b;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p610kp.C18161c;
import p629nk.C18269b;
import p704wk.C18717a;
import p704wk.C18718b;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C2244b {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 2132018601;
    public static final Property<View, Float> HEIGHT = new C15309e();
    public static final Property<View, Float> PADDING_END = new C15311g();
    public static final Property<View, Float> PADDING_START = new C15310f();
    public static final Property<View, Float> WIDTH = new C15308d();
    /* access modifiers changed from: private */
    public int animState;
    private boolean animateShowBeforeLayout;
    private final CoordinatorLayout.C2245c<ExtendedFloatingActionButton> behavior;
    private final C18717a changeVisibilityTracker;
    private final int collapsedSize;
    /* access modifiers changed from: private */
    public final C15333d extendStrategy;
    /* access modifiers changed from: private */
    public int extendedPaddingEnd;
    /* access modifiers changed from: private */
    public int extendedPaddingStart;
    /* access modifiers changed from: private */
    public final C15333d hideStrategy;
    /* access modifiers changed from: private */
    public boolean isExtended;
    /* access modifiers changed from: private */
    public boolean isTransforming;
    public ColorStateList originalTextCsl;
    /* access modifiers changed from: private */
    public final C15333d showStrategy;
    /* access modifiers changed from: private */
    public final C15333d shrinkStrategy;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C15305a implements C15316l {
        public C15305a() {
        }

        /* renamed from: a */
        public final int mo53934a() {
            return ExtendedFloatingActionButton.this.extendedPaddingEnd;
        }

        /* renamed from: b */
        public final ViewGroup.LayoutParams mo53935b() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        /* renamed from: c */
        public final int mo53936c() {
            return ExtendedFloatingActionButton.this.extendedPaddingStart;
        }

        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public final int getWidth() {
            return ExtendedFloatingActionButton.this.extendedPaddingEnd + ExtendedFloatingActionButton.this.extendedPaddingStart + (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2));
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C15306b implements C15316l {
        public C15306b() {
        }

        /* renamed from: a */
        public final int mo53934a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        /* renamed from: b */
        public final ViewGroup.LayoutParams mo53935b() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        /* renamed from: c */
        public final int mo53936c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public final int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C15307c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f34308a;

        /* renamed from: b */
        public final /* synthetic */ C15333d f34309b;

        public C15307c(C15333d dVar) {
            this.f34309b = dVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f34308a = true;
            this.f34309b.mo53957d();
        }

        public final void onAnimationEnd(Animator animator) {
            this.f34309b.onAnimationEnd();
            if (!this.f34308a) {
                this.f34309b.mo53950a();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f34309b.onAnimationStart(animator);
            this.f34308a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static class C15308d extends Property<View, Float> {
        public C15308d() {
            super(Float.class, ResponseConstants.WIDTH);
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public static class C15309e extends Property<View, Float> {
        public C15309e() {
            super(Float.class, ResponseConstants.HEIGHT);
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public static class C15310f extends Property<View, Float> {
        public C15310f() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            return Float.valueOf((float) C2364y.C2369e.m5235f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2369e.m5240k(view, intValue, paddingTop, C2364y.C2369e.m5234e(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public static class C15311g extends Property<View, Float> {
        public C15311g() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            return Float.valueOf((float) C2364y.C2369e.m5234e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2369e.m5240k(view, C2364y.C2369e.m5235f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C15312h extends C18718b {

        /* renamed from: g */
        public final C15316l f34310g;

        /* renamed from: h */
        public final boolean f34311h;

        public C15312h(C18717a aVar, C15316l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f34310g = lVar;
            this.f34311h = z;
        }

        /* renamed from: a */
        public final void mo53950a() {
        }

        /* renamed from: b */
        public final void mo53951b() {
            boolean unused = ExtendedFloatingActionButton.this.isExtended = this.f34311h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f34310g.mo53935b().width;
                layoutParams.height = this.f34310g.mo53935b().height;
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                int c = this.f34310g.mo53936c();
                int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
                int a = this.f34310g.mo53934a();
                int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2369e.m5240k(extendedFloatingActionButton, c, paddingTop, a, paddingBottom);
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: c */
        public final boolean mo53952c() {
            return this.f34311h == ExtendedFloatingActionButton.this.isExtended || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: e */
        public final int mo53953e() {
            return this.f34311h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: f */
        public final AnimatorSet mo53954f() {
            C18269b bVar = this.f41476f;
            if (bVar == null) {
                if (this.f41475e == null) {
                    this.f41475e = C18269b.m30886b(this.f41471a, mo53953e());
                }
                bVar = this.f41475e;
                bVar.getClass();
            }
            if (bVar.mo69813g(ResponseConstants.WIDTH)) {
                PropertyValuesHolder[] e = bVar.mo69810e(ResponseConstants.WIDTH);
                e[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f34310g.getWidth()});
                bVar.mo69814h(ResponseConstants.WIDTH, e);
            }
            if (bVar.mo69813g(ResponseConstants.HEIGHT)) {
                PropertyValuesHolder[] e2 = bVar.mo69810e(ResponseConstants.HEIGHT);
                e2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f34310g.getHeight()});
                bVar.mo69814h(ResponseConstants.HEIGHT, e2);
            }
            if (bVar.mo69813g("paddingStart")) {
                PropertyValuesHolder[] e3 = bVar.mo69810e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = e3[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                propertyValuesHolder.setFloatValues(new float[]{(float) C2364y.C2369e.m5235f(extendedFloatingActionButton), (float) this.f34310g.mo53936c()});
                bVar.mo69814h("paddingStart", e3);
            }
            if (bVar.mo69813g("paddingEnd")) {
                PropertyValuesHolder[] e4 = bVar.mo69810e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = e4[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                propertyValuesHolder2.setFloatValues(new float[]{(float) C2364y.C2369e.m5234e(extendedFloatingActionButton2), (float) this.f34310g.mo53934a()});
                bVar.mo69814h("paddingEnd", e4);
            }
            if (bVar.mo69813g("labelOpacity")) {
                PropertyValuesHolder[] e5 = bVar.mo69810e("labelOpacity");
                boolean z = this.f34311h;
                float f = 0.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                e5[0].setFloatValues(new float[]{f2, f});
                bVar.mo69814h("labelOpacity", e5);
            }
            return mo70199g(bVar);
        }

        public final void onAnimationEnd() {
            this.f41474d.f41470a = null;
            boolean unused = ExtendedFloatingActionButton.this.isTransforming = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f34310g.mo53935b().width;
                layoutParams.height = this.f34310g.mo53935b().height;
            }
        }

        public final void onAnimationStart(Animator animator) {
            C18717a aVar = this.f41474d;
            Animator animator2 = aVar.f41470a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f41470a = animator;
            boolean unused = ExtendedFloatingActionButton.this.isExtended = this.f34311h;
            boolean unused2 = ExtendedFloatingActionButton.this.isTransforming = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public class C15313i extends C18718b {

        /* renamed from: g */
        public boolean f34313g;

        public C15313i(C18717a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public final void mo53950a() {
        }

        /* renamed from: b */
        public final void mo53951b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: c */
        public final boolean mo53952c() {
            return ExtendedFloatingActionButton.this.isOrWillBeHidden();
        }

        /* renamed from: d */
        public final void mo53957d() {
            super.mo53957d();
            this.f34313g = true;
        }

        /* renamed from: e */
        public final int mo53953e() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        public final void onAnimationEnd() {
            this.f41474d.f41470a = null;
            int unused = ExtendedFloatingActionButton.this.animState = 0;
            if (!this.f34313g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C18717a aVar = this.f41474d;
            Animator animator2 = aVar.f41470a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f41470a = animator;
            this.f34313g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.animState = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C15314j {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    public class C15315k extends C18718b {
        public C15315k(C18717a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public final void mo53950a() {
        }

        /* renamed from: b */
        public final void mo53951b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: c */
        public final boolean mo53952c() {
            return ExtendedFloatingActionButton.this.isOrWillBeShown();
        }

        /* renamed from: e */
        public final int mo53953e() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        public final void onAnimationEnd() {
            this.f41474d.f41470a = null;
            int unused = ExtendedFloatingActionButton.this.animState = 0;
        }

        public final void onAnimationStart(Animator animator) {
            C18717a aVar = this.f41474d;
            Animator animator2 = aVar.f41470a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f41470a = animator;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.animState = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    public interface C15316l {
        /* renamed from: a */
        int mo53934a();

        /* renamed from: b */
        ViewGroup.LayoutParams mo53935b();

        /* renamed from: c */
        int mo53936c();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        return getVisibility() == 0 ? this.animState == 1 : this.animState != 2;
    }

    /* access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        return getVisibility() != 0 ? this.animState == 2 : this.animState != 1;
    }

    /* access modifiers changed from: private */
    public void performMotion(C15333d dVar, C15314j jVar) {
        if (!dVar.mo53952c()) {
            if (!shouldAnimateVisibilityChange()) {
                dVar.mo53951b();
                dVar.mo53950a();
                return;
            }
            measure(0, 0);
            AnimatorSet f = dVar.mo53954f();
            f.addListener(new C15307c(dVar));
            Iterator<Animator.AnimatorListener> it = ((C18718b) dVar).f41473c.iterator();
            while (it.hasNext()) {
                f.addListener(it.next());
            }
            f.start();
        }
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    private boolean shouldAnimateVisibilityChange() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return (C2364y.C2371g.m5246c(this) || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.extendStrategy).f41473c.add(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.hideStrategy).f41473c.add(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.showStrategy).f41473c.add(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.shrinkStrategy).f41473c.add(animatorListener);
    }

    public void extend() {
        performMotion(this.extendStrategy, (C15314j) null);
    }

    public CoordinatorLayout.C2245c<ExtendedFloatingActionButton> getBehavior() {
        return this.behavior;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.collapsedSize;
        if (i >= 0) {
            return i;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return (Math.min(C2364y.C2369e.m5235f(this), C2364y.C2369e.m5234e(this)) * 2) + getIconSize();
    }

    public C18269b getExtendMotionSpec() {
        return ((C18718b) this.extendStrategy).f41476f;
    }

    public C18269b getHideMotionSpec() {
        return ((C18718b) this.hideStrategy).f41476f;
    }

    public C18269b getShowMotionSpec() {
        return ((C18718b) this.showStrategy).f41476f;
    }

    public C18269b getShrinkMotionSpec() {
        return ((C18718b) this.shrinkStrategy).f41476f;
    }

    public void hide() {
        performMotion(this.hideStrategy, (C15314j) null);
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.mo53951b();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.extendStrategy).f41473c.remove(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.hideStrategy).f41473c.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.showStrategy).f41473c.remove(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        ((C18718b) this.shrinkStrategy).f41473c.remove(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.animateShowBeforeLayout = z;
    }

    public void setExtendMotionSpec(C18269b bVar) {
        ((C18718b) this.extendStrategy).f41476f = bVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C18269b.m30886b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.isExtended != z) {
            C15333d dVar = z ? this.extendStrategy : this.shrinkStrategy;
            if (!dVar.mo53952c()) {
                dVar.mo53951b();
            }
        }
    }

    public void setHideMotionSpec(C18269b bVar) {
        ((C18718b) this.hideStrategy).f41476f = bVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C18269b.m30886b(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.isExtended && !this.isTransforming) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            this.extendedPaddingStart = C2364y.C2369e.m5235f(this);
            this.extendedPaddingEnd = C2364y.C2369e.m5234e(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.isExtended && !this.isTransforming) {
            this.extendedPaddingStart = i;
            this.extendedPaddingEnd = i3;
        }
    }

    public void setShowMotionSpec(C18269b bVar) {
        ((C18718b) this.showStrategy).f41476f = bVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C18269b.m30886b(getContext(), i));
    }

    public void setShrinkMotionSpec(C18269b bVar) {
        ((C18718b) this.shrinkStrategy).f41476f = bVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C18269b.m30886b(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        saveOriginalTextCsl();
    }

    public void show() {
        performMotion(this.showStrategy, (C15314j) null);
    }

    public void shrink() {
        performMotion(this.shrinkStrategy, (C15314j) null);
    }

    public void silentlyUpdateTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(C15314j jVar) {
        performMotion(this.extendStrategy, jVar);
    }

    public void hide(C15314j jVar) {
        performMotion(this.hideStrategy, jVar);
    }

    public void show(C15314j jVar) {
        performMotion(this.showStrategy, jVar);
    }

    public void shrink(C15314j jVar) {
        performMotion(this.shrinkStrategy, jVar);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C2245c<T> {

        /* renamed from: a */
        public Rect f34303a;

        /* renamed from: b */
        public boolean f34304b;

        /* renamed from: c */
        public boolean f34305c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f34304b = false;
            this.f34305c = true;
        }

        /* renamed from: a */
        public final boolean mo53931a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f34304b || this.f34305c) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        /* renamed from: b */
        public final boolean mo53932b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo53931a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f34303a == null) {
                this.f34303a = new Rect();
            }
            Rect rect = this.f34303a;
            C15345b.m24941a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                extendedFloatingActionButton.performMotion(this.f34305c ? extendedFloatingActionButton.shrinkStrategy : extendedFloatingActionButton.hideStrategy, (C15314j) null);
                return true;
            }
            extendedFloatingActionButton.performMotion(this.f34305c ? extendedFloatingActionButton.extendStrategy : extendedFloatingActionButton.showStrategy, (C15314j) null);
            return true;
        }

        /* renamed from: c */
        public final boolean mo53933c(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo53931a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                extendedFloatingActionButton.performMotion(this.f34305c ? extendedFloatingActionButton.shrinkStrategy : extendedFloatingActionButton.hideStrategy, (C15314j) null);
                return true;
            }
            extendedFloatingActionButton.performMotion(this.f34305c ? extendedFloatingActionButton.extendStrategy : extendedFloatingActionButton.showStrategy, (C15314j) null);
            return true;
        }

        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo53932b(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    mo53933c(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && mo53933c(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo53932b(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39710s);
            this.f34304b = obtainStyledAttributes.getBoolean(0, false);
            this.f34305c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = p574gl.C17790a.m29918a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.animState = r10
            wk.a r1 = new wk.a
            r1.<init>()
            r0.changeVisibilityTracker = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.showStrategy = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.hideStrategy = r12
            r13 = 1
            r0.isExtended = r13
            r0.isTransforming = r10
            r0.animateShowBeforeLayout = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.behavior = r1
            int[] r3 = p610kp.C18161c.f39708r
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C15367g.m24957d(r1, r2, r3, r4, r5, r6)
            r2 = 4
            nk.b r2 = p629nk.C18269b.m30885a(r14, r1, r2)
            r3 = 3
            nk.b r3 = p629nk.C18269b.m30885a(r14, r1, r3)
            r4 = 2
            nk.b r4 = p629nk.C18269b.m30885a(r14, r1, r4)
            r5 = 5
            nk.b r5 = p629nk.C18269b.m30885a(r14, r1, r5)
            r6 = -1
            int r6 = r1.getDimensionPixelSize(r10, r6)
            r0.collapsedSize = r6
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r6 = androidx.core.view.C2364y.f5646a
            int r6 = androidx.core.view.C2364y.C2369e.m5235f(r16)
            r0.extendedPaddingStart = r6
            int r6 = androidx.core.view.C2364y.C2369e.m5234e(r16)
            r0.extendedPaddingEnd = r6
            wk.a r6 = new wk.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.extendStrategy = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.shrinkStrategy = r10
            r11.f41476f = r2
            r12.f41476f = r3
            r15.f41476f = r4
            r10.f41476f = r5
            r1.recycle()
            dl.h r1 = com.google.android.material.shape.C15401a.f34570m
            r2 = r18
            com.google.android.material.shape.a$a r1 = com.google.android.material.shape.C15401a.m24982c(r14, r2, r8, r9, r1)
            com.google.android.material.shape.a r2 = new com.google.android.material.shape.a
            r2.<init>(r1)
            r0.setShapeAppearanceModel(r2)
            r16.saveOriginalTextCsl()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }
}
