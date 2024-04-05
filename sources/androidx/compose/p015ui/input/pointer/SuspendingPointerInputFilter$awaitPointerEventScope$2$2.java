package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19747k;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$awaitPointerEventScope$2$2 */
public final class SuspendingPointerInputFilter$awaitPointerEventScope$2$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> $handlerCoroutine;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilter$awaitPointerEventScope$2$2(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine) {
        super(1);
        this.$handlerCoroutine = pointerEventHandlerCoroutine;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine = this.$handlerCoroutine;
        C19747k<? super C1640l> kVar = pointerEventHandlerCoroutine.f3618d;
        if (kVar != null) {
            kVar.mo72495D(th);
        }
        pointerEventHandlerCoroutine.f3618d = null;
    }
}
