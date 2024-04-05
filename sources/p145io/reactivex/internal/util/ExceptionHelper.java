package p145io.reactivex.internal.util;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.exceptions.CompositeException;

/* renamed from: io.reactivex.internal.util.ExceptionHelper */
public final class ExceptionHelper {

    /* renamed from: a */
    public static final Throwable f43031a = new Termination();

    /* renamed from: io.reactivex.internal.util.ExceptionHelper$Termination */
    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m32482a(AtomicReference<Throwable> atomicReference, Throwable th) {
        boolean z;
        Throwable th2;
        do {
            Throwable th3 = atomicReference.get();
            z = false;
            if (th3 != f43031a) {
                if (th3 == null) {
                    th2 = th;
                } else {
                    th2 = new CompositeException(th3, th);
                }
                while (true) {
                    if (!atomicReference.compareAndSet(th3, th2)) {
                        if (atomicReference.get() != th3) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m32483b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f43031a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: c */
    public static String m32484c(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: d */
    public static RuntimeException m32485d(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
