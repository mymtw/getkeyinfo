package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.C16225u;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C16203o.m26218e(false);
        }
    }

    /* renamed from: com.google.common.collect.Iterators$a */
    public static class C15984a extends C16170f2<T> {

        /* renamed from: b */
        public final /* synthetic */ Iterator f35973b;

        public C15984a(Iterator it) {
            this.f35973b = it;
        }

        public final boolean hasNext() {
            return this.f35973b.hasNext();
        }

        public final T next() {
            return this.f35973b.next();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$b */
    public static final class C15985b<T> extends C16140a<T> {

        /* renamed from: f */
        public static final C15985b f35974f = new C15985b(new Object[0]);

        /* renamed from: d */
        public final T[] f35975d;

        /* renamed from: e */
        public final int f35976e = 0;

        public C15985b(Object[] objArr) {
            super(0, 0);
            this.f35975d = objArr;
        }

        /* renamed from: a */
        public final T mo56286a(int i) {
            return this.f35975d[this.f35976e + i];
        }
    }

    /* renamed from: com.google.common.collect.Iterators$c */
    public static class C15986c<T> implements Iterator<T> {
        @NullableDecl

        /* renamed from: b */
        public Iterator<? extends T> f35977b;

        /* renamed from: c */
        public Iterator<? extends T> f35978c = C15985b.f35974f;

        /* renamed from: d */
        public Iterator<? extends Iterator<? extends T>> f35979d;
        @NullableDecl

        /* renamed from: e */
        public ArrayDeque f35980e;

        public C15986c(C16225u.C16226a aVar) {
            this.f35979d = aVar;
        }

        public final boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (true) {
                Iterator<? extends T> it2 = this.f35978c;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it3 = this.f35979d;
                    if (it3 != null && it3.hasNext()) {
                        it = this.f35979d;
                        break;
                    }
                    ArrayDeque arrayDeque = this.f35980e;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                    } else {
                        this.f35979d = (Iterator) this.f35980e.removeFirst();
                    }
                }
                it = null;
                this.f35979d = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> it4 = (Iterator) it.next();
                this.f35978c = it4;
                if (it4 instanceof C15986c) {
                    C15986c cVar = (C15986c) it4;
                    this.f35978c = cVar.f35978c;
                    if (this.f35980e == null) {
                        this.f35980e = new ArrayDeque();
                    }
                    this.f35980e.addFirst(this.f35979d);
                    if (cVar.f35980e != null) {
                        while (!cVar.f35980e.isEmpty()) {
                            this.f35980e.addFirst(cVar.f35980e.removeLast());
                        }
                    }
                    this.f35979d = cVar.f35979d;
                }
            }
        }

        public final T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f35978c;
                this.f35977b = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C16203o.m26218e(this.f35977b != null);
            this.f35977b.remove();
            this.f35977b = null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$d */
    public static class C15987d<T> extends C16170f2<T> {

        /* renamed from: b */
        public final PriorityQueue f35981b;

        public C15987d(C16194l0 l0Var, Comparator comparator) {
            this.f35981b = new PriorityQueue(2, new C16216r0(comparator));
            Iterator<Object> it = l0Var.iterator();
            while (true) {
                C16155c2 c2Var = (C16155c2) it;
                if (c2Var.hasNext()) {
                    Iterator it2 = (Iterator) c2Var.next();
                    if (it2.hasNext()) {
                        this.f35981b.add(Iterators.m25982e(it2));
                    }
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return !this.f35981b.isEmpty();
        }

        public final T next() {
            C16199m1 m1Var = (C16199m1) this.f35981b.remove();
            T next = m1Var.next();
            if (m1Var.hasNext()) {
                this.f35981b.add(m1Var);
            }
            return next;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$e */
    public static class C15988e<E> implements C16199m1<E> {

        /* renamed from: b */
        public final Iterator<? extends E> f35982b;

        /* renamed from: c */
        public boolean f35983c;
        @NullableDecl

        /* renamed from: d */
        public E f35984d;

        public C15988e(Iterator<? extends E> it) {
            it.getClass();
            this.f35982b = it;
        }

        public final boolean hasNext() {
            return this.f35983c || this.f35982b.hasNext();
        }

        public final E next() {
            if (!this.f35983c) {
                return this.f35982b.next();
            }
            E e = this.f35984d;
            this.f35983c = false;
            this.f35984d = null;
            return e;
        }

        public final E peek() {
            if (!this.f35983c) {
                this.f35984d = this.f35982b.next();
                this.f35983c = true;
            }
            return this.f35984d;
        }

        public final void remove() {
            C15794l.m25624r(!this.f35983c, "Can't remove after you've peeked at next");
            this.f35982b.remove();
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m25978a(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static void m25979b(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    public static boolean m25980c(@NullableDecl Object obj, Iterator it) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    @NullableDecl
    /* renamed from: d */
    public static Object m25981d(@NullableDecl String str, Iterator it) {
        return it.hasNext() ? it.next() : str;
    }

    /* renamed from: e */
    public static C15988e m25982e(Iterator it) {
        return it instanceof C15988e ? (C15988e) it : new C15988e(it);
    }

    @NullableDecl
    /* renamed from: f */
    public static <T> T m25983f(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    /* renamed from: g */
    public static boolean m25984g(Collection collection, Iterator it) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public static int m25985h(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.m26384b(j);
    }

    /* renamed from: i */
    public static <T> C16170f2<T> m25986i(Iterator<? extends T> it) {
        it.getClass();
        return it instanceof C16170f2 ? (C16170f2) it : new C15984a(it);
    }
}
