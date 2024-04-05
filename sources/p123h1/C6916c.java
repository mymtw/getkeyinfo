package p123h1;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.google.logging.type.LogSeverity;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: h1.c */
public final class C6916c {

    /* renamed from: x */
    public static final C6917a f15307x = new C6917a();

    /* renamed from: a */
    public int f15308a;

    /* renamed from: b */
    public int f15309b;

    /* renamed from: c */
    public int f15310c = -1;

    /* renamed from: d */
    public float[] f15311d;

    /* renamed from: e */
    public float[] f15312e;

    /* renamed from: f */
    public float[] f15313f;

    /* renamed from: g */
    public float[] f15314g;

    /* renamed from: h */
    public int[] f15315h;

    /* renamed from: i */
    public int[] f15316i;

    /* renamed from: j */
    public int[] f15317j;

    /* renamed from: k */
    public int f15318k;

    /* renamed from: l */
    public VelocityTracker f15319l;

    /* renamed from: m */
    public float f15320m;

    /* renamed from: n */
    public float f15321n;

    /* renamed from: o */
    public int f15322o;

    /* renamed from: p */
    public final int f15323p;

    /* renamed from: q */
    public int f15324q;

    /* renamed from: r */
    public OverScroller f15325r;

    /* renamed from: s */
    public final C6919c f15326s;

    /* renamed from: t */
    public View f15327t;

    /* renamed from: u */
    public boolean f15328u;

    /* renamed from: v */
    public final ViewGroup f15329v;

    /* renamed from: w */
    public final C6918b f15330w = new C6918b();

    /* renamed from: h1.c$a */
    public class C6917a implements Interpolator {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: h1.c$b */
    public class C6918b implements Runnable {
        public C6918b() {
        }

        public final void run() {
            C6916c.this.mo19055s(0);
        }
    }

    /* renamed from: h1.c$c */
    public static abstract class C6919c {
        /* renamed from: a */
        public abstract int mo10012a(View view, int i);

        /* renamed from: b */
        public abstract int mo10013b(View view, int i);

        /* renamed from: c */
        public int mo10014c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo19062d() {
            return 0;
        }

        /* renamed from: e */
        public void mo10015e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo10016f() {
        }

        /* renamed from: g */
        public void mo10017g(int i, View view) {
        }

        /* renamed from: h */
        public abstract void mo10018h(int i);

        /* renamed from: i */
        public abstract void mo10019i(View view, int i, int i2);

        /* renamed from: j */
        public abstract void mo10020j(float f, float f2, View view);

        /* renamed from: k */
        public abstract boolean mo10021k(int i, View view);
    }

    public C6916c(Context context, ViewGroup viewGroup, C6919c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f15329v = viewGroup;
            this.f15326s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f15323p = i;
            this.f15322o = i;
            this.f15309b = viewConfiguration.getScaledTouchSlop();
            this.f15320m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f15321n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f15325r = new OverScroller(context, f15307x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: i */
    public static C6916c m13375i(ViewGroup viewGroup, float f, C6919c cVar) {
        C6916c cVar2 = new C6916c(viewGroup.getContext(), viewGroup, cVar);
        cVar2.f15309b = (int) ((1.0f / f) * ((float) cVar2.f15309b));
        return cVar2;
    }

    /* renamed from: m */
    public static boolean m13376m(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: a */
    public final void mo19039a() {
        mo19040b();
        if (this.f15308a == 2) {
            this.f15325r.getCurrX();
            this.f15325r.getCurrY();
            this.f15325r.abortAnimation();
            this.f15326s.mo10019i(this.f15327t, this.f15325r.getCurrX(), this.f15325r.getCurrY());
        }
        mo19055s(0);
    }

    /* renamed from: b */
    public final void mo19040b() {
        this.f15310c = -1;
        float[] fArr = this.f15311d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f15312e, 0.0f);
            Arrays.fill(this.f15313f, 0.0f);
            Arrays.fill(this.f15314g, 0.0f);
            Arrays.fill(this.f15315h, 0);
            Arrays.fill(this.f15316i, 0);
            Arrays.fill(this.f15317j, 0);
            this.f15318k = 0;
        }
        VelocityTracker velocityTracker = this.f15319l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15319l = null;
        }
    }

    /* renamed from: c */
    public final void mo19041c(int i, View view) {
        if (view.getParent() == this.f15329v) {
            this.f15327t = view;
            this.f15310c = i;
            this.f15326s.mo10017g(i, view);
            mo19055s(1);
            return;
        }
        StringBuilder h = C0072d.m201h("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        h.append(this.f15329v);
        h.append(")");
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: d */
    public final boolean mo19042d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f15315h[i] & i2) != i2 || (this.f15324q & i2) == 0 || (this.f15317j[i] & i2) == i2 || (this.f15316i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f15309b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f15326s.getClass();
        }
        return (this.f15316i[i] & i2) == 0 && abs > ((float) this.f15309b);
    }

    /* renamed from: e */
    public final boolean mo19043e(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        boolean z = this.f15326s.mo10014c(view) > 0;
        boolean z2 = this.f15326s.mo19062d() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f15309b) : z2 && Math.abs(f2) > ((float) this.f15309b);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f15309b;
        return f3 > ((float) (i * i));
    }

    /* renamed from: f */
    public final void mo19044f(int i) {
        float[] fArr = this.f15311d;
        if (fArr != null) {
            int i2 = this.f15318k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f15312e[i] = 0.0f;
                this.f15313f[i] = 0.0f;
                this.f15314g[i] = 0.0f;
                this.f15315h[i] = 0;
                this.f15316i[i] = 0;
                this.f15317j[i] = 0;
                this.f15318k = (~i3) & i2;
            }
        }
    }

    /* renamed from: g */
    public final int mo19045g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f15329v.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), LogSeverity.CRITICAL_VALUE);
    }

    /* renamed from: h */
    public final boolean mo19046h() {
        if (this.f15308a == 2) {
            boolean computeScrollOffset = this.f15325r.computeScrollOffset();
            int currX = this.f15325r.getCurrX();
            int currY = this.f15325r.getCurrY();
            int left = currX - this.f15327t.getLeft();
            int top = currY - this.f15327t.getTop();
            if (left != 0) {
                View view = this.f15327t;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f15327t;
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f15326s.mo10019i(this.f15327t, currX, currY);
            }
            if (computeScrollOffset && currX == this.f15325r.getFinalX() && currY == this.f15325r.getFinalY()) {
                this.f15325r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f15329v.post(this.f15330w);
            }
        }
        return this.f15308a == 2;
    }

    /* renamed from: j */
    public final View mo19047j(int i, int i2) {
        for (int childCount = this.f15329v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f15329v;
            this.f15326s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19048k(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.f15327t
            int r2 = r0.getLeft()
            android.view.View r0 = r9.f15327t
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            r10 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            android.widget.OverScroller r11 = r9.f15325r
            r11.abortAnimation()
            r9.mo19055s(r10)
            return r10
        L_0x001e:
            android.view.View r11 = r9.f15327t
            float r0 = r9.f15321n
            int r0 = (int) r0
            float r1 = r9.f15320m
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r12)
            if (r6 >= r0) goto L_0x002e
            r12 = r10
            goto L_0x0035
        L_0x002e:
            if (r6 <= r1) goto L_0x0035
            if (r12 <= 0) goto L_0x0034
            r12 = r1
            goto L_0x0035
        L_0x0034:
            int r12 = -r1
        L_0x0035:
            float r0 = r9.f15321n
            int r0 = (int) r0
            float r1 = r9.f15320m
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r13)
            if (r6 >= r0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            if (r6 <= r1) goto L_0x004a
            if (r13 <= 0) goto L_0x0048
            r13 = r1
            goto L_0x004a
        L_0x0048:
            int r10 = -r1
        L_0x0049:
            r13 = r10
        L_0x004a:
            int r10 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r1 = java.lang.Math.abs(r12)
            int r6 = java.lang.Math.abs(r13)
            int r7 = r1 + r6
            int r8 = r10 + r0
            if (r12 == 0) goto L_0x0063
            float r10 = (float) r1
            float r1 = (float) r7
            goto L_0x0065
        L_0x0063:
            float r10 = (float) r10
            float r1 = (float) r8
        L_0x0065:
            float r10 = r10 / r1
            if (r13 == 0) goto L_0x006b
            float r0 = (float) r6
            float r1 = (float) r7
            goto L_0x006d
        L_0x006b:
            float r0 = (float) r0
            float r1 = (float) r8
        L_0x006d:
            float r0 = r0 / r1
            h1.c$c r1 = r9.f15326s
            int r11 = r1.mo10014c(r11)
            int r11 = r9.mo19045g(r4, r12, r11)
            h1.c$c r12 = r9.f15326s
            int r12 = r12.mo19062d()
            int r12 = r9.mo19045g(r5, r13, r12)
            float r11 = (float) r11
            float r11 = r11 * r10
            float r10 = (float) r12
            float r10 = r10 * r0
            float r10 = r10 + r11
            int r6 = (int) r10
            android.widget.OverScroller r1 = r9.f15325r
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.mo19055s(r10)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p123h1.C6916c.mo19048k(int, int, int, int):boolean");
    }

    /* renamed from: l */
    public final boolean mo19049l(int i) {
        if ((this.f15318k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: n */
    public final void mo19050n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo19040b();
        }
        if (this.f15319l == null) {
            this.f15319l = VelocityTracker.obtain();
        }
        this.f15319l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View j = mo19047j((int) x, (int) y);
            mo19053q(pointerId, x, y);
            mo19059w(pointerId, j);
            if ((this.f15315h[pointerId] & this.f15324q) != 0) {
                this.f15326s.mo10016f();
            }
        } else if (actionMasked == 1) {
            if (this.f15308a == 1) {
                mo19051o();
            }
            mo19040b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f15308a == 1) {
                    this.f15328u = true;
                    this.f15326s.mo10020j(0.0f, 0.0f, this.f15327t);
                    this.f15328u = false;
                    if (this.f15308a == 1) {
                        mo19055s(0);
                    }
                }
                mo19040b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                mo19053q(pointerId2, x2, y2);
                if (this.f15308a == 0) {
                    mo19059w(pointerId2, mo19047j((int) x2, (int) y2));
                    if ((this.f15315h[pointerId2] & this.f15324q) != 0) {
                        this.f15326s.mo10016f();
                        return;
                    }
                    return;
                }
                if (m13376m(this.f15327t, (int) x2, (int) y2)) {
                    mo19059w(pointerId2, this.f15327t);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f15308a == 1 && pointerId3 == this.f15310c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f15310c) {
                            View j2 = mo19047j((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f15327t;
                            if (j2 == view && mo19059w(pointerId4, view)) {
                                i = this.f15310c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        mo19051o();
                    }
                }
                mo19044f(pointerId3);
            }
        } else if (this.f15308a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (mo19049l(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f15311d[pointerId5];
                    float f2 = y3 - this.f15312e[pointerId5];
                    mo19052p(pointerId5, f, f2);
                    if (this.f15308a != 1) {
                        View j3 = mo19047j((int) x3, (int) y3);
                        if (mo19043e(f, f2, j3) && mo19059w(pointerId5, j3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            mo19054r(motionEvent);
        } else if (mo19049l(this.f15310c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f15310c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f15313f;
            int i3 = this.f15310c;
            int i4 = (int) (x4 - fArr[i3]);
            int i5 = (int) (y4 - this.f15314g[i3]);
            int left = this.f15327t.getLeft() + i4;
            int top = this.f15327t.getTop() + i5;
            int left2 = this.f15327t.getLeft();
            int top2 = this.f15327t.getTop();
            if (i4 != 0) {
                left = this.f15326s.mo10012a(this.f15327t, left);
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                this.f15327t.offsetLeftAndRight(left - left2);
            }
            if (i5 != 0) {
                top = this.f15326s.mo10013b(this.f15327t, top);
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                this.f15327t.offsetTopAndBottom(top - top2);
            }
            if (!(i4 == 0 && i5 == 0)) {
                this.f15326s.mo10019i(this.f15327t, left, top);
            }
            mo19054r(motionEvent);
        }
    }

    /* renamed from: o */
    public final void mo19051o() {
        this.f15319l.computeCurrentVelocity(1000, this.f15320m);
        float xVelocity = this.f15319l.getXVelocity(this.f15310c);
        float f = this.f15321n;
        float f2 = this.f15320m;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f15319l.getYVelocity(this.f15310c);
        float f4 = this.f15321n;
        float f5 = this.f15320m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > 0.0f) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        this.f15328u = true;
        this.f15326s.mo10020j(xVelocity, f3, this.f15327t);
        this.f15328u = false;
        if (this.f15308a == 1) {
            mo19055s(0);
        }
    }

    /* renamed from: p */
    public final void mo19052p(int i, float f, float f2) {
        boolean d = mo19042d(f, f2, i, 1);
        if (mo19042d(f2, f, i, 4)) {
            d |= true;
        }
        if (mo19042d(f, f2, i, 2)) {
            d |= true;
        }
        if (mo19042d(f2, f, i, 8)) {
            d |= true;
        }
        if (d) {
            int[] iArr = this.f15316i;
            iArr[i] = iArr[i] | d;
            this.f15326s.mo10015e(d ? 1 : 0, i);
        }
    }

    /* renamed from: q */
    public final void mo19053q(int i, float f, float f2) {
        float[] fArr = this.f15311d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f15312e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f15313f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f15314g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f15315h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f15316i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f15317j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f15311d = fArr2;
            this.f15312e = fArr3;
            this.f15313f = fArr4;
            this.f15314g = fArr5;
            this.f15315h = iArr;
            this.f15316i = iArr2;
            this.f15317j = iArr3;
        }
        float[] fArr9 = this.f15311d;
        this.f15313f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f15312e;
        this.f15314g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f15315h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f15329v.getLeft() + this.f15322o) {
            i2 = 1;
        }
        if (i5 < this.f15329v.getTop() + this.f15322o) {
            i2 |= 4;
        }
        if (i4 > this.f15329v.getRight() - this.f15322o) {
            i2 |= 2;
        }
        if (i5 > this.f15329v.getBottom() - this.f15322o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f15318k = (1 << i) | this.f15318k;
    }

    /* renamed from: r */
    public final void mo19054r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo19049l(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f15313f[pointerId] = x;
                this.f15314g[pointerId] = y;
            }
        }
    }

    /* renamed from: s */
    public final void mo19055s(int i) {
        this.f15329v.removeCallbacks(this.f15330w);
        if (this.f15308a != i) {
            this.f15308a = i;
            this.f15326s.mo10018h(i);
            if (this.f15308a == 0) {
                this.f15327t = null;
            }
        }
    }

    /* renamed from: t */
    public final boolean mo19056t(int i, int i2) {
        if (this.f15328u) {
            return mo19048k(i, i2, (int) this.f15319l.getXVelocity(this.f15310c), (int) this.f15319l.getYVelocity(this.f15310c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r12 != r11) goto L_0x00e5;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19057u(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo19040b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f15319l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f15319l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f15319l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0102
            if (r2 == r5) goto L_0x00fd
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00fd
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0100
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.mo19044f(r1)
            goto L_0x0100
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo19053q(r2, r7, r1)
            int r3 = r0.f15308a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f15315h
            r1 = r1[r2]
            int r2 = r0.f15324q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0100
            h1.c$c r1 = r0.f15326s
            r1.mo10016f()
            goto L_0x0100
        L_0x005f:
            if (r3 != r4) goto L_0x0100
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo19047j(r3, r1)
            android.view.View r3 = r0.f15327t
            if (r1 != r3) goto L_0x0100
            r0.mo19059w(r2, r1)
            goto L_0x0100
        L_0x0070:
            float[] r2 = r0.f15311d
            if (r2 == 0) goto L_0x0100
            float[] r2 = r0.f15312e
            if (r2 != 0) goto L_0x007a
            goto L_0x0100
        L_0x007a:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00f9
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.mo19049l(r4)
            if (r7 != 0) goto L_0x008d
            goto L_0x00f6
        L_0x008d:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f15311d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f15312e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo19047j(r7, r8)
            if (r7 == 0) goto L_0x00b1
            boolean r8 = r0.mo19043e(r9, r10, r7)
            if (r8 == 0) goto L_0x00b1
            r8 = r5
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r8 == 0) goto L_0x00e5
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            h1.c$c r13 = r0.f15326s
            int r12 = r13.mo10012a(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            h1.c$c r15 = r0.f15326s
            int r14 = r15.mo10013b(r7, r14)
            h1.c$c r15 = r0.f15326s
            int r15 = r15.mo10014c(r7)
            h1.c$c r6 = r0.f15326s
            int r6 = r6.mo19062d()
            if (r15 == 0) goto L_0x00de
            if (r15 <= 0) goto L_0x00e5
            if (r12 != r11) goto L_0x00e5
        L_0x00de:
            if (r6 == 0) goto L_0x00f9
            if (r6 <= 0) goto L_0x00e5
            if (r14 != r13) goto L_0x00e5
            goto L_0x00f9
        L_0x00e5:
            r0.mo19052p(r4, r9, r10)
            int r6 = r0.f15308a
            if (r6 != r5) goto L_0x00ed
            goto L_0x00f9
        L_0x00ed:
            if (r8 == 0) goto L_0x00f6
            boolean r4 = r0.mo19059w(r4, r7)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00f9:
            r16.mo19054r(r17)
            goto L_0x0100
        L_0x00fd:
            r16.mo19040b()
        L_0x0100:
            r6 = 0
            goto L_0x0131
        L_0x0102:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.mo19053q(r1, r2, r3)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo19047j(r2, r3)
            android.view.View r3 = r0.f15327t
            if (r2 != r3) goto L_0x0123
            int r3 = r0.f15308a
            if (r3 != r4) goto L_0x0123
            r0.mo19059w(r1, r2)
        L_0x0123:
            int[] r2 = r0.f15315h
            r1 = r2[r1]
            int r2 = r0.f15324q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0131
            h1.c$c r1 = r0.f15326s
            r1.mo10016f()
        L_0x0131:
            int r1 = r0.f15308a
            if (r1 != r5) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r5 = r6
        L_0x0137:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p123h1.C6916c.mo19057u(android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public final boolean mo19058v(View view, int i, int i2) {
        this.f15327t = view;
        this.f15310c = -1;
        boolean k = mo19048k(i, i2, 0, 0);
        if (!k && this.f15308a == 0 && this.f15327t != null) {
            this.f15327t = null;
        }
        return k;
    }

    /* renamed from: w */
    public final boolean mo19059w(int i, View view) {
        if (view == this.f15327t && this.f15310c == i) {
            return true;
        }
        if (view == null || !this.f15326s.mo10021k(i, view)) {
            return false;
        }
        this.f15310c = i;
        mo19041c(i, view);
        return true;
    }
}
