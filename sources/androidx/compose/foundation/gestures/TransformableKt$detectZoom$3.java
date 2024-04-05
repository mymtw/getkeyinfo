package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3", mo70541f = "Transformable.kt", mo70542l = {101}, mo70543m = "invokeSuspend")
final class TransformableKt$detectZoom$3 extends SuspendLambda implements C19861p<C0617o, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Ref$BooleanRef $lockedToPanZoom;
    public final /* synthetic */ Ref$LongRef $pan;
    public final /* synthetic */ C1342k1<Boolean> $panZoomLock;
    public final /* synthetic */ Ref$BooleanRef $pastTouchSlop;
    public final /* synthetic */ Ref$FloatRef $rotation;
    public final /* synthetic */ C1652w $this_detectZoom;
    public final /* synthetic */ float $touchSlop;
    public final /* synthetic */ Ref$FloatRef $zoom;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1", mo70541f = "Transformable.kt", mo70542l = {103}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1 */
    public static final class C05941 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05941 r0 = new C05941(ref$BooleanRef, ref$FloatRef, ref$FloatRef2, ref$LongRef, f, ref$BooleanRef2, k1Var, oVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C05941) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
            if (p288y.C8343c.m16640a(r10, p288y.C8343c.f18295b) != false) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x013f, code lost:
            if (r8 == false) goto L_0x0141;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x004e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x001e
                if (r2 != r3) goto L_0x0016
                java.lang.Object r2 = r0.L$0
                androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p015ui.input.pointer.C1631c) r2
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)
                r5 = r17
                r4 = r0
                goto L_0x0031
            L_0x0016:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001e:
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)
                java.lang.Object r2 = r0.L$0
                androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p015ui.input.pointer.C1631c) r2
                r4 = r0
            L_0x0026:
                r4.L$0 = r2
                r4.label = r3
                java.lang.Object r5 = r2.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r4)
                if (r5 != r1) goto L_0x0031
                return r1
            L_0x0031:
                androidx.compose.ui.input.pointer.l r5 = (androidx.compose.p015ui.input.pointer.C1640l) r5
                java.util.List<androidx.compose.ui.input.pointer.p> r6 = r5.f3651a
                int r7 = r6.size()
                r8 = 0
                r9 = r8
            L_0x003b:
                if (r9 >= r7) goto L_0x004e
                java.lang.Object r10 = r6.get(r9)
                androidx.compose.ui.input.pointer.p r10 = (androidx.compose.p015ui.input.pointer.C1644p) r10
                boolean r10 = r10.mo6615b()
                if (r10 == 0) goto L_0x004b
                r6 = r3
                goto L_0x004f
            L_0x004b:
                int r9 = r9 + 1
                goto L_0x003b
            L_0x004e:
                r6 = r8
            L_0x004f:
                if (r6 != 0) goto L_0x0125
                float r7 = kotlin.reflect.C19421p.m32916D(r5)
                float r9 = kotlin.reflect.C19421p.m32915C(r5)
                long r10 = kotlin.reflect.C19421p.m32914B(r5)
                kotlin.jvm.internal.Ref$BooleanRef r12 = r4
                boolean r12 = r12.element
                if (r12 != 0) goto L_0x00cf
                kotlin.jvm.internal.Ref$FloatRef r12 = r5
                float r13 = r12.element
                float r13 = r13 * r7
                r12.element = r13
                kotlin.jvm.internal.Ref$FloatRef r12 = r6
                float r13 = r12.element
                float r13 = r13 + r9
                r12.element = r13
                kotlin.jvm.internal.Ref$LongRef r12 = r7
                long r13 = r12.element
                long r13 = p288y.C8343c.m16645f(r13, r10)
                r12.element = r13
                float r12 = kotlin.reflect.C19421p.m32913A(r5, r8)
                float r13 = (float) r3
                kotlin.jvm.internal.Ref$FloatRef r14 = r5
                float r14 = r14.element
                float r13 = r13 - r14
                float r13 = java.lang.Math.abs(r13)
                float r13 = r13 * r12
                kotlin.jvm.internal.Ref$FloatRef r14 = r6
                float r14 = r14.element
                r15 = 1078530011(0x40490fdb, float:3.1415927)
                float r14 = r14 * r15
                float r14 = r14 * r12
                r12 = 1127481344(0x43340000, float:180.0)
                float r14 = r14 / r12
                float r12 = java.lang.Math.abs(r14)
                kotlin.jvm.internal.Ref$LongRef r14 = r7
                long r14 = r14.element
                float r14 = p288y.C8343c.m16641b(r14)
                float r15 = r8
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 > 0) goto L_0x00b0
                int r13 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
                if (r13 > 0) goto L_0x00b0
                int r13 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
                if (r13 <= 0) goto L_0x00cf
            L_0x00b0:
                kotlin.jvm.internal.Ref$BooleanRef r13 = r4
                r13.element = r3
                kotlin.jvm.internal.Ref$BooleanRef r13 = r9
                androidx.compose.runtime.k1<java.lang.Boolean> r14 = r10
                java.lang.Object r14 = r14.getValue()
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L_0x00cc
                float r14 = r8
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L_0x00cc
                r12 = r3
                goto L_0x00cd
            L_0x00cc:
                r12 = r8
            L_0x00cd:
                r13.element = r12
            L_0x00cf:
                kotlin.jvm.internal.Ref$BooleanRef r12 = r4
                boolean r12 = r12.element
                if (r12 == 0) goto L_0x0125
                kotlin.jvm.internal.Ref$BooleanRef r12 = r9
                boolean r12 = r12.element
                r13 = 0
                if (r12 == 0) goto L_0x00dd
                r9 = r13
            L_0x00dd:
                int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r9 != 0) goto L_0x00e3
                r9 = r3
                goto L_0x00e4
            L_0x00e3:
                r9 = r8
            L_0x00e4:
                if (r9 == 0) goto L_0x00f9
                r9 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 != 0) goto L_0x00ee
                r7 = r3
                goto L_0x00ef
            L_0x00ee:
                r7 = r8
            L_0x00ef:
                if (r7 == 0) goto L_0x00f9
                long r12 = p288y.C8343c.f18295b
                boolean r7 = p288y.C8343c.m16640a(r10, r12)
                if (r7 != 0) goto L_0x00fe
            L_0x00f9:
                androidx.compose.foundation.gestures.o r7 = r11
                r7.mo3862b()
            L_0x00fe:
                java.util.List<androidx.compose.ui.input.pointer.p> r7 = r5.f3651a
                int r9 = r7.size()
                r10 = r8
            L_0x0105:
                if (r10 >= r9) goto L_0x0125
                java.lang.Object r11 = r7.get(r10)
                androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
                java.lang.String r12 = "<this>"
                kotlin.jvm.internal.C19383o.m32797g(r11, r12)
                long r12 = com.google.android.play.core.appupdate.C15562d.m25184V(r11, r8)
                long r14 = p288y.C8343c.f18295b
                boolean r12 = p288y.C8343c.m16640a(r12, r14)
                r12 = r12 ^ r3
                if (r12 == 0) goto L_0x0122
                r11.mo6614a()
            L_0x0122:
                int r10 = r10 + 1
                goto L_0x0105
            L_0x0125:
                if (r6 != 0) goto L_0x0141
                java.util.List<androidx.compose.ui.input.pointer.p> r5 = r5.f3651a
                int r6 = r5.size()
                r7 = r8
            L_0x012e:
                if (r7 >= r6) goto L_0x013f
                java.lang.Object r9 = r5.get(r7)
                androidx.compose.ui.input.pointer.p r9 = (androidx.compose.p015ui.input.pointer.C1644p) r9
                boolean r9 = r9.f3659d
                if (r9 == 0) goto L_0x013c
                r8 = r3
                goto L_0x013f
            L_0x013c:
                int r7 = r7 + 1
                goto L_0x012e
            L_0x013f:
                if (r8 != 0) goto L_0x0026
            L_0x0141:
                kotlin.m r1 = kotlin.C19394m.f43287a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3.C05941.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectZoom$3(C1652w wVar, Ref$BooleanRef ref$BooleanRef, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$LongRef ref$LongRef, float f, Ref$BooleanRef ref$BooleanRef2, C1342k1<Boolean> k1Var, C19340c<? super TransformableKt$detectZoom$3> cVar) {
        super(2, cVar);
        this.$this_detectZoom = wVar;
        this.$pastTouchSlop = ref$BooleanRef;
        this.$zoom = ref$FloatRef;
        this.$rotation = ref$FloatRef2;
        this.$pan = ref$LongRef;
        this.$touchSlop = f;
        this.$lockedToPanZoom = ref$BooleanRef2;
        this.$panZoomLock = k1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TransformableKt$detectZoom$3 transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(this.$this_detectZoom, this.$pastTouchSlop, this.$zoom, this.$rotation, this.$pan, this.$touchSlop, this.$lockedToPanZoom, this.$panZoomLock, cVar);
        transformableKt$detectZoom$3.L$0 = obj;
        return transformableKt$detectZoom$3;
    }

    public final Object invoke(C0617o oVar, C19340c<? super C19394m> cVar) {
        return ((TransformableKt$detectZoom$3) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0617o oVar = (C0617o) this.L$0;
            C1652w wVar = this.$this_detectZoom;
            final Ref$BooleanRef ref$BooleanRef = this.$pastTouchSlop;
            final Ref$FloatRef ref$FloatRef = this.$zoom;
            final Ref$FloatRef ref$FloatRef2 = this.$rotation;
            final Ref$LongRef ref$LongRef = this.$pan;
            final float f = this.$touchSlop;
            final Ref$BooleanRef ref$BooleanRef2 = this.$lockedToPanZoom;
            final C1342k1<Boolean> k1Var = this.$panZoomLock;
            C05941 r3 = new C05941((C19340c<? super C05941>) null);
            this.label = 1;
            if (wVar.mo6563s0(r3, this) == coroutineSingletons) {
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
