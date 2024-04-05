package p239t;

import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: t.w */
public final class C7936w<K, V> extends C7933t<K, V, Map.Entry<K, V>> {

    /* renamed from: e */
    public final C7920h<K, V> f17404e;

    public C7936w(C7920h<K, V> hVar) {
        C19383o.m32797g(hVar, "parentIterator");
        this.f17404e = hVar;
    }

    public final Object next() {
        int i = this.f17403d + 2;
        this.f17403d = i;
        C7920h<K, V> hVar = this.f17404e;
        Object[] objArr = this.f17401b;
        return new C7914b(hVar, objArr[i - 2], objArr[i - 1]);
    }
}
