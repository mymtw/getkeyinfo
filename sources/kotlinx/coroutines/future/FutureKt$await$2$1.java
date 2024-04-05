package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class FutureKt$await$2$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C19696a<Object> $consumer;
    public final /* synthetic */ CompletableFuture<Object> $future;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FutureKt$await$2$1(CompletableFuture<Object> completableFuture, C19696a<Object> aVar) {
        super(1);
        this.$future = completableFuture;
        this.$consumer = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$future.cancel(false);
        this.$consumer.cont = null;
    }
}
