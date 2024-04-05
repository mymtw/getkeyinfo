package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19766p0;
import kotlinx.coroutines.C19769q0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C19624a;
import kotlinx.coroutines.flow.internal.C19625b;
import kotlinx.coroutines.flow.internal.C19629f;
import kotlinx.coroutines.flow.internal.C19634k;
import kotlinx.coroutines.internal.C19736t;

/* renamed from: kotlinx.coroutines.flow.s1 */
public class C19671s1<T> extends C19624a<C19676t1> implements C19653m1<T>, C19597d, C19634k<T> {

    /* renamed from: f */
    public final int f43612f;

    /* renamed from: g */
    public final int f43613g;

    /* renamed from: h */
    public final BufferOverflow f43614h;

    /* renamed from: i */
    public Object[] f43615i;

    /* renamed from: j */
    public long f43616j;

    /* renamed from: k */
    public long f43617k;

    /* renamed from: l */
    public int f43618l;

    /* renamed from: m */
    public int f43619m;

    /* renamed from: kotlinx.coroutines.flow.s1$a */
    public static final class C19672a implements C19766p0 {

        /* renamed from: b */
        public final C19671s1<?> f43620b;

        /* renamed from: c */
        public long f43621c;

        /* renamed from: d */
        public final Object f43622d;

        /* renamed from: e */
        public final C19340c<C19394m> f43623e;

        public C19672a(C19671s1 s1Var, long j, Object obj, C19753l lVar) {
            this.f43620b = s1Var;
            this.f43621c = j;
            this.f43622d = obj;
            this.f43623e = lVar;
        }

        public final void dispose() {
            C19671s1<?> s1Var = this.f43620b;
            synchronized (s1Var) {
                if (this.f43621c >= s1Var.mo72381o()) {
                    Object[] objArr = s1Var.f43615i;
                    C19383o.m32794d(objArr);
                    int i = (int) this.f43621c;
                    if (objArr[(objArr.length - 1) & i] == this) {
                        objArr[i & (objArr.length - 1)] = C19680v.f43629a;
                        s1Var.mo72377j();
                        C19394m mVar = C19394m.f43287a;
                    }
                }
            }
        }
    }

    /* renamed from: kotlinx.coroutines.flow.s1$b */
    public /* synthetic */ class C19673b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43624a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f43624a = iArr;
        }
    }

    public C19671s1(int i, int i2, BufferOverflow bufferOverflow) {
        this.f43612f = i;
        this.f43613g = i2;
        this.f43614h = bufferOverflow;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: kotlinx.coroutines.flow.t1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.coroutines.intrinsics.CoroutineSingletons m33431k(kotlinx.coroutines.flow.C19671s1 r8, kotlinx.coroutines.flow.C19600e r9, kotlin.coroutines.C19340c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.g1 r8 = (kotlinx.coroutines.C19699g1) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.t1 r9 = (kotlinx.coroutines.flow.C19676t1) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C19600e) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.s1 r5 = (kotlinx.coroutines.flow.C19671s1) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x0046 }
            goto L_0x0096
        L_0x0046:
            r8 = move-exception
        L_0x0047:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L_0x00d4
        L_0x004c:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            kotlinx.coroutines.flow.t1 r9 = (kotlinx.coroutines.flow.C19676t1) r9
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C19600e) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.s1 r2 = (kotlinx.coroutines.flow.C19671s1) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x005f }
            r10 = r8
            r8 = r2
            goto L_0x0087
        L_0x005f:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto L_0x00d4
        L_0x0065:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            kotlinx.coroutines.flow.internal.b r10 = r8.mo72369c()
            kotlinx.coroutines.flow.t1 r10 = (kotlinx.coroutines.flow.C19676t1) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.C19695z1     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0084
            r2 = r9
            kotlinx.coroutines.flow.z1 r2 = (kotlinx.coroutines.flow.C19695z1) r2     // Catch:{ all -> 0x00d3 }
            r0.L$0 = r8     // Catch:{ all -> 0x00d3 }
            r0.L$1 = r9     // Catch:{ all -> 0x00d3 }
            r0.L$2 = r10     // Catch:{ all -> 0x00d3 }
            r0.label = r5     // Catch:{ all -> 0x00d3 }
            kotlin.m r2 = r2.mo72389b(r0)     // Catch:{ all -> 0x00d3 }
            if (r2 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0087:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch:{ all -> 0x00ce }
            kotlinx.coroutines.g1$b r5 = kotlinx.coroutines.C19699g1.C19701b.f43635b     // Catch:{ all -> 0x00ce }
            kotlin.coroutines.CoroutineContext$a r2 = r2.get(r5)     // Catch:{ all -> 0x00ce }
            kotlinx.coroutines.g1 r2 = (kotlinx.coroutines.C19699g1) r2     // Catch:{ all -> 0x00ce }
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0096:
            java.lang.Object r10 = r5.mo72385s(r9)     // Catch:{ all -> 0x0046 }
            kotlinx.coroutines.internal.t r6 = kotlinx.coroutines.flow.C19680v.f43629a     // Catch:{ all -> 0x0046 }
            if (r10 == r6) goto L_0x00bd
            if (r8 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            boolean r6 = r8.isActive()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x00b8
        L_0x00a7:
            r0.L$0 = r5     // Catch:{ all -> 0x0046 }
            r0.L$1 = r2     // Catch:{ all -> 0x0046 }
            r0.L$2 = r9     // Catch:{ all -> 0x0046 }
            r0.L$3 = r8     // Catch:{ all -> 0x0046 }
            r0.label = r3     // Catch:{ all -> 0x0046 }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x0046 }
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x00b8:
            java.util.concurrent.CancellationException r8 = r8.mo72398h()     // Catch:{ all -> 0x0046 }
            throw r8     // Catch:{ all -> 0x0046 }
        L_0x00bd:
            r0.L$0 = r5     // Catch:{ all -> 0x0046 }
            r0.L$1 = r2     // Catch:{ all -> 0x0046 }
            r0.L$2 = r9     // Catch:{ all -> 0x0046 }
            r0.L$3 = r8     // Catch:{ all -> 0x0046 }
            r0.label = r4     // Catch:{ all -> 0x0046 }
            java.lang.Object r10 = r5.mo72376i(r9, r0)     // Catch:{ all -> 0x0046 }
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x00ce:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x0047
        L_0x00d3:
            r9 = move-exception
        L_0x00d4:
            r8.mo72371h(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C19671s1.m33431k(kotlinx.coroutines.flow.s1, kotlinx.coroutines.flow.e, kotlin.coroutines.c):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* renamed from: a */
    public final boolean mo72331a(T t) {
        int i;
        boolean z;
        C19340c[] cVarArr = C19421p.f43321k;
        synchronized (this) {
            i = 0;
            if (mo72383q(t)) {
                cVarArr = mo72380n(cVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = cVarArr.length;
        while (i < length) {
            C19340c cVar = cVarArr[i];
            i++;
            if (cVar != null) {
                cVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
        }
        return z;
    }

    /* renamed from: b */
    public final C19597d<T> mo72332b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? this : new C19629f(i, coroutineContext, bufferOverflow, this);
    }

    public final Object collect(C19600e<? super T> eVar, C19340c<?> cVar) {
        return m33431k(this, eVar, cVar);
    }

    /* renamed from: e */
    public final void mo72333e() {
        synchronized (this) {
            mo72386t(mo72381o() + ((long) this.f43618l), this.f43617k, mo72381o() + ((long) this.f43618l), mo72381o() + ((long) this.f43618l) + ((long) this.f43619m));
            C19394m mVar = C19394m.f43287a;
        }
    }

    public final Object emit(T t, C19340c<? super C19394m> cVar) {
        C19672a aVar;
        C19340c[] cVarArr;
        if (mo72331a(t)) {
            return C19394m.f43287a;
        }
        C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
        lVar.mo72548n();
        C19340c[] cVarArr2 = C19421p.f43321k;
        synchronized (this) {
            if (mo72383q(t)) {
                lVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
                cVarArr = mo72380n(cVarArr2);
                aVar = null;
            } else {
                C19672a aVar2 = new C19672a(this, ((long) (this.f43618l + this.f43619m)) + mo72381o(), t, lVar);
                mo72379m(aVar2);
                this.f43619m++;
                if (this.f43613g == 0) {
                    cVarArr2 = mo72380n(cVarArr2);
                }
                cVarArr = cVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            lVar.mo72497O(new C19769q0(aVar));
        }
        int i = 0;
        int length = cVarArr.length;
        while (i < length) {
            C19340c cVar2 = cVarArr[i];
            i++;
            if (cVar2 != null) {
                cVar2.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
        }
        Object l = lVar.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (l != coroutineSingletons) {
            l = C19394m.f43287a;
        }
        return l == coroutineSingletons ? l : C19394m.f43287a;
    }

    /* renamed from: f */
    public final C19625b mo72334f() {
        return new C19676t1();
    }

    /* renamed from: g */
    public final C19625b[] mo72335g() {
        return new C19676t1[2];
    }

    /* renamed from: i */
    public final Object mo72376i(C19676t1 t1Var, C19340c<? super C19394m> cVar) {
        C19753l lVar = new C19753l(1, C19388s.m32873m0(cVar));
        lVar.mo72548n();
        synchronized (this) {
            if (mo72384r(t1Var) < 0) {
                t1Var.f43626b = lVar;
            } else {
                lVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
            C19394m mVar = C19394m.f43287a;
        }
        Object l = lVar.mo72547l();
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : C19394m.f43287a;
    }

    /* renamed from: j */
    public final void mo72377j() {
        if (this.f43613g != 0 || this.f43619m > 1) {
            Object[] objArr = this.f43615i;
            C19383o.m32794d(objArr);
            while (this.f43619m > 0) {
                long o = mo72381o();
                int i = this.f43618l;
                int i2 = this.f43619m;
                if (objArr[((int) ((o + ((long) (i + i2))) - 1)) & (objArr.length - 1)] == C19680v.f43629a) {
                    this.f43619m = i2 - 1;
                    objArr[((int) (mo72381o() + ((long) (this.f43618l + this.f43619m)))) & (objArr.length - 1)] = null;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo72378l() {
        S[] sArr;
        Object[] objArr = this.f43615i;
        C19383o.m32794d(objArr);
        objArr[((int) mo72381o()) & (objArr.length - 1)] = null;
        this.f43618l--;
        long o = mo72381o() + 1;
        if (this.f43616j < o) {
            this.f43616j = o;
        }
        if (this.f43617k < o) {
            if (!(this.f43588c == 0 || (sArr = this.f43587b) == null)) {
                int i = 0;
                int length = sArr.length;
                while (i < length) {
                    S s = sArr[i];
                    i++;
                    if (s != null) {
                        C19676t1 t1Var = (C19676t1) s;
                        long j = t1Var.f43625a;
                        if (j >= 0 && j < o) {
                            t1Var.f43625a = o;
                        }
                    }
                }
            }
            this.f43617k = o;
        }
    }

    /* renamed from: m */
    public final void mo72379m(Object obj) {
        int i = this.f43618l + this.f43619m;
        Object[] objArr = this.f43615i;
        if (objArr == null) {
            objArr = mo72382p(0, 2, (Object[]) null);
        } else if (i >= objArr.length) {
            objArr = mo72382p(i, objArr.length * 2, objArr);
        }
        objArr[((int) (mo72381o() + ((long) i))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000d, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.C19340c<kotlin.C19394m>[] mo72380n(kotlin.coroutines.C19340c<kotlin.C19394m>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f43588c
            if (r1 != 0) goto L_0x0006
            goto L_0x0046
        L_0x0006:
            S[] r1 = r10.f43587b
            if (r1 != 0) goto L_0x000b
            goto L_0x0046
        L_0x000b:
            r2 = 0
            int r3 = r1.length
        L_0x000d:
            if (r2 >= r3) goto L_0x0046
            r4 = r1[r2]
            int r2 = r2 + 1
            if (r4 == 0) goto L_0x000d
            kotlinx.coroutines.flow.t1 r4 = (kotlinx.coroutines.flow.C19676t1) r4
            kotlinx.coroutines.l r5 = r4.f43626b
            if (r5 != 0) goto L_0x001c
            goto L_0x000d
        L_0x001c:
            long r6 = r10.mo72384r(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0027
            goto L_0x000d
        L_0x0027:
            int r6 = r11.length
            if (r0 < r6) goto L_0x003a
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C19383o.m32796f(r11, r6)
        L_0x003a:
            r6 = r11
            kotlin.coroutines.c[] r6 = (kotlin.coroutines.C19340c[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f43626b = r0
            r0 = r7
            goto L_0x000d
        L_0x0046:
            kotlin.coroutines.c[] r11 = (kotlin.coroutines.C19340c[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C19671s1.mo72380n(kotlin.coroutines.c[]):kotlin.coroutines.c[]");
    }

    /* renamed from: o */
    public final long mo72381o() {
        return Math.min(this.f43617k, this.f43616j);
    }

    /* renamed from: p */
    public final Object[] mo72382p(int i, int i2, Object[] objArr) {
        int i3 = 0;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f43615i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long o = mo72381o();
            while (i3 < i) {
                int i4 = i3 + 1;
                int i5 = (int) (((long) i3) + o);
                objArr2[i5 & (i2 - 1)] = objArr[(objArr.length - 1) & i5];
                i3 = i4;
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: q */
    public final boolean mo72383q(T t) {
        if (this.f43588c == 0) {
            if (this.f43612f != 0) {
                mo72379m(t);
                int i = this.f43618l + 1;
                this.f43618l = i;
                if (i > this.f43612f) {
                    mo72378l();
                }
                this.f43617k = mo72381o() + ((long) this.f43618l);
            }
            return true;
        }
        if (this.f43618l >= this.f43613g && this.f43617k <= this.f43616j) {
            int i2 = C19673b.f43624a[this.f43614h.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        mo72379m(t);
        int i3 = this.f43618l + 1;
        this.f43618l = i3;
        if (i3 > this.f43613g) {
            mo72378l();
        }
        long o = mo72381o() + ((long) this.f43618l);
        long j = this.f43616j;
        if (((int) (o - j)) > this.f43612f) {
            mo72386t(j + 1, this.f43617k, mo72381o() + ((long) this.f43618l), mo72381o() + ((long) this.f43618l) + ((long) this.f43619m));
        }
        return true;
    }

    /* renamed from: r */
    public final long mo72384r(C19676t1 t1Var) {
        long j = t1Var.f43625a;
        if (j < mo72381o() + ((long) this.f43618l)) {
            return j;
        }
        if (this.f43613g <= 0 && j <= mo72381o() && this.f43619m != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: s */
    public final Object mo72385s(C19676t1 t1Var) {
        Object obj;
        C19340c[] cVarArr = C19421p.f43321k;
        synchronized (this) {
            long r = mo72384r(t1Var);
            if (r < 0) {
                obj = C19680v.f43629a;
            } else {
                long j = t1Var.f43625a;
                Object[] objArr = this.f43615i;
                C19383o.m32794d(objArr);
                Object obj2 = objArr[((int) r) & (objArr.length - 1)];
                if (obj2 instanceof C19672a) {
                    obj2 = ((C19672a) obj2).f43622d;
                }
                t1Var.f43625a = r + 1;
                Object obj3 = obj2;
                cVarArr = mo72387u(j);
                obj = obj3;
            }
        }
        int i = 0;
        int length = cVarArr.length;
        while (i < length) {
            C19340c cVar = cVarArr[i];
            i++;
            if (cVar != null) {
                cVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
        }
        return obj;
    }

    /* renamed from: t */
    public final void mo72386t(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long min = Math.min(j6, j);
        for (long o = mo72381o(); o < min; o = 1 + o) {
            Object[] objArr = this.f43615i;
            C19383o.m32794d(objArr);
            objArr[((int) o) & (objArr.length - 1)] = null;
        }
        this.f43616j = j5;
        this.f43617k = j6;
        this.f43618l = (int) (j3 - min);
        this.f43619m = (int) (j4 - j3);
    }

    /* renamed from: u */
    public final C19340c<C19394m>[] mo72387u(long j) {
        S[] sArr;
        if (j > this.f43617k) {
            return C19421p.f43321k;
        }
        long o = mo72381o();
        long j2 = ((long) this.f43618l) + o;
        long j3 = 1;
        if (this.f43613g == 0 && this.f43619m > 0) {
            j2++;
        }
        if (!(this.f43588c == 0 || (sArr = this.f43587b) == null)) {
            int length = sArr.length;
            int i = 0;
            while (i < length) {
                S s = sArr[i];
                i++;
                if (s != null) {
                    long j4 = ((C19676t1) s).f43625a;
                    if (j4 >= 0 && j4 < j2) {
                        j2 = j4;
                    }
                }
            }
        }
        if (j2 <= this.f43617k) {
            return C19421p.f43321k;
        }
        long o2 = mo72381o() + ((long) this.f43618l);
        int min = this.f43588c > 0 ? Math.min(this.f43619m, this.f43613g - ((int) (o2 - j2))) : this.f43619m;
        C19340c<C19394m>[] cVarArr = C19421p.f43321k;
        long j5 = ((long) this.f43619m) + o2;
        if (min > 0) {
            cVarArr = new C19340c[min];
            Object[] objArr = this.f43615i;
            C19383o.m32794d(objArr);
            long j6 = o2;
            int i2 = 0;
            while (true) {
                if (o2 >= j5) {
                    o2 = j6;
                    break;
                }
                long j7 = o2 + j3;
                int i3 = (int) o2;
                Object obj = objArr[(objArr.length - 1) & i3];
                C19736t tVar = C19680v.f43629a;
                if (obj == tVar) {
                    long j8 = j6;
                    o2 = j7;
                } else if (obj != null) {
                    C19672a aVar = (C19672a) obj;
                    int i4 = i2 + 1;
                    cVarArr[i2] = aVar.f43623e;
                    objArr[(objArr.length - 1) & i3] = tVar;
                    long j9 = j6;
                    objArr[((int) j9) & (objArr.length - 1)] = aVar.f43622d;
                    long j10 = j9 + 1;
                    if (i4 >= min) {
                        o2 = j10;
                        break;
                    }
                    i2 = i4;
                    j6 = j10;
                    o2 = j7;
                    j3 = 1;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
            }
        }
        int i5 = (int) (o2 - o);
        long j11 = this.f43588c == 0 ? o2 : j2;
        long max = Math.max(this.f43616j, o2 - ((long) Math.min(this.f43612f, i5)));
        if (this.f43613g == 0 && max < j5) {
            Object[] objArr2 = this.f43615i;
            C19383o.m32794d(objArr2);
            if (C19383o.m32792b(objArr2[((int) max) & (objArr2.length - 1)], C19680v.f43629a)) {
                o2++;
                max++;
            }
        }
        mo72386t(max, j11, o2, j5);
        mo72377j();
        return (cVarArr.length == 0) ^ true ? mo72380n(cVarArr) : cVarArr;
    }
}
