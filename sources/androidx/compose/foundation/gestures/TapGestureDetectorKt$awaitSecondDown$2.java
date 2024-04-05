package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1644p;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", mo70541f = "TapGestureDetector.kt", mo70542l = {191}, mo70543m = "invokeSuspend")
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C1644p>, Object> {
    public final /* synthetic */ C1644p $firstUp;
    public long J$0;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(C1644p pVar, C19340c<? super TapGestureDetectorKt$awaitSecondDown$2> cVar) {
        super(2, cVar);
        this.$firstUp = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, cVar);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    public final Object invoke(C1631c cVar, C19340c<? super C1644p> cVar2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            long r3 = r9.J$0
            java.lang.Object r1 = r9.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L_0x004a
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p015ui.input.pointer.C1631c) r10
            androidx.compose.ui.input.pointer.p r1 = r9.$firstUp
            long r3 = r1.f3657b
            androidx.compose.ui.platform.j1 r1 = r10.getViewConfiguration()
            r1.mo6770b()
            r5 = 40
            long r5 = r5 + r3
            r1 = r10
            r3 = r5
            r10 = r9
        L_0x0037:
            r10.L$0 = r1
            r10.J$0 = r3
            r10.label = r2
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1410b(r1, r2, r10)
            if (r5 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L_0x004a:
            androidx.compose.ui.input.pointer.p r10 = (androidx.compose.p015ui.input.pointer.C1644p) r10
            long r6 = r10.f3657b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0053
            return r10
        L_0x0053:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
