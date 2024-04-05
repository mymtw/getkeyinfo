package kotlinx.coroutines.debug.internal;

import java.lang.ref.Reference;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import p744gq.C19059b;
import p753kq.C19846a;

final class DebugProbesImpl$startWeakRefCleanerThread$1 extends Lambda implements C19846a<C19394m> {
    public static final DebugProbesImpl$startWeakRefCleanerThread$1 INSTANCE = new DebugProbesImpl$startWeakRefCleanerThread$1();

    public DebugProbesImpl$startWeakRefCleanerThread$1() {
        super(0);
    }

    public final void invoke() {
        ConcurrentWeakMap<C19059b, C19535b> concurrentWeakMap = C19536c.f43484d;
        if (concurrentWeakMap.f43461b != null) {
            while (true) {
                try {
                    Reference<? extends K> remove = concurrentWeakMap.f43461b.remove();
                    if (remove != null) {
                        C19539e eVar = (C19539e) remove;
                        ConcurrentWeakMap.C19528a aVar = (ConcurrentWeakMap.C19528a) concurrentWeakMap.core;
                        aVar.getClass();
                        int i = (eVar.f43485a * -1640531527) >>> aVar.f43464b;
                        while (true) {
                            C19539e eVar2 = (C19539e) aVar.f43466d.get(i);
                            if (eVar2 == null) {
                                break;
                            } else if (eVar2 == eVar) {
                                aVar.mo72228c(i);
                                break;
                            } else {
                                if (i == 0) {
                                    i = aVar.f43463a;
                                }
                                i--;
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
    }
}
