package androidx.compose.p015ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19875a;

/* renamed from: androidx.compose.ui.layout.n0 */
public interface C1698n0 {

    /* renamed from: androidx.compose.ui.layout.n0$a */
    public static final class C1699a implements Collection<Object>, C19875a {

        /* renamed from: b */
        public final Set<Object> f3737b = new LinkedHashSet();

        public C1699a(int i) {
        }

        public final boolean add(Object obj) {
            return this.f3737b.add(obj);
        }

        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            this.f3737b.clear();
        }

        public final boolean contains(Object obj) {
            return this.f3737b.contains(obj);
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            return this.f3737b.containsAll(collection);
        }

        public final boolean isEmpty() {
            return this.f3737b.isEmpty();
        }

        public final Iterator<Object> iterator() {
            return this.f3737b.iterator();
        }

        public final boolean remove(Object obj) {
            return this.f3737b.remove(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "slotIds");
            return this.f3737b.remove(collection);
        }

        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "slotIds");
            return this.f3737b.retainAll(collection);
        }

        public final int size() {
            return this.f3737b.size();
        }

        public final Object[] toArray() {
            return C18263b.m30861p0(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            C19383o.m32797g(tArr, "array");
            return C18263b.m30863q0(this, tArr);
        }
    }

    /* renamed from: a */
    void mo12a(C1699a aVar);

    /* renamed from: g */
    boolean mo18g(Object obj, Object obj2);
}
