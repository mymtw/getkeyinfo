package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import androidx.core.view.C2364y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p003a2.C0015b;
import p289y0.C8352d;

/* renamed from: androidx.core.view.w0 */
public final class C2348w0 {

    /* renamed from: b */
    public static final C2348w0 f5614b;

    /* renamed from: a */
    public final C2359k f5615a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.w0$a */
    public static class C2349a {

        /* renamed from: a */
        public static Field f5616a;

        /* renamed from: b */
        public static Field f5617b;

        /* renamed from: c */
        public static Field f5618c;

        /* renamed from: d */
        public static boolean f5619d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5616a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5617b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5618c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder h = C0072d.m201h("Failed to get visible insets from AttachInfo ");
                h.append(e.getMessage());
                Log.w("WindowInsetsCompat", h.toString(), e);
            }
        }
    }

    /* renamed from: androidx.core.view.w0$d */
    public static class C2352d extends C2351c {
        public C2352d() {
        }

        /* renamed from: c */
        public void mo8958c(int i, C8352d dVar) {
            this.f5626c.setInsets(C2361m.m5181a(i), dVar.mo20940d());
        }

        public C2352d(C2348w0 w0Var) {
            super(w0Var);
        }
    }

    /* renamed from: androidx.core.view.w0$e */
    public static class C2353e {

        /* renamed from: a */
        public final C2348w0 f5627a;

        /* renamed from: b */
        public C8352d[] f5628b;

        public C2353e() {
            this(new C2348w0());
        }

        /* renamed from: a */
        public final void mo8959a() {
            C8352d[] dVarArr = this.f5628b;
            if (dVarArr != null) {
                C8352d dVar = dVarArr[C2360l.m5180a(1)];
                C8352d dVar2 = this.f5628b[C2360l.m5180a(2)];
                if (dVar2 == null) {
                    dVar2 = this.f5627a.mo8942b(2);
                }
                if (dVar == null) {
                    dVar = this.f5627a.mo8942b(1);
                }
                mo8954g(C8352d.m16667a(dVar, dVar2));
                C8352d dVar3 = this.f5628b[C2360l.m5180a(16)];
                if (dVar3 != null) {
                    mo8956f(dVar3);
                }
                C8352d dVar4 = this.f5628b[C2360l.m5180a(32)];
                if (dVar4 != null) {
                    mo8955d(dVar4);
                }
                C8352d dVar5 = this.f5628b[C2360l.m5180a(64)];
                if (dVar5 != null) {
                    mo8957h(dVar5);
                }
            }
        }

        /* renamed from: b */
        public C2348w0 mo8952b() {
            throw null;
        }

        /* renamed from: c */
        public void mo8958c(int i, C8352d dVar) {
            if (this.f5628b == null) {
                this.f5628b = new C8352d[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f5628b[C2360l.m5180a(i2)] = dVar;
                }
            }
        }

        /* renamed from: d */
        public void mo8955d(C8352d dVar) {
        }

        /* renamed from: e */
        public void mo8953e(C8352d dVar) {
            throw null;
        }

        /* renamed from: f */
        public void mo8956f(C8352d dVar) {
        }

        /* renamed from: g */
        public void mo8954g(C8352d dVar) {
            throw null;
        }

        /* renamed from: h */
        public void mo8957h(C8352d dVar) {
        }

        public C2353e(C2348w0 w0Var) {
            this.f5627a = w0Var;
        }
    }

    /* renamed from: androidx.core.view.w0$f */
    public static class C2354f extends C2359k {

        /* renamed from: h */
        public static boolean f5629h = false;

        /* renamed from: i */
        public static Method f5630i;

        /* renamed from: j */
        public static Class<?> f5631j;

        /* renamed from: k */
        public static Field f5632k;

        /* renamed from: l */
        public static Field f5633l;

        /* renamed from: c */
        public final WindowInsets f5634c;

        /* renamed from: d */
        public C8352d[] f5635d;

        /* renamed from: e */
        public C8352d f5636e = null;

        /* renamed from: f */
        public C2348w0 f5637f;

        /* renamed from: g */
        public C8352d f5638g;

        public C2354f(C2348w0 w0Var, WindowInsets windowInsets) {
            super(w0Var);
            this.f5634c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C8352d m5129t(int i, boolean z) {
            C8352d dVar = C8352d.f18319e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    dVar = C8352d.m16667a(dVar, mo8970u(i2, z));
                }
            }
            return dVar;
        }

        /* renamed from: v */
        private C8352d m5130v() {
            C2348w0 w0Var = this.f5637f;
            return w0Var != null ? w0Var.f5615a.mo8975i() : C8352d.f18319e;
        }

        /* renamed from: w */
        private C8352d m5131w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5629h) {
                    m5132y();
                }
                Method method = f5630i;
                if (!(method == null || f5631j == null || f5632k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f5632k.get(f5633l.get(invoke));
                        if (rect != null) {
                            return C8352d.m16668b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        StringBuilder h = C0072d.m201h("Failed to get visible insets. (Reflection error). ");
                        h.append(e.getMessage());
                        Log.e("WindowInsetsCompat", h.toString(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: y */
        private static void m5132y() {
            try {
                f5630i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5631j = cls;
                f5632k = cls.getDeclaredField("mVisibleInsets");
                f5633l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5632k.setAccessible(true);
                f5633l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder h = C0072d.m201h("Failed to get visible insets. (Reflection error). ");
                h.append(e.getMessage());
                Log.e("WindowInsetsCompat", h.toString(), e);
            }
            f5629h = true;
        }

        /* renamed from: d */
        public void mo8960d(View view) {
            C8352d w = m5131w(view);
            if (w == null) {
                w = C8352d.f18319e;
            }
            mo8972z(w);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5638g, ((C2354f) obj).f5638g);
        }

        /* renamed from: f */
        public C8352d mo8962f(int i) {
            return m5129t(i, false);
        }

        /* renamed from: g */
        public C8352d mo8963g(int i) {
            return m5129t(i, true);
        }

        /* renamed from: k */
        public final C8352d mo8964k() {
            if (this.f5636e == null) {
                this.f5636e = C8352d.m16668b(this.f5634c.getSystemWindowInsetLeft(), this.f5634c.getSystemWindowInsetTop(), this.f5634c.getSystemWindowInsetRight(), this.f5634c.getSystemWindowInsetBottom());
            }
            return this.f5636e;
        }

        /* renamed from: m */
        public C2348w0 mo8965m(int i, int i2, int i3, int i4) {
            C2348w0 k = C2348w0.m5100k((View) null, this.f5634c);
            int i5 = Build.VERSION.SDK_INT;
            C2353e dVar = i5 >= 30 ? new C2352d(k) : i5 >= 29 ? new C2351c(k) : new C2350b(k);
            dVar.mo8954g(C2348w0.m5099h(mo8964k(), i, i2, i3, i4));
            dVar.mo8953e(C2348w0.m5099h(mo8975i(), i, i2, i3, i4));
            return dVar.mo8952b();
        }

        /* renamed from: o */
        public boolean mo8966o() {
            return this.f5634c.isRound();
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: p */
        public boolean mo8967p(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !mo8971x(i2)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: q */
        public void mo8968q(C8352d[] dVarArr) {
            this.f5635d = dVarArr;
        }

        /* renamed from: r */
        public void mo8969r(C2348w0 w0Var) {
            this.f5637f = w0Var;
        }

        /* renamed from: u */
        public C8352d mo8970u(int i, boolean z) {
            int i2;
            if (i == 1) {
                return z ? C8352d.m16668b(0, Math.max(m5130v().f18321b, mo8964k().f18321b), 0, 0) : C8352d.m16668b(0, mo8964k().f18321b, 0, 0);
            }
            C8352d dVar = null;
            if (i != 2) {
                if (i == 8) {
                    C8352d[] dVarArr = this.f5635d;
                    if (dVarArr != null) {
                        dVar = dVarArr[C2360l.m5180a(8)];
                    }
                    if (dVar != null) {
                        return dVar;
                    }
                    C8352d k = mo8964k();
                    C8352d v = m5130v();
                    int i3 = k.f18323d;
                    if (i3 > v.f18323d) {
                        return C8352d.m16668b(0, 0, 0, i3);
                    }
                    C8352d dVar2 = this.f5638g;
                    return (dVar2 == null || dVar2.equals(C8352d.f18319e) || (i2 = this.f5638g.f18323d) <= v.f18323d) ? C8352d.f18319e : C8352d.m16668b(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo8982j();
                } else {
                    if (i == 32) {
                        return mo8981h();
                    }
                    if (i == 64) {
                        return mo8983l();
                    }
                    if (i != 128) {
                        return C8352d.f18319e;
                    }
                    C2348w0 w0Var = this.f5637f;
                    C2298e a = w0Var != null ? w0Var.mo8941a() : mo8979e();
                    return a != null ? C8352d.m16668b(a.mo8890b(), a.mo8892d(), a.mo8891c(), a.mo8889a()) : C8352d.f18319e;
                }
            } else if (z) {
                C8352d v2 = m5130v();
                C8352d i4 = mo8975i();
                return C8352d.m16668b(Math.max(v2.f18320a, i4.f18320a), 0, Math.max(v2.f18322c, i4.f18322c), Math.max(v2.f18323d, i4.f18323d));
            } else {
                C8352d k2 = mo8964k();
                C2348w0 w0Var2 = this.f5637f;
                if (w0Var2 != null) {
                    dVar = w0Var2.f5615a.mo8975i();
                }
                int i5 = k2.f18323d;
                if (dVar != null) {
                    i5 = Math.min(i5, dVar.f18323d);
                }
                return C8352d.m16668b(k2.f18320a, 0, k2.f18322c, i5);
            }
        }

        /* renamed from: x */
        public boolean mo8971x(int i) {
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return false;
                }
                if (!(i == 8 || i == 128)) {
                    return true;
                }
            }
            return !mo8970u(i, false).equals(C8352d.f18319e);
        }

        /* renamed from: z */
        public void mo8972z(C8352d dVar) {
            this.f5638g = dVar;
        }
    }

    /* renamed from: androidx.core.view.w0$g */
    public static class C2355g extends C2354f {

        /* renamed from: m */
        public C8352d f5639m = null;

        public C2355g(C2348w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        /* renamed from: b */
        public C2348w0 mo8973b() {
            return C2348w0.m5100k((View) null, this.f5634c.consumeStableInsets());
        }

        /* renamed from: c */
        public C2348w0 mo8974c() {
            return C2348w0.m5100k((View) null, this.f5634c.consumeSystemWindowInsets());
        }

        /* renamed from: i */
        public final C8352d mo8975i() {
            if (this.f5639m == null) {
                this.f5639m = C8352d.m16668b(this.f5634c.getStableInsetLeft(), this.f5634c.getStableInsetTop(), this.f5634c.getStableInsetRight(), this.f5634c.getStableInsetBottom());
            }
            return this.f5639m;
        }

        /* renamed from: n */
        public boolean mo8976n() {
            return this.f5634c.isConsumed();
        }

        /* renamed from: s */
        public void mo8977s(C8352d dVar) {
            this.f5639m = dVar;
        }
    }

    /* renamed from: androidx.core.view.w0$h */
    public static class C2356h extends C2355g {
        public C2356h(C2348w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        /* renamed from: a */
        public C2348w0 mo8978a() {
            return C2348w0.m5100k((View) null, this.f5634c.consumeDisplayCutout());
        }

        /* renamed from: e */
        public C2298e mo8979e() {
            DisplayCutout b = this.f5634c.getDisplayCutout();
            if (b == null) {
                return null;
            }
            return new C2298e(b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2356h)) {
                return false;
            }
            C2356h hVar = (C2356h) obj;
            return Objects.equals(this.f5634c, hVar.f5634c) && Objects.equals(this.f5638g, hVar.f5638g);
        }

        public int hashCode() {
            return this.f5634c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.w0$i */
    public static class C2357i extends C2356h {

        /* renamed from: n */
        public C8352d f5640n = null;

        /* renamed from: o */
        public C8352d f5641o = null;

        /* renamed from: p */
        public C8352d f5642p = null;

        public C2357i(C2348w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        /* renamed from: h */
        public C8352d mo8981h() {
            if (this.f5641o == null) {
                this.f5641o = C8352d.m16669c(this.f5634c.getMandatorySystemGestureInsets());
            }
            return this.f5641o;
        }

        /* renamed from: j */
        public C8352d mo8982j() {
            if (this.f5640n == null) {
                this.f5640n = C8352d.m16669c(this.f5634c.getSystemGestureInsets());
            }
            return this.f5640n;
        }

        /* renamed from: l */
        public C8352d mo8983l() {
            if (this.f5642p == null) {
                this.f5642p = C8352d.m16669c(this.f5634c.getTappableElementInsets());
            }
            return this.f5642p;
        }

        /* renamed from: m */
        public C2348w0 mo8965m(int i, int i2, int i3, int i4) {
            return C2348w0.m5100k((View) null, this.f5634c.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo8977s(C8352d dVar) {
        }
    }

    /* renamed from: androidx.core.view.w0$j */
    public static class C2358j extends C2357i {

        /* renamed from: q */
        public static final C2348w0 f5643q = C2348w0.m5100k((View) null, WindowInsets.CONSUMED);

        public C2358j(C2348w0 w0Var, WindowInsets windowInsets) {
            super(w0Var, windowInsets);
        }

        /* renamed from: d */
        public final void mo8960d(View view) {
        }

        /* renamed from: f */
        public C8352d mo8962f(int i) {
            return C8352d.m16669c(this.f5634c.getInsets(C2361m.m5181a(i)));
        }

        /* renamed from: g */
        public C8352d mo8963g(int i) {
            return C8352d.m16669c(this.f5634c.getInsetsIgnoringVisibility(C2361m.m5181a(i)));
        }

        /* renamed from: p */
        public boolean mo8967p(int i) {
            return this.f5634c.isVisible(C2361m.m5181a(i));
        }
    }

    /* renamed from: androidx.core.view.w0$k */
    public static class C2359k {

        /* renamed from: b */
        public static final C2348w0 f5644b;

        /* renamed from: a */
        public final C2348w0 f5645a;

        static {
            int i = Build.VERSION.SDK_INT;
            f5644b = (i >= 30 ? new C2352d() : i >= 29 ? new C2351c() : new C2350b()).mo8952b().f5615a.mo8978a().f5615a.mo8973b().f5615a.mo8974c();
        }

        public C2359k(C2348w0 w0Var) {
            this.f5645a = w0Var;
        }

        /* renamed from: a */
        public C2348w0 mo8978a() {
            return this.f5645a;
        }

        /* renamed from: b */
        public C2348w0 mo8973b() {
            return this.f5645a;
        }

        /* renamed from: c */
        public C2348w0 mo8974c() {
            return this.f5645a;
        }

        /* renamed from: d */
        public void mo8960d(View view) {
        }

        /* renamed from: e */
        public C2298e mo8979e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2359k)) {
                return false;
            }
            C2359k kVar = (C2359k) obj;
            return mo8966o() == kVar.mo8966o() && mo8976n() == kVar.mo8976n() && Objects.equals(mo8964k(), kVar.mo8964k()) && Objects.equals(mo8975i(), kVar.mo8975i()) && Objects.equals(mo8979e(), kVar.mo8979e());
        }

        /* renamed from: f */
        public C8352d mo8962f(int i) {
            return C8352d.f18319e;
        }

        /* renamed from: g */
        public C8352d mo8963g(int i) {
            if ((i & 8) == 0) {
                return C8352d.f18319e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        /* renamed from: h */
        public C8352d mo8981h() {
            return mo8964k();
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(mo8966o()), Boolean.valueOf(mo8976n()), mo8964k(), mo8975i(), mo8979e()});
        }

        /* renamed from: i */
        public C8352d mo8975i() {
            return C8352d.f18319e;
        }

        /* renamed from: j */
        public C8352d mo8982j() {
            return mo8964k();
        }

        /* renamed from: k */
        public C8352d mo8964k() {
            return C8352d.f18319e;
        }

        /* renamed from: l */
        public C8352d mo8983l() {
            return mo8964k();
        }

        /* renamed from: m */
        public C2348w0 mo8965m(int i, int i2, int i3, int i4) {
            return f5644b;
        }

        /* renamed from: n */
        public boolean mo8976n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo8966o() {
            return false;
        }

        /* renamed from: p */
        public boolean mo8967p(int i) {
            return true;
        }

        /* renamed from: q */
        public void mo8968q(C8352d[] dVarArr) {
        }

        /* renamed from: r */
        public void mo8969r(C2348w0 w0Var) {
        }

        /* renamed from: s */
        public void mo8977s(C8352d dVar) {
        }
    }

    /* renamed from: androidx.core.view.w0$l */
    public static final class C2360l {
        /* renamed from: a */
        public static int m5180a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(C0015b.m88g("type needs to be >= FIRST and <= LAST, type=", i));
        }
    }

    /* renamed from: androidx.core.view.w0$m */
    public static final class C2361m {
        /* renamed from: a */
        public static int m5181a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets$Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets$Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets$Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets$Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets$Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets$Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets$Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5614b = C2358j.f5643q;
        } else {
            f5614b = C2359k.f5644b;
        }
    }

    public C2348w0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5615a = new C2358j(this, windowInsets);
        } else if (i >= 29) {
            this.f5615a = new C2357i(this, windowInsets);
        } else if (i >= 28) {
            this.f5615a = new C2356h(this, windowInsets);
        } else {
            this.f5615a = new C2355g(this, windowInsets);
        }
    }

    /* renamed from: h */
    public static C8352d m5099h(C8352d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f18320a - i);
        int max2 = Math.max(0, dVar.f18321b - i2);
        int max3 = Math.max(0, dVar.f18322c - i3);
        int max4 = Math.max(0, dVar.f18323d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? dVar : C8352d.m16668b(max, max2, max3, max4);
    }

    /* renamed from: k */
    public static C2348w0 m5100k(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C2348w0 w0Var = new C2348w0(windowInsets);
        if (view != null) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2371g.m5245b(view)) {
                w0Var.f5615a.mo8969r(C2364y.C2375j.m5280a(view));
                w0Var.f5615a.mo8960d(view.getRootView());
            }
        }
        return w0Var;
    }

    /* renamed from: a */
    public final C2298e mo8941a() {
        return this.f5615a.mo8979e();
    }

    /* renamed from: b */
    public final C8352d mo8942b(int i) {
        return this.f5615a.mo8962f(i);
    }

    /* renamed from: c */
    public final C8352d mo8943c(int i) {
        return this.f5615a.mo8963g(i);
    }

    @Deprecated
    /* renamed from: d */
    public final int mo8944d() {
        return this.f5615a.mo8964k().f18323d;
    }

    @Deprecated
    /* renamed from: e */
    public final int mo8945e() {
        return this.f5615a.mo8964k().f18320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2348w0)) {
            return false;
        }
        return Objects.equals(this.f5615a, ((C2348w0) obj).f5615a);
    }

    @Deprecated
    /* renamed from: f */
    public final int mo8947f() {
        return this.f5615a.mo8964k().f18322c;
    }

    @Deprecated
    /* renamed from: g */
    public final int mo8948g() {
        return this.f5615a.mo8964k().f18321b;
    }

    public final int hashCode() {
        C2359k kVar = this.f5615a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public final C2348w0 mo8950i(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        C2353e dVar = i5 >= 30 ? new C2352d(this) : i5 >= 29 ? new C2351c(this) : new C2350b(this);
        dVar.mo8954g(C8352d.m16668b(i, i2, i3, i4));
        return dVar.mo8952b();
    }

    /* renamed from: j */
    public final WindowInsets mo8951j() {
        C2359k kVar = this.f5615a;
        if (kVar instanceof C2354f) {
            return ((C2354f) kVar).f5634c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.w0$b */
    public static class C2350b extends C2353e {

        /* renamed from: e */
        public static Field f5620e = null;

        /* renamed from: f */
        public static boolean f5621f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f5622g = null;

        /* renamed from: h */
        public static boolean f5623h = false;

        /* renamed from: c */
        public WindowInsets f5624c;

        /* renamed from: d */
        public C8352d f5625d;

        public C2350b() {
            this.f5624c = m5110i();
        }

        /* renamed from: i */
        private static WindowInsets m5110i() {
            if (!f5621f) {
                try {
                    f5620e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f5621f = true;
            }
            Field field = f5620e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f5623h) {
                try {
                    f5622g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f5623h = true;
            }
            Constructor<WindowInsets> constructor = f5622g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* renamed from: b */
        public C2348w0 mo8952b() {
            mo8959a();
            C2348w0 k = C2348w0.m5100k((View) null, this.f5624c);
            k.f5615a.mo8968q(this.f5628b);
            k.f5615a.mo8977s(this.f5625d);
            return k;
        }

        /* renamed from: e */
        public void mo8953e(C8352d dVar) {
            this.f5625d = dVar;
        }

        /* renamed from: g */
        public void mo8954g(C8352d dVar) {
            WindowInsets windowInsets = this.f5624c;
            if (windowInsets != null) {
                this.f5624c = windowInsets.replaceSystemWindowInsets(dVar.f18320a, dVar.f18321b, dVar.f18322c, dVar.f18323d);
            }
        }

        public C2350b(C2348w0 w0Var) {
            super(w0Var);
            this.f5624c = w0Var.mo8951j();
        }
    }

    /* renamed from: androidx.core.view.w0$c */
    public static class C2351c extends C2353e {

        /* renamed from: c */
        public final WindowInsets$Builder f5626c;

        public C2351c() {
            this.f5626c = new WindowInsets$Builder();
        }

        /* renamed from: b */
        public C2348w0 mo8952b() {
            mo8959a();
            C2348w0 k = C2348w0.m5100k((View) null, this.f5626c.build());
            k.f5615a.mo8968q(this.f5628b);
            return k;
        }

        /* renamed from: d */
        public void mo8955d(C8352d dVar) {
            this.f5626c.setMandatorySystemGestureInsets(dVar.mo20940d());
        }

        /* renamed from: e */
        public void mo8953e(C8352d dVar) {
            this.f5626c.setStableInsets(dVar.mo20940d());
        }

        /* renamed from: f */
        public void mo8956f(C8352d dVar) {
            this.f5626c.setSystemGestureInsets(dVar.mo20940d());
        }

        /* renamed from: g */
        public void mo8954g(C8352d dVar) {
            this.f5626c.setSystemWindowInsets(dVar.mo20940d());
        }

        /* renamed from: h */
        public void mo8957h(C8352d dVar) {
            this.f5626c.setTappableElementInsets(dVar.mo20940d());
        }

        public C2351c(C2348w0 w0Var) {
            super(w0Var);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets j = w0Var.mo8951j();
            if (j != null) {
                windowInsets$Builder = new WindowInsets$Builder(j);
            } else {
                new WindowInsets$Builder
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v1 ? I:android.view.WindowInsets$Builder) =  call: android.view.WindowInsets$Builder.<init>():void type: CONSTRUCTOR in method: androidx.core.view.w0.c.<init>(androidx.core.view.w0):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v1 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    r1.<init>(r2)
                    android.view.WindowInsets r2 = r2.mo8951j()
                    if (r2 == 0) goto L_0x000f
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>(r2)
                    goto L_0x0014
                L_0x000f:
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>()
                L_0x0014:
                    r1.f5626c = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C2348w0.C2351c.<init>(androidx.core.view.w0):void");
            }
        }

        public C2348w0() {
            this.f5615a = new C2359k(this);
        }
    }
