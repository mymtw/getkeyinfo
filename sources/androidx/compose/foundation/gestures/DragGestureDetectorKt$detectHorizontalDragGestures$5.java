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
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", mo70541f = "DragGestureDetector.kt", mo70542l = {575}, mo70543m = "invokeSuspend")
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<C19394m> $onDragCancel;
    public final /* synthetic */ C19846a<C19394m> $onDragEnd;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onDragStart;
    public final /* synthetic */ C19861p<C1644p, Float, C19394m> $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1", mo70541f = "DragGestureDetector.kt", mo70542l = {576, 578, 589}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 */
    public static final class C05681 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05681 r0 = new C05681(lVar, pVar, aVar, aVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C05681) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                androidx.compose.foundation.layout.C0761x.m1684O0(r13)
                goto L_0x009a
            L_0x0014:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001c:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.p015ui.input.pointer.C1631c) r3
                androidx.compose.foundation.layout.C0761x.m1684O0(r13)
                goto L_0x0067
            L_0x0028:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r13)
                goto L_0x0046
            L_0x0030:
                androidx.compose.foundation.layout.C0761x.m1684O0(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p015ui.input.pointer.C1631c) r13
                r1 = 0
                r12.L$0 = r13
                r12.label = r4
                java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1410b(r13, r1, r12)
                if (r1 != r0) goto L_0x0043
                return r0
            L_0x0043:
                r11 = r1
                r1 = r13
                r13 = r11
            L_0x0046:
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
                kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
                r10.<init>()
                long r5 = r13.f3656a
                int r7 = r13.f3663h
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1$drag$1
                r8.<init>(r10)
                r12.L$0 = r1
                r12.L$1 = r10
                r12.label = r3
                r4 = r1
                r9 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1360c(r4, r5, r7, r8, r9)
                if (r13 != r0) goto L_0x0065
                return r0
            L_0x0065:
                r3 = r1
                r1 = r10
            L_0x0067:
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
                if (r13 == 0) goto L_0x00ad
                kq.l<y.c, kotlin.m> r4 = r4
                long r5 = r13.f3658c
                y.c r7 = new y.c
                r7.<init>(r5)
                r4.invoke(r7)
                kq.p<androidx.compose.ui.input.pointer.p, java.lang.Float, kotlin.m> r4 = r5
                float r1 = r1.element
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r13, r5)
                long r4 = r13.f3656a
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1$1
                kq.p<androidx.compose.ui.input.pointer.p, java.lang.Float, kotlin.m> r1 = r5
                r13.<init>(r1)
                r1 = 0
                r12.L$0 = r1
                r12.L$1 = r1
                r12.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1366i(r3, r4, r13, r12)
                if (r13 != r0) goto L_0x009a
                return r0
            L_0x009a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x00a8
                kq.a<kotlin.m> r13 = r6
                r13.invoke()
                goto L_0x00ad
            L_0x00a8:
                kq.a<kotlin.m> r13 = r7
                r13.invoke()
            L_0x00ad:
                kotlin.m r13 = kotlin.C19394m.f43287a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.C05681.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5(C19857l<? super C8343c, C19394m> lVar, C19861p<? super C1644p, ? super Float, C19394m> pVar, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19340c<? super DragGestureDetectorKt$detectHorizontalDragGestures$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onHorizontalDrag = pVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, cVar);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19857l<C8343c, C19394m> lVar = this.$onDragStart;
            final C19861p<C1644p, Float, C19394m> pVar = this.$onHorizontalDrag;
            final C19846a<C19394m> aVar = this.$onDragEnd;
            final C19846a<C19394m> aVar2 = this.$onDragCancel;
            C05681 r3 = new C05681((C19340c<? super C05681>) null);
            this.label = 1;
            if (((C1652w) this.L$0).mo6563s0(r3, this) == coroutineSingletons) {
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
