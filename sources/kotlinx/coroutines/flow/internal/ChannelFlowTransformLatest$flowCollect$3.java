package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo70541f = "Merge.kt", mo70542l = {27}, mo70543m = "invokeSuspend")
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19600e<R> $collector;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, C19600e<? super R> eVar, C19340c<? super ChannelFlowTransformLatest$flowCollect$3> cVar) {
        super(2, cVar);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, cVar);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19525d0 d0Var = (C19525d0) this.L$0;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
            C19597d<S> dVar = channelFlowTransformLatest.f43594e;
            final C19600e<R> eVar = this.$collector;
            C196151 r5 = new C19600e() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(final T r8, kotlin.coroutines.C19340c<? super kotlin.C19394m> r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r9
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                        r0.<init>(r7, r9)
                    L_0x0018:
                        java.lang.Object r9 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0039
                        if (r2 != r3) goto L_0x0031
                        java.lang.Object r8 = r0.L$2
                        kotlinx.coroutines.g1 r8 = (kotlinx.coroutines.C19699g1) r8
                        java.lang.Object r8 = r0.L$1
                        java.lang.Object r0 = r0.L$0
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C196151) r0
                        androidx.compose.foundation.layout.C0761x.m1684O0(r9)
                        goto L_0x005d
                    L_0x0031:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L_0x0039:
                        androidx.compose.foundation.layout.C0761x.m1684O0(r9)
                        kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.g1> r9 = r1
                        T r9 = r9.element
                        kotlinx.coroutines.g1 r9 = (kotlinx.coroutines.C19699g1) r9
                        if (r9 != 0) goto L_0x0045
                        goto L_0x005c
                    L_0x0045:
                        kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                        r2.<init>()
                        r9.mo72134a(r2)
                        r0.L$0 = r7
                        r0.L$1 = r8
                        r0.L$2 = r9
                        r0.label = r3
                        java.lang.Object r9 = r9.mo72394c0(r0)
                        if (r9 != r1) goto L_0x005c
                        return r1
                    L_0x005c:
                        r0 = r7
                    L_0x005d:
                        kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.g1> r9 = r1
                        kotlinx.coroutines.d0 r1 = r8
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r3
                        kotlinx.coroutines.flow.e<R> r0 = r6
                        r6 = 0
                        r4.<init>(r5, r0, r8, r6)
                        kotlinx.coroutines.w1 r8 = kotlinx.coroutines.C19697g.m33468f(r1, r6, r2, r4, r3)
                        r9.element = r8
                        kotlin.m r8 = kotlin.C19394m.f43287a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C196151.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            };
            this.label = 1;
            if (dVar.collect(r5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
