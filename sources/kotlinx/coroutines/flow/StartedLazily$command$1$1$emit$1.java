package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", mo70541f = "SharingStarted.kt", mo70542l = {158}, mo70543m = "emit")
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StartedLazily$command$1.C195851<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C195851<? super T> r1, C19340c<? super StartedLazily$command$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72325b(0, this);
    }
}
