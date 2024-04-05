package p145io.reactivex.internal.operators.parallel;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8066r;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnSubscriber */
final class ParallelRunOn$RunOnSubscriber<T> extends ParallelRunOn$BaseRunOnSubscriber<T> {
    private static final long serialVersionUID = 1075119423897941642L;
    public final C20024c<? super T> downstream;

    public ParallelRunOn$RunOnSubscriber(C20024c<? super T> cVar, int i, SpscArrayQueue<T> spscArrayQueue, C8066r.C8069c cVar2) {
        super(i, spscArrayQueue, cVar2);
        this.downstream = cVar;
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request((long) this.prefetch);
        }
    }

    public void run() {
        int i;
        Throwable th;
        int i2 = this.consumed;
        SpscArrayQueue<T> spscArrayQueue = this.queue;
        C20024c<? super T> cVar = this.downstream;
        int i3 = this.limit;
        int i4 = 1;
        while (true) {
            long j = this.requested.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (i == 0) {
                    break;
                } else if (this.cancelled) {
                    spscArrayQueue.clear();
                    return;
                } else {
                    boolean z = this.done;
                    if (!z || (th = this.error) == null) {
                        T poll = spscArrayQueue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            cVar.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (z2) {
                            break;
                        } else {
                            cVar.onNext(poll);
                            j2++;
                            i2++;
                            if (i2 == i3) {
                                this.upstream.request((long) i2);
                                i2 = 0;
                            }
                        }
                    } else {
                        spscArrayQueue.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
            if (i == 0) {
                if (this.cancelled) {
                    spscArrayQueue.clear();
                    return;
                } else if (this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        spscArrayQueue.clear();
                        cVar.onError(th2);
                        this.worker.dispose();
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                }
            }
            if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                this.requested.addAndGet(-j2);
            }
            int i5 = get();
            if (i5 == i4) {
                this.consumed = i2;
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            } else {
                i4 = i5;
            }
        }
    }
}
