package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.legacy.widget.Space;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.apache.commons.cli.HelpFormatter;
import p001a0.C0005b;

public class GridLayout extends ViewGroup {
    private static final int ALIGNMENT_MODE = 0;
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final C2811i BASELINE = new C2808g();
    public static final C2811i BOTTOM;
    public static final int CAN_STRETCH = 2;
    public static final C2811i CENTER = new C2807f();
    private static final int COLUMN_COUNT = 1;
    private static final int COLUMN_ORDER_PRESERVED = 2;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    public static final int DEFAULT_CONTAINER_MARGIN = 0;
    private static final int DEFAULT_COUNT = Integer.MIN_VALUE;
    public static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ORIENTATION = 0;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    public static final C2811i END;
    public static final C2811i FILL = new C2810h();
    public static final int HORIZONTAL = 0;
    public static final int INFLEXIBLE = 0;
    private static final C2811i LEADING;
    public static final C2811i LEFT;
    public static final Printer LOG_PRINTER = new LogPrinter(3, GridLayout.class.getName());
    public static final int MAX_SIZE = 100000;
    public static final Printer NO_PRINTER = new C2802a();
    private static final int ORIENTATION = 3;
    public static final C2811i RIGHT;
    private static final int ROW_COUNT = 4;
    private static final int ROW_ORDER_PRESERVED = 5;
    public static final C2811i START;
    public static final C2811i TOP;
    private static final C2811i TRAILING;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    public static final C2811i UNDEFINED_ALIGNMENT = new C2803b();
    public static final int UNINITIALIZED_HASH = 0;
    private static final int USE_DEFAULT_MARGINS = 6;
    public static final int VERTICAL = 1;
    public int mAlignmentMode;
    public int mDefaultGap;
    public final C2813k mHorizontalAxis;
    public int mLastLayoutParamsHashCode;
    public int mOrientation;
    public Printer mPrinter;
    public boolean mUseDefaultMargins;
    public final C2813k mVerticalAxis;

    public static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        public Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        /* renamed from: of */
        public static <K, V> Assoc<K, V> m6709of(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public C2817o<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new C2817o<>(objArr, objArr2);
        }

        public void put(K k, V v) {
            add(Pair.create(k, v));
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$a */
    public static class C2802a implements Printer {
        public final void println(String str) {
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$b */
    public static class C2803b extends C2811i {
        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* renamed from: c */
        public final String mo10669c() {
            return "UNDEFINED";
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$c */
    public static class C2804c extends C2811i {
        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: c */
        public final String mo10669c() {
            return "LEADING";
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            return 0;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$d */
    public static class C2805d extends C2811i {
        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            return i;
        }

        /* renamed from: c */
        public final String mo10669c() {
            return "TRAILING";
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            return i;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$e */
    public static class C2806e extends C2811i {

        /* renamed from: a */
        public final /* synthetic */ C2811i f6363a;

        /* renamed from: b */
        public final /* synthetic */ C2811i f6364b;

        public C2806e(C2811i iVar, C2811i iVar2) {
            this.f6363a = iVar;
            this.f6364b = iVar2;
        }

        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = true;
            if (C2364y.C2369e.m5233d(view) != 1) {
                z = false;
            }
            return (!z ? this.f6363a : this.f6364b).mo10668a(view, i, i2);
        }

        /* renamed from: c */
        public final String mo10669c() {
            StringBuilder h = C0072d.m201h("SWITCHING[L:");
            h.append(this.f6363a.mo10669c());
            h.append(", R:");
            h.append(this.f6364b.mo10669c());
            h.append("]");
            return h.toString();
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = true;
            if (C2364y.C2369e.m5233d(view) != 1) {
                z = false;
            }
            return (!z ? this.f6363a : this.f6364b).mo10670d(i, view);
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$f */
    public static class C2807f extends C2811i {
        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            return i >> 1;
        }

        /* renamed from: c */
        public final String mo10669c() {
            return "CENTER";
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            return i >> 1;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$g */
    public static class C2808g extends C2811i {

        /* renamed from: androidx.gridlayout.widget.GridLayout$g$a */
        public class C2809a extends C2814l {

            /* renamed from: d */
            public int f6365d;

            /* renamed from: a */
            public final int mo10672a(GridLayout gridLayout, View view, C2811i iVar, int i, boolean z) {
                return Math.max(0, super.mo10672a(gridLayout, view, iVar, i, z));
            }

            /* renamed from: b */
            public final void mo10673b(int i, int i2) {
                super.mo10673b(i, i2);
                this.f6365d = Math.max(this.f6365d, i + i2);
            }

            /* renamed from: c */
            public final void mo10674c() {
                super.mo10674c();
                this.f6365d = Integer.MIN_VALUE;
            }

            /* renamed from: d */
            public final int mo10675d(boolean z) {
                return Math.max(super.mo10675d(z), this.f6365d);
            }
        }

        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        /* renamed from: b */
        public final C2814l mo10671b() {
            return new C2809a();
        }

        /* renamed from: c */
        public final String mo10669c() {
            return "BASELINE";
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            return 0;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$h */
    public static class C2810h extends C2811i {
        /* renamed from: a */
        public final int mo10668a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* renamed from: c */
        public final String mo10669c() {
            return "FILL";
        }

        /* renamed from: d */
        public final int mo10670d(int i, View view) {
            return 0;
        }

        /* renamed from: e */
        public final int mo10676e(int i, int i2) {
            return i2;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$i */
    public static abstract class C2811i {
        /* renamed from: a */
        public abstract int mo10668a(View view, int i, int i2);

        /* renamed from: b */
        public C2814l mo10671b() {
            return new C2814l();
        }

        /* renamed from: c */
        public abstract String mo10669c();

        /* renamed from: d */
        public abstract int mo10670d(int i, View view);

        /* renamed from: e */
        public int mo10676e(int i, int i2) {
            return i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Alignment:");
            h.append(mo10669c());
            return h.toString();
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$j */
    public static final class C2812j {

        /* renamed from: a */
        public final C2815m f6366a;

        /* renamed from: b */
        public final C2816n f6367b;

        /* renamed from: c */
        public boolean f6368c = true;

        public C2812j(C2815m mVar, C2816n nVar) {
            this.f6366a = mVar;
            this.f6367b = nVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6366a);
            sb.append(" ");
            sb.append(!this.f6368c ? "+>" : "->");
            sb.append(" ");
            sb.append(this.f6367b);
            return sb.toString();
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$k */
    public final class C2813k {

        /* renamed from: a */
        public final boolean f6369a;

        /* renamed from: b */
        public int f6370b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f6371c = Integer.MIN_VALUE;

        /* renamed from: d */
        public C2817o<C2818p, C2814l> f6372d;

        /* renamed from: e */
        public boolean f6373e = false;

        /* renamed from: f */
        public C2817o<C2815m, C2816n> f6374f;

        /* renamed from: g */
        public boolean f6375g = false;

        /* renamed from: h */
        public C2817o<C2815m, C2816n> f6376h;

        /* renamed from: i */
        public boolean f6377i = false;

        /* renamed from: j */
        public int[] f6378j;

        /* renamed from: k */
        public boolean f6379k = false;

        /* renamed from: l */
        public int[] f6380l;

        /* renamed from: m */
        public boolean f6381m = false;

        /* renamed from: n */
        public C2812j[] f6382n;

        /* renamed from: o */
        public boolean f6383o = false;

        /* renamed from: p */
        public int[] f6384p;

        /* renamed from: q */
        public boolean f6385q = false;

        /* renamed from: r */
        public boolean f6386r;

        /* renamed from: s */
        public boolean f6387s = false;

        /* renamed from: t */
        public int[] f6388t;

        /* renamed from: u */
        public boolean f6389u = true;

        /* renamed from: v */
        public C2816n f6390v = new C2816n(0);

        /* renamed from: w */
        public C2816n f6391w = new C2816n(-100000);

        static {
            Class<GridLayout> cls = GridLayout.class;
        }

        public C2813k(boolean z) {
            this.f6369a = z;
        }

        /* renamed from: k */
        public static void m6742k(ArrayList arrayList, C2815m mVar, C2816n nVar, boolean z) {
            if (mVar.f6397b - mVar.f6396a != 0) {
                if (z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((C2812j) it.next()).f6366a.equals(mVar)) {
                            return;
                        }
                    }
                }
                arrayList.add(new C2812j(mVar, nVar));
            }
        }

        /* renamed from: a */
        public final String mo10679a(ArrayList arrayList) {
            String str = this.f6369a ? EtsyDialogFragment.OPT_X_BUTTON : "y";
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2812j jVar = (C2812j) it.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                C2815m mVar = jVar.f6366a;
                int i = mVar.f6396a;
                int i2 = mVar.f6397b;
                int i3 = jVar.f6367b.f6398a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (i < i2) {
                    sb2.append(i2);
                    sb2.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                    sb2.append(str);
                    sb2.append(i);
                    sb2.append(">=");
                } else {
                    sb2.append(i);
                    sb2.append(HelpFormatter.DEFAULT_OPT_PREFIX);
                    sb2.append(str);
                    sb2.append(i2);
                    sb2.append("<=");
                    i3 = -i3;
                }
                sb2.append(i3);
                sb.append(sb2.toString());
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final void mo10680b(C2817o<C2815m, C2816n> oVar, boolean z) {
            C2816n[] nVarArr = (C2816n[]) oVar.f6401c;
            for (C2816n nVar : nVarArr) {
                nVar.f6398a = Integer.MIN_VALUE;
            }
            C2814l[] lVarArr = (C2814l[]) mo10685g().f6401c;
            for (int i = 0; i < lVarArr.length; i++) {
                int d = lVarArr[i].mo10675d(z);
                C2816n nVar2 = (C2816n) oVar.f6401c[oVar.f6399a[i]];
                int i2 = nVar2.f6398a;
                if (!z) {
                    d = -d;
                }
                nVar2.f6398a = Math.max(i2, d);
            }
        }

        /* renamed from: c */
        public final void mo10681c(boolean z) {
            int[] iArr = z ? this.f6378j : this.f6380l;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    boolean z2 = this.f6369a;
                    C2815m mVar = (z2 ? layoutParams.columnSpec : layoutParams.rowSpec).f6404b;
                    int i2 = z ? mVar.f6396a : mVar.f6397b;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.getMargin1(childAt, z2, z));
                }
            }
        }

        /* renamed from: d */
        public final C2817o<C2815m, C2816n> mo10682d(boolean z) {
            C2815m mVar;
            Assoc<K, V> of = Assoc.m6709of(C2815m.class, C2816n.class);
            C2818p[] pVarArr = (C2818p[]) mo10685g().f6400b;
            int length = pVarArr.length;
            for (int i = 0; i < length; i++) {
                if (z) {
                    mVar = pVarArr[i].f6404b;
                } else {
                    C2815m mVar2 = pVarArr[i].f6404b;
                    mVar = new C2815m(mVar2.f6397b, mVar2.f6396a);
                }
                of.put(mVar, new C2816n());
            }
            return of.pack();
        }

        /* renamed from: e */
        public final C2812j[] mo10683e() {
            if (this.f6382n == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f6374f == null) {
                    this.f6374f = mo10682d(true);
                }
                if (!this.f6375g) {
                    mo10680b(this.f6374f, true);
                    this.f6375g = true;
                }
                C2817o<C2815m, C2816n> oVar = this.f6374f;
                int i = 0;
                while (true) {
                    C2815m[] mVarArr = (C2815m[]) oVar.f6400b;
                    if (i >= mVarArr.length) {
                        break;
                    }
                    m6742k(arrayList, mVarArr[i], ((C2816n[]) oVar.f6401c)[i], false);
                    i++;
                }
                if (this.f6376h == null) {
                    this.f6376h = mo10682d(false);
                }
                if (!this.f6377i) {
                    mo10680b(this.f6376h, false);
                    this.f6377i = true;
                }
                C2817o<C2815m, C2816n> oVar2 = this.f6376h;
                int i2 = 0;
                while (true) {
                    C2815m[] mVarArr2 = (C2815m[]) oVar2.f6400b;
                    if (i2 >= mVarArr2.length) {
                        break;
                    }
                    m6742k(arrayList2, mVarArr2[i2], ((C2816n[]) oVar2.f6401c)[i2], false);
                    i2++;
                }
                if (this.f6389u) {
                    int i3 = 0;
                    while (i3 < mo10684f()) {
                        int i4 = i3 + 1;
                        m6742k(arrayList, new C2815m(i3, i4), new C2816n(0), true);
                        i3 = i4;
                    }
                }
                int f = mo10684f();
                m6742k(arrayList, new C2815m(0, f), this.f6390v, false);
                m6742k(arrayList2, new C2815m(f, 0), this.f6391w, false);
                this.f6382n = (C2812j[]) GridLayout.append(mo10694q(arrayList), mo10694q(arrayList2));
            }
            if (!this.f6383o) {
                if (this.f6374f == null) {
                    this.f6374f = mo10682d(true);
                }
                if (!this.f6375g) {
                    mo10680b(this.f6374f, true);
                    this.f6375g = true;
                }
                if (this.f6376h == null) {
                    this.f6376h = mo10682d(false);
                }
                if (!this.f6377i) {
                    mo10680b(this.f6376h, false);
                    this.f6377i = true;
                }
                this.f6383o = true;
            }
            return this.f6382n;
        }

        /* renamed from: f */
        public final int mo10684f() {
            return Math.max(this.f6370b, mo10687i());
        }

        /* renamed from: g */
        public final C2817o<C2818p, C2814l> mo10685g() {
            int i;
            if (this.f6372d == null) {
                Assoc<K, V> of = Assoc.m6709of(C2818p.class, C2814l.class);
                int childCount = GridLayout.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i2));
                    boolean z = this.f6369a;
                    C2818p pVar = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                    of.put(pVar, pVar.mo10700a(z).mo10671b());
                }
                this.f6372d = of.pack();
            }
            if (!this.f6373e) {
                C2814l[] lVarArr = (C2814l[]) this.f6372d.f6401c;
                for (C2814l c : lVarArr) {
                    c.mo10674c();
                }
                int childCount2 = GridLayout.this.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt = GridLayout.this.getChildAt(i3);
                    LayoutParams layoutParams2 = GridLayout.this.getLayoutParams(childAt);
                    boolean z2 = this.f6369a;
                    C2818p pVar2 = z2 ? layoutParams2.columnSpec : layoutParams2.rowSpec;
                    int measurementIncludingMargin = GridLayout.this.getMeasurementIncludingMargin(childAt, z2);
                    if (pVar2.f6406d == 0.0f) {
                        i = 0;
                    } else {
                        if (this.f6388t == null) {
                            this.f6388t = new int[GridLayout.this.getChildCount()];
                        }
                        i = this.f6388t[i3];
                    }
                    int i4 = measurementIncludingMargin + i;
                    C2817o<C2818p, C2814l> oVar = this.f6372d;
                    C2814l lVar = (C2814l) oVar.f6401c[oVar.f6399a[i3]];
                    GridLayout gridLayout = GridLayout.this;
                    lVar.f6395c = ((pVar2.f6405c == GridLayout.UNDEFINED_ALIGNMENT && pVar2.f6406d == 0.0f) ? 0 : 2) & lVar.f6395c;
                    int a = pVar2.mo10700a(this.f6369a).mo10668a(childAt, i4, gridLayout.getLayoutMode());
                    lVar.mo10673b(a, i4 - a);
                }
                this.f6373e = true;
            }
            return this.f6372d;
        }

        /* renamed from: h */
        public final int[] mo10686h() {
            boolean z;
            if (this.f6384p == null) {
                this.f6384p = new int[(mo10684f() + 1)];
            }
            if (!this.f6385q) {
                int[] iArr = this.f6384p;
                float f = 0.0f;
                if (!this.f6387s) {
                    int childCount = GridLayout.this.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            z = false;
                            break;
                        }
                        View childAt = GridLayout.this.getChildAt(i);
                        if (childAt.getVisibility() != 8) {
                            LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                            if ((this.f6369a ? layoutParams.columnSpec : layoutParams.rowSpec).f6406d != 0.0f) {
                                z = true;
                                break;
                            }
                        }
                        i++;
                    }
                    this.f6386r = z;
                    this.f6387s = true;
                }
                if (!this.f6386r) {
                    mo10693p(mo10683e(), iArr, true);
                } else {
                    if (this.f6388t == null) {
                        this.f6388t = new int[GridLayout.this.getChildCount()];
                    }
                    Arrays.fill(this.f6388t, 0);
                    mo10693p(mo10683e(), iArr, true);
                    int childCount2 = (GridLayout.this.getChildCount() * this.f6390v.f6398a) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = GridLayout.this.getChildCount();
                        for (int i2 = 0; i2 < childCount3; i2++) {
                            View childAt2 = GridLayout.this.getChildAt(i2);
                            if (childAt2.getVisibility() != 8) {
                                LayoutParams layoutParams2 = GridLayout.this.getLayoutParams(childAt2);
                                f += (this.f6369a ? layoutParams2.columnSpec : layoutParams2.rowSpec).f6406d;
                            }
                        }
                        int i3 = -1;
                        boolean z2 = true;
                        int i4 = 0;
                        while (i4 < childCount2) {
                            int i5 = (int) ((((long) i4) + ((long) childCount2)) / 2);
                            mo10690m();
                            mo10692o(f, i5);
                            boolean p = mo10693p(mo10683e(), iArr, false);
                            if (p) {
                                i4 = i5 + 1;
                                i3 = i5;
                            } else {
                                childCount2 = i5;
                            }
                            z2 = p;
                        }
                        if (i3 > 0 && !z2) {
                            mo10690m();
                            mo10692o(f, i3);
                            mo10693p(mo10683e(), iArr, true);
                        }
                    }
                }
                if (!this.f6389u) {
                    int i6 = iArr[0];
                    int length = iArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr[i7] = iArr[i7] - i6;
                    }
                }
                this.f6385q = true;
            }
            return this.f6384p;
        }

        /* renamed from: i */
        public final int mo10687i() {
            int i = Integer.MIN_VALUE;
            if (this.f6371c == Integer.MIN_VALUE) {
                int childCount = GridLayout.this.getChildCount();
                int i2 = -1;
                for (int i3 = 0; i3 < childCount; i3++) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i3));
                    C2815m mVar = (this.f6369a ? layoutParams.columnSpec : layoutParams.rowSpec).f6404b;
                    i2 = Math.max(Math.max(Math.max(i2, mVar.f6396a), mVar.f6397b), mVar.f6397b - mVar.f6396a);
                }
                if (i2 != -1) {
                    i = i2;
                }
                this.f6371c = Math.max(0, i);
            }
            return this.f6371c;
        }

        /* renamed from: j */
        public final int mo10688j(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                this.f6390v.f6398a = 0;
                this.f6391w.f6398a = -size;
                this.f6385q = false;
                return mo10686h()[mo10684f()];
            } else if (mode == 0) {
                this.f6390v.f6398a = 0;
                this.f6391w.f6398a = -100000;
                this.f6385q = false;
                return mo10686h()[mo10684f()];
            } else if (mode != 1073741824) {
                return 0;
            } else {
                this.f6390v.f6398a = size;
                this.f6391w.f6398a = -size;
                this.f6385q = false;
                return mo10686h()[mo10684f()];
            }
        }

        /* renamed from: l */
        public final void mo10689l() {
            this.f6371c = Integer.MIN_VALUE;
            this.f6372d = null;
            this.f6374f = null;
            this.f6376h = null;
            this.f6378j = null;
            this.f6380l = null;
            this.f6382n = null;
            this.f6384p = null;
            this.f6388t = null;
            this.f6387s = false;
            mo10690m();
        }

        /* renamed from: m */
        public final void mo10690m() {
            this.f6373e = false;
            this.f6375g = false;
            this.f6377i = false;
            this.f6379k = false;
            this.f6381m = false;
            this.f6383o = false;
            this.f6385q = false;
        }

        /* renamed from: n */
        public final void mo10691n(int i) {
            if (i != Integer.MIN_VALUE && i < mo10687i()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f6369a ? "column" : "row");
                sb.append("Count must be greater than or equal to the maximum of all grid indices ");
                sb.append("(and spans) defined in the LayoutParams of each child");
                GridLayout.handleInvalidParams(sb.toString());
            }
            this.f6370b = i;
        }

        /* renamed from: o */
        public final void mo10692o(float f, int i) {
            Arrays.fill(this.f6388t, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    float f2 = (this.f6369a ? layoutParams.columnSpec : layoutParams.rowSpec).f6406d;
                    if (f2 != 0.0f) {
                        int round = Math.round((((float) i) * f2) / f);
                        this.f6388t[i2] = round;
                        i -= round;
                        f -= f2;
                    }
                }
            }
        }

        /* renamed from: p */
        public final boolean mo10693p(C2812j[] jVarArr, int[] iArr, boolean z) {
            boolean z2;
            boolean z3;
            C2812j[] jVarArr2 = jVarArr;
            int[] iArr2 = iArr;
            String str = this.f6369a ? ResponseConstants.HORIZONTAL : "vertical";
            boolean z4 = true;
            int f = mo10684f() + 1;
            boolean[] zArr = null;
            int i = 0;
            while (i < jVarArr2.length) {
                Arrays.fill(iArr2, 0);
                for (int i2 = 0; i2 < f; i2++) {
                    boolean z5 = false;
                    for (C2812j jVar : jVarArr2) {
                        if (jVar.f6368c) {
                            C2815m mVar = jVar.f6366a;
                            int i3 = mVar.f6396a;
                            int i4 = mVar.f6397b;
                            int i5 = iArr2[i3] + jVar.f6367b.f6398a;
                            if (i5 > iArr2[i4]) {
                                iArr2[i4] = i5;
                                z3 = z4;
                                z5 |= z3;
                            }
                        }
                        z3 = false;
                        z5 |= z3;
                    }
                    if (!z5) {
                        if (zArr != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i6 = 0; i6 < jVarArr2.length; i6++) {
                                C2812j jVar2 = jVarArr2[i6];
                                if (zArr[i6]) {
                                    arrayList.add(jVar2);
                                }
                                if (!jVar2.f6368c) {
                                    arrayList2.add(jVar2);
                                }
                            }
                            Printer printer = GridLayout.this.mPrinter;
                            StringBuilder k = C0073e.m211k(str, " constraints: ");
                            k.append(mo10679a(arrayList));
                            k.append(" are inconsistent; permanently removing: ");
                            k.append(mo10679a(arrayList2));
                            k.append(". ");
                            printer.println(k.toString());
                        }
                        return z4;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[jVarArr2.length];
                for (int i7 = 0; i7 < f; i7++) {
                    int length = jVarArr2.length;
                    for (int i8 = 0; i8 < length; i8++) {
                        boolean z6 = zArr2[i8];
                        C2812j jVar3 = jVarArr2[i8];
                        if (jVar3.f6368c) {
                            C2815m mVar2 = jVar3.f6366a;
                            int i9 = mVar2.f6396a;
                            int i10 = mVar2.f6397b;
                            int i11 = iArr2[i9] + jVar3.f6367b.f6398a;
                            if (i11 > iArr2[i10]) {
                                iArr2[i10] = i11;
                                z2 = true;
                                zArr2[i8] = z6 | z2;
                            }
                        }
                        z2 = false;
                        zArr2[i8] = z6 | z2;
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= jVarArr2.length) {
                        break;
                    }
                    if (zArr2[i12]) {
                        C2812j jVar4 = jVarArr2[i12];
                        C2815m mVar3 = jVar4.f6366a;
                        if (mVar3.f6396a >= mVar3.f6397b) {
                            jVar4.f6368c = false;
                            break;
                        }
                    }
                    i12++;
                }
                i++;
                z4 = true;
            }
            return z4;
        }

        /* renamed from: q */
        public final C2812j[] mo10694q(ArrayList arrayList) {
            C2819a aVar = new C2819a(this, (C2812j[]) arrayList.toArray(new C2812j[arrayList.size()]));
            int length = aVar.f6409c.length;
            for (int i = 0; i < length; i++) {
                aVar.mo10703a(i);
            }
            return aVar.f6407a;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$l */
    public static class C2814l {

        /* renamed from: a */
        public int f6393a;

        /* renamed from: b */
        public int f6394b;

        /* renamed from: c */
        public int f6395c;

        public C2814l() {
            mo10674c();
        }

        /* renamed from: a */
        public int mo10672a(GridLayout gridLayout, View view, C2811i iVar, int i, boolean z) {
            return this.f6393a - iVar.mo10668a(view, i, gridLayout.getLayoutMode());
        }

        /* renamed from: b */
        public void mo10673b(int i, int i2) {
            this.f6393a = Math.max(this.f6393a, i);
            this.f6394b = Math.max(this.f6394b, i2);
        }

        /* renamed from: c */
        public void mo10674c() {
            this.f6393a = Integer.MIN_VALUE;
            this.f6394b = Integer.MIN_VALUE;
            this.f6395c = 2;
        }

        /* renamed from: d */
        public int mo10675d(boolean z) {
            if (z || !GridLayout.canStretch(this.f6395c)) {
                return this.f6393a + this.f6394b;
            }
            return 100000;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Bounds{before=");
            h.append(this.f6393a);
            h.append(", after=");
            return C0073e.m208h(h, this.f6394b, '}');
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$m */
    public static final class C2815m {

        /* renamed from: a */
        public final int f6396a;

        /* renamed from: b */
        public final int f6397b;

        public C2815m(int i, int i2) {
            this.f6396a = i;
            this.f6397b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2815m.class != obj.getClass()) {
                return false;
            }
            C2815m mVar = (C2815m) obj;
            return this.f6397b == mVar.f6397b && this.f6396a == mVar.f6396a;
        }

        public final int hashCode() {
            return (this.f6396a * 31) + this.f6397b;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("[");
            h.append(this.f6396a);
            h.append(", ");
            return C0071c.m191c(h, this.f6397b, "]");
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$o */
    public static final class C2817o<K, V> {

        /* renamed from: a */
        public final int[] f6399a;

        /* renamed from: b */
        public final K[] f6400b;

        /* renamed from: c */
        public final V[] f6401c;

        public C2817o(K[] kArr, V[] vArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            this.f6399a = iArr;
            this.f6400b = m6763a(kArr, iArr);
            this.f6401c = m6763a(vArr, iArr);
        }

        /* renamed from: a */
        public static <K> K[] m6763a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.max2(iArr, -1) + 1);
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$p */
    public static class C2818p {

        /* renamed from: e */
        public static final C2818p f6402e = GridLayout.spec(Integer.MIN_VALUE);

        /* renamed from: a */
        public final boolean f6403a;

        /* renamed from: b */
        public final C2815m f6404b;

        /* renamed from: c */
        public final C2811i f6405c;

        /* renamed from: d */
        public final float f6406d;

        public C2818p(boolean z, C2815m mVar, C2811i iVar, float f) {
            this.f6403a = z;
            this.f6404b = mVar;
            this.f6405c = iVar;
            this.f6406d = f;
        }

        /* renamed from: a */
        public final C2811i mo10700a(boolean z) {
            C2811i iVar = this.f6405c;
            return iVar != GridLayout.UNDEFINED_ALIGNMENT ? iVar : this.f6406d == 0.0f ? z ? GridLayout.START : GridLayout.BASELINE : GridLayout.FILL;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2818p.class != obj.getClass()) {
                return false;
            }
            C2818p pVar = (C2818p) obj;
            return this.f6405c.equals(pVar.f6405c) && this.f6404b.equals(pVar.f6404b);
        }

        public final int hashCode() {
            return this.f6405c.hashCode() + (this.f6404b.hashCode() * 31);
        }
    }

    static {
        C2804c cVar = new C2804c();
        LEADING = cVar;
        C2805d dVar = new C2805d();
        TRAILING = dVar;
        TOP = cVar;
        BOTTOM = dVar;
        START = cVar;
        END = dVar;
        LEFT = createSwitchingAlignment(cVar, dVar);
        RIGHT = createSwitchingAlignment(dVar, cVar);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalAxis = new C2813k(true);
        this.mVerticalAxis = new C2813k(false);
        this.mOrientation = 0;
        this.mUseDefaultMargins = false;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.mPrinter = LOG_PRINTER;
        this.mDefaultGap = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0005b.f17o);
        try {
            setRowCount(obtainStyledAttributes.getInt(ROW_COUNT, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(COLUMN_COUNT, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(ORIENTATION, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(USE_DEFAULT_MARGINS, false));
            setAlignmentMode(obtainStyledAttributes.getInt(ALIGNMENT_MODE, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(ROW_ORDER_PRESERVED, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(COLUMN_ORDER_PRESERVED, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int adjust(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    public static <T> T[] append(T[] tArr, T[] tArr2) {
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static boolean canStretch(int i) {
        return (i & 2) != 0;
    }

    private void checkLayoutParams(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        C2815m mVar = (z ? layoutParams.columnSpec : layoutParams.rowSpec).f6404b;
        int i = mVar.f6396a;
        if (i != Integer.MIN_VALUE && i < 0) {
            handleInvalidParams(str + " indices must be positive");
        }
        int i2 = (z ? this.mHorizontalAxis : this.mVerticalAxis).f6370b;
        if (i2 != Integer.MIN_VALUE) {
            if (mVar.f6397b > i2) {
                handleInvalidParams(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (mVar.f6397b - mVar.f6396a > i2) {
                handleInvalidParams(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int clip(C2815m mVar, boolean z, int i) {
        int i2 = mVar.f6397b;
        int i3 = mVar.f6396a;
        int i4 = i2 - i3;
        if (i == 0) {
            return i4;
        }
        return Math.min(i4, i - (z ? Math.min(i3, i) : 0));
    }

    private int computeLayoutParamsHashCode() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((LayoutParams) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    private void consistencyCheck() {
        int i = this.mLastLayoutParamsHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
        } else if (i != computeLayoutParamsHashCode()) {
            this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            invalidateStructure();
            consistencyCheck();
        }
    }

    private static C2811i createSwitchingAlignment(C2811i iVar, C2811i iVar2) {
        return new C2806e(iVar, iVar2);
    }

    private void drawLine(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (isLayoutRtlCompat()) {
            int width = getWidth();
            canvas.drawLine((float) (width - i5), (float) i6, (float) (width - i7), (float) i8, paint);
            return;
        }
        canvas.drawLine((float) i5, (float) i6, (float) i7, (float) i8, paint);
    }

    private static boolean fits(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return false;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static C2811i getAlignment(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? UNDEFINED_ALIGNMENT : END : START : FILL : z ? RIGHT : BOTTOM : z ? LEFT : TOP : CENTER;
    }

    private int getDefaultMargin(View view, boolean z, boolean z2) {
        if (view.getClass() == Space.class || view.getClass() == android.widget.Space.class) {
            return 0;
        }
        return this.mDefaultGap / 2;
    }

    private int getMargin(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.mAlignmentMode == 1) {
            return getMargin1(view, z, z2);
        }
        C2813k kVar = z ? this.mHorizontalAxis : this.mVerticalAxis;
        if (z2) {
            if (kVar.f6378j == null) {
                kVar.f6378j = new int[(kVar.mo10684f() + 1)];
            }
            if (!kVar.f6379k) {
                kVar.mo10681c(true);
                kVar.f6379k = true;
            }
            iArr = kVar.f6378j;
        } else {
            if (kVar.f6380l == null) {
                kVar.f6380l = new int[(kVar.mo10684f() + 1)];
            }
            if (!kVar.f6381m) {
                kVar.mo10681c(false);
                kVar.f6381m = true;
            }
            iArr = kVar.f6380l;
        }
        LayoutParams layoutParams = getLayoutParams(view);
        C2815m mVar = (z ? layoutParams.columnSpec : layoutParams.rowSpec).f6404b;
        return iArr[z2 ? mVar.f6396a : mVar.f6397b];
    }

    private int getMeasurement(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private int getTotalMargin(View view, boolean z) {
        return getMargin(view, z, true) + getMargin(view, z, false);
    }

    public static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(C0326j.m864i(str, ". "));
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        C2813k kVar = this.mHorizontalAxis;
        if (kVar != null) {
            kVar.mo10689l();
        }
        C2813k kVar2 = this.mVerticalAxis;
        if (kVar2 != null) {
            kVar2.mo10689l();
        }
        invalidateValues();
    }

    private void invalidateValues() {
        C2813k kVar = this.mHorizontalAxis;
        if (kVar != null && this.mVerticalAxis != null) {
            kVar.mo10690m();
            this.mVerticalAxis.mo10690m();
        }
    }

    private boolean isLayoutRtlCompat() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(this) == 1;
    }

    public static int max2(int[] iArr, int i) {
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    private void measureChildWithMargins2(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getTotalMargin(view, true), i3), ViewGroup.getChildMeasureSpec(i2, getTotalMargin(view, false), i4));
    }

    private void measureChildrenWithMargins(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                if (z) {
                    measureChildWithMargins2(childAt, i, i2, layoutParams.width, layoutParams.height);
                } else {
                    boolean z2 = this.mOrientation == 0;
                    C2818p pVar = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                    if (pVar.mo10700a(z2) == FILL) {
                        C2815m mVar = pVar.f6404b;
                        int[] h = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).mo10686h();
                        int totalMargin = (h[mVar.f6397b] - h[mVar.f6396a]) - getTotalMargin(childAt, z2);
                        if (z2) {
                            measureChildWithMargins2(childAt, i, i2, totalMargin, layoutParams.height);
                        } else {
                            measureChildWithMargins2(childAt, i, i2, layoutParams.width, totalMargin);
                        }
                    }
                }
            }
        }
    }

    private static void procrusteanFill(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    private static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setRowSpecSpan(new C2815m(i, i2 + i));
        layoutParams.setColumnSpecSpan(new C2815m(i3, i4 + i3));
    }

    public static C2818p spec(int i, int i2, C2811i iVar, float f) {
        return new C2818p(i != Integer.MIN_VALUE, new C2815m(i, i2 + i), iVar, f);
    }

    private void validateLayoutParams() {
        boolean z = this.mOrientation == 0;
        int i = (z ? this.mHorizontalAxis : this.mVerticalAxis).f6370b;
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            C2818p pVar = z ? layoutParams.rowSpec : layoutParams.columnSpec;
            C2815m mVar = pVar.f6404b;
            boolean z2 = pVar.f6403a;
            int i5 = mVar.f6397b;
            int i6 = mVar.f6396a;
            int i7 = i5 - i6;
            if (z2) {
                i2 = i6;
            }
            C2818p pVar2 = z ? layoutParams.columnSpec : layoutParams.rowSpec;
            C2815m mVar2 = pVar2.f6404b;
            boolean z3 = pVar2.f6403a;
            int clip = clip(mVar2, z3, i);
            if (z3) {
                i3 = mVar2.f6396a;
            }
            if (i != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i8 = i3 + clip;
                        if (fits(iArr, i2, i3, i8)) {
                            break;
                        } else if (z3) {
                            i2++;
                        } else if (i8 <= i) {
                            i3++;
                        } else {
                            i2++;
                            i3 = 0;
                        }
                    }
                }
                procrusteanFill(iArr, i3, i3 + clip, i2 + i7);
            }
            if (z) {
                setCellGroup(layoutParams, i2, i7, i3, clip);
            } else {
                setCellGroup(layoutParams, i3, clip, i2, i7);
            }
            i3 += clip;
        }
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public int getColumnCount() {
        return this.mHorizontalAxis.mo10684f();
    }

    public final LayoutParams getLayoutParams(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    public int getMargin1(View view, boolean z, boolean z2) {
        LayoutParams layoutParams = getLayoutParams(view);
        int i = z ? z2 ? layoutParams.leftMargin : layoutParams.rightMargin : z2 ? layoutParams.topMargin : layoutParams.bottomMargin;
        return i == Integer.MIN_VALUE ? getDefaultMargin(view, layoutParams, z, z2) : i;
    }

    public final int getMeasurementIncludingMargin(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return getMeasurement(view, z) + getTotalMargin(view, z);
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public Printer getPrinter() {
        return this.mPrinter;
    }

    public int getRowCount() {
        return this.mVerticalAxis.mo10684f();
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public boolean isColumnOrderPreserved() {
        return this.mHorizontalAxis.f6389u;
    }

    public boolean isRowOrderPreserved() {
        return this.mVerticalAxis.f6389u;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr;
        boolean z2;
        View view;
        GridLayout gridLayout = this;
        consistencyCheck();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        C2813k kVar = gridLayout.mHorizontalAxis;
        int i6 = (i5 - paddingLeft) - paddingRight;
        kVar.f6390v.f6398a = i6;
        kVar.f6391w.f6398a = -i6;
        boolean z3 = false;
        kVar.f6385q = false;
        kVar.mo10686h();
        C2813k kVar2 = gridLayout.mVerticalAxis;
        int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
        kVar2.f6390v.f6398a = i7;
        kVar2.f6391w.f6398a = -i7;
        kVar2.f6385q = false;
        kVar2.mo10686h();
        int[] h = gridLayout.mHorizontalAxis.mo10686h();
        int[] h2 = gridLayout.mVerticalAxis.mo10686h();
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = gridLayout.getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                z2 = z3;
                iArr = h;
            } else {
                LayoutParams layoutParams = gridLayout.getLayoutParams(childAt);
                C2818p pVar = layoutParams.columnSpec;
                C2818p pVar2 = layoutParams.rowSpec;
                C2815m mVar = pVar.f6404b;
                C2815m mVar2 = pVar2.f6404b;
                int i9 = h[mVar.f6396a];
                int i10 = h2[mVar2.f6396a];
                int i11 = h[mVar.f6397b] - i9;
                int i12 = h2[mVar2.f6397b] - i10;
                int measurement = gridLayout.getMeasurement(childAt, true);
                int measurement2 = gridLayout.getMeasurement(childAt, z3);
                C2811i a = pVar.mo10700a(true);
                C2811i a2 = pVar2.mo10700a(z3);
                C2817o<C2818p, C2814l> g = gridLayout.mHorizontalAxis.mo10685g();
                C2814l lVar = (C2814l) g.f6401c[g.f6399a[i8]];
                C2817o<C2818p, C2814l> g2 = gridLayout.mVerticalAxis.mo10685g();
                int i13 = measurement2;
                C2814l lVar2 = (C2814l) g2.f6401c[g2.f6399a[i8]];
                iArr = h;
                int d = a.mo10670d(i11 - lVar.mo10675d(true), childAt);
                C2811i iVar = a;
                int d2 = a2.mo10670d(i12 - lVar2.mo10675d(true), childAt);
                int margin = gridLayout.getMargin(childAt, true, true);
                int margin2 = gridLayout.getMargin(childAt, false, true);
                int margin3 = gridLayout.getMargin(childAt, true, false);
                int i14 = margin + margin3;
                int margin4 = margin2 + gridLayout.getMargin(childAt, false, false);
                C2811i iVar2 = a2;
                C2814l lVar3 = lVar;
                C2811i iVar3 = iVar;
                z2 = false;
                int i15 = i13;
                View view2 = childAt;
                int a3 = lVar3.mo10672a(this, childAt, iVar, measurement + i14, true);
                int i16 = i15;
                C2811i iVar4 = iVar2;
                int a4 = lVar2.mo10672a(this, view2, iVar4, i16 + margin4, false);
                int e = iVar.mo10676e(measurement, i11 - i14);
                int e2 = iVar4.mo10676e(i16, i12 - margin4);
                int i17 = i9 + d + a3;
                int i18 = !isLayoutRtlCompat() ? paddingLeft + margin + i17 : (((i5 - e) - paddingRight) - margin3) - i17;
                int i19 = paddingTop + i10 + d2 + a4 + margin2;
                if (e == view2.getMeasuredWidth() && e2 == view2.getMeasuredHeight()) {
                    view = view2;
                } else {
                    view = view2;
                    view.measure(View.MeasureSpec.makeMeasureSpec(e, 1073741824), View.MeasureSpec.makeMeasureSpec(e2, 1073741824));
                }
                view.layout(i18, i19, e + i18, e2 + i19);
            }
            i8++;
            gridLayout = this;
            h = iArr;
            z3 = z2;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        consistencyCheck();
        invalidateValues();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int adjust = adjust(i, -paddingRight);
        int adjust2 = adjust(i2, -paddingBottom);
        measureChildrenWithMargins(adjust, adjust2, true);
        if (this.mOrientation == 0) {
            i3 = this.mHorizontalAxis.mo10688j(adjust);
            measureChildrenWithMargins(adjust, adjust2, false);
            i4 = this.mVerticalAxis.mo10688j(adjust2);
        } else {
            int j = this.mVerticalAxis.mo10688j(adjust2);
            measureChildrenWithMargins(adjust, adjust2, false);
            int i5 = j;
            i3 = this.mHorizontalAxis.mo10688j(adjust);
            i4 = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    public void requestLayout() {
        super.requestLayout();
        invalidateStructure();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.mo10691n(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        C2813k kVar = this.mHorizontalAxis;
        kVar.f6389u = z;
        kVar.mo10689l();
        invalidateStructure();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = NO_PRINTER;
        }
        this.mPrinter = printer;
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.mo10691n(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        C2813k kVar = this.mVerticalAxis;
        kVar.f6389u = z;
        kVar.mo10689l();
        invalidateStructure();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$n */
    public static final class C2816n {

        /* renamed from: a */
        public int f6398a;

        public C2816n() {
            this.f6398a = Integer.MIN_VALUE;
        }

        public final String toString() {
            return Integer.toString(this.f6398a);
        }

        public C2816n(int i) {
            this.f6398a = i;
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public static C2818p spec(int i, C2811i iVar, float f) {
        return spec(i, 1, iVar, f);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private int getDefaultMargin(View view, boolean z, boolean z2, boolean z3) {
        return getDefaultMargin(view, z2, z3);
    }

    public static C2818p spec(int i, int i2, float f) {
        return spec(i, i2, UNDEFINED_ALIGNMENT, f);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private int getDefaultMargin(View view, LayoutParams layoutParams, boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.mUseDefaultMargins) {
            return 0;
        }
        C2818p pVar = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        C2813k kVar = z ? this.mHorizontalAxis : this.mVerticalAxis;
        C2815m mVar = pVar.f6404b;
        if (!((!z || !isLayoutRtlCompat()) ? z2 : !z2) ? mVar.f6397b == kVar.mo10684f() : mVar.f6396a == 0) {
            z3 = true;
        }
        return getDefaultMargin(view, z3, z, z2);
    }

    public static C2818p spec(int i, float f) {
        return spec(i, 1, f);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int BOTTOM_MARGIN = 6;
        private static final int COLUMN = 7;
        private static final int COLUMN_SPAN = 8;
        private static final int COLUMN_WEIGHT = 9;
        private static final int DEFAULT_COLUMN = Integer.MIN_VALUE;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = Integer.MIN_VALUE;
        private static final int DEFAULT_ROW = Integer.MIN_VALUE;
        private static final C2815m DEFAULT_SPAN = new C2815m(Integer.MIN_VALUE, -2147483647);
        private static final int DEFAULT_SPAN_SIZE = (-2147483647 - Integer.MIN_VALUE);
        private static final int DEFAULT_WIDTH = -2;
        private static final int GRAVITY = 10;
        private static final int LEFT_MARGIN = 3;
        private static final int MARGIN = 2;
        private static final int RIGHT_MARGIN = 5;
        private static final int ROW = 11;
        private static final int ROW_SPAN = 12;
        private static final int ROW_WEIGHT = 13;
        private static final int TOP_MARGIN = 4;
        public C2818p columnSpec;
        public C2818p rowSpec;

        private LayoutParams(int i, int i2, int i3, int i4, int i5, int i6, C2818p pVar, C2818p pVar2) {
            super(i, i2);
            C2818p pVar3 = C2818p.f6402e;
            this.rowSpec = pVar3;
            this.columnSpec = pVar3;
            setMargins(i3, i4, i5, i6);
            this.rowSpec = pVar;
            this.columnSpec = pVar2;
        }

        private void init(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0005b.f18p);
            try {
                int i = obtainStyledAttributes.getInt(GRAVITY, 0);
                int i2 = obtainStyledAttributes.getInt(COLUMN, Integer.MIN_VALUE);
                int i3 = COLUMN_SPAN;
                int i4 = DEFAULT_SPAN_SIZE;
                this.columnSpec = GridLayout.spec(i2, obtainStyledAttributes.getInt(i3, i4), GridLayout.getAlignment(i, true), obtainStyledAttributes.getFloat(COLUMN_WEIGHT, 0.0f));
                this.rowSpec = GridLayout.spec(obtainStyledAttributes.getInt(ROW, Integer.MIN_VALUE), obtainStyledAttributes.getInt(ROW_SPAN, i4), GridLayout.getAlignment(i, false), obtainStyledAttributes.getFloat(ROW_WEIGHT, 0.0f));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private void reInitSuper(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0005b.f18p);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(MARGIN, Integer.MIN_VALUE);
                this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(LEFT_MARGIN, dimensionPixelSize);
                this.topMargin = obtainStyledAttributes.getDimensionPixelSize(TOP_MARGIN, dimensionPixelSize);
                this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(RIGHT_MARGIN, dimensionPixelSize);
                this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(BOTTOM_MARGIN, dimensionPixelSize);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.columnSpec.equals(layoutParams.columnSpec) && this.rowSpec.equals(layoutParams.rowSpec);
        }

        public int hashCode() {
            return this.columnSpec.hashCode() + (this.rowSpec.hashCode() * 31);
        }

        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            this.width = typedArray.getLayoutDimension(i, -2);
            this.height = typedArray.getLayoutDimension(i2, -2);
        }

        public final void setColumnSpecSpan(C2815m mVar) {
            C2818p pVar = this.columnSpec;
            this.columnSpec = new C2818p(pVar.f6403a, mVar, pVar.f6405c, pVar.f6406d);
        }

        public void setGravity(int i) {
            C2818p pVar = this.rowSpec;
            this.rowSpec = new C2818p(pVar.f6403a, pVar.f6404b, GridLayout.getAlignment(i, false), pVar.f6406d);
            C2818p pVar2 = this.columnSpec;
            this.columnSpec = new C2818p(pVar2.f6403a, pVar2.f6404b, GridLayout.getAlignment(i, true), pVar2.f6406d);
        }

        public final void setRowSpecSpan(C2815m mVar) {
            C2818p pVar = this.rowSpec;
            this.rowSpec = new C2818p(pVar.f6403a, mVar, pVar.f6405c, pVar.f6406d);
        }

        public LayoutParams(C2818p pVar, C2818p pVar2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, pVar, pVar2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LayoutParams() {
            /*
                r1 = this;
                androidx.gridlayout.widget.GridLayout$p r0 = androidx.gridlayout.widget.GridLayout.C2818p.f6402e
                r1.<init>((androidx.gridlayout.widget.GridLayout.C2818p) r0, (androidx.gridlayout.widget.GridLayout.C2818p) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.LayoutParams.<init>():void");
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            C2818p pVar = C2818p.f6402e;
            this.rowSpec = pVar;
            this.columnSpec = pVar;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            C2818p pVar = C2818p.f6402e;
            this.rowSpec = pVar;
            this.columnSpec = pVar;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            C2818p pVar = C2818p.f6402e;
            this.rowSpec = pVar;
            this.columnSpec = pVar;
            this.rowSpec = layoutParams.rowSpec;
            this.columnSpec = layoutParams.columnSpec;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C2818p pVar = C2818p.f6402e;
            this.rowSpec = pVar;
            this.columnSpec = pVar;
            reInitSuper(context, attributeSet);
            init(context, attributeSet);
        }
    }

    public static C2818p spec(int i, int i2, C2811i iVar) {
        return spec(i, i2, iVar, 0.0f);
    }

    public static C2818p spec(int i, C2811i iVar) {
        return spec(i, 1, iVar);
    }

    public static C2818p spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    public static C2818p spec(int i) {
        return spec(i, 1);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        checkLayoutParams(layoutParams2, true);
        checkLayoutParams(layoutParams2, false);
        return true;
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
