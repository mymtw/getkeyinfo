package androidx.compose.foundation.gestures;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo70541f = "DragGestureDetector.kt", mo70542l = {823}, mo70543m = "awaitHorizontalDragOrCancellation-rnUCldI")
final class DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(C19340c<? super DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1> cVar) {
        super(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[LOOP:0: B:9:0x0033->B:45:0x00b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r0.result = r1
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r2
            r0.label = r1
            float r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.f1325a
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.label = r1
            r1 = r0
            goto L_0x001d
        L_0x0018:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1
            r1.<init>(r0)
        L_0x001d:
            java.lang.Object r2 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.label
            if (r4 == 0) goto L_0x00c4
            r6 = 1
            if (r4 != r6) goto L_0x00bc
            java.lang.Object r4 = r1.L$1
            kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref$LongRef) r4
            java.lang.Object r7 = r1.L$0
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p015ui.input.pointer.C1631c) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
        L_0x0033:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r8 = r2.f3651a
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L_0x003d:
            if (r11 >= r9) goto L_0x0055
            java.lang.Object r12 = r8.get(r11)
            r13 = r12
            androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
            long r13 = r13.f3656a
            long r5 = r4.element
            boolean r5 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r13, r5)
            if (r5 == 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            int r11 = r11 + 1
            r6 = 1
            goto L_0x003d
        L_0x0055:
            r12 = 0
        L_0x0056:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            if (r12 != 0) goto L_0x005c
            r3 = 0
            goto L_0x009a
        L_0x005c:
            boolean r5 = com.google.android.play.core.appupdate.C15562d.m25206v(r12)
            if (r5 == 0) goto L_0x0085
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r5 = r2.size()
            r6 = r10
        L_0x0069:
            if (r6 >= r5) goto L_0x007a
            java.lang.Object r8 = r2.get(r6)
            r9 = r8
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
            boolean r9 = r9.f3659d
            if (r9 == 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r6 = r6 + 1
            goto L_0x0069
        L_0x007a:
            r8 = 0
        L_0x007b:
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            if (r8 != 0) goto L_0x0080
            goto L_0x0099
        L_0x0080:
            long r5 = r8.f3656a
            r4.element = r5
            goto L_0x00aa
        L_0x0085:
            r15 = 1
            long r5 = com.google.android.play.core.appupdate.C15562d.m25184V(r12, r15)
            float r2 = p288y.C8343c.m16642c(r5)
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0095
            r2 = r15
            goto L_0x0096
        L_0x0095:
            r2 = r10
        L_0x0096:
            r2 = r2 ^ r15
            if (r2 == 0) goto L_0x00aa
        L_0x0099:
            r3 = r12
        L_0x009a:
            if (r3 == 0) goto L_0x00a4
            boolean r1 = r3.mo6615b()
            if (r1 != 0) goto L_0x00a4
            r6 = 1
            goto L_0x00a5
        L_0x00a4:
            r6 = r10
        L_0x00a5:
            if (r6 == 0) goto L_0x00a8
            goto L_0x00b7
        L_0x00a8:
            r3 = 0
            goto L_0x00b7
        L_0x00aa:
            r1.L$0 = r7
            r1.L$1 = r4
            r2 = 1
            r1.label = r2
            java.lang.Object r5 = r7.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r1)
            if (r5 != r3) goto L_0x00b8
        L_0x00b7:
            return r3
        L_0x00b8:
            r6 = r2
            r2 = r5
            goto L_0x0033
        L_0x00bc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x00c4:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
