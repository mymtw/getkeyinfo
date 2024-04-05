package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.snapshots.C1406w;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.core.view.C2298e;
import androidx.core.view.C2348w0;
import com.etsy.android.R;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p289y0.C8352d;
import p628nj.C18263b;

/* renamed from: androidx.compose.foundation.layout.i0 */
public final class C0740i0 {

    /* renamed from: v */
    public static final WeakHashMap<View, C0740i0> f1505v = new WeakHashMap<>();

    /* renamed from: a */
    public final C0716c f1506a = C0741a.m1617a(4, "captionBar");

    /* renamed from: b */
    public final C0716c f1507b;

    /* renamed from: c */
    public final C0716c f1508c;

    /* renamed from: d */
    public final C0716c f1509d;

    /* renamed from: e */
    public final C0716c f1510e;

    /* renamed from: f */
    public final C0716c f1511f;

    /* renamed from: g */
    public final C0716c f1512g;

    /* renamed from: h */
    public final C0716c f1513h;

    /* renamed from: i */
    public final C0716c f1514i;

    /* renamed from: j */
    public final C0732e0 f1515j;

    /* renamed from: k */
    public final C0730d0 f1516k;

    /* renamed from: l */
    public final C0730d0 f1517l;

    /* renamed from: m */
    public final C0730d0 f1518m;

    /* renamed from: n */
    public final C0732e0 f1519n;

    /* renamed from: o */
    public final C0732e0 f1520o;

    /* renamed from: p */
    public final C0732e0 f1521p;

    /* renamed from: q */
    public final C0732e0 f1522q;

    /* renamed from: r */
    public final C0732e0 f1523r;

    /* renamed from: s */
    public final boolean f1524s;

    /* renamed from: t */
    public int f1525t;

    /* renamed from: u */
    public final C0753p f1526u;

    /* renamed from: androidx.compose.foundation.layout.i0$a */
    public static final class C0741a {
        /* renamed from: a */
        public static final C0716c m1617a(int i, String str) {
            WeakHashMap<View, C0740i0> weakHashMap = C0740i0.f1505v;
            return new C0716c(i, str);
        }

        /* renamed from: b */
        public static final C0732e0 m1618b(int i, String str) {
            WeakHashMap<View, C0740i0> weakHashMap = C0740i0.f1505v;
            return new C0732e0(new C0754q(0, 0, 0, 0), str);
        }

        /* renamed from: c */
        public static C0740i0 m1619c(C1302d dVar) {
            C0740i0 i0Var;
            dVar.mo5465u(-1366542614);
            View view = (View) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
            WeakHashMap<View, C0740i0> weakHashMap = C0740i0.f1505v;
            synchronized (weakHashMap) {
                C0740i0 i0Var2 = weakHashMap.get(view);
                if (i0Var2 == null) {
                    i0Var2 = new C0740i0(view);
                    weakHashMap.put(view, i0Var2);
                }
                i0Var = i0Var2;
            }
            C1415u.m3028b(i0Var, new WindowInsetsHolder$Companion$current$1(i0Var, view), dVar);
            dVar.mo5406H();
            return i0Var;
        }
    }

    static {
        new C0741a();
    }

    public C0740i0(View view) {
        C0716c a = C0741a.m1617a(128, "displayCutout");
        this.f1507b = a;
        C0716c a2 = C0741a.m1617a(8, "ime");
        this.f1508c = a2;
        C0716c a3 = C0741a.m1617a(32, "mandatorySystemGestures");
        this.f1509d = a3;
        this.f1510e = C0741a.m1617a(2, "navigationBars");
        boolean z = true;
        this.f1511f = C0741a.m1617a(1, "statusBars");
        C0716c a4 = C0741a.m1617a(7, "systemBars");
        this.f1512g = a4;
        C0716c a5 = C0741a.m1617a(16, "systemGestures");
        this.f1513h = a5;
        C0716c a6 = C0741a.m1617a(64, "tappableElement");
        this.f1514i = a6;
        C0732e0 e0Var = new C0732e0(new C0754q(0, 0, 0, 0), "waterfall");
        this.f1515j = e0Var;
        C0730d0 t0 = C18263b.m30869t0(C18263b.m30869t0(a4, a2), a);
        this.f1516k = t0;
        C0730d0 t02 = C18263b.m30869t0(C18263b.m30869t0(C18263b.m30869t0(a6, a3), a5), e0Var);
        this.f1517l = t02;
        this.f1518m = C18263b.m30869t0(t0, t02);
        this.f1519n = C0741a.m1618b(4, "captionBarIgnoringVisibility");
        this.f1520o = C0741a.m1618b(2, "navigationBarsIgnoringVisibility");
        this.f1521p = C0741a.m1618b(1, "statusBarsIgnoringVisibility");
        this.f1522q = C0741a.m1618b(7, "systemBarsIgnoringVisibility");
        this.f1523r = C0741a.m1618b(64, "tappableElementIgnoringVisibility");
        ViewParent parent = view.getParent();
        Boolean bool = null;
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        bool = tag instanceof Boolean ? (Boolean) tag : bool;
        this.f1524s = bool != null ? bool.booleanValue() : z;
        this.f1526u = new C0753p(this);
    }

    /* renamed from: a */
    public final void mo4126a(C2348w0 w0Var, int i) {
        C19383o.m32797g(w0Var, "windowInsets");
        this.f1506a.mo4088f(w0Var, i);
        this.f1508c.mo4088f(w0Var, i);
        this.f1507b.mo4088f(w0Var, i);
        this.f1510e.mo4088f(w0Var, i);
        this.f1511f.mo4088f(w0Var, i);
        this.f1512g.mo4088f(w0Var, i);
        this.f1513h.mo4088f(w0Var, i);
        this.f1514i.mo4088f(w0Var, i);
        this.f1509d.mo4088f(w0Var, i);
        boolean z = false;
        if (i == 0) {
            C0732e0 e0Var = this.f1519n;
            C8352d c = w0Var.mo8943c(4);
            C19383o.m32796f(c, "insets.getInsetsIgnoring…aptionBar()\n            )");
            e0Var.f1497b.setValue(C19543e0.m33331r0(c));
            C0732e0 e0Var2 = this.f1520o;
            C8352d c2 = w0Var.mo8943c(2);
            C19383o.m32796f(c2, "insets.getInsetsIgnoring…ationBars()\n            )");
            e0Var2.f1497b.setValue(C19543e0.m33331r0(c2));
            C0732e0 e0Var3 = this.f1521p;
            C8352d c3 = w0Var.mo8943c(1);
            C19383o.m32796f(c3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            e0Var3.f1497b.setValue(C19543e0.m33331r0(c3));
            C0732e0 e0Var4 = this.f1522q;
            C8352d c4 = w0Var.mo8943c(7);
            C19383o.m32796f(c4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            e0Var4.f1497b.setValue(C19543e0.m33331r0(c4));
            C0732e0 e0Var5 = this.f1523r;
            C8352d c5 = w0Var.mo8943c(64);
            C19383o.m32796f(c5, "insets.getInsetsIgnoring…leElement()\n            )");
            e0Var5.f1497b.setValue(C19543e0.m33331r0(c5));
            C2298e a = w0Var.mo8941a();
            if (a != null) {
                this.f1515j.f1497b.setValue(C19543e0.m33331r0(Build.VERSION.SDK_INT >= 30 ? C8352d.m16669c(((DisplayCutout) a.f5555a).getWaterfallInsets()) : C8352d.f18319e));
            }
        }
        synchronized (SnapshotKt.f2989c) {
            Set<C1406w> set = SnapshotKt.f2995i.get().f3012g;
            if (set != null && (!set.isEmpty())) {
                z = true;
            }
        }
        if (z) {
            SnapshotKt.m2902a();
        }
    }
}
