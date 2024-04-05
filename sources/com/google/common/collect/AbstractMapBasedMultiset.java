package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.collect.C16191k1;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class AbstractMapBasedMultiset<E> extends C16156d<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient C16191k1<E> backingMap;
    public transient long size;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$a */
    public class C15905a extends AbstractMapBasedMultiset<E>.c<E> {
        public C15905a() {
            super();
        }

        /* renamed from: a */
        public final E mo56234a(int i) {
            C16191k1<E> k1Var = AbstractMapBasedMultiset.this.backingMap;
            C15794l.m25616j(i, k1Var.f36285c);
            return k1Var.f36283a[i];
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$b */
    public class C15906b extends AbstractMapBasedMultiset<E>.c<C16178h1.C16179a<E>> {
        public C15906b() {
            super();
        }

        /* renamed from: a */
        public final Object mo56234a(int i) {
            C16191k1<E> k1Var = AbstractMapBasedMultiset.this.backingMap;
            C15794l.m25616j(i, k1Var.f36285c);
            return new C16191k1.C16192a(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$c */
    public abstract class C15907c<T> implements Iterator<T> {

        /* renamed from: b */
        public int f35785b;

        /* renamed from: c */
        public int f35786c = -1;

        /* renamed from: d */
        public int f35787d;

        public C15907c() {
            this.f35785b = AbstractMapBasedMultiset.this.backingMap.mo57688c();
            this.f35787d = AbstractMapBasedMultiset.this.backingMap.f36286d;
        }

        /* renamed from: a */
        public abstract T mo56234a(int i);

        public final boolean hasNext() {
            if (AbstractMapBasedMultiset.this.backingMap.f36286d == this.f35787d) {
                return this.f35785b >= 0;
            }
            throw new ConcurrentModificationException();
        }

        public final T next() {
            if (hasNext()) {
                T a = mo56234a(this.f35785b);
                int i = this.f35785b;
                this.f35786c = i;
                this.f35785b = AbstractMapBasedMultiset.this.backingMap.mo57695j(i);
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (AbstractMapBasedMultiset.this.backingMap.f36286d == this.f35787d) {
                C16203o.m26218e(this.f35786c != -1);
                AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
                abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.mo57699n(this.f35786c);
                this.f35785b = AbstractMapBasedMultiset.this.backingMap.mo57696k(this.f35785b, this.f35786c);
                this.f35786c = -1;
                this.f35787d = AbstractMapBasedMultiset.this.backingMap.f36286d;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public AbstractMapBasedMultiset(int i) {
        init(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        init(3);
        C16213q1.m26247d(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C16213q1.m26250g(this, objectOutputStream);
    }

    @CanIgnoreReturnValue
    public final int add(@NullableDecl E e, int i) {
        if (i == 0) {
            return count(e);
        }
        boolean z = true;
        C15794l.m25609c(i, "occurrences cannot be negative: %s", i > 0);
        int f = this.backingMap.mo57691f(e);
        if (f == -1) {
            this.backingMap.mo57697l(i, e);
            this.size += (long) i;
            return 0;
        }
        int e2 = this.backingMap.mo57690e(f);
        long j = (long) i;
        long j2 = ((long) e2) + j;
        if (j2 > ParserMinimalBase.MAX_INT_L) {
            z = false;
        }
        C15794l.m25610d(j2, "too many occurrences: %s", z);
        C16191k1<E> k1Var = this.backingMap;
        C15794l.m25616j(f, k1Var.f36285c);
        k1Var.f36284b[f] = (int) j2;
        this.size += j;
        return e2;
    }

    public void addTo(C16178h1<? super E> h1Var) {
        h1Var.getClass();
        int c = this.backingMap.mo57688c();
        while (c >= 0) {
            C16191k1<E> k1Var = this.backingMap;
            C15794l.m25616j(c, k1Var.f36285c);
            h1Var.add(k1Var.f36283a[c], this.backingMap.mo57690e(c));
            c = this.backingMap.mo57695j(c);
        }
    }

    public final void clear() {
        this.backingMap.mo57686a();
        this.size = 0;
    }

    public final int count(@NullableDecl Object obj) {
        return this.backingMap.mo57689d(obj);
    }

    public final int distinctElements() {
        return this.backingMap.f36285c;
    }

    public final Iterator<E> elementIterator() {
        return new C15905a();
    }

    public final Iterator<C16178h1.C16179a<E>> entryIterator() {
        return new C15906b();
    }

    public abstract void init(int i);

    public final Iterator<E> iterator() {
        return Multisets.m26081d(this);
    }

    @CanIgnoreReturnValue
    public final int remove(@NullableDecl Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        C15794l.m25609c(i, "occurrences cannot be negative: %s", i > 0);
        int f = this.backingMap.mo57691f(obj);
        if (f == -1) {
            return 0;
        }
        int e = this.backingMap.mo57690e(f);
        if (e > i) {
            C16191k1<E> k1Var = this.backingMap;
            C15794l.m25616j(f, k1Var.f36285c);
            k1Var.f36284b[f] = e - i;
        } else {
            this.backingMap.mo57699n(f);
            i = e;
        }
        this.size -= (long) i;
        return e;
    }

    @CanIgnoreReturnValue
    public final int setCount(@NullableDecl E e, int i) {
        int i2;
        C16203o.m26215b(i, ResponseConstants.COUNT);
        C16191k1<E> k1Var = this.backingMap;
        if (i == 0) {
            k1Var.getClass();
            i2 = k1Var.mo57698m(e, C16184i0.m26180c(e));
        } else {
            i2 = k1Var.mo57697l(i, e);
        }
        this.size += (long) (i - i2);
        return i2;
    }

    public final int size() {
        return Ints.m26384b(this.size);
    }

    public final boolean setCount(@NullableDecl E e, int i, int i2) {
        C16203o.m26215b(i, "oldCount");
        C16203o.m26215b(i2, "newCount");
        int f = this.backingMap.mo57691f(e);
        if (f == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.mo57697l(i2, e);
                this.size += (long) i2;
            }
            return true;
        } else if (this.backingMap.mo57690e(f) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.backingMap.mo57699n(f);
                this.size -= (long) i;
            } else {
                C16191k1<E> k1Var = this.backingMap;
                C15794l.m25616j(f, k1Var.f36285c);
                k1Var.f36284b[f] = i2;
                this.size += (long) (i2 - i);
            }
            return true;
        }
    }
}
