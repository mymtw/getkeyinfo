package kotlinx.coroutines.rx2;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.Disposable;
import p753kq.C19857l;

final class RxAwaitKt$disposeOnCancellation$1 extends Lambda implements C19857l<Throwable, C19394m> {

    /* renamed from: $d */
    public final /* synthetic */ Disposable f43752$d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxAwaitKt$disposeOnCancellation$1(Disposable disposable) {
        super(1);
        this.f43752$d = disposable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        this.f43752$d.dispose();
    }
}
