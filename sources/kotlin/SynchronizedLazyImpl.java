package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p753kq.C19846a;

final class SynchronizedLazyImpl<T> implements C19285c<T>, Serializable {
    private volatile Object _value;
    private C19846a<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(C19846a<? extends T> aVar, Object obj) {
        C19383o.m32797g(aVar, "initializer");
        this.initializer = aVar;
        this._value = C0005b.f14l;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        T t3 = C0005b.f14l;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                C19846a aVar = this.initializer;
                C19383o.m32794d(aVar);
                t = aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public boolean isInitialized() {
        return this._value != C0005b.f14l;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SynchronizedLazyImpl(C19846a aVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
