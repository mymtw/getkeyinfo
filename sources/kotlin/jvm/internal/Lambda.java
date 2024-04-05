package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class Lambda<R> implements C19381m<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        C19386q.f43269a.getClass();
        String a = C19387r.m32808a(this);
        C19383o.m32796f(a, "renderLambdaToString(this)");
        return a;
    }
}
