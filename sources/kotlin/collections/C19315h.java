package kotlin.collections;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19875a;

/* renamed from: kotlin.collections.h */
public final class C19315h<T> implements Collection<T>, C19875a {

    /* renamed from: b */
    public final T[] f43181b;

    /* renamed from: c */
    public final boolean f43182c;

    public C19315h(T[] tArr, boolean z) {
        C19383o.m32797g(tArr, ResponseConstants.VALUES);
        this.f43181b = tArr;
        this.f43182c = z;
    }

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        T[] tArr = this.f43181b;
        C19383o.m32797g(tArr, "<this>");
        return C19318k.m32615g1(tArr, obj) >= 0;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f43181b.length == 0;
    }

    public final Iterator<T> iterator() {
        return C15588c1.m25350u0(this.f43181b);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f43181b.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f43181b;
        boolean z = this.f43182c;
        Class<Object[]> cls = Object[].class;
        C19383o.m32797g(tArr, "<this>");
        if (z && C19383o.m32792b(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C19383o.m32796f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }
}
