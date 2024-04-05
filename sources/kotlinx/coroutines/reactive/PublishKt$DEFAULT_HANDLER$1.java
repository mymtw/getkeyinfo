package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p514bk.C14088a;
import p753kq.C19861p;

final class PublishKt$DEFAULT_HANDLER$1 extends Lambda implements C19861p<Throwable, CoroutineContext, C19394m> {
    public static final PublishKt$DEFAULT_HANDLER$1 INSTANCE = new PublishKt$DEFAULT_HANDLER$1();

    public PublishKt$DEFAULT_HANDLER$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, (CoroutineContext) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            C14088a.m21785m(th, coroutineContext);
        }
    }
}
