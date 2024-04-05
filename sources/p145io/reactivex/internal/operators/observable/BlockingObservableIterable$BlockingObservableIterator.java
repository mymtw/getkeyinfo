package p145io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.ExceptionHelper;

/* renamed from: io.reactivex.internal.operators.observable.BlockingObservableIterable$BlockingObservableIterator */
final class BlockingObservableIterable$BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {
    private static final long serialVersionUID = 6695226475494099826L;
    public final Condition condition;
    public volatile boolean done;
    public volatile Throwable error;
    public final Lock lock;
    public final C19213a<T> queue;

    public BlockingObservableIterable$BlockingObservableIterator(int i) {
        this.queue = new C19213a<>(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    public void dispose() {
        DisposableHelper.dispose(this);
        signalConsumer();
    }

    public boolean hasNext() {
        while (!isDisposed()) {
            boolean z = this.done;
            boolean isEmpty = this.queue.isEmpty();
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    throw ExceptionHelper.m32485d(th);
                } else if (isEmpty) {
                    return false;
                }
            }
            if (!isEmpty) {
                return true;
            }
            this.lock.lock();
            while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                try {
                    this.condition.await();
                } catch (InterruptedException e) {
                    DisposableHelper.dispose(this);
                    signalConsumer();
                    throw ExceptionHelper.m32485d(e);
                } catch (Throwable th2) {
                    this.lock.unlock();
                    throw th2;
                }
            }
            this.lock.unlock();
        }
        Throwable th3 = this.error;
        if (th3 == null) {
            return false;
        }
        throw ExceptionHelper.m32485d(th3);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public T next() {
        if (hasNext()) {
            return this.queue.poll();
        }
        throw new NoSuchElementException();
    }

    public void onComplete() {
        this.done = true;
        signalConsumer();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        signalConsumer();
    }

    public void onNext(T t) {
        this.queue.offer(t);
        signalConsumer();
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    public void signalConsumer() {
        this.lock.lock();
        try {
            this.condition.signalAll();
        } finally {
            this.lock.unlock();
        }
    }
}
