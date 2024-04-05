package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.snapshots.s */
public final class C1402s<K, V> extends C1403t<K, V> implements Iterator<Map.Entry<K, V>>, C19875a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1402s(C1397o<K, V> oVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(oVar, it);
        C19383o.m32797g(oVar, "map");
        C19383o.m32797g(it, "iterator");
    }

    public final Object next() {
        mo6063a();
        if (this.f3054e != null) {
            return new C1401r(this);
        }
        throw new IllegalStateException();
    }
}
