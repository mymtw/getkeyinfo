package com.google.common.util.concurrent;

import com.google.common.base.C15803r;
import com.google.common.util.concurrent.C16379g;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public final class TrustedListenableFutureTask<V> extends C16379g.C16380a<V> implements RunnableFuture<V> {

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<C16388l<V>> {
        private final C16375d<V> callable;
        public final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleAsyncTask(TrustedListenableFutureTask trustedListenableFutureTask, C16375d<V> dVar) {
            dVar.getClass();
            this.callable = dVar;
        }

        public final boolean isDone() {
            throw null;
        }

        public String toPendingString() {
            return this.callable.toString();
        }

        public void afterRanInterruptibly(C16388l<V> lVar, Throwable th) {
            th.getClass();
            throw null;
        }

        public C16388l<V> runInterruptibly() throws Exception {
            C16388l<V> call = this.callable.call();
            C16375d<V> dVar = this.callable;
            if (call != null) {
                return call;
            }
            throw new NullPointerException(C15803r.m25628a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dVar));
        }
    }

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;
        public final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleTask(TrustedListenableFutureTask trustedListenableFutureTask, Callable<V> callable2) {
            callable2.getClass();
            this.callable = callable2;
        }

        public void afterRanInterruptibly(V v, Throwable th) {
            th.getClass();
            throw null;
        }

        public final boolean isDone() {
            throw null;
        }

        public V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        public String toPendingString() {
            return this.callable.toString();
        }
    }
}
