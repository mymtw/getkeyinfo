package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: i */
    public transient Comparator<? super K> f36191i;

    /* renamed from: j */
    public transient Comparator<? super V> f36192j;

    public TreeMultimap() {
        throw null;
    }

    public TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.f36191i = comparator;
        this.f36192j = comparator2;
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create() {
        return new TreeMultimap<>(Ordering.natural(), Ordering.natural());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) objectInputStream.readObject();
        comparator.getClass();
        this.f36191i = comparator;
        Comparator<? super V> comparator2 = (Comparator) objectInputStream.readObject();
        comparator2.getClass();
        this.f36192j = comparator2;
        setMap(new TreeMap(this.f36191i));
        C16213q1.m26246c(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(keyComparator());
        objectOutputStream.writeObject(valueComparator());
        C16213q1.m26249f(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsKey(@NullableDecl Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public Comparator<? super K> keyComparator() {
        return this.f36191i;
    }

    public /* bridge */ /* synthetic */ C16178h1 keys() {
        return super.keys();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.put(obj, obj2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(C16154c1 c1Var) {
        return super.putAll(c1Var);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ SortedSet removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ SortedSet replaceValues(@NullableDecl Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Comparator<? super V> valueComparator() {
        return this.f36192j;
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> TreeMultimap<K, V> create(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        comparator.getClass();
        comparator2.getClass();
        return new TreeMultimap<>(comparator, comparator2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    public SortedSet<V> createCollection() {
        return new TreeSet(this.f36192j);
    }

    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    public Collection<V> createCollection(@NullableDecl K k) {
        if (k == null) {
            keyComparator().compare(k, k);
        }
        return super.createCollection(k);
    }

    public NavigableSet<V> get(@NullableDecl K k) {
        return (NavigableSet) super.get((Object) k);
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create(C16154c1<? extends K, ? extends V> c1Var) {
        TreeMultimap<K, V> treeMultimap = new TreeMultimap<>(Ordering.natural(), Ordering.natural());
        treeMultimap.putAll(c1Var);
        return treeMultimap;
    }
}
