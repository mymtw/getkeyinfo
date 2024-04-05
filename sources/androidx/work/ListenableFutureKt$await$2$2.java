package androidx.work;

import com.google.common.util.concurrent.C16388l;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ListenableFutureKt$await$2$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C16388l<Object> $this_await;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(C16388l<Object> lVar) {
        super(1);
        this.$this_await = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel(false);
    }
}
