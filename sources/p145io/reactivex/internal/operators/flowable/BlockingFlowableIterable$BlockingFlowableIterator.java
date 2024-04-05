package p145io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8056i;

/* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableIterable$BlockingFlowableIterator */
final class BlockingFlowableIterable$BlockingFlowableIterator<T> extends AtomicReference<Subscription> implements C8056i<T>, Iterator<T>, Runnable, Disposable {
    private static final long serialVersionUID = 6695226475494099826L;
    public final long batchSize;
    public final Condition condition;
    public volatile boolean done;
    public volatile Throwable error;
    public final long limit;
    public final Lock lock;
    public long produced;
    public final SpscArrayQueue<T> queue;

    public BlockingFlowableIterable$BlockingFlowableIterator(int i) {
        this.queue = new SpscArrayQueue<>(i);
        this.batchSize = (long) i;
        this.limit = (long) (i - (i >> 2));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    public void dispose() {
        SubscriptionHelper.cancel(this);
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
                    run();
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
        return get() == SubscriptionHelper.CANCELLED;
    }

    public T next() {
        if (hasNext()) {
            T poll = this.queue.poll();
            long j = this.produced + 1;
            if (j == this.limit) {
                this.produced = 0;
                ((Subscription) get()).request(j);
            } else {
                this.produced = j;
            }
            return poll;
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
        if (!this.queue.offer(t)) {
            SubscriptionHelper.cancel(this);
            onError(new MissingBackpressureException("Queue full?!"));
            return;
        }
        signalConsumer();
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, this.batchSize);
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    public void run() {
        SubscriptionHelper.cancel(this);
        signalConsumer();
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
