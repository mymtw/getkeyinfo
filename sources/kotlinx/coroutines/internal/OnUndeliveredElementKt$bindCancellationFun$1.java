package kotlinx.coroutines.internal;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p514bk.C14088a;
import p753kq.C19857l;

public final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ E $element;
    public final /* synthetic */ C19857l<E, C19394m> $this_bindCancellationFun;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnUndeliveredElementKt$bindCancellationFun$1(C19857l<? super E, C19394m> lVar, E e, CoroutineContext coroutineContext) {
        super(1);
        this.$this_bindCancellationFun = lVar;
        this.$element = e;
        this.$context = coroutineContext;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19857l<E, C19394m> lVar = this.$this_bindCancellationFun;
        E e = this.$element;
        CoroutineContext coroutineContext = this.$context;
        UndeliveredElementException b = OnUndeliveredElementKt.m33527b(lVar, e, (UndeliveredElementException) null);
        if (b != null) {
            C14088a.m21785m(b, coroutineContext);
        }
    }
}
