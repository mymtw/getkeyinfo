package p736cq;

import java.util.concurrent.Callable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.exceptions.OnErrorNotImplementedException;
import p145io.reactivex.exceptions.UndeliverableException;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8066r;

/* renamed from: cq.a */
public final class C18981a {

    /* renamed from: a */
    public static volatile Consumer<? super Throwable> f42308a;

    /* renamed from: a */
    public static C8066r m32122a(Callable<C8066r> callable) {
        try {
            C8066r call = callable.call();
            C12965a.m20650b(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw ExceptionHelper.m32485d(th);
        }
    }

    /* renamed from: b */
    public static void m32123b(Throwable th) {
        Consumer<? super Throwable> consumer = f42308a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: c */
    public static void m32124c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        }
    }
}
