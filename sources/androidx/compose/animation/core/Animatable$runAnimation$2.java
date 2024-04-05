package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$BooleanRef;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.animation.core.Animatable$runAnimation$2", mo70541f = "Animatable.kt", mo70542l = {291}, mo70543m = "invokeSuspend")
final class Animatable$runAnimation$2 extends SuspendLambda implements C19857l<C19340c<? super C0417c<Object, C0432j>>, Object> {
    public final /* synthetic */ C0413b<Object, C0432j> $animation;
    public final /* synthetic */ C19857l<Animatable<Object, C0432j>, C19394m> $block;
    public final /* synthetic */ Object $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Animatable<Object, C0432j> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable<Object, C0432j> animatable, Object obj, C0413b<Object, C0432j> bVar, long j, C19857l<? super Animatable<Object, C0432j>, C19394m> lVar, C19340c<? super Animatable$runAnimation$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
        this.$initialVelocity = obj;
        this.$animation = bVar;
        this.$startTime = j;
        this.$block = lVar;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, cVar);
    }

    public final Object invoke(C19340c<? super C0417c<Object, C0432j>> cVar) {
        return ((Animatable$runAnimation$2) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C0424f fVar;
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Animatable<Object, C0432j> animatable = this.this$0;
            C0424f<T, V> fVar2 = animatable.f1008c;
            V v = (C0432j) animatable.f1006a.mo3509a().invoke(this.$initialVelocity);
            fVar2.getClass();
            C19383o.m32797g(v, "<set-?>");
            fVar2.f1111d = v;
            this.this$0.f1010e.setValue(this.$animation.mo3469g());
            this.this$0.f1009d.setValue(Boolean.TRUE);
            C0424f<T, V> fVar3 = this.this$0.f1008c;
            final C0424f fVar4 = new C0424f(fVar3.f1109b, fVar3.getValue(), C1993m.m4377w(fVar3.f1111d), fVar3.f1112e, Long.MIN_VALUE, fVar3.f1114g);
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            C0413b<Object, C0432j> bVar = this.$animation;
            long j = this.$startTime;
            final Animatable<Object, C0432j> animatable2 = this.this$0;
            final C19857l<Animatable<Object, C0432j>, C19394m> lVar = this.$block;
            C03921 r9 = new C19857l<C0419d<Object, C0432j>, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C0419d<Object, C0432j>) (C0419d) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C0419d<Object, C0432j> dVar) {
                    C19383o.m32797g(dVar, "$this$animate");
                    SuspendAnimationKt.m1077h(dVar, animatable2.f1008c);
                    Object a = Animatable.m1063a(animatable2, dVar.mo3481b());
                    if (!C19383o.m32792b(a, dVar.mo3481b())) {
                        animatable2.f1008c.f1110c.setValue(a);
                        fVar4.f1110c.setValue(a);
                        C19857l<Animatable<Object, C0432j>, C19394m> lVar = lVar;
                        if (lVar != null) {
                            lVar.invoke(animatable2);
                        }
                        dVar.mo3480a();
                        ref$BooleanRef2.element = true;
                        return;
                    }
                    C19857l<Animatable<Object, C0432j>, C19394m> lVar2 = lVar;
                    if (lVar2 != null) {
                        lVar2.invoke(animatable2);
                    }
                }
            };
            this.L$0 = fVar4;
            this.L$1 = ref$BooleanRef2;
            this.label = 1;
            C03921 r5 = r9;
            C0424f fVar5 = fVar4;
            if (SuspendAnimationKt.m1070a(fVar4, bVar, j, r5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$BooleanRef = ref$BooleanRef2;
            fVar = fVar5;
        } else if (i == 1) {
            ref$BooleanRef = (Ref$BooleanRef) this.L$1;
            fVar = (C0424f) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (CancellationException e) {
                Animatable.m1064b(this.this$0);
                throw e;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
        Animatable.m1064b(this.this$0);
        return new C0417c(fVar, animationEndReason);
    }
}
