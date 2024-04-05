package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19381m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19387r;

public abstract class SuspendLambda extends ContinuationImpl implements C19381m<Object> {
    private final int arity;

    public SuspendLambda(int i, C19340c<Object> cVar) {
        super(cVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        C19386q.f43269a.getClass();
        String a = C19387r.m32808a(this);
        C19383o.m32796f(a, "renderLambdaToString(this)");
        return a;
    }

    public SuspendLambda(int i) {
        this(i, (C19340c<Object>) null);
    }
}
