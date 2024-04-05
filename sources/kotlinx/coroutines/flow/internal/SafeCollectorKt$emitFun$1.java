package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C19600e;
import p753kq.C19862q;

public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements C19862q {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, C19600e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(C19600e<Object> eVar, Object obj, C19340c<? super C19394m> cVar) {
        return eVar.emit(obj, cVar);
    }
}
