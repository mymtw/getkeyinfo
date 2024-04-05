package androidx.compose.foundation.gestures;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", mo70541f = "TapGestureDetector.kt", mo70542l = {327}, mo70543m = "tryAwaitRelease")
public final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PressGestureScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, C19340c<? super PressGestureScopeImpl$tryAwaitRelease$1> cVar) {
        super(cVar);
        this.this$0 = pressGestureScopeImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3792a0(this);
    }
}
