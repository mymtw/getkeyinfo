package p157k0;

import android.os.LocaleList;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19875a;

/* renamed from: k0.c */
public final class C7175c implements Collection<C7174b>, C19875a {

    /* renamed from: b */
    public final List<C7174b> f15951b;

    /* renamed from: c */
    public final int f15952c;

    /* renamed from: k0.c$a */
    public static final class C7176a {
        /* renamed from: a */
        public static C7175c m13834a() {
            LocaleList localeList = LocaleList.getDefault();
            C19383o.m32796f(localeList, "getDefault()");
            ArrayList arrayList = new ArrayList();
            int size = localeList.size();
            for (int i = 0; i < size; i++) {
                Locale locale = localeList.get(i);
                C19383o.m32796f(locale, "localeList[i]");
                arrayList.add(new C7173a(locale));
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(new C7174b((C7177d) arrayList.get(i2)));
            }
            return new C7175c(arrayList2);
        }
    }

    public C7175c(ArrayList arrayList) {
        this.f15951b = arrayList;
        this.f15952c = arrayList.size();
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends C7174b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C7174b)) {
            return false;
        }
        C7174b bVar = (C7174b) obj;
        C19383o.m32797g(bVar, "element");
        return this.f15951b.contains(bVar);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        return this.f15951b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7175c) && C19383o.m32792b(this.f15951b, ((C7175c) obj).f15951b);
    }

    public final int hashCode() {
        return this.f15951b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f15951b.isEmpty();
    }

    public final Iterator<C7174b> iterator() {
        return this.f15951b.iterator();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate<? super C7174b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f15952c;
    }

    public final Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("LocaleList(localeList="), this.f15951b, ')');
    }
}
