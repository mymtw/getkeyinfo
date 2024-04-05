package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: kotlinx.coroutines.flow.o0 */
public final class C19658o0 implements C19600e<Object> {

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f43605b;

    public C19658o0(Ref$ObjectRef ref$ObjectRef) {
        this.f43605b = ref$ObjectRef;
    }

    public final Object emit(Object obj, C19340c<? super C19394m> cVar) {
        this.f43605b.element = obj;
        throw new AbortFlowException(this);
    }
}
