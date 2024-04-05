package com.google.common.collect;

import com.google.common.base.C15791j;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    public static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;

    /* renamed from: i */
    public transient ValueEntry<K, V> f35985i;
    public transient int valueSetCapacity = 2;

    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements C15992c<K, V> {
        @NullableDecl
        public ValueEntry<K, V> nextInValueBucket;
        @NullableDecl
        public ValueEntry<K, V> predecessorInMultimap;
        @NullableDecl
        public C15992c<K, V> predecessorInValueSet;
        public final int smearedValueHash;
        @NullableDecl
        public ValueEntry<K, V> successorInMultimap;
        @NullableDecl
        public C15992c<K, V> successorInValueSet;

        public ValueEntry(@NullableDecl K k, @NullableDecl V v, int i, @NullableDecl ValueEntry<K, V> valueEntry) {
            super(k, v);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        public ValueEntry<K, V> getPredecessorInMultimap() {
            return this.predecessorInMultimap;
        }

        public C15992c<K, V> getPredecessorInValueSet() {
            return this.predecessorInValueSet;
        }

        public ValueEntry<K, V> getSuccessorInMultimap() {
            return this.successorInMultimap;
        }

        public C15992c<K, V> getSuccessorInValueSet() {
            return this.successorInValueSet;
        }

        public boolean matchesValue(@NullableDecl Object obj, int i) {
            return this.smearedValueHash == i && C15791j.m25606a(getValue(), obj);
        }

        public void setPredecessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.predecessorInMultimap = valueEntry;
        }

        public void setPredecessorInValueSet(C15992c<K, V> cVar) {
            this.predecessorInValueSet = cVar;
        }

        public void setSuccessorInMultimap(ValueEntry<K, V> valueEntry) {
            this.successorInMultimap = valueEntry;
        }

        public void setSuccessorInValueSet(C15992c<K, V> cVar) {
            this.successorInValueSet = cVar;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$a */
    public class C15989a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public ValueEntry<K, V> f35986b;
        @NullableDecl

        /* renamed from: c */
        public ValueEntry<K, V> f35987c;

        public C15989a() {
            this.f35986b = LinkedHashMultimap.this.f35985i.successorInMultimap;
        }

        public final boolean hasNext() {
            return this.f35986b != LinkedHashMultimap.this.f35985i;
        }

        public final Object next() {
            if (hasNext()) {
                ValueEntry<K, V> valueEntry = this.f35986b;
                this.f35987c = valueEntry;
                this.f35986b = valueEntry.successorInMultimap;
                return valueEntry;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C16203o.m26218e(this.f35987c != null);
            LinkedHashMultimap.this.remove(this.f35987c.getKey(), this.f35987c.getValue());
            this.f35987c = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$b */
    public final class C15990b extends Sets.C16082a<V> implements C15992c<K, V> {

        /* renamed from: b */
        public final K f35989b;

        /* renamed from: c */
        public ValueEntry<K, V>[] f35990c;

        /* renamed from: d */
        public int f35991d = 0;

        /* renamed from: e */
        public int f35992e = 0;

        /* renamed from: f */
        public C15992c<K, V> f35993f;

        /* renamed from: g */
        public C15992c<K, V> f35994g;

        /* renamed from: com.google.common.collect.LinkedHashMultimap$b$a */
        public class C15991a implements Iterator<V> {

            /* renamed from: b */
            public C15992c<K, V> f35996b;
            @NullableDecl

            /* renamed from: c */
            public ValueEntry<K, V> f35997c;

            /* renamed from: d */
            public int f35998d;

            public C15991a() {
                this.f35996b = C15990b.this.f35993f;
                this.f35998d = C15990b.this.f35992e;
            }

            public final boolean hasNext() {
                C15990b bVar = C15990b.this;
                if (bVar.f35992e == this.f35998d) {
                    return this.f35996b != bVar;
                }
                throw new ConcurrentModificationException();
            }

            public final V next() {
                if (hasNext()) {
                    ValueEntry<K, V> valueEntry = (ValueEntry) this.f35996b;
                    V value = valueEntry.getValue();
                    this.f35997c = valueEntry;
                    this.f35996b = valueEntry.getSuccessorInValueSet();
                    return value;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                if (C15990b.this.f35992e == this.f35998d) {
                    C16203o.m26218e(this.f35997c != null);
                    C15990b.this.remove(this.f35997c.getValue());
                    this.f35998d = C15990b.this.f35992e;
                    this.f35997c = null;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }

        public C15990b(K k, int i) {
            this.f35989b = k;
            this.f35993f = this;
            this.f35994g = this;
            this.f35990c = new ValueEntry[C16184i0.m26178a(i, 1.0d)];
        }

        public final boolean add(@NullableDecl V v) {
            int c = C16184i0.m26180c(v);
            ValueEntry<K, V>[] valueEntryArr = this.f35990c;
            int length = (valueEntryArr.length - 1) & c;
            ValueEntry<K, V> valueEntry = valueEntryArr[length];
            ValueEntry<K, V> valueEntry2 = valueEntry;
            while (true) {
                boolean z = false;
                if (valueEntry2 == null) {
                    ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.f35989b, v, c, valueEntry);
                    LinkedHashMultimap.access$200(this.f35994g, valueEntry3);
                    LinkedHashMultimap.access$200(valueEntry3, this);
                    LinkedHashMultimap.access$400(LinkedHashMultimap.this.f35985i.getPredecessorInMultimap(), valueEntry3);
                    LinkedHashMultimap.access$400(valueEntry3, LinkedHashMultimap.this.f35985i);
                    ValueEntry<K, V>[] valueEntryArr2 = this.f35990c;
                    valueEntryArr2[length] = valueEntry3;
                    int i = this.f35991d + 1;
                    this.f35991d = i;
                    this.f35992e++;
                    int length2 = valueEntryArr2.length;
                    if (((double) i) > ((double) length2) * 1.0d && length2 < 1073741824) {
                        z = true;
                    }
                    if (z) {
                        int length3 = valueEntryArr2.length * 2;
                        ValueEntry<K, V>[] valueEntryArr3 = new ValueEntry[length3];
                        this.f35990c = valueEntryArr3;
                        int i2 = length3 - 1;
                        for (C15992c cVar = this.f35993f; cVar != this; cVar = cVar.getSuccessorInValueSet()) {
                            ValueEntry<K, V> valueEntry4 = (ValueEntry) cVar;
                            int i3 = valueEntry4.smearedValueHash & i2;
                            valueEntry4.nextInValueBucket = valueEntryArr3[i3];
                            valueEntryArr3[i3] = valueEntry4;
                        }
                    }
                    return true;
                } else if (valueEntry2.matchesValue(v, c)) {
                    return false;
                } else {
                    valueEntry2 = valueEntry2.nextInValueBucket;
                }
            }
        }

        public final void clear() {
            Arrays.fill(this.f35990c, (Object) null);
            this.f35991d = 0;
            for (C15992c<K, V> cVar = this.f35993f; cVar != this; cVar = cVar.getSuccessorInValueSet()) {
                LinkedHashMultimap.access$600((ValueEntry) cVar);
            }
            LinkedHashMultimap.access$200(this, this);
            this.f35992e++;
        }

        public final boolean contains(@NullableDecl Object obj) {
            int c = C16184i0.m26180c(obj);
            ValueEntry<K, V>[] valueEntryArr = this.f35990c;
            for (ValueEntry<K, V> valueEntry = valueEntryArr[(valueEntryArr.length - 1) & c]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, c)) {
                    return true;
                }
            }
            return false;
        }

        public final C15992c<K, V> getPredecessorInValueSet() {
            return this.f35994g;
        }

        public final C15992c<K, V> getSuccessorInValueSet() {
            return this.f35993f;
        }

        public final Iterator<V> iterator() {
            return new C15991a();
        }

        @CanIgnoreReturnValue
        public final boolean remove(@NullableDecl Object obj) {
            int c = C16184i0.m26180c(obj);
            ValueEntry<K, V>[] valueEntryArr = this.f35990c;
            int length = (valueEntryArr.length - 1) & c;
            ValueEntry<K, V> valueEntry = null;
            ValueEntry<K, V> valueEntry2 = valueEntryArr[length];
            while (true) {
                ValueEntry<K, V> valueEntry3 = valueEntry;
                valueEntry = valueEntry2;
                ValueEntry<K, V> valueEntry4 = valueEntry3;
                if (valueEntry == null) {
                    return false;
                }
                if (valueEntry.matchesValue(obj, c)) {
                    if (valueEntry4 == null) {
                        this.f35990c[length] = valueEntry.nextInValueBucket;
                    } else {
                        valueEntry4.nextInValueBucket = valueEntry.nextInValueBucket;
                    }
                    LinkedHashMultimap.access$500(valueEntry);
                    LinkedHashMultimap.access$600(valueEntry);
                    this.f35991d--;
                    this.f35992e++;
                    return true;
                }
                valueEntry2 = valueEntry.nextInValueBucket;
            }
        }

        public final void setPredecessorInValueSet(C15992c<K, V> cVar) {
            this.f35994g = cVar;
        }

        public final void setSuccessorInValueSet(C15992c<K, V> cVar) {
            this.f35993f = cVar;
        }

        public final int size() {
            return this.f35991d;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$c */
    public interface C15992c<K, V> {
        C15992c<K, V> getPredecessorInValueSet();

        C15992c<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(C15992c<K, V> cVar);

        void setSuccessorInValueSet(C15992c<K, V> cVar);
    }

    public LinkedHashMultimap(int i, int i2) {
        super(CompactLinkedHashMap.createWithExpectedSize(i));
        C16203o.m26215b(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        ValueEntry<K, V> valueEntry = new ValueEntry<>(null, null, 0, (ValueEntry) null);
        this.f35985i = valueEntry;
        valueEntry.setSuccessorInMultimap(valueEntry);
        valueEntry.setPredecessorInMultimap(valueEntry);
    }

    public static void access$200(C15992c cVar, C15992c cVar2) {
        cVar.setSuccessorInValueSet(cVar2);
        cVar2.setPredecessorInValueSet(cVar);
    }

    public static void access$400(ValueEntry valueEntry, ValueEntry valueEntry2) {
        valueEntry.setSuccessorInMultimap(valueEntry2);
        valueEntry2.setPredecessorInMultimap(valueEntry);
    }

    public static void access$500(C15992c cVar) {
        C15992c predecessorInValueSet = cVar.getPredecessorInValueSet();
        C15992c successorInValueSet = cVar.getSuccessorInValueSet();
        predecessorInValueSet.setSuccessorInValueSet(successorInValueSet);
        successorInValueSet.setPredecessorInValueSet(predecessorInValueSet);
    }

    public static void access$600(ValueEntry valueEntry) {
        ValueEntry predecessorInMultimap = valueEntry.getPredecessorInMultimap();
        ValueEntry successorInMultimap = valueEntry.getSuccessorInMultimap();
        predecessorInMultimap.setSuccessorInMultimap(successorInMultimap);
        successorInMultimap.setPredecessorInMultimap(predecessorInMultimap);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> valueEntry = new ValueEntry<>(null, null, 0, (ValueEntry) null);
        this.f35985i = valueEntry;
        valueEntry.setSuccessorInMultimap(valueEntry);
        valueEntry.setPredecessorInMultimap(valueEntry);
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        CompactLinkedHashMap createWithExpectedSize = CompactLinkedHashMap.createWithExpectedSize(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            createWithExpectedSize.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            ((Collection) createWithExpectedSize.get(objectInputStream.readObject())).add(objectInputStream.readObject());
        }
        setMap(createWithExpectedSize);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (Object writeObject : keySet()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.f35985i;
        valueEntry.setSuccessorInMultimap(valueEntry);
        valueEntry.setPredecessorInMultimap(valueEntry);
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

    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C15989a();
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Set get(@NullableDecl Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Set<K> keySet() {
        return super.keySet();
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
    public /* bridge */ /* synthetic */ Set removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Iterator<V> valueIterator() {
        return new C16233w0(entryIterator());
    }

    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(Maps.m26054b(i), Maps.m26054b(i2));
    }

    public Set<V> createCollection() {
        return CompactLinkedHashSet.createWithExpectedSize(this.valueSetCapacity);
    }

    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @CanIgnoreReturnValue
    public Set<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(C16154c1<? extends K, ? extends V> c1Var) {
        LinkedHashMultimap<K, V> create = create(c1Var.keySet().size(), 2);
        create.putAll(c1Var);
        return create;
    }

    public Collection<V> createCollection(K k) {
        return new C15990b(k, this.valueSetCapacity);
    }
}
