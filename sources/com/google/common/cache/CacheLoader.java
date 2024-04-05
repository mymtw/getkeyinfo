package com.google.common.cache;

import com.google.common.base.C15784e;
import com.google.common.base.C15804s;
import com.google.common.util.concurrent.C16385k;
import com.google.common.util.concurrent.C16388l;
import com.google.common.util.concurrent.C16389m;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public abstract class CacheLoader<K, V> {

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C15784e<K, V> computingFunction;

        public FunctionToCacheLoader(C15784e<K, V> eVar) {
            eVar.getClass();
            this.computingFunction = eVar;
        }

        public V load(K k) {
            C15784e<K, V> eVar = this.computingFunction;
            k.getClass();
            return eVar.apply(k);
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C15804s<V> computingSupplier;

        public SupplierToCacheLoader(C15804s<V> sVar) {
            sVar.getClass();
            this.computingSupplier = sVar;
        }

        public V load(Object obj) {
            obj.getClass();
            return this.computingSupplier.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    /* renamed from: com.google.common.cache.CacheLoader$a */
    public static class C15810a extends CacheLoader<K, V> {

        /* renamed from: b */
        public final /* synthetic */ CacheLoader f35611b;

        /* renamed from: c */
        public final /* synthetic */ Executor f35612c;

        /* renamed from: com.google.common.cache.CacheLoader$a$a */
        public class C15811a implements Callable<V> {

            /* renamed from: b */
            public final /* synthetic */ Object f35613b;

            /* renamed from: c */
            public final /* synthetic */ Object f35614c;

            public C15811a(Object obj, Object obj2) {
                this.f35613b = obj;
                this.f35614c = obj2;
            }

            public final V call() throws Exception {
                return C15810a.this.f35611b.reload(this.f35613b, this.f35614c).get();
            }
        }

        public C15810a(CacheLoader cacheLoader, Executor executor) {
            this.f35611b = cacheLoader;
            this.f35612c = executor;
        }

        public final V load(K k) throws Exception {
            return this.f35611b.load(k);
        }

        public final Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
            return this.f35611b.loadAll(iterable);
        }

        public final C16388l<V> reload(K k, V v) throws Exception {
            C16389m mVar = new C16389m(new C15811a(k, v));
            this.f35612c.execute(mVar);
            return mVar;
        }
    }

    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        cacheLoader.getClass();
        executor.getClass();
        return new C15810a(cacheLoader, executor);
    }

    public static <K, V> CacheLoader<K, V> from(C15784e<K, V> eVar) {
        return new FunctionToCacheLoader(eVar);
    }

    public abstract V load(K k) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    public C16388l<V> reload(K k, V v) throws Exception {
        k.getClass();
        v.getClass();
        Object load = load(k);
        return load == null ? C16385k.C16387b.f36497d : new C16385k.C16387b(load);
    }

    public static <V> CacheLoader<Object, V> from(C15804s<V> sVar) {
        return new SupplierToCacheLoader(sVar);
    }
}
