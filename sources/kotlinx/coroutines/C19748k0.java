package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C19733q;

/* renamed from: kotlinx.coroutines.k0 */
public final class C19748k0<T> extends C19733q<T> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43699e = AtomicIntegerFieldUpdater.newUpdater(C19748k0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C19748k0(C19340c cVar, CoroutineContext coroutineContext) {
        super(cVar, coroutineContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72093B0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f43699e
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            kotlin.coroutines.c<T> r0 = r4.f43683d
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)
            java.lang.Object r5 = kotlin.jvm.internal.C19388s.m32884s0(r5)
            r1 = 0
            kotlin.jvm.internal.C19382n.m32784z0(r1, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19748k0.mo72093B0(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72505E0() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f43699e
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.mo72521h0()
            java.lang.Object r0 = p514bk.C14088a.m21796y(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.C19830v
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            kotlinx.coroutines.v r0 = (kotlinx.coroutines.C19830v) r0
            java.lang.Throwable r0 = r0.f43842a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19748k0.mo72505E0():java.lang.Object");
    }

    /* renamed from: H */
    public final void mo72252H(Object obj) {
        mo72093B0(obj);
    }
}
