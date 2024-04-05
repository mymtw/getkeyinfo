package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15791j;
import com.google.common.collect.C16178h1;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Multisets {

    public static class ImmutableEntry<E> extends C16064a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        @NullableDecl
        private final E element;

        public ImmutableEntry(@NullableDecl E e, int i) {
            this.element = e;
            this.count = i;
            C16203o.m26215b(i, ResponseConstants.COUNT);
        }

        public final int getCount() {
            return this.count;
        }

        @NullableDecl
        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    public static class UnmodifiableMultiset<E> extends C16145b0<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final C16178h1<? extends E> delegate;
        @MonotonicNonNullDecl
        public transient Set<E> elementSet;
        @MonotonicNonNullDecl
        public transient Set<C16178h1.C16179a<E>> entrySet;

        public UnmodifiableMultiset(C16178h1<? extends E> h1Var) {
            this.delegate = h1Var;
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> createElementSet() {
            return Collections.unmodifiableSet(this.delegate.elementSet());
        }

        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> createElementSet = createElementSet();
            this.elementSet = createElementSet;
            return createElementSet;
        }

        public Set<C16178h1.C16179a<E>> entrySet() {
            Set<C16178h1.C16179a<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<C16178h1.C16179a<E>> unmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = unmodifiableSet;
            return unmodifiableSet;
        }

        public Iterator<E> iterator() {
            return Iterators.m25986i(this.delegate.iterator());
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        public C16178h1<E> delegate() {
            return this.delegate;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$a */
    public static abstract class C16064a<E> implements C16178h1.C16179a<E> {
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C16178h1.C16179a)) {
                return false;
            }
            C16178h1.C16179a aVar = (C16178h1.C16179a) obj;
            return getCount() == aVar.getCount() && C15791j.m25606a(getElement(), aVar.getElement());
        }

        public int hashCode() {
            Object element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            return valueOf + " x " + count;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$b */
    public static abstract class C16065b<E> extends Sets.C16082a<E> {
        /* renamed from: a */
        public abstract C16178h1<E> mo57194a();

        public final void clear() {
            mo57194a().clear();
        }

        public final boolean contains(Object obj) {
            return mo57194a().contains(obj);
        }

        public final boolean containsAll(Collection<?> collection) {
            return mo57194a().containsAll(collection);
        }

        public final boolean isEmpty() {
            return mo57194a().isEmpty();
        }

        public final boolean remove(Object obj) {
            return mo57194a().remove(obj, Api.BaseClientBuilder.API_PRIORITY_OTHER) > 0;
        }

        public final int size() {
            return mo57194a().entrySet().size();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$c */
    public static abstract class C16066c<E> extends Sets.C16082a<C16178h1.C16179a<E>> {
        /* renamed from: a */
        public abstract C16178h1<E> mo56398a();

        public final void clear() {
            mo56398a().clear();
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof C16178h1.C16179a)) {
                return false;
            }
            C16178h1.C16179a aVar = (C16178h1.C16179a) obj;
            return aVar.getCount() > 0 && mo56398a().count(aVar.getElement()) == aVar.getCount();
        }

        public final boolean remove(Object obj) {
            if (obj instanceof C16178h1.C16179a) {
                C16178h1.C16179a aVar = (C16178h1.C16179a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo56398a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$d */
    public static final class C16067d<E> implements Iterator<E> {

        /* renamed from: b */
        public final C16178h1<E> f36096b;

        /* renamed from: c */
        public final Iterator<C16178h1.C16179a<E>> f36097c;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public C16178h1.C16179a<E> f36098d;

        /* renamed from: e */
        public int f36099e;

        /* renamed from: f */
        public int f36100f;

        /* renamed from: g */
        public boolean f36101g;

        public C16067d(C16178h1<E> h1Var, Iterator<C16178h1.C16179a<E>> it) {
            this.f36096b = h1Var;
            this.f36097c = it;
        }

        public final boolean hasNext() {
            return this.f36099e > 0 || this.f36097c.hasNext();
        }

        public final E next() {
            if (hasNext()) {
                if (this.f36099e == 0) {
                    C16178h1.C16179a<E> next = this.f36097c.next();
                    this.f36098d = next;
                    int count = next.getCount();
                    this.f36099e = count;
                    this.f36100f = count;
                }
                this.f36099e--;
                this.f36101g = true;
                return this.f36098d.getElement();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C16203o.m26218e(this.f36101g);
            if (this.f36100f == 1) {
                this.f36097c.remove();
            } else {
                this.f36096b.remove(this.f36098d.getElement());
            }
            this.f36100f--;
            this.f36101g = false;
        }
    }

    /* renamed from: a */
    public static <E> boolean m26078a(C16178h1<E> h1Var, Collection<? extends E> collection) {
        h1Var.getClass();
        collection.getClass();
        if (collection instanceof C16178h1) {
            C16178h1 h1Var2 = (C16178h1) collection;
            if (h1Var2 instanceof AbstractMapBasedMultiset) {
                AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) h1Var2;
                if (abstractMapBasedMultiset.isEmpty()) {
                    return false;
                }
                abstractMapBasedMultiset.addTo(h1Var);
            } else if (h1Var2.isEmpty()) {
                return false;
            } else {
                for (C16178h1.C16179a aVar : h1Var2.entrySet()) {
                    h1Var.add(aVar.getElement(), aVar.getCount());
                }
            }
            return true;
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return Iterators.m25978a(h1Var, collection.iterator());
        }
    }

    /* renamed from: b */
    public static boolean m26079b(C16178h1<?> h1Var, @NullableDecl Object obj) {
        if (obj == h1Var) {
            return true;
        }
        if (obj instanceof C16178h1) {
            C16178h1 h1Var2 = (C16178h1) obj;
            if (h1Var.size() == h1Var2.size() && h1Var.entrySet().size() == h1Var2.entrySet().size()) {
                for (C16178h1.C16179a aVar : h1Var2.entrySet()) {
                    if (h1Var.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m26080c(Iterable<?> iterable) {
        if (iterable instanceof C16178h1) {
            return ((C16178h1) iterable).elementSet().size();
        }
        return 11;
    }

    /* renamed from: d */
    public static C16067d m26081d(C16178h1 h1Var) {
        return new C16067d(h1Var, h1Var.entrySet().iterator());
    }
}
