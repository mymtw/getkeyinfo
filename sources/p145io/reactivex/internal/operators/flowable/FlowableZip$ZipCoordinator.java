package p145io.reactivex.internal.operators.flowable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p287xp.C8339g;
import p503zp.C13973i;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator */
final class FlowableZip$ZipCoordinator<T, R> extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2434867452883857743L;
    public volatile boolean cancelled;
    public final Object[] current;
    public final boolean delayErrors;
    public final C20024c<? super R> downstream;
    public final AtomicThrowable errors;
    public final AtomicLong requested;
    public final FlowableZip$ZipSubscriber<T, R>[] subscribers;
    public final C8339g<? super Object[], ? extends R> zipper;

    public FlowableZip$ZipCoordinator(C20024c<? super R> cVar, C8339g<? super Object[], ? extends R> gVar, int i, int i2, boolean z) {
        this.downstream = cVar;
        this.zipper = gVar;
        this.delayErrors = z;
        FlowableZip$ZipSubscriber<T, R>[] flowableZip$ZipSubscriberArr = new FlowableZip$ZipSubscriber[i];
        for (int i3 = 0; i3 < i; i3++) {
            flowableZip$ZipSubscriberArr[i3] = new FlowableZip$ZipSubscriber<>(this, i2);
        }
        this.current = new Object[i];
        this.subscribers = flowableZip$ZipSubscriberArr;
        this.requested = new AtomicLong();
        this.errors = new AtomicThrowable();
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            cancelAll();
        }
    }

    public void cancelAll() {
        for (FlowableZip$ZipSubscriber<T, R> cancel : this.subscribers) {
            cancel.cancel();
        }
    }

    public void drain() {
        int i;
        if (getAndIncrement() == 0) {
            C20024c<? super R> cVar = this.downstream;
            FlowableZip$ZipSubscriber<T, R>[] flowableZip$ZipSubscriberArr = this.subscribers;
            int length = flowableZip$ZipSubscriberArr.length;
            Object[] objArr = this.current;
            int i2 = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (!this.cancelled) {
                        if (this.delayErrors || this.errors.get() == null) {
                            boolean z = false;
                            for (int i3 = 0; i3 < length; i3++) {
                                FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber = flowableZip$ZipSubscriberArr[i3];
                                if (objArr[i3] == null) {
                                    try {
                                        boolean z2 = flowableZip$ZipSubscriber.done;
                                        C13973i<T> iVar = flowableZip$ZipSubscriber.queue;
                                        T poll = iVar != null ? iVar.poll() : null;
                                        boolean z3 = poll == null;
                                        if (!z2 || !z3) {
                                            if (!z3) {
                                                objArr[i3] = poll;
                                            }
                                            z = true;
                                        } else {
                                            cancelAll();
                                            if (((Throwable) this.errors.get()) != null) {
                                                cVar.onError(this.errors.terminate());
                                                return;
                                            } else {
                                                cVar.onComplete();
                                                return;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        C19421p.m32940h0(th);
                                        this.errors.addThrowable(th);
                                        if (!this.delayErrors) {
                                            cancelAll();
                                            cVar.onError(this.errors.terminate());
                                            return;
                                        }
                                    }
                                }
                            }
                            if (z) {
                                break;
                            }
                            try {
                                Object apply = this.zipper.apply(objArr.clone());
                                C12965a.m20650b(apply, "The zipper returned a null value");
                                cVar.onNext(apply);
                                j2++;
                                Arrays.fill(objArr, (Object) null);
                            } catch (Throwable th2) {
                                C19421p.m32940h0(th2);
                                cancelAll();
                                this.errors.addThrowable(th2);
                                cVar.onError(this.errors.terminate());
                                return;
                            }
                        } else {
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (i == 0) {
                    if (!this.cancelled) {
                        if (this.delayErrors || this.errors.get() == null) {
                            for (int i4 = 0; i4 < length; i4++) {
                                FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber2 = flowableZip$ZipSubscriberArr[i4];
                                if (objArr[i4] == null) {
                                    try {
                                        boolean z4 = flowableZip$ZipSubscriber2.done;
                                        C13973i<T> iVar2 = flowableZip$ZipSubscriber2.queue;
                                        T poll2 = iVar2 != null ? iVar2.poll() : null;
                                        boolean z5 = poll2 == null;
                                        if (z4 && z5) {
                                            cancelAll();
                                            if (((Throwable) this.errors.get()) != null) {
                                                cVar.onError(this.errors.terminate());
                                                return;
                                            } else {
                                                cVar.onComplete();
                                                return;
                                            }
                                        } else if (!z5) {
                                            objArr[i4] = poll2;
                                        }
                                    } catch (Throwable th3) {
                                        C19421p.m32940h0(th3);
                                        this.errors.addThrowable(th3);
                                        if (!this.delayErrors) {
                                            cancelAll();
                                            cVar.onError(this.errors.terminate());
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != 0) {
                    for (FlowableZip$ZipSubscriber<T, R> request : flowableZip$ZipSubscriberArr) {
                        request.request(j2);
                    }
                    if (j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    public void error(FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber, Throwable th) {
        if (this.errors.addThrowable(th)) {
            flowableZip$ZipSubscriber.done = true;
            drain();
            return;
        }
        C18981a.m32123b(th);
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }

    public void subscribe(C20023b<? extends T>[] bVarArr, int i) {
        FlowableZip$ZipSubscriber<T, R>[] flowableZip$ZipSubscriberArr = this.subscribers;
        int i2 = 0;
        while (i2 < i && !this.cancelled) {
            if (this.delayErrors || this.errors.get() == null) {
                bVarArr[i2].subscribe(flowableZip$ZipSubscriberArr[i2]);
                i2++;
            } else {
                return;
            }
        }
    }
}
