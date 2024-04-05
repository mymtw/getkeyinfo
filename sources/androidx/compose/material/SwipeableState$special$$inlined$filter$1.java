package androidx.compose.material;

import java.util.Map;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;

public final class SwipeableState$special$$inlined$filter$1 implements C19597d<Map<Float, ? extends T>> {

    /* renamed from: b */
    public final /* synthetic */ C19597d f2296b;

    public SwipeableState$special$$inlined$filter$1(C19665q1 q1Var) {
        this.f2296b = q1Var;
    }

    public final Object collect(final C19600e eVar, C19340c cVar) {
        Object collect = this.f2296b.collect(new C19600e() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C19340c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.C11492.C11501
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.C11492.C11501) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    goto L_0x0047
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                    kotlinx.coroutines.flow.e r6 = r3
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L_0x0047
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    kotlin.m r5 = kotlin.C19394m.f43287a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.C11492.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }
}
