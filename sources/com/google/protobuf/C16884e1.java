package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.e1 */
public final class C16884e1 extends AbstractList<String> implements C16952z, RandomAccess {

    /* renamed from: b */
    public final C16952z f37205b;

    /* renamed from: com.google.protobuf.e1$a */
    public class C16885a implements ListIterator<String> {

        /* renamed from: b */
        public ListIterator<String> f37206b;

        public C16885a(C16884e1 e1Var, int i) {
            this.f37206b = e1Var.f37205b.listIterator(i);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            return this.f37206b.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f37206b.hasPrevious();
        }

        public final Object next() {
            return this.f37206b.next();
        }

        public final int nextIndex() {
            return this.f37206b.nextIndex();
        }

        public final Object previous() {
            return this.f37206b.previous();
        }

        public final int previousIndex() {
            return this.f37206b.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.e1$b */
    public class C16886b implements Iterator<String> {

        /* renamed from: b */
        public Iterator<String> f37207b;

        public C16886b(C16884e1 e1Var) {
            this.f37207b = e1Var.f37205b.iterator();
        }

        public final boolean hasNext() {
            return this.f37207b.hasNext();
        }

        public final Object next() {
            return this.f37207b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C16884e1(C16952z zVar) {
        this.f37205b = zVar;
    }

    /* renamed from: f */
    public final List<?> mo59884f() {
        return this.f37205b.mo59884f();
    }

    public final Object get(int i) {
        return (String) this.f37205b.get(i);
    }

    public final Iterator<String> iterator() {
        return new C16886b(this);
    }

    /* renamed from: j */
    public final C16952z mo59887j() {
        return this;
    }

    /* renamed from: k */
    public final Object mo59888k(int i) {
        return this.f37205b.mo59888k(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C16885a(this, i);
    }

    public final int size() {
        return this.f37205b.size();
    }

    /* renamed from: t */
    public final void mo59891t(ByteString byteString) {
        throw new UnsupportedOperationException();
    }
}
