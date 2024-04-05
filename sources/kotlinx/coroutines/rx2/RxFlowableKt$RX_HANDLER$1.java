package kotlinx.coroutines.rx2;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19861p;

final /* synthetic */ class RxFlowableKt$RX_HANDLER$1 extends FunctionReferenceImpl implements C19861p<Throwable, CoroutineContext, C19394m> {
    public static final RxFlowableKt$RX_HANDLER$1 INSTANCE = new RxFlowableKt$RX_HANDLER$1();

    public RxFlowableKt$RX_HANDLER$1() {
        super(2, C19789b.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Throwable) obj, (CoroutineContext) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th, CoroutineContext coroutineContext) {
        C19789b.m33749b(th, coroutineContext);
    }
}
