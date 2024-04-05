package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.snapshots.t */
public abstract class C1403t<K, V> {

    /* renamed from: b */
    public final C1397o<K, V> f3051b;

    /* renamed from: c */
    public final Iterator<Map.Entry<K, V>> f3052c;

    /* renamed from: d */
    public int f3053d;

    /* renamed from: e */
    public Map.Entry<? extends K, ? extends V> f3054e;

    /* renamed from: f */
    public Map.Entry<? extends K, ? extends V> f3055f;

    public C1403t(C1397o<K, V> oVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        C19383o.m32797g(oVar, "map");
        C19383o.m32797g(it, "iterator");
        this.f3051b = oVar;
        this.f3052c = it;
        this.f3053d = oVar.mo6035a().f3043d;
        mo6063a();
    }

    /* renamed from: a */
    public final void mo6063a() {
        this.f3054e = this.f3055f;
        this.f3055f = this.f3052c.hasNext() ? this.f3052c.next() : null;
    }

    public final boolean hasNext() {
        return this.f3055f != null;
    }

    public final void remove() {
        if (this.f3051b.mo6035a().f3043d == this.f3053d) {
            Map.Entry<? extends K, ? extends V> entry = this.f3054e;
            if (entry != null) {
                this.f3051b.remove(entry.getKey());
                this.f3054e = null;
                C19394m mVar = C19394m.f43287a;
                this.f3053d = this.f3051b.mo6035a().f3043d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
