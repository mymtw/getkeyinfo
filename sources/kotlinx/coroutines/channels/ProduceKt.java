package kotlinx.coroutines.channels;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import p568fn.C17782b;
import p753kq.C19861p;

public final class ProduceKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kq.a<kotlin.m>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33138a(kotlinx.coroutines.channels.C19513o<?> r4, p753kq.C19846a<kotlin.C19394m> r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.L$1
            r5 = r4
            kq.a r5 = (p753kq.C19846a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.C19513o) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x0030 }
            goto L_0x006f
        L_0x0030:
            r4 = move-exception
            goto L_0x0075
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.g1$b r2 = kotlinx.coroutines.C19699g1.C19701b.f43635b
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r2)
            if (r6 != r4) goto L_0x004b
            r6 = r3
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            if (r6 == 0) goto L_0x0079
            r0.L$0 = r4     // Catch:{ all -> 0x0030 }
            r0.L$1 = r5     // Catch:{ all -> 0x0030 }
            r0.label = r3     // Catch:{ all -> 0x0030 }
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l     // Catch:{ all -> 0x0030 }
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)     // Catch:{ all -> 0x0030 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0030 }
            r6.mo72548n()     // Catch:{ all -> 0x0030 }
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch:{ all -> 0x0030 }
            r0.<init>(r6)     // Catch:{ all -> 0x0030 }
            r4.mo72190c(r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r6.mo72547l()     // Catch:{ all -> 0x0030 }
            if (r4 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r5.invoke()
            kotlin.m r4 = kotlin.C19394m.f43287a
            return r4
        L_0x0075:
            r5.invoke()
            throw r4
        L_0x0079:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.m33138a(kotlinx.coroutines.channels.o, kq.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static C19512n m33139b(C19525d0 d0Var, int i, C19861p pVar, int i2) {
        EmptyCoroutineContext emptyCoroutineContext = (i2 & 1) != 0 ? EmptyCoroutineContext.INSTANCE : null;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        C19512n nVar = new C19512n(CoroutineContextKt.m33062c(d0Var, emptyCoroutineContext), C17782b.m29872l(i, bufferOverflow, 4));
        coroutineStart.invoke(pVar, nVar, nVar);
        return nVar;
    }
}
