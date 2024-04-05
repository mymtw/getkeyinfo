package androidx.compose.runtime;

import android.os.Trace;
import android.support.p013v4.media.C0072d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p219r.C7730b;
import p219r.C7731c;
import p219r.C7733d;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.runtime.i */
public final class C1330i implements C1349n {

    /* renamed from: b */
    public final C1324g f2891b;

    /* renamed from: c */
    public final C1299c<?> f2892c;

    /* renamed from: d */
    public final AtomicReference<Object> f2893d;

    /* renamed from: e */
    public final Object f2894e;

    /* renamed from: f */
    public final HashSet<C1426z0> f2895f;

    /* renamed from: g */
    public final C1301c1 f2896g;

    /* renamed from: h */
    public final C7733d<C1418v0> f2897h;

    /* renamed from: i */
    public final HashSet<C1418v0> f2898i;

    /* renamed from: j */
    public final C7733d<C1354p<?>> f2899j;

    /* renamed from: k */
    public final ArrayList f2900k;

    /* renamed from: l */
    public final ArrayList f2901l;

    /* renamed from: m */
    public final C7733d<C1418v0> f2902m;

    /* renamed from: n */
    public C7730b<C1418v0, C7731c<Object>> f2903n;

    /* renamed from: o */
    public boolean f2904o;

    /* renamed from: p */
    public C1330i f2905p;

    /* renamed from: q */
    public int f2906q;

    /* renamed from: r */
    public final ComposerImpl f2907r;

    /* renamed from: s */
    public final CoroutineContext f2908s;

    /* renamed from: t */
    public boolean f2909t;

    /* renamed from: u */
    public C19861p<? super C1302d, ? super Integer, C19394m> f2910u;

    /* renamed from: androidx.compose.runtime.i$a */
    public static final class C1331a implements C1424y0 {

        /* renamed from: a */
        public final Set<C1426z0> f2911a;

        /* renamed from: b */
        public final ArrayList f2912b = new ArrayList();

        /* renamed from: c */
        public final ArrayList f2913c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f2914d = new ArrayList();

        public C1331a(HashSet hashSet) {
            C19383o.m32797g(hashSet, "abandoning");
            this.f2911a = hashSet;
        }

        /* renamed from: a */
        public final void mo5823a(C1426z0 z0Var) {
            C19383o.m32797g(z0Var, "instance");
            int lastIndexOf = this.f2912b.lastIndexOf(z0Var);
            if (lastIndexOf >= 0) {
                this.f2912b.remove(lastIndexOf);
                this.f2911a.remove(z0Var);
                return;
            }
            this.f2913c.add(z0Var);
        }

        /* renamed from: b */
        public final void mo5824b(C1426z0 z0Var) {
            C19383o.m32797g(z0Var, "instance");
            int lastIndexOf = this.f2913c.lastIndexOf(z0Var);
            if (lastIndexOf >= 0) {
                this.f2913c.remove(lastIndexOf);
                this.f2911a.remove(z0Var);
                return;
            }
            this.f2912b.add(z0Var);
        }

        /* renamed from: c */
        public final void mo5825c(C19846a<C19394m> aVar) {
            C19383o.m32797g(aVar, "effect");
            this.f2914d.add(aVar);
        }

        /* renamed from: d */
        public final void mo5826d() {
            if (!this.f2911a.isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<C1426z0> it = this.f2911a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().onAbandoned();
                    }
                    C19394m mVar = C19394m.f43287a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        /* renamed from: e */
        public final void mo5827e() {
            if (!this.f2913c.isEmpty()) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.f2913c.size() - 1; -1 < size; size--) {
                        C1426z0 z0Var = (C1426z0) this.f2913c.get(size);
                        if (!this.f2911a.contains(z0Var)) {
                            z0Var.onForgotten();
                        }
                    }
                    C19394m mVar = C19394m.f43287a;
                } finally {
                    Trace.endSection();
                }
            }
            if (!this.f2912b.isEmpty()) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    ArrayList arrayList = this.f2912b;
                    int size2 = arrayList.size();
                    for (int i = 0; i < size2; i++) {
                        C1426z0 z0Var2 = (C1426z0) arrayList.get(i);
                        this.f2911a.remove(z0Var2);
                        z0Var2.onRemembered();
                    }
                    C19394m mVar2 = C19394m.f43287a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        /* renamed from: f */
        public final void mo5828f() {
            if (!this.f2914d.isEmpty()) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    ArrayList arrayList = this.f2914d;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C19846a) arrayList.get(i)).invoke();
                    }
                    this.f2914d.clear();
                    C19394m mVar = C19394m.f43287a;
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public C1330i() {
        throw null;
    }

    public C1330i(C1324g gVar, C1293a aVar) {
        C19383o.m32797g(gVar, ResponseConstants.PARENT);
        this.f2891b = gVar;
        this.f2892c = aVar;
        this.f2893d = new AtomicReference<>((Object) null);
        this.f2894e = new Object();
        HashSet<C1426z0> hashSet = new HashSet<>();
        this.f2895f = hashSet;
        C1301c1 c1Var = new C1301c1();
        this.f2896g = c1Var;
        this.f2897h = new C7733d<>();
        this.f2898i = new HashSet<>();
        this.f2899j = new C7733d<>();
        ArrayList arrayList = new ArrayList();
        this.f2900k = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2901l = arrayList2;
        this.f2902m = new C7733d<>();
        this.f2903n = new C7730b<>();
        ComposerImpl composerImpl = new ComposerImpl(aVar, gVar, c1Var, hashSet, arrayList, arrayList2, this);
        gVar.mo5490n(composerImpl);
        this.f2907r = composerImpl;
        this.f2908s = null;
        boolean z = gVar instanceof Recomposer;
        this.f2910u = ComposableSingletons$CompositionKt.f2689a;
    }

    /* renamed from: r */
    public static final void m2764r(C1330i iVar, boolean z, Ref$ObjectRef<HashSet<C1418v0>> ref$ObjectRef, Object obj) {
        InvalidationResult invalidationResult;
        C7733d<C1418v0> dVar = iVar.f2897h;
        int c = dVar.mo20227c(obj);
        if (c >= 0) {
            C7731c<C1418v0> f = dVar.mo20230f(c);
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i < f.f17147b) {
                    int i2 = i + 1;
                    Object obj2 = f.f17148c[i];
                    if (obj2 != null) {
                        C1418v0 v0Var = (C1418v0) obj2;
                        if (!iVar.f2902m.mo20228d(obj, v0Var)) {
                            C1330i iVar2 = v0Var.f3079b;
                            if (iVar2 == null || (invalidationResult = iVar2.mo5820w(v0Var, obj)) == null) {
                                invalidationResult = InvalidationResult.IGNORED;
                            }
                            if (invalidationResult != InvalidationResult.IGNORED) {
                                if (v0Var.f3084g == null) {
                                    z2 = false;
                                }
                                if (!z2 || z) {
                                    T t = (HashSet) ref$ObjectRef.element;
                                    if (t == null) {
                                        t = new HashSet();
                                        ref$ObjectRef.element = t;
                                    }
                                    t.add(v0Var);
                                } else {
                                    iVar.f2898i.add(v0Var);
                                }
                            }
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5800a(C7731c cVar) {
        int i = 0;
        while (true) {
            if (!(i < cVar.f17147b)) {
                return false;
            }
            int i2 = i + 1;
            Object obj = cVar.f17148c[i];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            } else if (this.f2897h.mo20226b(obj) || this.f2899j.mo20226b(obj)) {
                return true;
            } else {
                i = i2;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo5801b() {
        synchronized (this.f2894e) {
            if (!this.f2901l.isEmpty()) {
                mo5816s(this.f2901l);
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo5802c(C1328h0 h0Var) {
        C1331a aVar = new C1331a(this.f2895f);
        C1306d1 p = h0Var.f2890a.mo5649p();
        try {
            ComposerKt.m2528e(p, aVar);
            C19394m mVar = C19394m.f43287a;
            p.mo5671f();
            aVar.mo5827e();
        } catch (Throwable th) {
            p.mo5671f();
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean mo5803d() {
        boolean h0;
        synchronized (this.f2894e) {
            mo5818u();
            try {
                ComposerImpl composerImpl = this.f2907r;
                C7730b<C1418v0, C7731c<Object>> bVar = this.f2903n;
                this.f2903n = new C7730b<>();
                h0 = composerImpl.mo5441h0(bVar);
                if (!h0) {
                    mo5819v();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return h0;
    }

    /* JADX INFO: finally extract failed */
    public final void dispose() {
        synchronized (this.f2894e) {
            if (!this.f2909t) {
                this.f2909t = true;
                this.f2910u = ComposableSingletons$CompositionKt.f2690b;
                boolean z = this.f2896g.f2821c > 0;
                if (z || (true ^ this.f2895f.isEmpty())) {
                    C1331a aVar = new C1331a(this.f2895f);
                    if (z) {
                        C1306d1 p = this.f2896g.mo5649p();
                        try {
                            ComposerKt.m2528e(p, aVar);
                            C19394m mVar = C19394m.f43287a;
                            p.mo5671f();
                            this.f2892c.clear();
                            aVar.mo5827e();
                        } catch (Throwable th) {
                            p.mo5671f();
                            throw th;
                        }
                    }
                    aVar.mo5826d();
                }
                this.f2907r.mo5415O();
            }
            C19394m mVar2 = C19394m.f43287a;
        }
        this.f2891b.mo5493q(this);
    }

    /* renamed from: e */
    public final <R> R mo5804e(C1349n nVar, int i, C19846a<? extends R> aVar) {
        if (nVar == null || C19383o.m32792b(nVar, this) || i < 0) {
            return aVar.invoke();
        }
        this.f2905p = (C1330i) nVar;
        this.f2906q = i;
        try {
            return aVar.invoke();
        } finally {
            this.f2905p = null;
            this.f2906q = 0;
        }
    }

    /* renamed from: f */
    public final void mo5795f(C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        if (!this.f2909t) {
            this.f2910u = pVar;
            this.f2891b.mo5477a(this, (ComposableLambdaImpl) pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* renamed from: g */
    public final void mo5805g(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C19383o.m32792b(((C1332i0) ((Pair) arrayList.get(i)).getFirst()).f2917c, this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.m2529f(z);
        try {
            this.f2907r.mo5426Z(arrayList);
            C19394m mVar = C19394m.f43287a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo5806h(ComposableLambdaImpl composableLambdaImpl) {
        try {
            synchronized (this.f2894e) {
                mo5818u();
                ComposerImpl composerImpl = this.f2907r;
                C7730b<C1418v0, C7731c<Object>> bVar = this.f2903n;
                this.f2903n = new C7730b<>();
                composerImpl.getClass();
                C19383o.m32797g(bVar, "invalidationsRequested");
                if (composerImpl.f2719e.isEmpty()) {
                    composerImpl.mo5416P(bVar, composableLambdaImpl);
                    C19394m mVar = C19394m.f43287a;
                } else {
                    ComposerKt.m2526c("Expected applyChanges() to have been called".toString());
                    throw null;
                }
            }
        } catch (Throwable th) {
            if (!this.f2895f.isEmpty()) {
                HashSet<C1426z0> hashSet = this.f2895f;
                C19383o.m32797g(hashSet, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<C1426z0> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().onAbandoned();
                        }
                        C19394m mVar2 = C19394m.f43287a;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        r4 = -(r11 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5807i(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            androidx.compose.runtime.ComposerImpl r2 = r0.f2907r
            int r3 = r2.f2740z
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0013
            r3 = r5
            goto L_0x0014
        L_0x0013:
            r3 = r4
        L_0x0014:
            if (r3 != 0) goto L_0x0132
            androidx.compose.runtime.v0 r2 = r2.mo5424X()
            if (r2 == 0) goto L_0x0132
            int r3 = r2.f3078a
            r3 = r3 | r5
            r2.f3078a = r3
            r.d<androidx.compose.runtime.v0> r3 = r0.f2897h
            r3.mo20225a(r1, r2)
            boolean r3 = r1 instanceof androidx.compose.runtime.C1354p
            if (r3 == 0) goto L_0x004c
            r.d<androidx.compose.runtime.p<?>> r6 = r0.f2899j
            r6.mo20229e(r1)
            r6 = r1
            androidx.compose.runtime.p r6 = (androidx.compose.runtime.C1354p) r6
            java.util.Set r6 = r6.mo5537c()
            java.util.Iterator r6 = r6.iterator()
        L_0x003a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r6.next()
            androidx.compose.runtime.snapshots.w r7 = (androidx.compose.runtime.snapshots.C1406w) r7
            r.d<androidx.compose.runtime.p<?>> r8 = r0.f2899j
            r8.mo20225a(r7, r1)
            goto L_0x003a
        L_0x004c:
            int r6 = r2.f3078a
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0054
            r6 = r5
            goto L_0x0055
        L_0x0054:
            r6 = r4
        L_0x0055:
            if (r6 == 0) goto L_0x0059
            goto L_0x0132
        L_0x0059:
            r.a r6 = r2.f3083f
            if (r6 != 0) goto L_0x0064
            r.a r6 = new r.a
            r6.<init>()
            r2.f3083f = r6
        L_0x0064:
            int r7 = r2.f3082e
            int r8 = r6.f17141a
            r9 = -1
            if (r8 <= 0) goto L_0x00c7
            int r8 = r8 + r9
            int r10 = java.lang.System.identityHashCode(r18)
        L_0x0070:
            if (r4 > r8) goto L_0x00bd
            int r11 = r4 + r8
            int r11 = r11 >>> r5
            java.lang.Object[] r12 = r6.f17142b
            r12 = r12[r11]
            int r13 = java.lang.System.identityHashCode(r12)
            if (r13 >= r10) goto L_0x0082
            int r4 = r11 + 1
            goto L_0x0070
        L_0x0082:
            if (r13 <= r10) goto L_0x0087
            int r8 = r11 + -1
            goto L_0x0070
        L_0x0087:
            if (r12 != r1) goto L_0x008b
            r9 = r11
            goto L_0x00c0
        L_0x008b:
            int r4 = r11 + -1
        L_0x008d:
            if (r9 >= r4) goto L_0x00a0
            java.lang.Object[] r8 = r6.f17142b
            r8 = r8[r4]
            if (r8 != r1) goto L_0x0096
            goto L_0x00bf
        L_0x0096:
            int r8 = java.lang.System.identityHashCode(r8)
            if (r8 == r10) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            int r4 = r4 + -1
            goto L_0x008d
        L_0x00a0:
            int r11 = r11 + 1
            int r4 = r6.f17141a
        L_0x00a4:
            if (r11 >= r4) goto L_0x00b8
            java.lang.Object[] r8 = r6.f17142b
            r8 = r8[r11]
            if (r8 != r1) goto L_0x00ae
            r4 = r11
            goto L_0x00bf
        L_0x00ae:
            int r8 = java.lang.System.identityHashCode(r8)
            if (r8 == r10) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            int r11 = r11 + 1
            goto L_0x00a4
        L_0x00b8:
            int r11 = r6.f17141a
        L_0x00ba:
            int r11 = r11 + r5
            int r4 = -r11
            goto L_0x00bf
        L_0x00bd:
            int r4 = r4 + r5
            int r4 = -r4
        L_0x00bf:
            r9 = r4
        L_0x00c0:
            if (r9 < 0) goto L_0x00c7
            int[] r4 = r6.f17143c
            r4[r9] = r7
            goto L_0x011b
        L_0x00c7:
            int r9 = r9 + r5
            int r4 = -r9
            int r8 = r6.f17141a
            java.lang.Object[] r9 = r6.f17142b
            int r10 = r9.length
            if (r8 != r10) goto L_0x0101
            int r10 = r9.length
            int r10 = r10 * 2
            java.lang.Object[] r15 = new java.lang.Object[r10]
            int r10 = r9.length
            int r10 = r10 * 2
            int[] r14 = new int[r10]
            int r10 = r4 + 1
            kotlin.collections.C19318k.m32603U0(r9, r10, r15, r4, r8)
            int[] r8 = r6.f17143c
            int r9 = r6.f17141a
            kotlin.collections.C19318k.m32600R0(r10, r4, r9, r8, r14)
            java.lang.Object[] r10 = r6.f17142b
            r8 = 6
            r12 = 0
            r13 = 0
            r9 = 6
            r11 = r15
            r5 = r14
            r14 = r4
            r16 = r15
            r15 = r9
            kotlin.collections.C19318k.m32605W0(r10, r11, r12, r13, r14, r15)
            int[] r9 = r6.f17143c
            kotlin.collections.C19318k.m32604V0(r9, r5, r4, r8)
            r8 = r16
            r6.f17142b = r8
            r6.f17143c = r5
            goto L_0x010d
        L_0x0101:
            int r5 = r4 + 1
            kotlin.collections.C19318k.m32603U0(r9, r5, r9, r4, r8)
            int[] r8 = r6.f17143c
            int r9 = r6.f17141a
            kotlin.collections.C19318k.m32600R0(r5, r4, r9, r8, r8)
        L_0x010d:
            java.lang.Object[] r5 = r6.f17142b
            r5[r4] = r1
            int[] r5 = r6.f17143c
            r5[r4] = r7
            int r4 = r6.f17141a
            r5 = 1
            int r4 = r4 + r5
            r6.f17141a = r4
        L_0x011b:
            if (r3 == 0) goto L_0x0132
            r.b<androidx.compose.runtime.p<?>, java.lang.Object> r3 = r2.f3084g
            if (r3 != 0) goto L_0x0128
            r.b r3 = new r.b
            r3.<init>()
            r2.f3084g = r3
        L_0x0128:
            r2 = r1
            androidx.compose.runtime.p r2 = (androidx.compose.runtime.C1354p) r2
            java.lang.Object r2 = r2.mo5536b()
            r3.mo20207b(r1, r2)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1330i.mo5807i(java.lang.Object):void");
    }

    public final void invalidateAll() {
        synchronized (this.f2894e) {
            for (Object obj : this.f2896g.f2822d) {
                C1418v0 v0Var = obj instanceof C1418v0 ? (C1418v0) obj : null;
                if (v0Var != null) {
                    v0Var.invalidate();
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    public final boolean isDisposed() {
        return this.f2909t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5809j(java.util.Set<? extends java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r6.f2893d
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0016
        L_0x0010:
            java.lang.Object r2 = androidx.compose.runtime.C1337j.f2931a
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
        L_0x0016:
            r3 = 0
            if (r2 == 0) goto L_0x001b
            r2 = r7
            goto L_0x003c
        L_0x001b:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002a
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r7
            goto L_0x003c
        L_0x002a:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L_0x0066
            if (r0 == 0) goto L_0x005e
            r2 = r0
            java.util.Set[] r2 = (java.util.Set[]) r2
            int r4 = r2.length
            int r5 = r4 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            r2[r4] = r7
        L_0x003c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f2893d
        L_0x003e:
            boolean r5 = r4.compareAndSet(r0, r2)
            if (r5 == 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            java.lang.Object r5 = r4.get()
            if (r5 == r0) goto L_0x003e
            r1 = r3
        L_0x004c:
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x005d
            java.lang.Object r7 = r6.f2894e
            monitor-enter(r7)
            r6.mo5819v()     // Catch:{ all -> 0x005a }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x005a }
            monitor-exit(r7)
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x005d:
            return
        L_0x005e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            r7.<init>(r0)
            throw r7
        L_0x0066:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "corrupt pendingModifications: "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f2893d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1330i.mo5809j(java.util.Set):void");
    }

    /* renamed from: k */
    public final void mo5810k() {
        synchronized (this.f2894e) {
            mo5816s(this.f2900k);
            mo5819v();
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: l */
    public final boolean mo5811l() {
        return this.f2907r.f2694C;
    }

    /* renamed from: m */
    public final void mo5812m(Object obj) {
        C19383o.m32797g(obj, "value");
        synchronized (this.f2894e) {
            mo5822y(obj);
            C7733d<C1354p<?>> dVar = this.f2899j;
            int c = dVar.mo20227c(obj);
            if (c >= 0) {
                C7731c<C1354p<?>> f = dVar.mo20230f(c);
                int i = 0;
                while (true) {
                    if (!(i < f.f17147b)) {
                        break;
                    }
                    int i2 = i + 1;
                    Object obj2 = f.f17148c[i];
                    if (obj2 != null) {
                        mo5822y((C1354p) obj2);
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: n */
    public final boolean mo5797n() {
        boolean z;
        synchronized (this.f2894e) {
            z = this.f2903n.f17146c > 0;
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    public final void mo5813o() {
        synchronized (this.f2894e) {
            this.f2907r.f2735u.clear();
            if (!this.f2895f.isEmpty()) {
                HashSet<C1426z0> hashSet = this.f2895f;
                C19383o.m32797g(hashSet, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!hashSet.isEmpty()) {
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<C1426z0> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().onAbandoned();
                        }
                        C19394m mVar = C19394m.f43287a;
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            C19394m mVar2 = C19394m.f43287a;
        }
    }

    /* renamed from: p */
    public final void mo5814p(C19846a<C19394m> aVar) {
        ComposerImpl composerImpl = this.f2907r;
        composerImpl.getClass();
        if (!composerImpl.f2694C) {
            composerImpl.f2694C = true;
            try {
                aVar.invoke();
            } finally {
                composerImpl.f2694C = false;
            }
        } else {
            ComposerKt.m2526c("Preparing a composition while composing is not supported".toString());
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x00b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5815q(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            r6 = 0
            r8 = 1
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r3.next()
            boolean r9 = r4 instanceof androidx.compose.runtime.C1418v0
            if (r9 == 0) goto L_0x002e
            androidx.compose.runtime.v0 r4 = (androidx.compose.runtime.C1418v0) r4
            androidx.compose.runtime.i r5 = r4.f3079b
            if (r5 == 0) goto L_0x002b
            androidx.compose.runtime.InvalidationResult r4 = r5.mo5820w(r4, r6)
            if (r4 != 0) goto L_0x000d
        L_0x002b:
            androidx.compose.runtime.InvalidationResult r4 = androidx.compose.runtime.InvalidationResult.IGNORED
            goto L_0x000d
        L_0x002e:
            m2764r(r0, r1, r2, r4)
            r.d<androidx.compose.runtime.p<?>> r6 = r0.f2899j
            int r4 = r6.mo20227c(r4)
            if (r4 < 0) goto L_0x000d
            r.c r4 = r6.mo20230f(r4)
            r6 = 0
        L_0x003e:
            int r9 = r4.f17147b
            if (r6 >= r9) goto L_0x0044
            r9 = r8
            goto L_0x0045
        L_0x0044:
            r9 = 0
        L_0x0045:
            if (r9 == 0) goto L_0x000d
            java.lang.Object[] r9 = r4.f17148c
            int r10 = r6 + 1
            r6 = r9[r6]
            if (r6 == 0) goto L_0x0056
            androidx.compose.runtime.p r6 = (androidx.compose.runtime.C1354p) r6
            m2764r(r0, r1, r2, r6)
            r6 = r10
            goto L_0x003e
        L_0x0056:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x005c:
            if (r1 == 0) goto L_0x00f8
            java.util.HashSet<androidx.compose.runtime.v0> r1 = r0.f2898i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x00f8
            r.d<androidx.compose.runtime.v0> r1 = r0.f2897h
            int r3 = r1.f17154d
            r4 = 0
            r9 = 0
        L_0x006d:
            if (r4 >= r3) goto L_0x00db
            int[] r10 = r1.f17151a
            r10 = r10[r4]
            r.c<T>[] r11 = r1.f17153c
            r11 = r11[r10]
            kotlin.jvm.internal.C19383o.m32794d(r11)
            int r12 = r11.f17147b
            r13 = 0
            r14 = 0
        L_0x007e:
            if (r13 >= r12) goto L_0x00ba
            java.lang.Object[] r15 = r11.f17148c
            r15 = r15[r13]
            if (r15 == 0) goto L_0x00b4
            r7 = r15
            androidx.compose.runtime.v0 r7 = (androidx.compose.runtime.C1418v0) r7
            java.util.HashSet<androidx.compose.runtime.v0> r6 = r0.f2898i
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00a5
            T r6 = r2.element
            java.util.HashSet r6 = (java.util.HashSet) r6
            if (r6 == 0) goto L_0x009f
            boolean r6 = r6.contains(r7)
            if (r6 != r8) goto L_0x009f
            r6 = r8
            goto L_0x00a0
        L_0x009f:
            r6 = 0
        L_0x00a0:
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r6 = 0
            goto L_0x00a6
        L_0x00a5:
            r6 = r8
        L_0x00a6:
            if (r6 != 0) goto L_0x00b0
            if (r14 == r13) goto L_0x00ae
            java.lang.Object[] r6 = r11.f17148c
            r6[r14] = r15
        L_0x00ae:
            int r14 = r14 + 1
        L_0x00b0:
            int r13 = r13 + 1
            r6 = 0
            goto L_0x007e
        L_0x00b4:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x00ba:
            int r6 = r11.f17147b
            r7 = r14
        L_0x00bd:
            if (r7 >= r6) goto L_0x00c7
            java.lang.Object[] r12 = r11.f17148c
            r13 = 0
            r12[r7] = r13
            int r7 = r7 + 1
            goto L_0x00bd
        L_0x00c7:
            r11.f17147b = r14
            if (r14 <= 0) goto L_0x00d7
            if (r9 == r4) goto L_0x00d5
            int[] r6 = r1.f17151a
            r7 = r6[r9]
            r6[r9] = r10
            r6[r4] = r7
        L_0x00d5:
            int r9 = r9 + 1
        L_0x00d7:
            int r4 = r4 + 1
            r6 = 0
            goto L_0x006d
        L_0x00db:
            int r2 = r1.f17154d
            r3 = r9
        L_0x00de:
            if (r3 >= r2) goto L_0x00ec
            java.lang.Object[] r4 = r1.f17152b
            int[] r5 = r1.f17151a
            r5 = r5[r3]
            r6 = 0
            r4[r5] = r6
            int r3 = r3 + 1
            goto L_0x00de
        L_0x00ec:
            r1.f17154d = r9
            r16.mo5817t()
            java.util.HashSet<androidx.compose.runtime.v0> r1 = r0.f2898i
            r1.clear()
            goto L_0x016d
        L_0x00f8:
            T r1 = r2.element
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x016d
            r.d<androidx.compose.runtime.v0> r2 = r0.f2897h
            int r3 = r2.f17154d
            r4 = 0
            r6 = 0
        L_0x0104:
            if (r4 >= r3) goto L_0x0157
            int[] r7 = r2.f17151a
            r7 = r7[r4]
            r.c<T>[] r8 = r2.f17153c
            r8 = r8[r7]
            kotlin.jvm.internal.C19383o.m32794d(r8)
            int r9 = r8.f17147b
            r10 = 0
            r11 = 0
        L_0x0115:
            if (r10 >= r9) goto L_0x0137
            java.lang.Object[] r12 = r8.f17148c
            r12 = r12[r10]
            if (r12 == 0) goto L_0x0131
            r13 = r12
            androidx.compose.runtime.v0 r13 = (androidx.compose.runtime.C1418v0) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x012e
            if (r11 == r10) goto L_0x012c
            java.lang.Object[] r13 = r8.f17148c
            r13[r11] = r12
        L_0x012c:
            int r11 = r11 + 1
        L_0x012e:
            int r10 = r10 + 1
            goto L_0x0115
        L_0x0131:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r5)
            throw r1
        L_0x0137:
            int r9 = r8.f17147b
            r10 = r11
        L_0x013a:
            if (r10 >= r9) goto L_0x0144
            java.lang.Object[] r12 = r8.f17148c
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x013a
        L_0x0144:
            r8.f17147b = r11
            if (r11 <= 0) goto L_0x0154
            if (r6 == r4) goto L_0x0152
            int[] r8 = r2.f17151a
            r9 = r8[r6]
            r8[r6] = r7
            r8[r4] = r9
        L_0x0152:
            int r6 = r6 + 1
        L_0x0154:
            int r4 = r4 + 1
            goto L_0x0104
        L_0x0157:
            int r1 = r2.f17154d
            r3 = r6
        L_0x015a:
            if (r3 >= r1) goto L_0x0168
            java.lang.Object[] r4 = r2.f17152b
            int[] r5 = r2.f17151a
            r5 = r5[r3]
            r7 = 0
            r4[r5] = r7
            int r3 = r3 + 1
            goto L_0x015a
        L_0x0168:
            r2.f17154d = r6
            r16.mo5817t()
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1330i.mo5815q(java.util.Set, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5 A[Catch:{ all -> 0x0098, all -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00ad A[SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5816s(java.util.ArrayList r18) {
        /*
            r17 = this;
            r1 = r17
            androidx.compose.runtime.i$a r2 = new androidx.compose.runtime.i$a
            java.util.HashSet<androidx.compose.runtime.z0> r0 = r1.f2895f
            r2.<init>(r0)
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x001b
            java.util.ArrayList r0 = r1.f2901l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
            r2.mo5826d()
        L_0x001a:
            return
        L_0x001b:
            java.lang.String r0 = "Compose:applyChanges"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x010c }
            androidx.compose.runtime.c<?> r0 = r1.f2892c     // Catch:{ all -> 0x0107 }
            r0.getClass()     // Catch:{ all -> 0x0107 }
            androidx.compose.runtime.c1 r0 = r1.f2896g     // Catch:{ all -> 0x0107 }
            androidx.compose.runtime.d1 r3 = r0.mo5649p()     // Catch:{ all -> 0x0107 }
            androidx.compose.runtime.c<?> r0 = r1.f2892c     // Catch:{ all -> 0x0102 }
            int r4 = r18.size()     // Catch:{ all -> 0x0102 }
            r5 = 0
            r6 = r5
        L_0x0033:
            if (r6 >= r4) goto L_0x0043
            r7 = r18
            java.lang.Object r8 = r7.get(r6)     // Catch:{ all -> 0x0102 }
            kq.q r8 = (p753kq.C19862q) r8     // Catch:{ all -> 0x0102 }
            r8.invoke(r0, r3, r2)     // Catch:{ all -> 0x0102 }
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0043:
            r7 = r18
            r18.clear()     // Catch:{ all -> 0x0102 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0102 }
            r3.mo5671f()     // Catch:{ all -> 0x0107 }
            androidx.compose.runtime.c<?> r0 = r1.f2892c     // Catch:{ all -> 0x0107 }
            r0.mo5642d()     // Catch:{ all -> 0x0107 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x010c }
            r2.mo5827e()     // Catch:{ all -> 0x010c }
            r2.mo5828f()     // Catch:{ all -> 0x010c }
            boolean r0 = r1.f2904o     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "Compose:unobserve"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x010c }
            r1.f2904o = r5     // Catch:{ all -> 0x0098 }
            r.d<androidx.compose.runtime.v0> r0 = r1.f2897h     // Catch:{ all -> 0x0098 }
            int r3 = r0.f17154d     // Catch:{ all -> 0x0098 }
            r4 = r5
            r6 = r4
        L_0x006c:
            r7 = 0
            if (r4 >= r3) goto L_0x00d7
            int[] r8 = r0.f17151a     // Catch:{ all -> 0x0098 }
            r8 = r8[r4]     // Catch:{ all -> 0x0098 }
            r.c<T>[] r9 = r0.f17153c     // Catch:{ all -> 0x0098 }
            r9 = r9[r8]     // Catch:{ all -> 0x0098 }
            kotlin.jvm.internal.C19383o.m32794d(r9)     // Catch:{ all -> 0x0098 }
            int r10 = r9.f17147b     // Catch:{ all -> 0x0098 }
            r11 = r5
            r12 = r11
        L_0x007e:
            if (r11 >= r10) goto L_0x00b8
            java.lang.Object[] r13 = r9.f17148c     // Catch:{ all -> 0x0098 }
            r13 = r13[r11]     // Catch:{ all -> 0x0098 }
            if (r13 == 0) goto L_0x00b0
            r14 = r13
            androidx.compose.runtime.v0 r14 = (androidx.compose.runtime.C1418v0) r14     // Catch:{ all -> 0x0098 }
            androidx.compose.runtime.i r15 = r14.f3079b     // Catch:{ all -> 0x0098 }
            r16 = 1
            if (r15 == 0) goto L_0x00a0
            androidx.compose.runtime.b r14 = r14.f3080c     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x009a
            boolean r14 = r14.mo5622a()     // Catch:{ all -> 0x0098 }
            goto L_0x009b
        L_0x0098:
            r0 = move-exception
            goto L_0x00f2
        L_0x009a:
            r14 = r5
        L_0x009b:
            if (r14 == 0) goto L_0x00a0
            r14 = r16
            goto L_0x00a1
        L_0x00a0:
            r14 = r5
        L_0x00a1:
            r14 = r14 ^ 1
            if (r14 != 0) goto L_0x00ad
            if (r12 == r11) goto L_0x00ab
            java.lang.Object[] r14 = r9.f17148c     // Catch:{ all -> 0x0098 }
            r14[r12] = r13     // Catch:{ all -> 0x0098 }
        L_0x00ab:
            int r12 = r12 + 1
        L_0x00ad:
            int r11 = r11 + 1
            goto L_0x007e
        L_0x00b0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            r0.<init>(r3)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x00b8:
            int r10 = r9.f17147b     // Catch:{ all -> 0x0098 }
            r11 = r12
        L_0x00bb:
            if (r11 >= r10) goto L_0x00c4
            java.lang.Object[] r13 = r9.f17148c     // Catch:{ all -> 0x0098 }
            r13[r11] = r7     // Catch:{ all -> 0x0098 }
            int r11 = r11 + 1
            goto L_0x00bb
        L_0x00c4:
            r9.f17147b = r12     // Catch:{ all -> 0x0098 }
            if (r12 <= 0) goto L_0x00d4
            if (r6 == r4) goto L_0x00d2
            int[] r7 = r0.f17151a     // Catch:{ all -> 0x0098 }
            r9 = r7[r6]     // Catch:{ all -> 0x0098 }
            r7[r6] = r8     // Catch:{ all -> 0x0098 }
            r7[r4] = r9     // Catch:{ all -> 0x0098 }
        L_0x00d2:
            int r6 = r6 + 1
        L_0x00d4:
            int r4 = r4 + 1
            goto L_0x006c
        L_0x00d7:
            int r3 = r0.f17154d     // Catch:{ all -> 0x0098 }
            r4 = r6
        L_0x00da:
            if (r4 >= r3) goto L_0x00e7
            java.lang.Object[] r5 = r0.f17152b     // Catch:{ all -> 0x0098 }
            int[] r8 = r0.f17151a     // Catch:{ all -> 0x0098 }
            r8 = r8[r4]     // Catch:{ all -> 0x0098 }
            r5[r8] = r7     // Catch:{ all -> 0x0098 }
            int r4 = r4 + 1
            goto L_0x00da
        L_0x00e7:
            r0.f17154d = r6     // Catch:{ all -> 0x0098 }
            r17.mo5817t()     // Catch:{ all -> 0x0098 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0098 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x010c }
            goto L_0x00f6
        L_0x00f2:
            android.os.Trace.endSection()     // Catch:{ all -> 0x010c }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x00f6:
            java.util.ArrayList r0 = r1.f2901l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0101
            r2.mo5826d()
        L_0x0101:
            return
        L_0x0102:
            r0 = move-exception
            r3.mo5671f()     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x010c }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            java.util.ArrayList r3 = r1.f2901l
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0118
            r2.mo5826d()
        L_0x0118:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1330i.mo5816s(java.util.ArrayList):void");
    }

    /* renamed from: t */
    public final void mo5817t() {
        C7733d<C1354p<?>> dVar = this.f2899j;
        int i = dVar.f17154d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = dVar.f17151a[i3];
            C7731c<T> cVar = dVar.f17153c[i4];
            C19383o.m32794d(cVar);
            int i5 = cVar.f17147b;
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                Object obj = cVar.f17148c[i6];
                if (obj != null) {
                    if (!(!this.f2897h.mo20226b((C1354p) obj))) {
                        if (i7 != i6) {
                            cVar.f17148c[i7] = obj;
                        }
                        i7++;
                    }
                    i6++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
            }
            int i8 = cVar.f17147b;
            for (int i9 = i7; i9 < i8; i9++) {
                cVar.f17148c[i9] = null;
            }
            cVar.f17147b = i7;
            if (i7 > 0) {
                if (i2 != i3) {
                    int[] iArr = dVar.f17151a;
                    int i10 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i10;
                }
                i2++;
            }
        }
        int i11 = dVar.f17154d;
        for (int i12 = i2; i12 < i11; i12++) {
            dVar.f17152b[dVar.f17151a[i12]] = null;
        }
        dVar.f17154d = i2;
        Iterator<C1418v0> it = this.f2898i.iterator();
        C19383o.m32796f(it, "iterator()");
        while (it.hasNext()) {
            if (!(it.next().f3084g != null)) {
                it.remove();
            }
        }
    }

    /* renamed from: u */
    public final void mo5818u() {
        AtomicReference<Object> atomicReference = this.f2893d;
        Object obj = C1337j.f2931a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet == null) {
            return;
        }
        if (C19383o.m32792b(andSet, obj)) {
            throw new IllegalStateException("pending composition has not been applied".toString());
        } else if (andSet instanceof Set) {
            mo5815q((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set q : (Set[]) andSet) {
                mo5815q(q, true);
            }
        } else {
            StringBuilder h = C0072d.m201h("corrupt pendingModifications drain: ");
            h.append(this.f2893d);
            throw new IllegalStateException(h.toString().toString());
        }
    }

    /* renamed from: v */
    public final void mo5819v() {
        Object andSet = this.f2893d.getAndSet((Object) null);
        if (C19383o.m32792b(andSet, C1337j.f2931a)) {
            return;
        }
        if (andSet instanceof Set) {
            mo5815q((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set q : (Set[]) andSet) {
                mo5815q(q, false);
            }
        } else if (andSet == null) {
            throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
        } else {
            StringBuilder h = C0072d.m201h("corrupt pendingModifications drain: ");
            h.append(this.f2893d);
            throw new IllegalStateException(h.toString().toString());
        }
    }

    /* renamed from: w */
    public final InvalidationResult mo5820w(C1418v0 v0Var, Object obj) {
        C19383o.m32797g(v0Var, "scope");
        int i = v0Var.f3078a;
        boolean z = false;
        if ((i & 2) != 0) {
            v0Var.f3078a = i | 4;
        }
        C1296b bVar = v0Var.f3080c;
        if (bVar == null || !this.f2896g.mo5650q(bVar) || !bVar.mo5622a()) {
            return InvalidationResult.IGNORED;
        }
        if (!bVar.mo5622a()) {
            return InvalidationResult.IGNORED;
        }
        if (v0Var.f3081d != null) {
            z = true;
        }
        return !z ? InvalidationResult.IGNORED : mo5821x(v0Var, bVar, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: r.c} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (r1 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        return r1.mo5821x(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        r5.f2891b.mo5486j(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r5.f2907r.f2694C == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return androidx.compose.runtime.InvalidationResult.DEFERRED;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult mo5821x(androidx.compose.runtime.C1418v0 r6, androidx.compose.runtime.C1296b r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2894e
            monitor-enter(r0)
            androidx.compose.runtime.i r1 = r5.f2905p     // Catch:{ all -> 0x007d }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            androidx.compose.runtime.c1 r3 = r5.f2896g     // Catch:{ all -> 0x007d }
            int r4 = r5.f2906q     // Catch:{ all -> 0x007d }
            boolean r3 = r3.mo5647m(r7, r4)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0064
            androidx.compose.runtime.ComposerImpl r3 = r5.f2907r     // Catch:{ all -> 0x007d }
            boolean r4 = r3.f2694C     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x0026
            boolean r3 = r3.mo5393A0(r6, r8)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0026
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x007d }
            monitor-exit(r0)
            return r6
        L_0x0026:
            if (r8 != 0) goto L_0x002e
            r.b<androidx.compose.runtime.v0, r.c<java.lang.Object>> r3 = r5.f2903n     // Catch:{ all -> 0x007d }
            r3.mo20207b(r6, r2)     // Catch:{ all -> 0x007d }
            goto L_0x0064
        L_0x002e:
            r.b<androidx.compose.runtime.v0, r.c<java.lang.Object>> r3 = r5.f2903n     // Catch:{ all -> 0x007d }
            java.lang.Object r4 = androidx.compose.runtime.C1337j.f2931a     // Catch:{ all -> 0x007d }
            r3.getClass()     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "key"
            kotlin.jvm.internal.C19383o.m32797g(r6, r4)     // Catch:{ all -> 0x007d }
            int r4 = r3.mo20206a(r6)     // Catch:{ all -> 0x007d }
            if (r4 < 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0057
            int r4 = r3.mo20206a(r6)     // Catch:{ all -> 0x007d }
            if (r4 < 0) goto L_0x004f
            java.lang.Object[] r2 = r3.f17145b     // Catch:{ all -> 0x007d }
            r2 = r2[r4]     // Catch:{ all -> 0x007d }
        L_0x004f:
            r.c r2 = (p219r.C7731c) r2     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x0064
            r2.add(r8)     // Catch:{ all -> 0x007d }
            goto L_0x0064
        L_0x0057:
            r.c r2 = new r.c     // Catch:{ all -> 0x007d }
            r2.<init>()     // Catch:{ all -> 0x007d }
            r2.add(r8)     // Catch:{ all -> 0x007d }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x007d }
            r3.mo20207b(r6, r2)     // Catch:{ all -> 0x007d }
        L_0x0064:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x006c
            androidx.compose.runtime.InvalidationResult r6 = r1.mo5821x(r6, r7, r8)
            return r6
        L_0x006c:
            androidx.compose.runtime.g r6 = r5.f2891b
            r6.mo5486j(r5)
            androidx.compose.runtime.ComposerImpl r6 = r5.f2907r
            boolean r6 = r6.f2694C
            if (r6 == 0) goto L_0x007a
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x007c
        L_0x007a:
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x007c:
            return r6
        L_0x007d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1330i.mo5821x(androidx.compose.runtime.v0, androidx.compose.runtime.b, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    /* renamed from: y */
    public final void mo5822y(Object obj) {
        InvalidationResult invalidationResult;
        C7733d<C1418v0> dVar = this.f2897h;
        int c = dVar.mo20227c(obj);
        if (c >= 0) {
            C7731c<C1418v0> f = dVar.mo20230f(c);
            int i = 0;
            while (true) {
                if (i < f.f17147b) {
                    int i2 = i + 1;
                    Object obj2 = f.f17148c[i];
                    if (obj2 != null) {
                        C1418v0 v0Var = (C1418v0) obj2;
                        C1330i iVar = v0Var.f3079b;
                        if (iVar == null || (invalidationResult = iVar.mo5820w(v0Var, obj)) == null) {
                            invalidationResult = InvalidationResult.IGNORED;
                        }
                        if (invalidationResult == InvalidationResult.IMMINENT) {
                            this.f2902m.mo20225a(obj, v0Var);
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                } else {
                    return;
                }
            }
        }
    }
}
