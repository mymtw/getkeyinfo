package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C19307c;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.collections.builders.c */
public final class C19306c<V> extends C19307c<V> {

    /* renamed from: b */
    public final MapBuilder<?, V> f43173b;

    public C19306c(MapBuilder<?, V> mapBuilder) {
        C19383o.m32797g(mapBuilder, "backing");
        this.f43173b = mapBuilder;
    }

    /* renamed from: a */
    public final int mo20440a() {
        return this.f43173b.size();
    }

    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends V> collection) {
        C19383o.m32797g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f43173b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f43173b.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f43173b.isEmpty();
    }

    public final Iterator<V> iterator() {
        return this.f43173b.valuesIterator$kotlin_stdlib();
    }

    public final boolean remove(Object obj) {
        return this.f43173b.removeValue$kotlin_stdlib(obj);
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        this.f43173b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        this.f43173b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
