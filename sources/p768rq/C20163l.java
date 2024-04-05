package p768rq;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: rq.l */
public final class C20163l {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44650b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44651c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44652d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44653e;

    /* renamed from: a */
    public final AtomicReferenceArray<C20157f> f44654a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C20163l> cls = C20163l.class;
        f44650b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f44651c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f44652d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f44653e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: a */
    public final C20157f mo74407a(C20157f fVar, boolean z) {
        if (z) {
            return mo74408b(fVar);
        }
        C20157f fVar2 = (C20157f) f44650b.getAndSet(this, fVar);
        if (fVar2 == null) {
            return null;
        }
        return mo74408b(fVar2);
    }

    /* renamed from: b */
    public final C20157f mo74408b(C20157f fVar) {
        boolean z = true;
        if (fVar.f44639c.mo74404b() != 1) {
            z = false;
        }
        if (z) {
            f44653e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return fVar;
        }
        int i = this.producerIndex & 127;
        while (this.f44654a.get(i) != null) {
            Thread.yield();
        }
        this.f44654a.lazySet(i, fVar);
        f44651c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final int mo74409c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* renamed from: d */
    public final C20157f mo74410d() {
        C20157f andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f44652d.compareAndSet(this, i, i + 1) && (andSet = this.f44654a.getAndSet(i2, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f44639c.mo74404b() != 1) {
                    z = false;
                }
                if (z) {
                    f44653e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: e */
    public final long mo74411e(C20163l lVar) {
        int i = lVar.consumerIndex;
        int i2 = lVar.producerIndex;
        AtomicReferenceArray<C20157f> atomicReferenceArray = lVar.f44654a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            C20157f fVar = atomicReferenceArray.get(i3);
            if (fVar != null) {
                if (fVar.f44639c.mo74404b() == 1) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, fVar, (Object) null)) {
                            if (atomicReferenceArray.get(i3) != fVar) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        f44653e.decrementAndGet(lVar);
                        mo74407a(fVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return mo74412f(lVar, true);
    }

    /* renamed from: f */
    public final long mo74412f(C20163l lVar, boolean z) {
        C20157f fVar;
        boolean z2;
        do {
            fVar = (C20157f) lVar.lastScheduledTask;
            if (fVar != null) {
                z2 = true;
                if (z) {
                    if (!(fVar.f44639c.mo74404b() == 1)) {
                        return -2;
                    }
                }
                C20161j.f44646e.getClass();
                long nanoTime = System.nanoTime() - fVar.f44638b;
                long j = C20161j.f44642a;
                if (nanoTime >= j) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44650b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(lVar, fVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != fVar) {
                                z2 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z2);
        mo74407a(fVar, false);
        return -1;
    }
}
