package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19744j0;
import kotlinx.coroutines.internal.C19716a;
import kotlinx.coroutines.internal.C19726k;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.C19740x;
import kotlinx.coroutines.internal.C19741y;
import p001a0.C0005b;
import p003a2.C0015b;

/* renamed from: kotlinx.coroutines.u0 */
public abstract class C19824u0 extends C19831v0 implements C19744j0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43831g;

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43832h;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: kotlinx.coroutines.u0$a */
    public final class C19825a extends C19827c {

        /* renamed from: e */
        public final C19747k<C19394m> f43833e;

        public C19825a(long j, C19753l lVar) {
            super(j);
            this.f43833e = lVar;
        }

        public final void run() {
            this.f43833e.mo72504z(C19824u0.this, C19394m.f43287a);
        }

        public final String toString() {
            return C19383o.m32802l(this.f43833e, super.toString());
        }
    }

    /* renamed from: kotlinx.coroutines.u0$b */
    public static final class C19826b extends C19827c {

        /* renamed from: e */
        public final Runnable f43835e;

        public C19826b(Runnable runnable, long j) {
            super(j);
            this.f43835e = runnable;
        }

        public final void run() {
            this.f43835e.run();
        }

        public final String toString() {
            return C19383o.m32802l(this.f43835e, super.toString());
        }
    }

    /* renamed from: kotlinx.coroutines.u0$c */
    public static abstract class C19827c implements Runnable, Comparable<C19827c>, C19766p0, C19741y {

        /* renamed from: b */
        public long f43836b;

        /* renamed from: c */
        public Object f43837c;

        /* renamed from: d */
        public int f43838d = -1;

        public C19827c(long j) {
            this.f43836b = j;
        }

        /* renamed from: a */
        public final void mo72492a(C19828d dVar) {
            if (this.f43837c != C0005b.f15m) {
                this.f43837c = dVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final int compareTo(Object obj) {
            int i = ((this.f43836b - ((C19827c) obj).f43836b) > 0 ? 1 : ((this.f43836b - ((C19827c) obj).f43836b) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.internal.x} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void dispose() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5.f43837c     // Catch:{ all -> 0x0031 }
                kotlinx.coroutines.internal.t r1 = p001a0.C0005b.f15m     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof kotlinx.coroutines.C19824u0.C19828d     // Catch:{ all -> 0x0031 }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                kotlinx.coroutines.u0$d r0 = (kotlinx.coroutines.C19824u0.C19828d) r0     // Catch:{ all -> 0x0031 }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 != 0) goto L_0x0015
                goto L_0x002b
            L_0x0015:
                monitor-enter(r0)     // Catch:{ all -> 0x0031 }
                java.lang.Object r2 = r5.f43837c     // Catch:{ all -> 0x0020 }
                boolean r4 = r2 instanceof kotlinx.coroutines.internal.C19740x     // Catch:{ all -> 0x0020 }
                if (r4 == 0) goto L_0x0022
                r3 = r2
                kotlinx.coroutines.internal.x r3 = (kotlinx.coroutines.internal.C19740x) r3     // Catch:{ all -> 0x0020 }
                goto L_0x0022
            L_0x0020:
                r1 = move-exception
                goto L_0x002f
            L_0x0022:
                if (r3 != 0) goto L_0x0025
                goto L_0x002a
            L_0x0025:
                int r2 = r5.f43838d     // Catch:{ all -> 0x0020 }
                r0.mo72488c(r2)     // Catch:{ all -> 0x0020 }
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            L_0x002b:
                r5.f43837c = r1     // Catch:{ all -> 0x0031 }
                monitor-exit(r5)
                return
            L_0x002f:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x0031:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19824u0.C19827c.dispose():void");
        }

        public final void setIndex(int i) {
            this.f43838d = i;
        }

        public String toString() {
            return C0015b.m91j(C0072d.m201h("Delayed[nanos="), this.f43836b, ']');
        }
    }

    /* renamed from: kotlinx.coroutines.u0$d */
    public static final class C19828d extends C19740x<C19827c> {

        /* renamed from: b */
        public long f43839b;

        public C19828d(long j) {
            this.f43839b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C19824u0> cls2 = C19824u0.class;
        f43831g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f43832h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        mo72256M0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x007f A[EDGE_INSN: B:100:0x007f->B:48:0x007f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[LOOP:2: B:42:0x006d->B:45:0x0078, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b9  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo72661I0() {
        /*
            r11 = this;
            boolean r0 = r11.mo72662J0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            kotlinx.coroutines.u0$d r0 = (kotlinx.coroutines.C19824u0.C19828d) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0050
            boolean r6 = r0.mo72487b()
            if (r6 != 0) goto L_0x0050
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            T[] r8 = r0.f43693a     // Catch:{ all -> 0x004d }
            if (r8 != 0) goto L_0x0023
            r8 = r4
            goto L_0x0025
        L_0x0023:
            r8 = r8[r5]     // Catch:{ all -> 0x004d }
        L_0x0025:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r0)
            r8 = r4
            goto L_0x0048
        L_0x002a:
            kotlinx.coroutines.u0$c r8 = (kotlinx.coroutines.C19824u0.C19827c) r8     // Catch:{ all -> 0x004d }
            long r9 = r8.f43836b     // Catch:{ all -> 0x004d }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0036
            r9 = r3
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            if (r9 == 0) goto L_0x003e
            boolean r8 = r11.mo72667N0(r8)     // Catch:{ all -> 0x004d }
            goto L_0x003f
        L_0x003e:
            r8 = r5
        L_0x003f:
            if (r8 == 0) goto L_0x0046
            kotlinx.coroutines.internal.y r8 = r0.mo72488c(r5)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x0046:
            r8 = r4
        L_0x0047:
            monitor-exit(r0)
        L_0x0048:
            kotlinx.coroutines.u0$c r8 = (kotlinx.coroutines.C19824u0.C19827c) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x0050
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0050:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0055
            goto L_0x007f
        L_0x0055:
            boolean r6 = r0 instanceof kotlinx.coroutines.internal.C19726k
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlinx.coroutines.internal.k r6 = (kotlinx.coroutines.internal.C19726k) r6
            java.lang.Object r7 = r6.mo72471f()
            kotlinx.coroutines.internal.t r8 = kotlinx.coroutines.internal.C19726k.f43675g
            if (r7 == r8) goto L_0x0067
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0097
        L_0x0067:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f43831g
            kotlinx.coroutines.internal.k r6 = r6.mo72470e()
        L_0x006d:
            boolean r8 = r7.compareAndSet(r11, r0, r6)
            if (r8 == 0) goto L_0x0074
            goto L_0x0050
        L_0x0074:
            java.lang.Object r8 = r7.get(r11)
            if (r8 == r0) goto L_0x006d
            goto L_0x0050
        L_0x007b:
            kotlinx.coroutines.internal.t r6 = p001a0.C0005b.f16n
            if (r0 != r6) goto L_0x0081
        L_0x007f:
            r7 = r4
            goto L_0x0097
        L_0x0081:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f43831g
        L_0x0083:
            boolean r7 = r6.compareAndSet(r11, r0, r4)
            if (r7 == 0) goto L_0x008b
            r6 = r3
            goto L_0x0092
        L_0x008b:
            java.lang.Object r7 = r6.get(r11)
            if (r7 == r0) goto L_0x0083
            r6 = r5
        L_0x0092:
            if (r6 == 0) goto L_0x0050
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0097:
            if (r7 == 0) goto L_0x009d
            r7.run()
            return r1
        L_0x009d:
            kotlinx.coroutines.internal.a<kotlinx.coroutines.l0<?>> r0 = r11.f43824e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b1
        L_0x00a7:
            int r8 = r0.f43654b
            int r0 = r0.f43655c
            if (r8 != r0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = r5
        L_0x00af:
            if (r3 == 0) goto L_0x00b3
        L_0x00b1:
            r8 = r6
            goto L_0x00b4
        L_0x00b3:
            r8 = r1
        L_0x00b4:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            goto L_0x00f6
        L_0x00b9:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00be
            goto L_0x00cb
        L_0x00be:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.C19726k
            if (r3 == 0) goto L_0x00f1
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.C19726k) r0
            boolean r0 = r0.mo72469d()
            if (r0 != 0) goto L_0x00cb
            goto L_0x00f6
        L_0x00cb:
            java.lang.Object r0 = r11._delayed
            kotlinx.coroutines.u0$d r0 = (kotlinx.coroutines.C19824u0.C19828d) r0
            if (r0 != 0) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            monitor-enter(r0)
            T[] r3 = r0.f43693a     // Catch:{ all -> 0x00ee }
            if (r3 != 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r4 = r3[r5]     // Catch:{ all -> 0x00ee }
        L_0x00da:
            monitor-exit(r0)
            kotlinx.coroutines.u0$c r4 = (kotlinx.coroutines.C19824u0.C19827c) r4
        L_0x00dd:
            if (r4 != 0) goto L_0x00e0
            goto L_0x00f5
        L_0x00e0:
            long r3 = r4.f43836b
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            goto L_0x00f6
        L_0x00ec:
            r1 = r3
            goto L_0x00f6
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f1:
            kotlinx.coroutines.internal.t r3 = p001a0.C0005b.f16n
            if (r0 != r3) goto L_0x00f6
        L_0x00f5:
            r1 = r6
        L_0x00f6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19824u0.mo72661I0():long");
    }

    /* renamed from: M0 */
    public void mo72256M0(Runnable runnable) {
        if (mo72667N0(runnable)) {
            Thread K0 = mo72254K0();
            if (Thread.currentThread() != K0) {
                LockSupport.unpark(K0);
                return;
            }
            return;
        }
        C19547f0.f43502i.mo72256M0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72667N0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f43831g
            r4 = 0
        L_0x000e:
            boolean r0 = r3.compareAndSet(r6, r4, r7)
            if (r0 == 0) goto L_0x0016
            r2 = r1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000e
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.C19726k
            if (r3 == 0) goto L_0x0048
            r3 = r0
            kotlinx.coroutines.internal.k r3 = (kotlinx.coroutines.internal.C19726k) r3
            int r4 = r3.mo72466a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f43831g
            kotlinx.coroutines.internal.k r3 = r3.mo72470e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            kotlinx.coroutines.internal.t r3 = p001a0.C0005b.f16n
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            kotlinx.coroutines.internal.k r3 = new kotlinx.coroutines.internal.k
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.mo72466a(r4)
            r3.mo72466a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f43831g
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = r1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19824u0.mo72667N0(java.lang.Runnable):boolean");
    }

    /* renamed from: O0 */
    public final boolean mo72668O0() {
        C19716a<C19754l0<?>> aVar = this.f43824e;
        if (!(aVar == null || aVar.f43654b == aVar.f43655c)) {
            return false;
        }
        C19828d dVar = (C19828d) this._delayed;
        if (dVar != null && !dVar.mo72487b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C19726k) {
                return ((C19726k) obj).mo72469d();
            }
            if (obj != C0005b.f16n) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public final void mo72669P0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A[LOOP:0: B:5:0x0016->B:8:0x0021, LOOP_START] */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72670Q0(long r13, kotlinx.coroutines.C19824u0.C19827c r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0009
            goto L_0x0045
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            kotlinx.coroutines.u0$d r0 = (kotlinx.coroutines.C19824u0.C19828d) r0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f43832h
            kotlinx.coroutines.u0$d r6 = new kotlinx.coroutines.u0$d
            r6.<init>(r13)
        L_0x0016:
            boolean r0 = r5.compareAndSet(r12, r1, r6)
            if (r0 == 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L_0x0016
        L_0x0023:
            java.lang.Object r0 = r12._delayed
            kotlin.jvm.internal.C19383o.m32794d(r0)
            kotlinx.coroutines.u0$d r0 = (kotlinx.coroutines.C19824u0.C19828d) r0
        L_0x002a:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f43837c     // Catch:{ all -> 0x00b4 }
            kotlinx.coroutines.internal.t r6 = p001a0.C0005b.f15m     // Catch:{ all -> 0x00b4 }
            if (r5 != r6) goto L_0x0034
            monitor-exit(r15)
            r0 = r3
            goto L_0x0072
        L_0x0034:
            monitor-enter(r0)     // Catch:{ all -> 0x00b4 }
            T[] r5 = r0.f43693a     // Catch:{ all -> 0x00b1 }
            if (r5 != 0) goto L_0x003b
            r5 = r1
            goto L_0x003d
        L_0x003b:
            r5 = r5[r2]     // Catch:{ all -> 0x00b1 }
        L_0x003d:
            kotlinx.coroutines.u0$c r5 = (kotlinx.coroutines.C19824u0.C19827c) r5     // Catch:{ all -> 0x00b1 }
            int r6 = r12._isCompleted     // Catch:{ all -> 0x00b1 }
            if (r6 == 0) goto L_0x0047
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r15)
        L_0x0045:
            r0 = r4
            goto L_0x0072
        L_0x0047:
            r6 = 0
            if (r5 != 0) goto L_0x004e
            r0.f43839b = r13     // Catch:{ all -> 0x00b1 }
            goto L_0x0061
        L_0x004e:
            long r8 = r5.f43836b     // Catch:{ all -> 0x00b1 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0057
            r8 = r13
        L_0x0057:
            long r10 = r0.f43839b     // Catch:{ all -> 0x00b1 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0061
            r0.f43839b = r8     // Catch:{ all -> 0x00b1 }
        L_0x0061:
            long r8 = r15.f43836b     // Catch:{ all -> 0x00b1 }
            long r10 = r0.f43839b     // Catch:{ all -> 0x00b1 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x006c
            r15.f43836b = r10     // Catch:{ all -> 0x00b1 }
        L_0x006c:
            r0.mo72486a(r15)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r15)
            r0 = r2
        L_0x0072:
            if (r0 == 0) goto L_0x0089
            if (r0 == r4) goto L_0x0085
            if (r0 != r3) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected result"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0085:
            r12.mo72255L0(r13, r15)
            goto L_0x00ad
        L_0x0089:
            java.lang.Object r13 = r12._delayed
            kotlinx.coroutines.u0$d r13 = (kotlinx.coroutines.C19824u0.C19828d) r13
            if (r13 != 0) goto L_0x0090
            goto L_0x009b
        L_0x0090:
            monitor-enter(r13)
            T[] r14 = r13.f43693a     // Catch:{ all -> 0x00ae }
            if (r14 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r1 = r14[r2]     // Catch:{ all -> 0x00ae }
        L_0x0098:
            monitor-exit(r13)
            kotlinx.coroutines.u0$c r1 = (kotlinx.coroutines.C19824u0.C19827c) r1
        L_0x009b:
            if (r1 != r15) goto L_0x009e
            r2 = r4
        L_0x009e:
            if (r2 == 0) goto L_0x00ad
            java.lang.Thread r13 = r12.mo72254K0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00ad
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00ad:
            return
        L_0x00ae:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00b1:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            throw r13     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19824u0.mo72670Q0(long, kotlinx.coroutines.u0$c):void");
    }

    /* renamed from: i */
    public C19766p0 mo72115i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return C19744j0.C19745a.m33594a(j, runnable, coroutineContext);
    }

    public void shutdown() {
        ThreadLocal<C19821t0> threadLocal = C19845z1.f43852a;
        C19845z1.f43852a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43831g;
                C19736t tVar = C0005b.f16n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof C19726k) {
                ((C19726k) obj).mo72467b();
                break;
            } else if (obj == C0005b.f16n) {
                break;
            } else {
                C19726k kVar = new C19726k(8, true);
                kVar.mo72466a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43831g;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (mo72661I0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C19828d dVar = (C19828d) this._delayed;
            C19827c cVar = dVar == null ? null : (C19827c) dVar.mo72489d();
            if (cVar != null) {
                mo72255L0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public final void mo72116t(long j, C19753l lVar) {
        long X = C0005b.m30X(j);
        if (X < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C19825a aVar = new C19825a(X + nanoTime, lVar);
            lVar.mo72497O(new C19769q0(aVar));
            mo72670Q0(nanoTime, aVar);
        }
    }
}
