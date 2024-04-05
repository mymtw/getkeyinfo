package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19863r;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", mo70541f = "TransformGestureDetector.kt", mo70542l = {52}, mo70543m = "invokeSuspend")
final class TransformGestureDetectorKt$detectTransformGestures$2 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19863r<C8343c, C8343c, Float, Float, C19394m> $onGesture;
    public final /* synthetic */ boolean $panZoomLock;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1", mo70541f = "TransformGestureDetector.kt", mo70542l = {60, 62}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1 */
    public static final class C05931 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        public float F$0;
        public float F$1;
        public float F$2;
        public int I$0;
        public int I$1;
        public long J$0;
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05931 r0 = new C05931(z, rVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C05931) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.input.pointer.c} */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0131, code lost:
            if (p288y.C8343c.m16640a(r6, p288y.C8343c.f18295b) == false) goto L_0x013f;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0089 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x00a6 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 0
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r7) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                int r2 = r0.I$1
                float r8 = r0.F$2
                int r9 = r0.I$0
                long r10 = r0.J$0
                float r12 = r0.F$1
                float r13 = r0.F$0
                java.lang.Object r14 = r0.L$0
                androidx.compose.ui.input.pointer.c r14 = (androidx.compose.p015ui.input.pointer.C1631c) r14
                androidx.compose.foundation.layout.C0761x.m1684O0(r23)
                r3 = r23
                r15 = r0
                goto L_0x008a
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0031:
                int r2 = r0.I$1
                float r8 = r0.F$2
                int r9 = r0.I$0
                long r10 = r0.J$0
                float r12 = r0.F$1
                float r13 = r0.F$0
                java.lang.Object r14 = r0.L$0
                androidx.compose.ui.input.pointer.c r14 = (androidx.compose.p015ui.input.pointer.C1631c) r14
                androidx.compose.foundation.layout.C0761x.m1684O0(r23)
                goto L_0x0072
            L_0x0045:
                androidx.compose.foundation.layout.C0761x.m1684O0(r23)
                java.lang.Object r2 = r0.L$0
                r14 = r2
                androidx.compose.ui.input.pointer.c r14 = (androidx.compose.p015ui.input.pointer.C1631c) r14
                long r10 = p288y.C8343c.f18295b
                androidx.compose.ui.platform.j1 r2 = r14.getViewConfiguration()
                float r8 = r2.mo6773e()
                r0.L$0 = r14
                r0.F$0 = r5
                r0.F$1 = r4
                r0.J$0 = r10
                r0.I$0 = r6
                r0.F$2 = r8
                r0.I$1 = r6
                r0.label = r7
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1410b(r14, r6, r0)
                if (r2 != r1) goto L_0x006e
                return r1
            L_0x006e:
                r12 = r4
                r13 = r5
                r2 = r6
                r9 = r2
            L_0x0072:
                r15 = r0
            L_0x0073:
                r15.L$0 = r14
                r15.F$0 = r13
                r15.F$1 = r12
                r15.J$0 = r10
                r15.I$0 = r9
                r15.F$2 = r8
                r15.I$1 = r2
                r15.label = r3
                java.lang.Object r3 = r14.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r15)
                if (r3 != r1) goto L_0x008a
                return r1
            L_0x008a:
                androidx.compose.ui.input.pointer.l r3 = (androidx.compose.p015ui.input.pointer.C1640l) r3
                java.util.List<androidx.compose.ui.input.pointer.p> r4 = r3.f3651a
                int r5 = r4.size()
                r7 = r6
            L_0x0093:
                if (r7 >= r5) goto L_0x00a6
                java.lang.Object r18 = r4.get(r7)
                androidx.compose.ui.input.pointer.p r18 = (androidx.compose.p015ui.input.pointer.C1644p) r18
                boolean r18 = r18.mo6615b()
                if (r18 == 0) goto L_0x00a3
                r4 = 1
                goto L_0x00a7
            L_0x00a3:
                int r7 = r7 + 1
                goto L_0x0093
            L_0x00a6:
                r4 = r6
            L_0x00a7:
                if (r4 != 0) goto L_0x019b
                float r5 = kotlin.reflect.C19421p.m32916D(r3)
                float r7 = kotlin.reflect.C19421p.m32915C(r3)
                r23 = r7
                long r6 = kotlin.reflect.C19421p.m32914B(r3)
                if (r9 != 0) goto L_0x00fb
                float r12 = r12 * r5
                float r13 = r13 + r23
                long r10 = p288y.C8343c.m16645f(r10, r6)
                r0 = 0
                float r19 = kotlin.reflect.C19421p.m32913A(r3, r0)
                r20 = r1
                r0 = 1
                float r1 = (float) r0
                float r1 = r1 - r12
                float r0 = java.lang.Math.abs(r1)
                float r0 = r0 * r19
                r1 = 1078530011(0x40490fdb, float:3.1415927)
                float r1 = r1 * r13
                float r1 = r1 * r19
                r19 = 1127481344(0x43340000, float:180.0)
                float r1 = r1 / r19
                float r1 = java.lang.Math.abs(r1)
                float r19 = p288y.C8343c.m16641b(r10)
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x00ee
                int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x00ee
                int r0 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x00fd
            L_0x00ee:
                boolean r0 = r3
                if (r0 == 0) goto L_0x00f8
                int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x00f8
                r2 = 1
                goto L_0x00f9
            L_0x00f8:
                r2 = 0
            L_0x00f9:
                r9 = 1
                goto L_0x00fd
            L_0x00fb:
                r20 = r1
            L_0x00fd:
                if (r9 == 0) goto L_0x018a
                r1 = r8
                r19 = r9
                r0 = 0
                long r8 = kotlin.reflect.C19421p.m32961z(r3, r0)
                if (r2 == 0) goto L_0x010b
                r0 = 0
                goto L_0x010d
            L_0x010b:
                r0 = r23
            L_0x010d:
                r17 = 0
                int r21 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
                if (r21 != 0) goto L_0x0116
                r21 = 1
                goto L_0x0118
            L_0x0116:
                r21 = 0
            L_0x0118:
                if (r21 == 0) goto L_0x0139
                r16 = 1065353216(0x3f800000, float:1.0)
                int r21 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
                if (r21 != 0) goto L_0x0123
                r21 = 1
                goto L_0x0125
            L_0x0123:
                r21 = 0
            L_0x0125:
                if (r21 == 0) goto L_0x0134
                r21 = r1
                r23 = r2
                long r1 = p288y.C8343c.f18295b
                boolean r1 = p288y.C8343c.m16640a(r6, r1)
                if (r1 != 0) goto L_0x0158
                goto L_0x013f
            L_0x0134:
                r21 = r1
                r23 = r2
                goto L_0x013f
            L_0x0139:
                r21 = r1
                r23 = r2
                r16 = 1065353216(0x3f800000, float:1.0)
            L_0x013f:
                kq.r<y.c, y.c, java.lang.Float, java.lang.Float, kotlin.m> r1 = r4
                y.c r2 = new y.c
                r2.<init>(r8)
                y.c r8 = new y.c
                r8.<init>(r6)
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r5)
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r0)
                r1.invoke(r2, r8, r6, r5)
            L_0x0158:
                java.util.List<androidx.compose.ui.input.pointer.p> r0 = r3.f3651a
                int r1 = r0.size()
                r2 = 0
            L_0x015f:
                if (r2 >= r1) goto L_0x0187
                java.lang.Object r5 = r0.get(r2)
                androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
                java.lang.String r6 = "<this>"
                kotlin.jvm.internal.C19383o.m32797g(r5, r6)
                r6 = 0
                long r7 = com.google.android.play.core.appupdate.C15562d.m25184V(r5, r6)
                r9 = r0
                r18 = r1
                long r0 = p288y.C8343c.f18295b
                boolean r0 = p288y.C8343c.m16640a(r7, r0)
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x0181
                r5.mo6614a()
            L_0x0181:
                int r2 = r2 + 1
                r0 = r9
                r1 = r18
                goto L_0x015f
            L_0x0187:
                r1 = 1
                r6 = 0
                goto L_0x0196
            L_0x018a:
                r23 = r2
                r21 = r8
                r19 = r9
                r1 = 1
                r6 = 0
                r16 = 1065353216(0x3f800000, float:1.0)
                r17 = 0
            L_0x0196:
                r2 = r23
                r9 = r19
                goto L_0x01a4
            L_0x019b:
                r20 = r1
                r21 = r8
                r1 = 1
                r16 = 1065353216(0x3f800000, float:1.0)
                r17 = 0
            L_0x01a4:
                if (r4 != 0) goto L_0x01d0
                java.util.List<androidx.compose.ui.input.pointer.p> r0 = r3.f3651a
                int r3 = r0.size()
                r4 = r6
            L_0x01ad:
                if (r4 >= r3) goto L_0x01be
                java.lang.Object r5 = r0.get(r4)
                androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
                boolean r5 = r5.f3659d
                if (r5 == 0) goto L_0x01bb
                r0 = r1
                goto L_0x01bf
            L_0x01bb:
                int r4 = r4 + 1
                goto L_0x01ad
            L_0x01be:
                r0 = r6
            L_0x01bf:
                if (r0 != 0) goto L_0x01c2
                goto L_0x01d0
            L_0x01c2:
                r0 = r22
                r7 = r1
                r4 = r16
                r5 = r17
                r1 = r20
                r8 = r21
                r3 = 2
                goto L_0x0073
            L_0x01d0:
                kotlin.m r0 = kotlin.C19394m.f43287a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.C05931.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z, C19863r<? super C8343c, ? super C8343c, ? super Float, ? super Float, C19394m> rVar, C19340c<? super TransformGestureDetectorKt$detectTransformGestures$2> cVar) {
        super(2, cVar);
        this.$panZoomLock = z;
        this.$onGesture = rVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, cVar);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final boolean z = this.$panZoomLock;
            final C19863r<C8343c, C8343c, Float, Float, C19394m> rVar = this.$onGesture;
            C05931 r1 = new C05931((C19340c<? super C05931>) null);
            this.label = 1;
            if (((C1652w) this.L$0).mo6563s0(r1, this) == coroutineSingletons) {
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
