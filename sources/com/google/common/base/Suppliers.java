package com.google.common.base;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.google.common.base.C15792k;
import com.google.common.cache.CacheBuilder;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Suppliers {

    public static class ExpiringMemoizingSupplier<T> implements C15804s<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final C15804s<T> delegate;
        public final long durationNanos;
        public volatile transient long expirationNanos;
        @NullableDecl
        public volatile transient T value;

        public ExpiringMemoizingSupplier(C15804s<T> sVar, long j, TimeUnit timeUnit) {
            sVar.getClass();
            this.delegate = sVar;
            this.durationNanos = timeUnit.toNanos(j);
            C15794l.m25615i(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        }

        public T get() {
            long j = this.expirationNanos;
            C15792k.C15793a aVar = C15792k.f35574a;
            long nanoTime = System.nanoTime();
            if (j == 0 || nanoTime - j >= 0) {
                synchronized (this) {
                    if (j == this.expirationNanos) {
                        T t = this.delegate.get();
                        this.value = t;
                        long j2 = nanoTime + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.expirationNanos = j2;
                        return t;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Suppliers.memoizeWithExpiration(");
            h.append(this.delegate);
            h.append(", ");
            return C0087d.m236f(h, this.durationNanos, ", NANOS)");
        }
    }

    public static class MemoizingSupplier<T> implements C15804s<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final C15804s<T> delegate;
        public volatile transient boolean initialized;
        @NullableDecl
        public transient T value;

        public MemoizingSupplier(C15804s<T> sVar) {
            sVar.getClass();
            this.delegate = sVar;
        }

        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        return t;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            return C0071c.m192d(C0072d.m201h("Suppliers.memoize("), this.initialized ? C0071c.m192d(C0072d.m201h("<supplier that returned "), this.value, ">") : this.delegate, ")");
        }
    }

    public static class SupplierComposition<F, T> implements C15804s<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final C15784e<? super F, T> function;
        public final C15804s<F> supplier;

        public SupplierComposition(C15784e<? super F, T> eVar, C15804s<F> sVar) {
            eVar.getClass();
            this.function = eVar;
            sVar.getClass();
            this.supplier = sVar;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            SupplierComposition supplierComposition = (SupplierComposition) obj;
            return this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier);
        }

        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.function, this.supplier});
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Suppliers.compose(");
            h.append(this.function);
            h.append(", ");
            h.append(this.supplier);
            h.append(")");
            return h.toString();
        }
    }

    public enum SupplierFunctionImpl implements C15784e {
        INSTANCE;

        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        public Object apply(C15804s<Object> sVar) {
            return sVar.get();
        }
    }

    public static class SupplierOfInstance<T> implements C15804s<T>, Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final T instance;

        public SupplierOfInstance(@NullableDecl T t) {
            this.instance = t;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return C15791j.m25606a(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.instance});
        }

        public String toString() {
            return C0071c.m192d(C0072d.m201h("Suppliers.ofInstance("), this.instance, ")");
        }
    }

    public static class ThreadSafeSupplier<T> implements C15804s<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final C15804s<T> delegate;

        public ThreadSafeSupplier(C15804s<T> sVar) {
            sVar.getClass();
            this.delegate = sVar;
        }

        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Suppliers.synchronizedSupplier(");
            h.append(this.delegate);
            h.append(")");
            return h.toString();
        }
    }

    /* renamed from: a */
    public static C15804s m25591a(@NullableDecl CacheBuilder.C15808a aVar) {
        return new SupplierOfInstance(aVar);
    }
}
