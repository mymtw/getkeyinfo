package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C19313f;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.collections.builders.b */
public final class C19305b<E> extends C19313f<E> {

    /* renamed from: b */
    public final MapBuilder<E, ?> f43172b;

    public C19305b(MapBuilder<E, ?> mapBuilder) {
        C19383o.m32797g(mapBuilder, "backing");
        this.f43172b = mapBuilder;
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f43172b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f43172b.containsKey(obj);
    }

    public final int getSize() {
        return this.f43172b.size();
    }

    public final boolean isEmpty() {
        return this.f43172b.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f43172b.keysIterator$kotlin_stdlib();
    }

    public final boolean remove(Object obj) {
        return this.f43172b.removeKey$kotlin_stdlib(obj) >= 0;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        this.f43172b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        this.f43172b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
