package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.d1 */
public final class C16160d1 extends MultimapBuilder.C16054b<Object> {

    /* renamed from: a */
    public final /* synthetic */ int f36260a = 8;

    /* renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo57170a() {
        return CompactHashMap.createWithExpectedSize(this.f36260a);
    }
}
