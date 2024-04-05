package kotlinx.coroutines.rx2;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.Disposable;
import p753kq.C19857l;

final class RxAwaitKt$awaitOne$2$1$onSubscribe$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Disposable $sub;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxAwaitKt$awaitOne$2$1$onSubscribe$1(Disposable disposable) {
        super(1);
        this.$sub = disposable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.$sub.dispose();
    }
}
