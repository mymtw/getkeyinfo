package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19841y1;
import p753kq.C19861p;

public final class ThreadContextKt$countAll$1 extends Lambda implements C19861p<Object, CoroutineContext.C19335a, Object> {
    public static final ThreadContextKt$countAll$1 INSTANCE = new ThreadContextKt$countAll$1();

    public ThreadContextKt$countAll$1() {
        super(2);
    }

    public final Object invoke(Object obj, CoroutineContext.C19335a aVar) {
        if (!(aVar instanceof C19841y1)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num == null ? 1 : num.intValue();
        return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
    }
}
