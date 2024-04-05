package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C15367g;
import com.google.android.material.internal.C15370j;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C15441i;
import java.util.List;
import java.util.WeakHashMap;
import p507al.C14025c;
import p558el.C17718e;
import p558el.C17719f;
import p558el.C17721h;
import p574gl.C17790a;
import p610kp.C18161c;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: n */
    public static final Handler f34649n = new Handler(Looper.getMainLooper(), new C15427a());

    /* renamed from: o */
    public static final int[] f34650o = {R.attr.snackbarStyle};

    /* renamed from: p */
    public static final String f34651p = "BaseTransientBottomBar";

    /* renamed from: a */
    public final ViewGroup f34652a;

    /* renamed from: b */
    public final Context f34653b;

    /* renamed from: c */
    public final SnackbarBaseLayout f34654c;

    /* renamed from: d */
    public final C17721h f34655d;

    /* renamed from: e */
    public int f34656e;

    /* renamed from: f */
    public final C15428b f34657f = new C15428b();

    /* renamed from: g */
    public Rect f34658g;

    /* renamed from: h */
    public int f34659h;

    /* renamed from: i */
    public int f34660i;

    /* renamed from: j */
    public int f34661j;

    /* renamed from: k */
    public int f34662k;

    /* renamed from: l */
    public final AccessibilityManager f34663l;

    /* renamed from: m */
    public C15429c f34664m = new C15429c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i */
        public final C15430d f34665i = new C15430d(this);

        /* renamed from: a */
        public final boolean mo53108a(View view) {
            this.f34665i.getClass();
            return view instanceof SnackbarBaseLayout;
        }

        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C15430d dVar = this.f34665i;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C15441i b = C15441i.m25034b();
                    C15429c cVar = dVar.f34668a;
                    synchronized (b.f34680a) {
                        if (b.mo54779c(cVar)) {
                            C15441i.C15444c cVar2 = b.f34682c;
                            if (cVar2.f34687c) {
                                cVar2.f34687c = false;
                                b.mo54780d(cVar2);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C15441i b2 = C15441i.m25034b();
                C15429c cVar3 = dVar.f34668a;
                synchronized (b2.f34680a) {
                    if (b2.mo54779c(cVar3)) {
                        C15441i.C15444c cVar4 = b2.f34682c;
                        if (!cVar4.f34687c) {
                            cVar4.f34687c = true;
                            b2.f34681b.removeCallbacksAndMessages(cVar4);
                        }
                    }
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    public static class SnackbarBaseLayout extends FrameLayout {
        private static final View.OnTouchListener consumeAllTouchListener = new C15426a();
        private final float actionTextColorAlpha;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private ColorStateList backgroundTint;
        private PorterDuff.Mode backgroundTintMode;
        private final int maxInlineActionWidth;
        private final int maxWidth;
        private C15431e onAttachStateChangeListener;
        private C15432f onLayoutChangeListener;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        public static class C15426a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context) {
            this(context, (AttributeSet) null);
        }

        private Drawable createThemedBackground() {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C1993m.m4357R(getBackgroundOverlayColorAlpha(), C1993m.m4344E(R.attr.colorSurface, this), C1993m.m4344E(R.attr.colorOnSurface, this)));
            ColorStateList colorStateList = this.backgroundTint;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            return gradientDrawable;
        }

        public float getActionTextColorAlpha() {
            return this.actionTextColorAlpha;
        }

        public int getAnimationMode() {
            return this.animationMode;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.backgroundOverlayColorAlpha;
        }

        public int getMaxInlineActionWidth() {
            return this.maxInlineActionWidth;
        }

        public int getMaxWidth() {
            return this.maxWidth;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C15431e eVar = this.onAttachStateChangeListener;
            if (eVar != null) {
                ((C15437e) eVar).mo54775a();
            }
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            if (r1 == false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDetachedFromWindow() {
            /*
                r7 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r7.onAttachStateChangeListener
                if (r0 == 0) goto L_0x004a
                com.google.android.material.snackbar.e r0 = (com.google.android.material.snackbar.C15437e) r0
                com.google.android.material.snackbar.BaseTransientBottomBar r1 = r0.f34675a
                r1.getClass()
                com.google.android.material.snackbar.i r2 = com.google.android.material.snackbar.C15441i.m25034b()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r1 = r1.f34664m
                java.lang.Object r3 = r2.f34680a
                monitor-enter(r3)
                boolean r4 = r2.mo54779c(r1)     // Catch:{ all -> 0x002f }
                r5 = 0
                r6 = 1
                if (r4 != 0) goto L_0x0039
                com.google.android.material.snackbar.i$c r2 = r2.f34683d     // Catch:{ all -> 0x002f }
                if (r2 == 0) goto L_0x0036
                if (r1 == 0) goto L_0x0031
                java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r2 = r2.f34685a     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002f }
                if (r2 != r1) goto L_0x0031
                r1 = r6
                goto L_0x0032
            L_0x002f:
                r0 = move-exception
                goto L_0x0048
            L_0x0031:
                r1 = r5
            L_0x0032:
                if (r1 == 0) goto L_0x0036
                r1 = r6
                goto L_0x0037
            L_0x0036:
                r1 = r5
            L_0x0037:
                if (r1 == 0) goto L_0x003a
            L_0x0039:
                r5 = r6
            L_0x003a:
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                if (r5 == 0) goto L_0x004a
                android.os.Handler r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f34649n
                el.g r2 = new el.g
                r2.<init>(r0)
                r1.post(r2)
                goto L_0x004a
            L_0x0048:
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.onDetachedFromWindow():void");
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C15432f fVar = this.onLayoutChangeListener;
            if (fVar != null) {
                C15438f fVar2 = (C15438f) fVar;
                fVar2.f34676a.f34654c.setOnLayoutChangeListener((C15432f) null);
                fVar2.f34676a.mo54737e();
            }
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.maxWidth > 0 && getMeasuredWidth() > (i3 = this.maxWidth)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setAnimationMode(int i) {
            this.animationMode = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.backgroundTint == null)) {
                drawable = drawable.mutate();
                drawable.setTintList(this.backgroundTint);
                drawable.setTintMode(this.backgroundTintMode);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.backgroundTint = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.backgroundTintMode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.backgroundTintMode = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setOnAttachStateChangeListener(C15431e eVar) {
            this.onAttachStateChangeListener = eVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : consumeAllTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(C15432f fVar) {
            this.onLayoutChangeListener = fVar;
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(C17790a.m29918a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C18161c.f39694k0);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2373i.m5272s(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.animationMode = obtainStyledAttributes.getInt(2, 0);
            this.backgroundOverlayColorAlpha = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C14025c.m21582a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(C15370j.m24964e(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.actionTextColorAlpha = obtainStyledAttributes.getFloat(1, 1.0f);
            this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.maxInlineActionWidth = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(consumeAllTouchListener);
            setFocusable(true);
            if (getBackground() == null) {
                Drawable createThemedBackground = createThemedBackground();
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                C2364y.C2368d.m5227q(this, createThemedBackground);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public static class C15427a implements Handler.Callback {
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
            r3 = r3.getEnabledAccessibilityServiceList(1);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                int r0 = r8.what
                r1 = 1
                if (r0 == 0) goto L_0x00a2
                r2 = 0
                if (r0 == r1) goto L_0x0009
                return r2
            L_0x0009:
                java.lang.Object r0 = r8.obj
                com.google.android.material.snackbar.BaseTransientBottomBar r0 = (com.google.android.material.snackbar.BaseTransientBottomBar) r0
                int r8 = r8.arg1
                android.view.accessibility.AccessibilityManager r3 = r0.f34663l
                if (r3 != 0) goto L_0x0014
                goto L_0x0020
            L_0x0014:
                java.util.List r3 = r3.getEnabledAccessibilityServiceList(r1)
                if (r3 == 0) goto L_0x0022
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0022
            L_0x0020:
                r3 = r1
                goto L_0x0023
            L_0x0022:
                r3 = r2
            L_0x0023:
                if (r3 == 0) goto L_0x009e
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r3 = r0.f34654c
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L_0x009e
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r3 = r0.f34654c
                int r3 = r3.getAnimationMode()
                r4 = 2
                if (r3 != r1) goto L_0x005d
                float[] r2 = new float[r4]
                r2 = {1065353216, 0} // fill-array
                android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
                android.view.animation.LinearInterpolator r3 = p629nk.C18268a.f40091a
                r2.setInterpolator(r3)
                com.google.android.material.snackbar.a r3 = new com.google.android.material.snackbar.a
                r3.<init>(r0)
                r2.addUpdateListener(r3)
                r3 = 75
                r2.setDuration(r3)
                el.b r3 = new el.b
                r3.<init>(r0, r8)
                r2.addListener(r3)
                r2.start()
                goto L_0x00a1
            L_0x005d:
                android.animation.ValueAnimator r3 = new android.animation.ValueAnimator
                r3.<init>()
                int[] r4 = new int[r4]
                r4[r2] = r2
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r2 = r0.f34654c
                int r2 = r2.getHeight()
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r5 = r0.f34654c
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r6 == 0) goto L_0x007b
                android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
                int r5 = r5.bottomMargin
                int r2 = r2 + r5
            L_0x007b:
                r4[r1] = r2
                r3.setIntValues(r4)
                androidx.interpolator.view.animation.FastOutSlowInInterpolator r2 = p629nk.C18268a.f40092b
                r3.setInterpolator(r2)
                r4 = 250(0xfa, double:1.235E-321)
                r3.setDuration(r4)
                el.d r2 = new el.d
                r2.<init>(r0, r8)
                r3.addListener(r2)
                com.google.android.material.snackbar.d r8 = new com.google.android.material.snackbar.d
                r8.<init>(r0)
                r3.addUpdateListener(r8)
                r3.start()
                goto L_0x00a1
            L_0x009e:
                r0.mo54735c()
            L_0x00a1:
                return r1
            L_0x00a2:
                java.lang.Object r8 = r8.obj
                com.google.android.material.snackbar.BaseTransientBottomBar r8 = (com.google.android.material.snackbar.BaseTransientBottomBar) r8
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r8.f34654c
                com.google.android.material.snackbar.e r2 = new com.google.android.material.snackbar.e
                r2.<init>(r8)
                r0.setOnAttachStateChangeListener(r2)
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r8.f34654c
                android.view.ViewParent r0 = r0.getParent()
                if (r0 != 0) goto L_0x00f0
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r8.f34654c
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                boolean r2 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
                if (r2 == 0) goto L_0x00e0
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
                r2.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar$d r3 = r2.f34665i
                r3.getClass()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r4 = r8.f34664m
                r3.f34668a = r4
                com.google.android.material.snackbar.g r3 = new com.google.android.material.snackbar.g
                r3.<init>(r8)
                r2.f34096b = r3
                r0.setBehavior(r2)
                r2 = 80
                r0.insetEdge = r2
            L_0x00e0:
                r8.mo54738f()
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r8.f34654c
                r2 = 4
                r0.setVisibility(r2)
                android.view.ViewGroup r0 = r8.f34652a
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r2 = r8.f34654c
                r0.addView(r2)
            L_0x00f0:
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r8.f34654c
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r2 = androidx.core.view.C2364y.f5646a
                boolean r0 = androidx.core.view.C2364y.C2371g.m5246c(r0)
                if (r0 == 0) goto L_0x00fe
                r8.mo54737e()
                goto L_0x0108
            L_0x00fe:
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r8.f34654c
                com.google.android.material.snackbar.f r2 = new com.google.android.material.snackbar.f
                r2.<init>(r8)
                r0.setOnLayoutChangeListener(r2)
            L_0x0108:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.C15427a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C15428b implements Runnable {
        public C15428b() {
        }

        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f34654c != null && (context = baseTransientBottomBar.f34653b) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.f34654c.getLocationOnScreen(iArr);
                int height = (i - (baseTransientBottomBar2.f34654c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f34654c.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                if (height < baseTransientBottomBar3.f34662k) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f34654c.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(BaseTransientBottomBar.f34651p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i2 = marginLayoutParams.bottomMargin;
                    BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                    marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f34662k - height) + i2;
                    baseTransientBottomBar4.f34654c.requestLayout();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C15429c implements C15441i.C15443b {
        public C15429c() {
        }

        /* renamed from: a */
        public final void mo54759a() {
            Handler handler = BaseTransientBottomBar.f34649n;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public final void mo54760b(int i) {
            Handler handler = BaseTransientBottomBar.f34649n;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public static class C15430d {

        /* renamed from: a */
        public C15429c f34668a;

        public C15430d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f34100f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f34101g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f34098d = 0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public interface C15431e {
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public interface C15432f {
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.f34652a = viewGroup;
            this.f34655d = snackbarContentLayout2;
            this.f34653b = context;
            C15367g.m24956c(context, C15367g.f34513a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f34650o);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.f34654c = snackbarBaseLayout;
            snackbarContentLayout.updateActionTextColorAlphaIfNeeded(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            snackbarBaseLayout.addView(snackbarContentLayout);
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f34658g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2371g.m5249f(snackbarBaseLayout, 1);
            C2364y.C2368d.m5229s(snackbarBaseLayout, 1);
            snackbarBaseLayout.setFitsSystemWindows(true);
            C2364y.C2373i.m5274u(snackbarBaseLayout, new C17718e(this));
            C2364y.m5201p(snackbarBaseLayout, new C17719f(this));
            this.f34663l = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: a */
    public void mo54733a() {
        mo54734b(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54734b(int r7) {
        /*
            r6 = this;
            com.google.android.material.snackbar.i r0 = com.google.android.material.snackbar.C15441i.m25034b()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r1 = r6.f34664m
            java.lang.Object r2 = r0.f34680a
            monitor-enter(r2)
            boolean r3 = r0.mo54779c(r1)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0015
            com.google.android.material.snackbar.i$c r1 = r0.f34682c     // Catch:{ all -> 0x0037 }
            r0.mo54778a(r1, r7)     // Catch:{ all -> 0x0037 }
            goto L_0x0033
        L_0x0015:
            com.google.android.material.snackbar.i$c r3 = r0.f34683d     // Catch:{ all -> 0x0037 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x0027
            java.lang.ref.WeakReference<com.google.android.material.snackbar.i$b> r3 = r3.f34685a     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0037 }
            if (r3 != r1) goto L_0x0027
            r1 = r4
            goto L_0x0028
        L_0x0027:
            r1 = r5
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            if (r4 == 0) goto L_0x0033
            com.google.android.material.snackbar.i$c r1 = r0.f34683d     // Catch:{ all -> 0x0037 }
            r0.mo54778a(r1, r7)     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r7
        L_0x0037:
            r7 = move-exception
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.mo54734b(int):void");
    }

    /* renamed from: c */
    public final void mo54735c() {
        C15441i b = C15441i.m25034b();
        C15429c cVar = this.f34664m;
        synchronized (b.f34680a) {
            try {
                if (b.mo54779c(cVar)) {
                    b.f34682c = null;
                    C15441i.C15444c cVar2 = b.f34683d;
                    if (!(cVar2 == null || cVar2 == null)) {
                        b.f34682c = cVar2;
                        b.f34683d = null;
                        C15441i.C15443b bVar = cVar2.f34685a.get();
                        if (bVar != null) {
                            bVar.mo54759a();
                        } else {
                            b.f34682c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ViewParent parent = this.f34654c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f34654c);
        }
    }

    /* renamed from: d */
    public final void mo54736d() {
        C15441i b = C15441i.m25034b();
        C15429c cVar = this.f34664m;
        synchronized (b.f34680a) {
            if (b.mo54779c(cVar)) {
                b.mo54780d(b.f34682c);
            }
        }
    }

    /* renamed from: e */
    public final void mo54737e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f34663l;
        boolean z = true;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        if (z) {
            this.f34654c.post(new C15440h(this));
            return;
        }
        if (this.f34654c.getParent() != null) {
            this.f34654c.setVisibility(0);
        }
        mo54736d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (((r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0).getBehavior() instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L_0x0052;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54738f() {
        /*
            r4 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f34654c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0063
            android.graphics.Rect r1 = r4.f34658g
            if (r1 != 0) goto L_0x000f
            goto L_0x0063
        L_0x000f:
            int r2 = r4.f34659h
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r3 = r1.bottom
            int r3 = r3 + r2
            r0.bottomMargin = r3
            int r2 = r1.left
            int r3 = r4.f34660i
            int r2 = r2 + r3
            r0.leftMargin = r2
            int r1 = r1.right
            int r2 = r4.f34661j
            int r1 = r1 + r2
            r0.rightMargin = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f34654c
            r0.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0062
            int r0 = r4.f34662k
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0051
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f34654c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r3 == 0) goto L_0x004d
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.getBehavior()
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L_0x004d
            r0 = r1
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            if (r0 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = r2
        L_0x0052:
            if (r1 == 0) goto L_0x0062
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f34654c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r4.f34657f
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r4.f34654c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r4.f34657f
            r0.post(r1)
        L_0x0062:
            return
        L_0x0063:
            java.lang.String r0 = f34651p
            java.lang.String r1 = "Unable to update margins because layout params are not MarginLayoutParams"
            android.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.mo54738f():void");
    }
}
