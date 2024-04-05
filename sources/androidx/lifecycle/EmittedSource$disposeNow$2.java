package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.EmittedSource$disposeNow$2", mo70541f = "CoroutineLiveData.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class EmittedSource$disposeNow$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ C2865i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmittedSource$disposeNow$2(C2865i iVar, C19340c<? super EmittedSource$disposeNow$2> cVar) {
        super(2, cVar);
        this.this$0 = iVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new EmittedSource$disposeNow$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((EmittedSource$disposeNow$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0761x.m1684O0(obj);
        throw null;
    }
}
