package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", mo70541f = "DragGestureDetector.kt", mo70542l = {755}, mo70543m = "invokeSuspend")
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Ref$ObjectRef<C1644p> $currentDown;
    public final /* synthetic */ Ref$ObjectRef<C1644p> $longPress;
    public final /* synthetic */ C1652w $this_awaitLongPressOrCancellation;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", mo70541f = "DragGestureDetector.kt", mo70542l = {758, 775}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1 */
    public static final class C05621 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05621 r0 = new C05621(ref$ObjectRef, ref$ObjectRef2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C05621) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0075 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00a8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00db A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 == r6) goto L_0x0029
                if (r2 != r3) goto L_0x0021
                int r2 = r0.I$0
                java.lang.Object r7 = r0.L$1
                androidx.compose.ui.input.pointer.l r7 = (androidx.compose.p015ui.input.pointer.C1640l) r7
                java.lang.Object r8 = r0.L$0
                androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p015ui.input.pointer.C1631c) r8
                androidx.compose.foundation.layout.C0761x.m1684O0(r18)
                r4 = r18
                r5 = r0
                goto L_0x00bf
            L_0x0021:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0029:
                int r2 = r0.I$0
                java.lang.Object r7 = r0.L$0
                androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p015ui.input.pointer.C1631c) r7
                androidx.compose.foundation.layout.C0761x.m1684O0(r18)
                r9 = r18
                r8 = r7
                r7 = r0
                goto L_0x0059
            L_0x0037:
                androidx.compose.foundation.layout.C0761x.m1684O0(r18)
                java.lang.Object r2 = r0.L$0
                androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p015ui.input.pointer.C1631c) r2
                r8 = r0
                r7 = r2
                r2 = 0
            L_0x0041:
                if (r2 != 0) goto L_0x0149
                androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.p015ui.input.pointer.PointerEventPass.Main
                r8.L$0 = r7
                r8.L$1 = r4
                r8.I$0 = r2
                r8.label = r6
                java.lang.Object r9 = r7.mo6568f0(r9, r8)
                if (r9 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r16 = r8
                r8 = r7
                r7 = r16
            L_0x0059:
                androidx.compose.ui.input.pointer.l r9 = (androidx.compose.p015ui.input.pointer.C1640l) r9
                java.util.List<androidx.compose.ui.input.pointer.p> r10 = r9.f3651a
                int r11 = r10.size()
                r12 = 0
            L_0x0062:
                if (r12 >= r11) goto L_0x0075
                java.lang.Object r13 = r10.get(r12)
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
                boolean r13 = com.google.android.play.core.appupdate.C15562d.m25206v(r13)
                if (r13 != 0) goto L_0x0072
                r10 = 0
                goto L_0x0076
            L_0x0072:
                int r12 = r12 + 1
                goto L_0x0062
            L_0x0075:
                r10 = r6
            L_0x0076:
                if (r10 == 0) goto L_0x0079
                r2 = r6
            L_0x0079:
                java.util.List<androidx.compose.ui.input.pointer.p> r10 = r9.f3651a
                int r11 = r10.size()
                r12 = 0
            L_0x0080:
                if (r12 >= r11) goto L_0x00a8
                java.lang.Object r13 = r10.get(r12)
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
                boolean r14 = r13.mo6615b()
                if (r14 != 0) goto L_0x009f
                long r14 = r8.mo6566a()
                long r4 = r8.mo6565R()
                boolean r4 = com.google.android.play.core.appupdate.C15562d.m25180R(r13, r14, r4)
                if (r4 == 0) goto L_0x009d
                goto L_0x009f
            L_0x009d:
                r4 = 0
                goto L_0x00a0
            L_0x009f:
                r4 = r6
            L_0x00a0:
                if (r4 == 0) goto L_0x00a4
                r4 = r6
                goto L_0x00a9
            L_0x00a4:
                int r12 = r12 + 1
                r4 = 0
                goto L_0x0080
            L_0x00a8:
                r4 = 0
            L_0x00a9:
                if (r4 == 0) goto L_0x00ac
                r2 = r6
            L_0x00ac:
                androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
                r7.L$0 = r8
                r7.L$1 = r9
                r7.I$0 = r2
                r7.label = r3
                java.lang.Object r4 = r8.mo6568f0(r4, r7)
                if (r4 != r1) goto L_0x00bd
                return r1
            L_0x00bd:
                r5 = r7
                r7 = r9
            L_0x00bf:
                androidx.compose.ui.input.pointer.l r4 = (androidx.compose.p015ui.input.pointer.C1640l) r4
                java.util.List<androidx.compose.ui.input.pointer.p> r4 = r4.f3651a
                int r9 = r4.size()
                r10 = 0
            L_0x00c8:
                if (r10 >= r9) goto L_0x00db
                java.lang.Object r11 = r4.get(r10)
                androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
                boolean r11 = r11.mo6615b()
                if (r11 == 0) goto L_0x00d8
                r4 = r6
                goto L_0x00dc
            L_0x00d8:
                int r10 = r10 + 1
                goto L_0x00c8
            L_0x00db:
                r4 = 0
            L_0x00dc:
                if (r4 == 0) goto L_0x00df
                r2 = r6
            L_0x00df:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.p> r4 = r3
                T r4 = r4.element
                androidx.compose.ui.input.pointer.p r4 = (androidx.compose.p015ui.input.pointer.C1644p) r4
                long r9 = r4.f3656a
                boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1367j(r7, r9)
                if (r4 != 0) goto L_0x011c
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.p> r4 = r4
                java.util.List<androidx.compose.ui.input.pointer.p> r7 = r7.f3651a
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.p> r9 = r3
                int r10 = r7.size()
                r11 = 0
            L_0x00f8:
                if (r11 >= r10) goto L_0x0118
                java.lang.Object r12 = r7.get(r11)
                r13 = r12
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
                long r13 = r13.f3656a
                T r15 = r9.element
                androidx.compose.ui.input.pointer.p r15 = (androidx.compose.p015ui.input.pointer.C1644p) r15
                r18 = r7
                long r6 = r15.f3656a
                boolean r6 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r13, r6)
                if (r6 == 0) goto L_0x0112
                goto L_0x0119
            L_0x0112:
                int r11 = r11 + 1
                r7 = r18
                r6 = 1
                goto L_0x00f8
            L_0x0118:
                r12 = 0
            L_0x0119:
                r4.element = r12
                goto L_0x0143
            L_0x011c:
                java.util.List<androidx.compose.ui.input.pointer.p> r4 = r7.f3651a
                int r6 = r4.size()
                r7 = 0
            L_0x0123:
                if (r7 >= r6) goto L_0x0134
                java.lang.Object r9 = r4.get(r7)
                r10 = r9
                androidx.compose.ui.input.pointer.p r10 = (androidx.compose.p015ui.input.pointer.C1644p) r10
                boolean r10 = r10.f3659d
                if (r10 == 0) goto L_0x0131
                goto L_0x0135
            L_0x0131:
                int r7 = r7 + 1
                goto L_0x0123
            L_0x0134:
                r9 = 0
            L_0x0135:
                androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
                if (r9 == 0) goto L_0x0142
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.p> r4 = r3
                r4.element = r9
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.p> r4 = r4
                r4.element = r9
                goto L_0x0143
            L_0x0142:
                r2 = 1
            L_0x0143:
                r7 = r8
                r4 = 0
                r6 = 1
                r8 = r5
                goto L_0x0041
            L_0x0149:
                kotlin.m r1 = kotlin.C19394m.f43287a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.C05621.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(C1652w wVar, Ref$ObjectRef<C1644p> ref$ObjectRef, Ref$ObjectRef<C1644p> ref$ObjectRef2, C19340c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> cVar) {
        super(2, cVar);
        this.$this_awaitLongPressOrCancellation = wVar;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$this_awaitLongPressOrCancellation, this.$currentDown, this.$longPress, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1652w wVar = this.$this_awaitLongPressOrCancellation;
            final Ref$ObjectRef<C1644p> ref$ObjectRef = this.$currentDown;
            final Ref$ObjectRef<C1644p> ref$ObjectRef2 = this.$longPress;
            C05621 r1 = new C05621((C19340c<? super C05621>) null);
            this.label = 1;
            if (wVar.mo6563s0(r1, this) == coroutineSingletons) {
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
