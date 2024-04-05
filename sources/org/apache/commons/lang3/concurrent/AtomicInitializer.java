package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

public abstract class AtomicInitializer<T> implements ConcurrentInitializer<T> {
    private final AtomicReference<T> reference = new AtomicReference<>();

    public T get() throws ConcurrentException {
        boolean z;
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        T initialize = initialize();
        AtomicReference<T> atomicReference = this.reference;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, initialize)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return !z ? this.reference.get() : initialize;
    }

    public abstract T initialize() throws ConcurrentException;
}
