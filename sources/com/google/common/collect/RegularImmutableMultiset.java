package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.collect.C16191k1;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(new C16191k1());
    public final transient C16191k1<E> contents;

    /* renamed from: e */
    public final transient int f36133e;
    @LazyInit

    /* renamed from: f */
    public transient ImmutableSet<E> f36134f;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet(C16080a aVar) {
        }

        public boolean contains(@NullableDecl Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        public E get(int i) {
            C16191k1<E> k1Var = RegularImmutableMultiset.this.contents;
            C15794l.m25616j(i, k1Var.f36285c);
            return k1Var.f36283a[i];
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return RegularImmutableMultiset.this.contents.f36285c;
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        public SerializedForm(C16178h1<?> h1Var) {
            int size = h1Var.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (C16178h1.C16179a next : h1Var.entrySet()) {
                this.elements[i] = next.getElement();
                this.counts[i] = next.getCount();
                i++;
            }
        }

        public Object readResolve() {
            C16191k1 k1Var = new C16191k1(this.elements.length);
            int i = 0;
            boolean z = false;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    break;
                }
                Object obj = objArr[i];
                int i2 = this.counts[i];
                if (i2 != 0) {
                    if (z) {
                        k1Var = new C16191k1(k1Var);
                    }
                    obj.getClass();
                    k1Var.mo57697l(k1Var.mo57689d(obj) + i2, obj);
                    z = false;
                }
                i++;
            }
            return k1Var.f36285c == 0 ? ImmutableMultiset.m25875of() : new RegularImmutableMultiset(k1Var);
        }
    }

    public RegularImmutableMultiset(C16191k1<E> k1Var) {
        this.contents = k1Var;
        long j = 0;
        for (int i = 0; i < k1Var.f36285c; i++) {
            j += (long) k1Var.mo57690e(i);
        }
        this.f36133e = Ints.m26384b(j);
    }

    public int count(@NullableDecl Object obj) {
        return this.contents.mo57689d(obj);
    }

    public C16178h1.C16179a<E> getEntry(int i) {
        C16191k1<E> k1Var = this.contents;
        C15794l.m25616j(i, k1Var.f36285c);
        return new C16191k1.C16192a(i);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f36133e;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f36134f;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet((C16080a) null);
        this.f36134f = elementSet;
        return elementSet;
    }
}
