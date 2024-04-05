package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p755lq.C19878d;

/* renamed from: kotlin.collections.e */
public abstract class C19312e<K, V> extends AbstractMap<K, V> implements C19878d {
    /* renamed from: a */
    public abstract Set mo20411a();

    /* renamed from: b */
    public abstract /* bridge */ Set<Object> mo20412b();

    /* renamed from: c */
    public abstract /* bridge */ int mo20413c();

    /* renamed from: d */
    public /* bridge */ Collection<Object> mo20416d() {
        return super.values();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo20411a();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo20412b();
    }

    public final /* bridge */ int size() {
        return mo20413c();
    }

    public final /* bridge */ Collection<V> values() {
        return mo20416d();
    }
}
