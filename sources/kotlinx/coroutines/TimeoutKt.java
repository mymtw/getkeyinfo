package kotlinx.coroutines;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19389t;
import p514bk.C14088a;
import p628nj.C18263b;
import p753kq.C19861p;

public final class TimeoutKt {
    /* renamed from: a */
    public static final <U, T extends U> Object m33070a(C19477b2<U, ? super T> b2Var, C19861p<? super C19525d0, ? super C19340c<? super T>, ? extends Object> pVar) {
        Object obj;
        Object o0;
        b2Var.mo72401k(new C19772r0(C18263b.m30821P(b2Var.f43683d.getContext()).mo72115i(b2Var.f43412e, b2Var, b2Var.f43394c)));
        boolean z = false;
        try {
            C19389t.m32910d(2, pVar);
            obj = pVar.invoke(b2Var, b2Var);
        } catch (Throwable th) {
            obj = new C19830v(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj == coroutineSingletons || (o0 = b2Var.mo72525o0(obj)) == C14088a.f31033n) {
            return coroutineSingletons;
        }
        if (o0 instanceof C19830v) {
            Throwable th2 = ((C19830v) o0).f43842a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != b2Var) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof C19830v) {
                throw ((C19830v) obj).f43842a;
            }
        } else {
            obj = C14088a.m21796y(o0);
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m33071b(long r7, p753kq.C19861p<? super kotlinx.coroutines.C19525d0, ? super kotlin.coroutines.C19340c<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.C19340c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            kq.p r8 = (p753kq.C19861p) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ TimeoutCancellationException -> 0x0030 }
            goto L_0x005f
        L_0x0030:
            r8 = move-exception
            goto L_0x0063
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0044
            return r3
        L_0x0044:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.L$1 = r10     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.J$0 = r7     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.label = r4     // Catch:{ TimeoutCancellationException -> 0x0060 }
            kotlinx.coroutines.b2 r2 = new kotlinx.coroutines.b2     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r10.element = r2     // Catch:{ TimeoutCancellationException -> 0x0060 }
            java.lang.Object r10 = m33070a(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            if (r10 != r1) goto L_0x005f
            return r1
        L_0x005f:
            return r10
        L_0x0060:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L_0x0063:
            kotlinx.coroutines.g1 r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L_0x006a
            return r3
        L_0x006a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m33071b(long, kq.p, kotlin.coroutines.c):java.lang.Object");
    }
}
