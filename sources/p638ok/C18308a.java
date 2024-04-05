package p638ok;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;

/* renamed from: ok.a */
public abstract class C18308a<V extends View> extends C18311c<V> {

    /* renamed from: c */
    public C18309a f40187c;

    /* renamed from: d */
    public OverScroller f40188d;

    /* renamed from: e */
    public boolean f40189e;

    /* renamed from: f */
    public int f40190f = -1;

    /* renamed from: g */
    public int f40191g;

    /* renamed from: h */
    public int f40192h = -1;

    /* renamed from: i */
    public VelocityTracker f40193i;

    /* renamed from: ok.a$a */
    public class C18309a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f40194b;

        /* renamed from: c */
        public final V f40195c;

        public C18309a(CoordinatorLayout coordinatorLayout, V v) {
            this.f40194b = coordinatorLayout;
            this.f40195c = v;
        }

        public final void run() {
            OverScroller overScroller;
            if (this.f40195c != null && (overScroller = C18308a.this.f40188d) != null) {
                if (overScroller.computeScrollOffset()) {
                    C18308a aVar = C18308a.this;
                    aVar.mo69846i(this.f40194b, this.f40195c, aVar.f40188d.getCurrY());
                    V v = this.f40195c;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5223m(v, this);
                    return;
                }
                C18308a.this.mo52937g(this.f40194b, this.f40195c);
            }
        }
    }

    public C18308a() {
    }

    /* renamed from: c */
    public boolean mo52933c(V v) {
        return false;
    }

    /* renamed from: d */
    public int mo52934d(V v) {
        return -v.getHeight();
    }

    /* renamed from: e */
    public int mo52935e(V v) {
        return v.getHeight();
    }

    /* renamed from: f */
    public int mo52936f() {
        return mo69849a();
    }

    /* renamed from: g */
    public void mo52937g(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: h */
    public int mo52938h(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int A;
        int a = mo69849a();
        if (i2 == 0 || a < i2 || a > i3 || a == (A = C19543e0.m33285A(i, i2, i3))) {
            return 0;
        }
        C18312d dVar = this.f40201a;
        if (dVar != null) {
            dVar.mo69851b(A);
        } else {
            this.f40202b = A;
        }
        return a - A;
    }

    /* renamed from: i */
    public final void mo69846i(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo52938h(coordinatorLayout, view, i, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f40192h < 0) {
            this.f40192h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f40189e) {
            int i = this.f40190f;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f40191g) > this.f40192h) {
                this.f40191g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f40190f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo52933c(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.f40189e = z;
            if (z) {
                this.f40191g = y2;
                this.f40190f = motionEvent.getPointerId(0);
                if (this.f40193i == null) {
                    this.f40193i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f40188d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f40188d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f40193i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r1 = 0
            r3 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x005e
            r4 = 2
            if (r0 == r4) goto L_0x0034
            r2 = 3
            if (r0 == r2) goto L_0x00c5
            r1 = 6
            if (r0 == r1) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0022
            r0 = r8
            goto L_0x0023
        L_0x0022:
            r0 = r9
        L_0x0023:
            int r1 = r7.getPointerId(r0)
            r6.f40190f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f40191g = r0
            goto L_0x005b
        L_0x0034:
            int r0 = r6.f40190f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r3) goto L_0x003d
            return r9
        L_0x003d:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f40191g
            int r1 = r1 - r0
            r6.f40191g = r0
            int r4 = r6.mo52934d(r2)
            r5 = 0
            int r0 = r19.mo52936f()
            int r3 = r0 - r1
            r0 = r19
            r1 = r20
            r2 = r21
            r0.mo52938h(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = r9
            goto L_0x00d3
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f40193i
            if (r0 == 0) goto L_0x00c5
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f40193i
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.f40193i
            int r4 = r6.f40190f
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.mo52935e(r2)
            int r4 = -r4
            r18 = 0
            ok.a$a r5 = r6.f40187c
            if (r5 == 0) goto L_0x0084
            r2.removeCallbacks(r5)
            r6.f40187c = r1
        L_0x0084:
            android.widget.OverScroller r5 = r6.f40188d
            if (r5 != 0) goto L_0x0093
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.f40188d = r5
        L_0x0093:
            android.widget.OverScroller r10 = r6.f40188d
            r11 = 0
            int r12 = r19.mo69849a()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f40188d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            ok.a$a r0 = new ok.a$a
            r4 = r20
            r0.<init>(r4, r2)
            r6.f40187c = r0
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r4 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5223m(r2, r0)
            goto L_0x00c3
        L_0x00be:
            r4 = r20
            r19.mo52937g(r20, r21)
        L_0x00c3:
            r0 = r8
            goto L_0x00c6
        L_0x00c5:
            r0 = r9
        L_0x00c6:
            r6.f40189e = r9
            r6.f40190f = r3
            android.view.VelocityTracker r2 = r6.f40193i
            if (r2 == 0) goto L_0x00d3
            r2.recycle()
            r6.f40193i = r1
        L_0x00d3:
            android.view.VelocityTracker r1 = r6.f40193i
            if (r1 == 0) goto L_0x00da
            r1.addMovement(r7)
        L_0x00da:
            boolean r1 = r6.f40189e
            if (r1 != 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r8 = r9
        L_0x00e2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p638ok.C18308a.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public C18308a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
