package com.google.common.cache;

import com.google.common.collect.C16153c0;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.cache.e */
public abstract class C15873e<K, V> extends C16153c0 implements C15871c<K, V> {
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    public void cleanUp() {
        delegate().cleanUp();
    }

    public abstract C15871c<K, V> delegate();

    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        return delegate().get(k, callable);
    }

    public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
        return delegate().getAllPresent(iterable);
    }

    @NullableDecl
    public V getIfPresent(Object obj) {
        return delegate().getIfPresent(obj);
    }

    public void invalidate(Object obj) {
        delegate().invalidate(obj);
    }

    public void invalidateAll(Iterable<?> iterable) {
        delegate().invalidateAll(iterable);
    }

    public void put(K k, V v) {
        delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public long size() {
        return delegate().size();
    }

    public C15872d stats() {
        return delegate().stats();
    }

    public void invalidateAll() {
        delegate().invalidateAll();
    }
}
