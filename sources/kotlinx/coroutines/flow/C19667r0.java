package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p772tq.C20203a;

/* renamed from: kotlinx.coroutines.flow.r0 */
public final class C19667r0 implements C19600e<Object> {

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f43611b;

    public C19667r0(Ref$ObjectRef ref$ObjectRef) {
        this.f43611b = ref$ObjectRef;
    }

    public final Object emit(Object obj, C19340c<? super C19394m> cVar) {
        boolean z;
        Ref$ObjectRef ref$ObjectRef = this.f43611b;
        T t = ref$ObjectRef.element;
        T t2 = C20203a.f44778h;
        if (t == t2) {
            ref$ObjectRef.element = obj;
            z = true;
        } else {
            ref$ObjectRef.element = t2;
            z = false;
        }
        if (z) {
            return C19394m.f43287a;
        }
        throw new AbortFlowException(this);
    }
}
