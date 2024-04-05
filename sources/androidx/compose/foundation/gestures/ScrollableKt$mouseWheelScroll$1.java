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
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", mo70541f = "Scrollable.kt", mo70542l = {271}, mo70543m = "invokeSuspend")
final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0613k $mouseWheelScrollConfig;
    public final /* synthetic */ C1342k1<ScrollingLogic> $scrollingLogicState;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", mo70541f = "Scrollable.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1 */
    public static final class C05811 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05811 r0 = new C05811(kVar, k1Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C05811) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0053 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L_0x0035
            L_0x0014:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001c:
                androidx.compose.foundation.layout.C0761x.m1684O0(r11)
                java.lang.Object r11 = r10.L$0
                androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
                r1 = r11
                r11 = r10
            L_0x0025:
                r11.L$0 = r1
                r11.label = r2
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.m1397a(r1, r11)
                if (r3 != r0) goto L_0x0030
                return r0
            L_0x0030:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L_0x0035:
                androidx.compose.ui.input.pointer.l r11 = (androidx.compose.p015ui.input.pointer.C1640l) r11
                java.util.List<androidx.compose.ui.input.pointer.p> r4 = r11.f3651a
                int r5 = r4.size()
                r6 = 0
                r7 = r6
            L_0x003f:
                if (r7 >= r5) goto L_0x0053
                java.lang.Object r8 = r4.get(r7)
                androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
                boolean r8 = r8.mo6615b()
                r8 = r8 ^ r2
                if (r8 != 0) goto L_0x0050
                r4 = r6
                goto L_0x0054
            L_0x0050:
                int r7 = r7 + 1
                goto L_0x003f
            L_0x0053:
                r4 = r2
            L_0x0054:
                if (r4 == 0) goto L_0x0096
                androidx.compose.foundation.gestures.k r4 = r3
                androidx.compose.runtime.k1<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r4
                r3.mo6566a()
                long r7 = r4.mo3861b(r3, r11)
                java.lang.Object r4 = r5.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                float r5 = r4.mo3820d(r7)
                boolean r7 = r4.f1345b
                if (r7 == 0) goto L_0x0072
                r7 = -1
                float r7 = (float) r7
                float r5 = r5 * r7
            L_0x0072:
                androidx.compose.foundation.gestures.m r4 = r4.f1347d
                float r4 = r4.mo3692d(r5)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x007f
                r4 = r2
                goto L_0x0080
            L_0x007f:
                r4 = r6
            L_0x0080:
                if (r4 != 0) goto L_0x0096
                java.util.List<androidx.compose.ui.input.pointer.p> r11 = r11.f3651a
                int r4 = r11.size()
            L_0x0088:
                if (r6 >= r4) goto L_0x0096
                java.lang.Object r5 = r11.get(r6)
                androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
                r5.mo6614a()
                int r6 = r6 + 1
                goto L_0x0088
            L_0x0096:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.C05811.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$mouseWheelScroll$1(C0613k kVar, C1342k1<ScrollingLogic> k1Var, C19340c<? super ScrollableKt$mouseWheelScroll$1> cVar) {
        super(2, cVar);
        this.$mouseWheelScrollConfig = kVar;
        this.$scrollingLogicState = k1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, cVar);
        scrollableKt$mouseWheelScroll$1.L$0 = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((ScrollableKt$mouseWheelScroll$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0613k kVar = this.$mouseWheelScrollConfig;
            final C1342k1<ScrollingLogic> k1Var = this.$scrollingLogicState;
            C05811 r1 = new C05811((C19340c<? super C05811>) null);
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
