package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g */
public final class C1317g<E> extends C1311a<E> {

    /* renamed from: d */
    public final E f2879d;

    public C1317g(E e, int i) {
        super(i, 1);
        this.f2879d = e;
    }

    public final E next() {
        if (hasNext()) {
            this.f2865b++;
            return this.f2879d;
        }
        throw new NoSuchElementException();
    }

    public final E previous() {
        if (hasPrevious()) {
            this.f2865b--;
            return this.f2879d;
        }
        throw new NoSuchElementException();
    }
}
