package androidx.compose.foundation.gestures;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo70541f = "DragGestureDetector.kt", mo70542l = {829, 867}, mo70543m = "awaitVerticalTouchSlopOrCancellation-jO51t88")
final class DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 extends ContinuationImpl {
    public float F$0;
    public float F$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(C19340c<? super DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        if (r9.mo6615b() == false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
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
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1
            r1.<init>(r0)
        L_0x001d:
            java.lang.Object r2 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.label
            if (r4 == 0) goto L_0x0137
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L_0x004d
            if (r4 != r6) goto L_0x0045
            float r4 = r1.F$1
            float r8 = r1.F$0
            java.lang.Object r9 = r1.L$3
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref$LongRef) r10
            java.lang.Object r11 = r1.L$1
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            java.lang.Object r12 = r1.L$0
            kq.p r12 = (p753kq.C19861p) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r5 = r6
            goto L_0x00f9
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            float r4 = r1.F$1
            float r8 = r1.F$0
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref$LongRef) r9
            java.lang.Object r10 = r1.L$1
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p015ui.input.pointer.C1631c) r10
            java.lang.Object r11 = r1.L$0
            kq.p r11 = (p753kq.C19861p) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r12 = r11
            r11 = r10
            r10 = r9
        L_0x0063:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r9 = r2.f3651a
            int r13 = r9.size()
            r15 = 0
        L_0x006c:
            if (r15 >= r13) goto L_0x008a
            java.lang.Object r16 = r9.get(r15)
            r14 = r16
            androidx.compose.ui.input.pointer.p r14 = (androidx.compose.p015ui.input.pointer.C1644p) r14
            long r5 = r14.f3656a
            r17 = r8
            long r7 = r10.element
            boolean r5 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r5, r7)
            if (r5 == 0) goto L_0x0083
            goto L_0x008e
        L_0x0083:
            int r15 = r15 + 1
            r8 = r17
            r6 = 2
            r7 = 1
            goto L_0x006c
        L_0x008a:
            r17 = r8
            r16 = 0
        L_0x008e:
            r9 = r16
            androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
            if (r9 != 0) goto L_0x0096
            goto L_0x00ff
        L_0x0096:
            boolean r5 = r9.mo6615b()
            if (r5 == 0) goto L_0x009d
            goto L_0x00ff
        L_0x009d:
            boolean r5 = com.google.android.play.core.appupdate.C15562d.m25206v(r9)
            if (r5 == 0) goto L_0x00c9
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r5 = r2.size()
            r6 = 0
        L_0x00aa:
            if (r6 >= r5) goto L_0x00bb
            java.lang.Object r7 = r2.get(r6)
            r8 = r7
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            boolean r8 = r8.f3659d
            if (r8 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            int r6 = r6 + 1
            goto L_0x00aa
        L_0x00bb:
            r7 = 0
        L_0x00bc:
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            if (r7 != 0) goto L_0x00c1
            goto L_0x00ff
        L_0x00c1:
            long r5 = r7.f3656a
            r10.element = r5
            r8 = r17
            r5 = 2
            goto L_0x011d
        L_0x00c9:
            long r5 = r9.f3658c
            long r7 = r9.f3661f
            float r2 = p288y.C8343c.m16643d(r5)
            float r5 = p288y.C8343c.m16643d(r7)
            float r2 = r2 - r5
            float r4 = r4 + r2
            float r2 = java.lang.Math.abs(r4)
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0101
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r1.L$0 = r12
            r1.L$1 = r11
            r1.L$2 = r10
            r1.L$3 = r9
            r8 = r17
            r1.F$0 = r8
            r1.F$1 = r4
            r5 = 2
            r1.label = r5
            java.lang.Object r2 = r11.mo6568f0(r2, r1)
            if (r2 != r3) goto L_0x00f9
            goto L_0x0133
        L_0x00f9:
            boolean r2 = r9.mo6615b()
            if (r2 == 0) goto L_0x011d
        L_0x00ff:
            r5 = 0
            goto L_0x0119
        L_0x0101:
            r8 = r17
            r5 = 2
            float r2 = java.lang.Math.signum(r4)
            float r2 = r2 * r8
            float r4 = r4 - r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r4)
            r12.invoke(r9, r2)
            boolean r2 = r9.mo6615b()
            if (r2 == 0) goto L_0x011b
            r5 = r9
        L_0x0119:
            r3 = r5
            goto L_0x0133
        L_0x011b:
            r2 = 0
            r4 = r2
        L_0x011d:
            r1.L$0 = r12
            r1.L$1 = r11
            r1.L$2 = r10
            r6 = 0
            r1.L$3 = r6
            r1.F$0 = r8
            r1.F$1 = r4
            r7 = 1
            r1.label = r7
            java.lang.Object r2 = r11.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r1)
            if (r2 != r3) goto L_0x0134
        L_0x0133:
            return r3
        L_0x0134:
            r6 = r5
            goto L_0x0063
        L_0x0137:
            r6 = 0
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
