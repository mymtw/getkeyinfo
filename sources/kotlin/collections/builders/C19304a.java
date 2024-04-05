package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.C19313f;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.collections.builders.a */
public final class C19304a<K, V> extends C19313f<Map.Entry<Object, Object>> {

    /* renamed from: b */
    public final MapBuilder<K, V> f43171b;

    public C19304a(MapBuilder<K, V> mapBuilder) {
        C19383o.m32797g(mapBuilder, "backing");
        this.f43171b = mapBuilder;
    }

    /* renamed from: a */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        return this.f43171b.containsEntry$kotlin_stdlib(entry);
    }

    public final boolean add(Object obj) {
        C19383o.m32797g((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C19383o.m32797g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19383o.m32797g(entry, "element");
        return this.f43171b.removeEntry$kotlin_stdlib(entry);
    }

    public final void clear() {
        this.f43171b.clear();
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        return this.f43171b.containsAllEntries$kotlin_stdlib(collection);
    }

    public final int getSize() {
        return this.f43171b.size();
    }

    public final boolean isEmpty() {
        return this.f43171b.isEmpty();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.f43171b.entriesIterator$kotlin_stdlib();
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        this.f43171b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        this.f43171b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
