package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ConcurrentWeakMap$keys$1 extends Lambda implements C19861p<K, V, K> {
    public static final ConcurrentWeakMap$keys$1 INSTANCE = new ConcurrentWeakMap$keys$1();

    public ConcurrentWeakMap$keys$1() {
        super(2);
    }

    public final K invoke(K k, V v) {
        return k;
    }
}
