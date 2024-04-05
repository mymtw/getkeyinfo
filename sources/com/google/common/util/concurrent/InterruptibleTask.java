package com.google.common.util.concurrent;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b */
    public static final C16364a f36483b = new C16364a();

    /* renamed from: c */
    public static final C16364a f36484c = new C16364a();

    /* renamed from: d */
    public static final C16364a f36485d = new C16364a();

    /* renamed from: com.google.common.util.concurrent.InterruptibleTask$a */
    public static final class C16364a implements Runnable {
        public final void run() {
        }
    }

    static {
        Class<LockSupport> cls = LockSupport.class;
    }

    public abstract void afterRanInterruptibly(@NullableDecl T t, @NullableDecl Throwable th);

    public final void interruptTask() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f36484c)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (((Runnable) getAndSet(f36483b)) == f36485d) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    public abstract boolean isDone();

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !isDone();
            if (z) {
                try {
                    obj = runInterruptibly();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f36483b)) {
                        Runnable runnable = (Runnable) get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            C16364a aVar = f36484c;
                            if (runnable != aVar && runnable != f36485d) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                C16364a aVar2 = f36485d;
                                if (runnable == aVar2 || compareAndSet(aVar, aVar2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        afterRanInterruptibly((Object) null, th);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f36483b)) {
                Runnable runnable2 = (Runnable) get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    C16364a aVar3 = f36484c;
                    if (runnable2 != aVar3 && runnable2 != f36485d) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        C16364a aVar4 = f36485d;
                        if (runnable2 == aVar4 || compareAndSet(aVar3, aVar4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable2 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                afterRanInterruptibly(obj, (Throwable) null);
            }
        }
    }

    public abstract T runInterruptibly() throws Exception;

    public abstract String toPendingString();

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f36483b) {
            str = "running=[DONE]";
        } else if (runnable == f36484c) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            StringBuilder h = C0072d.m201h("running=[RUNNING ON ");
            h.append(((Thread) runnable).getName());
            h.append("]");
            str = h.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder k = C0073e.m211k(str, ", ");
        k.append(toPendingString());
        return k.toString();
    }
}
