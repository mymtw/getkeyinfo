package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2315l;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import com.etsy.android.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.logging.type.LogSeverity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p075d.C6614a;
import p088e1.C6689b;
import p610kp.C18161c;
import p629nk.C18268a;
import p638ok.C18308a;
import p638ok.C18310b;
import p638ok.C18312d;
import p638ok.C18313e;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C2244b {
    private static final int DEF_STYLE_RES = 2132018403;
    private static final int INVALID_SCROLL_RANGE = -1;
    public static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    public static final int PENDING_ACTION_COLLAPSED = 2;
    public static final int PENDING_ACTION_EXPANDED = 1;
    public static final int PENDING_ACTION_FORCE = 8;
    public static final int PENDING_ACTION_NONE = 0;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private ValueAnimator elevationOverlayAnimator;
    private boolean haveChildWithInterpolator;
    private C2348w0 lastInsets;
    private boolean liftOnScroll;
    /* access modifiers changed from: private */
    public final List<C15184f> liftOnScrollListeners;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<C15181c> listeners;
    private int pendingAction;
    /* access modifiers changed from: private */
    public Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public static class BaseBehavior<T extends AppBarLayout> extends C18308a<T> {

        /* renamed from: j */
        public int f34065j;

        /* renamed from: k */
        public int f34066k;

        /* renamed from: l */
        public ValueAnimator f34067l;

        /* renamed from: m */
        public SavedState f34068m;

        /* renamed from: n */
        public WeakReference<View> f34069n;

        public BaseBehavior() {
        }

        /* renamed from: k */
        public static View m24733k(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C2315l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m24734p(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                r0 = 1
                if (r4 == 0) goto L_0x005f
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.getScrollFlags()
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005f
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r3 = androidx.core.view.C2364y.f5646a
                int r3 = androidx.core.view.C2364y.C2368d.m5214d(r4)
                if (r9 <= 0) goto L_0x004c
                r9 = r1 & 12
                if (r9 == 0) goto L_0x004c
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L_0x005f
                goto L_0x005d
            L_0x004c:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x005f
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L_0x005f
            L_0x005d:
                r8 = r0
                goto L_0x0060
            L_0x005f:
                r8 = r2
            L_0x0060:
                boolean r9 = r7.isLiftOnScroll()
                if (r9 == 0) goto L_0x006e
                android.view.View r8 = m24733k(r6)
                boolean r8 = r7.shouldLift(r8)
            L_0x006e:
                boolean r8 = r7.setLiftedState(r8)
                if (r10 != 0) goto L_0x00a2
                if (r8 == 0) goto L_0x00a5
                java.util.List r6 = r6.getDependents(r7)
                int r8 = r6.size()
                r9 = r2
            L_0x007f:
                if (r9 >= r8) goto L_0x00a0
                java.lang.Object r10 = r6.get(r9)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.getBehavior()
                boolean r1 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x009d
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r6 = r10.f40200f
                if (r6 == 0) goto L_0x00a0
                r2 = r0
                goto L_0x00a0
            L_0x009d:
                int r9 = r9 + 1
                goto L_0x007f
            L_0x00a0:
                if (r2 == 0) goto L_0x00a5
            L_0x00a2:
                r7.jumpDrawablesToCurrentState()
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m24734p(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: c */
        public final boolean mo52933c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f34069n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
        }

        /* renamed from: d */
        public final int mo52934d(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* renamed from: e */
        public final int mo52935e(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* renamed from: f */
        public final int mo52936f() {
            return mo69849a() + this.f34065j;
        }

        /* renamed from: g */
        public final void mo52937g(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            mo52941n(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.setLiftedState(appBarLayout.shouldLift(m24733k(coordinatorLayout)));
            }
        }

        /* renamed from: h */
        public final int mo52938h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i6 = i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int f = mo52936f();
            int i7 = 0;
            if (i6 == 0 || f < i6 || f > i3) {
                this.f34065j = 0;
            } else {
                int A = C19543e0.m33285A(i, i2, i3);
                if (f != A) {
                    if (appBarLayout.hasChildWithInterpolator()) {
                        int abs = Math.abs(A);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (scrollInterpolator != null) {
                                int scrollFlags = layoutParams.getScrollFlags();
                                if ((scrollFlags & 1) != 0) {
                                    i5 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
                                    if ((scrollFlags & 2) != 0) {
                                        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                                        i5 -= C2364y.C2368d.m5214d(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                                if (C2364y.C2368d.m5212b(childAt)) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f2 = (float) i5;
                                    i4 = (childAt.getTop() + Math.round(scrollInterpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2) * f2)) * Integer.signum(A);
                                }
                            }
                        }
                    }
                    i4 = A;
                    C18312d dVar = this.f40201a;
                    if (dVar != null) {
                        z = dVar.mo69851b(i4);
                    } else {
                        this.f40202b = i4;
                        z = false;
                    }
                    int i9 = f - A;
                    this.f34065j = A - i4;
                    int i10 = 1;
                    if (z) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i11).getLayoutParams();
                            C15182d scrollEffect = layoutParams2.getScrollEffect();
                            if (!(scrollEffect == null || (layoutParams2.getScrollFlags() & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                C15183e eVar = (C15183e) scrollEffect;
                                Rect rect = eVar.f34073a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) eVar.f34073a.top) - Math.abs((float) mo69849a());
                                float f3 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / ((float) eVar.f34073a.height()));
                                    if (abs3 >= 0.0f) {
                                        f3 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f4 = 1.0f - f3;
                                    float height = (-abs2) - ((((float) eVar.f34073a.height()) * 0.3f) * (1.0f - (f4 * f4)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(eVar.f34074b);
                                    eVar.f34074b.offset(0, (int) (-height));
                                    Rect rect2 = eVar.f34074b;
                                    WeakHashMap<View, C2330s0> weakHashMap3 = C2364y.f5646a;
                                    C2364y.C2370f.m5243c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, C2330s0> weakHashMap4 = C2364y.f5646a;
                                    C2364y.C2370f.m5243c(childAt2, (Rect) null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!z && appBarLayout.hasChildWithInterpolator()) {
                        coordinatorLayout2.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.onOffsetChanged(mo69849a());
                    if (A < f) {
                        i10 = -1;
                    }
                    m24734p(coordinatorLayout2, appBarLayout, A, i10, false);
                    i7 = i9;
                }
            }
            mo52942o(coordinatorLayout2, appBarLayout);
            return i7;
        }

        /* renamed from: j */
        public final void mo52939j(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(mo52936f() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int f = mo52936f();
            if (f == i) {
                ValueAnimator valueAnimator = this.f34067l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f34067l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f34067l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f34067l = valueAnimator3;
                valueAnimator3.setInterpolator(C18268a.f40095e);
                this.f34067l.addUpdateListener(new C15189a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f34067l.setDuration((long) Math.min(round, LogSeverity.CRITICAL_VALUE));
            this.f34067l.setIntValues(new int[]{f, i});
            this.f34067l.start();
        }

        /* renamed from: l */
        public final void mo52940l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i2 = 0;
                }
                int i4 = i3;
                int i5 = i2;
                if (i4 != i5) {
                    iArr[1] = mo52938h(coordinatorLayout, appBarLayout, mo52936f() - i, i4, i5);
                }
            }
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
            if ((r4.hasScrollableChildren() && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L_0x0028;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo38331m(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L_0x0027
                boolean r6 = r4.isLiftOnScroll()
                if (r6 != 0) goto L_0x0028
                boolean r6 = r4.hasScrollableChildren()
                if (r6 == 0) goto L_0x0023
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L_0x0023
                r3 = r0
                goto L_0x0024
            L_0x0023:
                r3 = r1
            L_0x0024:
                if (r3 == 0) goto L_0x0027
                goto L_0x0028
            L_0x0027:
                r0 = r1
            L_0x0028:
                if (r0 == 0) goto L_0x0031
                android.animation.ValueAnimator r3 = r2.f34067l
                if (r3 == 0) goto L_0x0031
                r3.cancel()
            L_0x0031:
                r3 = 0
                r2.f34069n = r3
                r2.f34066k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo38331m(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        /* renamed from: n */
        public final void mo52941n(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            int f = mo52936f();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.getScrollFlags() & 32) == 32) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i2 = -f;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int scrollFlags = layoutParams2.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i3 = -childAt2.getTop();
                    int i4 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i4 += t.getPaddingTop() + t.getTopInset();
                    }
                    if ((scrollFlags & 2) == 2) {
                        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                        i4 += C2364y.C2368d.m5214d(childAt2);
                    } else {
                        if ((scrollFlags & 5) == 5) {
                            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                            int d = C2364y.C2368d.m5214d(childAt2) + i4;
                            if (f < d) {
                                i3 = d;
                            } else {
                                i4 = d;
                            }
                        }
                    }
                    if ((scrollFlags & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i3 += layoutParams2.topMargin;
                        i4 -= layoutParams2.bottomMargin;
                    }
                    if (f < (i4 + i3) / 2) {
                        i3 = i4;
                    }
                    mo52939j(coordinatorLayout, t, C19543e0.m33285A(i3, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* renamed from: o */
        public final void mo52942o(CoordinatorLayout coordinatorLayout, T t) {
            C6689b.C6690a aVar = C6689b.C6690a.f14768k;
            C2364y.m5198m(aVar.mo18875a(), coordinatorLayout);
            C2364y.m5195j(0, coordinatorLayout);
            C6689b.C6690a aVar2 = C6689b.C6690a.f14769l;
            C2364y.m5198m(aVar2.mo18875a(), coordinatorLayout);
            C2364y.m5195j(0, coordinatorLayout);
            View k = m24733k(coordinatorLayout);
            if (k != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.LayoutParams) k.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior)) {
                if (mo52936f() != (-t.getTotalScrollRange()) && k.canScrollVertically(1)) {
                    C2364y.m5199n(coordinatorLayout, aVar, new C15191c(t, false));
                }
                if (mo52936f() == 0) {
                    return;
                }
                if (k.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C2364y.m5199n(coordinatorLayout, aVar2, new C15190b(this, coordinatorLayout, t, k, i));
                        return;
                    }
                    return;
                }
                C2364y.m5199n(coordinatorLayout, aVar2, new C15191c(t, true));
            }
        }

        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f34068m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            mo52939j(coordinatorLayout, appBarLayout, i3);
                        } else {
                            mo69846i(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            mo52939j(coordinatorLayout, appBarLayout, 0);
                        } else {
                            mo69846i(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                mo69846i(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(savedState.firstVisibleChildIndex);
                int i4 = -childAt.getBottom();
                if (this.f34068m.firstVisibleChildAtMinimumHeight) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    i2 = appBarLayout.getTopInset() + C2364y.C2368d.m5214d(childAt) + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f34068m.firstVisibleChildPercentageShown) + i4;
                }
                mo69846i(coordinatorLayout, appBarLayout, i2);
            }
            appBarLayout.resetPendingAction();
            this.f34068m = null;
            int A = C19543e0.m33285A(mo69849a(), -appBarLayout.getTotalScrollRange(), 0);
            C18312d dVar = this.f40201a;
            if (dVar != null) {
                dVar.mo69851b(A);
            } else {
                this.f40202b = A;
            }
            m24734p(coordinatorLayout, appBarLayout, mo69849a(), 0, true);
            appBarLayout.onOffsetChanged(mo69849a());
            mo52942o(coordinatorLayout, appBarLayout);
            return true;
        }

        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            mo52940l(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = mo52938h(coordinatorLayout2, appBarLayout2, mo52936f() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                mo52942o(coordinatorLayout, appBarLayout);
            }
        }

        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                this.f34068m = savedState;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.getSuperState());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.f34068m = null;
        }

        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            int a = mo69849a();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + a;
                if (childAt.getTop() + a > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.fullyScrolled = (-mo69849a()) >= appBarLayout.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    if (bottom == appBarLayout.getTopInset() + C2364y.C2368d.m5214d(childAt)) {
                        z = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = z;
                    savedState.firstVisibleChildPercentageShown = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return mo38331m(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f34066k == 0 || i == 1) {
                mo52941n(coordinatorLayout, appBarLayout);
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view2));
                }
            }
            this.f34069n = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C15178a();
            public boolean firstVisibleChildAtMinimumHeight;
            public int firstVisibleChildIndex;
            public float firstVisibleChildPercentageShown;
            public boolean fullyScrolled;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public static class C15178a implements Parcelable.ClassLoaderCreator<SavedState> {
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

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.fullyScrolled = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() == 0 ? false : z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C18310b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: c */
        public final AppBarLayout mo52953c(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final float mo52954d(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.C2245c behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                int f = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).mo52936f() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + f > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) f) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: e */
        public final int mo52955e(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i;
            CoordinatorLayout.C2245c behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f34065j + this.f40199e;
                if (this.f40200f == 0) {
                    i = 0;
                } else {
                    float d = mo52954d(view2);
                    int i2 = this.f40200f;
                    i = C19543e0.m33285A((int) (d * ((float) i2)), 0, i2);
                }
                int i3 = bottom - i;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                view.offsetTopAndBottom(i3);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
            return false;
        }

        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C2364y.m5198m(C6689b.C6690a.f14768k.mo18875a(), coordinatorLayout);
                C2364y.m5195j(0, coordinatorLayout);
                C2364y.m5198m(C6689b.C6690a.f14769l.mo18875a(), coordinatorLayout);
                C2364y.m5195j(0, coordinatorLayout);
            }
        }

        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f40197c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayout.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39679W);
            this.f40200f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C15179a implements C2325q {
        public C15179a() {
        }

        /* renamed from: b */
        public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
            return AppBarLayout.this.onWindowInsetChanged(w0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public class C15180b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ MaterialShapeDrawable f34071a;

        public C15180b(MaterialShapeDrawable materialShapeDrawable) {
            this.f34071a = materialShapeDrawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f34071a.setElevation(floatValue);
            if (AppBarLayout.this.statusBarForeground instanceof MaterialShapeDrawable) {
                ((MaterialShapeDrawable) AppBarLayout.this.statusBarForeground).setElevation(floatValue);
            }
            for (C15184f a : AppBarLayout.this.liftOnScrollListeners) {
                this.f34071a.getResolvedTintColor();
                a.mo52958a();
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C15181c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo52957a(int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static abstract class C15182d {
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public static class C15183e extends C15182d {

        /* renamed from: a */
        public final Rect f34073a = new Rect();

        /* renamed from: b */
        public final Rect f34074b = new Rect();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    public interface C15184f {
        /* renamed from: a */
        void mo52958a();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    public interface C15185g extends C15181c<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private View findLiftOnScrollTargetView(View view) {
        int i;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (findViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void invalidateScrollRanges() {
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
    }

    private boolean setLiftableState(boolean z) {
        if (this.liftable == z) {
            return false;
        }
        this.liftable = z;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return !C2364y.C2368d.m5212b(childAt);
    }

    private void startLiftOnScrollElevationOverlayAnimation(MaterialShapeDrawable materialShapeDrawable, boolean z) {
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.elevationOverlayAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.elevationOverlayAnimator = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.elevationOverlayAnimator.setInterpolator(C18268a.f40091a);
        this.elevationOverlayAnimator.addUpdateListener(new C15180b(materialShapeDrawable));
        this.elevationOverlayAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(C15184f fVar) {
        this.liftOnScrollListeners.add(fVar);
    }

    public void addOnOffsetChangedListener(C15181c cVar) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (cVar != null && !this.listeners.contains(cVar)) {
            this.listeners.add(cVar);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.currentOffset));
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public CoordinatorLayout.C2245c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.downPreScrollRange
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0060
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.scrollFlags
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x005a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0036
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r4 = androidx.core.view.C2364y.f5646a
            int r4 = androidx.core.view.C2364y.C2368d.m5214d(r3)
        L_0x0034:
            int r4 = r4 + r7
            goto L_0x0045
        L_0x0036:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x0043
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r4 = androidx.core.view.C2364y.f5646a
            int r4 = androidx.core.view.C2364y.C2368d.m5214d(r3)
            int r4 = r5 - r4
            goto L_0x0034
        L_0x0043:
            int r4 = r7 + r5
        L_0x0045:
            if (r0 != 0) goto L_0x0058
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r6 = androidx.core.view.C2364y.f5646a
            boolean r3 = androidx.core.view.C2364y.C2368d.m5212b(r3)
            if (r3 == 0) goto L_0x0058
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0058:
            int r2 = r2 + r4
            goto L_0x005d
        L_0x005a:
            if (r2 <= 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0060:
            int r0 = java.lang.Math.max(r1, r2)
            r9.downPreScrollRange = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.downScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = layoutParams.topMargin + layoutParams.bottomMargin + childAt.getMeasuredHeight();
            int i4 = layoutParams.scrollFlags;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                i3 -= C2364y.C2368d.m5214d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.downScrollRange = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int d = C2364y.C2368d.m5214d(this);
        if (d == 0) {
            int childCount = getChildCount();
            d = childCount >= 1 ? C2364y.C2368d.m5214d(getChildAt(childCount - 1)) : 0;
            if (d == 0) {
                return getHeight() / 3;
            }
        }
        return (d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C2348w0 w0Var = this.lastInsets;
        if (w0Var != null) {
            return w0Var.mo8948g();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.scrollFlags;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + i3;
            if (i2 == 0) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2368d.m5212b(childAt)) {
                    i5 -= getTopInset();
                }
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                i3 -= C2364y.C2368d.m5214d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.totalScrollRange = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19543e0.m33316i0(this);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.liftable;
        iArr[0] = z ? R.attr.state_liftable : -2130969925;
        iArr[1] = (!z || !this.lifted) ? -2130969926 : R.attr.state_lifted;
        iArr[2] = z ? R.attr.state_collapsible : -2130969923;
        iArr[3] = (!z || !this.lifted) ? -2130969922 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean z2 = true;
        if (C2364y.C2368d.m5212b(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.liftableOverride) {
            if (!this.liftOnScroll && !hasCollapsibleChild()) {
                z2 = false;
            }
            setLiftableState(z2);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2368d.m5212b(this) && shouldOffsetFirstChild()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C19543e0.m33285A(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        invalidateScrollRanges();
    }

    public void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
        List<C15181c> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C15181c cVar = this.listeners.get(i2);
                if (cVar != null) {
                    cVar.mo52957a(i);
                }
            }
        }
    }

    public C2348w0 onWindowInsetChanged(C2348w0 w0Var) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2348w0 w0Var2 = C2364y.C2368d.m5212b(this) ? w0Var : null;
        if (!Objects.equals(this.lastInsets, w0Var2)) {
            this.lastInsets = w0Var2;
            updateWillNotDraw();
            requestLayout();
        }
        return w0Var;
    }

    public boolean removeLiftOnScrollListener(C15184f fVar) {
        return this.liftOnScrollListeners.remove(fVar);
    }

    public void removeOnOffsetChangedListener(C15181c cVar) {
        List<C15181c> list = this.listeners;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C19543e0.m33315h0(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        setExpanded(z, C2364y.C2371g.m5246c(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.liftOnScrollTargetViewId = i;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z) {
        this.liftableOverride = true;
        return setLiftableState(z);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.liftableOverride = z;
    }

    public boolean setLifted(boolean z) {
        return setLiftedState(z, true);
    }

    public boolean setLiftedState(boolean z) {
        return setLiftedState(z, !this.liftableOverride);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarForeground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                Drawable drawable4 = this.statusBarForeground;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                drawable4.setLayoutDirection(C2364y.C2369e.m5233d(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C6614a.m12981a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C18313e.m30944a(f, this);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean shouldLift(View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public boolean setLiftedState(boolean z, boolean z2) {
        if (!z2 || this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!this.liftOnScroll || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        startLiftOnScrollElevationOverlayAnimation((MaterialShapeDrawable) getBackground(), z);
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r12 = p574gl.C17790a.m29918a(r12, r13, r14, r6)
            r11.<init>(r12, r13, r14)
            r12 = -1
            r11.totalScrollRange = r12
            r11.downPreScrollRange = r12
            r11.downScrollRange = r12
            r7 = 0
            r11.pendingAction = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.liftOnScrollListeners = r0
            android.content.Context r8 = r11.getContext()
            r9 = 1
            r11.setOrientation(r9)
            android.view.ViewOutlineProvider r0 = r11.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r11.setOutlineProvider(r0)
        L_0x002f:
            android.content.Context r10 = r11.getContext()
            int[] r2 = p638ok.C18313e.f40207a
            int[] r5 = new int[r7]
            r0 = r10
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.hasValue(r7)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x0050
            int r1 = r0.getResourceId(r7, r7)     // Catch:{ all -> 0x00e6 }
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r10, r1)     // Catch:{ all -> 0x00e6 }
            r11.setStateListAnimator(r1)     // Catch:{ all -> 0x00e6 }
        L_0x0050:
            r0.recycle()
            int[] r2 = p610kp.C18161c.f39684c
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r13
            r3 = r14
            r4 = r6
            android.content.res.TypedArray r13 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r13.getDrawable(r7)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r0 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5227q(r11, r14)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x008c
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.setFillColor(r14)
            r0.initializeElevationOverlay(r8)
            androidx.core.view.C2364y.C2368d.m5227q(r11, r0)
        L_0x008c:
            r14 = 4
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x009a
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setExpanded(r14, r7, r7)
        L_0x009a:
            r14 = 3
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x00a9
            int r14 = r13.getDimensionPixelSize(r14, r7)
            float r14 = (float) r14
            p638ok.C18313e.m30944a(r14, r11)
        L_0x00a9:
            r14 = 2
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x00b7
            boolean r14 = r13.getBoolean(r14, r7)
            r11.setKeyboardNavigationCluster(r14)
        L_0x00b7:
            boolean r14 = r13.hasValue(r9)
            if (r14 == 0) goto L_0x00c4
            boolean r14 = r13.getBoolean(r9, r7)
            r11.setTouchscreenBlocksFocus(r14)
        L_0x00c4:
            r14 = 5
            boolean r14 = r13.getBoolean(r14, r7)
            r11.liftOnScroll = r14
            r14 = 6
            int r12 = r13.getResourceId(r14, r12)
            r11.liftOnScrollTargetViewId = r12
            r12 = 7
            android.graphics.drawable.Drawable r12 = r13.getDrawable(r12)
            r11.setStatusBarForeground(r12)
            r13.recycle()
            com.google.android.material.appbar.AppBarLayout$a r12 = new com.google.android.material.appbar.AppBarLayout$a
            r12.<init>()
            androidx.core.view.C2364y.C2373i.m5274u(r11, r12)
            return
        L_0x00e6:
            r12 = move-exception
            r0.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(C15185g gVar) {
        removeOnOffsetChangedListener((C15181c) gVar);
    }

    public void setExpanded(boolean z, boolean z2) {
        setExpanded(z, z2, true);
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.pendingAction = i2 | i;
        requestLayout();
    }

    public void addOnOffsetChangedListener(C15185g gVar) {
        addOnOffsetChangedListener((C15181c) gVar);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public static final int COLLAPSIBLE_FLAGS = 10;
        public static final int FLAG_QUICK_RETURN = 5;
        public static final int FLAG_SNAP = 17;
        private static final int SCROLL_EFFECT_COMPRESS = 1;
        private static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private C15182d scrollEffect;
        public int scrollFlags = 1;
        public Interpolator scrollInterpolator;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39685d);
            this.scrollFlags = obtainStyledAttributes.getInt(1, 0);
            setScrollEffect(createScrollEffectFromInt(obtainStyledAttributes.getInt(0, 0)));
            if (obtainStyledAttributes.hasValue(2)) {
                this.scrollInterpolator = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private C15182d createScrollEffectFromInt(int i) {
            if (i != 1) {
                return null;
            }
            return new C15183e();
        }

        public C15182d getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i = this.scrollFlags;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void setScrollEffect(C15182d dVar) {
            this.scrollEffect = dVar;
        }

        public void setScrollFlags(int i) {
            this.scrollFlags = i;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }
}
