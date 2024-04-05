package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", mo70541f = "SuspendingPointerInputFilter.kt", mo70542l = {625}, mo70543m = "withTimeout")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 */
public final class C1623xffebe5e8<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1623xffebe5e8(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, C19340c<? super C1623xffebe5e8> cVar) {
        super(cVar);
        this.this$0 = pointerEventHandlerCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo6564B(0, (C19861p) null, this);
    }
}
