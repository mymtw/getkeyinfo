package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p753kq.C19861p;

public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19597d f43545b;

    /* renamed from: c */
    public final /* synthetic */ C19861p f43546c;

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C19597d dVar, C19861p pVar) {
        this.f43545b = dVar;
        this.f43546c = pVar;
    }

    public final Object collect(final C19600e eVar, C19340c cVar) {
        C19597d dVar = this.f43545b;
        final C19861p pVar = this.f43546c;
        Object collect = dVar.collect(new C19600e() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, kotlin.coroutines.C19340c<? super kotlin.C19394m> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C195652.C195661
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C195652.C195661) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                    goto L_0x0060
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    java.lang.Object r6 = r0.L$1
                    kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C19600e) r6
                    java.lang.Object r2 = r0.L$0
                    androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                    goto L_0x0052
                L_0x003c:
                    androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                    kotlinx.coroutines.flow.e r7 = r4
                    kq.p r2 = r2
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    if (r2 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r2 = r6
                    r6 = r7
                L_0x0052:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    kotlin.m r6 = kotlin.C19394m.f43287a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C195652.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }
}
