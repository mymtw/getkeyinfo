package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrentUtils {

    public static final class ConstantFuture<T> implements Future<T> {
        private final T value;

        public ConstantFuture(T t) {
            this.value = t;
        }

        public boolean cancel(boolean z) {
            return false;
        }

        public T get() {
            return this.value;
        }

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return true;
        }

        public T get(long j, TimeUnit timeUnit) {
            return this.value;
        }
    }

    private ConcurrentUtils() {
    }

    public static Throwable checkedException(Throwable th) {
        if (th != null && !(th instanceof RuntimeException) && !(th instanceof Error)) {
            return th;
        }
        throw new IllegalArgumentException("Not a checked exception: " + th);
    }

    public static <T> Future<T> constantFuture(T t) {
        return new ConstantFuture(t);
    }

    public static <K, V> V createIfAbsent(ConcurrentMap<K, V> concurrentMap, K k, ConcurrentInitializer<V> concurrentInitializer) throws ConcurrentException {
        if (concurrentMap == null || concurrentInitializer == null) {
            return null;
        }
        V v = concurrentMap.get(k);
        return v == null ? putIfAbsent(concurrentMap, k, concurrentInitializer.get()) : v;
    }

    public static <K, V> V createIfAbsentUnchecked(ConcurrentMap<K, V> concurrentMap, K k, ConcurrentInitializer<V> concurrentInitializer) {
        try {
            return createIfAbsent(concurrentMap, k, concurrentInitializer);
        } catch (ConcurrentException e) {
            throw new ConcurrentRuntimeException(e.getCause());
        }
    }

    public static ConcurrentException extractCause(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        throwCause(executionException);
        return new ConcurrentException(executionException.getMessage(), executionException.getCause());
    }

    public static ConcurrentRuntimeException extractCauseUnchecked(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        throwCause(executionException);
        return new ConcurrentRuntimeException(executionException.getMessage(), executionException.getCause());
    }

    public static void handleCause(ExecutionException executionException) throws ConcurrentException {
        ConcurrentException extractCause = extractCause(executionException);
        if (extractCause != null) {
            throw extractCause;
        }
    }

    public static void handleCauseUnchecked(ExecutionException executionException) {
        ConcurrentRuntimeException extractCauseUnchecked = extractCauseUnchecked(executionException);
        if (extractCauseUnchecked != null) {
            throw extractCauseUnchecked;
        }
    }

    public static <T> T initialize(ConcurrentInitializer<T> concurrentInitializer) throws ConcurrentException {
        if (concurrentInitializer != null) {
            return concurrentInitializer.get();
        }
        return null;
    }

    public static <T> T initializeUnchecked(ConcurrentInitializer<T> concurrentInitializer) {
        try {
            return initialize(concurrentInitializer);
        } catch (ConcurrentException e) {
            throw new ConcurrentRuntimeException(e.getCause());
        }
    }

    public static <K, V> V putIfAbsent(ConcurrentMap<K, V> concurrentMap, K k, V v) {
        if (concurrentMap == null) {
            return null;
        }
        V putIfAbsent = concurrentMap.putIfAbsent(k, v);
        return putIfAbsent != null ? putIfAbsent : v;
    }

    private static void throwCause(ExecutionException executionException) {
        if (executionException.getCause() instanceof RuntimeException) {
            throw ((RuntimeException) executionException.getCause());
        } else if (executionException.getCause() instanceof Error) {
            throw ((Error) executionException.getCause());
        }
    }
}
