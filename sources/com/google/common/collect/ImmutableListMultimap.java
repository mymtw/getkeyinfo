package com.google.common.collect;

import com.google.common.collect.C16213q1;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003a2.C0015b;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements C16219s0<K, V> {
    private static final long serialVersionUID = 0;
    @RetainedWith
    @LazyInit

    /* renamed from: g */
    public transient ImmutableListMultimap<V, K> f35907g;

    /* renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C15955a<K, V> extends ImmutableMultimap.C15963c<K, V> {
        @CanIgnoreReturnValue
        /* renamed from: b */
        public final ImmutableMultimap.C15963c mo56666b(Object obj, Object obj2) {
            super.mo56666b(obj, obj2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final void mo56667c(Map.Entry entry) {
            super.mo56667c(entry);
        }

        /* renamed from: e */
        public final ImmutableListMultimap<K, V> mo56668e() {
            return ImmutableListMultimap.fromMapEntries(this.f35925a.entrySet(), (Comparator) null);
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public final void mo56669f(Object obj, Object obj2) {
            super.mo56666b(obj, obj2);
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public final void mo56670g(String str, Object... objArr) {
            super.mo56713d(str, Arrays.asList(objArr));
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> C15955a<K, V> builder() {
        return new C15955a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(C16154c1<? extends K, ? extends V> c1Var) {
        if (c1Var.isEmpty()) {
            return m25842of();
        }
        if (c1Var instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) c1Var;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(c1Var.asMap().entrySet(), (Comparator) null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m25842of();
        }
        Object[] objArr = new Object[(collection.size() * 2)];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            ImmutableList<E> copyOf = comparator == null ? ImmutableList.copyOf(collection2) : ImmutableList.sortedCopyOf(comparator, collection2);
            if (!copyOf.isEmpty()) {
                int i3 = (i2 + 1) * 2;
                if (i3 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i3));
                }
                C16203o.m26214a(key, copyOf);
                objArr[i2 * 2] = key;
                objArr[(i2 * 2) + 1] = copyOf;
                i2++;
                i = copyOf.size() + i;
            }
        }
        return new ImmutableListMultimap<>(RegularImmutableMap.create(i2, objArr), i);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m25842of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.C15958b builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.C15953a builder2 = ImmutableList.builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.mo56633b(objectInputStream.readObject());
                    }
                    builder.mo56613b(readObject, builder2.mo56664e());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException(C0015b.m88g("Invalid value count ", readInt2));
                }
            }
            try {
                ImmutableMultimap.C15964d.f35926a.mo57719a(this, builder.mo56612a());
                C16213q1.C16214a<ImmutableMultimap> aVar = ImmutableMultimap.C15964d.f35927b;
                aVar.getClass();
                try {
                    aVar.f36314a.set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        } else {
            throw new InvalidObjectException(C0015b.m88g("Invalid key count ", readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C16213q1.m26249f(this, objectOutputStream);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m25843of(K k, V v) {
        C15955a builder = builder();
        builder.mo56669f(k, v);
        return builder.mo56668e();
    }

    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.f35907g;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        C15955a builder = builder();
        C16170f2 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.mo56669f(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> e = builder.mo56668e();
        e.f35907g = this;
        this.f35907g = e;
        return e;
    }

    public ImmutableList<V> get(@NullableDecl K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.m25826of() : immutableList;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m25844of(K k, V v, K k2, V v2) {
        C15955a builder = builder();
        builder.mo56669f(k, v);
        builder.mo56669f(k2, v2);
        return builder.mo56668e();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C15955a aVar = new C15955a();
        for (Map.Entry c : iterable) {
            aVar.mo56667c(c);
        }
        return aVar.mo56668e();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m25845of(K k, V v, K k2, V v2, K k3, V v3) {
        C15955a builder = builder();
        builder.mo56669f(k, v);
        builder.mo56669f(k2, v2);
        builder.mo56669f(k3, v3);
        return builder.mo56668e();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m25846of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C15955a builder = builder();
        builder.mo56669f(k, v);
        builder.mo56669f(k2, v2);
        builder.mo56669f(k3, v3);
        builder.mo56669f(k4, v4);
        return builder.mo56668e();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m25847of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C15955a builder = builder();
        builder.mo56669f(k, v);
        builder.mo56669f(k2, v2);
        builder.mo56669f(k3, v3);
        builder.mo56669f(k4, v4);
        builder.mo56669f(k5, v5);
        return builder.mo56668e();
    }
}
