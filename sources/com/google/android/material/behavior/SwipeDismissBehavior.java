package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C15439g;
import com.google.android.material.snackbar.C15441i;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p123h1.C6916c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C2245c<V> {

    /* renamed from: a */
    public C6916c f34095a;

    /* renamed from: b */
    public C15195b f34096b;

    /* renamed from: c */
    public boolean f34097c;

    /* renamed from: d */
    public int f34098d = 2;

    /* renamed from: e */
    public float f34099e = 0.5f;

    /* renamed from: f */
    public float f34100f = 0.0f;

    /* renamed from: g */
    public float f34101g = 0.5f;

    /* renamed from: h */
    public final C15194a f34102h = new C15194a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C15194a extends C6916c.C6919c {

        /* renamed from: a */
        public int f34103a;

        /* renamed from: b */
        public int f34104b = -1;

        public C15194a() {
        }

        /* renamed from: a */
        public final int mo10012a(View view, int i) {
            int i2;
            int i3;
            int i4;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = C2364y.C2369e.m5233d(view) == 1;
            int i5 = SwipeDismissBehavior.this.f34098d;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f34103a - view.getWidth();
                    i2 = view.getWidth() + this.f34103a;
                } else if (z) {
                    i3 = this.f34103a;
                    i4 = view.getWidth();
                } else {
                    i3 = this.f34103a - view.getWidth();
                    i2 = this.f34103a;
                }
                return Math.min(Math.max(i3, i), i2);
            } else if (z) {
                i3 = this.f34103a - view.getWidth();
                i2 = this.f34103a;
                return Math.min(Math.max(i3, i), i2);
            } else {
                i3 = this.f34103a;
                i4 = view.getWidth();
            }
            i2 = i4 + i3;
            return Math.min(Math.max(i3, i), i2);
        }

        /* renamed from: b */
        public final int mo10013b(View view, int i) {
            return view.getTop();
        }

        /* renamed from: c */
        public final int mo10014c(View view) {
            return view.getWidth();
        }

        /* renamed from: g */
        public final void mo10017g(int i, View view) {
            this.f34104b = i;
            this.f34103a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: h */
        public final void mo10018h(int i) {
            C15195b bVar = SwipeDismissBehavior.this.f34096b;
            if (bVar != null) {
                C15439g gVar = (C15439g) bVar;
                if (i == 0) {
                    C15441i b = C15441i.m25034b();
                    BaseTransientBottomBar.C15429c cVar = gVar.f34677a.f34664m;
                    synchronized (b.f34680a) {
                        if (b.mo54779c(cVar)) {
                            C15441i.C15444c cVar2 = b.f34682c;
                            if (cVar2.f34687c) {
                                cVar2.f34687c = false;
                                b.mo54780d(cVar2);
                            }
                        }
                    }
                } else if (i == 1 || i == 2) {
                    C15441i b2 = C15441i.m25034b();
                    BaseTransientBottomBar.C15429c cVar3 = gVar.f34677a.f34664m;
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
            }
        }

        /* renamed from: i */
        public final void mo10019i(View view, int i, int i2) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f34100f) + ((float) this.f34103a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f34101g) + ((float) this.f34103a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (java.lang.Math.abs(r10.getLeft() - r7.f34103a) >= java.lang.Math.round(((float) r10.getWidth()) * r7.f34105c.f34099e)) goto L_0x0054;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10020j(float r8, float r9, android.view.View r10) {
            /*
                r7 = this;
                r9 = -1
                r7.f34104b = r9
                int r9 = r10.getWidth()
                r0 = 0
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r4 = androidx.core.view.C2364y.f5646a
                int r4 = androidx.core.view.C2364y.C2369e.m5233d(r10)
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f34098d
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x0054
            L_0x0021:
                if (r5 != 0) goto L_0x002d
                if (r4 == 0) goto L_0x002a
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x002a:
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x002d:
                if (r5 != r2) goto L_0x0056
                if (r4 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x0034:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x0039:
                int r8 = r10.getLeft()
                int r0 = r7.f34103a
                int r8 = r8 - r0
                int r0 = r10.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f34099e
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L_0x0056
            L_0x0054:
                r8 = r2
                goto L_0x0057
            L_0x0056:
                r8 = r3
            L_0x0057:
                if (r8 == 0) goto L_0x0065
                int r8 = r10.getLeft()
                int r0 = r7.f34103a
                if (r8 >= r0) goto L_0x0063
                int r0 = r0 - r9
                goto L_0x0068
            L_0x0063:
                int r0 = r0 + r9
                goto L_0x0068
            L_0x0065:
                int r0 = r7.f34103a
                r2 = r3
            L_0x0068:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                h1.c r8 = r8.f34095a
                int r9 = r10.getTop()
                boolean r8 = r8.mo19056t(r0, r9)
                if (r8 == 0) goto L_0x0083
                com.google.android.material.behavior.SwipeDismissBehavior$c r8 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r10, r2)
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r9 = androidx.core.view.C2364y.f5646a
                androidx.core.view.C2364y.C2368d.m5223m(r10, r8)
                goto L_0x0090
            L_0x0083:
                if (r2 == 0) goto L_0x0090
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = r8.f34096b
                if (r8 == 0) goto L_0x0090
                com.google.android.material.snackbar.g r8 = (com.google.android.material.snackbar.C15439g) r8
                r8.mo54776a(r10)
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C15194a.mo10020j(float, float, android.view.View):void");
        }

        /* renamed from: k */
        public final boolean mo10021k(int i, View view) {
            int i2 = this.f34104b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo53108a(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C15195b {
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public class C15196c implements Runnable {

        /* renamed from: b */
        public final View f34106b;

        /* renamed from: c */
        public final boolean f34107c;

        public C15196c(View view, boolean z) {
            this.f34106b = view;
            this.f34107c = z;
        }

        public final void run() {
            C15195b bVar;
            C6916c cVar = SwipeDismissBehavior.this.f34095a;
            if (cVar != null && cVar.mo19046h()) {
                View view = this.f34106b;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5223m(view, this);
            } else if (this.f34107c && (bVar = SwipeDismissBehavior.this.f34096b) != null) {
                ((C15439g) bVar).mo54776a(this.f34106b);
            }
        }
    }

    /* renamed from: a */
    public boolean mo53108a(View view) {
        return true;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f34097c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f34097c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34097c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f34095a == null) {
            this.f34095a = new C6916c(coordinatorLayout.getContext(), coordinatorLayout, this.f34102h);
        }
        return this.f34095a.mo19057u(motionEvent);
    }

    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2368d.m5213c(v) == 0) {
            C2364y.C2368d.m5229s(v, 1);
            C2364y.m5198m(1048576, v);
            C2364y.m5195j(0, v);
            if (mo53108a(v)) {
                C2364y.m5199n(v, C6689b.C6690a.f14772o, new C15197a(this));
            }
        }
        return onLayoutChild;
    }

    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C6916c cVar = this.f34095a;
        if (cVar == null) {
            return false;
        }
        cVar.mo19050n(motionEvent);
        return true;
    }
}
