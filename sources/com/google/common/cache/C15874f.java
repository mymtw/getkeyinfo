package com.google.common.cache;

import com.google.common.base.C15784e;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.common.cache.f */
public interface C15874f<K, V> extends C15871c<K, V>, C15784e<K, V> {
    @Deprecated
    V apply(K k);

    V get(K k) throws ExecutionException;

    ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    V getUnchecked(K k);

    void refresh(K k);
}
