package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19762o;
import kotlinx.coroutines.internal.C19733q;
import p753kq.C19861p;

final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements C19861p<Integer, CoroutineContext.C19335a, Integer> {
    public final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (CoroutineContext.C19335a) obj2);
    }

    public final Integer invoke(int i, CoroutineContext.C19335a aVar) {
        CoroutineContext.C19337b key = aVar.getKey();
        CoroutineContext.C19335a aVar2 = this.$this_checkContext.collectContext.get(key);
        int i2 = C19699g1.f43634d1;
        if (key != C19699g1.C19701b.f43635b) {
            return Integer.valueOf(aVar != aVar2 ? Integer.MIN_VALUE : i + 1);
        }
        C19699g1 g1Var = (C19699g1) aVar2;
        C19699g1 g1Var2 = (C19699g1) aVar;
        while (true) {
            if (g1Var2 != null) {
                if (g1Var2 == g1Var || !(g1Var2 instanceof C19733q)) {
                    break;
                }
                C19762o g0 = ((C19733q) g1Var2).mo72520g0();
                g1Var2 = g0 == null ? null : g0.getParent();
            } else {
                g1Var2 = null;
                break;
            }
        }
        if (g1Var2 == g1Var) {
            if (g1Var != null) {
                i++;
            }
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var2 + ", expected child of " + g1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
