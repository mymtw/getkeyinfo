package kotlinx.coroutines.reactive;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import org.reactivestreams.Subscription;
import p753kq.C19857l;

public final class AwaitKt$awaitOne$2$1$onSubscribe$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Subscription $sub;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AwaitKt$awaitOne$2$1$onSubscribe$1(Subscription subscription) {
        super(1);
        this.$sub = subscription;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$sub.cancel();
    }
}
