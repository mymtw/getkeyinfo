package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19861p;

public final class CoroutineContextKt$foldCopies$folded$1 extends Lambda implements C19861p<CoroutineContext, CoroutineContext.C19335a, CoroutineContext> {
    public final /* synthetic */ boolean $isNewCoroutine;
    public final /* synthetic */ Ref$ObjectRef<CoroutineContext> $leftoverContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(Ref$ObjectRef<CoroutineContext> ref$ObjectRef, boolean z) {
        super(2);
        this.$leftoverContext = ref$ObjectRef;
        this.$isNewCoroutine = z;
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.C19335a aVar) {
        if (!(aVar instanceof C19839y)) {
            return coroutineContext.plus(aVar);
        }
        if (((CoroutineContext) this.$leftoverContext.element).get(aVar.getKey()) == null) {
            C19839y yVar = (C19839y) aVar;
            if (this.$isNewCoroutine) {
                yVar = yVar.mo72685u();
            }
            return coroutineContext.plus(yVar);
        }
        Ref$ObjectRef<CoroutineContext> ref$ObjectRef = this.$leftoverContext;
        ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).minusKey(aVar.getKey());
        return coroutineContext.plus(((C19839y) aVar).mo72684S());
    }
}
