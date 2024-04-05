package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.sync.MutexImpl;
import p514bk.C14088a;

/* renamed from: androidx.compose.animation.core.d0 */
public final class C0420d0 {

    /* renamed from: a */
    public final AtomicReference<C0421a> f1105a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    public final MutexImpl f1106b = C14088a.m21779d();

    /* renamed from: androidx.compose.animation.core.d0$a */
    public static final class C0421a {

        /* renamed from: a */
        public final MutatePriority f1107a;

        /* renamed from: b */
        public final C19699g1 f1108b;

        public C0421a(MutatePriority mutatePriority, C19699g1 g1Var) {
            C19383o.m32797g(mutatePriority, "priority");
            this.f1107a = mutatePriority;
            this.f1108b = g1Var;
        }
    }

    /* renamed from: a */
    public static final void m1124a(C0420d0 d0Var, C0421a aVar) {
        C0421a aVar2;
        boolean z;
        do {
            aVar2 = d0Var.f1105a.get();
            z = false;
            if (aVar2 != null) {
                if (!(aVar.f1107a.compareTo(aVar2.f1107a) >= 0)) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
            AtomicReference<C0421a> atomicReference = d0Var.f1105a;
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
            aVar2.f1108b.mo72134a((CancellationException) null);
        }
    }
}
