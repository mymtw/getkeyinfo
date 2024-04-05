package p123h1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p088e1.C6693c;
import p123h1.C6913b;

/* renamed from: h1.a */
public abstract class C6909a extends C2273a {

    /* renamed from: k */
    public static final Rect f15289k = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l */
    public static final C6910a f15290l = new C6910a();

    /* renamed from: m */
    public static final C6911b f15291m = new C6911b();

    /* renamed from: a */
    public final Rect f15292a = new Rect();

    /* renamed from: b */
    public final Rect f15293b = new Rect();

    /* renamed from: c */
    public final Rect f15294c = new Rect();

    /* renamed from: d */
    public final int[] f15295d = new int[2];

    /* renamed from: e */
    public final AccessibilityManager f15296e;

    /* renamed from: f */
    public final View f15297f;

    /* renamed from: g */
    public C6912c f15298g;

    /* renamed from: h */
    public int f15299h = Integer.MIN_VALUE;

    /* renamed from: i */
    public int f15300i = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f15301j = Integer.MIN_VALUE;

    /* renamed from: h1.a$a */
    public class C6910a implements C6913b.C6914a<C6689b> {
    }

    /* renamed from: h1.a$b */
    public class C6911b {
    }

    /* renamed from: h1.a$c */
    public class C6912c extends C6693c {
        public C6912c() {
        }

        /* renamed from: a */
        public final C6689b mo18879a(int i) {
            return new C6689b(AccessibilityNodeInfo.obtain(C6909a.this.mo19031i(i).f14759a));
        }

        /* renamed from: b */
        public final C6689b mo18880b(int i) {
            int i2 = i == 2 ? C6909a.this.f15299h : C6909a.this.f15300i;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo18879a(i2);
        }

        /* renamed from: c */
        public final boolean mo18881c(int i, int i2, Bundle bundle) {
            int i3;
            C6909a aVar = C6909a.this;
            if (i != -1) {
                boolean z = true;
                if (i2 == 1) {
                    return aVar.mo19036n(i);
                }
                if (i2 == 2) {
                    return aVar.mo19023a(i);
                }
                if (i2 != 64) {
                    if (i2 != 128) {
                        return aVar.mo19032j(i, i2, bundle);
                    }
                    if (aVar.f15299h == i) {
                        aVar.f15299h = Integer.MIN_VALUE;
                        aVar.f15297f.invalidate();
                        aVar.mo19037o(i, 65536);
                        return z;
                    }
                } else if (aVar.f15296e.isEnabled() && aVar.f15296e.isTouchExplorationEnabled() && (i3 = aVar.f15299h) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        aVar.f15299h = Integer.MIN_VALUE;
                        aVar.f15297f.invalidate();
                        aVar.mo19037o(i3, 65536);
                    }
                    aVar.f15299h = i;
                    aVar.f15297f.invalidate();
                    aVar.mo19037o(i, 32768);
                    return z;
                }
                z = false;
                return z;
            }
            View view = aVar.f15297f;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            return C2364y.C2368d.m5220j(view, i2, bundle);
        }
    }

    public C6909a(View view) {
        if (view != null) {
            this.f15297f = view;
            this.f15296e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2368d.m5213c(view) == 0) {
                C2364y.C2368d.m5229s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: a */
    public final boolean mo19023a(int i) {
        if (this.f15300i != i) {
            return false;
        }
        this.f15300i = Integer.MIN_VALUE;
        mo19035m(i, false);
        mo19037o(i, 8);
        return true;
    }

    /* renamed from: b */
    public final AccessibilityEvent mo19024b(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            C6689b i3 = mo19031i(i);
            obtain.getText().add(i3.mo18858h());
            obtain.setContentDescription(i3.mo18856f());
            obtain.setScrollable(i3.f14759a.isScrollable());
            obtain.setPassword(i3.f14759a.isPassword());
            obtain.setEnabled(i3.f14759a.isEnabled());
            obtain.setChecked(i3.f14759a.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(i3.f14759a.getClassName());
                obtain.setSource(this.f15297f, i);
                obtain.setPackageName(this.f15297f.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.f15297f.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    /* renamed from: c */
    public final C6689b mo19025c(int i) {
        C6689b j = C6689b.m13056j();
        j.f14759a.setEnabled(true);
        j.f14759a.setFocusable(true);
        j.mo18867q("android.view.View");
        Rect rect = f15289k;
        j.mo18864n(rect);
        j.f14759a.setBoundsInScreen(rect);
        View view = this.f15297f;
        j.f14760b = -1;
        j.f14759a.setParent(view);
        mo19034l(i, j);
        if (j.mo18858h() == null && j.mo18856f() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        j.mo18854e(this.f15293b);
        if (!this.f15293b.equals(rect)) {
            int actions = j.f14759a.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                j.f14759a.setPackageName(this.f15297f.getContext().getPackageName());
                View view2 = this.f15297f;
                j.f14761c = i;
                j.f14759a.setSource(view2, i);
                boolean z = false;
                if (this.f15299h == i) {
                    j.mo18863m(true);
                    j.mo18850a(128);
                } else {
                    j.mo18863m(false);
                    j.mo18850a(64);
                }
                boolean z2 = this.f15300i == i;
                if (z2) {
                    j.mo18850a(2);
                } else if (j.f14759a.isFocusable()) {
                    j.mo18850a(1);
                }
                j.f14759a.setFocused(z2);
                this.f15297f.getLocationOnScreen(this.f15295d);
                j.f14759a.getBoundsInScreen(this.f15292a);
                if (this.f15292a.equals(rect)) {
                    j.mo18854e(this.f15292a);
                    if (j.f14760b != -1) {
                        C6689b j2 = C6689b.m13056j();
                        for (int i2 = j.f14760b; i2 != -1; i2 = j2.f14760b) {
                            View view3 = this.f15297f;
                            j2.f14760b = -1;
                            j2.f14759a.setParent(view3, -1);
                            j2.mo18864n(f15289k);
                            mo19034l(i2, j2);
                            j2.mo18854e(this.f15293b);
                            Rect rect2 = this.f15292a;
                            Rect rect3 = this.f15293b;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        j2.mo18861k();
                    }
                    this.f15292a.offset(this.f15295d[0] - this.f15297f.getScrollX(), this.f15295d[1] - this.f15297f.getScrollY());
                }
                if (this.f15297f.getLocalVisibleRect(this.f15294c)) {
                    this.f15294c.offset(this.f15295d[0] - this.f15297f.getScrollX(), this.f15295d[1] - this.f15297f.getScrollY());
                    if (this.f15292a.intersect(this.f15294c)) {
                        j.f14759a.setBoundsInScreen(this.f15292a);
                        Rect rect4 = this.f15292a;
                        if (rect4 != null && !rect4.isEmpty() && this.f15297f.getWindowVisibility() == 0) {
                            ViewParent parent = this.f15297f.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            j.f14759a.setVisibleToUser(true);
                        }
                    }
                }
                return j;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: d */
    public final boolean mo19026d(MotionEvent motionEvent) {
        int i;
        if (!this.f15296e.isEnabled() || !this.f15296e.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int e = mo19027e(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f15301j;
            if (i2 != e) {
                this.f15301j = e;
                mo19037o(e, 128);
                mo19037o(i2, 256);
            }
            return e != Integer.MIN_VALUE;
        } else if (action != 10 || (i = this.f15301j) == Integer.MIN_VALUE) {
            return false;
        } else {
            if (i != Integer.MIN_VALUE) {
                this.f15301j = Integer.MIN_VALUE;
                mo19037o(Integer.MIN_VALUE, 128);
                mo19037o(i, 256);
            }
            return true;
        }
    }

    /* renamed from: e */
    public abstract int mo19027e(float f, float f2);

    /* renamed from: f */
    public abstract void mo19028f(ArrayList arrayList);

    /* renamed from: g */
    public final void mo19029g(int i) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f15296e.isEnabled() && (parent = this.f15297f.getParent()) != null) {
            AccessibilityEvent b = mo19024b(i, RecyclerView.C3084b0.FLAG_MOVED);
            b.setContentChangeTypes(0);
            parent.requestSendAccessibilityEvent(this.f15297f, b);
        }
    }

    public final C6693c getAccessibilityNodeProvider(View view) {
        if (this.f15298g == null) {
            this.f15298g = new C6912c();
        }
        return this.f15298g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: e1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: e1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: e1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: e1.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013f, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0141;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19030h(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mo19028f(r3)
            o.j r4 = new o.j
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            e1.b r7 = r0.mo19025c(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.mo19994h(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f15300i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r3 != r6) goto L_0x0042
            r3 = r7
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r4.mo19993f(r3, r7)
            e1.b r3 = (p088e1.C6689b) r3
        L_0x0048:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0152
            if (r1 == r8) goto L_0x0152
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0068
            if (r1 == r12) goto L_0x0068
            if (r1 == r11) goto L_0x0068
            if (r1 != r8) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0068:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f15300i
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r6) goto L_0x007b
            e1.b r2 = r0.mo19031i(r15)
            r2.mo18854e(r14)
            goto L_0x00a8
        L_0x007b:
            if (r2 == 0) goto L_0x0081
            r14.set(r2)
            goto L_0x00a8
        L_0x0081:
            android.view.View r2 = r0.f15297f
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a5
            if (r1 == r12) goto L_0x00a1
            if (r1 == r11) goto L_0x009d
            if (r1 != r8) goto L_0x0097
            r14.set(r5, r9, r15, r9)
            goto L_0x00a8
        L_0x0097:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x009d:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a8
        L_0x00a1:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a8
        L_0x00a5:
            r14.set(r15, r5, r15, r2)
        L_0x00a8:
            h1.a$b r2 = f15291m
            h1.a$a r15 = f15290l
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r14)
            if (r1 == r13) goto L_0x00dc
            if (r1 == r12) goto L_0x00d3
            if (r1 == r11) goto L_0x00c9
            if (r1 != r8) goto L_0x00c3
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00c3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00c9:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r7, r5)
            goto L_0x00e4
        L_0x00d3:
            int r7 = r14.height()
            int r7 = r7 + r10
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00dc:
            int r7 = r14.width()
            int r7 = r7 + r10
            r6.offset(r7, r5)
        L_0x00e4:
            r2.getClass()
            int r2 = r4.mo19995i()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r8 = r5
            r16 = 0
        L_0x00f3:
            if (r8 >= r2) goto L_0x014e
            java.lang.Object r11 = r4.mo19996j(r8)
            e1.b r11 = (p088e1.C6689b) r11
            if (r11 != r3) goto L_0x00fe
            goto L_0x014b
        L_0x00fe:
            r15.getClass()
            r11.mo18854e(r7)
            boolean r12 = p123h1.C6913b.m13372c(r1, r14, r7)
            if (r12 != 0) goto L_0x010b
            goto L_0x0143
        L_0x010b:
            boolean r12 = p123h1.C6913b.m13372c(r1, r14, r6)
            if (r12 != 0) goto L_0x0112
            goto L_0x0141
        L_0x0112:
            boolean r12 = p123h1.C6913b.m13370a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0119
            goto L_0x0141
        L_0x0119:
            boolean r12 = p123h1.C6913b.m13370a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x0120
            goto L_0x0143
        L_0x0120:
            int r12 = p123h1.C6913b.m13373d(r1, r14, r7)
            int r13 = p123h1.C6913b.m13374e(r1, r14, r7)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = p123h1.C6913b.m13373d(r1, r14, r6)
            int r17 = p123h1.C6913b.m13374e(r1, r14, r6)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0143
        L_0x0141:
            r12 = r10
            goto L_0x0144
        L_0x0143:
            r12 = r5
        L_0x0144:
            if (r12 == 0) goto L_0x014b
            r6.set(r7)
            r16 = r11
        L_0x014b:
            int r8 = r8 + 1
            goto L_0x00f3
        L_0x014e:
            r1 = r16
            goto L_0x01bf
        L_0x0152:
            android.view.View r2 = r0.f15297f
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r6 = androidx.core.view.C2364y.f5646a
            int r2 = androidx.core.view.C2364y.C2369e.m5233d(r2)
            if (r2 != r10) goto L_0x015e
            r2 = r10
            goto L_0x015f
        L_0x015e:
            r2 = r5
        L_0x015f:
            h1.a$b r6 = f15291m
            h1.a$a r7 = f15290l
            r6.getClass()
            int r6 = r4.mo19995i()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x0170:
            if (r12 >= r6) goto L_0x017e
            java.lang.Object r13 = r4.mo19996j(r12)
            e1.b r13 = (p088e1.C6689b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0170
        L_0x017e:
            h1.b$b r6 = new h1.b$b
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01a6
            if (r1 != r8) goto L_0x019e
            int r1 = r11.size()
            if (r3 != 0) goto L_0x0192
            r2 = r9
            goto L_0x0196
        L_0x0192:
            int r2 = r11.lastIndexOf(r3)
        L_0x0196:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01b9
            java.lang.Object r7 = r11.get(r2)
            goto L_0x01ba
        L_0x019e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01a6:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01ad
            goto L_0x01b1
        L_0x01ad:
            int r1 = r11.indexOf(r3)
        L_0x01b1:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01b9
            java.lang.Object r7 = r11.get(r1)
            goto L_0x01ba
        L_0x01b9:
            r7 = 0
        L_0x01ba:
            r16 = r7
            e1.b r16 = (p088e1.C6689b) r16
            goto L_0x014e
        L_0x01bf:
            if (r1 != 0) goto L_0x01c4
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01e5
        L_0x01c4:
            boolean r2 = r4.f16747b
            if (r2 == 0) goto L_0x01cb
            r4.mo19992d()
        L_0x01cb:
            int r2 = r4.f16750e
            if (r5 >= r2) goto L_0x01da
            java.lang.Object[] r2 = r4.f16749d
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01d7
            r9 = r5
            goto L_0x01da
        L_0x01d7:
            int r5 = r5 + 1
            goto L_0x01cb
        L_0x01da:
            boolean r1 = r4.f16747b
            if (r1 == 0) goto L_0x01e1
            r4.mo19992d()
        L_0x01e1:
            int[] r1 = r4.f16748c
            r6 = r1[r9]
        L_0x01e5:
            boolean r1 = r0.mo19036n(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p123h1.C6909a.mo19030h(int, android.graphics.Rect):boolean");
    }

    /* renamed from: i */
    public final C6689b mo19031i(int i) {
        if (i != -1) {
            return mo19025c(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f15297f);
        C6689b bVar = new C6689b(obtain);
        View view = this.f15297f;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo19028f(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bVar.f14759a.addChild(this.f15297f, ((Integer) arrayList.get(i2)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: j */
    public abstract boolean mo19032j(int i, int i2, Bundle bundle);

    /* renamed from: k */
    public void mo19033k(C6689b bVar) {
    }

    /* renamed from: l */
    public abstract void mo19034l(int i, C6689b bVar);

    /* renamed from: m */
    public void mo19035m(int i, boolean z) {
    }

    /* renamed from: n */
    public final boolean mo19036n(int i) {
        int i2;
        if ((!this.f15297f.isFocused() && !this.f15297f.requestFocus()) || (i2 = this.f15300i) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo19023a(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f15300i = i;
        mo19035m(i, true);
        mo19037o(i, 8);
        return true;
    }

    /* renamed from: o */
    public final void mo19037o(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f15296e.isEnabled() && (parent = this.f15297f.getParent()) != null) {
            parent.requestSendAccessibilityEvent(this.f15297f, mo19024b(i, i2));
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        mo19033k(bVar);
    }
}
