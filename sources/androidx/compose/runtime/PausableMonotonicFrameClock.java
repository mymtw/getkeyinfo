package androidx.compose.runtime;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class PausableMonotonicFrameClock implements C1321f0 {

    /* renamed from: b */
    public final C1321f0 f2769b;

    /* renamed from: c */
    public final C1300c0 f2770c = new C1300c0();

    public PausableMonotonicFrameClock(C1321f0 f0Var) {
        this.f2769b = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:33:0x008b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> java.lang.Object mo5381Q(p753kq.C19857l<? super java.lang.Long, ? extends R> r7, kotlin.coroutines.C19340c<? super R> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x008e
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.L$1
            kq.l r7 = (p753kq.C19857l) r7
            java.lang.Object r2 = r0.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x007e
        L_0x003e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            androidx.compose.runtime.c0 r8 = r6.f2770c
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r8.f2816a
            monitor-enter(r2)
            boolean r5 = r8.f2819d     // Catch:{ all -> 0x0092 }
            monitor-exit(r2)
            if (r5 == 0) goto L_0x0054
            kotlin.m r8 = kotlin.C19394m.f43287a
            goto L_0x007a
        L_0x0054:
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l
            kotlin.coroutines.c r5 = kotlin.jvm.internal.C19388s.m32873m0(r0)
            r2.<init>(r4, r5)
            r2.mo72548n()
            java.lang.Object r4 = r8.f2816a
            monitor-enter(r4)
            java.util.List<kotlin.coroutines.c<kotlin.m>> r5 = r8.f2817b     // Catch:{ all -> 0x008f }
            r5.add(r2)     // Catch:{ all -> 0x008f }
            monitor-exit(r4)
            androidx.compose.runtime.Latch$await$2$2 r4 = new androidx.compose.runtime.Latch$await$2$2
            r4.<init>(r8, r2)
            r2.mo72497O(r4)
            java.lang.Object r8 = r2.mo72547l()
            if (r8 != r1) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            kotlin.m r8 = kotlin.C19394m.f43287a
        L_0x007a:
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r2 = r6
        L_0x007e:
            androidx.compose.runtime.f0 r8 = r2.f2769b
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.mo5381Q(r7, r0)
            if (r8 != r1) goto L_0x008e
            return r1
        L_0x008e:
            return r8
        L_0x008f:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L_0x0092:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.mo5381Q(kq.l, kotlin.coroutines.c):java.lang.Object");
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }
}
