package kotlinx.coroutines.scheduling;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.session.C0087d;
import android.support.p013v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.api.Api;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.random.Random;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.internal.C19732p;
import kotlinx.coroutines.internal.C19736t;
import p768rq.C20154c;
import p768rq.C20157f;
import p768rq.C20158g;
import p768rq.C20160i;
import p768rq.C20161j;
import p768rq.C20163l;

public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f43760i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f43761j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43762k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* renamed from: l */
    public static final C19736t f43763l = new C19736t("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: b */
    public final int f43764b;

    /* renamed from: c */
    public final int f43765c;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final long f43766d;

    /* renamed from: e */
    public final String f43767e;

    /* renamed from: f */
    public final C20154c f43768f;

    /* renamed from: g */
    public final C20154c f43769g;

    /* renamed from: h */
    public final C19732p<C19796b> f43770h;
    private volatile /* synthetic */ long parkedWorkersStack;

    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public /* synthetic */ class C19795a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43771a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f43771a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public final class C19796b extends Thread {

        /* renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f43772i = AtomicIntegerFieldUpdater.newUpdater(C19796b.class, "workerCtl");

        /* renamed from: b */
        public final C20163l f43773b;

        /* renamed from: c */
        public WorkerState f43774c;

        /* renamed from: d */
        public long f43775d;

        /* renamed from: e */
        public long f43776e;

        /* renamed from: f */
        public int f43777f;

        /* renamed from: g */
        public boolean f43778g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public C19796b() {
            throw null;
        }

        public C19796b(int i) {
            CoroutineScheduler.this = CoroutineScheduler.this;
            setDaemon(true);
            this.f43773b = new C20163l();
            this.f43774c = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f43763l;
            this.f43777f = Random.Default.nextInt();
            mo72623f(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: rq.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: rq.f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p768rq.C20157f mo72618a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.f43774c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x0009
                goto L_0x0032
            L_0x0009:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            L_0x000b:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L_0x001b
                r0 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.f43761j
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto L_0x000b
                r0 = r3
            L_0x002c:
                if (r0 == 0) goto L_0x0034
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.f43774c = r0
            L_0x0032:
                r0 = r3
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                r1 = 0
                if (r0 == 0) goto L_0x007b
                if (r11 == 0) goto L_0x0070
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.f43764b
                int r11 = r11 * 2
                int r11 = r10.mo72621d(r11)
                if (r11 != 0) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r3 = r2
            L_0x0048:
                if (r3 == 0) goto L_0x0050
                rq.f r11 = r10.mo72622e()
                if (r11 != 0) goto L_0x007a
            L_0x0050:
                rq.l r11 = r10.f43773b
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p768rq.C20163l.f44650b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                rq.f r0 = (p768rq.C20157f) r0
                if (r0 != 0) goto L_0x0064
                rq.f r11 = r11.mo74410d()
                goto L_0x0065
            L_0x0064:
                r11 = r0
            L_0x0065:
                if (r11 != 0) goto L_0x007a
                if (r3 != 0) goto L_0x0076
                rq.f r11 = r10.mo72622e()
                if (r11 != 0) goto L_0x007a
                goto L_0x0076
            L_0x0070:
                rq.f r11 = r10.mo72622e()
                if (r11 != 0) goto L_0x007a
            L_0x0076:
                rq.f r11 = r10.mo72626i(r2)
            L_0x007a:
                return r11
            L_0x007b:
                if (r11 == 0) goto L_0x009e
                rq.l r11 = r10.f43773b
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p768rq.C20163l.f44650b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                rq.f r0 = (p768rq.C20157f) r0
                if (r0 != 0) goto L_0x0090
                rq.f r0 = r11.mo74410d()
            L_0x0090:
                if (r0 != 0) goto L_0x00a9
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                rq.c r11 = r11.f43769g
                java.lang.Object r11 = r11.mo72465d()
                r0 = r11
                rq.f r0 = (p768rq.C20157f) r0
                goto L_0x00a9
            L_0x009e:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                rq.c r11 = r11.f43769g
                java.lang.Object r11 = r11.mo72465d()
                r0 = r11
                rq.f r0 = (p768rq.C20157f) r0
            L_0x00a9:
                if (r0 != 0) goto L_0x00af
                rq.f r0 = r10.mo72626i(r3)
            L_0x00af:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.C19796b.mo72618a(boolean):rq.f");
        }

        /* renamed from: b */
        public final int mo72619b() {
            return this.indexInArray;
        }

        /* renamed from: c */
        public final Object mo72620c() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int mo72621d(int i) {
            int i2 = this.f43777f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f43777f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
        }

        /* renamed from: e */
        public final C20157f mo72622e() {
            if (mo72621d(2) == 0) {
                C20157f fVar = (C20157f) CoroutineScheduler.this.f43768f.mo72465d();
                return fVar == null ? (C20157f) CoroutineScheduler.this.f43769g.mo72465d() : fVar;
            }
            C20157f fVar2 = (C20157f) CoroutineScheduler.this.f43769g.mo72465d();
            return fVar2 == null ? (C20157f) CoroutineScheduler.this.f43768f.mo72465d() : fVar2;
        }

        /* renamed from: f */
        public final void mo72623f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f43767e);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: g */
        public final void mo72624g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean mo72625h(WorkerState workerState) {
            WorkerState workerState2 = this.f43774c;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.f43761j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f43774c = workerState;
            }
            return z;
        }

        /* renamed from: i */
        public final C20157f mo72626i(boolean z) {
            long j;
            int i = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d = mo72621d(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i2 = 0;
            long j2 = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                d++;
                if (d > i) {
                    d = 1;
                }
                C19796b b = coroutineScheduler.f43770h.mo72475b(d);
                if (!(b == null || b == this)) {
                    if (z) {
                        j = this.f43773b.mo74411e(b.f43773b);
                    } else {
                        C20163l lVar = this.f43773b;
                        C20163l lVar2 = b.f43773b;
                        lVar.getClass();
                        C20157f d2 = lVar2.mo74410d();
                        if (d2 != null) {
                            lVar.mo74407a(d2, false);
                            j = -1;
                        } else {
                            j = lVar.mo74412f(lVar2, false);
                        }
                    }
                    if (j == -1) {
                        C20163l lVar3 = this.f43773b;
                        lVar3.getClass();
                        C20157f fVar = (C20157f) C20163l.f44650b.getAndSet(lVar3, (Object) null);
                        return fVar == null ? lVar3.mo74410d() : fVar;
                    } else if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f43776e = j2;
            return null;
        }

        public final void run() {
            WorkerState workerState;
            WorkerState workerState2;
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f43774c != (workerState = WorkerState.TERMINATED)) {
                    C20157f a = mo72618a(this.f43778g);
                    if (a == null) {
                        this.f43778g = false;
                        if (this.f43776e == 0) {
                            if (this.nextParkedWorker != CoroutineScheduler.f43763l) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != CoroutineScheduler.f43763l) || this.workerCtl != -1 || CoroutineScheduler.this.isTerminated() || this.f43774c == (workerState2 = WorkerState.TERMINATED)) {
                                        break;
                                    }
                                    mo72625h(WorkerState.PARKING);
                                    Thread.interrupted();
                                    if (this.f43775d == 0) {
                                        this.f43775d = System.nanoTime() + CoroutineScheduler.this.f43766d;
                                    }
                                    LockSupport.parkNanos(CoroutineScheduler.this.f43766d);
                                    if (System.nanoTime() - this.f43775d >= 0) {
                                        this.f43775d = 0;
                                        CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                                        synchronized (coroutineScheduler.f43770h) {
                                            if (!coroutineScheduler.isTerminated()) {
                                                if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.f43764b) {
                                                    if (f43772i.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        mo72623f(0);
                                                        coroutineScheduler.mo72612e(this, i, 0);
                                                        int andDecrement = (int) (CoroutineScheduler.f43761j.getAndDecrement(coroutineScheduler) & 2097151);
                                                        if (andDecrement != i) {
                                                            C19796b b = coroutineScheduler.f43770h.mo72475b(andDecrement);
                                                            C19383o.m32794d(b);
                                                            C19796b bVar = b;
                                                            coroutineScheduler.f43770h.mo72476c(i, bVar);
                                                            bVar.mo72623f(i);
                                                            coroutineScheduler.mo72612e(bVar, andDecrement, i);
                                                        }
                                                        coroutineScheduler.f43770h.mo72476c(andDecrement, (C19796b) null);
                                                        C19394m mVar = C19394m.f43287a;
                                                        this.f43774c = workerState2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler.this.mo72611d(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            mo72625h(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f43776e);
                            this.f43776e = 0;
                        }
                    } else {
                        this.f43776e = 0;
                        int b2 = a.f44639c.mo74404b();
                        this.f43775d = 0;
                        if (this.f43774c == WorkerState.PARKING) {
                            this.f43774c = WorkerState.BLOCKING;
                        }
                        if (b2 != 0 && mo72625h(WorkerState.BLOCKING)) {
                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                            if (!coroutineScheduler2.mo72615g() && !coroutineScheduler2.mo72614f(coroutineScheduler2.controlState)) {
                                coroutineScheduler2.mo72615g();
                            }
                        }
                        CoroutineScheduler.this.getClass();
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (b2 != 0) {
                            CoroutineScheduler.f43761j.addAndGet(CoroutineScheduler.this, -2097152);
                            if (this.f43774c != workerState) {
                                this.f43774c = WorkerState.DORMANT;
                            }
                        }
                    }
                }
            }
            mo72625h(WorkerState.TERMINATED);
            return;
        }
    }

    public CoroutineScheduler(int i, long j, String str, int i2) {
        this.f43764b = i;
        this.f43765c = i2;
        this.f43766d = j;
        this.f43767e = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f43768f = new C20154c();
                        this.f43769g = new C20154c();
                        this.parkedWorkersStack = 0;
                        this.f43770h = new C19732p<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(C0069a.m175f("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(C0087d.m235e("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(C0069a.m175f("Core pool size ", i, " should be at least 1").toString());
    }

    /* renamed from: a */
    public final int mo72608a() {
        synchronized (this.f43770h) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z = false;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f43764b) {
                return 0;
            }
            if (i >= this.f43765c) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.f43770h.mo72475b(i3) == null) {
                C19796b bVar = new C19796b(i3);
                this.f43770h.mo72476c(i3, bVar);
                if (i3 == ((int) (2097151 & f43761j.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    bVar.start();
                    int i4 = i2 + 1;
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: b */
    public final void mo72609b(Runnable runnable, C20158g gVar, boolean z) {
        C20157f fVar;
        C20157f fVar2;
        C20161j.f44646e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof C20157f) {
            fVar = (C20157f) runnable;
            fVar.f44638b = nanoTime;
            fVar.f44639c = gVar;
        } else {
            fVar = new C20160i(runnable, nanoTime, gVar);
        }
        Thread currentThread = Thread.currentThread();
        C19796b bVar = null;
        C19796b bVar2 = currentThread instanceof C19796b ? (C19796b) currentThread : null;
        if (bVar2 != null && C19383o.m32792b(CoroutineScheduler.this, this)) {
            bVar = bVar2;
        }
        boolean z2 = true;
        if (bVar == null || bVar.f43774c == WorkerState.TERMINATED || (fVar.f44639c.mo74404b() == 0 && bVar.f43774c == WorkerState.BLOCKING)) {
            fVar2 = fVar;
        } else {
            bVar.f43778g = true;
            fVar2 = bVar.f43773b.mo74407a(fVar, z);
        }
        if (fVar2 != null) {
            if (!(fVar2.f44639c.mo74404b() == 1 ? this.f43769g.mo72462a(fVar2) : this.f43768f.mo72462a(fVar2))) {
                throw new RejectedExecutionException(C19383o.m32802l(" was terminated", this.f43767e));
            }
        }
        if (!z || bVar == null) {
            z2 = false;
        }
        if (fVar.f44639c.mo74404b() != 0) {
            long addAndGet = f43761j.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
            if (!z2 && !mo72615g() && !mo72614f(addAndGet)) {
                mo72615g();
            }
        } else if (!z2 && !mo72615g() && !mo72614f(this.controlState)) {
            mo72615g();
        }
    }

    public final void close() {
        int i;
        boolean z;
        if (f43762k.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            C19796b bVar = currentThread instanceof C19796b ? (C19796b) currentThread : null;
            if (bVar == null || !C19383o.m32792b(CoroutineScheduler.this, this)) {
                bVar = null;
            }
            synchronized (this.f43770h) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C19796b b = this.f43770h.mo72475b(i2);
                    C19383o.m32794d(b);
                    C19796b bVar2 = b;
                    if (bVar2 != bVar) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION);
                        }
                        C20163l lVar = bVar2.f43773b;
                        C20154c cVar = this.f43769g;
                        lVar.getClass();
                        C20157f fVar = (C20157f) C20163l.f44650b.getAndSet(lVar, (Object) null);
                        if (fVar != null) {
                            cVar.mo72462a(fVar);
                        }
                        do {
                            C20157f d = lVar.mo74410d();
                            if (d == null) {
                                z = false;
                                continue;
                            } else {
                                cVar.mo72462a(d);
                                z = true;
                                continue;
                            }
                        } while (z);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f43769g.mo72463b();
            this.f43768f.mo72463b();
            while (true) {
                C20157f a = bVar == null ? null : bVar.mo72618a(true);
                if (a == null && (a = (C20157f) this.f43768f.mo72465d()) == null && (a = (C20157f) this.f43769g.mo72465d()) == null) {
                    if (bVar != null) {
                        bVar.mo72625h(WorkerState.TERMINATED);
                    }
                    this.parkedWorkersStack = 0;
                    this.controlState = 0;
                    return;
                }
                try {
                    a.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo72611d(C19796b bVar) {
        long j;
        long j2;
        if (bVar.mo72620c() == f43763l) {
            do {
                j = this.parkedWorkersStack;
                int b = bVar.mo72619b();
                bVar.mo72624g(this.f43770h.mo72475b((int) (2097151 & j)));
                j2 = (long) b;
            } while (!f43760i.compareAndSet(this, j, j2 | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152)));
        }
    }

    /* renamed from: e */
    public final void mo72612e(C19796b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = bVar.mo72620c();
                    while (true) {
                        if (c == f43763l) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            C19796b bVar2 = (C19796b) c;
                            int b = bVar2.mo72619b();
                            if (b != 0) {
                                i3 = b;
                                break;
                            }
                            c = bVar2.mo72620c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f43760i.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        mo72609b(runnable, C20161j.f44647f, false);
    }

    /* renamed from: f */
    public final boolean mo72614f(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f43764b) {
            int a = mo72608a();
            if (a == 1 && this.f43764b > 1) {
                mo72608a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo72615g() {
        C19736t tVar;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C19796b b = this.f43770h.mo72475b((int) (2097151 & j));
            if (b == null) {
                b = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
                Object c = b.mo72620c();
                while (true) {
                    tVar = f43763l;
                    if (c == tVar) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        C19796b bVar = (C19796b) c;
                        i = bVar.mo72619b();
                        if (i != 0) {
                            break;
                        }
                        c = bVar.mo72620c();
                    }
                }
                if (i < 0) {
                    continue;
                } else {
                    if (f43760i.compareAndSet(this, j, ((long) i) | j2)) {
                        b.mo72624g(tVar);
                    } else {
                        continue;
                    }
                }
            }
            if (b == null) {
                return false;
            }
            if (C19796b.f43772i.compareAndSet(b, -1, 0)) {
                LockSupport.unpark(b);
                return true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f43770h.mo72474a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            C19796b b = this.f43770h.mo72475b(i6);
            if (b != null) {
                int c = b.f43773b.mo74409c();
                int i8 = C19795a.f43771a[b.f43774c.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i5++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f43767e + '@' + C19543e0.m33300R(this) + "[Pool Size {core = " + this.f43764b + ", max = " + this.f43765c + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f43768f.mo72464c() + ", global blocking queue size = " + this.f43769g.mo72464c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f43764b - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
