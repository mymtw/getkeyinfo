package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19841y1;
import p753kq.C19861p;

public final class ThreadContextKt$findOne$1 extends Lambda implements C19861p<C19841y1<?>, CoroutineContext.C19335a, C19841y1<?>> {
    public static final ThreadContextKt$findOne$1 INSTANCE = new ThreadContextKt$findOne$1();

    public ThreadContextKt$findOne$1() {
        super(2);
    }

    public final C19841y1<?> invoke(C19841y1<?> y1Var, CoroutineContext.C19335a aVar) {
        if (y1Var != null) {
            return y1Var;
        }
        if (aVar instanceof C19841y1) {
            return (C19841y1) aVar;
        }
        return null;
    }
}
