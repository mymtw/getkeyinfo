package com.google.common.cache;

import com.google.common.cache.LocalCache;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.cache.h */
public interface C15876h<K, V> {
    long getAccessTime();

    int getHash();

    @NullableDecl
    K getKey();

    @NullableDecl
    C15876h<K, V> getNext();

    C15876h<K, V> getNextInAccessQueue();

    C15876h<K, V> getNextInWriteQueue();

    C15876h<K, V> getPreviousInAccessQueue();

    C15876h<K, V> getPreviousInWriteQueue();

    LocalCache.C15852s<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(C15876h<K, V> hVar);

    void setNextInWriteQueue(C15876h<K, V> hVar);

    void setPreviousInAccessQueue(C15876h<K, V> hVar);

    void setPreviousInWriteQueue(C15876h<K, V> hVar);

    void setValueReference(LocalCache.C15852s<K, V> sVar);

    void setWriteTime(long j);
}
