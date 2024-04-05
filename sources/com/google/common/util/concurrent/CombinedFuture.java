package com.google.common.util.concurrent;

import com.google.common.base.C15803r;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class CombinedFuture<V> extends C16374c<Object, V> {

    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<C16388l<V>> {
        private final C16375d<V> callable;
        public final /* synthetic */ CombinedFuture this$0;

        public AsyncCallableInterruptibleTask(CombinedFuture combinedFuture, C16375d<V> dVar, Executor executor) {
            super(combinedFuture, executor);
            dVar.getClass();
            this.callable = dVar;
        }

        public String toPendingString() {
            return this.callable.toString();
        }

        public C16388l<V> runInterruptibly() throws Exception {
            this.thrownByExecute = false;
            C16388l<V> call = this.callable.call();
            C16375d<V> dVar = this.callable;
            if (call != null) {
                return call;
            }
            throw new NullPointerException(C15803r.m25628a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dVar));
        }

        public void setValue(C16388l<V> lVar) {
            throw null;
        }
    }

    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final Callable<V> callable;
        public final /* synthetic */ CombinedFuture this$0;

        public CallableInterruptibleTask(CombinedFuture combinedFuture, Callable<V> callable2, Executor executor) {
            super(combinedFuture, executor);
            callable2.getClass();
            this.callable = callable2;
        }

        public V runInterruptibly() throws Exception {
            this.thrownByExecute = false;
            return this.callable.call();
        }

        public void setValue(V v) {
            throw null;
        }

        public String toPendingString() {
            return this.callable.toString();
        }
    }

    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;
        public final /* synthetic */ CombinedFuture this$0;
        public boolean thrownByExecute = true;

        public CombinedFutureInterruptibleTask(CombinedFuture combinedFuture, Executor executor) {
            executor.getClass();
            this.listenerExecutor = executor;
        }

        public final void afterRanInterruptibly(T t, Throwable th) {
            if (th == null) {
                setValue(t);
            } else if (th instanceof ExecutionException) {
                th.getCause();
                throw null;
            } else if (th instanceof CancellationException) {
                throw null;
            } else {
                throw null;
            }
        }

        public final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException unused) {
                if (this.thrownByExecute) {
                    throw null;
                }
            }
        }

        public final boolean isDone() {
            throw null;
        }

        public abstract void setValue(T t);
    }
}
