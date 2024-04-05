package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p744gq.C19058a;

public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient C19340c<Object> intercepted;

    public ContinuationImpl(C19340c<Object> cVar, CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        C19383o.m32794d(coroutineContext);
        return coroutineContext;
    }

    public final C19340c<Object> intercepted() {
        C19340c<Object> cVar = this.intercepted;
        if (cVar == null) {
            C19341d dVar = (C19341d) getContext().get(C19341d.C19342a.f43195b);
            if (dVar == null || (cVar = dVar.mo71807e(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    public void releaseIntercepted() {
        C19340c<Object> cVar = this.intercepted;
        if (!(cVar == null || cVar == this)) {
            CoroutineContext context = getContext();
            int i = C19341d.f43194b1;
            CoroutineContext.C19335a aVar = context.get(C19341d.C19342a.f43195b);
            C19383o.m32794d(aVar);
            ((C19341d) aVar).mo71806b(cVar);
        }
        this.intercepted = C19058a.f42555b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(C19340c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
