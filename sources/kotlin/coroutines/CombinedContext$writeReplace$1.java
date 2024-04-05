package kotlin.coroutines;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19861p;

public final class CombinedContext$writeReplace$1 extends Lambda implements C19861p<C19394m, CoroutineContext.C19335a, C19394m> {
    public final /* synthetic */ CoroutineContext[] $elements;
    public final /* synthetic */ Ref$IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = ref$IntRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C19394m) obj, (CoroutineContext.C19335a) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(C19394m mVar, CoroutineContext.C19335a aVar) {
        C19383o.m32797g(mVar, "<anonymous parameter 0>");
        C19383o.m32797g(aVar, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref$IntRef ref$IntRef = this.$index;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        coroutineContextArr[i] = aVar;
    }
}
