package com.google.common.util.concurrent;

import android.support.p013v4.media.C0071c;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.util.concurrent.k */
public abstract class C16385k<V> implements C16388l<V> {

    /* renamed from: b */
    public static final Logger f36496b = Logger.getLogger(C16385k.class.getName());

    /* renamed from: com.google.common.util.concurrent.k$a */
    public static final class C16386a<V> extends AbstractFuture.C16351h<V> {
        public C16386a(Throwable th) {
            mo58317k(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.k$b */
    public static class C16387b<V> extends C16385k<V> {

        /* renamed from: d */
        public static final C16387b<Object> f36497d = new C16387b<>((Object) null);
        @NullableDecl

        /* renamed from: c */
        public final V f36498c;

        public C16387b(@NullableDecl V v) {
            this.f36498c = v;
        }

        public final V get() {
            return this.f36498c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return C0071c.m192d(sb, this.f36498c, "]]");
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    /* renamed from: e */
    public final void mo7981e(Runnable runnable, Executor executor) {
        if (executor != null) {
            try {
                executor.execute(runnable);
            } catch (RuntimeException e) {
                Logger logger = f36496b;
                Level level = Level.SEVERE;
                logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
            }
        } else {
            throw new NullPointerException("Executor was null.");
        }
    }

    public abstract V get() throws ExecutionException;

    public final V get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
