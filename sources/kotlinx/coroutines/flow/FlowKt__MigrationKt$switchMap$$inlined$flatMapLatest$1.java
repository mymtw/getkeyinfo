package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", mo70541f = "Migration.kt", mo70542l = {190, 190}, mo70543m = "invokeSuspend")
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends SuspendLambda implements C19862q<C19600e<Object>, Object, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p $transform;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(C19861p pVar, C19340c cVar) {
        super(3, cVar);
        this.$transform = pVar;
    }

    public final Object invoke(C19600e<Object> eVar, Object obj, C19340c<? super C19394m> cVar) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, cVar);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = eVar;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = obj;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.flow.e} */
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
            goto L_0x004e
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0037
        L_0x0020:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C19600e) r1
            java.lang.Object r6 = r5.L$1
            kq.p r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            kotlinx.coroutines.flow.d r6 = (kotlinx.coroutines.flow.C19597d) r6
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            boolean r2 = r1 instanceof kotlinx.coroutines.flow.C19593b2
            if (r2 != 0) goto L_0x0051
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            kotlin.m r6 = kotlin.C19394m.f43287a
        L_0x004b:
            if (r6 != r0) goto L_0x004e
            return r0
        L_0x004e:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        L_0x0051:
            kotlinx.coroutines.flow.b2 r1 = (kotlinx.coroutines.flow.C19593b2) r1
            r1.getClass()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
