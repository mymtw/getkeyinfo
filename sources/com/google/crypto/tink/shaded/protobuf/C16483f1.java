package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f1 */
public final class C16483f1 extends AbstractList<String> implements C16545z, RandomAccess {

    /* renamed from: b */
    public final C16545z f36601b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.f1$a */
    public class C16484a implements ListIterator<String> {

        /* renamed from: b */
        public ListIterator<String> f36602b;

        public C16484a(C16483f1 f1Var, int i) {
            this.f36602b = f1Var.f36601b.listIterator(i);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            return this.f36602b.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f36602b.hasPrevious();
        }

        public final Object next() {
            return this.f36602b.next();
        }

        public final int nextIndex() {
            return this.f36602b.nextIndex();
        }

        public final Object previous() {
            return this.f36602b.previous();
        }

        public final int previousIndex() {
            return this.f36602b.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.f1$b */
    public class C16485b implements Iterator<String> {

        /* renamed from: b */
        public Iterator<String> f36603b;

        public C16485b(C16483f1 f1Var) {
            this.f36603b = f1Var.f36601b.iterator();
        }

        public final boolean hasNext() {
            return this.f36603b.hasNext();
        }

        public final Object next() {
            return this.f36603b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C16483f1(C16545z zVar) {
        this.f36601b = zVar;
    }

    /* renamed from: f */
    public final List<?> mo58719f() {
        return this.f36601b.mo58719f();
    }

    public final Object get(int i) {
        return (String) this.f36601b.get(i);
    }

    public final Iterator<String> iterator() {
        return new C16485b(this);
    }

    /* renamed from: j */
    public final C16545z mo58722j() {
        return this;
    }

    /* renamed from: k */
    public final Object mo58723k(int i) {
        return this.f36601b.mo58723k(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C16484a(this, i);
    }

    /* renamed from: m0 */
    public final void mo58725m0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f36601b.size();
    }
}
