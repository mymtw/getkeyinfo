package p145io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.util.AtomicThrowable */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        return ExceptionHelper.m32482a(this, th);
    }

    public boolean isTerminated() {
        return get() == ExceptionHelper.f43031a;
    }

    public Throwable terminate() {
        return ExceptionHelper.m32483b(this);
    }
}
