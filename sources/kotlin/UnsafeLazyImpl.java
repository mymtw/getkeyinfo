package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p753kq.C19846a;

public final class UnsafeLazyImpl<T> implements C19285c<T>, Serializable {
    private Object _value = C0005b.f14l;
    private C19846a<? extends T> initializer;

    public UnsafeLazyImpl(C19846a<? extends T> aVar) {
        C19383o.m32797g(aVar, "initializer");
        this.initializer = aVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        if (this._value == C0005b.f14l) {
            C19846a<? extends T> aVar = this.initializer;
            C19383o.m32794d(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return this._value;
    }

    public boolean isInitialized() {
        return this._value != C0005b.f14l;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
