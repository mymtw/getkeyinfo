package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(C19340c<Object> cVar) {
        super(cVar);
        if (cVar != null) {
            if (!(cVar.getContext() == EmptyCoroutineContext.INSTANCE)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
