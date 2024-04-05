package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.animation.core.Animatable$snapTo$2", mo70541f = "Animatable.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class Animatable$snapTo$2 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public final /* synthetic */ T $targetValue;
    public int label;
    public final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t, C19340c<? super Animatable$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
        this.$targetValue = t;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((Animatable$snapTo$2) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            Animatable.m1064b(this.this$0);
            Object a = Animatable.m1063a(this.this$0, this.$targetValue);
            this.this$0.f1008c.f1110c.setValue(a);
            this.this$0.f1010e.setValue(a);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
