package androidx.compose.animation.core;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", mo70541f = "AnimateAsState.kt", mo70542l = {368}, mo70543m = "invokeSuspend")
final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<C0422e<Object>> $animSpec$delegate;
    public final /* synthetic */ Animatable<Object, Object> $animatable;
    public final /* synthetic */ C19499d<Object> $channel;
    public final /* synthetic */ C1342k1<C19857l<Object, C19394m>> $listener$delegate;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3(C19499d<Object> dVar, Animatable<Object, Object> animatable, C1342k1<? extends C0422e<Object>> k1Var, C1342k1<? extends C19857l<Object, C19394m>> k1Var2, C19340c<? super AnimateAsStateKt$animateValueAsState$3> cVar) {
        super(2, cVar);
        this.$channel = dVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = k1Var;
        this.$listener$delegate = k1Var2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r13.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r3 = r13.L$0
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.C19525d0) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r13
            goto L_0x0043
        L_0x0019:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0021:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.d0 r14 = (kotlinx.coroutines.C19525d0) r14
            kotlinx.coroutines.channels.d<java.lang.Object> r1 = r13.$channel
            kotlinx.coroutines.channels.f r1 = r1.iterator()
            r3 = r14
            r14 = r13
        L_0x0030:
            r14.L$0 = r3
            r14.L$1 = r1
            r14.label = r2
            java.lang.Object r4 = r1.mo72148a(r14)
            if (r4 != r0) goto L_0x003d
            return r0
        L_0x003d:
            r12 = r0
            r0 = r14
            r14 = r4
            r4 = r3
            r3 = r1
            r1 = r12
        L_0x0043:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0075
            java.lang.Object r14 = r3.next()
            kotlinx.coroutines.channels.d<java.lang.Object> r5 = r0.$channel
            java.lang.Object r5 = r5.mo72144w()
            java.lang.Object r5 = kotlinx.coroutines.channels.C19503g.m33188b(r5)
            if (r5 != 0) goto L_0x005d
            r7 = r14
            goto L_0x005e
        L_0x005d:
            r7 = r5
        L_0x005e:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r14 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<java.lang.Object, java.lang.Object> r8 = r0.$animatable
            androidx.compose.runtime.k1<androidx.compose.animation.core.e<java.lang.Object>> r9 = r0.$animSpec$delegate
            androidx.compose.runtime.k1<kq.l<java.lang.Object, kotlin.m>> r10 = r0.$listener$delegate
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.C19697g.m33468f(r4, r6, r6, r14, r5)
            r14 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0030
        L_0x0075:
            kotlin.m r14 = kotlin.C19394m.f43287a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
