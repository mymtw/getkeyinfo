package androidx.compose.foundation.text.selection;

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

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", mo70541f = "TextSelectionMouseDetector.kt", mo70542l = {87}, mo70543m = "invokeSuspend")
public final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1008d $observer;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", mo70541f = "TextSelectionMouseDetector.kt", mo70542l = {90, 97, 112}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 */
    public static final class C10011 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C10011 r0 = new C10011(dVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C10011) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.compose.ui.input.pointer.c} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 3
                r5 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 == r5) goto L_0x0026
                if (r2 == r3) goto L_0x001a
                if (r2 != r4) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001a:
                java.lang.Object r2 = r0.L$1
                androidx.compose.foundation.text.selection.b r2 = (androidx.compose.foundation.text.selection.C1005b) r2
                java.lang.Object r6 = r0.L$0
                androidx.compose.ui.input.pointer.c r6 = (androidx.compose.p015ui.input.pointer.C1631c) r6
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)
                goto L_0x0046
            L_0x0026:
                java.lang.Object r2 = r0.L$1
                androidx.compose.foundation.text.selection.b r2 = (androidx.compose.foundation.text.selection.C1005b) r2
                java.lang.Object r6 = r0.L$0
                androidx.compose.ui.input.pointer.c r6 = (androidx.compose.p015ui.input.pointer.C1631c) r6
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)
                r8 = r17
                r7 = r0
                goto L_0x0054
            L_0x0035:
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)
                java.lang.Object r2 = r0.L$0
                r6 = r2
                androidx.compose.ui.input.pointer.c r6 = (androidx.compose.p015ui.input.pointer.C1631c) r6
                androidx.compose.foundation.text.selection.b r2 = new androidx.compose.foundation.text.selection.b
                androidx.compose.ui.platform.j1 r7 = r6.getViewConfiguration()
                r2.<init>(r7)
            L_0x0046:
                r7 = r0
            L_0x0047:
                r7.L$0 = r6
                r7.L$1 = r2
                r7.label = r5
                java.lang.Object r8 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.m2059a(r6, r7)
                if (r8 != r1) goto L_0x0054
                return r1
            L_0x0054:
                androidx.compose.ui.input.pointer.l r8 = (androidx.compose.p015ui.input.pointer.C1640l) r8
                r2.getClass()
                java.lang.String r9 = "event"
                kotlin.jvm.internal.C19383o.m32797g(r8, r9)
                androidx.compose.ui.input.pointer.p r9 = r2.f2114c
                java.util.List<androidx.compose.ui.input.pointer.p> r10 = r8.f3651a
                r11 = 0
                java.lang.Object r10 = r10.get(r11)
                androidx.compose.ui.input.pointer.p r10 = (androidx.compose.p015ui.input.pointer.C1644p) r10
                if (r9 == 0) goto L_0x00a2
                java.lang.String r12 = "newClick"
                kotlin.jvm.internal.C19383o.m32797g(r10, r12)
                long r12 = r10.f3657b
                long r14 = r9.f3657b
                long r12 = r12 - r14
                androidx.compose.ui.platform.j1 r14 = r2.f2112a
                long r14 = r14.mo6769a()
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L_0x0081
                r12 = r5
                goto L_0x0082
            L_0x0081:
                r12 = r11
            L_0x0082:
                if (r12 == 0) goto L_0x00a2
                long r12 = r10.f3658c
                long r14 = r9.f3658c
                long r12 = p288y.C8343c.m16644e(r12, r14)
                float r9 = p288y.C8343c.m16641b(r12)
                double r12 = (double) r9
                r14 = 4636737291354636288(0x4059000000000000, double:100.0)
                int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r9 >= 0) goto L_0x0099
                r9 = r5
                goto L_0x009a
            L_0x0099:
                r9 = r11
            L_0x009a:
                if (r9 == 0) goto L_0x00a2
                int r9 = r2.f2113b
                int r9 = r9 + r5
                r2.f2113b = r9
                goto L_0x00a4
            L_0x00a2:
                r2.f2113b = r5
            L_0x00a4:
                r2.f2114c = r10
                java.util.List<androidx.compose.ui.input.pointer.p> r8 = r8.f3651a
                java.lang.Object r8 = r8.get(r11)
                androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
                int r9 = r2.f2113b
                if (r9 == r5) goto L_0x00ba
                if (r9 == r3) goto L_0x00b7
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1 r9 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f2056d
                goto L_0x00bc
            L_0x00b7:
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1 r9 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f2055c
                goto L_0x00bc
            L_0x00ba:
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$c r9 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f2053a
            L_0x00bc:
                androidx.compose.foundation.text.selection.d r10 = r3
                long r11 = r8.f3658c
                boolean r10 = r10.mo4657b(r11, r9)
                if (r10 == 0) goto L_0x0047
                r8.mo6614a()
                long r10 = r8.f3656a
                androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1$2 r8 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1$2
                androidx.compose.foundation.text.selection.d r12 = r3
                r8.<init>(r12, r9)
                r7.L$0 = r6
                r7.L$1 = r2
                r7.label = r4
                java.lang.Object r8 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1365h(r6, r10, r8, r7)
                if (r8 != r1) goto L_0x0047
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.C10011.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextSelectionMouseDetectorKt$mouseSelectionDetector$2(C1008d dVar, C19340c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> cVar) {
        super(2, cVar);
        this.$observer = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, cVar);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C1008d dVar = this.$observer;
            C10011 r1 = new C10011((C19340c<? super C10011>) null);
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
