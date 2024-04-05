package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements C16178h1<E> {
    @LazyInit

    /* renamed from: c */
    public transient ImmutableList<E> f35928c;
    @LazyInit

    /* renamed from: d */
    public transient ImmutableSet<C16178h1.C16179a<E>> f35929d;

    public final class EntrySet extends IndexedImmutableSet<C16178h1.C16179a<E>> {
        private static final long serialVersionUID = 0;

        public EntrySet(C15965a aVar) {
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C16178h1.C16179a)) {
                return false;
            }
            C16178h1.C16179a aVar = (C16178h1.C16179a) obj;
            return aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.getElement()) == aVar.getCount();
        }

        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        public C16178h1.C16179a<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }
    }

    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$a */
    public class C15965a extends C16170f2<E> {

        /* renamed from: b */
        public int f35930b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        public E f35931c;

        /* renamed from: d */
        public final /* synthetic */ Iterator f35932d;

        public C15965a(C16170f2 f2Var) {
            this.f35932d = f2Var;
        }

        public final boolean hasNext() {
            return this.f35930b > 0 || this.f35932d.hasNext();
        }

        public final E next() {
            if (this.f35930b <= 0) {
                C16178h1.C16179a aVar = (C16178h1.C16179a) this.f35932d.next();
                this.f35931c = aVar.getElement();
                this.f35930b = aVar.getCount();
            }
            this.f35930b--;
            return this.f35931c;
        }
    }

    /* renamed from: a */
    public static <E> ImmutableMultiset<E> m25874a(E... eArr) {
        C15966b bVar = new C15966b(4);
        bVar.mo56723d(eArr);
        return bVar.mo56725f();
    }

    public static <E> C15966b<E> builder() {
        return new C15966b<>(4);
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends C16178h1.C16179a<? extends E>> collection) {
        C16191k1 k1Var = new C16191k1(collection.size());
        loop0:
        while (true) {
            for (C16178h1.C16179a aVar : collection) {
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    if (0 != 0) {
                        k1Var = new C16191k1(k1Var);
                    }
                    element.getClass();
                    k1Var.mo57697l(k1Var.mo57689d(element) + count, element);
                }
            }
            break loop0;
        }
        return k1Var.f36285c == 0 ? m25875of() : new RegularImmutableMultiset(k1Var);
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return m25874a(eArr);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25875of() {
        return RegularImmutableMultiset.EMPTY;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f35928c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList = super.asList();
        this.f35928c = asList;
        return asList;
    }

    public boolean contains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        C16170f2 it = entrySet().iterator();
        while (it.hasNext()) {
            C16178h1.C16179a aVar = (C16178h1.C16179a) it.next();
            Arrays.fill(objArr, i, aVar.getCount() + i, aVar.getElement());
            i += aVar.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(@NullableDecl @CompatibleWith("E") Object obj);

    public abstract ImmutableSet<E> elementSet();

    public boolean equals(@NullableDecl Object obj) {
        return Multisets.m26079b(this, obj);
    }

    public abstract C16178h1.C16179a<E> getEntry(int i);

    public int hashCode() {
        return Sets.m26092b(entrySet());
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return entrySet().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        C16191k1<E> k1Var;
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        C15966b bVar = new C15966b(Multisets.m26080c(iterable));
        if (iterable instanceof C16178h1) {
            C16178h1 h1Var = (C16178h1) iterable;
            if (h1Var instanceof RegularImmutableMultiset) {
                k1Var = ((RegularImmutableMultiset) h1Var).contents;
            } else {
                k1Var = h1Var instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) h1Var).backingMap : null;
            }
            if (k1Var != null) {
                C16191k1<E> k1Var2 = bVar.f35933a;
                k1Var2.mo57687b(Math.max(k1Var2.f36285c, k1Var.f36285c));
                for (int c = k1Var.mo57688c(); c >= 0; c = k1Var.mo57695j(c)) {
                    C15794l.m25616j(c, k1Var.f36285c);
                    bVar.mo56724e(k1Var.mo57690e(c), k1Var.f36283a[c]);
                }
            } else {
                Set entrySet = h1Var.entrySet();
                C16191k1<E> k1Var3 = bVar.f35933a;
                k1Var3.mo57687b(Math.max(k1Var3.f36285c, entrySet.size()));
                for (C16178h1.C16179a aVar : h1Var.entrySet()) {
                    bVar.mo56724e(aVar.getCount(), aVar.getElement());
                }
            }
        } else {
            for (Object c2 : iterable) {
                bVar.mo56721b(c2);
            }
        }
        return bVar.mo56725f();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25876of(E e) {
        return m25874a(e);
    }

    public ImmutableSet<C16178h1.C16179a<E>> entrySet() {
        ImmutableSet<C16178h1.C16179a<E>> immutableSet = this.f35929d;
        if (immutableSet == null) {
            immutableSet = isEmpty() ? ImmutableSet.m25894of() : new EntrySet((C15965a) null);
            this.f35929d = immutableSet;
        }
        return immutableSet;
    }

    public C16170f2<E> iterator() {
        return new C15965a(entrySet().iterator());
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25877of(E e, E e2) {
        return m25874a(e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25878of(E e, E e2, E e3) {
        return m25874a(e, e2, e3);
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$b */
    public static class C15966b<E> extends ImmutableCollection.C15950b<E> {

        /* renamed from: a */
        public C16191k1<E> f35933a;

        /* renamed from: b */
        public boolean f35934b;

        public C15966b(int i) {
            this.f35934b = false;
            this.f35933a = new C16191k1<>(i, 0);
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C15966b<E> mo56721b(E e) {
            return mo56724e(1, e);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C15966b<E> mo56723d(E... eArr) {
            for (E b : eArr) {
                mo56721b(b);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C15966b mo56724e(int i, Object obj) {
            if (i == 0) {
                return this;
            }
            if (this.f35934b) {
                this.f35933a = new C16191k1<>(this.f35933a);
            }
            this.f35934b = false;
            obj.getClass();
            C16191k1<E> k1Var = this.f35933a;
            k1Var.mo57697l(k1Var.mo57689d(obj) + i, obj);
            return this;
        }

        /* renamed from: f */
        public ImmutableMultiset<E> mo56725f() {
            if (this.f35933a.f36285c == 0) {
                return ImmutableMultiset.m25875of();
            }
            this.f35934b = true;
            return new RegularImmutableMultiset(this.f35933a);
        }

        public C15966b(Object obj) {
            this.f35934b = false;
            this.f35933a = null;
        }
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25879of(E e, E e2, E e3, E e4) {
        return m25874a(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25880of(E e, E e2, E e3, E e4, E e5) {
        return m25874a(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m25881of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C15966b bVar = new C15966b(4);
        bVar.mo56724e(1, e);
        return bVar.mo56721b(e2).mo56721b(e3).mo56721b(e4).mo56721b(e5).mo56721b(e6).mo56723d(eArr).mo56725f();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        C15966b bVar = new C15966b(4);
        while (it.hasNext()) {
            bVar.mo56721b(it.next());
        }
        return bVar.mo56725f();
    }
}
