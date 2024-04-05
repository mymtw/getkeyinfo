package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", mo70541f = "Emitters.kt", mo70542l = {40}, mo70543m = "invokeSuspend")
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object> $this_transform;
    public final /* synthetic */ C19862q<C19600e<Object>, Object, C19340c<? super C19394m>, Object> $transform;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1(C19597d<Object> dVar, C19862q<? super C19600e<Object>, Object, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19340c<? super FlowKt__EmittersKt$transform$1> cVar) {
        super(2, cVar);
        this.$this_transform = dVar;
        this.$transform = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, cVar);
        flowKt__EmittersKt$transform$1.L$0 = obj;
        return flowKt__EmittersKt$transform$1;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((FlowKt__EmittersKt$transform$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19600e eVar = (C19600e) this.L$0;
            C19597d<Object> dVar = this.$this_transform;
            final C19862q<C19600e<Object>, Object, C19340c<? super C19394m>, Object> qVar = this.$transform;
            C195531 r3 = new C19600e() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(T r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                        goto L_0x003f
                    L_0x0027:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x002f:
                        androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                        kq.q<kotlinx.coroutines.flow.e<java.lang.Object>, T, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r6 = r2
                        kotlinx.coroutines.flow.e<java.lang.Object> r2 = r4
                        r0.label = r3
                        java.lang.Object r5 = r6.invoke(r2, r5, r0)
                        if (r5 != r1) goto L_0x003f
                        return r1
                    L_0x003f:
                        kotlin.m r5 = kotlin.C19394m.f43287a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.C195531.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            };
            this.label = 1;
            if (dVar.collect(r3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        final C19600e eVar = (C19600e) this.L$0;
        C19597d<Object> dVar = this.$this_transform;
        final C19862q<C19600e<Object>, Object, C19340c<? super C19394m>, Object> qVar = this.$transform;
        dVar.collect(new C19600e() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    goto L_0x003f
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    kq.q<kotlinx.coroutines.flow.e<java.lang.Object>, T, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r6 = r2
                    kotlinx.coroutines.flow.e<java.lang.Object> r2 = r4
                    r0.label = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L_0x003f
                    return r1
                L_0x003f:
                    kotlin.m r5 = kotlin.C19394m.f43287a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.C195531.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, this);
        return C19394m.f43287a;
    }
}
