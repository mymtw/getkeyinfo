package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", mo70541f = "LongPressTextDragObserver.kt", mo70542l = {98}, mo70543m = "invokeSuspend")
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0958l $observer;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", mo70541f = "LongPressTextDragObserver.kt", mo70542l = {99, 103}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1 */
    public static final class C09201 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C09201 r0 = new C09201(lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C09201) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[EDGE_INSN: B:30:0x0087->B:26:0x0087 ?: BREAK  , SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 == r4) goto L_0x0025
                if (r2 != r3) goto L_0x001d
                java.lang.Object r2 = r0.L$1
                androidx.compose.ui.input.pointer.p r2 = (androidx.compose.p015ui.input.pointer.C1644p) r2
                java.lang.Object r5 = r0.L$0
                androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p015ui.input.pointer.C1631c) r5
                androidx.compose.foundation.layout.C0761x.m1684O0(r18)
                r7 = r18
                r6 = r0
                goto L_0x005d
            L_0x001d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0025:
                java.lang.Object r2 = r0.L$0
                androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p015ui.input.pointer.C1631c) r2
                androidx.compose.foundation.layout.C0761x.m1684O0(r18)
                r5 = r18
                goto L_0x0041
            L_0x002f:
                androidx.compose.foundation.layout.C0761x.m1684O0(r18)
                java.lang.Object r2 = r0.L$0
                androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p015ui.input.pointer.C1631c) r2
                r0.L$0 = r2
                r0.label = r4
                java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m1410b(r2, r4, r0)
                if (r5 != r1) goto L_0x0041
                return r1
            L_0x0041:
                androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
                androidx.compose.foundation.text.l r6 = r3
                long r7 = r5.f3658c
                r6.mo4510a()
                r6 = r0
                r16 = r5
                r5 = r2
                r2 = r16
            L_0x0050:
                r6.L$0 = r5
                r6.L$1 = r2
                r6.label = r3
                java.lang.Object r7 = r5.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r6)
                if (r7 != r1) goto L_0x005d
                return r1
            L_0x005d:
                r8 = 0
                androidx.compose.ui.input.pointer.l r7 = (androidx.compose.p015ui.input.pointer.C1640l) r7
                java.util.List<androidx.compose.ui.input.pointer.p> r7 = r7.f3651a
                int r9 = r7.size()
                r10 = r8
            L_0x0067:
                if (r10 >= r9) goto L_0x0087
                java.lang.Object r11 = r7.get(r10)
                androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
                long r12 = r11.f3656a
                long r14 = r2.f3656a
                boolean r12 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r12, r14)
                if (r12 == 0) goto L_0x007f
                boolean r11 = r11.f3659d
                if (r11 == 0) goto L_0x007f
                r11 = r4
                goto L_0x0080
            L_0x007f:
                r11 = r8
            L_0x0080:
                if (r11 == 0) goto L_0x0084
                r8 = r4
                goto L_0x0087
            L_0x0084:
                int r10 = r10 + 1
                goto L_0x0067
            L_0x0087:
                if (r8 != 0) goto L_0x0050
                androidx.compose.foundation.text.l r1 = r3
                r1.mo4512c()
                kotlin.m r1 = kotlin.C19394m.f43287a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.C09201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(C0958l lVar, C19340c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.$observer = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, cVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0958l lVar = this.$observer;
            C09201 r1 = new C09201((C19340c<? super C09201>) null);
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
