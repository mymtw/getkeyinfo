package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.common.collect.e1 */
public final class C16165e1 extends MultimapBuilder.C16054b<Object> {

    /* renamed from: a */
    public final /* synthetic */ Comparator f36262a;

    public C16165e1(Ordering ordering) {
        this.f36262a = ordering;
    }

    /* renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo57170a() {
        return new TreeMap(this.f36262a);
    }
}
