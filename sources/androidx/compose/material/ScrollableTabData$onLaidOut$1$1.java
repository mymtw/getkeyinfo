package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.ScrollableTabData$onLaidOut$1$1", mo70541f = "TabRow.kt", mo70542l = {475}, mo70543m = "invokeSuspend")
final class ScrollableTabData$onLaidOut$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ int $calculatedOffset;
    public int label;
    public final /* synthetic */ C1219o1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(C1219o1 o1Var, int i, C19340c<? super ScrollableTabData$onLaidOut$1$1> cVar) {
        super(2, cVar);
        this.this$0 = o1Var;
        this.$calculatedOffset = i;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ScrollableTabData$onLaidOut$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ScrollState scrollState = this.this$0.f2538a;
            int i2 = this.$calculatedOffset;
            C0433j0 j0Var = TabRowKt.f2323b;
            this.label = 1;
            Object a = ScrollExtensionsKt.m1395a(scrollState, (float) (i2 - scrollState.mo3693e()), j0Var, this);
            if (a != coroutineSingletons) {
                a = C19394m.f43287a;
            }
            if (a == coroutineSingletons) {
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
