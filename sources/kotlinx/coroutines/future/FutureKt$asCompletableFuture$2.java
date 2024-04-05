package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class FutureKt$asCompletableFuture$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CompletableFuture<C19394m> $future;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FutureKt$asCompletableFuture$2(CompletableFuture<C19394m> completableFuture) {
        super(1);
        this.$future = completableFuture;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        if (th == null) {
            this.$future.complete(C19394m.f43287a);
        } else {
            this.$future.completeExceptionally(th);
        }
    }
}
