package androidx.compose.material;

import androidx.compose.foundation.interaction.C0638h;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", mo70541f = "Slider.kt", mo70542l = {1041}, mo70543m = "invokeSuspend")
final class RangeSliderLogic$captureThumb$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ boolean $draggingStart;
    public final /* synthetic */ C0638h $interaction;
    public int label;
    public final /* synthetic */ C1210l1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RangeSliderLogic$captureThumb$1(C1210l1 l1Var, boolean z, C0638h hVar, C19340c<? super RangeSliderLogic$captureThumb$1> cVar) {
        super(2, cVar);
        this.this$0 = l1Var;
        this.$draggingStart = z;
        this.$interaction = hVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new RangeSliderLogic$captureThumb$1(this.this$0, this.$draggingStart, this.$interaction, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((RangeSliderLogic$captureThumb$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1210l1 l1Var = this.this$0;
            C0640j jVar = this.$draggingStart ? l1Var.f2520a : l1Var.f2521b;
            C0638h hVar = this.$interaction;
            this.label = 1;
            if (jVar.mo3870a(hVar, this) == coroutineSingletons) {
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
