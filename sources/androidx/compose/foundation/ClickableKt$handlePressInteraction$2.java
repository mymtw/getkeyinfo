package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0612j;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", mo70541f = "Clickable.kt", mo70542l = {412, 414, 421, 422, 431}, mo70543m = "invokeSuspend")
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<C19846a<Boolean>> $delayPressInteraction;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public final /* synthetic */ C1338j0<C0643m> $pressedInteraction;
    public final /* synthetic */ C0612j $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(C0612j jVar, long j, C0640j jVar2, C1338j0<C0643m> j0Var, C1342k1<? extends C19846a<Boolean>> k1Var, C19340c<? super ClickableKt$handlePressInteraction$2> cVar) {
        super(2, cVar);
        this.$this_handlePressInteraction = jVar;
        this.$pressPoint = j;
        this.$interactionSource = jVar2;
        this.$pressedInteraction = j0Var;
        this.$delayPressInteraction = k1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, cVar);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ClickableKt$handlePressInteraction$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 5
            r5 = 0
            r6 = 4
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r8) goto L_0x0035
            if (r2 == r7) goto L_0x002f
            if (r2 == r3) goto L_0x0026
            if (r2 == r6) goto L_0x0021
            if (r2 != r4) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0021:
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            goto L_0x00d2
        L_0x0026:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.interaction.n r2 = (androidx.compose.foundation.interaction.C0644n) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            goto L_0x00a0
        L_0x002f:
            boolean r2 = r0.Z$0
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            goto L_0x0084
        L_0x0035:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.g1 r2 = (kotlinx.coroutines.C19699g1) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            r4 = r18
            goto L_0x006a
        L_0x003f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.C19525d0) r2
            androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1 r15 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1
            androidx.compose.runtime.k1<kq.a<java.lang.Boolean>> r10 = r0.$delayPressInteraction
            long r11 = r0.$pressPoint
            androidx.compose.foundation.interaction.j r13 = r0.$interactionSource
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.m> r14 = r0.$pressedInteraction
            r16 = 0
            r9 = r15
            r4 = r15
            r15 = r16
            r9.<init>(r10, r11, r13, r14, r15)
            kotlinx.coroutines.w1 r2 = kotlinx.coroutines.C19697g.m33468f(r2, r5, r5, r4, r3)
            androidx.compose.foundation.gestures.j r4 = r0.$this_handlePressInteraction
            r0.L$0 = r2
            r0.label = r8
            java.lang.Object r4 = r4.mo3792a0(r0)
            if (r4 != r1) goto L_0x006a
            return r1
        L_0x006a:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r8 = r2.isActive()
            if (r8 == 0) goto L_0x00ad
            r0.L$0 = r5
            r0.Z$0 = r4
            r0.label = r7
            java.lang.Object r2 = androidx.compose.p015ui.text.input.C1993m.m4373s(r2, r0)
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r4
        L_0x0084:
            if (r2 == 0) goto L_0x00d2
            androidx.compose.foundation.interaction.m r2 = new androidx.compose.foundation.interaction.m
            long r7 = r0.$pressPoint
            r2.<init>(r7)
            androidx.compose.foundation.interaction.n r4 = new androidx.compose.foundation.interaction.n
            r4.<init>(r2)
            androidx.compose.foundation.interaction.j r7 = r0.$interactionSource
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r2 = r7.mo3870a(r2, r0)
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r4
        L_0x00a0:
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            r0.L$0 = r5
            r0.label = r6
            java.lang.Object r2 = r3.mo3870a(r2, r0)
            if (r2 != r1) goto L_0x00d2
            return r1
        L_0x00ad:
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.m> r2 = r0.$pressedInteraction
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.interaction.m r2 = (androidx.compose.foundation.interaction.C0643m) r2
            if (r2 == 0) goto L_0x00d2
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            if (r4 == 0) goto L_0x00c1
            androidx.compose.foundation.interaction.n r4 = new androidx.compose.foundation.interaction.n
            r4.<init>(r2)
            goto L_0x00c6
        L_0x00c1:
            androidx.compose.foundation.interaction.l r4 = new androidx.compose.foundation.interaction.l
            r4.<init>(r2)
        L_0x00c6:
            r0.L$0 = r5
            r2 = 5
            r0.label = r2
            java.lang.Object r2 = r3.mo3870a(r4, r0)
            if (r2 != r1) goto L_0x00d2
            return r1
        L_0x00d2:
            androidx.compose.runtime.j0<androidx.compose.foundation.interaction.m> r1 = r0.$pressedInteraction
            r1.setValue(r5)
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
