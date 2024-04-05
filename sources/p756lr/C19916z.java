package p756lr;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.z */
public final class C19916z {

    /* renamed from: a */
    public static final C19915y f43927a = new C19915y(new byte[0], 0, 0, false);

    /* renamed from: b */
    public static final int f43928b;

    /* renamed from: c */
    public static final AtomicReference<C19915y>[] f43929c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f43928b = highestOneBit;
        AtomicReference<C19915y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f43929c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m34045a(C19915y yVar) {
        boolean z = true;
        if (!(yVar.f43925f == null && yVar.f43926g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!yVar.f43923d) {
            Thread currentThread = Thread.currentThread();
            C19383o.m32796f(currentThread, "Thread.currentThread()");
            AtomicReference<C19915y> atomicReference = f43929c[(int) (currentThread.getId() & (((long) f43928b) - 1))];
            C19915y yVar2 = atomicReference.get();
            if (yVar2 != f43927a) {
                int i = yVar2 != null ? yVar2.f43922c : 0;
                if (i < 65536) {
                    yVar.f43925f = yVar2;
                    yVar.f43921b = 0;
                    yVar.f43922c = i + 8192;
                    while (true) {
                        if (!atomicReference.compareAndSet(yVar2, yVar)) {
                            if (atomicReference.get() != yVar2) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!z) {
                        yVar.f43925f = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final C19915y m34046b() {
        Thread currentThread = Thread.currentThread();
        C19383o.m32796f(currentThread, "Thread.currentThread()");
        AtomicReference<C19915y> atomicReference = f43929c[(int) (currentThread.getId() & (((long) f43928b) - 1))];
        C19915y yVar = f43927a;
        C19915y andSet = atomicReference.getAndSet(yVar);
        if (andSet == yVar) {
            return new C19915y();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new C19915y();
        }
        atomicReference.set(andSet.f43925f);
        andSet.f43925f = null;
        andSet.f43922c = 0;
        return andSet;
    }
}
