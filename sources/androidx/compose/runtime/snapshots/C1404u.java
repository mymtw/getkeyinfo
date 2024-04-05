package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.snapshots.u */
public final class C1404u<K, V> extends C1403t<K, V> implements Iterator<K>, C19875a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1404u(C1397o<K, V> oVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(oVar, it);
        C19383o.m32797g(oVar, "map");
        C19383o.m32797g(it, "iterator");
    }

    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.f3055f;
        if (entry != null) {
            mo6063a();
            return entry.getKey();
        }
        throw new IllegalStateException();
    }
}
