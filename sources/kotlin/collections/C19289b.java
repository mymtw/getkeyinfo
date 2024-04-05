package kotlin.collections;

import android.support.p013v4.media.session.C0087d;
import androidx.compose.animation.C0472h;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: kotlin.collections.b */
public abstract class C19289b<E> extends AbstractCollection<E> implements List<E> {

    /* renamed from: kotlin.collections.b$a */
    public static final class C19290a {
        /* renamed from: a */
        public static void m32556a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder g = C0472h.m1244g("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                g.append(i3);
                throw new IndexOutOfBoundsException(g.toString());
            } else if (i > i2) {
                throw new IllegalArgumentException(C0087d.m235e("fromIndex: ", i, " > toIndex: ", i2));
            }
        }
    }

    /* renamed from: kotlin.collections.b$b */
    public class C19291b implements Iterator<E>, C19875a {

        /* renamed from: b */
        public int f43157b;

        public C19291b() {
        }

        public final boolean hasNext() {
            return this.f43157b < C19289b.this.mo5763a();
        }

        public final E next() {
            if (hasNext()) {
                C19289b<E> bVar = C19289b.this;
                int i = this.f43157b;
                this.f43157b = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$c */
    public class C19292c extends C19289b<E>.b implements ListIterator<E> {
        public C19292c(int i) {
            super();
            int a = C19289b.this.mo5763a();
            if (i < 0 || i > a) {
                throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", a));
            }
            this.f43157b = i;
        }

        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return this.f43157b > 0;
        }

        public final int nextIndex() {
            return this.f43157b;
        }

        public final E previous() {
            if (hasPrevious()) {
                C19289b<E> bVar = C19289b.this;
                int i = this.f43157b - 1;
                this.f43157b = i;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f43157b - 1;
        }

        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$d */
    public static final class C19293d<E> extends C19289b<E> implements RandomAccess {

        /* renamed from: b */
        public final C19289b<E> f43160b;

        /* renamed from: c */
        public final int f43161c;

        /* renamed from: d */
        public int f43162d;

        public C19293d(C19289b<? extends E> bVar, int i, int i2) {
            C19383o.m32797g(bVar, ResponseConstants.LIST);
            this.f43160b = bVar;
            this.f43161c = i;
            C19290a.m32556a(i, i2, bVar.mo5763a());
            this.f43162d = i2 - i;
        }

        /* renamed from: a */
        public final int mo5763a() {
            return this.f43162d;
        }

        public final E get(int i) {
            int i2 = this.f43162d;
            if (i >= 0 && i < i2) {
                return this.f43160b.get(this.f43161c + i);
            }
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", i2));
        }
    }

    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C19383o.m32797g(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object b : this) {
                if (!C19383o.m32792b(b, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i);

    public final int hashCode() {
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object b : this) {
            if (C19383o.m32792b(b, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C19291b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C19383o.m32792b(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C19292c(0);
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C19293d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C19292c(i);
    }
}
