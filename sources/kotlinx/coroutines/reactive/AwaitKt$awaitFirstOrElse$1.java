package kotlinx.coroutines.reactive;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.AwaitKt", mo70541f = "Await.kt", mo70542l = {56}, mo70543m = "awaitFirstOrElse")
final class AwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public AwaitKt$awaitFirstOrElse$1(C19340c<? super AwaitKt$awaitFirstOrElse$1> cVar) {
        super(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kq.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.result = r6
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.label = r6
            r1 = r6 & r0
            if (r1 == 0) goto L_0x0012
            int r6 = r6 - r0
            r5.label = r6
            r6 = r5
            goto L_0x0017
        L_0x0012:
            kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1 r6 = new kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1
            r6.<init>(r5)
        L_0x0017:
            java.lang.Object r0 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r6 = r6.L$0
            r4 = r6
            kq.a r4 = (p753kq.C19846a) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x0044
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            kotlinx.coroutines.reactive.Mode r0 = kotlinx.coroutines.reactive.Mode.FIRST_OR_DEFAULT
            r6.L$0 = r4
            r6.label = r3
            java.lang.Object r0 = kotlinx.coroutines.reactive.C19775a.m33728b(r0, r6)
            if (r0 != r1) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            if (r0 != 0) goto L_0x004c
            java.lang.Object r6 = r4.invoke()
            r1 = r6
            goto L_0x004d
        L_0x004c:
            r1 = r0
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.AwaitKt$awaitFirstOrElse$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
