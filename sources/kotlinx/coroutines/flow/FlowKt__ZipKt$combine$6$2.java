package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", mo70541f = "Zip.kt", mo70542l = {292, 292}, mo70543m = "invokeSuspend")
public final class FlowKt__ZipKt$combine$6$2 extends SuspendLambda implements C19862q<C19600e<Object>, Object[], C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<Object[], C19340c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$2(C19861p<? super Object[], ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super FlowKt__ZipKt$combine$6$2> cVar) {
        super(3, cVar);
        this.$transform = pVar;
    }

    public final Object invoke(C19600e<Object> eVar, Object[] objArr, C19340c<? super C19394m> cVar) {
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.$transform, cVar);
        flowKt__ZipKt$combine$6$2.L$0 = eVar;
        flowKt__ZipKt$combine$6$2.L$1 = objArr;
        return flowKt__ZipKt$combine$6$2.invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0045
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0039
        L_0x0020:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kq.p<java.lang.Object[], kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0045
            return r0
        L_0x0045:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        ((C19600e) this.L$0).emit(this.$transform.invoke((Object[]) this.L$1, this), this);
        return C19394m.f43287a;
    }
}
