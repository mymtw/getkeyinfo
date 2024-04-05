package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p753kq.C19846a;

final class SafePublicationLazyImpl<T> implements C19285c<T>, Serializable {
    public static final C19282a Companion = new C19282a();

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f43148b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f44847final;
    private volatile C19846a<? extends T> initializer;

    /* renamed from: kotlin.SafePublicationLazyImpl$a */
    public static final class C19282a {
    }

    public SafePublicationLazyImpl(C19846a<? extends T> aVar) {
        C19383o.m32797g(aVar, "initializer");
        this.initializer = aVar;
        C0005b bVar = C0005b.f14l;
        this._value = bVar;
        this.f44847final = bVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        boolean z;
        T t = this._value;
        T t2 = C0005b.f14l;
        if (t != t2) {
            return t;
        }
        C19846a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43148b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, t2, invoke)) {
                    if (atomicReferenceFieldUpdater.get(this) != t2) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.initializer = null;
                return invoke;
            }
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
