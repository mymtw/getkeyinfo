package com.google.common.util.concurrent;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.util.concurrent.f */
public final class C16377f {

    /* renamed from: c */
    public static final Logger f36489c = Logger.getLogger(C16377f.class.getName());
    @NullableDecl
    @GuardedBy("this")

    /* renamed from: a */
    public C16378a f36490a;
    @GuardedBy("this")

    /* renamed from: b */
    public boolean f36491b;

    /* renamed from: com.google.common.util.concurrent.f$a */
    public static final class C16378a {

        /* renamed from: a */
        public final Runnable f36492a;

        /* renamed from: b */
        public final Executor f36493b;
        @NullableDecl

        /* renamed from: c */
        public C16378a f36494c;

        public C16378a(Runnable runnable, Executor executor, C16378a aVar) {
            this.f36492a = runnable;
            this.f36493b = executor;
            this.f36494c = aVar;
        }
    }

    /* renamed from: a */
    public static void m26505a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f36489c;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }
}
