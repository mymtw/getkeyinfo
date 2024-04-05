package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C19733q;

/* renamed from: kotlinx.coroutines.flow.internal.i */
public final class C19632i<T> extends C19733q<T> {
    public C19632i(C19340c cVar, CoroutineContext coroutineContext) {
        super(cVar, coroutineContext);
    }

    /* renamed from: T */
    public final boolean mo72374T(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return mo72508K(th);
    }
}
