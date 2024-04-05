package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8058k;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeMergeArray$MergeMaybeObserver */
final class MaybeMergeArray$MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements C8058k<T> {
    private static final long serialVersionUID = -660395290758764731L;
    public volatile boolean cancelled;
    public long consumed;
    public final C20024c<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public boolean outputFused;
    public final C19136d<Object> queue;
    public final AtomicLong requested = new AtomicLong();
    public final C7091a set = new C7091a();
    public final int sourceCount;

    public MaybeMergeArray$MergeMaybeObserver(C20024c<? super T> cVar, int i, C19136d<Object> dVar) {
        this.downstream = cVar;
        this.sourceCount = i;
        this.queue = dVar;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.set.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public void clear() {
        this.queue.clear();
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }
    }

    public void drainFused() {
        C20024c<? super T> cVar = this.downstream;
        C19136d<Object> dVar = this.queue;
        int i = 1;
        while (!this.cancelled) {
            Throwable th = (Throwable) this.error.get();
            if (th != null) {
                dVar.clear();
                cVar.onError(th);
                return;
            }
            boolean z = dVar.producerIndex() == this.sourceCount;
            if (!dVar.isEmpty()) {
                cVar.onNext(null);
            }
            if (z) {
                cVar.onComplete();
                return;
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        dVar.clear();
    }

    public void drainNormal() {
        int i;
        C20024c<? super T> cVar = this.downstream;
        C19136d<Object> dVar = this.queue;
        long j = this.consumed;
        int i2 = 1;
        do {
            long j2 = this.requested.get();
            while (true) {
                i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i == 0) {
                    break;
                } else if (this.cancelled) {
                    dVar.clear();
                    return;
                } else if (((Throwable) this.error.get()) != null) {
                    dVar.clear();
                    cVar.onError(this.error.terminate());
                    return;
                } else if (dVar.consumerIndex() == this.sourceCount) {
                    cVar.onComplete();
                    return;
                } else {
                    Object poll = dVar.poll();
                    if (poll == null) {
                        break;
                    } else if (poll != NotificationLite.COMPLETE) {
                        cVar.onNext(poll);
                        j++;
                    }
                }
            }
            if (i == 0) {
                if (((Throwable) this.error.get()) != null) {
                    dVar.clear();
                    cVar.onError(this.error.terminate());
                    return;
                }
                while (dVar.peek() == NotificationLite.COMPLETE) {
                    dVar.drop();
                }
                if (dVar.consumerIndex() == this.sourceCount) {
                    cVar.onComplete();
                    return;
                }
            }
            this.consumed = j;
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public void onComplete() {
        this.queue.offer(NotificationLite.COMPLETE);
        drain();
    }

    public void onError(Throwable th) {
        if (this.error.addThrowable(th)) {
            this.set.dispose();
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void onSubscribe(Disposable disposable) {
        this.set.mo19403b(disposable);
    }

    public void onSuccess(T t) {
        this.queue.offer(t);
        drain();
    }

    public T poll() throws Exception {
        T poll;
        do {
            poll = this.queue.poll();
        } while (poll == NotificationLite.COMPLETE);
        return poll;
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }

    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
