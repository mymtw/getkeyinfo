package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements C19861p<Boolean, CoroutineContext.C19335a, Boolean> {
    public static final CoroutineContextKt$hasCopyableElements$1 INSTANCE = new CoroutineContextKt$hasCopyableElements$1();

    public CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    public final Boolean invoke(boolean z, CoroutineContext.C19335a aVar) {
        return Boolean.valueOf(z || (aVar instanceof C19839y));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (CoroutineContext.C19335a) obj2);
    }
}
