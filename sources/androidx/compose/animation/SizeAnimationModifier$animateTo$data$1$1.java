package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifier;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.C0417c;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0428h;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7290i;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", mo70541f = "AnimationModifier.kt", mo70542l = {121}, mo70543m = "invokeSuspend")
final class SizeAnimationModifier$animateTo$data$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $targetSize;
    public final /* synthetic */ SizeAnimationModifier.C0386a $this_apply;
    public int label;
    public final /* synthetic */ SizeAnimationModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifier$animateTo$data$1$1(SizeAnimationModifier.C0386a aVar, long j, SizeAnimationModifier sizeAnimationModifier, C19340c<? super SizeAnimationModifier$animateTo$data$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = aVar;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifier;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SizeAnimationModifier$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SizeAnimationModifier$animateTo$data$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19861p<? super C7290i, ? super C7290i, C19394m> pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Animatable<C7290i, C0428h> animatable = this.$this_apply.f996a;
            C7290i iVar = new C7290i(this.$targetSize);
            C0422e<C7290i> eVar = this.this$0.f992b;
            this.label = 1;
            obj = Animatable.m1065d(animatable, iVar, eVar, (Float) null, (C19857l) null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0417c cVar = (C0417c) obj;
        if (cVar.f1092b == AnimationEndReason.Finished && (pVar = this.this$0.f994d) != null) {
            pVar.invoke(new C7290i(this.$this_apply.f997b), cVar.f1091a.getValue());
        }
        return C19394m.f43287a;
    }
}
