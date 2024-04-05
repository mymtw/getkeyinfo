package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.C2300f;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p003a2.C0023f;
import p091e4.C6717c;

/* renamed from: androidx.recyclerview.widget.q */
public final class C3185q extends RecyclerView.C3099n implements RecyclerView.C3105p {

    /* renamed from: A */
    public Rect f7376A;

    /* renamed from: B */
    public long f7377B;

    /* renamed from: a */
    public final ArrayList f7378a = new ArrayList();

    /* renamed from: b */
    public final float[] f7379b = new float[2];

    /* renamed from: c */
    public RecyclerView.C3084b0 f7380c = null;

    /* renamed from: d */
    public float f7381d;

    /* renamed from: e */
    public float f7382e;

    /* renamed from: f */
    public float f7383f;

    /* renamed from: g */
    public float f7384g;

    /* renamed from: h */
    public float f7385h;

    /* renamed from: i */
    public float f7386i;

    /* renamed from: j */
    public float f7387j;

    /* renamed from: k */
    public float f7388k;

    /* renamed from: l */
    public int f7389l = -1;

    /* renamed from: m */
    public C3189d f7390m;

    /* renamed from: n */
    public int f7391n = 0;

    /* renamed from: o */
    public int f7392o;

    /* renamed from: p */
    public ArrayList f7393p = new ArrayList();

    /* renamed from: q */
    public int f7394q;

    /* renamed from: r */
    public RecyclerView f7395r;

    /* renamed from: s */
    public final C3186a f7396s = new C3186a();

    /* renamed from: t */
    public VelocityTracker f7397t;

    /* renamed from: u */
    public ArrayList f7398u;

    /* renamed from: v */
    public ArrayList f7399v;

    /* renamed from: w */
    public View f7400w = null;

    /* renamed from: x */
    public C2300f f7401x;

    /* renamed from: y */
    public C3192e f7402y;

    /* renamed from: z */
    public final C3187b f7403z = new C3187b();

    /* renamed from: androidx.recyclerview.widget.q$a */
    public class C3186a implements Runnable {
        public C3186a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
            if (r12 < 0) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
            if (r12 > 0) goto L_0x007b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0111  */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r0 = r16
                androidx.recyclerview.widget.q r1 = androidx.recyclerview.widget.C3185q.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f7380c
                if (r2 == 0) goto L_0x012c
                r2 = 0
                r3 = -9223372036854775808
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = r1.f7377B
                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r9 != 0) goto L_0x0018
                r7 = 0
                goto L_0x001a
            L_0x0018:
                long r7 = r5 - r7
            L_0x001a:
                androidx.recyclerview.widget.RecyclerView r9 = r1.f7395r
                androidx.recyclerview.widget.RecyclerView$o r9 = r9.getLayoutManager()
                android.graphics.Rect r10 = r1.f7376A
                if (r10 != 0) goto L_0x002b
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r1.f7376A = r10
            L_0x002b:
                androidx.recyclerview.widget.RecyclerView$b0 r10 = r1.f7380c
                android.view.View r10 = r10.itemView
                android.graphics.Rect r11 = r1.f7376A
                r9.mo11663e(r10, r11)
                boolean r10 = r9.mo11297f()
                r11 = 0
                if (r10 == 0) goto L_0x007a
                float r10 = r1.f7387j
                float r12 = r1.f7385h
                float r10 = r10 + r12
                int r10 = (int) r10
                android.graphics.Rect r12 = r1.f7376A
                int r12 = r12.left
                int r12 = r10 - r12
                androidx.recyclerview.widget.RecyclerView r13 = r1.f7395r
                int r13 = r13.getPaddingLeft()
                int r12 = r12 - r13
                float r13 = r1.f7385h
                int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r14 >= 0) goto L_0x0057
                if (r12 >= 0) goto L_0x0057
                goto L_0x007b
            L_0x0057:
                int r12 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x007a
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.f7380c
                android.view.View r12 = r12.itemView
                int r12 = r12.getWidth()
                int r12 = r12 + r10
                android.graphics.Rect r10 = r1.f7376A
                int r10 = r10.right
                int r12 = r12 + r10
                androidx.recyclerview.widget.RecyclerView r10 = r1.f7395r
                int r10 = r10.getWidth()
                androidx.recyclerview.widget.RecyclerView r13 = r1.f7395r
                int r13 = r13.getPaddingRight()
                int r10 = r10 - r13
                int r12 = r12 - r10
                if (r12 <= 0) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r12 = r2
            L_0x007b:
                boolean r9 = r9.mo11298g()
                if (r9 == 0) goto L_0x00c1
                float r9 = r1.f7388k
                float r10 = r1.f7386i
                float r9 = r9 + r10
                int r9 = (int) r9
                android.graphics.Rect r10 = r1.f7376A
                int r10 = r10.top
                int r10 = r9 - r10
                androidx.recyclerview.widget.RecyclerView r13 = r1.f7395r
                int r13 = r13.getPaddingTop()
                int r10 = r10 - r13
                float r13 = r1.f7386i
                int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r14 >= 0) goto L_0x009d
                if (r10 >= 0) goto L_0x009d
                goto L_0x00bf
            L_0x009d:
                int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00c1
                androidx.recyclerview.widget.RecyclerView$b0 r10 = r1.f7380c
                android.view.View r10 = r10.itemView
                int r10 = r10.getHeight()
                int r10 = r10 + r9
                android.graphics.Rect r9 = r1.f7376A
                int r9 = r9.bottom
                int r10 = r10 + r9
                androidx.recyclerview.widget.RecyclerView r9 = r1.f7395r
                int r9 = r9.getHeight()
                androidx.recyclerview.widget.RecyclerView r11 = r1.f7395r
                int r11 = r11.getPaddingBottom()
                int r9 = r9 - r11
                int r10 = r10 - r9
                if (r10 <= 0) goto L_0x00c1
            L_0x00bf:
                r15 = r10
                goto L_0x00c2
            L_0x00c1:
                r15 = r2
            L_0x00c2:
                if (r12 == 0) goto L_0x00da
                androidx.recyclerview.widget.q$d r9 = r1.f7390m
                androidx.recyclerview.widget.RecyclerView r10 = r1.f7395r
                androidx.recyclerview.widget.RecyclerView$b0 r11 = r1.f7380c
                android.view.View r11 = r11.itemView
                int r11 = r11.getWidth()
                androidx.recyclerview.widget.RecyclerView r13 = r1.f7395r
                r13.getWidth()
                r13 = r7
                int r12 = r9.mo11931c(r10, r11, r12, r13)
            L_0x00da:
                r13 = r12
                if (r15 == 0) goto L_0x00f8
                androidx.recyclerview.widget.q$d r9 = r1.f7390m
                androidx.recyclerview.widget.RecyclerView r10 = r1.f7395r
                androidx.recyclerview.widget.RecyclerView$b0 r11 = r1.f7380c
                android.view.View r11 = r11.itemView
                int r11 = r11.getHeight()
                androidx.recyclerview.widget.RecyclerView r12 = r1.f7395r
                r12.getHeight()
                r12 = r15
                r15 = r13
                r13 = r7
                int r7 = r9.mo11931c(r10, r11, r12, r13)
                r12 = r15
                r15 = r7
                goto L_0x00f9
            L_0x00f8:
                r12 = r13
            L_0x00f9:
                if (r12 != 0) goto L_0x0101
                if (r15 == 0) goto L_0x00fe
                goto L_0x0101
            L_0x00fe:
                r1.f7377B = r3
                goto L_0x010f
            L_0x0101:
                long r7 = r1.f7377B
                int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r2 != 0) goto L_0x0109
                r1.f7377B = r5
            L_0x0109:
                androidx.recyclerview.widget.RecyclerView r1 = r1.f7395r
                r1.scrollBy(r12, r15)
                r2 = 1
            L_0x010f:
                if (r2 == 0) goto L_0x012c
                androidx.recyclerview.widget.q r1 = androidx.recyclerview.widget.C3185q.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f7380c
                if (r2 == 0) goto L_0x011a
                r1.mo11924n(r2)
            L_0x011a:
                androidx.recyclerview.widget.q r1 = androidx.recyclerview.widget.C3185q.this
                androidx.recyclerview.widget.RecyclerView r2 = r1.f7395r
                androidx.recyclerview.widget.q$a r1 = r1.f7396s
                r2.removeCallbacks(r1)
                androidx.recyclerview.widget.q r1 = androidx.recyclerview.widget.C3185q.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.f7395r
                java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r2 = androidx.core.view.C2364y.f5646a
                androidx.core.view.C2364y.C2368d.m5223m(r1, r0)
            L_0x012c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3185q.C3186a.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    public class C3187b implements RecyclerView.C3107r {
        public C3187b() {
        }

        /* renamed from: c */
        public final void mo11685c(boolean z) {
            if (z) {
                C3185q.this.mo11926p((RecyclerView.C3084b0) null, 0);
            }
        }

        /* renamed from: d */
        public final void mo11686d(MotionEvent motionEvent) {
            C3185q.this.f7401x.mo8896a(motionEvent);
            VelocityTracker velocityTracker = C3185q.this.f7397t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C3185q.this.f7389l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C3185q.this.f7389l);
                if (findPointerIndex >= 0) {
                    C3185q.this.mo11919h(actionMasked, findPointerIndex, motionEvent);
                }
                C3185q qVar = C3185q.this;
                RecyclerView.C3084b0 b0Var = qVar.f7380c;
                if (b0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = qVar.f7397t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C3185q qVar2 = C3185q.this;
                                if (pointerId == qVar2.f7389l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    qVar2.f7389l = motionEvent.getPointerId(i);
                                    C3185q qVar3 = C3185q.this;
                                    qVar3.mo11927q(qVar3.f7392o, actionIndex, motionEvent);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            qVar.mo11927q(qVar.f7392o, findPointerIndex, motionEvent);
                            C3185q.this.mo11924n(b0Var);
                            C3185q qVar4 = C3185q.this;
                            qVar4.f7395r.removeCallbacks(qVar4.f7396s);
                            C3185q.this.f7396s.run();
                            C3185q.this.f7395r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C3185q.this.mo11926p((RecyclerView.C3084b0) null, 0);
                    C3185q.this.f7389l = -1;
                }
            }
        }

        /* renamed from: e */
        public final boolean mo11687e(MotionEvent motionEvent) {
            int findPointerIndex;
            C3185q.this.f7401x.mo8896a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            C3193f fVar = null;
            if (actionMasked == 0) {
                C3185q.this.f7389l = motionEvent.getPointerId(0);
                C3185q.this.f7381d = motionEvent.getX();
                C3185q.this.f7382e = motionEvent.getY();
                C3185q qVar = C3185q.this;
                VelocityTracker velocityTracker = qVar.f7397t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                qVar.f7397t = VelocityTracker.obtain();
                C3185q qVar2 = C3185q.this;
                if (qVar2.f7380c == null) {
                    if (!qVar2.f7393p.isEmpty()) {
                        View k = qVar2.mo11922k(motionEvent);
                        int size = qVar2.f7393p.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C3193f fVar2 = (C3193f) qVar2.f7393p.get(size);
                            if (fVar2.f7417e.itemView == k) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        C3185q qVar3 = C3185q.this;
                        qVar3.f7381d -= fVar.f7421i;
                        qVar3.f7382e -= fVar.f7422j;
                        qVar3.mo11921j(fVar.f7417e, true);
                        if (C3185q.this.f7378a.remove(fVar.f7417e.itemView)) {
                            C3189d dVar = C3185q.this.f7390m;
                            RecyclerView.C3084b0 b0Var = fVar.f7417e;
                            dVar.getClass();
                            C3189d.m7800a(b0Var);
                        }
                        C3185q.this.mo11926p(fVar.f7417e, fVar.f7418f);
                        C3185q qVar4 = C3185q.this;
                        qVar4.mo11927q(qVar4.f7392o, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C3185q qVar5 = C3185q.this;
                qVar5.f7389l = -1;
                qVar5.mo11926p((RecyclerView.C3084b0) null, 0);
            } else {
                int i = C3185q.this.f7389l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C3185q.this.mo11919h(actionMasked, findPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = C3185q.this.f7397t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return C3185q.this.f7380c != null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$c */
    public class C3188c extends C3193f {

        /* renamed from: n */
        public final /* synthetic */ int f7406n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.C3084b0 f7407o;

        /* renamed from: p */
        public final /* synthetic */ C3185q f7408p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3188c(C3185q qVar, RecyclerView.C3084b0 b0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C3084b0 b0Var2) {
            super(b0Var, i2, f, f2, f3, f4);
            this.f7408p = qVar;
            this.f7406n = i3;
            this.f7407o = b0Var2;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f7423k) {
                if (this.f7406n <= 0) {
                    C3189d dVar = this.f7408p.f7390m;
                    RecyclerView.C3084b0 b0Var = this.f7407o;
                    dVar.getClass();
                    C3189d.m7800a(b0Var);
                } else {
                    this.f7408p.f7378a.add(this.f7407o.itemView);
                    this.f7420h = true;
                    int i = this.f7406n;
                    if (i > 0) {
                        C3185q qVar = this.f7408p;
                        qVar.f7395r.post(new C3195r(qVar, this, i));
                    }
                }
                C3185q qVar2 = this.f7408p;
                View view = qVar2.f7400w;
                View view2 = this.f7407o.itemView;
                if (view == view2) {
                    qVar2.mo11925o(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$d */
    public static abstract class C3189d {

        /* renamed from: b */
        public static final C3191b f7409b = new C3191b();

        /* renamed from: a */
        public int f7410a = -1;

        /* renamed from: androidx.recyclerview.widget.q$d$a */
        public class C3190a implements Interpolator {
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.q$d$b */
        public class C3191b implements Interpolator {
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        static {
            new C3190a();
        }

        /* renamed from: a */
        public static void m7800a(RecyclerView.C3084b0 b0Var) {
            View view = b0Var.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2373i.m5272s(view, floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, (Object) null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        /* renamed from: b */
        public abstract int mo11930b(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var);

        /* renamed from: c */
        public final int mo11931c(RecyclerView recyclerView, int i, int i2, long j) {
            if (this.f7410a == -1) {
                this.f7410a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            float f = 1.0f;
            int interpolation = (int) (f7409b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))) * ((float) (((int) Math.signum((float) i2)) * this.f7410a)));
            if (j <= NetworkRetryInterceptor.DEFAULT_RETRY_DELAY) {
                f = ((float) j) / 2000.0f;
            }
            int i3 = (int) (f * f * f * f * f * ((float) interpolation));
            return i3 == 0 ? i2 > 0 ? 1 : -1 : i3;
        }

        /* renamed from: d */
        public void mo11932d(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, float f, float f2, int i, boolean z) {
            View view = b0Var.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                Float valueOf = Float.valueOf(C2364y.C2373i.m5262i(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                        float i3 = C2364y.C2373i.m5262i(childAt);
                        if (i3 > f3) {
                            f3 = i3;
                        }
                    }
                }
                C2364y.C2373i.m5272s(view, f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        /* renamed from: e */
        public abstract void mo11933e(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2);

        /* renamed from: f */
        public abstract void mo11934f(RecyclerView.C3084b0 b0Var);
    }

    /* renamed from: androidx.recyclerview.widget.q$e */
    public class C3192e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f7411b = true;

        public C3192e() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            View k;
            RecyclerView.C3084b0 childViewHolder;
            int i;
            int i2;
            if (this.f7411b && (k = C3185q.this.mo11922k(motionEvent)) != null && (childViewHolder = C3185q.this.f7395r.getChildViewHolder(k)) != null) {
                C3185q qVar = C3185q.this;
                C3189d dVar = qVar.f7390m;
                RecyclerView recyclerView = qVar.f7395r;
                int b = dVar.mo11930b(recyclerView, childViewHolder);
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                int d = C2364y.C2369e.m5233d(recyclerView);
                int i3 = b & 3158064;
                if (i3 != 0) {
                    int i4 = b & (~i3);
                    if (d == 0) {
                        i2 = i3 >> 2;
                    } else {
                        int i5 = i3 >> 1;
                        i4 |= -3158065 & i5;
                        i2 = (i5 & 3158064) >> 2;
                    }
                    b = i4 | i2;
                }
                if (((16711680 & b) != 0) && motionEvent.getPointerId(0) == (i = C3185q.this.f7389l)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C3185q qVar2 = C3185q.this;
                    qVar2.f7381d = x;
                    qVar2.f7382e = y;
                    qVar2.f7386i = 0.0f;
                    qVar2.f7385h = 0.0f;
                    C3189d dVar2 = qVar2.f7390m;
                    dVar2.getClass();
                    if (!(dVar2 instanceof C6717c)) {
                        C3185q.this.mo11926p(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$f */
    public static class C3193f implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f7413a;

        /* renamed from: b */
        public final float f7414b;

        /* renamed from: c */
        public final float f7415c;

        /* renamed from: d */
        public final float f7416d;

        /* renamed from: e */
        public final RecyclerView.C3084b0 f7417e;

        /* renamed from: f */
        public final int f7418f;

        /* renamed from: g */
        public final ValueAnimator f7419g;

        /* renamed from: h */
        public boolean f7420h;

        /* renamed from: i */
        public float f7421i;

        /* renamed from: j */
        public float f7422j;

        /* renamed from: k */
        public boolean f7423k = false;

        /* renamed from: l */
        public boolean f7424l = false;

        /* renamed from: m */
        public float f7425m;

        public C3193f(RecyclerView.C3084b0 b0Var, int i, float f, float f2, float f3, float f4) {
            this.f7418f = i;
            this.f7417e = b0Var;
            this.f7413a = f;
            this.f7414b = f2;
            this.f7415c = f3;
            this.f7416d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f7419g = ofFloat;
            ofFloat.addUpdateListener(new C3196s(this));
            ofFloat.setTarget(b0Var.itemView);
            ofFloat.addListener(this);
            this.f7425m = 0.0f;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f7425m = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7424l) {
                this.f7417e.setIsRecyclable(true);
            }
            this.f7424l = true;
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$g */
    public static abstract class C3194g extends C3189d {

        /* renamed from: c */
        public int f7426c = 4;

        /* renamed from: d */
        public int f7427d;

        public C3194g(int i) {
            this.f7427d = i;
        }

        /* renamed from: b */
        public final int mo11930b(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var) {
            int i = this.f7427d;
            int g = mo11942g(recyclerView, b0Var);
            return (g << 8) | ((g | i) << 0) | (i << 16);
        }

        /* renamed from: g */
        public int mo11942g(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var) {
            return this.f7426c;
        }
    }

    public C3185q(C3189d dVar) {
        this.f7390m = dVar;
    }

    /* renamed from: m */
    public static boolean m7783m(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: a */
    public final void mo11683a(View view) {
        mo11925o(view);
        RecyclerView.C3084b0 childViewHolder = this.f7395r.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.C3084b0 b0Var = this.f7380c;
            if (b0Var == null || childViewHolder != b0Var) {
                mo11921j(childViewHolder, false);
                if (this.f7378a.remove(childViewHolder.itemView)) {
                    this.f7390m.getClass();
                    C3189d.m7800a(childViewHolder);
                    return;
                }
                return;
            }
            mo11926p((RecyclerView.C3084b0) null, 0);
        }
    }

    /* renamed from: b */
    public final void mo11684b(View view) {
    }

    /* renamed from: f */
    public final void mo11917f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7395r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f7395r.removeOnItemTouchListener(this.f7403z);
                this.f7395r.removeOnChildAttachStateChangeListener(this);
                int size = this.f7393p.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C3193f fVar = (C3193f) this.f7393p.get(0);
                    fVar.f7419g.cancel();
                    C3189d dVar = this.f7390m;
                    RecyclerView.C3084b0 b0Var = fVar.f7417e;
                    dVar.getClass();
                    C3189d.m7800a(b0Var);
                }
                this.f7393p.clear();
                this.f7400w = null;
                VelocityTracker velocityTracker = this.f7397t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f7397t = null;
                }
                C3192e eVar = this.f7402y;
                if (eVar != null) {
                    eVar.f7411b = false;
                    this.f7402y = null;
                }
                if (this.f7401x != null) {
                    this.f7401x = null;
                }
            }
            this.f7395r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f7383f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.f7384g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.f7394q = ViewConfiguration.get(this.f7395r.getContext()).getScaledTouchSlop();
                this.f7395r.addItemDecoration(this);
                this.f7395r.addOnItemTouchListener(this.f7403z);
                this.f7395r.addOnChildAttachStateChangeListener(this);
                this.f7402y = new C3192e();
                this.f7401x = new C2300f(this.f7395r.getContext(), this.f7402y);
            }
        }
    }

    /* renamed from: g */
    public final int mo11918g(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = this.f7385h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f7397t;
        if (velocityTracker != null && this.f7389l > -1) {
            C3189d dVar = this.f7390m;
            float f = this.f7384g;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f7397t.getXVelocity(this.f7389l);
            float yVelocity = this.f7397t.getYVelocity(this.f7389l);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2) {
                C3189d dVar2 = this.f7390m;
                float f2 = this.f7383f;
                dVar2.getClass();
                if (abs >= f2 && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
        }
        this.f7390m.getClass();
        float width = ((float) this.f7395r.getWidth()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.f7385h) <= width) {
            return 0;
        }
        return i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public final void mo11919h(int i, int i2, MotionEvent motionEvent) {
        int i3;
        View k;
        if (this.f7380c == null && i == 2 && this.f7391n != 2) {
            this.f7390m.getClass();
            if (this.f7395r.getScrollState() != 1) {
                RecyclerView.C3100o layoutManager = this.f7395r.getLayoutManager();
                int i4 = this.f7389l;
                RecyclerView.C3084b0 b0Var = null;
                if (i4 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i4);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f7381d);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f7382e);
                    float f = (float) this.f7394q;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.mo11297f()) && ((abs2 <= abs || !layoutManager.mo11298g()) && (k = mo11922k(motionEvent)) != null))) {
                        b0Var = this.f7395r.getChildViewHolder(k);
                    }
                }
                if (b0Var != null) {
                    C3189d dVar = this.f7390m;
                    RecyclerView recyclerView = this.f7395r;
                    int b = dVar.mo11930b(recyclerView, b0Var);
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    int d = C2364y.C2369e.m5233d(recyclerView);
                    int i5 = b & 3158064;
                    if (i5 != 0) {
                        int i6 = b & (~i5);
                        if (d == 0) {
                            i3 = i5 >> 2;
                        } else {
                            int i7 = i5 >> 1;
                            i6 |= -3158065 & i7;
                            i3 = (i7 & 3158064) >> 2;
                        }
                        b = i6 | i3;
                    }
                    int i8 = (b & 65280) >> 8;
                    if (i8 != 0) {
                        float x = motionEvent.getX(i2);
                        float y = motionEvent.getY(i2);
                        float f2 = x - this.f7381d;
                        float f3 = y - this.f7382e;
                        float abs3 = Math.abs(f2);
                        float abs4 = Math.abs(f3);
                        float f4 = (float) this.f7394q;
                        if (abs3 >= f4 || abs4 >= f4) {
                            if (abs3 > abs4) {
                                if (f2 < 0.0f && (i8 & 4) == 0) {
                                    return;
                                }
                                if (f2 > 0.0f && (i8 & 8) == 0) {
                                    return;
                                }
                            } else if (f3 < 0.0f && (i8 & 1) == 0) {
                                return;
                            } else {
                                if (f3 > 0.0f && (i8 & 2) == 0) {
                                    return;
                                }
                            }
                            this.f7386i = 0.0f;
                            this.f7385h = 0.0f;
                            this.f7389l = motionEvent.getPointerId(0);
                            mo11926p(b0Var, 1);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final int mo11920i(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = this.f7386i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f7397t;
        if (velocityTracker != null && this.f7389l > -1) {
            C3189d dVar = this.f7390m;
            float f = this.f7384g;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f7397t.getXVelocity(this.f7389l);
            float yVelocity = this.f7397t.getYVelocity(this.f7389l);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3) {
                C3189d dVar2 = this.f7390m;
                float f2 = this.f7383f;
                dVar2.getClass();
                if (abs >= f2 && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
        }
        this.f7390m.getClass();
        float height = ((float) this.f7395r.getHeight()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.f7386i) <= height) {
            return 0;
        }
        return i3;
    }

    /* renamed from: j */
    public final void mo11921j(RecyclerView.C3084b0 b0Var, boolean z) {
        C3193f fVar;
        int size = this.f7393p.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (C3193f) this.f7393p.get(size);
            } else {
                return;
            }
        } while (fVar.f7417e != b0Var);
        fVar.f7423k |= z;
        if (!fVar.f7424l) {
            fVar.f7419g.cancel();
        }
        this.f7393p.remove(size);
    }

    /* renamed from: k */
    public final View mo11922k(MotionEvent motionEvent) {
        C3193f fVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C3084b0 b0Var = this.f7380c;
        if (b0Var != null) {
            View view2 = b0Var.itemView;
            if (m7783m(view2, x, y, this.f7387j + this.f7385h, this.f7388k + this.f7386i)) {
                return view2;
            }
        }
        int size = this.f7393p.size();
        do {
            size--;
            if (size < 0) {
                return this.f7395r.findChildViewUnder(x, y);
            }
            fVar = (C3193f) this.f7393p.get(size);
            view = fVar.f7417e.itemView;
        } while (!m7783m(view, x, y, fVar.f7421i, fVar.f7422j));
        return view;
    }

    /* renamed from: l */
    public final void mo11923l(float[] fArr) {
        if ((this.f7392o & 12) != 0) {
            fArr[0] = (this.f7387j + this.f7385h) - ((float) this.f7380c.itemView.getLeft());
        } else {
            fArr[0] = this.f7380c.itemView.getTranslationX();
        }
        if ((this.f7392o & 3) != 0) {
            fArr[1] = (this.f7388k + this.f7386i) - ((float) this.f7380c.itemView.getTop());
        } else {
            fArr[1] = this.f7380c.itemView.getTranslationY();
        }
    }

    /* renamed from: n */
    public final void mo11924n(RecyclerView.C3084b0 b0Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        RecyclerView.C3084b0 b0Var2 = b0Var;
        if (!this.f7395r.isLayoutRequested() && this.f7391n == 2) {
            this.f7390m.getClass();
            int i3 = (int) (this.f7387j + this.f7385h);
            int i4 = (int) (this.f7388k + this.f7386i);
            if (((float) Math.abs(i4 - b0Var2.itemView.getTop())) >= ((float) b0Var2.itemView.getHeight()) * 0.5f || ((float) Math.abs(i3 - b0Var2.itemView.getLeft())) >= ((float) b0Var2.itemView.getWidth()) * 0.5f) {
                ArrayList arrayList2 = this.f7398u;
                if (arrayList2 == null) {
                    this.f7398u = new ArrayList();
                    this.f7399v = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f7399v.clear();
                }
                this.f7390m.getClass();
                int round = Math.round(this.f7387j + this.f7385h) - 0;
                int round2 = Math.round(this.f7388k + this.f7386i) - 0;
                int width = b0Var2.itemView.getWidth() + round + 0;
                int height = b0Var2.itemView.getHeight() + round2 + 0;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                RecyclerView.C3100o layoutManager = this.f7395r.getLayoutManager();
                int y = layoutManager.mo11676y();
                int i7 = 0;
                while (i7 < y) {
                    View x = layoutManager.mo11674x(i7);
                    if (x != b0Var2.itemView && x.getBottom() >= round2 && x.getTop() <= height && x.getRight() >= round && x.getLeft() <= width) {
                        RecyclerView.C3084b0 childViewHolder = this.f7395r.getChildViewHolder(x);
                        this.f7390m.getClass();
                        int abs5 = Math.abs(i5 - ((x.getRight() + x.getLeft()) / 2));
                        int abs6 = Math.abs(i6 - ((x.getBottom() + x.getTop()) / 2));
                        int i8 = (abs6 * abs6) + (abs5 * abs5);
                        int size = this.f7398u.size();
                        i2 = round;
                        i = round2;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size) {
                            int i11 = size;
                            if (i8 <= ((Integer) this.f7399v.get(i9)).intValue()) {
                                break;
                            }
                            i10++;
                            i9++;
                            size = i11;
                        }
                        this.f7398u.add(i10, childViewHolder);
                        this.f7399v.add(i10, Integer.valueOf(i8));
                    } else {
                        i2 = round;
                        i = round2;
                    }
                    i7++;
                    round = i2;
                    round2 = i;
                }
                ArrayList arrayList3 = this.f7398u;
                if (arrayList3.size() != 0) {
                    this.f7390m.getClass();
                    int width2 = b0Var2.itemView.getWidth() + i3;
                    int height2 = b0Var2.itemView.getHeight() + i4;
                    int left2 = i3 - b0Var2.itemView.getLeft();
                    int top2 = i4 - b0Var2.itemView.getTop();
                    int size2 = arrayList3.size();
                    int i12 = -1;
                    RecyclerView.C3084b0 b0Var3 = null;
                    int i13 = 0;
                    while (i13 < size2) {
                        RecyclerView.C3084b0 b0Var4 = (RecyclerView.C3084b0) arrayList3.get(i13);
                        if (left2 <= 0 || (right = b0Var4.itemView.getRight() - width2) >= 0) {
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            if (b0Var4.itemView.getRight() > b0Var2.itemView.getRight() && (abs4 = Math.abs(right)) > i12) {
                                i12 = abs4;
                                b0Var3 = b0Var4;
                            }
                        }
                        if (left2 < 0 && (left = b0Var4.itemView.getLeft() - i3) > 0 && b0Var4.itemView.getLeft() < b0Var2.itemView.getLeft() && (abs3 = Math.abs(left)) > i12) {
                            i12 = abs3;
                            b0Var3 = b0Var4;
                        }
                        if (top2 < 0 && (top = b0Var4.itemView.getTop() - i4) > 0 && b0Var4.itemView.getTop() < b0Var2.itemView.getTop() && (abs2 = Math.abs(top)) > i12) {
                            i12 = abs2;
                            b0Var3 = b0Var4;
                        }
                        if (top2 > 0 && (bottom = b0Var4.itemView.getBottom() - height2) < 0 && b0Var4.itemView.getBottom() > b0Var2.itemView.getBottom() && (abs = Math.abs(bottom)) > i12) {
                            i12 = abs;
                            b0Var3 = b0Var4;
                        }
                        i13++;
                        arrayList3 = arrayList;
                    }
                    if (b0Var3 == null) {
                        this.f7398u.clear();
                        this.f7399v.clear();
                        return;
                    }
                    b0Var3.getAbsoluteAdapterPosition();
                    b0Var.getAbsoluteAdapterPosition();
                    this.f7390m.mo11933e(this.f7395r, b0Var2, b0Var3);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo11925o(View view) {
        if (view == this.f7400w) {
            this.f7400w = null;
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        if (this.f7380c != null) {
            mo11923l(this.f7379b);
            float[] fArr = this.f7379b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        C3189d dVar = this.f7390m;
        RecyclerView.C3084b0 b0Var = this.f7380c;
        ArrayList arrayList = this.f7393p;
        int i = this.f7391n;
        dVar.getClass();
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C3193f fVar = (C3193f) arrayList.get(i2);
            float f4 = fVar.f7413a;
            float f5 = fVar.f7415c;
            if (f4 == f5) {
                fVar.f7421i = fVar.f7417e.itemView.getTranslationX();
            } else {
                fVar.f7421i = C0023f.m103b(f5, f4, fVar.f7425m, f4);
            }
            float f6 = fVar.f7414b;
            float f7 = fVar.f7416d;
            if (f6 == f7) {
                fVar.f7422j = fVar.f7417e.itemView.getTranslationY();
            } else {
                fVar.f7422j = C0023f.m103b(f7, f6, fVar.f7425m, f6);
            }
            int save = canvas.save();
            int i3 = save;
            dVar.mo11932d(canvas, recyclerView, fVar.f7417e, fVar.f7421i, fVar.f7422j, fVar.f7418f, false);
            canvas2.restoreToCount(i3);
            i2++;
        }
        if (b0Var != null) {
            int save2 = canvas.save();
            dVar.mo11932d(canvas, recyclerView, b0Var, f2, f, i, true);
            canvas2.restoreToCount(save2);
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        boolean z = false;
        if (this.f7380c != null) {
            mo11923l(this.f7379b);
            float[] fArr = this.f7379b;
            float f = fArr[0];
            float f2 = fArr[1];
        }
        C3189d dVar = this.f7390m;
        RecyclerView.C3084b0 b0Var = this.f7380c;
        ArrayList arrayList = this.f7393p;
        dVar.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int save = canvas.save();
            View view = ((C3193f) arrayList.get(i)).f7417e.itemView;
            canvas.restoreToCount(save);
        }
        if (b0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C3193f fVar = (C3193f) arrayList.get(i2);
            boolean z2 = fVar.f7424l;
            if (z2 && !fVar.f7420h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r0 == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        r0 = r1 << 1;
        r2 = r2 | (r0 & -789517);
        r0 = (r0 & 789516) << 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r2 > 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e7, code lost:
        if (r0 == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x020e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11926p(androidx.recyclerview.widget.RecyclerView.C3084b0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r11.f7380c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f7391n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f7377B = r0
            int r4 = r11.f7391n
            r14 = 1
            r11.mo11921j(r12, r14)
            r11.f7391n = r13
            r15 = 2
            if (r13 != r15) goto L_0x002d
            if (r12 == 0) goto L_0x0025
            android.view.View r0 = r12.itemView
            r11.f7400w = r0
            goto L_0x002d
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$b0 r9 = r11.f7380c
            r17 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r18 = 3158064(0x303030, float:4.42539E-39)
            r8 = 0
            if (r9 == 0) goto L_0x01ac
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            r7 = 0
            if (r0 == 0) goto L_0x0198
            if (r4 != r15) goto L_0x004f
            r6 = r8
            goto L_0x00ec
        L_0x004f:
            int r0 = r11.f7391n
            if (r0 != r15) goto L_0x0055
            goto L_0x00ea
        L_0x0055:
            androidx.recyclerview.widget.q$d r0 = r11.f7390m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f7395r
            int r0 = r0.mo11930b(r1, r9)
            androidx.recyclerview.widget.q$d r1 = r11.f7390m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f7395r
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r3 = androidx.core.view.C2364y.f5646a
            int r2 = androidx.core.view.C2364y.C2369e.m5233d(r2)
            r1.getClass()
            r1 = r0 & r18
            if (r1 != 0) goto L_0x0070
            r1 = r0
            goto L_0x007d
        L_0x0070:
            int r3 = ~r1
            r3 = r3 & r0
            if (r2 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            int r1 = r1 >> r14
            r2 = r1 & r17
            r3 = r3 | r2
            r1 = r1 & r18
        L_0x007b:
            int r1 = r1 >> r15
            r1 = r1 | r3
        L_0x007d:
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 >> r10
            if (r1 != 0) goto L_0x0086
            goto L_0x00ea
        L_0x0086:
            r0 = r0 & r2
            int r0 = r0 >> r10
            float r2 = r11.f7385h
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.f7386i
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = -789517(0xfffffffffff3f3f3, float:NaN)
            r5 = 789516(0xc0c0c, float:1.106348E-39)
            if (r2 <= 0) goto L_0x00ca
            int r2 = r11.mo11918g(r1)
            if (r2 <= 0) goto L_0x00c3
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00eb
            androidx.recyclerview.widget.RecyclerView r0 = r11.f7395r
            int r0 = androidx.core.view.C2364y.C2369e.m5233d(r0)
            r1 = r2 & r5
            if (r1 != 0) goto L_0x00b2
            goto L_0x00eb
        L_0x00b2:
            int r6 = ~r1
            r2 = r2 & r6
            if (r0 != 0) goto L_0x00b9
        L_0x00b6:
            int r0 = r1 << 2
            goto L_0x00c0
        L_0x00b9:
            int r0 = r1 << 1
            r1 = r0 & r3
            r2 = r2 | r1
            r0 = r0 & r5
            int r0 = r0 << r15
        L_0x00c0:
            r0 = r0 | r2
            r2 = r0
            goto L_0x00eb
        L_0x00c3:
            int r2 = r11.mo11920i(r1)
            if (r2 <= 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ca:
            int r2 = r11.mo11920i(r1)
            if (r2 <= 0) goto L_0x00d1
            goto L_0x00eb
        L_0x00d1:
            int r2 = r11.mo11918g(r1)
            if (r2 <= 0) goto L_0x00ea
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00eb
            androidx.recyclerview.widget.RecyclerView r0 = r11.f7395r
            int r0 = androidx.core.view.C2364y.C2369e.m5233d(r0)
            r1 = r2 & r5
            if (r1 != 0) goto L_0x00e5
            goto L_0x00eb
        L_0x00e5:
            int r6 = ~r1
            r2 = r2 & r6
            if (r0 != 0) goto L_0x00b9
            goto L_0x00b6
        L_0x00ea:
            r2 = r8
        L_0x00eb:
            r6 = r2
        L_0x00ec:
            android.view.VelocityTracker r0 = r11.f7397t
            if (r0 == 0) goto L_0x00f5
            r0.recycle()
            r11.f7397t = r7
        L_0x00f5:
            r0 = 4
            r1 = 0
            if (r6 == r14) goto L_0x011f
            if (r6 == r15) goto L_0x011f
            if (r6 == r0) goto L_0x010c
            if (r6 == r10) goto L_0x010c
            r2 = 16
            if (r6 == r2) goto L_0x010c
            r2 = 32
            if (r6 == r2) goto L_0x010c
            r19 = r1
            r20 = r19
            goto L_0x0131
        L_0x010c:
            float r2 = r11.f7385h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f7395r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r20 = r1
            r19 = r2
            goto L_0x0131
        L_0x011f:
            float r2 = r11.f7386i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f7395r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r19 = r1
            r20 = r2
        L_0x0131:
            if (r4 != r15) goto L_0x0135
            r5 = r10
            goto L_0x013a
        L_0x0135:
            if (r6 <= 0) goto L_0x0139
            r5 = r15
            goto L_0x013a
        L_0x0139:
            r5 = r0
        L_0x013a:
            float[] r0 = r11.f7379b
            r11.mo11923l(r0)
            float[] r0 = r11.f7379b
            r21 = r0[r8]
            r22 = r0[r14]
            androidx.recyclerview.widget.q$c r3 = new androidx.recyclerview.widget.q$c
            r0 = r3
            r1 = r23
            r2 = r9
            r14 = r3
            r3 = r5
            r15 = r5
            r5 = r21
            r21 = r6
            r6 = r22
            r13 = r7
            r7 = r19
            r13 = r8
            r8 = r20
            r20 = r9
            r9 = r21
            r13 = r10
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.q$d r0 = r11.f7390m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f7395r
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.getItemAnimator()
            if (r0 != 0) goto L_0x0179
            if (r15 != r13) goto L_0x0176
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x0180
        L_0x0176:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x0180
        L_0x0179:
            if (r15 != r13) goto L_0x017e
            long r0 = r0.f7066e
            goto L_0x0180
        L_0x017e:
            long r0 = r0.f7065d
        L_0x0180:
            android.animation.ValueAnimator r2 = r14.f7419g
            r2.setDuration(r0)
            java.util.ArrayList r0 = r11.f7393p
            r0.add(r14)
            r0 = r20
            r1 = 0
            r0.setIsRecyclable(r1)
            android.animation.ValueAnimator r0 = r14.f7419g
            r0.start()
            r0 = 0
            r8 = 1
            goto L_0x01a9
        L_0x0198:
            r0 = r9
            r13 = r10
            android.view.View r1 = r0.itemView
            r11.mo11925o(r1)
            androidx.recyclerview.widget.q$d r1 = r11.f7390m
            r1.getClass()
            androidx.recyclerview.widget.C3185q.C3189d.m7800a(r0)
            r0 = 0
            r8 = 0
        L_0x01a9:
            r11.f7380c = r0
            goto L_0x01ae
        L_0x01ac:
            r13 = r10
            r8 = 0
        L_0x01ae:
            if (r12 == 0) goto L_0x01fb
            androidx.recyclerview.widget.q$d r0 = r11.f7390m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f7395r
            int r0 = r0.mo11930b(r1, r12)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r2 = androidx.core.view.C2364y.f5646a
            int r1 = androidx.core.view.C2364y.C2369e.m5233d(r1)
            r2 = r0 & r18
            if (r2 != 0) goto L_0x01c3
            goto L_0x01d3
        L_0x01c3:
            int r3 = ~r2
            r0 = r0 & r3
            if (r1 != 0) goto L_0x01c9
            r1 = 2
            goto L_0x01d1
        L_0x01c9:
            r1 = 2
            r3 = 1
            int r2 = r2 >> r3
            r3 = r2 & r17
            r0 = r0 | r3
            r2 = r2 & r18
        L_0x01d1:
            int r2 = r2 >> r1
            r0 = r0 | r2
        L_0x01d3:
            r0 = r0 & r16
            int r1 = r11.f7391n
            int r1 = r1 * r13
            int r0 = r0 >> r1
            r11.f7392o = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f7387j = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f7388k = r0
            r11.f7380c = r12
            r0 = r25
            r1 = 2
            if (r0 != r1) goto L_0x01fb
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x01fc
        L_0x01fb:
            r1 = 0
        L_0x01fc:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f7395r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x020c
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r11.f7380c
            if (r2 == 0) goto L_0x0209
            r1 = 1
        L_0x0209:
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x020c:
            if (r8 != 0) goto L_0x0217
            androidx.recyclerview.widget.RecyclerView r0 = r11.f7395r
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            r1 = 1
            r0.f7076f = r1
        L_0x0217:
            androidx.recyclerview.widget.q$d r0 = r11.f7390m
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView r0 = r11.f7395r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3185q.mo11926p(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    /* renamed from: q */
    public final void mo11927q(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f7381d;
        this.f7385h = f;
        this.f7386i = y - this.f7382e;
        if ((i & 4) == 0) {
            this.f7385h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f7385h = Math.min(0.0f, this.f7385h);
        }
        if ((i & 1) == 0) {
            this.f7386i = Math.max(0.0f, this.f7386i);
        }
        if ((i & 2) == 0) {
            this.f7386i = Math.min(0.0f, this.f7386i);
        }
    }
}
