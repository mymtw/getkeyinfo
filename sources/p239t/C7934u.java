package p239t;

import java.util.Map;

/* renamed from: t.u */
public final class C7934u<K, V> extends C7933t<K, V, Map.Entry<? extends K, ? extends V>> {
    public final Object next() {
        int i = this.f17403d + 2;
        this.f17403d = i;
        Object[] objArr = this.f17401b;
        return new C7913a(objArr[i - 2], objArr[i - 1]);
    }
}
