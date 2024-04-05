package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p755lq.C19880e;

/* renamed from: androidx.compose.runtime.snapshots.k */
public abstract class C1393k<K, V, E> implements Set<E>, C19880e {

    /* renamed from: b */
    public final C1397o<K, V> f3036b;

    public C1393k(C1397o<K, V> oVar) {
        C19383o.m32797g(oVar, "map");
        this.f3036b = oVar;
    }

    public final void clear() {
        this.f3036b.clear();
    }

    public final boolean isEmpty() {
        return this.f3036b.isEmpty();
    }

    public final int size() {
        return this.f3036b.size();
    }

    public final Object[] toArray() {
        return C18263b.m30861p0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        return C18263b.m30863q0(this, tArr);
    }
}
