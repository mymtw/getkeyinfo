package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CoroutineContextKt$foldCopies$1 extends Lambda implements C19861p<CoroutineContext, CoroutineContext.C19335a, CoroutineContext> {
    public static final CoroutineContextKt$foldCopies$1 INSTANCE = new CoroutineContextKt$foldCopies$1();

    public CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.C19335a aVar) {
        if (aVar instanceof C19839y) {
            return coroutineContext.plus(((C19839y) aVar).mo72685u());
        }
        return coroutineContext.plus(aVar);
    }
}
