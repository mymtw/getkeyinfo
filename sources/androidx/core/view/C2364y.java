package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.foundation.layout.C0753p;
import androidx.core.view.C2273a;
import androidx.core.view.C2282c;
import androidx.core.view.C2336v0;
import androidx.core.view.C2348w0;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p088e1.C6689b;
import p088e1.C6697d;
import p193o.C7506i;
import p289y0.C8352d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.y */
public final class C2364y {

    /* renamed from: a */
    public static WeakHashMap<View, C2330s0> f5646a = null;

    /* renamed from: b */
    public static Field f5647b;

    /* renamed from: c */
    public static boolean f5648c = false;

    /* renamed from: d */
    public static final int[] f5649d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C2331t f5650e = new C2331t();

    /* renamed from: f */
    public static final C2365a f5651f = new C2365a();

    /* renamed from: androidx.core.view.y$a */
    public static class C2365a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final WeakHashMap<View, Boolean> f5652b = new WeakHashMap<>();

        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f5652b.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    boolean z = view.getVisibility() == 0;
                    if (booleanValue != z) {
                        C2364y.m5195j(z ? 16 : 32, view);
                        this.f5652b.put(view, Boolean.valueOf(z));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.y$b */
    public static abstract class C2366b<T> {

        /* renamed from: a */
        public final int f5653a;

        /* renamed from: b */
        public final Class<T> f5654b;

        /* renamed from: c */
        public final int f5655c;

        /* renamed from: d */
        public final int f5656d;

        public C2366b(int i, Class<T> cls, int i2, int i3) {
            this.f5653a = i;
            this.f5654b = cls;
            this.f5656d = i2;
            this.f5655c = i3;
        }

        /* renamed from: a */
        public static boolean m5204a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public abstract T mo8924b(View view);

        /* renamed from: c */
        public abstract void mo8925c(View view, T t);

        /* renamed from: d */
        public final T mo8987d(View view) {
            if (Build.VERSION.SDK_INT >= this.f5655c) {
                return mo8924b(view);
            }
            T tag = view.getTag(this.f5653a);
            if (this.f5654b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: e */
        public final void mo8988e(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.f5655c) {
                mo8925c(view, t);
            } else if (mo8926f(mo8987d(view), t)) {
                C2273a d = C2364y.m5189d(view);
                if (d == null) {
                    d = new C2273a();
                }
                C2364y.m5201p(view, d);
                view.setTag(this.f5653a, t);
                C2364y.m5195j(this.f5656d, view);
            }
        }

        /* renamed from: f */
        public abstract boolean mo8926f(T t, T t2);
    }

    /* renamed from: androidx.core.view.y$c */
    public static class C2367c {
        /* renamed from: a */
        public static boolean m5210a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.y$d */
    public static class C2368d {
        /* renamed from: a */
        public static AccessibilityNodeProvider m5211a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m5212b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m5213c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m5214d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m5215e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m5216f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m5217g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m5218h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m5219i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m5220j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        public static void m5221k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m5222l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        public static void m5223m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m5224n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        public static void m5225o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m5226p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m5227q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m5228r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        public static void m5229s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.y$e */
    public static class C2369e {
        /* renamed from: a */
        public static int m5230a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m5231b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m5232c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m5233d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m5234e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m5235f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m5236g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m5237h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        public static void m5238i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m5239j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        public static void m5240k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.y$f */
    public static class C2370f {
        /* renamed from: a */
        public static Rect m5241a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m5242b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m5243c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.y$g */
    public static class C2371g {
        /* renamed from: a */
        public static int m5244a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m5245b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m5246c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m5247d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m5248e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        public static void m5249f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        public static void m5250g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.y$h */
    public static class C2372h {
        /* renamed from: a */
        public static WindowInsets m5251a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m5252b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m5253c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.y$i */
    public static class C2373i {

        /* renamed from: androidx.core.view.y$i$a */
        public class C2374a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C2348w0 f5657a = null;

            /* renamed from: b */
            public final /* synthetic */ View f5658b;

            /* renamed from: c */
            public final /* synthetic */ C2325q f5659c;

            public C2374a(View view, C2325q qVar) {
                this.f5658b = view;
                this.f5659c = qVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C2348w0 k = C2348w0.m5100k(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C2373i.m5254a(windowInsets, this.f5658b);
                    if (k.equals(this.f5657a)) {
                        return this.f5659c.mo1389b(view, k).mo8951j();
                    }
                }
                this.f5657a = k;
                C2348w0 b = this.f5659c.mo1389b(view, k);
                if (i >= 30) {
                    return b.mo8951j();
                }
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2372h.m5253c(view);
                return b.mo8951j();
            }
        }

        /* renamed from: a */
        public static void m5254a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C2348w0 m5255b(View view, C2348w0 w0Var, Rect rect) {
            WindowInsets j = w0Var.mo8951j();
            if (j != null) {
                return C2348w0.m5100k(view, view.computeSystemWindowInsets(j, rect));
            }
            rect.setEmpty();
            return w0Var;
        }

        /* renamed from: c */
        public static boolean m5256c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m5257d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m5258e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m5259f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m5260g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m5261h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m5262i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C2348w0 m5263j(View view) {
            if (C2348w0.C2349a.f5619d && view.isAttachedToWindow()) {
                try {
                    Object obj = C2348w0.C2349a.f5616a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) C2348w0.C2349a.f5617b.get(obj);
                        Rect rect2 = (Rect) C2348w0.C2349a.f5618c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i = Build.VERSION.SDK_INT;
                            C2348w0.C2353e dVar = i >= 30 ? new C2348w0.C2352d() : i >= 29 ? new C2348w0.C2351c() : new C2348w0.C2350b();
                            dVar.mo8953e(C8352d.m16668b(rect.left, rect.top, rect.right, rect.bottom));
                            dVar.mo8954g(C8352d.m16668b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            C2348w0 b = dVar.mo8952b();
                            b.f5615a.mo8969r(b);
                            b.f5615a.mo8960d(view.getRootView());
                            return b;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder h = C0072d.m201h("Failed to get insets from AttachInfo. ");
                    h.append(e.getMessage());
                    Log.w("WindowInsetsCompat", h.toString(), e);
                }
            }
            return null;
        }

        /* renamed from: k */
        public static String m5264k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m5265l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m5266m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m5267n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m5268o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m5269p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m5270q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m5271r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m5272s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m5273t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m5274u(View view, C2325q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C2374a(view, qVar));
            }
        }

        /* renamed from: v */
        public static void m5275v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m5276w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m5277x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m5278y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m5279z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.y$j */
    public static class C2375j {
        /* renamed from: a */
        public static C2348w0 m5280a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C2348w0 k = C2348w0.m5100k((View) null, rootWindowInsets);
            k.f5615a.mo8969r(k);
            k.f5615a.mo8960d(view.getRootView());
            return k;
        }

        /* renamed from: b */
        public static int m5281b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m5282c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m5283d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.y$k */
    public static class C2376k {
        /* renamed from: a */
        public static void m5284a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        public static void m5285b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        public static void m5286c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        public static void m5287d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        public static boolean m5288e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        public static void m5289f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: androidx.core.view.y$l */
    public static class C2377l {
        /* renamed from: a */
        public static void m5290a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static int m5291b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        public static int m5292c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        public static boolean m5293d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        public static boolean m5294e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        public static boolean m5295f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        public static boolean m5296g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        public static View m5297h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        public static boolean m5298i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        public static void m5299j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m5300k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        public static void m5301l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        public static void m5302m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        public static void m5303n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        public static void m5304o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.y$m */
    public static class C2378m {
        /* renamed from: a */
        public static void m5305a(View view, C2383r rVar) {
            C7506i iVar = (C7506i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar == null) {
                iVar = new C7506i();
                view.setTag(R.id.tag_unhandled_key_listeners, iVar);
            }
            Objects.requireNonNull(rVar);
            C2302f0 f0Var = new C2302f0(rVar);
            iVar.put(rVar, f0Var);
            view.addOnUnhandledKeyEventListener(f0Var);
        }

        /* renamed from: b */
        public static CharSequence m5306b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m5307c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m5308d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m5309e(View view, C2383r rVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            C7506i iVar = (C7506i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) iVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        public static <T> T m5310f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        public static void m5311g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m5312h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m5313i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.y$n */
    public static class C2379n {
        /* renamed from: a */
        public static View.AccessibilityDelegate m5314a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static List<Rect> m5315b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        public static void m5316c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        public static void m5317d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.y$o */
    public static class C2380o {
        /* renamed from: a */
        public static CharSequence m5318a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static C2290c1 m5319b(View view) {
            WindowInsetsController a = view.getWindowInsetsController();
            if (a != null) {
                return new C2290c1(a);
            }
            return null;
        }

        /* renamed from: c */
        public static void m5320c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.y$p */
    public static final class C2381p {
        /* renamed from: a */
        public static String[] m5321a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C2282c m5322b(View view, C2282c cVar) {
            ContentInfo c = cVar.f5538a.mo8882c();
            ContentInfo a = view.performReceiveContent(c);
            if (a == null) {
                return null;
            }
            return a == c ? cVar : new C2282c(new C2282c.C2286d(a));
        }

        /* renamed from: c */
        public static void m5323c(View view, String[] strArr, C2327r rVar) {
            if (rVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C2382q(rVar));
            }
        }
    }

    /* renamed from: androidx.core.view.y$q */
    public static final class C2382q implements OnReceiveContentListener {

        /* renamed from: a */
        public final C2327r f5660a;

        public C2382q(C2327r rVar) {
            this.f5660a = rVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C2282c cVar = new C2282c(new C2282c.C2286d(contentInfo));
            C2282c a = this.f5660a.mo8916a(view, cVar);
            if (a == null) {
                return null;
            }
            return a == cVar ? contentInfo : a.f5538a.mo8882c();
        }
    }

    /* renamed from: androidx.core.view.y$r */
    public interface C2383r {
        /* renamed from: a */
        boolean mo8991a();
    }

    /* renamed from: androidx.core.view.y$s */
    public static class C2384s {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f5661d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f5662a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f5663b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f5664c = null;

        /* renamed from: b */
        public static boolean m5325b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2383r) arrayList.get(size)).mo8991a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final View mo8992a(View view, KeyEvent keyEvent) {
            View a;
            WeakHashMap<View, Boolean> weakHashMap = this.f5662a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a = mo8992a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a == null);
                return a;
            }
            if (m5325b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    /* renamed from: a */
    public static C2330s0 m5186a(View view) {
        if (f5646a == null) {
            f5646a = new WeakHashMap<>();
        }
        C2330s0 s0Var = f5646a.get(view);
        if (s0Var != null) {
            return s0Var;
        }
        C2330s0 s0Var2 = new C2330s0(view);
        f5646a.put(view, s0Var2);
        return s0Var2;
    }

    /* renamed from: b */
    public static C2348w0 m5187b(View view, C2348w0 w0Var) {
        WindowInsets j = w0Var.mo8951j();
        if (j != null) {
            WindowInsets a = C2372h.m5251a(view, j);
            if (!a.equals(j)) {
                return C2348w0.m5100k(view, a);
            }
        }
        return w0Var;
    }

    /* renamed from: c */
    public static boolean m5188c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C2384s.f5661d;
        C2384s sVar = (C2384s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new C2384s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f5662a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C2384s.f5661d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f5662a == null) {
                        sVar.f5662a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C2384s.f5661d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f5662a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f5662a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a = sVar.mo8992a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f5663b == null) {
                    sVar.f5663b = new SparseArray<>();
                }
                sVar.f5663b.put(keyCode, new WeakReference(a));
            }
        }
        return a != null;
    }

    /* renamed from: d */
    public static C2273a m5189d(View view) {
        View.AccessibilityDelegate e = m5190e(view);
        if (e == null) {
            return null;
        }
        return e instanceof C2273a.C2274a ? ((C2273a.C2274a) e).f5534a : new C2273a(e);
    }

    /* renamed from: e */
    public static View.AccessibilityDelegate m5190e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2379n.m5314a(view);
        }
        if (f5648c) {
            return null;
        }
        if (f5647b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5647b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5648c = true;
                return null;
            }
        }
        try {
            Object obj = f5647b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5648c = true;
            return null;
        }
    }

    /* renamed from: f */
    public static ArrayList m5191f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static String[] m5192g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? C2381p.m5321a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: h */
    public static C2290c1 m5193h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C2380o.m5319b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 30) {
                    return new C2290c1(window, view);
                }
                WindowInsetsController a = window.getInsetsController();
                if (a != null) {
                    return new C2290c1(a);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m5194i(View view) {
        Object obj;
        Class<Boolean> cls = Boolean.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = Boolean.valueOf(C2378m.m5307c(view));
        } else {
            obj = view.getTag(R.id.tag_accessibility_heading);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool = (Boolean) obj;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: j */
    public static void m5195j(int i, View view) {
        Object obj;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            Class<CharSequence> cls = CharSequence.class;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            boolean z2 = false;
            Object obj2 = null;
            if (i2 >= 28) {
                obj = C2378m.m5306b(view);
            } else {
                Object tag = view.getTag(R.id.tag_accessibility_pane_title);
                obj = cls.isInstance(tag) ? tag : null;
            }
            boolean z3 = ((CharSequence) obj) != null && view.getVisibility() == 0;
            int i3 = 32;
            if (C2371g.m5244a(view) != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z3) {
                    i3 = RecyclerView.C3084b0.FLAG_MOVED;
                }
                obtain.setEventType(i3);
                C2371g.m5250g(obtain, i);
                if (z3) {
                    List<CharSequence> text = obtain.getText();
                    Class<CharSequence> cls2 = CharSequence.class;
                    if (i2 >= 28) {
                        z2 = true;
                    }
                    if (z2) {
                        obj2 = C2378m.m5306b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (cls2.isInstance(tag2)) {
                            obj2 = tag2;
                        }
                    }
                    text.add((CharSequence) obj2);
                    if (C2368d.m5213c(view) == 0) {
                        C2368d.m5229s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (C2368d.m5213c((View) parent) == 4) {
                            C2368d.m5229s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C2371g.m5250g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                List<CharSequence> text2 = obtain2.getText();
                Class<CharSequence> cls3 = CharSequence.class;
                if (i2 < 28) {
                    z = false;
                }
                if (z) {
                    obj2 = C2378m.m5306b(view);
                } else {
                    Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                    if (cls3.isInstance(tag3)) {
                        obj2 = tag3;
                    }
                }
                text2.add((CharSequence) obj2);
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C2371g.m5248e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: k */
    public static C2348w0 m5196k(View view, C2348w0 w0Var) {
        WindowInsets j = w0Var.mo8951j();
        if (j != null) {
            WindowInsets b = C2372h.m5252b(view, j);
            if (!b.equals(j)) {
                return C2348w0.m5100k(view, b);
            }
        }
        return w0Var;
    }

    /* renamed from: l */
    public static C2282c m5197l(View view, C2282c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C2381p.m5322b(view, cVar);
        }
        C2327r rVar = (C2327r) view.getTag(R.id.tag_on_receive_content_listener);
        if (rVar != null) {
            C2282c a = rVar.mo8916a(view, cVar);
            if (a == null) {
                return null;
            }
            return (view instanceof C2329s ? (C2329s) view : f5650e).onReceiveContent(a);
        }
        return (view instanceof C2329s ? (C2329s) view : f5650e).onReceiveContent(cVar);
    }

    /* renamed from: m */
    public static void m5198m(int i, View view) {
        ArrayList f = m5191f(view);
        for (int i2 = 0; i2 < f.size(); i2++) {
            if (((C6689b.C6690a) f.get(i2)).mo18875a() == i) {
                f.remove(i2);
                return;
            }
        }
    }

    /* renamed from: n */
    public static void m5199n(View view, C6689b.C6690a aVar, C6697d dVar) {
        if (dVar == null) {
            m5198m(aVar.mo18875a(), view);
            m5195j(0, view);
            return;
        }
        C6689b.C6690a aVar2 = new C6689b.C6690a((Object) null, aVar.f14779b, (CharSequence) null, dVar, aVar.f14780c);
        C2273a d = m5189d(view);
        if (d == null) {
            d = new C2273a();
        }
        m5201p(view, d);
        m5198m(aVar2.mo18875a(), view);
        m5191f(view).add(aVar2);
        m5195j(0, view);
    }

    /* renamed from: o */
    public static void m5200o(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2379n.m5316c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: p */
    public static void m5201p(View view, C2273a aVar) {
        if (aVar == null && (m5190e(view) instanceof C2273a.C2274a)) {
            aVar = new C2273a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    /* renamed from: q */
    public static void m5202q(View view, CharSequence charSequence) {
        new C2335v(CharSequence.class).mo8988e(view, charSequence);
        if (charSequence != null) {
            C2365a aVar = f5651f;
            aVar.f5652b.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (C2371g.m5245b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        C2365a aVar2 = f5651f;
        aVar2.f5652b.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        C2368d.m5225o(view.getViewTreeObserver(), aVar2);
    }

    /* renamed from: r */
    public static void m5203r(View view, C0753p pVar) {
        C2336v0.C2344d.C2345a aVar = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (pVar != null) {
                aVar = new C2336v0.C2344d.C2345a(pVar);
            }
            view.setWindowInsetsAnimationCallback(aVar);
            return;
        }
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (pVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        C2336v0.C2339c.C2340a aVar2 = new C2336v0.C2339c.C2340a(view, pVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar2);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(aVar2);
        }
    }
}
