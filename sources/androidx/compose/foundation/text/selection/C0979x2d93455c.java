package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0429h0;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", mo70541f = "SelectionMagnifier.kt", mo70542l = {102}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 */
final class C0979x2d93455c extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Animatable<C8343c, C0428h> $animatable;
    public final /* synthetic */ long $targetValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0979x2d93455c(Animatable<C8343c, C0428h> animatable, long j, C19340c<? super C0979x2d93455c> cVar) {
        super(2, cVar);
        this.$animatable = animatable;
        this.$targetValue = j;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new C0979x2d93455c(this.$animatable, this.$targetValue, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((C0979x2d93455c) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Animatable<C8343c, C0428h> animatable = this.$animatable;
            C8343c cVar = new C8343c(this.$targetValue);
            C0429h0<C8343c> h0Var = SelectionMagnifierKt.f2062d;
            this.label = 1;
            if (Animatable.m1065d(animatable, cVar, h0Var, (Float) null, (C19857l) null, this, 12) == coroutineSingletons) {
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
