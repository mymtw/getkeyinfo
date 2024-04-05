package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.g1 */
public final class C2581g1 extends AbstractList<String> implements C2548a0, RandomAccess {

    /* renamed from: b */
    public final C2548a0 f5871b;

    /* renamed from: androidx.datastore.preferences.protobuf.g1$a */
    public class C2582a implements ListIterator<String> {

        /* renamed from: b */
        public ListIterator<String> f5872b;

        public C2582a(C2581g1 g1Var, int i) {
            this.f5872b = g1Var.f5871b.listIterator(i);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            return this.f5872b.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f5872b.hasPrevious();
        }

        public final Object next() {
            return this.f5872b.next();
        }

        public final int nextIndex() {
            return this.f5872b.nextIndex();
        }

        public final Object previous() {
            return this.f5872b.previous();
        }

        public final int previousIndex() {
            return this.f5872b.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g1$b */
    public class C2583b implements Iterator<String> {

        /* renamed from: b */
        public Iterator<String> f5873b;

        public C2583b(C2581g1 g1Var) {
            this.f5873b = g1Var.f5871b.iterator();
        }

        public final boolean hasNext() {
            return this.f5873b.hasNext();
        }

        public final Object next() {
            return this.f5873b.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C2581g1(C2548a0 a0Var) {
        this.f5871b = a0Var;
    }

    /* renamed from: c0 */
    public final void mo9546c0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final List<?> mo9547f() {
        return this.f5871b.mo9547f();
    }

    public final Object get(int i) {
        return (String) this.f5871b.get(i);
    }

    public final Iterator<String> iterator() {
        return new C2583b(this);
    }

    /* renamed from: j */
    public final C2548a0 mo9548j() {
        return this;
    }

    /* renamed from: k */
    public final Object mo9549k(int i) {
        return this.f5871b.mo9549k(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C2582a(this, i);
    }

    public final int size() {
        return this.f5871b.size();
    }
}
