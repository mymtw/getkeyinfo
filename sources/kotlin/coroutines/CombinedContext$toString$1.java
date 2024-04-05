package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CombinedContext$toString$1 extends Lambda implements C19861p<String, CoroutineContext.C19335a, String> {
    public static final CombinedContext$toString$1 INSTANCE = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    public final String invoke(String str, CoroutineContext.C19335a aVar) {
        C19383o.m32797g(str, "acc");
        C19383o.m32797g(aVar, "element");
        if (str.length() == 0) {
            return aVar.toString();
        }
        return str + ", " + aVar;
    }
}
