package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19703h0;
import p753kq.C19857l;

final class FutureKt$asCompletableFuture$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CompletableFuture<Object> $future;
    public final /* synthetic */ C19703h0<Object> $this_asCompletableFuture;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FutureKt$asCompletableFuture$1(CompletableFuture<Object> completableFuture, C19703h0<Object> h0Var) {
        super(1);
        this.$future = completableFuture;
        this.$this_asCompletableFuture = h0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        try {
            this.$future.complete(this.$this_asCompletableFuture.mo72404d());
        } catch (Throwable th2) {
            this.$future.completeExceptionally(th2);
        }
    }
}
