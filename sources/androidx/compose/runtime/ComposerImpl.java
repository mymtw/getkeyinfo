package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.C1413a;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19323p;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.Ref$IntRef;
import p001a0.C0005b;
import p219r.C7730b;
import p219r.C7731c;
import p226r8.C7784a;
import p228s.C7792d;
import p239t.C7915c;
import p239t.C7917e;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ComposerImpl implements C1302d {

    /* renamed from: X */
    public static final /* synthetic */ int f2691X = 0;

    /* renamed from: A */
    public int f2692A;

    /* renamed from: B */
    public final C7784a f2693B;

    /* renamed from: C */
    public boolean f2694C;

    /* renamed from: D */
    public C1298b1 f2695D;

    /* renamed from: E */
    public C1301c1 f2696E;

    /* renamed from: F */
    public C1306d1 f2697F;

    /* renamed from: G */
    public boolean f2698G;

    /* renamed from: H */
    public C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> f2699H;

    /* renamed from: I */
    public C1296b f2700I;

    /* renamed from: J */
    public final ArrayList f2701J;

    /* renamed from: K */
    public boolean f2702K;

    /* renamed from: L */
    public int f2703L;

    /* renamed from: M */
    public int f2704M;

    /* renamed from: N */
    public C7784a f2705N;

    /* renamed from: O */
    public int f2706O;

    /* renamed from: P */
    public boolean f2707P;

    /* renamed from: Q */
    public boolean f2708Q;

    /* renamed from: R */
    public final C1423y f2709R;

    /* renamed from: S */
    public final C7784a f2710S;

    /* renamed from: T */
    public int f2711T;

    /* renamed from: U */
    public int f2712U;

    /* renamed from: V */
    public int f2713V;

    /* renamed from: W */
    public int f2714W;

    /* renamed from: a */
    public final C1299c<?> f2715a;

    /* renamed from: b */
    public final C1324g f2716b;

    /* renamed from: c */
    public final C1301c1 f2717c;

    /* renamed from: d */
    public final Set<C1426z0> f2718d;

    /* renamed from: e */
    public List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> f2719e;

    /* renamed from: f */
    public List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> f2720f;

    /* renamed from: g */
    public final C1349n f2721g;

    /* renamed from: h */
    public final C7784a f2722h = new C7784a(1);

    /* renamed from: i */
    public C1350n0 f2723i;

    /* renamed from: j */
    public int f2724j;

    /* renamed from: k */
    public C1423y f2725k = new C1423y();

    /* renamed from: l */
    public int f2726l;

    /* renamed from: m */
    public C1423y f2727m = new C1423y();

    /* renamed from: n */
    public int[] f2728n;

    /* renamed from: o */
    public HashMap<Integer, Integer> f2729o;

    /* renamed from: p */
    public boolean f2730p;

    /* renamed from: q */
    public boolean f2731q;

    /* renamed from: r */
    public final ArrayList f2732r = new ArrayList();

    /* renamed from: s */
    public final C1423y f2733s = new C1423y();

    /* renamed from: t */
    public C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> f2734t = C7915c.f17371d;

    /* renamed from: u */
    public final HashMap<Integer, C7792d<C1340k<Object>, C1342k1<Object>>> f2735u = new HashMap<>();

    /* renamed from: v */
    public boolean f2736v;

    /* renamed from: w */
    public final C1423y f2737w = new C1423y();

    /* renamed from: x */
    public boolean f2738x;

    /* renamed from: y */
    public int f2739y = -1;

    /* renamed from: z */
    public int f2740z;

    /* renamed from: androidx.compose.runtime.ComposerImpl$a */
    public static final class C1276a implements C1426z0 {

        /* renamed from: b */
        public final C1277b f2741b;

        public C1276a(C1277b bVar) {
            this.f2741b = bVar;
        }

        public final void onAbandoned() {
            this.f2741b.mo5494r();
        }

        public final void onForgotten() {
            this.f2741b.mo5494r();
        }

        public final void onRemembered() {
        }
    }

    /* renamed from: androidx.compose.runtime.ComposerImpl$b */
    public final class C1277b extends C1324g {

        /* renamed from: a */
        public final int f2742a;

        /* renamed from: b */
        public final boolean f2743b;

        /* renamed from: c */
        public HashSet f2744c;

        /* renamed from: d */
        public final LinkedHashSet f2745d = new LinkedHashSet();

        /* renamed from: e */
        public final ParcelableSnapshotMutableState f2746e = C0761x.m1751w0(C7915c.f17371d, C1351n1.f2948a);

        public C1277b(int i, boolean z) {
            this.f2742a = i;
            this.f2743b = z;
        }

        /* renamed from: a */
        public final void mo5477a(C1349n nVar, ComposableLambdaImpl composableLambdaImpl) {
            C19383o.m32797g(nVar, "composition");
            ComposerImpl.this.f2716b.mo5477a(nVar, composableLambdaImpl);
        }

        /* renamed from: b */
        public final void mo5478b(C1332i0 i0Var) {
            ComposerImpl.this.f2716b.mo5478b(i0Var);
        }

        /* renamed from: c */
        public final void mo5479c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f2740z--;
        }

        /* renamed from: d */
        public final boolean mo5480d() {
            return this.f2743b;
        }

        /* renamed from: e */
        public final C7792d<C1340k<Object>, C1342k1<Object>> mo5481e() {
            return (C7792d) this.f2746e.getValue();
        }

        /* renamed from: f */
        public final int mo5482f() {
            return this.f2742a;
        }

        /* renamed from: g */
        public final CoroutineContext mo5483g() {
            return ComposerImpl.this.f2716b.mo5483g();
        }

        /* renamed from: h */
        public final CoroutineContext mo5484h() {
            return C1337j.m2820b(ComposerImpl.this.f2721g);
        }

        /* renamed from: i */
        public final void mo5485i(C1332i0 i0Var) {
            ComposerImpl.this.f2716b.mo5485i(i0Var);
        }

        /* renamed from: j */
        public final void mo5486j(C1349n nVar) {
            C19383o.m32797g(nVar, "composition");
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f2716b.mo5486j(composerImpl.f2721g);
            ComposerImpl.this.f2716b.mo5486j(nVar);
        }

        /* renamed from: k */
        public final void mo5487k(C1332i0 i0Var, C1328h0 h0Var) {
            C19383o.m32797g(i0Var, "reference");
            ComposerImpl.this.f2716b.mo5487k(i0Var, h0Var);
        }

        /* renamed from: l */
        public final C1328h0 mo5488l(C1332i0 i0Var) {
            C19383o.m32797g(i0Var, "reference");
            return ComposerImpl.this.f2716b.mo5488l(i0Var);
        }

        /* renamed from: m */
        public final void mo5489m(Set<C1413a> set) {
            HashSet hashSet = this.f2744c;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f2744c = hashSet;
            }
            hashSet.add(set);
        }

        /* renamed from: n */
        public final void mo5490n(ComposerImpl composerImpl) {
            this.f2745d.add(composerImpl);
        }

        /* renamed from: o */
        public final void mo5491o() {
            ComposerImpl.this.f2740z++;
        }

        /* renamed from: p */
        public final void mo5492p(C1302d dVar) {
            C19383o.m32797g(dVar, "composer");
            HashSet hashSet = this.f2744c;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) dVar).f2717c);
                }
            }
            LinkedHashSet linkedHashSet = this.f2745d;
            C19389t.m32907a(linkedHashSet);
            linkedHashSet.remove(dVar);
        }

        /* renamed from: q */
        public final void mo5493q(C1349n nVar) {
            C19383o.m32797g(nVar, "composition");
            ComposerImpl.this.f2716b.mo5493q(nVar);
        }

        /* renamed from: r */
        public final void mo5494r() {
            if (!this.f2745d.isEmpty()) {
                HashSet hashSet = this.f2744c;
                if (hashSet != null) {
                    for (ComposerImpl composerImpl : this.f2745d) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(composerImpl.f2717c);
                        }
                    }
                }
                this.f2745d.clear();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public ComposerImpl(C1293a aVar, C1324g gVar, C1301c1 c1Var, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, C1349n nVar) {
        C19383o.m32797g(gVar, "parentContext");
        C19383o.m32797g(nVar, "composition");
        this.f2715a = aVar;
        this.f2716b = gVar;
        this.f2717c = c1Var;
        this.f2718d = hashSet;
        this.f2719e = arrayList;
        this.f2720f = arrayList2;
        this.f2721g = nVar;
        SnapshotKt.m2910i();
        this.f2693B = new C7784a(1);
        C1298b1 n = c1Var.mo5648n();
        n.mo5624b();
        this.f2695D = n;
        C1301c1 c1Var2 = new C1301c1();
        this.f2696E = c1Var2;
        C1306d1 p = c1Var2.mo5649p();
        p.mo5671f();
        this.f2697F = p;
        C1298b1 n2 = this.f2696E.mo5648n();
        try {
            C1296b a = n2.mo5623a(0);
            n2.mo5624b();
            this.f2700I = a;
            this.f2701J = new ArrayList();
            this.f2705N = new C7784a(1);
            this.f2708Q = true;
            this.f2709R = new C1423y();
            this.f2710S = new C7784a(1);
            this.f2711T = -1;
            this.f2712U = -1;
            this.f2713V = -1;
        } catch (Throwable th) {
            n2.mo5624b();
            throw th;
        }
    }

    /* renamed from: a0 */
    public static final void m2419a0(C1306d1 d1Var, C1299c<Object> cVar, int i) {
        while (true) {
            int i2 = d1Var.f2850s;
            if (!((i > i2 && i < d1Var.f2838g) || (i2 == 0 && i == 0))) {
                d1Var.mo5658G();
                if (d1Var.mo5684s(d1Var.f2850s)) {
                    cVar.mo5614h();
                }
                d1Var.mo5674i();
            } else {
                return;
            }
        }
    }

    /* renamed from: r0 */
    public static final int m2420r0(ComposerImpl composerImpl, int i, boolean z, int i2) {
        ComposerImpl composerImpl2 = composerImpl;
        int i3 = i;
        int i4 = i2;
        C1298b1 b1Var = composerImpl2.f2695D;
        int[] iArr = b1Var.f2806b;
        int i5 = 1;
        if ((iArr[(i3 * 5) + 1] & 134217728) != 0) {
            Object j = b1Var.mo5632j(i3, iArr);
            if (j != null) {
                C1325g0 g0Var = (C1325g0) j;
                Object f = composerImpl2.f2695D.mo5628f(i3, 0);
                C1296b a = composerImpl2.f2695D.mo5623a(i3);
                int g = composerImpl2.f2695D.mo5629g(i3) + i3;
                ArrayList arrayList = composerImpl2.f2732r;
                C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
                ArrayList arrayList2 = new ArrayList();
                int d = ComposerKt.m2527d(i3, arrayList);
                if (d < 0) {
                    d = -(d + 1);
                }
                while (d < arrayList.size()) {
                    C1425z zVar = (C1425z) arrayList.get(d);
                    if (zVar.f3097b >= g) {
                        break;
                    }
                    arrayList2.add(zVar);
                    d++;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    C1425z zVar2 = (C1425z) arrayList2.get(i6);
                    arrayList3.add(new Pair(zVar2.f3096a, zVar2.f3098c));
                }
                C1332i0 i0Var = new C1332i0(g0Var, f, composerImpl2.f2721g, composerImpl2.f2717c, a, arrayList3, composerImpl2.mo5414N(Integer.valueOf(i)));
                composerImpl2.f2716b.mo5478b(i0Var);
                composerImpl.mo5453n0();
                composerImpl2.mo5447k0(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl2, i0Var, a));
                if (!z) {
                    return C0005b.m8B(i3, composerImpl2.f2695D.f2806b);
                }
                composerImpl.mo5435e0();
                composerImpl.mo5439g0();
                composerImpl.mo5433d0();
                if (!composerImpl2.f2695D.mo5630h(i3)) {
                    i5 = C0005b.m8B(i3, composerImpl2.f2695D.f2806b);
                }
                if (i5 <= 0) {
                    return 0;
                }
                composerImpl2.mo5451m0(i4, i5);
                return 0;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        } else if (!C0005b.m59s(i3, iArr)) {
            return C0005b.m8B(i3, composerImpl2.f2695D.f2806b);
        } else {
            int g2 = composerImpl2.f2695D.mo5629g(i3) + i3;
            int i7 = 0;
            for (int i8 = i3 + 1; i8 < g2; i8 += composerImpl2.f2695D.mo5629g(i8)) {
                boolean h = composerImpl2.f2695D.mo5630h(i8);
                if (h) {
                    composerImpl.mo5435e0();
                    composerImpl2.f2705N.mo20336f(composerImpl2.f2695D.mo5631i(i8));
                }
                i7 += m2420r0(composerImpl2, i8, h || z, h ? 0 : i4 + i7);
                if (h) {
                    composerImpl.mo5435e0();
                    composerImpl.mo5457p0();
                }
            }
            return i7;
        }
    }

    /* renamed from: A */
    public final void mo5392A() {
        mo5464t0((Object) null, 125, (Object) null, true);
        this.f2731q = true;
    }

    /* renamed from: A0 */
    public final boolean mo5393A0(C1418v0 v0Var, Object obj) {
        C19383o.m32797g(v0Var, "scope");
        C1296b bVar = v0Var.f3080c;
        if (bVar == null) {
            return false;
        }
        C1301c1 c1Var = this.f2717c;
        C19383o.m32797g(c1Var, "slots");
        int l = c1Var.mo5646l(bVar);
        if (!this.f2694C || l < this.f2695D.f2810f) {
            return false;
        }
        ArrayList arrayList = this.f2732r;
        int d = ComposerKt.m2527d(l, arrayList);
        C7731c cVar = null;
        if (d < 0) {
            int i = -(d + 1);
            if (obj != null) {
                cVar = new C7731c();
                cVar.add(obj);
            }
            arrayList.add(i, new C1425z(v0Var, l, cVar));
        } else if (obj == null) {
            ((C1425z) arrayList.get(d)).f3098c = null;
        } else {
            C7731c<Object> cVar2 = ((C1425z) arrayList.get(d)).f3098c;
            if (cVar2 != null) {
                cVar2.add(obj);
            }
        }
        return true;
    }

    /* renamed from: B */
    public final void mo5394B() {
        this.f2738x = false;
    }

    /* renamed from: B0 */
    public final void mo5395B0(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || C19383o.m32792b(obj2, C1302d.C1303a.f2828a)) {
                this.f2703L = i ^ Integer.rotateLeft(this.f2703L, 3);
            } else {
                this.f2703L = obj2.hashCode() ^ Integer.rotateLeft(this.f2703L, 3);
            }
        } else if (obj instanceof Enum) {
            this.f2703L = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.f2703L, 3);
        } else {
            this.f2703L = obj.hashCode() ^ Integer.rotateLeft(this.f2703L, 3);
        }
    }

    /* renamed from: C */
    public final void mo5396C() {
        if (this.f2726l == 0) {
            C1418v0 X = mo5424X();
            if (X != null) {
                X.f3078a |= 16;
            }
            if (this.f2732r.isEmpty()) {
                mo5462s0();
            } else {
                mo5445j0();
            }
        } else {
            ComposerKt.m2526c("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw null;
        }
    }

    /* renamed from: C0 */
    public final void mo5397C0(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i != 207 || C19383o.m32792b(obj2, C1302d.C1303a.f2828a)) {
                mo5399D0(i);
            } else {
                mo5399D0(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            mo5399D0(((Enum) obj).ordinal());
        } else {
            mo5399D0(obj.hashCode());
        }
    }

    /* renamed from: D */
    public final void mo5398D(C1416u0 u0Var) {
        C1418v0 v0Var = u0Var instanceof C1418v0 ? (C1418v0) u0Var : null;
        if (v0Var != null) {
            v0Var.f3078a |= 1;
        }
    }

    /* renamed from: D0 */
    public final void mo5399D0(int i) {
        this.f2703L = Integer.rotateRight(Integer.hashCode(i) ^ this.f2703L, 3);
    }

    /* renamed from: E */
    public final int mo5400E() {
        return this.f2703L;
    }

    /* renamed from: E0 */
    public final void mo5401E0(int i, int i2) {
        if (mo5409I0(i) == i2) {
            return;
        }
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.f2729o;
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f2729o = hashMap;
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        int[] iArr = this.f2728n;
        if (iArr == null) {
            int i3 = this.f2695D.f2807c;
            int[] iArr2 = new int[i3];
            Arrays.fill(iArr2, 0, i3, -1);
            this.f2728n = iArr2;
            iArr = iArr2;
        }
        iArr[i] = i2;
    }

    /* renamed from: F */
    public final C1277b mo5402F() {
        mo5468v0(206, ComposerKt.f2758k);
        Object c0 = mo5431c0();
        C1276a aVar = c0 instanceof C1276a ? (C1276a) c0 : null;
        if (aVar == null) {
            aVar = new C1276a(new C1277b(this.f2703L, this.f2730p));
            mo5407H0(aVar);
        }
        C1277b bVar = aVar.f2741b;
        C7792d<C1340k<Object>, C1342k1<Object>> N = mo5414N((Integer) null);
        bVar.getClass();
        C19383o.m32797g(N, "scope");
        bVar.f2746e.setValue(N);
        mo5418R(false);
        return aVar.f2741b;
    }

    /* renamed from: F0 */
    public final void mo5403F0(int i, int i2) {
        int I0 = mo5409I0(i);
        if (I0 != i2) {
            int i3 = i2 - I0;
            int size = ((ArrayList) this.f2722h.f17221b).size() - 1;
            while (i != -1) {
                int I02 = mo5409I0(i) + i3;
                mo5401E0(i, I02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C1350n0 n0Var = (C1350n0) ((ArrayList) this.f2722h.f17221b).get(i4);
                        if (n0Var != null && n0Var.mo5897b(i, I02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f2695D.f2812h;
                } else if (!this.f2695D.mo5630h(i)) {
                    i = this.f2695D.mo5633k(i);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo5404G() {
        mo5418R(false);
    }

    /* renamed from: G0 */
    public final C7792d<C1340k<Object>, C1342k1<Object>> mo5405G0(C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar, C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar2) {
        C7917e builder = dVar.builder();
        builder.putAll(dVar2);
        C7915c e = builder.mo20417e();
        mo5468v0(204, ComposerKt.f2757j);
        mo5408I(e);
        mo5408I(dVar2);
        mo5418R(false);
        return e;
    }

    /* renamed from: H */
    public final void mo5406H() {
        mo5418R(false);
    }

    /* renamed from: H0 */
    public final void mo5407H0(Object obj) {
        if (this.f2702K) {
            C1306d1 d1Var = this.f2697F;
            if (d1Var.f2844m > 0) {
                d1Var.mo5683r(1, d1Var.f2850s);
            }
            Object[] objArr = d1Var.f2834c;
            int i = d1Var.f2839h;
            d1Var.f2839h = i + 1;
            Object obj2 = objArr[d1Var.mo5673h(i)];
            int i2 = d1Var.f2839h;
            if (i2 <= d1Var.f2840i) {
                d1Var.f2834c[d1Var.mo5673h(i2 - 1)] = obj;
                if (obj instanceof C1426z0) {
                    mo5447k0(new ComposerImpl$updateValue$1(obj));
                    this.f2718d.add(obj);
                    return;
                }
                return;
            }
            ComposerKt.m2526c("Writing to an invalid slot".toString());
            throw null;
        }
        C1298b1 b1Var = this.f2695D;
        int F = (b1Var.f2814j - C0005b.m12F(b1Var.f2812h, b1Var.f2806b)) - 1;
        if (obj instanceof C1426z0) {
            this.f2718d.add(obj);
        }
        mo5455o0(true, new ComposerImpl$updateValue$2(obj, F));
    }

    /* renamed from: I */
    public final boolean mo5408I(Object obj) {
        if (C19383o.m32792b(mo5431c0(), obj)) {
            return false;
        }
        mo5407H0(obj);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r0 = r0[r2];
     */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5409I0(int r2) {
        /*
            r1 = this;
            if (r2 >= 0) goto L_0x0019
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.f2729o
            if (r0 == 0) goto L_0x0017
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0017
            int r2 = r2.intValue()
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            return r2
        L_0x0019:
            int[] r0 = r1.f2728n
            if (r0 == 0) goto L_0x0022
            r0 = r0[r2]
            if (r0 < 0) goto L_0x0022
            return r0
        L_0x0022:
            androidx.compose.runtime.b1 r0 = r1.f2695D
            int[] r0 = r0.f2806b
            int r2 = p001a0.C0005b.m8B(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5409I0(int):int");
    }

    /* renamed from: J */
    public final Object mo5410J(C1361s0 s0Var) {
        C19383o.m32797g(s0Var, "key");
        C7792d<C1340k<Object>, C1342k1<Object>> N = mo5414N((Integer) null);
        C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
        C19383o.m32797g(N, "<this>");
        if (!N.containsKey(s0Var)) {
            return s0Var.f2934a.getValue();
        }
        C1342k1 k1Var = N.get(s0Var);
        if (k1Var != null) {
            return k1Var.getValue();
        }
        return null;
    }

    /* renamed from: K */
    public final void mo5411K() {
        mo5412L();
        ((ArrayList) this.f2722h.f17221b).clear();
        this.f2725k.f3095b = 0;
        this.f2727m.f3095b = 0;
        this.f2733s.f3095b = 0;
        this.f2737w.f3095b = 0;
        this.f2735u.clear();
        this.f2695D.mo5624b();
        this.f2703L = 0;
        this.f2740z = 0;
        this.f2731q = false;
        this.f2694C = false;
    }

    /* renamed from: L */
    public final void mo5412L() {
        this.f2723i = null;
        this.f2724j = 0;
        this.f2726l = 0;
        this.f2706O = 0;
        this.f2703L = 0;
        this.f2731q = false;
        this.f2707P = false;
        this.f2709R.f3095b = 0;
        ((ArrayList) this.f2693B.f17221b).clear();
        this.f2728n = null;
        this.f2729o = null;
    }

    /* renamed from: M */
    public final int mo5413M(int i, int i2, int i3) {
        int i4;
        Object obj;
        if (i == i2) {
            return i3;
        }
        C1298b1 b1Var = this.f2695D;
        if (C0005b.m66w(i, b1Var.f2806b)) {
            Object j = b1Var.mo5632j(i, b1Var.f2806b);
            i4 = j != null ? j instanceof Enum ? ((Enum) j).ordinal() : j instanceof C1325g0 ? 126665345 : j.hashCode() : 0;
        } else {
            int[] iArr = b1Var.f2806b;
            int i5 = i * 5;
            int i6 = iArr[i5];
            if (i6 == 207) {
                if (C0005b.m65v(i, iArr)) {
                    obj = b1Var.f2808d[i5 >= iArr.length ? iArr.length : C0005b.m27U(iArr[i5 + 1] >> 29) + iArr[i5 + 4]];
                } else {
                    obj = C1302d.C1303a.f2828a;
                }
                if (obj != null && !C19383o.m32792b(obj, C1302d.C1303a.f2828a)) {
                    i4 = obj.hashCode();
                }
            }
            i4 = i6;
        }
        return i4 == 126665345 ? i4 : Integer.rotateLeft(mo5413M(this.f2695D.mo5633k(i), i2, i3), 3) ^ i4;
    }

    /* renamed from: N */
    public final C7792d<C1340k<Object>, C1342k1<Object>> mo5414N(Integer num) {
        Object obj;
        C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar;
        if (num == null && (dVar = this.f2699H) != null) {
            return dVar;
        }
        if (this.f2702K && this.f2698G) {
            int i = this.f2697F.f2850s;
            while (i > 0) {
                C1306d1 d1Var = this.f2697F;
                if (d1Var.f2833b[d1Var.mo5679n(i) * 5] == 202) {
                    C1306d1 d1Var2 = this.f2697F;
                    int n = d1Var2.mo5679n(i);
                    if (C19383o.m32792b(C0005b.m66w(n, d1Var2.f2833b) ? d1Var2.f2834c[C0005b.m9C(n, d1Var2.f2833b)] : null, ComposerKt.f2755h)) {
                        C1306d1 d1Var3 = this.f2697F;
                        int n2 = d1Var3.mo5679n(i);
                        Object obj2 = C0005b.m65v(n2, d1Var3.f2833b) ? d1Var3.f2834c[d1Var3.mo5669d(n2, d1Var3.f2833b)] : C1302d.C1303a.f2828a;
                        if (obj2 != null) {
                            C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar2 = (C7792d) obj2;
                            this.f2699H = dVar2;
                            return dVar2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    }
                }
                i = this.f2697F.mo5691y(i);
            }
        }
        C1298b1 b1Var = this.f2695D;
        if (b1Var.f2807c > 0) {
            int intValue = num != null ? num.intValue() : b1Var.f2812h;
            while (intValue > 0) {
                C1298b1 b1Var2 = this.f2695D;
                int[] iArr = b1Var2.f2806b;
                int i2 = intValue * 5;
                if (iArr[i2] != 202 || !C19383o.m32792b(b1Var2.mo5632j(intValue, iArr), ComposerKt.f2755h)) {
                    intValue = this.f2695D.mo5633k(intValue);
                } else {
                    C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar3 = this.f2735u.get(Integer.valueOf(intValue));
                    if (dVar3 == null) {
                        C1298b1 b1Var3 = this.f2695D;
                        int[] iArr2 = b1Var3.f2806b;
                        if (C0005b.m65v(intValue, iArr2)) {
                            obj = b1Var3.f2808d[i2 >= iArr2.length ? iArr2.length : iArr2[i2 + 4] + C0005b.m27U(iArr2[i2 + 1] >> 29)];
                        } else {
                            obj = C1302d.C1303a.f2828a;
                        }
                        if (obj != null) {
                            dVar3 = (C7792d) obj;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                    }
                    this.f2699H = dVar3;
                    return dVar3;
                }
            }
        }
        C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar4 = this.f2734t;
        this.f2699H = dVar4;
        return dVar4;
    }

    /* renamed from: O */
    public final void mo5415O() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f2716b.mo5492p(this);
            ((ArrayList) this.f2693B.f17221b).clear();
            this.f2732r.clear();
            this.f2719e.clear();
            this.f2735u.clear();
            this.f2715a.clear();
            C19394m mVar = C19394m.f43287a;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: P */
    public final void mo5416P(C7730b bVar, ComposableLambdaImpl composableLambdaImpl) {
        if (!this.f2694C) {
            Trace.beginSection("Compose:recompose");
            try {
                this.f2692A = SnapshotKt.m2910i().mo5996d();
                this.f2735u.clear();
                int i = bVar.f17146c;
                int i2 = 0;
                while (i2 < i) {
                    Object obj = bVar.f17144a[i2];
                    if (obj != null) {
                        C7731c cVar = (C7731c) bVar.f17145b[i2];
                        C1418v0 v0Var = (C1418v0) obj;
                        C1296b bVar2 = v0Var.f3080c;
                        if (bVar2 != null) {
                            this.f2732r.add(new C1425z(v0Var, bVar2.f2800a, cVar));
                            i2++;
                        } else {
                            Trace.endSection();
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                }
                ArrayList arrayList = this.f2732r;
                if (arrayList.size() > 1) {
                    C19323p.m32627I0(arrayList, new C1308e());
                }
                this.f2724j = 0;
                this.f2694C = true;
                mo5476z0();
                Object c0 = mo5431c0();
                if (!(c0 == composableLambdaImpl || composableLambdaImpl == null)) {
                    mo5407H0(composableLambdaImpl);
                }
                C0761x.m1757z0(new ComposerImpl$doCompose$2$5(composableLambdaImpl, this, c0), new ComposerImpl$doCompose$2$3(this), new ComposerImpl$doCompose$2$4(this));
                mo5422V();
                this.f2694C = false;
                this.f2732r.clear();
                C19394m mVar = C19394m.f43287a;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            ComposerKt.m2526c("Reentrant composition is not supported".toString());
            throw null;
        }
    }

    /* renamed from: Q */
    public final void mo5417Q(int i, int i2) {
        if (i > 0 && i != i2) {
            mo5417Q(this.f2695D.mo5633k(i), i2);
            if (this.f2695D.mo5630h(i)) {
                this.f2705N.mo20336f(this.f2695D.mo5631i(i));
            }
        }
    }

    /* renamed from: R */
    public final void mo5418R(boolean z) {
        boolean z2;
        HashSet hashSet;
        int i;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList;
        Object obj;
        if (this.f2702K) {
            C1306d1 d1Var = this.f2697F;
            int i2 = d1Var.f2850s;
            int i3 = d1Var.f2833b[d1Var.mo5679n(i2) * 5];
            C1306d1 d1Var2 = this.f2697F;
            int n = d1Var2.mo5679n(i2);
            Object obj2 = C0005b.m66w(n, d1Var2.f2833b) ? d1Var2.f2834c[C0005b.m9C(n, d1Var2.f2833b)] : null;
            C1306d1 d1Var3 = this.f2697F;
            int n2 = d1Var3.mo5679n(i2);
            mo5397C0(i3, obj2, C0005b.m65v(n2, d1Var3.f2833b) ? d1Var3.f2834c[d1Var3.mo5669d(n2, d1Var3.f2833b)] : C1302d.C1303a.f2828a);
        } else {
            C1298b1 b1Var = this.f2695D;
            int i4 = b1Var.f2812h;
            int[] iArr = b1Var.f2806b;
            int i5 = i4 * 5;
            int i6 = iArr[i5];
            Object j = b1Var.mo5632j(i4, iArr);
            C1298b1 b1Var2 = this.f2695D;
            int[] iArr2 = b1Var2.f2806b;
            if (C0005b.m65v(i4, iArr2)) {
                obj = b1Var2.f2808d[i5 >= iArr2.length ? iArr2.length : iArr2[i5 + 4] + C0005b.m27U(iArr2[i5 + 1] >> 29)];
            } else {
                obj = C1302d.C1303a.f2828a;
            }
            mo5397C0(i6, j, obj);
        }
        int i7 = this.f2726l;
        C1350n0 n0Var = this.f2723i;
        int i8 = 0;
        if (n0Var != null && n0Var.f2942a.size() > 0) {
            List<C1297b0> list = n0Var.f2942a;
            ArrayList arrayList2 = n0Var.f2945d;
            C19383o.m32797g(arrayList2, "<this>");
            HashSet hashSet2 = new HashSet(arrayList2.size());
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                hashSet2.add(arrayList2.get(i9));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int size2 = arrayList2.size();
            int size3 = list.size();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < size3) {
                C1297b0 b0Var = list.get(i10);
                if (!hashSet2.contains(b0Var)) {
                    mo5451m0(n0Var.mo5896a(b0Var) + n0Var.f2943b, b0Var.f2804d);
                    n0Var.mo5897b(b0Var.f2803c, i8);
                    int i13 = b0Var.f2803c;
                    C1298b1 b1Var3 = this.f2695D;
                    hashSet = hashSet2;
                    this.f2706O = i13 - (b1Var3.f2810f - this.f2706O);
                    b1Var3.mo5634l(i13);
                    mo5449l0();
                    this.f2695D.mo5635m();
                    ArrayList arrayList3 = this.f2732r;
                    int i14 = b0Var.f2803c;
                    ComposerKt.m2524a(arrayList3, i14, this.f2695D.mo5629g(i14) + i14);
                } else {
                    hashSet = hashSet2;
                    if (!linkedHashSet2.contains(b0Var)) {
                        if (i11 < size2) {
                            C1297b0 b0Var2 = (C1297b0) arrayList2.get(i11);
                            if (b0Var2 != b0Var) {
                                int a = n0Var.mo5896a(b0Var2);
                                linkedHashSet2.add(b0Var2);
                                if (a != i12) {
                                    C1417v vVar = n0Var.f2946e.get(Integer.valueOf(b0Var2.f2803c));
                                    int i15 = vVar != null ? vVar.f3077c : b0Var2.f2804d;
                                    int i16 = n0Var.f2943b;
                                    int i17 = a + i16;
                                    int i18 = i16 + i12;
                                    if (i15 > 0) {
                                        arrayList = arrayList2;
                                        int i19 = this.f2714W;
                                        if (i19 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            i = size2;
                                            if (this.f2712U == i17 - i19 && this.f2713V == i18 - i19) {
                                                this.f2714W = i19 + i15;
                                            }
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i = size2;
                                        }
                                        mo5435e0();
                                        this.f2712U = i17;
                                        this.f2713V = i18;
                                        this.f2714W = i15;
                                    } else {
                                        arrayList = arrayList2;
                                        linkedHashSet = linkedHashSet2;
                                        i = size2;
                                    }
                                    if (a > i12) {
                                        Collection<C1417v> values = n0Var.f2946e.values();
                                        C19383o.m32796f(values, "groupInfos.values");
                                        for (C1417v vVar2 : values) {
                                            int i20 = vVar2.f3076b;
                                            if (a <= i20 && i20 < a + i15) {
                                                vVar2.f3076b = (i20 - a) + i12;
                                            } else {
                                                if (i12 <= i20 && i20 < a) {
                                                    vVar2.f3076b = i20 + i15;
                                                }
                                            }
                                        }
                                    } else if (i12 > a) {
                                        Collection<C1417v> values2 = n0Var.f2946e.values();
                                        C19383o.m32796f(values2, "groupInfos.values");
                                        for (C1417v vVar3 : values2) {
                                            int i21 = vVar3.f3076b;
                                            if (a <= i21 && i21 < a + i15) {
                                                vVar3.f3076b = (i21 - a) + i12;
                                            } else {
                                                if (a + 1 <= i21 && i21 < i12) {
                                                    vVar3.f3076b = i21 - i15;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = arrayList2;
                                    linkedHashSet = linkedHashSet2;
                                    i = size2;
                                }
                            } else {
                                arrayList = arrayList2;
                                linkedHashSet = linkedHashSet2;
                                i = size2;
                                i10++;
                            }
                            i11++;
                            C19383o.m32797g(b0Var2, "keyInfo");
                            C1417v vVar4 = n0Var.f2946e.get(Integer.valueOf(b0Var2.f2803c));
                            i12 += vVar4 != null ? vVar4.f3077c : b0Var2.f2804d;
                            hashSet2 = hashSet;
                            arrayList2 = arrayList;
                            linkedHashSet2 = linkedHashSet;
                            size2 = i;
                            i8 = 0;
                        }
                        hashSet2 = hashSet;
                        i8 = 0;
                    }
                }
                i10++;
                hashSet2 = hashSet;
                i8 = 0;
            }
            mo5435e0();
            if (list.size() > 0) {
                C1298b1 b1Var4 = this.f2695D;
                this.f2706O = b1Var4.f2811g - (b1Var4.f2810f - this.f2706O);
                b1Var4.mo5636n();
            }
        }
        int i22 = this.f2724j;
        while (true) {
            C1298b1 b1Var5 = this.f2695D;
            if ((b1Var5.f2813i > 0) || b1Var5.f2810f == b1Var5.f2811g) {
                break;
            }
            int i23 = b1Var5.f2810f;
            mo5449l0();
            mo5451m0(i22, this.f2695D.mo5635m());
            ComposerKt.m2524a(this.f2732r, i23, this.f2695D.f2810f);
        }
        boolean z3 = this.f2702K;
        int i24 = -1;
        if (z3) {
            if (z) {
                this.f2701J.add(this.f2710S.mo20335e());
                i7 = 1;
            }
            C1298b1 b1Var6 = this.f2695D;
            int i25 = b1Var6.f2813i;
            if (i25 > 0) {
                b1Var6.f2813i = i25 - 1;
                C1306d1 d1Var4 = this.f2697F;
                int i26 = d1Var4.f2850s;
                d1Var4.mo5674i();
                if (!(this.f2695D.f2813i > 0)) {
                    int i27 = -2 - i26;
                    this.f2697F.mo5675j();
                    this.f2697F.mo5671f();
                    C1296b bVar = this.f2700I;
                    if (this.f2701J.isEmpty()) {
                        ComposerImpl$recordInsert$1 composerImpl$recordInsert$1 = new ComposerImpl$recordInsert$1(this.f2696E, bVar);
                        mo5437f0(false);
                        mo5453n0();
                        mo5447k0(composerImpl$recordInsert$1);
                        z2 = false;
                    } else {
                        ArrayList q1 = C19327t.m32661q1(this.f2701J);
                        this.f2701J.clear();
                        mo5439g0();
                        mo5433d0();
                        ComposerImpl$recordInsert$2 composerImpl$recordInsert$2 = new ComposerImpl$recordInsert$2(this.f2696E, bVar, q1);
                        z2 = false;
                        mo5437f0(false);
                        mo5453n0();
                        mo5447k0(composerImpl$recordInsert$2);
                    }
                    this.f2702K = z2;
                    if (!(this.f2717c.f2821c == 0 ? true : z2)) {
                        mo5401E0(i27, z2 ? 1 : 0);
                        mo5403F0(i27, i7);
                    }
                }
            } else {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
        } else {
            if (z) {
                mo5457p0();
            }
            int i28 = this.f2695D.f2812h;
            C1423y yVar = this.f2709R;
            int i29 = yVar.f3095b;
            if ((i29 > 0 ? yVar.f3094a[i29 + -1] : -1) <= i28) {
                if (i29 > 0) {
                    i24 = yVar.f3094a[i29 - 1];
                }
                if (i24 == i28) {
                    yVar.mo6114a();
                    mo5455o0(false, ComposerKt.f2750c);
                }
                int i30 = this.f2695D.f2812h;
                if (i7 != mo5409I0(i30)) {
                    mo5403F0(i30, i7);
                }
                if (z) {
                    i7 = 1;
                }
                this.f2695D.mo5625c();
                mo5435e0();
            } else {
                ComposerKt.m2526c("Missed recording an endGroup".toString());
                throw null;
            }
        }
        C1350n0 n0Var2 = (C1350n0) this.f2722h.mo20335e();
        if (n0Var2 != null && !z3) {
            n0Var2.f2944c++;
        }
        this.f2723i = n0Var2;
        this.f2724j = this.f2725k.mo6114a() + i7;
        this.f2726l = this.f2727m.mo6114a() + i7;
    }

    /* renamed from: S */
    public final void mo5419S() {
        boolean z = false;
        mo5418R(false);
        C1418v0 X = mo5424X();
        if (X != null) {
            int i = X.f3078a;
            if ((i & 1) != 0) {
                z = true;
            }
            if (z) {
                X.f3078a = i | 2;
            }
        }
    }

    /* renamed from: T */
    public final void mo5420T() {
        boolean z = false;
        mo5418R(false);
        mo5418R(false);
        int a = this.f2737w.mo6114a();
        C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
        if (a != 0) {
            z = true;
        }
        this.f2736v = z;
        this.f2699H = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0065  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.C1418v0 mo5421U() {
        /*
            r9 = this;
            r8.a r0 = r9.f2693B
            java.lang.Object r0 = r0.f17221b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r8.a r0 = r9.f2693B
            java.lang.Object r0 = r0.mo20335e()
            androidx.compose.runtime.v0 r0 = (androidx.compose.runtime.C1418v0) r0
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            if (r0 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            int r3 = r0.f3078a
            r3 = r3 & -9
            r0.f3078a = r3
        L_0x0022:
            r3 = 0
            if (r0 == 0) goto L_0x006d
            int r4 = r9.f2692A
            r.a r5 = r0.f3083f
            if (r5 == 0) goto L_0x0062
            int r6 = r0.f3078a
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0033
            r6 = r1
            goto L_0x0034
        L_0x0033:
            r6 = r3
        L_0x0034:
            if (r6 != 0) goto L_0x0062
            int r6 = r5.f17141a
            r7 = r3
        L_0x0039:
            if (r7 >= r6) goto L_0x0059
            java.lang.Object[] r8 = r5.f17142b
            r8 = r8[r7]
            if (r8 == 0) goto L_0x0051
            int[] r8 = r5.f17143c
            r8 = r8[r7]
            if (r8 == r4) goto L_0x0049
            r8 = r1
            goto L_0x004a
        L_0x0049:
            r8 = r3
        L_0x004a:
            if (r8 == 0) goto L_0x004e
            r6 = r1
            goto L_0x005a
        L_0x004e:
            int r7 = r7 + 1
            goto L_0x0039
        L_0x0051:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Any"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            r6 = r3
        L_0x005a:
            if (r6 == 0) goto L_0x0062
            androidx.compose.runtime.RecomposeScopeImpl$end$1$2 r6 = new androidx.compose.runtime.RecomposeScopeImpl$end$1$2
            r6.<init>(r0, r4, r5)
            goto L_0x0063
        L_0x0062:
            r6 = r2
        L_0x0063:
            if (r6 == 0) goto L_0x006d
            androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1 r4 = new androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
            r4.<init>(r6, r9)
            r9.mo5447k0(r4)
        L_0x006d:
            if (r0 == 0) goto L_0x00a7
            int r4 = r0.f3078a
            r5 = r4 & 16
            if (r5 == 0) goto L_0x0077
            r5 = r1
            goto L_0x0078
        L_0x0077:
            r5 = r3
        L_0x0078:
            if (r5 != 0) goto L_0x00a7
            r4 = r4 & r1
            if (r4 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r1 = r3
        L_0x007f:
            if (r1 != 0) goto L_0x0085
            boolean r1 = r9.f2730p
            if (r1 == 0) goto L_0x00a7
        L_0x0085:
            androidx.compose.runtime.b r1 = r0.f3080c
            if (r1 != 0) goto L_0x00a0
            boolean r1 = r9.f2702K
            if (r1 == 0) goto L_0x0096
            androidx.compose.runtime.d1 r1 = r9.f2697F
            int r2 = r1.f2850s
            androidx.compose.runtime.b r1 = r1.mo5667b(r2)
            goto L_0x009e
        L_0x0096:
            androidx.compose.runtime.b1 r1 = r9.f2695D
            int r2 = r1.f2812h
            androidx.compose.runtime.b r1 = r1.mo5623a(r2)
        L_0x009e:
            r0.f3080c = r1
        L_0x00a0:
            int r1 = r0.f3078a
            r1 = r1 & -5
            r0.f3078a = r1
            r2 = r0
        L_0x00a7:
            r9.mo5418R(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5421U():androidx.compose.runtime.v0");
    }

    /* renamed from: V */
    public final void mo5422V() {
        boolean z = false;
        mo5418R(false);
        this.f2716b.mo5479c();
        mo5418R(false);
        if (this.f2707P) {
            mo5455o0(false, ComposerKt.f2750c);
            this.f2707P = false;
        }
        mo5439g0();
        if (((ArrayList) this.f2722h.f17221b).isEmpty()) {
            if (this.f2709R.f3095b == 0) {
                z = true;
            }
            if (z) {
                mo5412L();
                this.f2695D.mo5624b();
                return;
            }
            ComposerKt.m2526c("Missed recording an endGroup()".toString());
            throw null;
        }
        ComposerKt.m2526c("Start/end imbalance".toString());
        throw null;
    }

    /* renamed from: W */
    public final void mo5423W(boolean z, C1350n0 n0Var) {
        this.f2722h.mo20336f(this.f2723i);
        this.f2723i = n0Var;
        this.f2725k.mo6115b(this.f2724j);
        if (z) {
            this.f2724j = 0;
        }
        this.f2727m.mo6115b(this.f2726l);
        this.f2726l = 0;
    }

    /* renamed from: X */
    public final C1418v0 mo5424X() {
        C7784a aVar = this.f2693B;
        if (this.f2740z != 0 || !(!((ArrayList) aVar.f17221b).isEmpty())) {
            return null;
        }
        Object obj = aVar.f17221b;
        return (C1418v0) ((ArrayList) obj).get(((ArrayList) obj).size() - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5425Y() {
        /*
            r3 = this;
            boolean r0 = r3.f2736v
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001c
            androidx.compose.runtime.v0 r0 = r3.mo5424X()
            if (r0 == 0) goto L_0x0019
            int r0 = r0.f3078a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 != r2) goto L_0x0019
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5425Y():boolean");
    }

    /* renamed from: Z */
    public final void mo5426Z(ArrayList arrayList) {
        int i;
        C1298b1 n;
        C1298b1 b1Var;
        int[] iArr;
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list;
        C1298b1 n2;
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list2 = this.f2720f;
        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list3 = this.f2719e;
        try {
            this.f2719e = list2;
            mo5447k0(ComposerKt.f2752e);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Pair pair = (Pair) arrayList.get(i2);
                C1332i0 i0Var = (C1332i0) pair.component1();
                C1332i0 i0Var2 = (C1332i0) pair.component2();
                C1296b bVar = i0Var.f2919e;
                int l = i0Var.f2918d.mo5646l(bVar);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                mo5439g0();
                mo5447k0(new ComposerImpl$insertMovableContentReferences$1$1$1(ref$IntRef, bVar));
                if (i0Var2 == null) {
                    if (C19383o.m32792b(i0Var.f2918d, this.f2696E)) {
                        ComposerKt.m2529f(this.f2697F.f2851t);
                        C1301c1 c1Var = new C1301c1();
                        this.f2696E = c1Var;
                        C1306d1 p = c1Var.mo5649p();
                        p.mo5671f();
                        this.f2697F = p;
                    }
                    n2 = i0Var.f2918d.mo5648n();
                    n2.mo5634l(l);
                    this.f2706O = l;
                    ArrayList arrayList2 = new ArrayList();
                    mo5443i0((C1349n) null, (C1349n) null, (Integer) null, EmptyList.INSTANCE, new ComposerImpl$insertMovableContentReferences$1$1$2$1(this, arrayList2, n2, i0Var));
                    if (!arrayList2.isEmpty()) {
                        mo5447k0(new ComposerImpl$insertMovableContentReferences$1$1$2$2(ref$IntRef, arrayList2));
                    }
                    C19394m mVar = C19394m.f43287a;
                    n2.mo5624b();
                    i = size;
                } else {
                    C1301c1 c1Var2 = i0Var2.f2918d;
                    C1296b bVar2 = i0Var2.f2919e;
                    ArrayList arrayList3 = new ArrayList();
                    n = c1Var2.mo5648n();
                    ComposerKt.m2525b(n, arrayList3, c1Var2.mo5646l(bVar2));
                    C19394m mVar2 = C19394m.f43287a;
                    n.mo5624b();
                    if (!arrayList3.isEmpty()) {
                        mo5447k0(new ComposerImpl$insertMovableContentReferences$1$1$3(ref$IntRef, arrayList3));
                        int l2 = this.f2717c.mo5646l(bVar);
                        mo5401E0(l2, mo5409I0(l2) + arrayList3.size());
                    }
                    mo5447k0(new ComposerImpl$insertMovableContentReferences$1$1$4(this, i0Var2, i0Var));
                    C1301c1 c1Var3 = i0Var2.f2918d;
                    C1298b1 n3 = c1Var3.mo5648n();
                    try {
                        b1Var = this.f2695D;
                        iArr = this.f2728n;
                        this.f2728n = null;
                        this.f2695D = n3;
                        int l3 = c1Var3.mo5646l(i0Var2.f2919e);
                        n3.mo5634l(l3);
                        this.f2706O = l3;
                        ArrayList arrayList4 = new ArrayList();
                        List<C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>> list4 = this.f2719e;
                        try {
                            this.f2719e = arrayList4;
                            C1349n nVar = i0Var2.f2917c;
                            C1349n nVar2 = i0Var.f2917c;
                            Integer valueOf = Integer.valueOf(n3.f2810f);
                            List<Pair<C1418v0, C7731c<Object>>> list5 = i0Var2.f2920f;
                            i = size;
                            ComposerImpl$insertMovableContentReferences$1$1$5$1$1$1 composerImpl$insertMovableContentReferences$1$1$5$1$1$1 = new ComposerImpl$insertMovableContentReferences$1$1$5$1$1$1(this, i0Var);
                            C1349n nVar3 = nVar;
                            C1349n nVar4 = nVar2;
                            Integer num = valueOf;
                            list = list4;
                            ArrayList arrayList5 = arrayList4;
                            try {
                                mo5443i0(nVar3, nVar4, num, list5, composerImpl$insertMovableContentReferences$1$1$5$1$1$1);
                                this.f2719e = list;
                                if (!arrayList5.isEmpty()) {
                                    mo5447k0(new ComposerImpl$insertMovableContentReferences$1$1$5$1$2(ref$IntRef, arrayList5));
                                }
                                this.f2695D = b1Var;
                                this.f2728n = iArr;
                                n3.mo5624b();
                            } catch (Throwable th) {
                                th = th;
                                this.f2719e = list;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            list = list4;
                            this.f2719e = list;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        n3.mo5624b();
                        throw th3;
                    }
                }
                mo5447k0(ComposerKt.f2749b);
                i2++;
                size = i;
            }
            mo5447k0(ComposerImpl$insertMovableContentReferences$1$2.INSTANCE);
            this.f2706O = 0;
            C19394m mVar3 = C19394m.f43287a;
            this.f2719e = list3;
            mo5412L();
        } catch (Throwable th4) {
            this.f2719e = list3;
            throw th4;
        }
    }

    /* renamed from: a */
    public final boolean mo5427a(boolean z) {
        Object c0 = mo5431c0();
        if ((c0 instanceof Boolean) && z == ((Boolean) c0).booleanValue()) {
            return false;
        }
        mo5407H0(Boolean.valueOf(z));
        return true;
    }

    /* renamed from: b */
    public final boolean mo5428b(float f) {
        Object c0 = mo5431c0();
        if (c0 instanceof Float) {
            if (f == ((Number) c0).floatValue()) {
                return false;
            }
        }
        mo5407H0(Float.valueOf(f));
        return true;
    }

    /* renamed from: b0 */
    public final void mo5429b0(C1325g0<Object> g0Var, C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar, Object obj, boolean z) {
        mo5475z(126665345, g0Var);
        mo5408I(obj);
        int i = this.f2703L;
        this.f2703L = 126665345;
        if (this.f2702K) {
            C1306d1 d1Var = this.f2697F;
            int i2 = d1Var.f2850s;
            int n = d1Var.mo5679n(i2);
            int[] iArr = d1Var.f2833b;
            int i3 = (n * 5) + 1;
            int i4 = iArr[i3];
            if (!((i4 & 134217728) != 0)) {
                iArr[i3] = i4 | 134217728;
                if (!C0005b.m59s(n, iArr)) {
                    d1Var.mo5664M(d1Var.mo5691y(i2));
                }
            }
        }
        boolean z2 = !this.f2702K && !C19383o.m32792b(this.f2695D.mo5626d(), dVar);
        if (z2) {
            this.f2735u.put(Integer.valueOf(this.f2695D.f2810f), dVar);
        }
        mo5464t0(ComposerKt.f2755h, 202, dVar, false);
        if (!this.f2702K || z) {
            boolean z3 = this.f2736v;
            this.f2736v = z2;
            ComposableLambdaImpl B = C18263b.m30807B(new ComposerImpl$invokeMovableContentLambda$1(g0Var, obj), 1378964644, true);
            C19389t.m32910d(2, B);
            B.invoke(this, 1);
            this.f2736v = z3;
        } else {
            this.f2698G = true;
            this.f2699H = null;
            C1306d1 d1Var2 = this.f2697F;
            this.f2716b.mo5485i(new C1332i0(g0Var, obj, this.f2721g, this.f2696E, d1Var2.mo5667b(d1Var2.mo5691y(d1Var2.f2850s)), EmptyList.INSTANCE, mo5414N((Integer) null)));
        }
        mo5418R(false);
        this.f2703L = i;
        mo5418R(false);
    }

    /* renamed from: c */
    public final void mo5430c() {
        this.f2738x = this.f2739y >= 0;
    }

    /* renamed from: c0 */
    public final Object mo5431c0() {
        Object obj;
        int i;
        if (!this.f2702K) {
            C1298b1 b1Var = this.f2695D;
            if (b1Var.f2813i > 0 || (i = b1Var.f2814j) >= b1Var.f2815k) {
                obj = C1302d.C1303a.f2828a;
            } else {
                Object[] objArr = b1Var.f2808d;
                b1Var.f2814j = i + 1;
                obj = objArr[i];
            }
            return this.f2738x ? C1302d.C1303a.f2828a : obj;
        } else if (!this.f2731q) {
            return C1302d.C1303a.f2828a;
        } else {
            ComposerKt.m2526c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
    }

    /* renamed from: d */
    public final boolean mo5432d(int i) {
        Object c0 = mo5431c0();
        if ((c0 instanceof Integer) && i == ((Number) c0).intValue()) {
            return false;
        }
        mo5407H0(Integer.valueOf(i));
        return true;
    }

    /* renamed from: d0 */
    public final void mo5433d0() {
        if (!((ArrayList) this.f2705N.f17221b).isEmpty()) {
            C7784a aVar = this.f2705N;
            int size = ((ArrayList) aVar.f17221b).size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = ((ArrayList) aVar.f17221b).get(i);
            }
            mo5447k0(new ComposerImpl$realizeDowns$1(objArr));
            ((ArrayList) this.f2705N.f17221b).clear();
        }
    }

    /* renamed from: e */
    public final boolean mo5434e(long j) {
        Object c0 = mo5431c0();
        if ((c0 instanceof Long) && j == ((Number) c0).longValue()) {
            return false;
        }
        mo5407H0(Long.valueOf(j));
        return true;
    }

    /* renamed from: e0 */
    public final void mo5435e0() {
        int i = this.f2714W;
        this.f2714W = 0;
        if (i > 0) {
            int i2 = this.f2711T;
            if (i2 >= 0) {
                this.f2711T = -1;
                ComposerImpl$realizeMovement$1 composerImpl$realizeMovement$1 = new ComposerImpl$realizeMovement$1(i2, i);
                mo5439g0();
                mo5433d0();
                mo5447k0(composerImpl$realizeMovement$1);
                return;
            }
            int i3 = this.f2712U;
            this.f2712U = -1;
            int i4 = this.f2713V;
            this.f2713V = -1;
            ComposerImpl$realizeMovement$2 composerImpl$realizeMovement$2 = new ComposerImpl$realizeMovement$2(i3, i4, i);
            mo5439g0();
            mo5433d0();
            mo5447k0(composerImpl$realizeMovement$2);
        }
    }

    /* renamed from: f */
    public final boolean mo5436f() {
        return this.f2702K;
    }

    /* renamed from: f0 */
    public final void mo5437f0(boolean z) {
        int i = z ? this.f2695D.f2812h : this.f2695D.f2810f;
        int i2 = i - this.f2706O;
        if (!(i2 >= 0)) {
            ComposerKt.m2526c("Tried to seek backward".toString());
            throw null;
        } else if (i2 > 0) {
            mo5447k0(new ComposerImpl$realizeOperationLocation$2(i2));
            this.f2706O = i;
        }
    }

    /* renamed from: g */
    public final void mo5438g(boolean z) {
        if (!(this.f2726l == 0)) {
            ComposerKt.m2526c("No nodes can be emitted before calling dactivateToEndGroup".toString());
            throw null;
        } else if (this.f2702K) {
        } else {
            if (!z) {
                mo5462s0();
                return;
            }
            C1298b1 b1Var = this.f2695D;
            int i = b1Var.f2810f;
            int i2 = b1Var.f2811g;
            int i3 = i;
            while (i3 < i2) {
                C1298b1 b1Var2 = this.f2695D;
                ComposerImpl$deactivateToEndGroup$2 composerImpl$deactivateToEndGroup$2 = new ComposerImpl$deactivateToEndGroup$2(this, i3);
                b1Var2.getClass();
                int F = C0005b.m12F(i3, b1Var2.f2806b);
                i3++;
                C1301c1 c1Var = b1Var2.f2805a;
                int t = i3 < c1Var.f2821c ? C0005b.m61t(i3, c1Var.f2820b) : c1Var.f2823e;
                for (int i4 = F; i4 < t; i4++) {
                    composerImpl$deactivateToEndGroup$2.invoke(Integer.valueOf(i4 - F), b1Var2.f2808d[i4]);
                }
            }
            ComposerKt.m2524a(this.f2732r, i, i2);
            this.f2695D.mo5634l(i);
            this.f2695D.mo5636n();
        }
    }

    /* renamed from: g0 */
    public final void mo5439g0() {
        int i = this.f2704M;
        if (i > 0) {
            this.f2704M = 0;
            mo5447k0(new ComposerImpl$realizeUps$1(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: androidx.compose.runtime.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.ComposerImpl mo5440h(int r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r5.mo5464t0(r0, r6, r0, r1)
            boolean r6 = r5.f2702K
            if (r6 == 0) goto L_0x0025
            androidx.compose.runtime.v0 r6 = new androidx.compose.runtime.v0
            androidx.compose.runtime.n r0 = r5.f2721g
            androidx.compose.runtime.i r0 = (androidx.compose.runtime.C1330i) r0
            r6.<init>(r0)
            r8.a r0 = r5.f2693B
            r0.mo20336f(r6)
            r5.mo5407H0(r6)
            int r0 = r5.f2692A
            r6.f3082e = r0
            int r0 = r6.f3078a
            r0 = r0 & -17
            r6.f3078a = r0
            goto L_0x008a
        L_0x0025:
            java.util.ArrayList r6 = r5.f2732r
            androidx.compose.runtime.b1 r2 = r5.f2695D
            int r2 = r2.f2812h
            int r2 = androidx.compose.runtime.ComposerKt.m2527d(r2, r6)
            if (r2 < 0) goto L_0x0038
            java.lang.Object r6 = r6.remove(r2)
            r0 = r6
            androidx.compose.runtime.z r0 = (androidx.compose.runtime.C1425z) r0
        L_0x0038:
            androidx.compose.runtime.b1 r6 = r5.f2695D
            int r2 = r6.f2813i
            if (r2 > 0) goto L_0x004e
            int r2 = r6.f2814j
            int r3 = r6.f2815k
            if (r2 < r3) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            java.lang.Object[] r3 = r6.f2808d
            int r4 = r2 + 1
            r6.f2814j = r4
            r6 = r3[r2]
            goto L_0x0050
        L_0x004e:
            androidx.compose.runtime.d$a$a r6 = androidx.compose.runtime.C1302d.C1303a.f2828a
        L_0x0050:
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r6, r2)
            if (r2 == 0) goto L_0x0065
            androidx.compose.runtime.v0 r6 = new androidx.compose.runtime.v0
            androidx.compose.runtime.n r2 = r5.f2721g
            androidx.compose.runtime.i r2 = (androidx.compose.runtime.C1330i) r2
            r6.<init>(r2)
            r5.mo5407H0(r6)
            goto L_0x0069
        L_0x0065:
            if (r6 == 0) goto L_0x008b
            androidx.compose.runtime.v0 r6 = (androidx.compose.runtime.C1418v0) r6
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            r1 = 1
        L_0x006c:
            if (r1 == 0) goto L_0x0075
            int r0 = r6.f3078a
            r0 = r0 | 8
            r6.f3078a = r0
            goto L_0x007b
        L_0x0075:
            int r0 = r6.f3078a
            r0 = r0 & -9
            r6.f3078a = r0
        L_0x007b:
            r8.a r0 = r5.f2693B
            r0.mo20336f(r6)
            int r0 = r5.f2692A
            r6.f3082e = r0
            int r0 = r6.f3078a
            r0 = r0 & -17
            r6.f3078a = r0
        L_0x008a:
            return r5
        L_0x008b:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5440h(int):androidx.compose.runtime.ComposerImpl");
    }

    /* renamed from: h0 */
    public final boolean mo5441h0(C7730b<C1418v0, C7731c<Object>> bVar) {
        C19383o.m32797g(bVar, "invalidationsRequested");
        if (this.f2719e.isEmpty()) {
            if (!(bVar.f17146c > 0) && !(!this.f2732r.isEmpty())) {
                return false;
            }
            mo5416P(bVar, (ComposableLambdaImpl) null);
            return !this.f2719e.isEmpty();
        }
        ComposerKt.m2526c("Expected applyChanges() to have been called".toString());
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5442i() {
        /*
            r3 = this;
            boolean r0 = r3.f2702K
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f2738x
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f2736v
            if (r0 != 0) goto L_0x0025
            androidx.compose.runtime.v0 r0 = r3.mo5424X()
            if (r0 == 0) goto L_0x0021
            int r0 = r0.f3078a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x001c
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5442i():boolean");
    }

    /* renamed from: i0 */
    public final <R> R mo5443i0(C1349n nVar, C1349n nVar2, Integer num, List<Pair<C1418v0, C7731c<Object>>> list, C19846a<? extends R> aVar) {
        R r;
        C1349n nVar3 = nVar;
        boolean z = this.f2708Q;
        boolean z2 = this.f2694C;
        int i = this.f2724j;
        try {
            this.f2708Q = false;
            this.f2694C = true;
            this.f2724j = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = list.get(i2);
                C1418v0 v0Var = (C1418v0) pair.component1();
                C7731c cVar = (C7731c) pair.component2();
                if (cVar != null) {
                    int i3 = 0;
                    while (true) {
                        if (!(i3 < cVar.f17147b)) {
                            continue;
                            break;
                        }
                        int i4 = i3 + 1;
                        Object obj = cVar.f17148c[i3];
                        if (obj != null) {
                            mo5393A0(v0Var, obj);
                            i3 = i4;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                    }
                } else {
                    mo5393A0(v0Var, (Object) null);
                }
            }
            if (nVar3 != null) {
                r = nVar3.mo5804e(nVar2, num != null ? num.intValue() : -1, aVar);
                if (r == null) {
                }
                return r;
            }
            C19846a<? extends R> aVar2 = aVar;
            r = aVar.invoke();
            return r;
        } finally {
            this.f2708Q = z;
            this.f2694C = z2;
            this.f2724j = i;
        }
    }

    /* renamed from: j */
    public final void mo5444j(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "effect");
        mo5447k0(new ComposerImpl$recordSideEffect$1(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (r8.f3097b < r3) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x00a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5 A[LOOP:1: B:25:0x006b->B:45:0x00a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0178  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5445j0() {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f2694C
            r2 = 1
            r1.f2694C = r2
            androidx.compose.runtime.b1 r3 = r1.f2695D
            int r4 = r3.f2812h
            int r3 = r3.mo5629g(r4)
            int r3 = r3 + r4
            int r5 = r1.f2724j
            int r6 = r1.f2703L
            int r7 = r1.f2726l
            java.util.ArrayList r8 = r1.f2732r
            androidx.compose.runtime.b1 r9 = r1.f2695D
            int r9 = r9.f2810f
            int r9 = androidx.compose.runtime.ComposerKt.m2527d(r9, r8)
            if (r9 >= 0) goto L_0x0025
            int r9 = r9 + 1
            int r9 = -r9
        L_0x0025:
            int r10 = r8.size()
            if (r9 >= r10) goto L_0x0036
            java.lang.Object r8 = r8.get(r9)
            androidx.compose.runtime.z r8 = (androidx.compose.runtime.C1425z) r8
            int r9 = r8.f3097b
            if (r9 >= r3) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            r9 = 0
            r10 = r4
        L_0x0039:
            if (r8 == 0) goto L_0x01e5
            int r11 = r8.f3097b
            java.util.ArrayList r12 = r1.f2732r
            int r13 = androidx.compose.runtime.ComposerKt.m2527d(r11, r12)
            if (r13 < 0) goto L_0x004b
            java.lang.Object r12 = r12.remove(r13)
            androidx.compose.runtime.z r12 = (androidx.compose.runtime.C1425z) r12
        L_0x004b:
            androidx.compose.runtime.v0 r12 = r8.f3096a
            r.c<java.lang.Object> r13 = r8.f3098c
            if (r13 != 0) goto L_0x0056
            r12.getClass()
            goto L_0x00b6
        L_0x0056:
            r.b<androidx.compose.runtime.p<?>, java.lang.Object> r12 = r12.f3084g
            if (r12 != 0) goto L_0x005b
            goto L_0x00b6
        L_0x005b:
            int r14 = r13.f17147b
            if (r14 <= 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x006a
            goto L_0x00b1
        L_0x006a:
            r2 = 0
        L_0x006b:
            int r14 = r13.f17147b
            if (r2 >= r14) goto L_0x0071
            r14 = 1
            goto L_0x0072
        L_0x0071:
            r14 = 0
        L_0x0072:
            if (r14 == 0) goto L_0x00b1
            java.lang.Object[] r14 = r13.f17148c
            int r15 = r2 + 1
            r2 = r14[r2]
            if (r2 == 0) goto L_0x00a9
            boolean r14 = r2 instanceof androidx.compose.runtime.C1354p
            if (r14 == 0) goto L_0x009e
            int r14 = r12.mo20206a(r2)
            if (r14 < 0) goto L_0x008d
            r16 = r13
            java.lang.Object[] r13 = r12.f17145b
            r13 = r13[r14]
            goto L_0x0090
        L_0x008d:
            r16 = r13
            r13 = 0
        L_0x0090:
            androidx.compose.runtime.p r2 = (androidx.compose.runtime.C1354p) r2
            java.lang.Object r2 = r2.mo5536b()
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r13, r2)
            if (r2 == 0) goto L_0x00a0
            r2 = 1
            goto L_0x00a1
        L_0x009e:
            r16 = r13
        L_0x00a0:
            r2 = 0
        L_0x00a1:
            if (r2 != 0) goto L_0x00a5
            r2 = 0
            goto L_0x00b2
        L_0x00a5:
            r2 = r15
            r13 = r16
            goto L_0x006b
        L_0x00a9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            r0.<init>(r2)
            throw r0
        L_0x00b1:
            r2 = 1
        L_0x00b2:
            if (r2 == 0) goto L_0x00b6
            r2 = 0
            goto L_0x00b7
        L_0x00b6:
            r2 = 1
        L_0x00b7:
            if (r2 == 0) goto L_0x0178
            androidx.compose.runtime.b1 r2 = r1.f2695D
            r2.mo5634l(r11)
            androidx.compose.runtime.b1 r2 = r1.f2695D
            int r2 = r2.f2810f
            r1.mo5459q0(r10, r2, r4)
            androidx.compose.runtime.b1 r9 = r1.f2695D
            int r9 = r9.mo5633k(r2)
        L_0x00cb:
            if (r9 == r4) goto L_0x00dc
            androidx.compose.runtime.b1 r10 = r1.f2695D
            boolean r10 = r10.mo5630h(r9)
            if (r10 != 0) goto L_0x00dc
            androidx.compose.runtime.b1 r10 = r1.f2695D
            int r9 = r10.mo5633k(r9)
            goto L_0x00cb
        L_0x00dc:
            androidx.compose.runtime.b1 r10 = r1.f2695D
            boolean r10 = r10.mo5630h(r9)
            if (r10 == 0) goto L_0x00e6
            r10 = 0
            goto L_0x00e7
        L_0x00e6:
            r10 = r5
        L_0x00e7:
            if (r9 != r2) goto L_0x00ea
            goto L_0x0110
        L_0x00ea:
            int r12 = r1.mo5409I0(r9)
            androidx.compose.runtime.b1 r13 = r1.f2695D
            int[] r13 = r13.f2806b
            int r13 = p001a0.C0005b.m8B(r2, r13)
            int r12 = r12 - r13
            int r12 = r12 + r10
        L_0x00f8:
            if (r10 >= r12) goto L_0x0110
            if (r9 == r11) goto L_0x0110
            int r9 = r9 + 1
        L_0x00fe:
            if (r9 >= r11) goto L_0x0110
            androidx.compose.runtime.b1 r13 = r1.f2695D
            int r13 = r13.mo5629g(r9)
            int r13 = r13 + r9
            if (r11 < r13) goto L_0x00f8
            int r9 = r1.mo5409I0(r9)
            int r10 = r10 + r9
            r9 = r13
            goto L_0x00fe
        L_0x0110:
            r1.f2724j = r10
            androidx.compose.runtime.b1 r9 = r1.f2695D
            int r9 = r9.mo5633k(r2)
            int r9 = r1.mo5413M(r9, r4, r6)
            r1.f2703L = r9
            r9 = 0
            r1.f2699H = r9
            androidx.compose.runtime.v0 r8 = r8.f3096a
            r8.getClass()
            kq.p<? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.m> r8 = r8.f3081d
            r10 = 1
            if (r8 == 0) goto L_0x0135
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r8.invoke(r1, r11)
            kotlin.m r8 = kotlin.C19394m.f43287a
            goto L_0x0136
        L_0x0135:
            r8 = r9
        L_0x0136:
            if (r8 == 0) goto L_0x016c
            r1.f2699H = r9
            androidx.compose.runtime.b1 r8 = r1.f2695D
            int[] r9 = r8.f2806b
            int r9 = p001a0.C0005b.m63u(r4, r9)
            int r9 = r9 + r4
            int r11 = r8.f2810f
            if (r11 < r4) goto L_0x014b
            if (r11 > r9) goto L_0x014b
            r12 = r10
            goto L_0x014c
        L_0x014b:
            r12 = 0
        L_0x014c:
            if (r12 == 0) goto L_0x015a
            r8.f2812h = r4
            r8.f2811g = r9
            r9 = 0
            r8.f2814j = r9
            r8.f2815k = r9
            r9 = r10
            r10 = r2
            goto L_0x01c0
        L_0x015a:
            java.lang.String r0 = "Index "
            java.lang.String r2 = " is not a parent of "
            java.lang.String r0 = android.support.p013v4.media.session.C0087d.m235e(r0, r4, r2, r11)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid restart scope"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0178:
            r2 = 0
            r8.a r11 = r1.f2693B
            androidx.compose.runtime.v0 r12 = r8.f3096a
            r11.mo20336f(r12)
            androidx.compose.runtime.v0 r8 = r8.f3096a
            androidx.compose.runtime.i r11 = r8.f3079b
            if (r11 == 0) goto L_0x01bb
            r.a r12 = r8.f3083f
            if (r12 == 0) goto L_0x01bb
            int r13 = r8.f3078a
            r13 = r13 | 32
            r8.f3078a = r13
            int r13 = r12.f17141a     // Catch:{ all -> 0x01b3 }
        L_0x0192:
            if (r2 >= r13) goto L_0x01ac
            java.lang.Object[] r14 = r12.f17142b     // Catch:{ all -> 0x01b3 }
            r14 = r14[r2]     // Catch:{ all -> 0x01b3 }
            if (r14 == 0) goto L_0x01a4
            int[] r15 = r12.f17143c     // Catch:{ all -> 0x01b3 }
            r15 = r15[r2]     // Catch:{ all -> 0x01b3 }
            r11.mo5807i(r14)     // Catch:{ all -> 0x01b3 }
            int r2 = r2 + 1
            goto L_0x0192
        L_0x01a4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01b3 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Any"
            r0.<init>(r2)     // Catch:{ all -> 0x01b3 }
            throw r0     // Catch:{ all -> 0x01b3 }
        L_0x01ac:
            int r2 = r8.f3078a
            r2 = r2 & -33
            r8.f3078a = r2
            goto L_0x01bb
        L_0x01b3:
            r0 = move-exception
            int r2 = r8.f3078a
            r2 = r2 & -33
            r8.f3078a = r2
            throw r0
        L_0x01bb:
            r8.a r2 = r1.f2693B
            r2.mo20335e()
        L_0x01c0:
            java.util.ArrayList r2 = r1.f2732r
            androidx.compose.runtime.b1 r8 = r1.f2695D
            int r8 = r8.f2810f
            int r8 = androidx.compose.runtime.ComposerKt.m2527d(r8, r2)
            if (r8 >= 0) goto L_0x01cf
            int r8 = r8 + 1
            int r8 = -r8
        L_0x01cf:
            int r11 = r2.size()
            if (r8 >= r11) goto L_0x01e0
            java.lang.Object r2 = r2.get(r8)
            androidx.compose.runtime.z r2 = (androidx.compose.runtime.C1425z) r2
            int r8 = r2.f3097b
            if (r8 >= r3) goto L_0x01e0
            goto L_0x01e1
        L_0x01e0:
            r2 = 0
        L_0x01e1:
            r8 = r2
            r2 = 1
            goto L_0x0039
        L_0x01e5:
            if (r9 == 0) goto L_0x01fa
            r1.mo5459q0(r10, r4, r4)
            androidx.compose.runtime.b1 r2 = r1.f2695D
            r2.mo5636n()
            int r2 = r1.mo5409I0(r4)
            int r5 = r5 + r2
            r1.f2724j = r5
            int r7 = r7 + r2
            r1.f2726l = r7
            goto L_0x01fd
        L_0x01fa:
            r17.mo5462s0()
        L_0x01fd:
            r1.f2703L = r6
            r1.f2694C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5445j0():void");
    }

    /* renamed from: k */
    public final C1299c<?> mo5446k() {
        return this.f2715a;
    }

    /* renamed from: k0 */
    public final void mo5447k0(C19862q<? super C1299c<?>, ? super C1306d1, ? super C1424y0, C19394m> qVar) {
        this.f2719e.add(qVar);
    }

    /* renamed from: l */
    public final CoroutineContext mo5448l() {
        return this.f2716b.mo5483g();
    }

    /* renamed from: l0 */
    public final void mo5449l0() {
        m2420r0(this, this.f2695D.f2810f, false, 0);
        mo5435e0();
        C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
        mo5437f0(false);
        mo5453n0();
        mo5447k0(qVar);
        int i = this.f2706O;
        C1298b1 b1Var = this.f2695D;
        this.f2706O = C0005b.m63u(b1Var.f2810f, b1Var.f2806b) + i;
    }

    /* renamed from: m */
    public final <T> void mo5450m(C19846a<? extends T> aVar) {
        C19383o.m32797g(aVar, "factory");
        if (this.f2731q) {
            this.f2731q = false;
            if (this.f2702K) {
                C1423y yVar = this.f2725k;
                int i = yVar.f3094a[yVar.f3095b - 1];
                C1306d1 d1Var = this.f2697F;
                C1296b b = d1Var.mo5667b(d1Var.f2850s);
                this.f2726l++;
                this.f2701J.add(new ComposerImpl$createNode$2(aVar, b, i));
                this.f2710S.mo20336f(new ComposerImpl$createNode$3(b, i));
                return;
            }
            ComposerKt.m2526c("createNode() can only be called when inserting".toString());
            throw null;
        }
        ComposerKt.m2526c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    /* renamed from: m0 */
    public final void mo5451m0(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ComposerKt.m2526c(("Invalid remove index " + i).toString());
                throw null;
            } else if (this.f2711T == i) {
                this.f2714W += i2;
            } else {
                mo5435e0();
                this.f2711T = i;
                this.f2714W = i2;
            }
        }
    }

    /* renamed from: n */
    public final void mo5452n() {
        if (this.f2731q) {
            this.f2731q = false;
            if (!this.f2702K) {
                C1298b1 b1Var = this.f2695D;
                this.f2705N.mo20336f(b1Var.mo5631i(b1Var.f2812h));
                return;
            }
            ComposerKt.m2526c("useNode() called while inserting".toString());
            throw null;
        }
        ComposerKt.m2526c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    /* renamed from: n0 */
    public final void mo5453n0() {
        C1298b1 b1Var = this.f2695D;
        if (b1Var.f2807c > 0) {
            int i = b1Var.f2812h;
            C1423y yVar = this.f2709R;
            int i2 = yVar.f3095b;
            int i3 = -1;
            if (i2 > 0) {
                i3 = yVar.f3094a[i2 - 1];
            }
            if (i3 != i) {
                if (!this.f2707P && this.f2708Q) {
                    mo5455o0(false, ComposerKt.f2751d);
                    this.f2707P = true;
                }
                C1296b a = b1Var.mo5623a(i);
                this.f2709R.mo6115b(i);
                mo5455o0(false, new ComposerImpl$recordSlotEditing$1(a));
            }
        }
    }

    /* renamed from: o */
    public final void mo5454o(Object obj) {
        mo5407H0(obj);
    }

    /* renamed from: o0 */
    public final void mo5455o0(boolean z, C19862q<? super C1299c<?>, ? super C1306d1, ? super C1424y0, C19394m> qVar) {
        mo5437f0(z);
        mo5447k0(qVar);
    }

    /* renamed from: p */
    public final void mo5456p() {
        mo5418R(true);
    }

    /* renamed from: p0 */
    public final void mo5457p0() {
        if (!((ArrayList) this.f2705N.f17221b).isEmpty()) {
            this.f2705N.mo20335e();
        } else {
            this.f2704M++;
        }
    }

    /* renamed from: q */
    public final void mo5458q(C1325g0<?> g0Var, Object obj) {
        C19383o.m32797g(g0Var, "value");
        mo5429b0(g0Var, mo5414N((Integer) null), obj, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC] */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5459q0(int r7, int r8, int r9) {
        /*
            r6 = this;
            androidx.compose.runtime.b1 r0 = r6.f2695D
            kq.q<androidx.compose.runtime.c<?>, androidx.compose.runtime.d1, androidx.compose.runtime.y0, kotlin.m> r1 = androidx.compose.runtime.ComposerKt.f2748a
            if (r7 != r8) goto L_0x0007
            goto L_0x001c
        L_0x0007:
            if (r7 == r9) goto L_0x006c
            if (r8 != r9) goto L_0x000d
            goto L_0x006c
        L_0x000d:
            int r1 = r0.mo5633k(r7)
            if (r1 != r8) goto L_0x0016
            r9 = r8
            goto L_0x006c
        L_0x0016:
            int r1 = r0.mo5633k(r8)
            if (r1 != r7) goto L_0x001e
        L_0x001c:
            r9 = r7
            goto L_0x006c
        L_0x001e:
            int r1 = r0.mo5633k(r7)
            int r2 = r0.mo5633k(r8)
            if (r1 != r2) goto L_0x002d
            int r9 = r0.mo5633k(r7)
            goto L_0x006c
        L_0x002d:
            r1 = 0
            r2 = r7
            r3 = r1
        L_0x0030:
            if (r2 <= 0) goto L_0x003b
            if (r2 == r9) goto L_0x003b
            int r2 = r0.mo5633k(r2)
            int r3 = r3 + 1
            goto L_0x0030
        L_0x003b:
            r2 = r8
            r4 = r1
        L_0x003d:
            if (r2 <= 0) goto L_0x0048
            if (r2 == r9) goto L_0x0048
            int r2 = r0.mo5633k(r2)
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0048:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L_0x004c:
            if (r2 >= r9) goto L_0x0055
            int r5 = r0.mo5633k(r5)
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0055:
            int r4 = r4 - r3
            r9 = r8
        L_0x0057:
            if (r1 >= r4) goto L_0x0060
            int r9 = r0.mo5633k(r9)
            int r1 = r1 + 1
            goto L_0x0057
        L_0x0060:
            if (r5 == r9) goto L_0x006b
            int r5 = r0.mo5633k(r5)
            int r9 = r0.mo5633k(r9)
            goto L_0x0060
        L_0x006b:
            r9 = r5
        L_0x006c:
            if (r7 <= 0) goto L_0x007e
            if (r7 == r9) goto L_0x007e
            boolean r1 = r0.mo5630h(r7)
            if (r1 == 0) goto L_0x0079
            r6.mo5457p0()
        L_0x0079:
            int r7 = r0.mo5633k(r7)
            goto L_0x006c
        L_0x007e:
            r6.mo5417Q(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.mo5459q0(int, int, int):void");
    }

    /* renamed from: r */
    public final void mo5460r() {
        this.f2730p = true;
    }

    /* renamed from: s */
    public final C1418v0 mo5461s() {
        return mo5424X();
    }

    /* renamed from: s0 */
    public final void mo5462s0() {
        C1298b1 b1Var = this.f2695D;
        int i = b1Var.f2812h;
        this.f2726l = i >= 0 ? C0005b.m8B(i, b1Var.f2806b) : 0;
        this.f2695D.mo5636n();
    }

    /* renamed from: t */
    public final void mo5463t() {
        if (this.f2738x && this.f2695D.f2812h == this.f2739y) {
            this.f2739y = -1;
            this.f2738x = false;
        }
        mo5418R(false);
    }

    /* renamed from: t0 */
    public final void mo5464t0(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        Object obj4 = obj;
        int i2 = i;
        Object obj5 = obj2;
        boolean z2 = z;
        C1350n0 n0Var = null;
        if (!this.f2731q) {
            mo5395B0(i2, obj4, obj5);
            int i3 = 0;
            if (this.f2702K) {
                this.f2695D.f2813i++;
                C1306d1 d1Var = this.f2697F;
                int i4 = d1Var.f2849r;
                if (z2) {
                    C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
                    d1Var.mo5662K(aVar, 125, aVar, true);
                } else if (obj5 != null) {
                    if (obj4 == null) {
                        obj4 = C1302d.C1303a.f2828a;
                    }
                    d1Var.mo5662K(obj4, i2, obj5, false);
                } else {
                    if (obj4 == null) {
                        obj4 = C1302d.C1303a.f2828a;
                    }
                    d1Var.mo5662K(obj4, i2, C1302d.C1303a.f2828a, false);
                }
                C1350n0 n0Var2 = this.f2723i;
                if (n0Var2 != null) {
                    int i5 = -2 - i4;
                    C1297b0 b0Var = new C1297b0(i2, i5, -1, -1);
                    n0Var2.f2946e.put(Integer.valueOf(i5), new C1417v(-1, this.f2724j - n0Var2.f2943b, 0));
                    n0Var2.f2945d.add(b0Var);
                }
                mo5423W(z2, (C1350n0) null);
                return;
            }
            if (this.f2723i == null) {
                if (this.f2695D.mo5627e() == i2) {
                    C1298b1 b1Var = this.f2695D;
                    int i6 = b1Var.f2810f;
                    if (C19383o.m32792b(obj4, i6 < b1Var.f2811g ? b1Var.mo5632j(i6, b1Var.f2806b) : null)) {
                        mo5474y0(obj5, z2);
                    }
                }
                C1298b1 b1Var2 = this.f2695D;
                b1Var2.getClass();
                ArrayList arrayList = new ArrayList();
                if (b1Var2.f2813i <= 0) {
                    for (int i7 = b1Var2.f2810f; i7 < b1Var2.f2811g; i7 += C0005b.m63u(i7, b1Var2.f2806b)) {
                        int[] iArr = b1Var2.f2806b;
                        arrayList.add(new C1297b0(iArr[i7 * 5], i7, C0005b.m68y(i7, b1Var2.f2806b) ? 1 : C0005b.m8B(i7, b1Var2.f2806b), b1Var2.mo5632j(i7, iArr)));
                    }
                }
                this.f2723i = new C1350n0(this.f2724j, arrayList);
            }
            C1350n0 n0Var3 = this.f2723i;
            if (n0Var3 != null) {
                Object a0Var = obj4 != null ? new C1294a0(Integer.valueOf(i), obj4) : Integer.valueOf(i);
                HashMap hashMap = (HashMap) n0Var3.f2947f.getValue();
                C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
                LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(a0Var);
                if (linkedHashSet == null || (obj3 = C19327t.m32639U0(linkedHashSet)) == null) {
                    obj3 = null;
                } else {
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) hashMap.get(a0Var);
                    if (linkedHashSet2 != null) {
                        linkedHashSet2.remove(obj3);
                        if (linkedHashSet2.isEmpty()) {
                            hashMap.remove(a0Var);
                        }
                        C19394m mVar = C19394m.f43287a;
                    }
                }
                C1297b0 b0Var2 = (C1297b0) obj3;
                if (b0Var2 != null) {
                    n0Var3.f2945d.add(b0Var2);
                    int i8 = b0Var2.f2803c;
                    this.f2724j = n0Var3.mo5896a(b0Var2) + n0Var3.f2943b;
                    C1417v vVar = n0Var3.f2946e.get(Integer.valueOf(b0Var2.f2803c));
                    int i9 = vVar != null ? vVar.f3075a : -1;
                    int i10 = n0Var3.f2944c;
                    int i11 = i9 - i10;
                    if (i9 > i10) {
                        Collection<C1417v> values = n0Var3.f2946e.values();
                        C19383o.m32796f(values, "groupInfos.values");
                        for (C1417v vVar2 : values) {
                            int i12 = vVar2.f3075a;
                            if (i12 == i9) {
                                vVar2.f3075a = i10;
                            } else {
                                if (i10 <= i12 && i12 < i9) {
                                    vVar2.f3075a = i12 + 1;
                                }
                            }
                        }
                    } else if (i10 > i9) {
                        Collection<C1417v> values2 = n0Var3.f2946e.values();
                        C19383o.m32796f(values2, "groupInfos.values");
                        for (C1417v vVar3 : values2) {
                            int i13 = vVar3.f3075a;
                            if (i13 == i9) {
                                vVar3.f3075a = i10;
                            } else {
                                if (i9 + 1 <= i13 && i13 < i10) {
                                    vVar3.f3075a = i13 - 1;
                                }
                            }
                        }
                    }
                    C1298b1 b1Var3 = this.f2695D;
                    this.f2706O = i8 - (b1Var3.f2810f - this.f2706O);
                    b1Var3.mo5634l(i8);
                    if (i11 > 0) {
                        ComposerImpl$start$2 composerImpl$start$2 = new ComposerImpl$start$2(i11);
                        mo5437f0(false);
                        mo5453n0();
                        mo5447k0(composerImpl$start$2);
                    }
                    mo5474y0(obj5, z2);
                } else {
                    this.f2695D.f2813i++;
                    this.f2702K = true;
                    this.f2699H = null;
                    if (this.f2697F.f2851t) {
                        C1306d1 p = this.f2696E.mo5649p();
                        this.f2697F = p;
                        p.mo5658G();
                        this.f2698G = false;
                        this.f2699H = null;
                    }
                    this.f2697F.mo5670e();
                    C1306d1 d1Var2 = this.f2697F;
                    int i14 = d1Var2.f2849r;
                    if (z2) {
                        C1302d.C1303a.C1304a aVar2 = C1302d.C1303a.f2828a;
                        d1Var2.mo5662K(aVar2, 125, aVar2, true);
                    } else if (obj5 != null) {
                        if (obj4 == null) {
                            obj4 = C1302d.C1303a.f2828a;
                        }
                        d1Var2.mo5662K(obj4, i2, obj5, false);
                    } else {
                        if (obj4 == null) {
                            obj4 = C1302d.C1303a.f2828a;
                        }
                        d1Var2.mo5662K(obj4, i2, C1302d.C1303a.f2828a, false);
                    }
                    this.f2700I = this.f2697F.mo5667b(i14);
                    int i15 = -2 - i14;
                    C1297b0 b0Var3 = new C1297b0(i2, i15, -1, -1);
                    n0Var3.f2946e.put(Integer.valueOf(i15), new C1417v(-1, this.f2724j - n0Var3.f2943b, 0));
                    n0Var3.f2945d.add(b0Var3);
                    ArrayList arrayList2 = new ArrayList();
                    if (!z2) {
                        i3 = this.f2724j;
                    }
                    n0Var = new C1350n0(i3, arrayList2);
                }
            }
            mo5423W(z2, n0Var);
            return;
        }
        ComposerKt.m2526c("A call to createNode(), emitNode() or useNode() expected".toString());
        throw null;
    }

    /* renamed from: u */
    public final void mo5465u(int i) {
        mo5464t0((Object) null, i, (Object) null, false);
    }

    /* renamed from: u0 */
    public final void mo5466u0() {
        mo5464t0((Object) null, -127, (Object) null, false);
    }

    /* renamed from: v */
    public final Object mo5467v() {
        return mo5431c0();
    }

    /* renamed from: v0 */
    public final void mo5468v0(int i, C1347m0 m0Var) {
        mo5464t0(m0Var, i, (Object) null, false);
    }

    /* renamed from: w */
    public final C1301c1 mo5469w() {
        return this.f2717c;
    }

    /* renamed from: w0 */
    public final void mo5470w0() {
        int i = 126;
        if (this.f2702K || (!this.f2738x ? this.f2695D.mo5627e() != 126 : this.f2695D.mo5627e() != 125)) {
            i = 125;
        }
        mo5464t0((Object) null, i, (Object) null, true);
        this.f2731q = true;
    }

    /* renamed from: x */
    public final <V, T> void mo5471x(V v, C19861p<? super T, ? super V, C19394m> pVar) {
        C19383o.m32797g(pVar, "block");
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(pVar, v);
        if (this.f2702K) {
            this.f2701J.add(composerImpl$apply$operation$1);
            return;
        }
        mo5439g0();
        mo5433d0();
        mo5447k0(composerImpl$apply$operation$1);
    }

    /* renamed from: x0 */
    public final void mo5472x0(C1412t0<?>[] t0VarArr) {
        boolean z;
        C7792d<C1340k<Object>, C1342k1<Object>> dVar;
        C19383o.m32797g(t0VarArr, ResponseConstants.VALUES);
        C7792d<C1340k<Object>, C1342k1<Object>> N = mo5414N((Integer) null);
        mo5468v0(201, ComposerKt.f2754g);
        mo5468v0(203, ComposerKt.f2756i);
        ComposerImpl$startProviders$currentProviders$1 composerImpl$startProviders$currentProviders$1 = new ComposerImpl$startProviders$currentProviders$1(t0VarArr, N);
        C19389t.m32910d(2, composerImpl$startProviders$currentProviders$1);
        C7792d dVar2 = (C7792d) composerImpl$startProviders$currentProviders$1.invoke(this, 1);
        mo5418R(false);
        if (this.f2702K) {
            dVar = mo5405G0(N, dVar2);
            this.f2698G = true;
            z = false;
        } else {
            C1298b1 b1Var = this.f2695D;
            Object f = b1Var.mo5628f(b1Var.f2810f, 0);
            if (f != null) {
                C7792d<C1340k<Object>, C1342k1<Object>> dVar3 = (C7792d) f;
                C1298b1 b1Var2 = this.f2695D;
                Object f2 = b1Var2.mo5628f(b1Var2.f2810f, 1);
                if (f2 != null) {
                    C7792d dVar4 = (C7792d) f2;
                    if (!mo5442i() || !C19383o.m32792b(dVar4, dVar2)) {
                        dVar = mo5405G0(N, dVar2);
                        z = true ^ C19383o.m32792b(dVar, dVar3);
                    } else {
                        this.f2726l = this.f2695D.mo5635m() + this.f2726l;
                        z = false;
                        dVar = dVar3;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
        }
        if (z && !this.f2702K) {
            this.f2735u.put(Integer.valueOf(this.f2695D.f2810f), dVar);
        }
        this.f2737w.mo6115b(this.f2736v ? 1 : 0);
        this.f2736v = z;
        this.f2699H = dVar;
        mo5464t0(ComposerKt.f2755h, 202, dVar, false);
    }

    /* renamed from: y */
    public final void mo5473y(Object obj) {
        if (this.f2695D.mo5627e() == 207 && !C19383o.m32792b(this.f2695D.mo5626d(), obj) && this.f2739y < 0) {
            this.f2739y = this.f2695D.f2810f;
            this.f2738x = true;
        }
        mo5464t0((Object) null, 207, obj, false);
    }

    /* renamed from: y0 */
    public final void mo5474y0(Object obj, boolean z) {
        if (z) {
            C1298b1 b1Var = this.f2695D;
            if (b1Var.f2813i <= 0) {
                if (C0005b.m68y(b1Var.f2810f, b1Var.f2806b)) {
                    b1Var.mo5637o();
                    return;
                }
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            return;
        }
        if (!(obj == null || this.f2695D.mo5626d() == obj)) {
            mo5455o0(false, new ComposerImpl$startReaderGroup$1(obj));
        }
        this.f2695D.mo5637o();
    }

    /* renamed from: z */
    public final void mo5475z(int i, Object obj) {
        mo5464t0(obj, i, (Object) null, false);
    }

    /* renamed from: z0 */
    public final void mo5476z0() {
        T t;
        this.f2695D = this.f2717c.mo5648n();
        mo5464t0((Object) null, 100, (Object) null, false);
        this.f2716b.mo5491o();
        this.f2734t = this.f2716b.mo5481e();
        C1423y yVar = this.f2737w;
        boolean z = this.f2736v;
        C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
        yVar.mo6115b(z ? 1 : 0);
        this.f2736v = mo5408I(this.f2734t);
        this.f2699H = null;
        if (!this.f2730p) {
            this.f2730p = this.f2716b.mo5480d();
        }
        C1345l1 l1Var = InspectionTablesKt.f3073a;
        C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar = this.f2734t;
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(l1Var, "key");
        if (dVar.containsKey(l1Var)) {
            C1342k1 k1Var = (C1342k1) dVar.get(l1Var);
            t = k1Var != null ? k1Var.getValue() : null;
        } else {
            t = l1Var.f2934a.getValue();
        }
        Set set = (Set) t;
        if (set != null) {
            set.add(this.f2717c);
            this.f2716b.mo5489m(set);
        }
        mo5464t0((Object) null, this.f2716b.mo5482f(), (Object) null, false);
    }
}
