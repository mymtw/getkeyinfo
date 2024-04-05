package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0426g;
import androidx.compose.foundation.interaction.C0632b;
import androidx.compose.foundation.interaction.C0635e;
import androidx.compose.foundation.interaction.C0638h;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7284d;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", mo70541f = "FloatingActionButton.kt", mo70542l = {318}, mo70543m = "invokeSuspend")
final class DefaultFloatingActionButtonElevation$elevation$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Animatable<C7284d, C0426g> $animatable;
    public final /* synthetic */ C0638h $interaction;
    public final /* synthetic */ float $target;
    public int label;
    public final /* synthetic */ C1168b0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$2(Animatable<C7284d, C0426g> animatable, C1168b0 b0Var, float f, C0638h hVar, C19340c<? super DefaultFloatingActionButtonElevation$elevation$2> cVar) {
        super(2, cVar);
        this.$animatable = animatable;
        this.this$0 = b0Var;
        this.$target = f;
        this.$interaction = hVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DefaultFloatingActionButtonElevation$elevation$2(this.$animatable, this.this$0, this.$target, this.$interaction, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            float f = ((C7284d) this.$animatable.f1010e.getValue()).f16155b;
            C0638h hVar = null;
            if (C7284d.m13983a(f, this.this$0.f2381b)) {
                hVar = new C0643m(C8343c.f18295b);
            } else if (C7284d.m13983a(f, this.this$0.f2382c)) {
                hVar = new C0635e();
            } else if (C7284d.m13983a(f, this.this$0.f2383d)) {
                hVar = new C0632b();
            }
            Animatable<C7284d, C0426g> animatable = this.$animatable;
            float f2 = this.$target;
            C0638h hVar2 = this.$interaction;
            this.label = 1;
            if (C1212m0.m2337a(animatable, f2, hVar, hVar2, this) == coroutineSingletons) {
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
