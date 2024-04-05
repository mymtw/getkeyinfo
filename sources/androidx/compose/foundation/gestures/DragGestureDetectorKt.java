package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1640l;
import androidx.compose.p015ui.input.pointer.C1643o;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.p015ui.platform.C1843j1;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DragGestureDetectorKt {

    /* renamed from: a */
    public static final float f1325a = (((float) 0.125d) / ((float) 18));

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1358a(androidx.compose.p015ui.input.pointer.C1652w r10, T r11, kotlin.coroutines.C19340c r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ TimeoutCancellationException -> 0x0077 }
            goto L_0x006c
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r2.element = r11
            androidx.compose.ui.platform.j1 r5 = r10.getViewConfiguration()
            long r5 = r5.mo6771c()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ TimeoutCancellationException -> 0x0076 }
            r7.<init>(r10, r2, r12, r3)     // Catch:{ TimeoutCancellationException -> 0x0076 }
            r0.L$0 = r11     // Catch:{ TimeoutCancellationException -> 0x0076 }
            r0.L$1 = r12     // Catch:{ TimeoutCancellationException -> 0x0076 }
            r0.label = r4     // Catch:{ TimeoutCancellationException -> 0x0076 }
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x006e
            kotlinx.coroutines.b2 r10 = new kotlinx.coroutines.b2     // Catch:{ TimeoutCancellationException -> 0x0076 }
            r10.<init>(r5, r0)     // Catch:{ TimeoutCancellationException -> 0x0076 }
            java.lang.Object r10 = kotlinx.coroutines.TimeoutKt.m33070a(r10, r7)     // Catch:{ TimeoutCancellationException -> 0x0076 }
            if (r10 != r1) goto L_0x006c
            goto L_0x007f
        L_0x006c:
            r1 = r3
            goto L_0x007f
        L_0x006e:
            kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException     // Catch:{ TimeoutCancellationException -> 0x0076 }
            java.lang.String r0 = "Timed out immediately"
            r10.<init>(r0)     // Catch:{ TimeoutCancellationException -> 0x0076 }
            throw r10     // Catch:{ TimeoutCancellationException -> 0x0076 }
        L_0x0076:
            r10 = r12
        L_0x0077:
            T r10 = r10.element
            r1 = r10
            androidx.compose.ui.input.pointer.p r1 = (androidx.compose.p015ui.input.pointer.C1644p) r1
            if (r1 != 0) goto L_0x007f
            r1 = r11
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1358a(androidx.compose.ui.input.pointer.w, androidx.compose.ui.input.pointer.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if ((!p288y.C8343c.m16640a(com.google.android.play.core.appupdate.C15562d.m25184V(r11, true), p288y.C8343c.f18295b)) != false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1359b(androidx.compose.p015ui.input.pointer.C1631c r17, long r18, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0041
            if (r5 != r7) goto L_0x0039
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref$LongRef) r0
            java.lang.Object r1 = r3.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006a
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            androidx.compose.ui.input.pointer.l r2 = r17.mo6569g0()
            boolean r2 = m1367j(r2, r0)
            if (r2 == 0) goto L_0x004f
            return r6
        L_0x004f:
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r2.element = r0
            r0 = r17
        L_0x0058:
            r3.L$0 = r0
            r3.L$1 = r2
            r3.label = r7
            java.lang.Object r1 = r0.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r3)
            if (r1 != r4) goto L_0x0065
            return r4
        L_0x0065:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006a:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r5 = r2.f3651a
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L_0x0074:
            if (r10 >= r8) goto L_0x008b
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            long r12 = r12.f3656a
            long r14 = r1.element
            boolean r12 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r12, r14)
            if (r12 == 0) goto L_0x0088
            goto L_0x008c
        L_0x0088:
            int r10 = r10 + 1
            goto L_0x0074
        L_0x008b:
            r11 = r6
        L_0x008c:
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
            if (r11 != 0) goto L_0x0092
            r11 = r6
            goto L_0x00c8
        L_0x0092:
            boolean r5 = com.google.android.play.core.appupdate.C15562d.m25206v(r11)
            if (r5 == 0) goto L_0x00bb
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r5 = r2.size()
            r8 = r9
        L_0x009f:
            if (r8 >= r5) goto L_0x00b0
            java.lang.Object r10 = r2.get(r8)
            r12 = r10
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            boolean r12 = r12.f3659d
            if (r12 == 0) goto L_0x00ad
            goto L_0x00b1
        L_0x00ad:
            int r8 = r8 + 1
            goto L_0x009f
        L_0x00b0:
            r10 = r6
        L_0x00b1:
            androidx.compose.ui.input.pointer.p r10 = (androidx.compose.p015ui.input.pointer.C1644p) r10
            if (r10 != 0) goto L_0x00b6
            goto L_0x00c8
        L_0x00b6:
            long r8 = r10.f3656a
            r1.element = r8
            goto L_0x00d6
        L_0x00bb:
            long r12 = com.google.android.play.core.appupdate.C15562d.m25184V(r11, r7)
            long r14 = p288y.C8343c.f18295b
            boolean r2 = p288y.C8343c.m16640a(r12, r14)
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x00d6
        L_0x00c8:
            if (r11 == 0) goto L_0x00d1
            boolean r0 = r11.mo6615b()
            if (r0 != 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r7 = r9
        L_0x00d2:
            if (r7 == 0) goto L_0x00d5
            r6 = r11
        L_0x00d5:
            return r6
        L_0x00d6:
            r2 = r1
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1359b(androidx.compose.ui.input.pointer.c, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        if (r5.mo6615b() != false) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1360c(androidx.compose.p015ui.input.pointer.C1631c r18, long r19, int r21, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1644p, ? super java.lang.Float, kotlin.C19394m> r22, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r23) {
        /*
            r0 = r19
            r2 = r23
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0063
            if (r5 == r8) goto L_0x004c
            if (r5 != r7) goto L_0x0044
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$3
            androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
            java.lang.Object r10 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref$LongRef) r10
            java.lang.Object r11 = r3.L$1
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            java.lang.Object r12 = r3.L$0
            kq.p r12 = (p753kq.C19861p) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            goto L_0x0135
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r10 = r3.L$1
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p015ui.input.pointer.C1631c) r10
            java.lang.Object r11 = r3.L$0
            kq.p r11 = (p753kq.C19861p) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r12 = r11
            r11 = r10
            r10 = r5
            goto L_0x00ab
        L_0x0063:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            androidx.compose.ui.input.pointer.l r2 = r18.mo6569g0()
            boolean r2 = m1367j(r2, r0)
            if (r2 == 0) goto L_0x0072
            goto L_0x0159
        L_0x0072:
            androidx.compose.ui.platform.j1 r2 = r18.getViewConfiguration()
            r5 = r21
            float r2 = m1368k(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.element = r0
            r0 = r18
            r1 = r22
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x008c:
            r4.L$0 = r1
            r4.L$1 = r0
            r4.L$2 = r10
            r4.L$3 = r9
            r4.F$0 = r3
            r4.F$1 = r2
            r4.label = r8
            java.lang.Object r11 = r0.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r4)
            if (r11 != r5) goto L_0x00a1
            return r5
        L_0x00a1:
            r12 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r17 = r11
            r11 = r0
            r0 = r2
            r2 = r17
        L_0x00ab:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r5 = r2.f3651a
            int r13 = r5.size()
            r15 = 0
        L_0x00b4:
            if (r15 >= r13) goto L_0x00cf
            java.lang.Object r16 = r5.get(r15)
            r6 = r16
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            long r8 = r6.f3656a
            r6 = r15
            long r14 = r10.element
            boolean r8 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r8, r14)
            if (r8 == 0) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            int r15 = r6 + 1
            r8 = 1
            r9 = 0
            goto L_0x00b4
        L_0x00cf:
            r16 = 0
        L_0x00d1:
            r5 = r16
            androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
            if (r5 != 0) goto L_0x00d8
            goto L_0x013b
        L_0x00d8:
            boolean r6 = r5.mo6615b()
            if (r6 == 0) goto L_0x00df
            goto L_0x013b
        L_0x00df:
            boolean r6 = com.google.android.play.core.appupdate.C15562d.m25206v(r5)
            if (r6 == 0) goto L_0x0108
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r5 = r2.size()
            r14 = 0
        L_0x00ec:
            if (r14 >= r5) goto L_0x00fd
            java.lang.Object r6 = r2.get(r14)
            r8 = r6
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            boolean r8 = r8.f3659d
            if (r8 == 0) goto L_0x00fa
            goto L_0x00fe
        L_0x00fa:
            int r14 = r14 + 1
            goto L_0x00ec
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            if (r6 != 0) goto L_0x0103
            goto L_0x013b
        L_0x0103:
            long r5 = r6.f3656a
            r10.element = r5
            goto L_0x013d
        L_0x0108:
            long r8 = r5.f3658c
            long r13 = r5.f3661f
            float r2 = p288y.C8343c.m16642c(r8)
            float r6 = p288y.C8343c.m16642c(r13)
            float r2 = r2 - r6
            float r0 = r0 + r2
            float r2 = java.lang.Math.abs(r0)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r3.L$0 = r12
            r3.L$1 = r11
            r3.L$2 = r10
            r3.L$3 = r5
            r3.F$0 = r1
            r3.F$1 = r0
            r3.label = r7
            java.lang.Object r2 = r11.mo6568f0(r2, r3)
            if (r2 != r4) goto L_0x0135
            return r4
        L_0x0135:
            boolean r2 = r5.mo6615b()
            if (r2 == 0) goto L_0x013d
        L_0x013b:
            r9 = 0
            goto L_0x0159
        L_0x013d:
            r2 = r0
            r5 = r4
            r0 = r11
        L_0x0140:
            r4 = r3
            r3 = r1
            r1 = r12
            goto L_0x015e
        L_0x0144:
            float r2 = java.lang.Math.signum(r0)
            float r2 = r2 * r1
            float r0 = r0 - r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            r12.invoke(r5, r2)
            boolean r0 = r5.mo6615b()
            if (r0 == 0) goto L_0x015a
            r9 = r5
        L_0x0159:
            return r9
        L_0x015a:
            r5 = r4
            r0 = r11
            r2 = 0
            goto L_0x0140
        L_0x015e:
            r8 = 1
            r9 = 0
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1360c(androidx.compose.ui.input.pointer.c, long, int, kq.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1361d(androidx.compose.p015ui.input.pointer.C1631c r17, long r18, int r20, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1644p, ? super p288y.C8343c, kotlin.C19394m> r21, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r22) {
        /*
            r0 = r18
            r2 = r22
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0063
            if (r5 == r8) goto L_0x004c
            if (r5 != r6) goto L_0x0044
            float r0 = r3.F$0
            long r9 = r3.J$0
            java.lang.Object r1 = r3.L$3
            androidx.compose.ui.input.pointer.p r1 = (androidx.compose.p015ui.input.pointer.C1644p) r1
            java.lang.Object r5 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r11 = r3.L$1
            kq.p r11 = (p753kq.C19861p) r11
            java.lang.Object r12 = r3.L$0
            androidx.compose.ui.input.pointer.c r12 = (androidx.compose.p015ui.input.pointer.C1631c) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            goto L_0x015c
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            float r0 = r3.F$0
            long r9 = r3.J$0
            java.lang.Object r1 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r5 = r3.L$1
            kq.p r5 = (p753kq.C19861p) r5
            java.lang.Object r11 = r3.L$0
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r12 = r11
            r11 = r5
            r5 = r1
            goto L_0x00a1
        L_0x0063:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            androidx.compose.ui.input.pointer.l r2 = r17.mo6569g0()
            boolean r2 = m1367j(r2, r0)
            if (r2 == 0) goto L_0x0071
            return r7
        L_0x0071:
            long r9 = p288y.C8343c.f18295b
            androidx.compose.ui.platform.j1 r2 = r17.getViewConfiguration()
            r5 = r20
            float r2 = m1368k(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.element = r0
            r0 = r17
            r1 = r21
        L_0x0088:
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r5
            r3.L$3 = r7
            r3.J$0 = r9
            r3.F$0 = r2
            r3.label = r8
            java.lang.Object r11 = r0.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r3)
            if (r11 != r4) goto L_0x009d
            return r4
        L_0x009d:
            r12 = r0
            r0 = r2
            r2 = r11
            r11 = r1
        L_0x00a1:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r1 = r2.f3651a
            int r13 = r1.size()
            r15 = 0
        L_0x00aa:
            if (r15 >= r13) goto L_0x00c6
            java.lang.Object r16 = r1.get(r15)
            r8 = r16
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            long r6 = r8.f3656a
            r8 = r15
            long r14 = r5.element
            boolean r6 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r6, r14)
            if (r6 == 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            int r15 = r8 + 1
            r6 = 2
            r7 = 0
            r8 = 1
            goto L_0x00aa
        L_0x00c6:
            r16 = 0
        L_0x00c8:
            r1 = r16
            androidx.compose.ui.input.pointer.p r1 = (androidx.compose.p015ui.input.pointer.C1644p) r1
            if (r1 != 0) goto L_0x00d0
            r6 = 0
            return r6
        L_0x00d0:
            r6 = 0
            boolean r7 = r1.mo6615b()
            if (r7 == 0) goto L_0x00d8
            return r6
        L_0x00d8:
            boolean r6 = com.google.android.play.core.appupdate.C15562d.m25206v(r1)
            if (r6 == 0) goto L_0x0106
            java.util.List<androidx.compose.ui.input.pointer.p> r1 = r2.f3651a
            int r2 = r1.size()
            r14 = 0
        L_0x00e5:
            if (r14 >= r2) goto L_0x00f6
            java.lang.Object r6 = r1.get(r14)
            r7 = r6
            androidx.compose.ui.input.pointer.p r7 = (androidx.compose.p015ui.input.pointer.C1644p) r7
            boolean r7 = r7.f3659d
            if (r7 == 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            int r14 = r14 + 1
            goto L_0x00e5
        L_0x00f6:
            r6 = 0
        L_0x00f7:
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            if (r6 != 0) goto L_0x00fd
            r1 = 0
            return r1
        L_0x00fd:
            long r1 = r6.f3656a
            r5.element = r1
            r2 = r0
            r0 = r12
            r1 = 0
            r6 = 2
            goto L_0x0167
        L_0x0106:
            long r6 = com.google.android.play.core.appupdate.C15562d.m25183U(r1)
            long r6 = p288y.C8343c.m16645f(r9, r6)
            float r2 = p288y.C8343c.m16641b(r6)
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x013f
            float r8 = p288y.C8343c.m16642c(r6)
            float r8 = r8 / r2
            float r9 = p288y.C8343c.m16643d(r6)
            float r9 = r9 / r2
            long r8 = kotlin.reflect.C19421p.m32952q(r8, r9)
            long r8 = p288y.C8343c.m16646g(r8, r0)
            long r8 = p288y.C8343c.m16644e(r6, r8)
            y.c r2 = new y.c
            r2.<init>(r8)
            r11.invoke(r1, r2)
            boolean r2 = r1.mo6615b()
            if (r2 == 0) goto L_0x013d
            r9 = r6
            r14 = 1
            goto L_0x0141
        L_0x013d:
            long r6 = p288y.C8343c.f18295b
        L_0x013f:
            r9 = r6
            r14 = 0
        L_0x0141:
            if (r14 == 0) goto L_0x0144
            return r1
        L_0x0144:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r3.L$0 = r12
            r3.L$1 = r11
            r3.L$2 = r5
            r3.L$3 = r1
            r3.J$0 = r9
            r3.F$0 = r0
            r6 = 2
            r3.label = r6
            java.lang.Object r2 = r12.mo6568f0(r2, r3)
            if (r2 != r4) goto L_0x015c
            return r4
        L_0x015c:
            boolean r1 = r1.mo6615b()
            if (r1 == 0) goto L_0x0164
            r1 = 0
            return r1
        L_0x0164:
            r1 = 0
            r2 = r0
            r0 = r12
        L_0x0167:
            r7 = r1
            r1 = r11
            r8 = 1
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1361d(androidx.compose.ui.input.pointer.c, long, int, kq.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        if (r5.mo6615b() != false) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1362e(androidx.compose.p015ui.input.pointer.C1631c r18, long r19, int r21, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1644p, ? super java.lang.Float, kotlin.C19394m> r22, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r23) {
        /*
            r0 = r19
            r2 = r23
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0063
            if (r5 == r8) goto L_0x004c
            if (r5 != r7) goto L_0x0044
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$3
            androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
            java.lang.Object r10 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref$LongRef) r10
            java.lang.Object r11 = r3.L$1
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            java.lang.Object r12 = r3.L$0
            kq.p r12 = (p753kq.C19861p) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            goto L_0x0135
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r10 = r3.L$1
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p015ui.input.pointer.C1631c) r10
            java.lang.Object r11 = r3.L$0
            kq.p r11 = (p753kq.C19861p) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r12 = r11
            r11 = r10
            r10 = r5
            goto L_0x00ab
        L_0x0063:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            androidx.compose.ui.input.pointer.l r2 = r18.mo6569g0()
            boolean r2 = m1367j(r2, r0)
            if (r2 == 0) goto L_0x0072
            goto L_0x0159
        L_0x0072:
            androidx.compose.ui.platform.j1 r2 = r18.getViewConfiguration()
            r5 = r21
            float r2 = m1368k(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.element = r0
            r0 = r18
            r1 = r22
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x008c:
            r4.L$0 = r1
            r4.L$1 = r0
            r4.L$2 = r10
            r4.L$3 = r9
            r4.F$0 = r3
            r4.F$1 = r2
            r4.label = r8
            java.lang.Object r11 = r0.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r4)
            if (r11 != r5) goto L_0x00a1
            return r5
        L_0x00a1:
            r12 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r17 = r11
            r11 = r0
            r0 = r2
            r2 = r17
        L_0x00ab:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r5 = r2.f3651a
            int r13 = r5.size()
            r15 = 0
        L_0x00b4:
            if (r15 >= r13) goto L_0x00cf
            java.lang.Object r16 = r5.get(r15)
            r6 = r16
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            long r8 = r6.f3656a
            r6 = r15
            long r14 = r10.element
            boolean r8 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r8, r14)
            if (r8 == 0) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            int r15 = r6 + 1
            r8 = 1
            r9 = 0
            goto L_0x00b4
        L_0x00cf:
            r16 = 0
        L_0x00d1:
            r5 = r16
            androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
            if (r5 != 0) goto L_0x00d8
            goto L_0x013b
        L_0x00d8:
            boolean r6 = r5.mo6615b()
            if (r6 == 0) goto L_0x00df
            goto L_0x013b
        L_0x00df:
            boolean r6 = com.google.android.play.core.appupdate.C15562d.m25206v(r5)
            if (r6 == 0) goto L_0x0108
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r5 = r2.size()
            r14 = 0
        L_0x00ec:
            if (r14 >= r5) goto L_0x00fd
            java.lang.Object r6 = r2.get(r14)
            r8 = r6
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            boolean r8 = r8.f3659d
            if (r8 == 0) goto L_0x00fa
            goto L_0x00fe
        L_0x00fa:
            int r14 = r14 + 1
            goto L_0x00ec
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            if (r6 != 0) goto L_0x0103
            goto L_0x013b
        L_0x0103:
            long r5 = r6.f3656a
            r10.element = r5
            goto L_0x013d
        L_0x0108:
            long r8 = r5.f3658c
            long r13 = r5.f3661f
            float r2 = p288y.C8343c.m16643d(r8)
            float r6 = p288y.C8343c.m16643d(r13)
            float r2 = r2 - r6
            float r0 = r0 + r2
            float r2 = java.lang.Math.abs(r0)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r3.L$0 = r12
            r3.L$1 = r11
            r3.L$2 = r10
            r3.L$3 = r5
            r3.F$0 = r1
            r3.F$1 = r0
            r3.label = r7
            java.lang.Object r2 = r11.mo6568f0(r2, r3)
            if (r2 != r4) goto L_0x0135
            return r4
        L_0x0135:
            boolean r2 = r5.mo6615b()
            if (r2 == 0) goto L_0x013d
        L_0x013b:
            r9 = 0
            goto L_0x0159
        L_0x013d:
            r2 = r0
            r5 = r4
            r0 = r11
        L_0x0140:
            r4 = r3
            r3 = r1
            r1 = r12
            goto L_0x015e
        L_0x0144:
            float r2 = java.lang.Math.signum(r0)
            float r2 = r2 * r1
            float r0 = r0 - r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            r12.invoke(r5, r2)
            boolean r0 = r5.mo6615b()
            if (r0 == 0) goto L_0x015a
            r9 = r5
        L_0x0159:
            return r9
        L_0x015a:
            r5 = r4
            r0 = r11
            r2 = 0
            goto L_0x0140
        L_0x015e:
            r8 = 1
            r9 = 0
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1362e(androidx.compose.ui.input.pointer.c, long, int, kq.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final Object m1363f(C1652w wVar, C19857l<? super C8343c, C19394m> lVar, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19861p<? super C1644p, ? super C8343c, C19394m> pVar, C19340c<? super C19394m> cVar) {
        Object b = ForEachGestureKt.m1378b(wVar, new DragGestureDetectorKt$detectDragGestures$5(lVar, pVar, aVar2, aVar, (C19340c<? super DragGestureDetectorKt$detectDragGestures$5>) null), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }

    /* renamed from: g */
    public static final Object m1364g(C1652w wVar, C19857l<? super C8343c, C19394m> lVar, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19861p<? super C1644p, ? super C8343c, C19394m> pVar, C19340c<? super C19394m> cVar) {
        Object b = ForEachGestureKt.m1378b(wVar, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(lVar, aVar2, aVar, pVar, (C19340c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5>) null), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1365h(androidx.compose.p015ui.input.pointer.C1631c r4, long r5, p753kq.C19857l<? super androidx.compose.p015ui.input.pointer.C1644p, kotlin.C19394m> r7, kotlin.coroutines.C19340c<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r4 = r0.L$1
            kq.l r4 = (p753kq.C19857l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p015ui.input.pointer.C1631c) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            r7 = r4
            r4 = r5
            goto L_0x0049
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
        L_0x003c:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m1359b(r4, r5, r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0049:
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            if (r8 != 0) goto L_0x0050
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0050:
            boolean r5 = com.google.android.play.core.appupdate.C15562d.m25206v(r8)
            if (r5 == 0) goto L_0x0059
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L_0x0059:
            r7.invoke(r8)
            long r5 = r8.f3656a
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1365h(androidx.compose.ui.input.pointer.c, long, kq.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        if ((r10 ^ 1) != 0) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1366i(androidx.compose.p015ui.input.pointer.C1631c r17, long r18, p753kq.C19857l<? super androidx.compose.p015ui.input.pointer.C1644p, kotlin.C19394m> r20, kotlin.coroutines.C19340c<? super java.lang.Boolean> r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r3 = r1.L$3
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref$LongRef) r3
            java.lang.Object r5 = r1.L$2
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p015ui.input.pointer.C1631c) r5
            java.lang.Object r6 = r1.L$1
            androidx.compose.ui.input.pointer.c r6 = (androidx.compose.p015ui.input.pointer.C1631c) r6
            java.lang.Object r7 = r1.L$0
            kq.l r7 = (p753kq.C19857l) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r16 = r2
            r2 = r1
            r1 = r7
            r7 = r5
            r5 = r16
            goto L_0x0082
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            androidx.compose.ui.input.pointer.l r0 = r17.mo6569g0()
            r5 = r18
            boolean r0 = m1367j(r0, r5)
            if (r0 == 0) goto L_0x005b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0100
        L_0x005b:
            r0 = r17
            r3 = r2
            r2 = r1
            r1 = r20
        L_0x0061:
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.element = r5
            r6 = r0
            r5 = r3
            r3 = r7
        L_0x006b:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.L$2 = r6
            r2.L$3 = r3
            r2.label = r4
            java.lang.Object r7 = r6.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r2)
            if (r7 != r5) goto L_0x007c
            return r5
        L_0x007c:
            r16 = r6
            r6 = r0
            r0 = r7
            r7 = r16
        L_0x0082:
            androidx.compose.ui.input.pointer.l r0 = (androidx.compose.p015ui.input.pointer.C1640l) r0
            java.util.List<androidx.compose.ui.input.pointer.p> r8 = r0.f3651a
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L_0x008c:
            if (r11 >= r9) goto L_0x00a7
            java.lang.Object r13 = r8.get(r11)
            r14 = r13
            androidx.compose.ui.input.pointer.p r14 = (androidx.compose.p015ui.input.pointer.C1644p) r14
            long r14 = r14.f3656a
            r18 = r13
            long r12 = r3.element
            boolean r12 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r14, r12)
            if (r12 == 0) goto L_0x00a4
            r13 = r18
            goto L_0x00a8
        L_0x00a4:
            int r11 = r11 + 1
            goto L_0x008c
        L_0x00a7:
            r13 = 0
        L_0x00a8:
            androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
            if (r13 != 0) goto L_0x00ae
            r12 = 0
            goto L_0x00ea
        L_0x00ae:
            boolean r8 = com.google.android.play.core.appupdate.C15562d.m25206v(r13)
            if (r8 == 0) goto L_0x00d7
            java.util.List<androidx.compose.ui.input.pointer.p> r0 = r0.f3651a
            int r8 = r0.size()
        L_0x00ba:
            if (r10 >= r8) goto L_0x00cc
            java.lang.Object r9 = r0.get(r10)
            r11 = r9
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
            boolean r11 = r11.f3659d
            if (r11 == 0) goto L_0x00c9
            r12 = r9
            goto L_0x00cd
        L_0x00c9:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00cc:
            r12 = 0
        L_0x00cd:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            if (r12 != 0) goto L_0x00d2
            goto L_0x00e9
        L_0x00d2:
            long r8 = r12.f3656a
            r3.element = r8
            goto L_0x010b
        L_0x00d7:
            long r8 = com.google.android.play.core.appupdate.C15562d.m25184V(r13, r4)
            float r0 = p288y.C8343c.m16642c(r8)
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            r10 = r4
        L_0x00e5:
            r0 = r10 ^ 1
            if (r0 == 0) goto L_0x010b
        L_0x00e9:
            r12 = r13
        L_0x00ea:
            if (r12 != 0) goto L_0x00ef
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0100
        L_0x00ef:
            boolean r0 = r12.mo6615b()
            if (r0 == 0) goto L_0x00f8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0100
        L_0x00f8:
            boolean r0 = com.google.android.play.core.appupdate.C15562d.m25206v(r12)
            if (r0 == 0) goto L_0x0101
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0100:
            return r0
        L_0x0101:
            r1.invoke(r12)
            long r7 = r12.f3656a
            r3 = r5
            r0 = r6
            r5 = r7
            goto L_0x0061
        L_0x010b:
            r0 = r6
            r6 = r7
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1366i(androidx.compose.ui.input.pointer.c, long, kq.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: j */
    public static final boolean m1367j(C1640l lVar, long j) {
        C1644p pVar;
        List<C1644p> list = lVar.f3651a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pVar = null;
                break;
            }
            pVar = list.get(i);
            if (C1643o.m3516a(pVar.f3656a, j)) {
                break;
            }
            i++;
        }
        C1644p pVar2 = pVar;
        if (pVar2 != null && pVar2.f3659d) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: k */
    public static final float m1368k(C1843j1 j1Var, int i) {
        C19383o.m32797g(j1Var, "$this$pointerSlop");
        return i == 2 ? j1Var.mo6773e() * f1325a : j1Var.mo6773e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        if ((r10 ^ 1) != 0) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1369l(androidx.compose.p015ui.input.pointer.C1631c r17, long r18, p753kq.C19857l<? super androidx.compose.p015ui.input.pointer.C1644p, kotlin.C19394m> r20, kotlin.coroutines.C19340c<? super java.lang.Boolean> r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r3 = r1.L$3
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref$LongRef) r3
            java.lang.Object r5 = r1.L$2
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p015ui.input.pointer.C1631c) r5
            java.lang.Object r6 = r1.L$1
            androidx.compose.ui.input.pointer.c r6 = (androidx.compose.p015ui.input.pointer.C1631c) r6
            java.lang.Object r7 = r1.L$0
            kq.l r7 = (p753kq.C19857l) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            r16 = r2
            r2 = r1
            r1 = r7
            r7 = r5
            r5 = r16
            goto L_0x0082
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            androidx.compose.ui.input.pointer.l r0 = r17.mo6569g0()
            r5 = r18
            boolean r0 = m1367j(r0, r5)
            if (r0 == 0) goto L_0x005b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0100
        L_0x005b:
            r0 = r17
            r3 = r2
            r2 = r1
            r1 = r20
        L_0x0061:
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.element = r5
            r6 = r0
            r5 = r3
            r3 = r7
        L_0x006b:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.L$2 = r6
            r2.L$3 = r3
            r2.label = r4
            java.lang.Object r7 = r6.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r2)
            if (r7 != r5) goto L_0x007c
            return r5
        L_0x007c:
            r16 = r6
            r6 = r0
            r0 = r7
            r7 = r16
        L_0x0082:
            androidx.compose.ui.input.pointer.l r0 = (androidx.compose.p015ui.input.pointer.C1640l) r0
            java.util.List<androidx.compose.ui.input.pointer.p> r8 = r0.f3651a
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L_0x008c:
            if (r11 >= r9) goto L_0x00a7
            java.lang.Object r13 = r8.get(r11)
            r14 = r13
            androidx.compose.ui.input.pointer.p r14 = (androidx.compose.p015ui.input.pointer.C1644p) r14
            long r14 = r14.f3656a
            r18 = r13
            long r12 = r3.element
            boolean r12 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r14, r12)
            if (r12 == 0) goto L_0x00a4
            r13 = r18
            goto L_0x00a8
        L_0x00a4:
            int r11 = r11 + 1
            goto L_0x008c
        L_0x00a7:
            r13 = 0
        L_0x00a8:
            androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
            if (r13 != 0) goto L_0x00ae
            r12 = 0
            goto L_0x00ea
        L_0x00ae:
            boolean r8 = com.google.android.play.core.appupdate.C15562d.m25206v(r13)
            if (r8 == 0) goto L_0x00d7
            java.util.List<androidx.compose.ui.input.pointer.p> r0 = r0.f3651a
            int r8 = r0.size()
        L_0x00ba:
            if (r10 >= r8) goto L_0x00cc
            java.lang.Object r9 = r0.get(r10)
            r11 = r9
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
            boolean r11 = r11.f3659d
            if (r11 == 0) goto L_0x00c9
            r12 = r9
            goto L_0x00cd
        L_0x00c9:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00cc:
            r12 = 0
        L_0x00cd:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            if (r12 != 0) goto L_0x00d2
            goto L_0x00e9
        L_0x00d2:
            long r8 = r12.f3656a
            r3.element = r8
            goto L_0x010b
        L_0x00d7:
            long r8 = com.google.android.play.core.appupdate.C15562d.m25184V(r13, r4)
            float r0 = p288y.C8343c.m16643d(r8)
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            r10 = r4
        L_0x00e5:
            r0 = r10 ^ 1
            if (r0 == 0) goto L_0x010b
        L_0x00e9:
            r12 = r13
        L_0x00ea:
            if (r12 != 0) goto L_0x00ef
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0100
        L_0x00ef:
            boolean r0 = r12.mo6615b()
            if (r0 == 0) goto L_0x00f8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0100
        L_0x00f8:
            boolean r0 = com.google.android.play.core.appupdate.C15562d.m25206v(r12)
            if (r0 == 0) goto L_0x0101
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0100:
            return r0
        L_0x0101:
            r1.invoke(r12)
            long r7 = r12.f3656a
            r3 = r5
            r0 = r6
            r5 = r7
            goto L_0x0061
        L_0x010b:
            r0 = r6
            r6 = r7
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m1369l(androidx.compose.ui.input.pointer.c, long, kq.l, kotlin.coroutines.c):java.lang.Object");
    }
}
