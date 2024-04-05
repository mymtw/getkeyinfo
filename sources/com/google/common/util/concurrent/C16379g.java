package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.common.util.concurrent.g */
public abstract class C16379g<V> extends C16384j<V> {

    /* renamed from: com.google.common.util.concurrent.g$a */
    public static abstract class C16380a<V> extends C16379g<V> implements AbstractFuture.C16350g<V> {
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        /* renamed from: e */
        public final void mo7981e(Runnable runnable, Executor executor) {
            super.mo7981e(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return super.get();
        }

        public final boolean isCancelled() {
            return this.f36449b instanceof AbstractFuture.C16345b;
        }

        public final boolean isDone() {
            return super.isDone();
        }

        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return super.get(j, timeUnit);
        }
    }
}
