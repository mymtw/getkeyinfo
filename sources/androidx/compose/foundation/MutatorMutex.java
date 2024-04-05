package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.sync.MutexImpl;
import p514bk.C14088a;
import p753kq.C19861p;

public final class MutatorMutex {

    /* renamed from: a */
    public final AtomicReference<C0540a> f1272a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    public final MutexImpl f1273b = C14088a.m21779d();

    /* renamed from: androidx.compose.foundation.MutatorMutex$a */
    public static final class C0540a {

        /* renamed from: a */
        public final MutatePriority f1274a;

        /* renamed from: b */
        public final C19699g1 f1275b;

        public C0540a(MutatePriority mutatePriority, C19699g1 g1Var) {
            C19383o.m32797g(mutatePriority, "priority");
            this.f1274a = mutatePriority;
            this.f1275b = g1Var;
        }
    }

    /* renamed from: a */
    public static final void m1311a(MutatorMutex mutatorMutex, C0540a aVar) {
        C0540a aVar2;
        boolean z;
        do {
            aVar2 = mutatorMutex.f1272a.get();
            z = false;
            if (aVar2 != null) {
                if (!(aVar.f1274a.compareTo(aVar2.f1274a) >= 0)) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
            AtomicReference<C0540a> atomicReference = mutatorMutex.f1272a;
            while (true) {
                if (!atomicReference.compareAndSet(aVar2, aVar)) {
                    if (atomicReference.get() != aVar2) {
                        continue;
                        break;
                    }
                } else {
                    z = true;
                    continue;
                    break;
                }
            }
        } while (!z);
        if (aVar2 != null) {
            aVar2.f1275b.mo72134a((CancellationException) null);
        }
    }

    /* renamed from: b */
    public final <T, R> Object mo3680b(T t, MutatePriority mutatePriority, C19861p<? super T, ? super C19340c<? super R>, ? extends Object> pVar, C19340c<? super R> cVar) {
        return C19697g.m33466d(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t, (C19340c<? super MutatorMutex$mutateWith$2>) null), cVar);
    }
}
