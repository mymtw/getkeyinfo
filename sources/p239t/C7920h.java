package p239t;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: t.h */
public final class C7920h<K, V> implements Iterator<Map.Entry<K, V>>, C19875a {

    /* renamed from: b */
    public final C7918f<K, V, Map.Entry<K, V>> f17388b;

    public C7920h(C7917e<K, V> eVar) {
        C19383o.m32797g(eVar, "builder");
        C7933t[] tVarArr = new C7933t[8];
        for (int i = 0; i < 8; i++) {
            tVarArr[i] = new C7936w(this);
        }
        this.f17388b = new C7918f<>(eVar, tVarArr);
    }

    public final boolean hasNext() {
        return this.f17388b.f17376d;
    }

    public final Object next() {
        return this.f17388b.next();
    }

    public final void remove() {
        this.f17388b.remove();
    }
}
