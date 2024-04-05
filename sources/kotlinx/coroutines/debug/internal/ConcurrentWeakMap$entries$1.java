package kotlinx.coroutines.debug.internal;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import p753kq.C19861p;

public final class ConcurrentWeakMap$entries$1 extends Lambda implements C19861p<K, V, Map.Entry<K, V>> {
    public static final ConcurrentWeakMap$entries$1 INSTANCE = new ConcurrentWeakMap$entries$1();

    public ConcurrentWeakMap$entries$1() {
        super(2);
    }

    public final Map.Entry<K, V> invoke(K k, V v) {
        return new ConcurrentWeakMap.C19530b(k, v);
    }
}
