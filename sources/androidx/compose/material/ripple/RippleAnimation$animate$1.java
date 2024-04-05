package androidx.compose.material.ripple;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.material.ripple.RippleAnimation", mo70541f = "RippleAnimation.kt", mo70542l = {80, 82, 83}, mo70543m = "animate")
public final class RippleAnimation$animate$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, C19340c<? super RippleAnimation$animate$1> cVar) {
        super(cVar);
        this.this$0 = rippleAnimation;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5305a(this);
    }
}
