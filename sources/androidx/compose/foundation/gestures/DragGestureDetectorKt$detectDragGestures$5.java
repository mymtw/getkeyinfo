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

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", mo70541f = "DragGestureDetector.kt", mo70542l = {224}, mo70543m = "invokeSuspend")
public final class DragGestureDetectorKt$detectDragGestures$5 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C1644p, C8343c, C19394m> $onDrag;
    public final /* synthetic */ C19846a<C19394m> $onDragCancel;
    public final /* synthetic */ C19846a<C19394m> $onDragEnd;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onDragStart;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", mo70541f = "DragGestureDetector.kt", mo70542l = {225, 229, 241}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1 */
    public static final class C05631 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05631 r0 = new C05631(lVar, pVar, aVar, aVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C05631) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: androidx.compose.ui.input.pointer.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r13.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0036
                if (r1 == r4) goto L_0x002e
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                androidx.compose.foundation.layout.C0761x.m1684O0(r14)
                r11 = r13
                goto L_0x00b9
            L_0x0015:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001d:
                java.lang.Object r1 = r13.L$2
                kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
                java.lang.Object r4 = r13.L$1
                androidx.compose.ui.input.pointer.p r4 = (androidx.compose.p015ui.input.pointer.C1644p) r4
                java.lang.Object r5 = r13.L$0
                androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p015ui.input.pointer.C1631c) r5
                androidx.compose.foundation.layout.C0761x.m1684O0(r14)
                r11 = r13
                goto L_0x0079
            L_0x002e:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r14)
                goto L_0x004a
            L_0x0036:
                androidx.compose.foundation.layout.C0761x.m1684O0(r14)
                java.lang.Object r14 = r13.L$0
                r1 = r14
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
                r14 = 0
                r13.L$0 = r1
                r13.label = r4
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1410b(r1, r14, r13)
                if (r14 != r0) goto L_0x004a
                return r0
            L_0x004a:
                androidx.compose.ui.input.pointer.p r14 = (androidx.compose.p015ui.input.pointer.C1644p) r14
                kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
                r4.<init>()
                int r5 = p288y.C8343c.f18298e
                long r5 = p288y.C8343c.f18295b
                r4.element = r5
                r11 = r13
                r12 = r4
                r4 = r14
                r14 = r1
                r1 = r12
            L_0x005c:
                long r6 = r4.f3656a
                int r8 = r4.f3663h
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$1 r9 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$1
                r9.<init>(r1)
                r11.L$0 = r14
                r11.L$1 = r4
                r11.L$2 = r1
                r11.label = r3
                r5 = r14
                r10 = r11
                java.lang.Object r5 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1361d(r5, r6, r8, r9, r10)
                if (r5 != r0) goto L_0x0076
                return r0
            L_0x0076:
                r12 = r5
                r5 = r14
                r14 = r12
            L_0x0079:
                androidx.compose.ui.input.pointer.p r14 = (androidx.compose.p015ui.input.pointer.C1644p) r14
                if (r14 == 0) goto L_0x0086
                boolean r6 = r14.mo6615b()
                if (r6 == 0) goto L_0x0084
                goto L_0x0086
            L_0x0084:
                r14 = r5
                goto L_0x005c
            L_0x0086:
                if (r14 == 0) goto L_0x00cc
                kq.l<y.c, kotlin.m> r3 = r4
                long r6 = r14.f3658c
                y.c r4 = new y.c
                r4.<init>(r6)
                r3.invoke(r4)
                kq.p<androidx.compose.ui.input.pointer.p, y.c, kotlin.m> r3 = r5
                long r6 = r1.element
                y.c r1 = new y.c
                r1.<init>(r6)
                r3.invoke(r14, r1)
                long r3 = r14.f3656a
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$2 r14 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$2
                kq.p<androidx.compose.ui.input.pointer.p, y.c, kotlin.m> r1 = r5
                r14.<init>(r1)
                r1 = 0
                r11.L$0 = r1
                r11.L$1 = r1
                r11.L$2 = r1
                r11.label = r2
                java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1365h(r5, r3, r14, r11)
                if (r14 != r0) goto L_0x00b9
                return r0
            L_0x00b9:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 != 0) goto L_0x00c7
                kq.a<kotlin.m> r14 = r6
                r14.invoke()
                goto L_0x00cc
            L_0x00c7:
                kq.a<kotlin.m> r14 = r7
                r14.invoke()
            L_0x00cc:
                kotlin.m r14 = kotlin.C19394m.f43287a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.C05631.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(C19857l<? super C8343c, C19394m> lVar, C19861p<? super C1644p, ? super C8343c, C19394m> pVar, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19340c<? super DragGestureDetectorKt$detectDragGestures$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onDrag = pVar;
        this.$onDragCancel = aVar;
        this.$onDragEnd = aVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, cVar);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19857l<C8343c, C19394m> lVar = this.$onDragStart;
            final C19861p<C1644p, C8343c, C19394m> pVar = this.$onDrag;
            final C19846a<C19394m> aVar = this.$onDragCancel;
            final C19846a<C19394m> aVar2 = this.$onDragEnd;
            C05631 r3 = new C05631((C19340c<? super C05631>) null);
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
