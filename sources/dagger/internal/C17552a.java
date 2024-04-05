package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p740eq.C19011a;

/* renamed from: dagger.internal.a */
public abstract class C17552a<K, V, V2> implements C17555d<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, C19011a<V>> f38385a;

    public C17552a(LinkedHashMap linkedHashMap) {
        this.f38385a = Collections.unmodifiableMap(linkedHashMap);
    }
}
