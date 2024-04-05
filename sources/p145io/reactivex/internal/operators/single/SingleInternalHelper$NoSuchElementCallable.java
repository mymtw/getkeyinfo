package p145io.reactivex.internal.operators.single;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.single.SingleInternalHelper$NoSuchElementCallable */
enum SingleInternalHelper$NoSuchElementCallable implements Callable<NoSuchElementException> {
    INSTANCE;

    public NoSuchElementException call() throws Exception {
        return new NoSuchElementException();
    }
}
