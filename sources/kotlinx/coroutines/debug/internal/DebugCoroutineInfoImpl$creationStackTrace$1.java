package kotlinx.coroutines.debug.internal;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", mo70541f = "DebugCoroutineInfoImpl.kt", mo70542l = {75}, mo70543m = "invokeSuspend")
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super StackTraceElement>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19541g $bottom;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C19535b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(C19535b bVar, C19541g gVar, C19340c<? super DebugCoroutineInfoImpl$creationStackTrace$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.this$0, (C19541g) null, cVar);
        debugCoroutineInfoImpl$creationStackTrace$1.L$0 = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    public final Object invoke(C19433i<? super StackTraceElement> iVar, C19340c<? super C19394m> cVar) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19433i iVar = (C19433i) this.L$0;
            throw null;
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
