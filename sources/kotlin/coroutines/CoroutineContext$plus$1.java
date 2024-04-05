package kotlin.coroutines;

import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CoroutineContext$plus$1 extends Lambda implements C19861p<CoroutineContext, CoroutineContext.C19335a, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.C19335a aVar) {
        CombinedContext combinedContext;
        C19383o.m32797g(coroutineContext, "acc");
        C19383o.m32797g(aVar, "element");
        CoroutineContext minusKey = coroutineContext.minusKey(aVar.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (minusKey == emptyCoroutineContext) {
            return aVar;
        }
        int i = C19341d.f43194b1;
        C19341d.C19342a aVar2 = C19341d.C19342a.f43195b;
        C19341d dVar = (C19341d) minusKey.get(aVar2);
        if (dVar == null) {
            combinedContext = new CombinedContext(minusKey, aVar);
        } else {
            CoroutineContext minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == emptyCoroutineContext) {
                return new CombinedContext(aVar, dVar);
            }
            combinedContext = new CombinedContext(new CombinedContext(minusKey2, aVar), dVar);
        }
        return combinedContext;
    }
}
