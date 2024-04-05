package androidx.compose.p015ui.text.font;

import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19875a;

/* renamed from: androidx.compose.ui.text.font.j */
public final class C1956j extends C1952g implements List<C1950f>, C19875a {

    /* renamed from: c */
    public final /* synthetic */ List<C1950f> f4405c;

    /* renamed from: d */
    public final ArrayList f4406d;

    public C1956j(List<? extends C1950f> list) {
        this.f4405c = list;
        if (!list.isEmpty()) {
            this.f4406d = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection<? extends C1950f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends C1950f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C1950f)) {
            return false;
        }
        C1950f fVar = (C1950f) obj;
        C19383o.m32797g(fVar, "element");
        return this.f4405c.contains(fVar);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        return this.f4405c.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1956j) && C19383o.m32792b(this.f4406d, ((C1956j) obj).f4406d);
    }

    public final Object get(int i) {
        return this.f4405c.get(i);
    }

    public final int hashCode() {
        return this.f4406d.hashCode();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof C1950f)) {
            return -1;
        }
        C1950f fVar = (C1950f) obj;
        C19383o.m32797g(fVar, "element");
        return this.f4405c.indexOf(fVar);
    }

    public final boolean isEmpty() {
        return this.f4405c.isEmpty();
    }

    public final Iterator<C1950f> iterator() {
        return this.f4405c.iterator();
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C1950f)) {
            return -1;
        }
        C1950f fVar = (C1950f) obj;
        C19383o.m32797g(fVar, "element");
        return this.f4405c.lastIndexOf(fVar);
    }

    public final ListIterator<C1950f> listIterator() {
        return this.f4405c.listIterator();
    }

    public final ListIterator<C1950f> listIterator(int i) {
        return this.f4405c.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator<C1950f> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f4405c.size();
    }

    public final void sort(Comparator<? super C1950f> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<C1950f> subList(int i, int i2) {
        return this.f4405c.subList(i, i2);
    }

    public final Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FontListFontFamily(fonts=");
        h.append(this.f4406d);
        h.append(')');
        return h.toString();
    }
}
