package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.compose.foundation.layout.C0753p;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p289y0.C8352d;

/* renamed from: androidx.core.view.v0 */
public final class C2336v0 {

    /* renamed from: a */
    public C2346e f5587a;

    /* renamed from: androidx.core.view.v0$b */
    public static abstract class C2338b {

        /* renamed from: b */
        public WindowInsets f5590b;

        /* renamed from: c */
        public final int f5591c;

        public C2338b(int i) {
            this.f5591c = i;
        }

        /* renamed from: a */
        public abstract void mo4137a(C2336v0 v0Var);

        /* renamed from: c */
        public abstract void mo4138c(C2336v0 v0Var);

        /* renamed from: d */
        public abstract C2348w0 mo4139d(C2348w0 w0Var, List<C2336v0> list);

        /* renamed from: e */
        public abstract C2337a mo4140e(C2336v0 v0Var, C2337a aVar);
    }

    /* renamed from: androidx.core.view.v0$c */
    public static class C2339c extends C2346e {

        /* renamed from: androidx.core.view.v0$c$a */
        public static class C2340a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final C2338b f5592a;

            /* renamed from: b */
            public C2348w0 f5593b;

            /* renamed from: androidx.core.view.v0$c$a$a */
            public class C2341a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ C2336v0 f5594a;

                /* renamed from: b */
                public final /* synthetic */ C2348w0 f5595b;

                /* renamed from: c */
                public final /* synthetic */ C2348w0 f5596c;

                /* renamed from: d */
                public final /* synthetic */ int f5597d;

                /* renamed from: e */
                public final /* synthetic */ View f5598e;

                public C2341a(C2336v0 v0Var, C2348w0 w0Var, C2348w0 w0Var2, int i, View view) {
                    this.f5594a = v0Var;
                    this.f5595b = w0Var;
                    this.f5596c = w0Var2;
                    this.f5597d = i;
                    this.f5598e = view;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C2348w0 w0Var;
                    C2348w0 w0Var2;
                    float f;
                    this.f5594a.f5587a.mo8935d(valueAnimator.getAnimatedFraction());
                    C2348w0 w0Var3 = this.f5595b;
                    C2348w0 w0Var4 = this.f5596c;
                    float b = this.f5594a.f5587a.mo8933b();
                    int i = this.f5597d;
                    int i2 = Build.VERSION.SDK_INT;
                    C2348w0.C2353e dVar = i2 >= 30 ? new C2348w0.C2352d(w0Var3) : i2 >= 29 ? new C2348w0.C2351c(w0Var3) : new C2348w0.C2350b(w0Var3);
                    int i3 = 1;
                    while (i3 <= 256) {
                        if ((i & i3) == 0) {
                            dVar.mo8958c(i3, w0Var3.mo8942b(i3));
                            w0Var2 = w0Var3;
                            w0Var = w0Var4;
                            f = b;
                        } else {
                            C8352d b2 = w0Var3.mo8942b(i3);
                            C8352d b3 = w0Var4.mo8942b(i3);
                            float f2 = 1.0f - b;
                            w0Var2 = w0Var3;
                            w0Var = w0Var4;
                            f = b;
                            dVar.mo8958c(i3, C2348w0.m5099h(b2, (int) (((double) (((float) (b2.f18320a - b3.f18320a)) * f2)) + 0.5d), (int) (((double) (((float) (b2.f18321b - b3.f18321b)) * f2)) + 0.5d), (int) (((double) (((float) (b2.f18322c - b3.f18322c)) * f2)) + 0.5d), (int) (((double) (((float) (b2.f18323d - b3.f18323d)) * f2)) + 0.5d)));
                        }
                        i3 <<= 1;
                        w0Var4 = w0Var;
                        b = f;
                        w0Var3 = w0Var2;
                    }
                    C2339c.m5080g(this.f5598e, dVar.mo8952b(), Collections.singletonList(this.f5594a));
                }
            }

            /* renamed from: androidx.core.view.v0$c$a$b */
            public class C2342b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ C2336v0 f5599a;

                /* renamed from: b */
                public final /* synthetic */ View f5600b;

                public C2342b(C2336v0 v0Var, View view) {
                    this.f5599a = v0Var;
                    this.f5600b = view;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f5599a.f5587a.mo8935d(1.0f);
                    C2339c.m5078e(this.f5600b, this.f5599a);
                }
            }

            /* renamed from: androidx.core.view.v0$c$a$c */
            public class C2343c implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ View f5601b;

                /* renamed from: c */
                public final /* synthetic */ C2336v0 f5602c;

                /* renamed from: d */
                public final /* synthetic */ C2337a f5603d;

                /* renamed from: e */
                public final /* synthetic */ ValueAnimator f5604e;

                public C2343c(View view, C2336v0 v0Var, C2337a aVar, ValueAnimator valueAnimator) {
                    this.f5601b = view;
                    this.f5602c = v0Var;
                    this.f5603d = aVar;
                    this.f5604e = valueAnimator;
                }

                public final void run() {
                    C2339c.m5081h(this.f5601b, this.f5602c, this.f5603d);
                    this.f5604e.start();
                }
            }

            public C2340a(View view, C0753p pVar) {
                C2348w0 w0Var;
                this.f5592a = pVar;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2348w0 a = C2364y.C2375j.m5280a(view);
                if (a != null) {
                    int i = Build.VERSION.SDK_INT;
                    w0Var = (i >= 30 ? new C2348w0.C2352d(a) : i >= 29 ? new C2348w0.C2351c(a) : new C2348w0.C2350b(a)).mo8952b();
                } else {
                    w0Var = null;
                }
                this.f5593b = w0Var;
            }

            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f5593b = C2348w0.m5100k(view, windowInsets);
                    return C2339c.m5082i(view, windowInsets);
                }
                C2348w0 k = C2348w0.m5100k(view, windowInsets);
                if (this.f5593b == null) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    this.f5593b = C2364y.C2375j.m5280a(view);
                }
                if (this.f5593b == null) {
                    this.f5593b = k;
                    return C2339c.m5082i(view, windowInsets);
                }
                C2338b j = C2339c.m5083j(view);
                if (j != null && Objects.equals(j.f5590b, windowInsets)) {
                    return C2339c.m5082i(view, windowInsets);
                }
                C2348w0 w0Var = this.f5593b;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!k.mo8942b(i2).equals(w0Var.mo8942b(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return C2339c.m5082i(view, windowInsets);
                }
                C2348w0 w0Var2 = this.f5593b;
                C2336v0 v0Var = new C2336v0(i, new DecelerateInterpolator(), 160);
                v0Var.f5587a.mo8935d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(v0Var.f5587a.mo8932a());
                C8352d b = k.mo8942b(i);
                C8352d b2 = w0Var2.mo8942b(i);
                C2337a aVar = new C2337a(C8352d.m16668b(Math.min(b.f18320a, b2.f18320a), Math.min(b.f18321b, b2.f18321b), Math.min(b.f18322c, b2.f18322c), Math.min(b.f18323d, b2.f18323d)), C8352d.m16668b(Math.max(b.f18320a, b2.f18320a), Math.max(b.f18321b, b2.f18321b), Math.max(b.f18322c, b2.f18322c), Math.max(b.f18323d, b2.f18323d)));
                C2339c.m5079f(view, v0Var, windowInsets, false);
                duration.addUpdateListener(new C2341a(v0Var, k, w0Var2, i, view));
                duration.addListener(new C2342b(v0Var, view));
                OneShotPreDrawListener.add(view, new C2343c(view, v0Var, aVar, duration));
                this.f5593b = k;
                return C2339c.m5082i(view, windowInsets);
            }
        }

        public C2339c(int i, DecelerateInterpolator decelerateInterpolator, long j) {
            super(i, decelerateInterpolator, j);
        }

        /* renamed from: e */
        public static void m5078e(View view, C2336v0 v0Var) {
            C2338b j = m5083j(view);
            if (j != null) {
                j.mo4137a(v0Var);
                if (j.f5591c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m5078e(viewGroup.getChildAt(i), v0Var);
                }
            }
        }

        /* renamed from: f */
        public static void m5079f(View view, C2336v0 v0Var, WindowInsets windowInsets, boolean z) {
            C2338b j = m5083j(view);
            if (j != null) {
                j.f5590b = windowInsets;
                if (!z) {
                    j.mo4138c(v0Var);
                    z = j.f5591c == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m5079f(viewGroup.getChildAt(i), v0Var, windowInsets, z);
                }
            }
        }

        /* renamed from: g */
        public static void m5080g(View view, C2348w0 w0Var, List<C2336v0> list) {
            C2338b j = m5083j(view);
            if (j != null) {
                w0Var = j.mo4139d(w0Var, list);
                if (j.f5591c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m5080g(viewGroup.getChildAt(i), w0Var, list);
                }
            }
        }

        /* renamed from: h */
        public static void m5081h(View view, C2336v0 v0Var, C2337a aVar) {
            C2338b j = m5083j(view);
            if (j != null) {
                j.mo4140e(v0Var, aVar);
                if (j.f5591c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m5081h(viewGroup.getChildAt(i), v0Var, aVar);
                }
            }
        }

        /* renamed from: i */
        public static WindowInsets m5082i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: j */
        public static C2338b m5083j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof C2340a) {
                return ((C2340a) tag).f5592a;
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.v0$e */
    public static class C2346e {

        /* renamed from: a */
        public final int f5610a;

        /* renamed from: b */
        public float f5611b;

        /* renamed from: c */
        public final Interpolator f5612c;

        /* renamed from: d */
        public final long f5613d;

        public C2346e(int i, DecelerateInterpolator decelerateInterpolator, long j) {
            this.f5610a = i;
            this.f5612c = decelerateInterpolator;
            this.f5613d = j;
        }

        /* renamed from: a */
        public long mo8932a() {
            return this.f5613d;
        }

        /* renamed from: b */
        public float mo8933b() {
            Interpolator interpolator = this.f5612c;
            return interpolator != null ? interpolator.getInterpolation(this.f5611b) : this.f5611b;
        }

        /* renamed from: c */
        public int mo8934c() {
            return this.f5610a;
        }

        /* renamed from: d */
        public void mo8935d(float f) {
            this.f5611b = f;
        }
    }

    public C2336v0(int i, DecelerateInterpolator decelerateInterpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5587a = new C2344d(i, decelerateInterpolator, j);
        } else {
            this.f5587a = new C2339c(i, decelerateInterpolator, j);
        }
    }

    /* renamed from: androidx.core.view.v0$d */
    public static class C2344d extends C2346e {

        /* renamed from: e */
        public final WindowInsetsAnimation f5605e;

        /* renamed from: androidx.core.view.v0$d$a */
        public static class C2345a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final C2338b f5606a;

            /* renamed from: b */
            public List<C2336v0> f5607b;

            /* renamed from: c */
            public ArrayList<C2336v0> f5608c;

            /* renamed from: d */
            public final HashMap<WindowInsetsAnimation, C2336v0> f5609d = new HashMap<>();

            public C2345a(C0753p pVar) {
                super(pVar.f5591c);
                this.f5606a = pVar;
            }

            /* renamed from: a */
            public final C2336v0 mo8936a(WindowInsetsAnimation windowInsetsAnimation) {
                C2336v0 v0Var = this.f5609d.get(windowInsetsAnimation);
                if (v0Var == null) {
                    v0Var = new C2336v0(0, (DecelerateInterpolator) null, 0);
                    if (Build.VERSION.SDK_INT >= 30) {
                        v0Var.f5587a = new C2344d(windowInsetsAnimation);
                    }
                    this.f5609d.put(windowInsetsAnimation, v0Var);
                }
                return v0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f5606a.mo4137a(mo8936a(windowInsetsAnimation));
                this.f5609d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f5606a.mo4138c(mo8936a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C2336v0> arrayList = this.f5608c;
                if (arrayList == null) {
                    ArrayList<C2336v0> arrayList2 = new ArrayList<>(list.size());
                    this.f5608c = arrayList2;
                    this.f5607b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return this.f5606a.mo4139d(C2348w0.m5100k((View) null, windowInsets), this.f5607b).mo8951j();
                    }
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    C2336v0 a = mo8936a(windowInsetsAnimation);
                    a.f5587a.mo8935d(windowInsetsAnimation.getFraction());
                    this.f5608c.add(a);
                }
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                C2337a e = this.f5606a.mo4140e(mo8936a(windowInsetsAnimation), new C2337a(bounds));
                e.getClass();
                return C2344d.m5084e(e);
            }
        }

        public C2344d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (DecelerateInterpolator) null, 0);
            this.f5605e = windowInsetsAnimation;
        }

        /* renamed from: e */
        public static WindowInsetsAnimation.Bounds m5084e(C2337a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.f5588a.mo20940d(), aVar.f5589b.mo20940d());
        }

        /* renamed from: f */
        public static C8352d m5085f(WindowInsetsAnimation.Bounds bounds) {
            return C8352d.m16669c(bounds.getUpperBound());
        }

        /* renamed from: g */
        public static C8352d m5086g(WindowInsetsAnimation.Bounds bounds) {
            return C8352d.m16669c(bounds.getLowerBound());
        }

        /* renamed from: a */
        public final long mo8932a() {
            return this.f5605e.getDurationMillis();
        }

        /* renamed from: b */
        public final float mo8933b() {
            return this.f5605e.getInterpolatedFraction();
        }

        /* renamed from: c */
        public final int mo8934c() {
            return this.f5605e.getTypeMask();
        }

        /* renamed from: d */
        public final void mo8935d(float f) {
            this.f5605e.setFraction(f);
        }

        public C2344d(int i, DecelerateInterpolator decelerateInterpolator, long j) {
            this(new WindowInsetsAnimation(i, decelerateInterpolator, j));
        }
    }

    /* renamed from: androidx.core.view.v0$a */
    public static final class C2337a {

        /* renamed from: a */
        public final C8352d f5588a;

        /* renamed from: b */
        public final C8352d f5589b;

        public C2337a(C8352d dVar, C8352d dVar2) {
            this.f5588a = dVar;
            this.f5589b = dVar2;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Bounds{lower=");
            h.append(this.f5588a);
            h.append(" upper=");
            h.append(this.f5589b);
            h.append("}");
            return h.toString();
        }

        public C2337a(WindowInsetsAnimation.Bounds bounds) {
            this.f5588a = C2344d.m5086g(bounds);
            this.f5589b = C2344d.m5085f(bounds);
        }
    }
}
